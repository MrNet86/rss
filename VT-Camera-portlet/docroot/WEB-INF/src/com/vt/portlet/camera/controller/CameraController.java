package com.vt.portlet.camera.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.vt.portlet.camera.model.CustomerService;
import com.vt.portlet.camera.model.impl.CustomerServiceImpl;
import com.vt.portlet.camera.service.CustomerLocalServiceUtil;
import com.vt.portlet.camera.service.CustomerServiceLocalServiceUtil;

@Controller
@RequestMapping("VIEW")
public class CameraController {

	@RenderMapping
	public String renderHomePage() {
		System.out.println("renderHomePage come on baby");
		return "view";
	}

	
	@ResourceMapping("getSelectedCustomer")
	public void getSelectedCustomer(ResourceRequest resourceRequest,
			ResourceResponse response) throws IOException, PortalException,
			SystemException {
		System.out.println("getSelectedCustomer ");
		
		Long customerId = ParamUtil.getLong(resourceRequest,"customerId", 0L);
		
		System.out.println("customerId :"+customerId);
		
		List<CustomerService> lstService = CustomerServiceLocalServiceUtil.findBycustomerId(customerId);
		for (CustomerService customerService : lstService) {
			System.out.println("customerService :"+customerService.getDeployName());
		}
		
		CustomerService obj = null;
		if(!lstService.isEmpty()) {
			obj = lstService.get(0);
		}
		
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();
		
		if(obj != null) {
			jsonObj.put("deployName", obj.getDeployName());
			jsonObj.put("address",obj.getAddress());			
		}
		
		PrintWriter writer = response.getWriter();
		writer.println(jsonObj);
	}
	
	@ResourceMapping("getCustomerTypeByGroup")
	public void getCustomerTypeByGroup(ResourceRequest resourceRequest,
			ResourceResponse response) throws IOException, PortalException,
			SystemException {
		System.out.println("getCustomerTypeByGroup ");
		
		Long customerGroup = ParamUtil.getLong(resourceRequest,"customerGroup", 0L);
		
		System.out.println("customerGroup :"+customerGroup);
		
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();
		
		if(customerGroup == 1) {
			jsonObj.put("typeTitle", "VIE - Doanh nghiep trong nuoc");
			jsonObj.put("titleId", 1);
		}
		else if (customerGroup == 2) {
			jsonObj.put("typeTitle", "Doanh nghiep nuoc ngoai 2");
			jsonObj.put("titleId", 4);
		}
		else {
			jsonObj.put("typeTitle", "Exception");
			jsonObj.put("titleId", 3);
		}
		
		PrintWriter writer = response.getWriter();
		writer.println(jsonObj);
	}
	
}

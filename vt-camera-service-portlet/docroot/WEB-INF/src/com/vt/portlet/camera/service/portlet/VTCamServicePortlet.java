package com.vt.portlet.camera.service.portlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletConfig;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vt.camera.model.CustomerService;
import com.vt.camera.service.CustomerServiceLocalServiceUtil;

/**
 * Portlet implementation class VTCamServicePortlet
 */
public class VTCamServicePortlet extends MVCPortlet {


//	@Override
//	public void serveResource(ResourceRequest resourceRequest,
//			ResourceResponse resourceResponse) throws IOException {
//		System.out.println("getSelectedCustomer ");
//
//		Long customerId = ParamUtil.getLong(resourceRequest,"customerId", 0L);
//
//		System.out.println("customerId :"+customerId);
//
//		List<CustomerService> lstService = new ArrayList<CustomerService>();
//		try {
//			lstService = CustomerServiceLocalServiceUtil.findBycustomerId(customerId);
//		} catch (SystemException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		for (CustomerService customerService : lstService) {
//			System.out.println("customerService :"+customerService.getDeployName());
//		}
//
//		CustomerService obj = null;
//		if(!lstService.isEmpty()) {
//			obj = lstService.get(0);
//		}
//
//		JSONObject jsonCar = JSONFactoryUtil.createJSONObject();
//
//		if(obj != null) {
//			jsonCar.put("deployName", obj.getDeployName());
//			jsonCar.put("address",obj.getAddress());
//		}
//
//		PrintWriter writer = resourceResponse.getWriter();
//		writer.println(jsonCar);
//	}

}

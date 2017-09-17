package com.vt.portlet.camera.customer.portlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vt.camera.model.CustomerService;
import com.vt.camera.service.CustomerServiceLocalServiceUtil;

/**
 * Portlet implementation class VTCameraCustomerPortlet
 */
public class VTCameraCustomerPortlet extends MVCPortlet {

	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException {
		System.out.println("getSelectedCustomer ");

		if("getSelectedCustomer".equals(resourceRequest.getResourceID())) {
			Long customerId = ParamUtil.getLong(resourceRequest,"customerId", 0L);

			System.out.println("customerId :"+customerId);

			List<CustomerService> lstService = new ArrayList<CustomerService>();
			try {
				lstService = CustomerServiceLocalServiceUtil.findBycustomerId(customerId);
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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

			PrintWriter writer = resourceResponse.getWriter();
			writer.println(jsonObj);
		}

		else if("getCustomerTypeByGroup".equals(resourceRequest.getResourceID())) {
			System.out.println("getCustomerTypeByGroup ");

			Long customerGroup = ParamUtil.getLong(resourceRequest,"customerGroup", 0L);

			System.out.println("customerGroup :"+customerGroup);

			JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

			JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

			if(customerGroup == 1) {
				jsonObj.put("typeTitle", "VIE - Doanh nghiep trong nuoc 1");
				jsonObj.put("titleId", 1);
				jsonArray.put(jsonObj);

				jsonObj = JSONFactoryUtil.createJSONObject();
				jsonObj.put("typeTitle", "VIE - Doanh nghiep trong nuoc 2");
				jsonObj.put("titleId", 2);
				jsonArray.put(jsonObj);
			}
			else if (customerGroup == 2) {
				jsonObj.put("typeTitle", "Doanh nghiep nuoc ngoai 1");
				jsonObj.put("titleId", 3);
				jsonArray.put(jsonObj);

				jsonObj = JSONFactoryUtil.createJSONObject();
				jsonObj.put("typeTitle", "Doanh nghiep nuoc ngoai 2");
				jsonObj.put("titleId", 4);
				jsonArray.put(jsonObj);
			}
			else {
				jsonObj.put("typeTitle", "Exception");
				jsonObj.put("titleId", 3);
			}
			System.out.println("jsonArray :"+jsonArray.length());
			jsonObj = JSONFactoryUtil.createJSONObject();
			jsonObj.put("data", jsonArray);

			PrintWriter writer = resourceResponse.getWriter();
			writer.println(jsonObj);
		}

	}

}

package com.vt.portlet.camera.action.portlet;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.apache.log4j.helpers.DateTimeDateFormat;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vt.camera.model.Customer;
import com.vt.camera.model.CustomerService;
import com.vt.camera.model.impl.CustomerImpl;
import com.vt.camera.model.impl.CustomerServiceImpl;
import com.vt.camera.service.CustomerLocalServiceUtil;
import com.vt.camera.service.CustomerServiceLocalServiceUtil;
import com.vt.camera.utils.VtConstants;

/**
 * Portlet implementation class VtCameraActionPortlet
 */
public class VtCameraActionPortlet extends MVCPortlet {
	public void update (ActionRequest actionRequest,
			ActionResponse actionResponse) throws JSONException, SystemException, IOException {

		System.out.println("submitForm ...");

		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);

		// get inptFileName
		String inptFileNamesArr = ParamUtil.getString(uploadPortletRequest, "inputFileNamesArr");

		if(Validator.isNotNull(inptFileNamesArr)) {
			String [] inptFileNames = StringUtil.split(inptFileNamesArr, ",");

			for(String inptFileName : inptFileNames) {
				InputStream inputStream = uploadPortletRequest.getFileAsStream(inptFileName);

				// if file notnull
				if(Validator.isNotNull(inputStream)) {
					System.out.println("inptFileName ---  " + inptFileName);
					System.out.println("FILE UPLOAD NAME === : " + uploadPortletRequest.getFileName(inptFileName));
				}
			}
		}


		// get data Except file
		String callBackDataArr  = ParamUtil.getString(uploadPortletRequest, "callBackDataInputExceptFile");

		System.out.println("callBackDataArr " + callBackDataArr.toString());

		if(Validator.isNotNull(callBackDataArr)) {
			JSONArray callBackDataJSONArr = JSONFactoryUtil.createJSONArray(callBackDataArr);

			Customer customer = new CustomerImpl();
			for(int i = 0; i < callBackDataJSONArr.length(); i++) {
				JSONObject dataMiniService = callBackDataJSONArr.getJSONObject(i);
				String namespace = dataMiniService.getString("namespace");
				System.out.println("dataMiniService namespace :=  " + dataMiniService.getString("namespace"));
				if(VtConstants.PORTLET_NAMESPACE_CUSTOMER.equals(namespace)) {
					customer = updateCustomerData(dataMiniService);
				} else if(VtConstants.PORTLET_NAMESPACE_SERVICE.equals(namespace)) {
					updateServiceDate(dataMiniService, customer);
				}
			}

		}

	}

	private void updateServiceDate(JSONObject dataMiniService, Customer customer) throws SystemException {
		// TODO Auto-generated method stub
		// Service
		if(Validator.isNotNull(dataMiniService)) {

			String service_namespace = dataMiniService.getString("namespace");
			JSONObject jsonService = dataMiniService.getJSONObject("formData");

			String deployName = jsonService.getString(service_namespace+"deployName");
			String appointDate = jsonService.getString(service_namespace+"appointDate");
			Long serviceType = jsonService.getLong(service_namespace+"serviceType");
			String address = jsonService.getString(service_namespace+"address");
			String line = jsonService.getString(service_namespace+"line");
			String packageType = jsonService.getString(service_namespace+"packageType");
			String isdnNo = jsonService.getString(service_namespace+"isdnNo");
			Long accountType = jsonService.getLong(service_namespace+"accountType");
			System.out.println("service deployName :"+deployName);

			CustomerService customerService = new CustomerServiceImpl();
			customerService.setDeployName(deployName);
			customerService.setServiceType(Long.valueOf(serviceType));
			customerService.setAddress(address);
			customerService.setPackageType(packageType);
			customerService.setIsdnNo(isdnNo);
			customerService.setAccountType(accountType);

			customerService.setCustomerId(customer.getCustomerId());

			CustomerServiceLocalServiceUtil.addCustomerService(customerService);
		}
	}

	private Customer updateCustomerData(JSONObject dataMiniService) throws JSONException, SystemException {
		// TODO Auto-generated method stub
		Customer customer = new CustomerImpl();

		// Customer
		if(Validator.isNotNull(dataMiniService)) {

			String customer_namespace = dataMiniService.getString("namespace");
			JSONObject jsonCustomer = dataMiniService.getJSONObject("formData");

			SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

			if(Validator.isNotNull(jsonCustomer) && Validator.isNotNull(customer_namespace)) {
				Long customerGroup = jsonCustomer.getLong(customer_namespace+"customerGroup");
				Long customerType = jsonCustomer.getLong(customer_namespace+"customerType");
				String identifyNo = jsonCustomer.getString(customer_namespace+"identifyNo");
				String issuePlace = jsonCustomer.getString(customer_namespace+"issuePlace");
				String issueDate = jsonCustomer.getString(customer_namespace+"issueDate");
				String fullName = jsonCustomer.getString(customer_namespace+"fullName");
				String birthday = jsonCustomer.getString(customer_namespace+"birthday");
				Long sex = jsonCustomer.getLong(customer_namespace+"sex");
//				Long nationalId = jsonCustomer.getLong(customer_namespace+"nationalId");
				String address = jsonCustomer.getString(customer_namespace+"address");
				String description = jsonCustomer.getString(customer_namespace+"description");

				System.out.println("customer cmt :"+identifyNo +" || issueDate :"+issueDate
						+" || customerGroup :"+customerGroup +" customerType :"+customerType
						+" || birthday :"+birthday +" || sex :"+sex);

				customer.setCustomerGroup(customerGroup);
				customer.setCustomerType(customerType);
				customer.setIdentifyNo(identifyNo);
				customer.setIssuePlace(issuePlace);
				customer.setFullName(fullName);
				customer.setSex(sex);
				customer.setAddress(address);
				customer.setDescription(description);

				CustomerLocalServiceUtil.addCustomer(customer);
			}
		}

		return customer;
	}

}

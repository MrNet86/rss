package com.viettel.ims.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liferay.portal.kernel.exception.SystemException;
import com.viettel.admin.core.service.CatEmployeeLocalServiceUtil;
import com.viettel.ims.common.ActionConstants;

@Controller
@RequestMapping(value="VIEW")
public class ContractController {

	@RequestMapping(params="action="+ActionConstants.VIEW_CONTRACT)
	public String viewContract (RenderRequest request, RenderResponse response) {
		System.out.println("ContractController viewContract");
		int count = 0;
		try {
			count = CatEmployeeLocalServiceUtil.getCatEmployeesCount();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("count CatEmployee :"+count);

		response.setProperty("action", ActionConstants.VIEW_CONTRACT);
		return "viewHome";
	}
}

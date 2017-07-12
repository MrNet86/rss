package com.viettel.ims.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liferay.portal.kernel.exception.SystemException;
import com.viettel.ims.common.ActionConstants;
import com.viettel.ims.core.service.VInvestPolicyLocalServiceUtil;

@Controller
@RequestMapping(value="VIEW")
public class ImsController {

	@RequestMapping
    public String viewHome (RenderRequest request, RenderResponse response) {
		System.out.println("ImsController viewHome");

		try {
			int count = VInvestPolicyLocalServiceUtil.getVInvestPoliciesCount();
			System.out.println("count :"+count);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.setProperty("action", ActionConstants.VIEW_INVEST);
		return "viewHome";
    }

	@RequestMapping(params="action="+ActionConstants.VIEW_INVEST)
	public String viewInvest (Model model, RenderRequest request, RenderResponse response) {
		System.out.println("ImsController viewInvest");

		response.setProperty("action", ActionConstants.VIEW_INVEST);
		return "viewHome";
	}
}

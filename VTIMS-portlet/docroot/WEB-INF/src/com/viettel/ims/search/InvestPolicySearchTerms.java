package com.viettel.ims.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.util.ParamUtil;

public class InvestPolicySearchTerms extends InvestPolicyDisplayTerms {

	public InvestPolicySearchTerms(PortletRequest portletRequest) {
		super(portletRequest);
		// TODO Auto-generated constructor stub
		infoPolicyType = ParamUtil.getString(portletRequest, INFO_POLICY_TYPE);
		infoPolicyName = ParamUtil.getString(portletRequest, INFO_POLICY_NAME);
		infoProposeGroupId = ParamUtil.getLong(portletRequest, INFO_PROPOSE_GROUP_ID);
		infoProposeGroupName = ParamUtil.getString(portletRequest, INFO_PROPOSE_GROUP_NAME);
		infoVerifyGroupId = ParamUtil.getLong(portletRequest, INFO_VERIFY_GROUP_ID);
		infoVerifyGroupName = ParamUtil.getString(portletRequest, INFO_VERIFY_GROUP_NAME);
		isActive = ParamUtil.getLong(portletRequest, IS_ACTIVE);
	}

}

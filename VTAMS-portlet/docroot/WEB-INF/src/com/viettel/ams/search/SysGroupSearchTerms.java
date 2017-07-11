package com.viettel.ams.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.util.ParamUtil;

public class SysGroupSearchTerms extends SysGroupDisplayTerms {

	public SysGroupSearchTerms(PortletRequest portletRequest) {
		super(portletRequest);
		// TODO Auto-generated constructor stub
		name = ParamUtil.getString(portletRequest, NAME);
		groupCode = ParamUtil.getString(portletRequest, GROUP_CODE);
		isActive = ParamUtil.getLong(portletRequest, IS_ACTIVE);
	}

}

package com.viettel.ams.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.util.ParamUtil;

public class MerEntitySearchTerms extends MerEntityDisplayTerms {

	public MerEntitySearchTerms(PortletRequest portletRequest) {
		super(portletRequest);
		// TODO Auto-generated constructor stub
		merName = ParamUtil.getString(portletRequest, MER_NAME);
		merCode = ParamUtil.getString(portletRequest, MER_CODE);
		serialNumber = ParamUtil.getString(portletRequest, SERIAL_NUMBER);
		groupName = ParamUtil.getString(portletRequest, GROUP_NAME);
		groupId = ParamUtil.getLong(portletRequest, GROUP_ID);
	}

}

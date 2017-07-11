package com.viettel.ams.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.util.ParamUtil;

public class AssetManageReqSearchTerms extends AssetManageReqDisplayTerms {

	public AssetManageReqSearchTerms(PortletRequest portletRequest) {
		super(portletRequest);
		// TODO Auto-generated constructor stub
		code = ParamUtil.getString(portletRequest, CODE);
		reqGroupId = ParamUtil.getLong(portletRequest, REQ_GROUP_ID);
		recvGroupId = ParamUtil.getLong(portletRequest, RECV_GROUP_ID);
		status = ParamUtil.getString(portletRequest, STATUS);
	}

}

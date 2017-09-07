package com.vnpt.portal.rss.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.util.ParamUtil;

public class RssFeedsSearchTerms extends RssFeedsDisplayTerms {

	public RssFeedsSearchTerms(PortletRequest portletRequest) {
		super(portletRequest);
		// TODO Auto-generated constructor stub
		url = ParamUtil.getString(portletRequest, URL);
		title = ParamUtil.getString(portletRequest, TITLE);
		content = ParamUtil.getString(portletRequest, CONTENT);
		status = ParamUtil.getInteger(portletRequest, STATUS);
	}

}

package com.vnpt.portal.rss.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;

public class RssFeedsDisplayTerms extends DisplayTerms {

	public static final String URL = "url";
	public static final String TITLE = "title";
	public static final String CONTENT = "content";
	public static final String STATUS = "status";

	protected String url;
	protected String title;
	protected String content;
	protected int status;

	public RssFeedsDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);
		url = ParamUtil.getString(portletRequest, URL);
		title = ParamUtil.getString(portletRequest, TITLE);
		content = ParamUtil.getString(portletRequest, CONTENT);
		status = ParamUtil.getInteger(portletRequest, STATUS);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}

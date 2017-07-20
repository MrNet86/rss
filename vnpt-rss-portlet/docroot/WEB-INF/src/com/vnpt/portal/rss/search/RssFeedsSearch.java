package com.vnpt.portal.rss.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.usersadmin.util.UsersAdminUtil;
import com.vnpt.portal.rss.model.RssFeeds;

public class RssFeedsSearch extends SearchContainer<RssFeeds>{

	private static Log _log = LogFactoryUtil.getLog(RssFeedsSearch.class);

	static List<String> headerNames = new ArrayList<String>();
	static Map<String, String> orderableHeaders = new HashMap<String, String>();

	static {
		headerNames.add("url");
		headerNames.add("title");
		headerNames.add("content");
		headerNames.add("status");

		orderableHeaders.put("url", "url");
		orderableHeaders.put("title", "title");
		orderableHeaders.put("content", "content");
		orderableHeaders.put("status", "status");
	}

	public static final String EMPTY_RESULTS_MESSAGE =
		"no-organizations-were-found";

	public RssFeedsSearch (PortletRequest portletRequest, PortletURL iteratorURL) {
		this(portletRequest, DEFAULT_CUR_PARAM, iteratorURL);
	}

	public RssFeedsSearch(PortletRequest portletRequest, String curParam,
		PortletURL iteratorURL) {

		super(
			portletRequest, new RssFeedsDisplayTerms(portletRequest),
			new RssFeedsSearchTerms(portletRequest), curParam,
			DEFAULT_DELTA, iteratorURL, headerNames, EMPTY_RESULTS_MESSAGE);

		RssFeedsDisplayTerms displayTerms =
			(RssFeedsDisplayTerms)getDisplayTerms();

		iteratorURL.setParameter(
				RssFeedsDisplayTerms.URL, displayTerms.getUrl());
		iteratorURL.setParameter(
				RssFeedsDisplayTerms.TITLE, displayTerms.getTitle());
		iteratorURL.setParameter(
				RssFeedsDisplayTerms.CONTENT, displayTerms.getContent());
		iteratorURL.setParameter(
				RssFeedsDisplayTerms.STATUS, String.valueOf(displayTerms.getStatus()));

		try {

			String orderByCol = ParamUtil.getString(portletRequest, "orderByCol");
			String orderByType = ParamUtil.getString(portletRequest, "orderByType");

				OrderByComparator orderByComparator =
				UsersAdminUtil.getOrganizationOrderByComparator(
					orderByCol, orderByType);

			setOrderableHeaders(orderableHeaders);
			setOrderByCol(orderByCol);
			setOrderByType(orderByType);
			setOrderByComparator(orderByComparator);
		}
		catch (Exception e) {
			_log.error(e);
		}
	}

}

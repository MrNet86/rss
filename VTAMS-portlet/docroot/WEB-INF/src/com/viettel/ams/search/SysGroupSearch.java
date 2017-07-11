package com.viettel.ams.search;

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
import com.viettel.ams.core.model.SysGroup;

public class SysGroupSearch extends SearchContainer<SysGroup>{

	private static Log _log = LogFactoryUtil.getLog(SysGroupSearch.class);

	static List<String> headerNames = new ArrayList<String>();
	static Map<String, String> orderableHeaders = new HashMap<String, String>();

	static {
		headerNames.add("name");
		headerNames.add("groupCode");
		headerNames.add("isActive");

		orderableHeaders.put("name", "name");
		orderableHeaders.put("code", "groupCode");
		orderableHeaders.put("isActive", "isActive");
	}

	public static final String EMPTY_RESULTS_MESSAGE =
		"no-organizations-were-found";

	public SysGroupSearch (PortletRequest portletRequest, PortletURL iteratorURL) {
		this(portletRequest, DEFAULT_CUR_PARAM, iteratorURL);
	}

	public SysGroupSearch(PortletRequest portletRequest, String curParam,
		PortletURL iteratorURL) {

		super(
			portletRequest, new SysGroupDisplayTerms(portletRequest),
			new SysGroupSearchTerms(portletRequest), curParam,
			DEFAULT_DELTA, iteratorURL, headerNames, EMPTY_RESULTS_MESSAGE);

		SysGroupDisplayTerms displayTerms =
			(SysGroupDisplayTerms)getDisplayTerms();

		iteratorURL.setParameter(
				SysGroupDisplayTerms.NAME, displayTerms.getName());
		iteratorURL.setParameter(
				SysGroupDisplayTerms.GROUP_CODE, displayTerms.getGroupCode());
		iteratorURL.setParameter(
				SysGroupDisplayTerms.IS_ACTIVE, String.valueOf(displayTerms.getIsActive()));

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

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
import com.viettel.ams.core.model.MerEntity;

public class MerEntitySearch extends SearchContainer<MerEntity>{

	private static Log _log = LogFactoryUtil.getLog(SysGroupSearch.class);

	static List<String> headerNames = new ArrayList<String>();
	static Map<String, String> orderableHeaders = new HashMap<String, String>();

	static {
		headerNames.add("merName");
		headerNames.add("merCode");

		orderableHeaders.put("merName", "merName");
		orderableHeaders.put("merCode", "merCode");
	}

	public static final String EMPTY_RESULTS_MESSAGE =
		"no-organizations-were-found";

	public MerEntitySearch (PortletRequest portletRequest, PortletURL iteratorURL) {
		this(portletRequest, DEFAULT_CUR_PARAM, iteratorURL);
	}

	public MerEntitySearch(PortletRequest portletRequest, String curParam,
		PortletURL iteratorURL) {

		super(
			portletRequest, new MerEntityDisplayTerms(portletRequest),
			new MerEntitySearchTerms(portletRequest), curParam,
			DEFAULT_DELTA, iteratorURL, headerNames, EMPTY_RESULTS_MESSAGE);

		MerEntityDisplayTerms displayTerms =
			(MerEntityDisplayTerms)getDisplayTerms();

		iteratorURL.setParameter(
				MerEntityDisplayTerms.MER_NAME, displayTerms.getMerName());
		iteratorURL.setParameter(
				MerEntityDisplayTerms.MER_CODE, displayTerms.getMerCode());
		iteratorURL.setParameter(
				MerEntityDisplayTerms.SERIAL_NUMBER, displayTerms.getSerialNumber());
		iteratorURL.setParameter(
				MerEntityDisplayTerms.GROUP_NAME, displayTerms.getGroupName());
		iteratorURL.setParameter(
				MerEntityDisplayTerms.GROUP_ID, String.valueOf(displayTerms.getGroupId()));

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

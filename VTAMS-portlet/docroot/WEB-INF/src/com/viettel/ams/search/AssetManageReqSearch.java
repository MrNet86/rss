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
import com.viettel.ams.core.model.AssetManageReq;

public class AssetManageReqSearch extends SearchContainer<AssetManageReq>{

	private static Log _log = LogFactoryUtil.getLog(AssetManageReqSearch.class);

	static List<String> headerNames = new ArrayList<String>();
	static Map<String, String> orderableHeaders = new HashMap<String, String>();

	static {
		headerNames.add("code");
		headerNames.add("status");

		orderableHeaders.put("code", "code");
		orderableHeaders.put("status", "status");
	}

	public static final String EMPTY_RESULTS_MESSAGE =
		"no-employee-were-found";

	public AssetManageReqSearch (PortletRequest portletRequest, PortletURL iteratorURL) {
		this(portletRequest, DEFAULT_CUR_PARAM, iteratorURL);
	}

	public AssetManageReqSearch(PortletRequest portletRequest, String curParam,
		PortletURL iteratorURL) {

		super(
			portletRequest, new AssetManageReqDisplayTerms(portletRequest),
			new AssetManageReqSearchTerms(portletRequest), curParam,
			DEFAULT_DELTA, iteratorURL, headerNames, EMPTY_RESULTS_MESSAGE);

		AssetManageReqDisplayTerms displayTerms =
			(AssetManageReqDisplayTerms)getDisplayTerms();

		iteratorURL.setParameter(AssetManageReqDisplayTerms.CODE, displayTerms.getCode());
		iteratorURL.setParameter(AssetManageReqDisplayTerms.REQ_GROUP_ID, String.valueOf(displayTerms.getReqGroupId()));
		iteratorURL.setParameter(AssetManageReqDisplayTerms.RECV_GROUP_ID, String.valueOf(displayTerms.getRecvGroupId()));
		iteratorURL.setParameter(AssetManageReqDisplayTerms.STATUS, String.valueOf(displayTerms.getStatus()));

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

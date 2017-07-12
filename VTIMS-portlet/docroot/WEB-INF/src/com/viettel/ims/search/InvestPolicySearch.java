package com.viettel.ims.search;

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
import com.viettel.ims.core.model.InvestPolicy;

public class InvestPolicySearch extends SearchContainer<InvestPolicy>{

	private static Log _log = LogFactoryUtil.getLog(InvestPolicySearch.class);

	static List<String> headerNames = new ArrayList<String>();
	static Map<String, String> orderableHeaders = new HashMap<String, String>();

	static {
		headerNames.add("infoPolicyType");
		headerNames.add("infoPolicyName");

		orderableHeaders.put("infoPolicyType", "infoPolicyType");
		orderableHeaders.put("infoPolicyName", "infoPolicyName");
	}

	public static final String EMPTY_RESULTS_MESSAGE =
		"no-employee-were-found";

	public InvestPolicySearch (PortletRequest portletRequest, PortletURL iteratorURL) {
		this(portletRequest, DEFAULT_CUR_PARAM, iteratorURL);
	}

	public InvestPolicySearch(PortletRequest portletRequest, String curParam,
		PortletURL iteratorURL) {

		super(
			portletRequest, new InvestPolicyDisplayTerms(portletRequest),
			new InvestPolicySearchTerms(portletRequest), curParam,
			DEFAULT_DELTA, iteratorURL, headerNames, EMPTY_RESULTS_MESSAGE);

		InvestPolicyDisplayTerms displayTerms =
			(InvestPolicyDisplayTerms)getDisplayTerms();

		iteratorURL.setParameter(InvestPolicyDisplayTerms.INFO_POLICY_TYPE, displayTerms.getInfoPolicyType());
		iteratorURL.setParameter(InvestPolicyDisplayTerms.INFO_POLICY_NAME, displayTerms.getInfoPolicyName());
		iteratorURL.setParameter(InvestPolicyDisplayTerms.INFO_PROPOSE_GROUP_ID, String.valueOf(displayTerms.getInfoProposeGroupId()));
		iteratorURL.setParameter(InvestPolicyDisplayTerms.INFO_PROPOSE_GROUP_NAME, String.valueOf(displayTerms.getInfoProposeGroupName()));
		iteratorURL.setParameter(InvestPolicyDisplayTerms.INFO_VERIFY_GROUP_ID, String.valueOf(displayTerms.getInfoVerifyGroupId()));
		iteratorURL.setParameter(InvestPolicyDisplayTerms.INFO_VERIFY_GROUP_NAME, String.valueOf(displayTerms.getInfoVerifyGroupName()));
		iteratorURL.setParameter(InvestPolicyDisplayTerms.IS_ACTIVE, String.valueOf(displayTerms.getIsActive()));

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

/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.viettel.ims.core.service.impl;

import java.util.List;

import javax.mail.search.SearchTerm;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.SystemException;
import com.viettel.ims.core.model.InvestPolicy;
import com.viettel.ims.core.model.InvestPolicyExt;
import com.viettel.ims.core.service.InvestPolicyLocalServiceUtil;
import com.viettel.ims.core.service.base.InvestPolicyLocalServiceBaseImpl;
import com.viettel.ims.core.service.persistence.InvestPolicyFinderUtil;
import com.viettel.ims.search.InvestPolicySearchTerms;

/**
 * The implementation of the invest policy local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.viettel.ims.core.service.InvestPolicyLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author MrNet
 * @see com.viettel.ims.core.service.base.InvestPolicyLocalServiceBaseImpl
 * @see com.viettel.ims.core.service.InvestPolicyLocalServiceUtil
 */
public class InvestPolicyLocalServiceImpl extends
		InvestPolicyLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link
	 * com.viettel.ims.core.service.InvestPolicyLocalServiceUtil} to access the
	 * invest policy local service.
	 */

	private static SessionFactory sessionFactory = (SessionFactory) PortalBeanLocatorUtil
			.locate("liferaySessionFactory");

	public List<InvestPolicy> searchInvestPolicy(
			SearchContainer searchContainer, int start, int end)
			throws SystemException {
		System.out.println("InvestPolicyLocalServiceImpl.searchInvestPolicy");

		InvestPolicySearchTerms searchTerms = (InvestPolicySearchTerms) searchContainer
				.getSearchTerms();

		DynamicQuery dynamicQuery = (DynamicQuery) DynamicQueryFactoryUtil
				.forClass(InvestPolicy.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("isActive").eq(1L));

		if (!searchTerms.getInfoPolicyName().isEmpty()) {
			dynamicQuery.add(PropertyFactoryUtil.forName("infoPolicyName")
					.like("%" + searchTerms.getInfoPolicyName() + "%"));
		}

		List<InvestPolicy> lstResults = (List<InvestPolicy>) InvestPolicyLocalServiceUtil
				.dynamicQuery(dynamicQuery, start, end);

		return lstResults;
	}

	@SuppressWarnings("rawtypes")
	public int countInvestPolicy(SearchContainer searchContainer)
			throws SystemException {

		InvestPolicySearchTerms searchTerms = (InvestPolicySearchTerms) searchContainer
				.getSearchTerms();

		DynamicQuery dynamicQuery = (DynamicQuery) DynamicQueryFactoryUtil
				.forClass(InvestPolicy.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("isActive").eq(1L));

		if (!searchTerms.getInfoPolicyName().isEmpty()) {
			dynamicQuery.add(PropertyFactoryUtil.forName("infoPolicyName")
					.like("%" + searchTerms.getInfoPolicyName() + "%"));
		}

		Long countRow = InvestPolicyLocalServiceUtil
				.dynamicQueryCount(dynamicQuery);

		return countRow.intValue();
	}

	public List<InvestPolicyExt> searchInvestPolicyExt(
			SearchContainer searchContainer, int start, int end)
			throws SystemException {
		System.out.println("searchInvestPolicyExt :");

		List<InvestPolicyExt> lstResult = InvestPolicyFinderUtil
				.findInvestPolicy(searchContainer, start, end);

		return lstResult;
	}
}
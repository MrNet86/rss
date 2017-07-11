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

package com.viettel.ams.core.service.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.SystemException;
import com.viettel.ams.core.model.SysGroup;
import com.viettel.ams.core.service.SysGroupLocalServiceUtil;
import com.viettel.ams.core.service.base.SysGroupLocalServiceBaseImpl;

/**
 * The implementation of the sys group local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.viettel.ams.core.service.SysGroupLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author MrNet
 * @see com.viettel.ams.core.service.base.SysGroupLocalServiceBaseImpl
 * @see com.viettel.ams.core.service.SysGroupLocalServiceUtil
 */
public class SysGroupLocalServiceImpl extends SysGroupLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.viettel.ams.core.service.SysGroupLocalServiceUtil} to access the sys group local service.
	 */

//	public List<SysGroup> searchSysGroup (SearchContainer searchContainer, int start, int end) throws SystemException {
//
//		SysGroupSearchTerms searchTerms = (SysGroupSearchTerms) searchContainer.getSearchTerms();
//
//		DynamicQuery dynamicQuery = (DynamicQuery) DynamicQueryFactoryUtil.forClass(SysGroup.class);
//
//		dynamicQuery.add(PropertyFactoryUtil.forName("status").eq(1L));
//
//		if(searchTerms.getKeywords() != null && !"".equals(searchTerms.getKeywords())){
//			System.out.println("search by keywords ");
//			Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
//			disjunction.add(PropertyFactoryUtil.forName("name").like("%"+searchTerms.getKeywords()+"%"));
//			disjunction.add(PropertyFactoryUtil.forName("groupCode").like("%"+searchTerms.getKeywords()+"%"));
//
//			dynamicQuery.add(disjunction);
//		}
//		else {
//			if(!searchTerms.getName().isEmpty()) {
//				dynamicQuery.add(PropertyFactoryUtil.forName("name").like("%"+searchTerms.getName()+"%"));
//			}
//			else if(!searchTerms.getGroupCode().isEmpty()) {
//				dynamicQuery.add(PropertyFactoryUtil.forName("groupCode").like("%"+searchTerms.getGroupCode()+"%"));
//			}
//		}
//
//		List<SysGroup> lstResults = (List<SysGroup>) SysGroupLocalServiceUtil.dynamicQuery(dynamicQuery, start, end);
//
//		return lstResults;
//	}
//
//	@SuppressWarnings("rawtypes")
//	public int countSysGroup (SearchContainer searchContainer) throws SystemException {
//
//		SysGroupSearchTerms searchTerms = (SysGroupSearchTerms) searchContainer.getSearchTerms();
//
//		DynamicQuery dynamicQuery = (DynamicQuery) DynamicQueryFactoryUtil.forClass(SysGroup.class);
//
//		dynamicQuery.add(PropertyFactoryUtil.forName("status").eq(1L));
//
//		if(searchTerms.getKeywords() != null && !"".equals(searchTerms.getKeywords())){
//			System.out.println("search by keywords ");
//			Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
//			disjunction.add(PropertyFactoryUtil.forName("name").like("%"+searchTerms.getKeywords()+"%"));
//			disjunction.add(PropertyFactoryUtil.forName("groupCode").like("%"+searchTerms.getKeywords()+"%"));
//
//			dynamicQuery.add(disjunction);
//		}
//		else {
//			if(!searchTerms.getName().isEmpty()) {
//				dynamicQuery.add(PropertyFactoryUtil.forName("name").like("%"+searchTerms.getName()+"%"));
//			}
//			else if(!searchTerms.getGroupCode().isEmpty()) {
//				dynamicQuery.add(PropertyFactoryUtil.forName("groupCode").like("%"+searchTerms.getGroupCode()+"%"));
//			}
//		}
//
//		Long countRow = SysGroupLocalServiceUtil.dynamicQueryCount(dynamicQuery);
//
//		return countRow.intValue();
//	}

}
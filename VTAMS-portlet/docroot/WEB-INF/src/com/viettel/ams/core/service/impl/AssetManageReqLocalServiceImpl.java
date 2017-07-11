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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.SystemException;
import com.viettel.ams.core.model.AssetManageReq;
import com.viettel.ams.core.service.AssetManageReqLocalServiceUtil;
import com.viettel.ams.core.service.base.AssetManageReqLocalServiceBaseImpl;
import com.viettel.ams.core.service.persistence.AssetManageReqFinderUtil;
import com.viettel.ams.modelext.AssetManageReqExt;
import com.viettel.ams.search.AssetManageReqSearchTerms;

/**
 * The implementation of the asset manage req local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.viettel.ams.core.service.AssetManageReqLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author MrNet
 * @see com.viettel.ams.core.service.base.AssetManageReqLocalServiceBaseImpl
 * @see com.viettel.ams.core.service.AssetManageReqLocalServiceUtil
 */
public class AssetManageReqLocalServiceImpl
	extends AssetManageReqLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.viettel.ams.core.service.AssetManageReqLocalServiceUtil} to access the asset manage req local service.
	 */

//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public List<AssetManageReq> searchAssetManageReq(
//			SearchContainer searchContainer, int start, int end)
//			throws SystemException {
//
//		AssetManageReqSearchTerms searchTerms = (AssetManageReqSearchTerms) searchContainer
//				.getSearchTerms();
//
//		DynamicQuery dynamicQuery = (DynamicQuery) DynamicQueryFactoryUtil
//				.forClass(AssetManageReq.class);
//
//		if (!searchTerms.getCode().isEmpty()) {
//			dynamicQuery.add(PropertyFactoryUtil.forName("code").like(
//					"%" + searchTerms.getCode() + "%"));
//		}
//
//		return AssetManageReqLocalServiceUtil.dynamicQuery(dynamicQuery, start, end);
//
//	}
//
//	@SuppressWarnings("rawtypes")
//	public int countAssetManageReq(SearchContainer searchContainer)
//			throws SystemException {
//		AssetManageReqSearchTerms searchTerms = (AssetManageReqSearchTerms) searchContainer
//				.getSearchTerms();
//
//		DynamicQuery dynamicQuery = (DynamicQuery) DynamicQueryFactoryUtil
//				.forClass(AssetManageReq.class);
//
//		if (!searchTerms.getCode().isEmpty()) {
//			dynamicQuery.add(PropertyFactoryUtil.forName("code").like(
//					"%" + searchTerms.getCode() + "%"));
//		}
//
//		Long countRow = AssetManageReqLocalServiceUtil.dynamicQueryCount(dynamicQuery);
//
//		return countRow.intValue();
//	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<AssetManageReq> searchAssetManageReq(
			SearchContainer searchContainer, int start, int end)
			throws SystemException {
		System.out.println("AssetManageReqLocalServiceImpl.searchAssetManageReq");
		// Test
		List<AssetManageReqExt> lstResult = new ArrayList<AssetManageReqExt>();
		AssetManageReqExt objExt = null;
		List lst = AssetManageReqFinderUtil.findAssetManageReq(searchContainer, start, end);
		System.out.println("lst size :"+lst.size());
		long startTime = System.currentTimeMillis();
		for (Object item : lst) {
			Object[] arrObj = (Object[]) item;
			objExt = new AssetManageReqExt();
			objExt.setManageReqId((Long)arrObj[0]);
			objExt.setCode((String)arrObj[1]);
			objExt.setReqGroupName((String)arrObj[2]);
			objExt.setRecvGroupName((String)arrObj[3]);
			objExt.setCreatedName((String)arrObj[4]);
			objExt.setDelegator((String)arrObj[5]);
			objExt.setCreatedDate((Date)arrObj[6]);
			objExt.setStatus(arrObj[7] == null ? 0 : (Long)arrObj[7]);
			objExt.setAssetType(arrObj[8] == null ? 0 :(Long)arrObj[8]);
			objExt.setStatusCa(arrObj[9] == null ? 0 : (Long)arrObj[9]);

			lstResult.add(objExt);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("startTime :"+startTime +"|| endTime :"+endTime);
		System.out.println("Transform to Object :"+ (endTime - startTime)/1000 + " s");

		// End Test

		AssetManageReqSearchTerms searchTerms = (AssetManageReqSearchTerms) searchContainer
				.getSearchTerms();

		DynamicQuery dynamicQuery = (DynamicQuery) DynamicQueryFactoryUtil
				.forClass(AssetManageReq.class);

		if (!searchTerms.getCode().isEmpty()) {
			dynamicQuery.add(PropertyFactoryUtil.forName("code").like(
					"%" + searchTerms.getCode() + "%"));
		}

		if(searchTerms.getReqGroupId() != null && searchTerms.getReqGroupId() > 0){
			dynamicQuery.add(PropertyFactoryUtil.forName("reqGroupId").eq(searchTerms.getReqGroupId()));
		}

		if(searchTerms.getRecvGroupId() != null && searchTerms.getRecvGroupId() > 0){
			dynamicQuery.add(PropertyFactoryUtil.forName("recvGroupId").eq(searchTerms.getRecvGroupId()));
		}
		return AssetManageReqLocalServiceUtil.dynamicQuery(dynamicQuery, start, end);

	}

	@SuppressWarnings("rawtypes")
	public int countAssetManageReq(SearchContainer searchContainer)
			throws SystemException {
		AssetManageReqSearchTerms searchTerms = (AssetManageReqSearchTerms) searchContainer
				.getSearchTerms();

		DynamicQuery dynamicQuery = (DynamicQuery) DynamicQueryFactoryUtil
				.forClass(AssetManageReq.class);

		if (!searchTerms.getCode().isEmpty()) {
			dynamicQuery.add(PropertyFactoryUtil.forName("code").like(
					"%" + searchTerms.getCode() + "%"));
		}

		if(searchTerms.getReqGroupId() != null && searchTerms.getReqGroupId() > 0){
			dynamicQuery.add(PropertyFactoryUtil.forName("reqGroupId").eq(searchTerms.getReqGroupId()));
		}

		if(searchTerms.getRecvGroupId() != null && searchTerms.getRecvGroupId() > 0){
			dynamicQuery.add(PropertyFactoryUtil.forName("recvGroupId").eq(searchTerms.getRecvGroupId()));
		}

		Long countRow = AssetManageReqLocalServiceUtil.dynamicQueryCount(dynamicQuery);

		return countRow.intValue();
	}

	@SuppressWarnings("rawtypes")
	public List searchListTest(
			SearchContainer searchContainer, int start, int end)
			throws SystemException {
		System.out.println("AssetManageReqLocalServiceImpl.searchAssetManageReq");
		List lst = AssetManageReqFinderUtil.findAssetManageReq(searchContainer, start, end-start);
		// Test
//		List<AssetManageReqExt> lstResult = new ArrayList<AssetManageReqExt>();
//		AssetManageReqExt objExt = null;
//		System.out.println("lst size :"+lst.size());
//		long startTime = System.currentTimeMillis();
//		for (Object item : lst) {
//			Object[] arrObj = (Object[]) item;
//			objExt = new AssetManageReqExt();
//			objExt.setManageReqId((Long)arrObj[0]);
//			objExt.setCode((String)arrObj[1]);
//			objExt.setReqGroupName((String)arrObj[2]);
//			objExt.setRecvGroupName((String)arrObj[3]);
//			objExt.setCreatedName((String)arrObj[4]);
//			objExt.setDelegator((String)arrObj[5]);
//			objExt.setCreatedDate((Date)arrObj[6]);
//			objExt.setStatus(arrObj[7] == null ? 0 : (Long)arrObj[7]);
//			objExt.setAssetType(arrObj[8] == null ? 0 :(Long)arrObj[8]);
//			objExt.setStatusCa(arrObj[9] == null ? 0 : (Long)arrObj[9]);
//
//			lstResult.add(objExt);
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("startTime :"+startTime +"|| endTime :"+endTime);
//		System.out.println("Transform to Object :"+ (endTime - startTime)/1000 + " s");

		return lst;
	}

	public List findEntityByAssetManageReq (Long manageReqId) throws SystemException{
		List lst = AssetManageReqFinderUtil.findEntityByAssetManageReq(manageReqId);
		return lst;
	}
}
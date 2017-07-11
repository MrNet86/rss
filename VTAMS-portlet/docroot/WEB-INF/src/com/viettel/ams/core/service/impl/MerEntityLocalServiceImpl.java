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
import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.model.Role;
import com.viettel.ams.core.model.MerEntity;
import com.viettel.ams.core.service.MerEntityLocalServiceUtil;
import com.viettel.ams.core.service.base.MerEntityLocalServiceBaseImpl;
import com.viettel.ams.core.service.persistence.MerEntityFinderUtil;

/**
 * The implementation of the mer entity local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.viettel.ams.core.service.MerEntityLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author MrNet
 * @see com.viettel.ams.core.service.base.MerEntityLocalServiceBaseImpl
 * @see com.viettel.ams.core.service.MerEntityLocalServiceUtil
 */
public class MerEntityLocalServiceImpl extends MerEntityLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.viettel.ams.core.service.MerEntityLocalServiceUtil} to access the mer entity local service.
	 */

	@SuppressWarnings("rawtypes")
	public List searchMerEntities(SearchContainer searchContainer, int start,
			int end) throws SystemException {
		long startTime = System.currentTimeMillis();
		List lstResult = MerEntityFinderUtil.findMerEntity(searchContainer, start, end - start);
		long endTime = System.currentTimeMillis();
		System.out.println("searchMerEntities searchTime :" + (endTime - startTime)/1000 + " s");

		// Test reIndex MerEntity
//		DynamicQuery dynamicQuery = (DynamicQuery) DynamicQueryFactoryUtil.forClass(MerEntity.class);
//		List<MerEntity> lstResults = (List<MerEntity>) MerEntityLocalServiceUtil.dynamicQuery(dynamicQuery, 1, 1000);
//
//			for (MerEntity merEntity : lstResults) {
//				Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(
//						MerEntity.class);
//				try {
//				indexer.reindex(merEntity);
//				System.out.println("reindex :"+merEntity.getMerEntityId());
//				} catch (SearchException e) {
//					// TODO Auto-generated catch block
////					e.printStackTrace();
//					System.out.println("reindex exception :"+merEntity.getMerEntityId());
//				}
//			}

		
		return lstResult;
	}

	@SuppressWarnings("rawtypes")
	public int countMerEntities (SearchContainer searchContainer) throws SystemException {
		long startTime = System.currentTimeMillis();
		int count = MerEntityFinderUtil.countMerEntity(searchContainer);
		long endTime = System.currentTimeMillis();
		System.out.println("countMerEntities countTime :" + (endTime - startTime)/1000 + " s");

		return count;
	}

	public List<MerEntity> getMerEntities(long[] merIds)
			throws PortalException, SystemException {

		List<MerEntity> merEntites = new ArrayList<MerEntity>(merIds.length);

		for (long merId : merIds) {
			MerEntity merObj = getMerEntity(merId);
			merEntites.add(merObj);
		}

		return merEntites;
	}
}
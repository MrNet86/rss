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

package com.vnpt.portal.rss.service.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.vnpt.portal.rss.model.RssCategory;
import com.vnpt.portal.rss.model.RssConfig;
import com.vnpt.portal.rss.model.RssFeeds;
import com.vnpt.portal.rss.service.RssCategoryLocalServiceUtil;
import com.vnpt.portal.rss.service.base.RssCategoryLocalServiceBaseImpl;

/**
 * The implementation of the rss category local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vnpt.portal.rss.service.RssCategoryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author MrNet
 * @see com.vnpt.portal.rss.service.base.RssCategoryLocalServiceBaseImpl
 * @see com.vnpt.portal.rss.service.RssCategoryLocalServiceUtil
 */
public class RssCategoryLocalServiceImpl extends RssCategoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.vnpt.portal.rss.service.RssCategoryLocalServiceUtil} to access the rss category local service.
	 */
	/**
	 * Search rssCategory by scopeGroupId
	 */
	public List<RssCategory> searchRssCategory(int start, int end, long scopeGroupId) throws SystemException {
		
		DynamicQuery dynamicQuery = (DynamicQuery) DynamicQueryFactoryUtil.forClass(RssCategory.class);
		
		dynamicQuery.add(PropertyFactoryUtil.forName("status").eq(1));
		dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(scopeGroupId));
		
		dynamicQuery.addOrder(OrderFactoryUtil.asc("name"));
		if(start == -1 && end == -1) {
			return RssCategoryLocalServiceUtil.dynamicQuery(dynamicQuery);
		}
		else {
			return RssCategoryLocalServiceUtil.dynamicQuery(dynamicQuery, start, end - start);
		}
	} 
	
	/**
	 * Count rssCategory by scopeGroupId
	 */
	public int countRssCategory(long scopeGroupId) throws SystemException {
		
		DynamicQuery dynamicQuery = (DynamicQuery) DynamicQueryFactoryUtil.forClass(RssCategory.class);
		
		dynamicQuery.add(PropertyFactoryUtil.forName("status").eq(1));
		dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(scopeGroupId));
		
		Long count =  RssCategoryLocalServiceUtil.dynamicQueryCount(dynamicQuery);
		
		return count.intValue();
	}
	
	/**
	 * get rssCategoryName by Id
	 */
	public String getRssCategoryNameById (List<RssCategory> rssCategories, long rssCategoryId) {		
		
		for (RssCategory rssCategory : rssCategories) {
			if(rssCategory.getRssCategoryId() == rssCategoryId) {
				return rssCategory.getName();
			}
		}
		
		return null;
	}
	
	/**
	 * Check if rssCategory is used in rssConfig
	 * @param rssCategoryId
	 * @param scopeGroupId
	 * @return
	 * @throws SystemException
	 */
	public boolean isExistsInConfig (long rssCategoryId, long scopeGroupId) throws SystemException {
		
		DynamicQuery dynamicQuery = (DynamicQuery) DynamicQueryFactoryUtil.forClass(RssConfig.class);
		
		dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(scopeGroupId));
		dynamicQuery.add(PropertyFactoryUtil.forName("rssCategoryId").eq(rssCategoryId));
		
		Long rowCount = RssCategoryLocalServiceUtil.dynamicQueryCount(dynamicQuery);
		
		if(rowCount > 0) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Check if rssCategory is used in rssFeeds
	 * @param rssCategoryId
	 * @param scopeGroupId
	 * @return
	 * @throws SystemException
	 */
	public boolean isExistsInFeeds (long rssCategoryId, long scopeGroupId) throws SystemException {
		
		DynamicQuery dynamicQuery = (DynamicQuery) DynamicQueryFactoryUtil.forClass(RssFeeds.class);
		
		dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(scopeGroupId));
		dynamicQuery.add(PropertyFactoryUtil.forName("rssCategoryId").eq(rssCategoryId));
		dynamicQuery.add(PropertyFactoryUtil.forName("status").ne(1));
		
		Long rowCount = RssCategoryLocalServiceUtil.dynamicQueryCount(dynamicQuery);
		
		if(rowCount > 0) {
			return true;
		}
		
		return false;
	}
}
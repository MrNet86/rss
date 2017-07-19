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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.vnpt.portal.rss.model.RssFeeds;
import com.vnpt.portal.rss.search.RssFeedsSearchTerms;
import com.vnpt.portal.rss.service.RssFeedsLocalServiceUtil;
import com.vnpt.portal.rss.service.base.RssFeedsLocalServiceBaseImpl;

/**
 * The implementation of the rss feeds local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vnpt.portal.rss.service.RssFeedsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author MrNet
 * @see com.vnpt.portal.rss.service.base.RssFeedsLocalServiceBaseImpl
 * @see com.vnpt.portal.rss.service.RssFeedsLocalServiceUtil
 */
public class RssFeedsLocalServiceImpl extends RssFeedsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.vnpt.portal.rss.service.RssFeedsLocalServiceUtil} to access the rss feeds local service.
	 */
	
	public List<RssFeeds> getRssFeedsPublished (SearchContainer searchContainer, int start, int end, int status, long scopeGroupId) 
			throws SystemException{
		List<RssFeeds> lstResults = new ArrayList<RssFeeds>();
		
		RssFeedsSearchTerms searchTerms = (RssFeedsSearchTerms) searchContainer.getSearchTerms();
		DynamicQuery query = (DynamicQuery) DynamicQueryFactoryUtil.forClass(RssFeeds.class);
		
		query.add(PropertyFactoryUtil.forName("status").eq(status)) ;
		query.add(PropertyFactoryUtil.forName("groupId").eq(scopeGroupId)) ;
		
		if(searchTerms.getUrl() != null && !"".equals(searchTerms.getUrl())) {
			query.add(PropertyFactoryUtil.forName("url").like("%" + searchTerms.getUrl() + "%"));
		}
		
		if(searchTerms.getTitle() != null && !"".equals(searchTerms.getTitle())) {
			query.add(PropertyFactoryUtil.forName("title").like("%" + searchTerms.getTitle() + "%"));
		}
		
		lstResults = RssFeedsLocalServiceUtil.dynamicQuery(query, start, end - start) ;
		
		return lstResults;
	}
	
	public int countRssFeedsPublished (SearchContainer searchContainer, int status, long scopeGroupId) throws SystemException {
		
		RssFeedsSearchTerms searchTerms = (RssFeedsSearchTerms) searchContainer.getSearchTerms();
		DynamicQuery query = (DynamicQuery) DynamicQueryFactoryUtil.forClass(RssFeeds.class);
		
		query.add(PropertyFactoryUtil.forName("status").eq(status));
		query.add(PropertyFactoryUtil.forName("groupId").eq(scopeGroupId));
		
		if(searchTerms.getUrl() != null && !"".equals(searchTerms.getUrl())) {
			query.add(PropertyFactoryUtil.forName("url").like("%" + searchTerms.getUrl() + "%"));
		}
		
		if(searchTerms.getTitle() != null && !"".equals(searchTerms.getTitle())) {
			query.add(PropertyFactoryUtil.forName("title").like("%" + searchTerms.getTitle() + "%"));
		}
		
		Long count = RssFeedsLocalServiceUtil.dynamicQueryCount(query) ;
		
		return count.intValue();
		
	}
}
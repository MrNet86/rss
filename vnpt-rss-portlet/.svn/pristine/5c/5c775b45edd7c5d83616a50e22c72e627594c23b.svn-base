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
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.vnpt.portal.rss.model.RssConfig;
import com.vnpt.portal.rss.service.RssConfigLocalServiceUtil;
import com.vnpt.portal.rss.service.base.RssConfigServiceBaseImpl;

/**
 * The implementation of the rss config remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vnpt.portal.rss.service.RssConfigService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author MrNet
 * @see com.vnpt.portal.rss.service.base.RssConfigServiceBaseImpl
 * @see com.vnpt.portal.rss.service.RssConfigServiceUtil
 */
public class RssConfigServiceImpl extends RssConfigServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.vnpt.portal.rss.service.RssConfigServiceUtil} to access the rss config remote service.
	 */
	
	public List<RssConfig> searchRssConfigByGroup (long scopeGroupId) throws SystemException {
		
		DynamicQuery query = (DynamicQuery) DynamicQueryFactoryUtil.forClass(RssConfig.class);
		query.add(PropertyFactoryUtil.forName("groupId").eq(scopeGroupId));
		
		return RssConfigLocalServiceUtil.dynamicQuery(query);
	}
}
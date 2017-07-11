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

package com.viettel.ams.core.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author MrNet
 */
public class AssetManageReqFinderUtil {
	public static java.util.List findAssetManageReq(
		com.liferay.portal.kernel.dao.search.SearchContainer searchContainer,
		int start, int end) {
		return getFinder().findAssetManageReq(searchContainer, start, end);
	}

	public static java.util.List findEntityByAssetManageReq(
		java.lang.Long manageReqId) {
		return getFinder().findEntityByAssetManageReq(manageReqId);
	}

	public static AssetManageReqFinder getFinder() {
		if (_finder == null) {
			_finder = (AssetManageReqFinder)PortletBeanLocatorUtil.locate(com.viettel.ams.core.service.ClpSerializer.getServletContextName(),
					AssetManageReqFinder.class.getName());

			ReferenceRegistry.registerReference(AssetManageReqFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(AssetManageReqFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(AssetManageReqFinderUtil.class,
			"_finder");
	}

	private static AssetManageReqFinder _finder;
}
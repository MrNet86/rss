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
public class MerEntityFinderUtil {
	public static java.util.List findMerEntity(
		com.liferay.portal.kernel.dao.search.SearchContainer searchContainer,
		int start, int end) {
		return getFinder().findMerEntity(searchContainer, start, end);
	}

	public static int countMerEntity(
		com.liferay.portal.kernel.dao.search.SearchContainer searchContainer) {
		return getFinder().countMerEntity(searchContainer);
	}

	public static MerEntityFinder getFinder() {
		if (_finder == null) {
			_finder = (MerEntityFinder)PortletBeanLocatorUtil.locate(com.viettel.ams.core.service.ClpSerializer.getServletContextName(),
					MerEntityFinder.class.getName());

			ReferenceRegistry.registerReference(MerEntityFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(MerEntityFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(MerEntityFinderUtil.class, "_finder");
	}

	private static MerEntityFinder _finder;
}
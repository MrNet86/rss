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

package com.vnpt.portlet.user.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author ToanNQ86
 */
public class GroupUsersFinderUtil {
	public static java.util.List findAllUserByGroupAndChild(long groupId,
		int start, int end) {
		return getFinder().findAllUserByGroupAndChild(groupId, start, end);
	}

	public static GroupUsersFinder getFinder() {
		if (_finder == null) {
			_finder = (GroupUsersFinder)PortletBeanLocatorUtil.locate(com.vnpt.portlet.user.service.ClpSerializer.getServletContextName(),
					GroupUsersFinder.class.getName());

			ReferenceRegistry.registerReference(GroupUsersFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(GroupUsersFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(GroupUsersFinderUtil.class,
			"_finder");
	}

	private static GroupUsersFinder _finder;
}
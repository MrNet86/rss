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
public class GroupRolesFinderUtil {
	public static java.util.List<com.liferay.portal.model.User> findAllUserByGroupAndChild(
		long groupId, int start, int end) {
		return getFinder().findAllUserByGroupAndChild(groupId, start, end);
	}

	public static GroupRolesFinder getFinder() {
		if (_finder == null) {
			_finder = (GroupRolesFinder)PortletBeanLocatorUtil.locate(com.vnpt.portlet.user.service.ClpSerializer.getServletContextName(),
					GroupRolesFinder.class.getName());

			ReferenceRegistry.registerReference(GroupRolesFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(GroupRolesFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(GroupRolesFinderUtil.class,
			"_finder");
	}

	private static GroupRolesFinder _finder;
}
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

package com.vnpt.portlet.user.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.vnpt.portlet.user.service.ActIdGroupLocalServiceUtil;
import com.vnpt.portlet.user.service.ActIdInfoLocalServiceUtil;
import com.vnpt.portlet.user.service.ActIdMembershipLocalServiceUtil;
import com.vnpt.portlet.user.service.ActIdUserLocalServiceUtil;
import com.vnpt.portlet.user.service.ClpSerializer;
import com.vnpt.portlet.user.service.GroupRolesLocalServiceUtil;
import com.vnpt.portlet.user.service.GroupUsersLocalServiceUtil;
import com.vnpt.portlet.user.service.LiferayDatabaseLocalServiceUtil;
import com.vnpt.portlet.user.service.PermissionGroupLocalServiceUtil;

/**
 * @author ToanNQ86
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			ActIdGroupLocalServiceUtil.clearService();

			ActIdInfoLocalServiceUtil.clearService();

			ActIdMembershipLocalServiceUtil.clearService();

			ActIdUserLocalServiceUtil.clearService();

			GroupRolesLocalServiceUtil.clearService();

			GroupUsersLocalServiceUtil.clearService();

			LiferayDatabaseLocalServiceUtil.clearService();

			PermissionGroupLocalServiceUtil.clearService();
		}
	}
}
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

package com.viettel.ams.core.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.viettel.ams.core.service.AssetManageReqEntityLocalServiceUtil;
import com.viettel.ams.core.service.AssetManageReqEntityServiceUtil;
import com.viettel.ams.core.service.AssetManageReqHandleEntityLocalServiceUtil;
import com.viettel.ams.core.service.AssetManageReqHandleEntityServiceUtil;
import com.viettel.ams.core.service.AssetManageReqHandleLocalServiceUtil;
import com.viettel.ams.core.service.AssetManageReqHandleServiceUtil;
import com.viettel.ams.core.service.AssetManageReqLocalServiceUtil;
import com.viettel.ams.core.service.AssetManageReqServiceUtil;
import com.viettel.ams.core.service.ClpSerializer;
import com.viettel.ams.core.service.MerEntityLocalServiceUtil;
import com.viettel.ams.core.service.MerEntityServiceUtil;
import com.viettel.ams.core.service.SysGroupLocalServiceUtil;
import com.viettel.ams.core.service.SysGroupServiceUtil;

/**
 * @author MrNet
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
			AssetManageReqLocalServiceUtil.clearService();

			AssetManageReqServiceUtil.clearService();
			AssetManageReqEntityLocalServiceUtil.clearService();

			AssetManageReqEntityServiceUtil.clearService();
			AssetManageReqHandleLocalServiceUtil.clearService();

			AssetManageReqHandleServiceUtil.clearService();
			AssetManageReqHandleEntityLocalServiceUtil.clearService();

			AssetManageReqHandleEntityServiceUtil.clearService();
			MerEntityLocalServiceUtil.clearService();

			MerEntityServiceUtil.clearService();
			SysGroupLocalServiceUtil.clearService();

			SysGroupServiceUtil.clearService();
		}
	}
}
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

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.viettel.ams.core.model.AssetManageReq;
import com.viettel.ams.core.service.AssetManageReqLocalServiceUtil;

/**
 * @author MrNet
 * @generated
 */
public abstract class AssetManageReqActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public AssetManageReqActionableDynamicQuery() throws SystemException {
		setBaseLocalService(AssetManageReqLocalServiceUtil.getService());
		setClass(AssetManageReq.class);

		setClassLoader(com.viettel.ams.core.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("manageReqId");
	}
}
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

package com.viettel.ims.core.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.viettel.ims.core.model.FileAttachment;
import com.viettel.ims.core.service.FileAttachmentLocalServiceUtil;

/**
 * @author MrNet
 * @generated
 */
public abstract class FileAttachmentActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public FileAttachmentActionableDynamicQuery() throws SystemException {
		setBaseLocalService(FileAttachmentLocalServiceUtil.getService());
		setClass(FileAttachment.class);

		setClassLoader(com.viettel.ims.core.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("fileAttachmentId");
	}
}
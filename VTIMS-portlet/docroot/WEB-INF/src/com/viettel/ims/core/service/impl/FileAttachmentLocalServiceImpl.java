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

package com.viettel.ims.core.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.viettel.ims.core.model.FileAttachment;
import com.viettel.ims.core.service.base.FileAttachmentLocalServiceBaseImpl;
import com.viettel.ims.core.service.persistence.FileAttachmentUtil;

/**
 * The implementation of the file attachment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.viettel.ims.core.service.FileAttachmentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author MrNet
 * @see com.viettel.ims.core.service.base.FileAttachmentLocalServiceBaseImpl
 * @see com.viettel.ims.core.service.FileAttachmentLocalServiceUtil
 */
public class FileAttachmentLocalServiceImpl
	extends FileAttachmentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.viettel.ims.core.service.FileAttachmentLocalServiceUtil} to access the file attachment local service.
	 */

	public List<FileAttachment> getFileAttachmentsByObject(int objectType, long objectId){
		List<FileAttachment> fileAttachments = null;
		try {
			fileAttachments = FileAttachmentUtil.findByO_O(objectType, objectId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return fileAttachments;
	}
}
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

package com.viettel.ims.core.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.viettel.ims.core.service.ClpSerializer;
import com.viettel.ims.core.service.FileAttachmentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MrNet
 */
public class FileAttachmentClp extends BaseModelImpl<FileAttachment>
	implements FileAttachment {
	public FileAttachmentClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return FileAttachment.class;
	}

	@Override
	public String getModelClassName() {
		return FileAttachment.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _fileAttachmentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFileAttachmentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _fileAttachmentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fileAttachmentId", getFileAttachmentId());
		attributes.put("companyId", getCompanyId());
		attributes.put("repositoryId", getRepositoryId());
		attributes.put("folderId", getFolderId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdById", getCreatedById());
		attributes.put("treePath_", getTreePath_());
		attributes.put("name", getName());
		attributes.put("extention", getExtention());
		attributes.put("mimeType", getMimeType());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("extraSetting", getExtraSetting());
		attributes.put("fileTypeId", getFileTypeId());
		attributes.put("version", getVersion());
		attributes.put("size_", getSize_());
		attributes.put("readCount", getReadCount());
		attributes.put("smallImageId", getSmallImageId());
		attributes.put("largeImageId", getLargeImageId());
		attributes.put("custom1Image", getCustom1Image());
		attributes.put("custom2Image", getCustom2Image());
		attributes.put("isManualCheckInRequired", getIsManualCheckInRequired());
		attributes.put("objectType", getObjectType());
		attributes.put("objectId", getObjectId());
		attributes.put("modifiedById", getModifiedById());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fileAttachmentId = (Long)attributes.get("fileAttachmentId");

		if (fileAttachmentId != null) {
			setFileAttachmentId(fileAttachmentId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long repositoryId = (Long)attributes.get("repositoryId");

		if (repositoryId != null) {
			setRepositoryId(repositoryId);
		}

		Long folderId = (Long)attributes.get("folderId");

		if (folderId != null) {
			setFolderId(folderId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long createdById = (Long)attributes.get("createdById");

		if (createdById != null) {
			setCreatedById(createdById);
		}

		String treePath_ = (String)attributes.get("treePath_");

		if (treePath_ != null) {
			setTreePath_(treePath_);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String extention = (String)attributes.get("extention");

		if (extention != null) {
			setExtention(extention);
		}

		String mimeType = (String)attributes.get("mimeType");

		if (mimeType != null) {
			setMimeType(mimeType);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String extraSetting = (String)attributes.get("extraSetting");

		if (extraSetting != null) {
			setExtraSetting(extraSetting);
		}

		Long fileTypeId = (Long)attributes.get("fileTypeId");

		if (fileTypeId != null) {
			setFileTypeId(fileTypeId);
		}

		String version = (String)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		Long size_ = (Long)attributes.get("size_");

		if (size_ != null) {
			setSize_(size_);
		}

		Integer readCount = (Integer)attributes.get("readCount");

		if (readCount != null) {
			setReadCount(readCount);
		}

		Long smallImageId = (Long)attributes.get("smallImageId");

		if (smallImageId != null) {
			setSmallImageId(smallImageId);
		}

		Long largeImageId = (Long)attributes.get("largeImageId");

		if (largeImageId != null) {
			setLargeImageId(largeImageId);
		}

		Long custom1Image = (Long)attributes.get("custom1Image");

		if (custom1Image != null) {
			setCustom1Image(custom1Image);
		}

		Long custom2Image = (Long)attributes.get("custom2Image");

		if (custom2Image != null) {
			setCustom2Image(custom2Image);
		}

		Boolean isManualCheckInRequired = (Boolean)attributes.get(
				"isManualCheckInRequired");

		if (isManualCheckInRequired != null) {
			setIsManualCheckInRequired(isManualCheckInRequired);
		}

		Integer objectType = (Integer)attributes.get("objectType");

		if (objectType != null) {
			setObjectType(objectType);
		}

		Long objectId = (Long)attributes.get("objectId");

		if (objectId != null) {
			setObjectId(objectId);
		}

		Long modifiedById = (Long)attributes.get("modifiedById");

		if (modifiedById != null) {
			setModifiedById(modifiedById);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public long getFileAttachmentId() {
		return _fileAttachmentId;
	}

	@Override
	public void setFileAttachmentId(long fileAttachmentId) {
		_fileAttachmentId = fileAttachmentId;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setFileAttachmentId",
						long.class);

				method.invoke(_fileAttachmentRemoteModel, fileAttachmentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_fileAttachmentRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRepositoryId() {
		return _repositoryId;
	}

	@Override
	public void setRepositoryId(long repositoryId) {
		_repositoryId = repositoryId;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setRepositoryId", long.class);

				method.invoke(_fileAttachmentRemoteModel, repositoryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFolderId() {
		return _folderId;
	}

	@Override
	public void setFolderId(long folderId) {
		_folderId = folderId;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setFolderId", long.class);

				method.invoke(_fileAttachmentRemoteModel, folderId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_fileAttachmentRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreatedById() {
		return _createdById;
	}

	@Override
	public void setCreatedById(long createdById) {
		_createdById = createdById;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedById", long.class);

				method.invoke(_fileAttachmentRemoteModel, createdById);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTreePath_() {
		return _treePath_;
	}

	@Override
	public void setTreePath_(String treePath_) {
		_treePath_ = treePath_;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setTreePath_", String.class);

				method.invoke(_fileAttachmentRemoteModel, treePath_);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_fileAttachmentRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExtention() {
		return _extention;
	}

	@Override
	public void setExtention(String extention) {
		_extention = extention;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setExtention", String.class);

				method.invoke(_fileAttachmentRemoteModel, extention);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMimeType() {
		return _mimeType;
	}

	@Override
	public void setMimeType(String mimeType) {
		_mimeType = mimeType;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setMimeType", String.class);

				method.invoke(_fileAttachmentRemoteModel, mimeType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTitle() {
		return _title;
	}

	@Override
	public void setTitle(String title) {
		_title = title;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_fileAttachmentRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_fileAttachmentRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExtraSetting() {
		return _extraSetting;
	}

	@Override
	public void setExtraSetting(String extraSetting) {
		_extraSetting = extraSetting;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setExtraSetting", String.class);

				method.invoke(_fileAttachmentRemoteModel, extraSetting);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFileTypeId() {
		return _fileTypeId;
	}

	@Override
	public void setFileTypeId(long fileTypeId) {
		_fileTypeId = fileTypeId;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setFileTypeId", long.class);

				method.invoke(_fileAttachmentRemoteModel, fileTypeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVersion() {
		return _version;
	}

	@Override
	public void setVersion(String version) {
		_version = version;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setVersion", String.class);

				method.invoke(_fileAttachmentRemoteModel, version);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSize_() {
		return _size_;
	}

	@Override
	public void setSize_(long size_) {
		_size_ = size_;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setSize_", long.class);

				method.invoke(_fileAttachmentRemoteModel, size_);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getReadCount() {
		return _readCount;
	}

	@Override
	public void setReadCount(int readCount) {
		_readCount = readCount;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setReadCount", int.class);

				method.invoke(_fileAttachmentRemoteModel, readCount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSmallImageId() {
		return _smallImageId;
	}

	@Override
	public void setSmallImageId(long smallImageId) {
		_smallImageId = smallImageId;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setSmallImageId", long.class);

				method.invoke(_fileAttachmentRemoteModel, smallImageId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLargeImageId() {
		return _largeImageId;
	}

	@Override
	public void setLargeImageId(long largeImageId) {
		_largeImageId = largeImageId;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setLargeImageId", long.class);

				method.invoke(_fileAttachmentRemoteModel, largeImageId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCustom1Image() {
		return _custom1Image;
	}

	@Override
	public void setCustom1Image(long custom1Image) {
		_custom1Image = custom1Image;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setCustom1Image", long.class);

				method.invoke(_fileAttachmentRemoteModel, custom1Image);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCustom2Image() {
		return _custom2Image;
	}

	@Override
	public void setCustom2Image(long custom2Image) {
		_custom2Image = custom2Image;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setCustom2Image", long.class);

				method.invoke(_fileAttachmentRemoteModel, custom2Image);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getIsManualCheckInRequired() {
		return _isManualCheckInRequired;
	}

	@Override
	public boolean isIsManualCheckInRequired() {
		return _isManualCheckInRequired;
	}

	@Override
	public void setIsManualCheckInRequired(boolean isManualCheckInRequired) {
		_isManualCheckInRequired = isManualCheckInRequired;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setIsManualCheckInRequired",
						boolean.class);

				method.invoke(_fileAttachmentRemoteModel,
					isManualCheckInRequired);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getObjectType() {
		return _objectType;
	}

	@Override
	public void setObjectType(int objectType) {
		_objectType = objectType;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setObjectType", int.class);

				method.invoke(_fileAttachmentRemoteModel, objectType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getObjectId() {
		return _objectId;
	}

	@Override
	public void setObjectId(long objectId) {
		_objectId = objectId;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setObjectId", long.class);

				method.invoke(_fileAttachmentRemoteModel, objectId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getModifiedById() {
		return _modifiedById;
	}

	@Override
	public void setModifiedById(long modifiedById) {
		_modifiedById = modifiedById;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedById", long.class);

				method.invoke(_fileAttachmentRemoteModel, modifiedById);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_fileAttachmentRemoteModel != null) {
			try {
				Class<?> clazz = _fileAttachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_fileAttachmentRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFileAttachmentRemoteModel() {
		return _fileAttachmentRemoteModel;
	}

	public void setFileAttachmentRemoteModel(
		BaseModel<?> fileAttachmentRemoteModel) {
		_fileAttachmentRemoteModel = fileAttachmentRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _fileAttachmentRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_fileAttachmentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FileAttachmentLocalServiceUtil.addFileAttachment(this);
		}
		else {
			FileAttachmentLocalServiceUtil.updateFileAttachment(this);
		}
	}

	@Override
	public FileAttachment toEscapedModel() {
		return (FileAttachment)ProxyUtil.newProxyInstance(FileAttachment.class.getClassLoader(),
			new Class[] { FileAttachment.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FileAttachmentClp clone = new FileAttachmentClp();

		clone.setFileAttachmentId(getFileAttachmentId());
		clone.setCompanyId(getCompanyId());
		clone.setRepositoryId(getRepositoryId());
		clone.setFolderId(getFolderId());
		clone.setCreatedDate(getCreatedDate());
		clone.setCreatedById(getCreatedById());
		clone.setTreePath_(getTreePath_());
		clone.setName(getName());
		clone.setExtention(getExtention());
		clone.setMimeType(getMimeType());
		clone.setTitle(getTitle());
		clone.setDescription(getDescription());
		clone.setExtraSetting(getExtraSetting());
		clone.setFileTypeId(getFileTypeId());
		clone.setVersion(getVersion());
		clone.setSize_(getSize_());
		clone.setReadCount(getReadCount());
		clone.setSmallImageId(getSmallImageId());
		clone.setLargeImageId(getLargeImageId());
		clone.setCustom1Image(getCustom1Image());
		clone.setCustom2Image(getCustom2Image());
		clone.setIsManualCheckInRequired(getIsManualCheckInRequired());
		clone.setObjectType(getObjectType());
		clone.setObjectId(getObjectId());
		clone.setModifiedById(getModifiedById());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(FileAttachment fileAttachment) {
		int value = 0;

		if (getCompanyId() < fileAttachment.getCompanyId()) {
			value = -1;
		}
		else if (getCompanyId() > fileAttachment.getCompanyId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FileAttachmentClp)) {
			return false;
		}

		FileAttachmentClp fileAttachment = (FileAttachmentClp)obj;

		long primaryKey = fileAttachment.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{fileAttachmentId=");
		sb.append(getFileAttachmentId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", repositoryId=");
		sb.append(getRepositoryId());
		sb.append(", folderId=");
		sb.append(getFolderId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdById=");
		sb.append(getCreatedById());
		sb.append(", treePath_=");
		sb.append(getTreePath_());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", extention=");
		sb.append(getExtention());
		sb.append(", mimeType=");
		sb.append(getMimeType());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", extraSetting=");
		sb.append(getExtraSetting());
		sb.append(", fileTypeId=");
		sb.append(getFileTypeId());
		sb.append(", version=");
		sb.append(getVersion());
		sb.append(", size_=");
		sb.append(getSize_());
		sb.append(", readCount=");
		sb.append(getReadCount());
		sb.append(", smallImageId=");
		sb.append(getSmallImageId());
		sb.append(", largeImageId=");
		sb.append(getLargeImageId());
		sb.append(", custom1Image=");
		sb.append(getCustom1Image());
		sb.append(", custom2Image=");
		sb.append(getCustom2Image());
		sb.append(", isManualCheckInRequired=");
		sb.append(getIsManualCheckInRequired());
		sb.append(", objectType=");
		sb.append(getObjectType());
		sb.append(", objectId=");
		sb.append(getObjectId());
		sb.append(", modifiedById=");
		sb.append(getModifiedById());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(82);

		sb.append("<model><model-name>");
		sb.append("com.viettel.ims.core.model.FileAttachment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>fileAttachmentId</column-name><column-value><![CDATA[");
		sb.append(getFileAttachmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repositoryId</column-name><column-value><![CDATA[");
		sb.append(getRepositoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>folderId</column-name><column-value><![CDATA[");
		sb.append(getFolderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdById</column-name><column-value><![CDATA[");
		sb.append(getCreatedById());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>treePath_</column-name><column-value><![CDATA[");
		sb.append(getTreePath_());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extention</column-name><column-value><![CDATA[");
		sb.append(getExtention());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mimeType</column-name><column-value><![CDATA[");
		sb.append(getMimeType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extraSetting</column-name><column-value><![CDATA[");
		sb.append(getExtraSetting());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileTypeId</column-name><column-value><![CDATA[");
		sb.append(getFileTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>version</column-name><column-value><![CDATA[");
		sb.append(getVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>size_</column-name><column-value><![CDATA[");
		sb.append(getSize_());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>readCount</column-name><column-value><![CDATA[");
		sb.append(getReadCount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>smallImageId</column-name><column-value><![CDATA[");
		sb.append(getSmallImageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>largeImageId</column-name><column-value><![CDATA[");
		sb.append(getLargeImageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>custom1Image</column-name><column-value><![CDATA[");
		sb.append(getCustom1Image());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>custom2Image</column-name><column-value><![CDATA[");
		sb.append(getCustom2Image());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isManualCheckInRequired</column-name><column-value><![CDATA[");
		sb.append(getIsManualCheckInRequired());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>objectType</column-name><column-value><![CDATA[");
		sb.append(getObjectType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>objectId</column-name><column-value><![CDATA[");
		sb.append(getObjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedById</column-name><column-value><![CDATA[");
		sb.append(getModifiedById());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _fileAttachmentId;
	private long _companyId;
	private long _repositoryId;
	private long _folderId;
	private Date _createdDate;
	private long _createdById;
	private String _treePath_;
	private String _name;
	private String _extention;
	private String _mimeType;
	private String _title;
	private String _description;
	private String _extraSetting;
	private long _fileTypeId;
	private String _version;
	private long _size_;
	private int _readCount;
	private long _smallImageId;
	private long _largeImageId;
	private long _custom1Image;
	private long _custom2Image;
	private boolean _isManualCheckInRequired;
	private int _objectType;
	private long _objectId;
	private long _modifiedById;
	private Date _modifiedDate;
	private BaseModel<?> _fileAttachmentRemoteModel;
	private Class<?> _clpSerializerClass = com.viettel.ims.core.service.ClpSerializer.class;
}
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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FileAttachment}.
 * </p>
 *
 * @author MrNet
 * @see FileAttachment
 * @generated
 */
public class FileAttachmentWrapper implements FileAttachment,
	ModelWrapper<FileAttachment> {
	public FileAttachmentWrapper(FileAttachment fileAttachment) {
		_fileAttachment = fileAttachment;
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

	/**
	* Returns the primary key of this file attachment.
	*
	* @return the primary key of this file attachment
	*/
	@Override
	public long getPrimaryKey() {
		return _fileAttachment.getPrimaryKey();
	}

	/**
	* Sets the primary key of this file attachment.
	*
	* @param primaryKey the primary key of this file attachment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_fileAttachment.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the file attachment ID of this file attachment.
	*
	* @return the file attachment ID of this file attachment
	*/
	@Override
	public long getFileAttachmentId() {
		return _fileAttachment.getFileAttachmentId();
	}

	/**
	* Sets the file attachment ID of this file attachment.
	*
	* @param fileAttachmentId the file attachment ID of this file attachment
	*/
	@Override
	public void setFileAttachmentId(long fileAttachmentId) {
		_fileAttachment.setFileAttachmentId(fileAttachmentId);
	}

	/**
	* Returns the company ID of this file attachment.
	*
	* @return the company ID of this file attachment
	*/
	@Override
	public long getCompanyId() {
		return _fileAttachment.getCompanyId();
	}

	/**
	* Sets the company ID of this file attachment.
	*
	* @param companyId the company ID of this file attachment
	*/
	@Override
	public void setCompanyId(long companyId) {
		_fileAttachment.setCompanyId(companyId);
	}

	/**
	* Returns the repository ID of this file attachment.
	*
	* @return the repository ID of this file attachment
	*/
	@Override
	public long getRepositoryId() {
		return _fileAttachment.getRepositoryId();
	}

	/**
	* Sets the repository ID of this file attachment.
	*
	* @param repositoryId the repository ID of this file attachment
	*/
	@Override
	public void setRepositoryId(long repositoryId) {
		_fileAttachment.setRepositoryId(repositoryId);
	}

	/**
	* Returns the folder ID of this file attachment.
	*
	* @return the folder ID of this file attachment
	*/
	@Override
	public long getFolderId() {
		return _fileAttachment.getFolderId();
	}

	/**
	* Sets the folder ID of this file attachment.
	*
	* @param folderId the folder ID of this file attachment
	*/
	@Override
	public void setFolderId(long folderId) {
		_fileAttachment.setFolderId(folderId);
	}

	/**
	* Returns the created date of this file attachment.
	*
	* @return the created date of this file attachment
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _fileAttachment.getCreatedDate();
	}

	/**
	* Sets the created date of this file attachment.
	*
	* @param createdDate the created date of this file attachment
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_fileAttachment.setCreatedDate(createdDate);
	}

	/**
	* Returns the created by ID of this file attachment.
	*
	* @return the created by ID of this file attachment
	*/
	@Override
	public long getCreatedById() {
		return _fileAttachment.getCreatedById();
	}

	/**
	* Sets the created by ID of this file attachment.
	*
	* @param createdById the created by ID of this file attachment
	*/
	@Override
	public void setCreatedById(long createdById) {
		_fileAttachment.setCreatedById(createdById);
	}

	/**
	* Returns the tree path_ of this file attachment.
	*
	* @return the tree path_ of this file attachment
	*/
	@Override
	public java.lang.String getTreePath_() {
		return _fileAttachment.getTreePath_();
	}

	/**
	* Sets the tree path_ of this file attachment.
	*
	* @param treePath_ the tree path_ of this file attachment
	*/
	@Override
	public void setTreePath_(java.lang.String treePath_) {
		_fileAttachment.setTreePath_(treePath_);
	}

	/**
	* Returns the name of this file attachment.
	*
	* @return the name of this file attachment
	*/
	@Override
	public java.lang.String getName() {
		return _fileAttachment.getName();
	}

	/**
	* Sets the name of this file attachment.
	*
	* @param name the name of this file attachment
	*/
	@Override
	public void setName(java.lang.String name) {
		_fileAttachment.setName(name);
	}

	/**
	* Returns the extention of this file attachment.
	*
	* @return the extention of this file attachment
	*/
	@Override
	public java.lang.String getExtention() {
		return _fileAttachment.getExtention();
	}

	/**
	* Sets the extention of this file attachment.
	*
	* @param extention the extention of this file attachment
	*/
	@Override
	public void setExtention(java.lang.String extention) {
		_fileAttachment.setExtention(extention);
	}

	/**
	* Returns the mime type of this file attachment.
	*
	* @return the mime type of this file attachment
	*/
	@Override
	public java.lang.String getMimeType() {
		return _fileAttachment.getMimeType();
	}

	/**
	* Sets the mime type of this file attachment.
	*
	* @param mimeType the mime type of this file attachment
	*/
	@Override
	public void setMimeType(java.lang.String mimeType) {
		_fileAttachment.setMimeType(mimeType);
	}

	/**
	* Returns the title of this file attachment.
	*
	* @return the title of this file attachment
	*/
	@Override
	public java.lang.String getTitle() {
		return _fileAttachment.getTitle();
	}

	/**
	* Sets the title of this file attachment.
	*
	* @param title the title of this file attachment
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_fileAttachment.setTitle(title);
	}

	/**
	* Returns the description of this file attachment.
	*
	* @return the description of this file attachment
	*/
	@Override
	public java.lang.String getDescription() {
		return _fileAttachment.getDescription();
	}

	/**
	* Sets the description of this file attachment.
	*
	* @param description the description of this file attachment
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_fileAttachment.setDescription(description);
	}

	/**
	* Returns the extra setting of this file attachment.
	*
	* @return the extra setting of this file attachment
	*/
	@Override
	public java.lang.String getExtraSetting() {
		return _fileAttachment.getExtraSetting();
	}

	/**
	* Sets the extra setting of this file attachment.
	*
	* @param extraSetting the extra setting of this file attachment
	*/
	@Override
	public void setExtraSetting(java.lang.String extraSetting) {
		_fileAttachment.setExtraSetting(extraSetting);
	}

	/**
	* Returns the file type ID of this file attachment.
	*
	* @return the file type ID of this file attachment
	*/
	@Override
	public long getFileTypeId() {
		return _fileAttachment.getFileTypeId();
	}

	/**
	* Sets the file type ID of this file attachment.
	*
	* @param fileTypeId the file type ID of this file attachment
	*/
	@Override
	public void setFileTypeId(long fileTypeId) {
		_fileAttachment.setFileTypeId(fileTypeId);
	}

	/**
	* Returns the version of this file attachment.
	*
	* @return the version of this file attachment
	*/
	@Override
	public java.lang.String getVersion() {
		return _fileAttachment.getVersion();
	}

	/**
	* Sets the version of this file attachment.
	*
	* @param version the version of this file attachment
	*/
	@Override
	public void setVersion(java.lang.String version) {
		_fileAttachment.setVersion(version);
	}

	/**
	* Returns the size_ of this file attachment.
	*
	* @return the size_ of this file attachment
	*/
	@Override
	public long getSize_() {
		return _fileAttachment.getSize_();
	}

	/**
	* Sets the size_ of this file attachment.
	*
	* @param size_ the size_ of this file attachment
	*/
	@Override
	public void setSize_(long size_) {
		_fileAttachment.setSize_(size_);
	}

	/**
	* Returns the read count of this file attachment.
	*
	* @return the read count of this file attachment
	*/
	@Override
	public int getReadCount() {
		return _fileAttachment.getReadCount();
	}

	/**
	* Sets the read count of this file attachment.
	*
	* @param readCount the read count of this file attachment
	*/
	@Override
	public void setReadCount(int readCount) {
		_fileAttachment.setReadCount(readCount);
	}

	/**
	* Returns the small image ID of this file attachment.
	*
	* @return the small image ID of this file attachment
	*/
	@Override
	public long getSmallImageId() {
		return _fileAttachment.getSmallImageId();
	}

	/**
	* Sets the small image ID of this file attachment.
	*
	* @param smallImageId the small image ID of this file attachment
	*/
	@Override
	public void setSmallImageId(long smallImageId) {
		_fileAttachment.setSmallImageId(smallImageId);
	}

	/**
	* Returns the large image ID of this file attachment.
	*
	* @return the large image ID of this file attachment
	*/
	@Override
	public long getLargeImageId() {
		return _fileAttachment.getLargeImageId();
	}

	/**
	* Sets the large image ID of this file attachment.
	*
	* @param largeImageId the large image ID of this file attachment
	*/
	@Override
	public void setLargeImageId(long largeImageId) {
		_fileAttachment.setLargeImageId(largeImageId);
	}

	/**
	* Returns the custom1 image of this file attachment.
	*
	* @return the custom1 image of this file attachment
	*/
	@Override
	public long getCustom1Image() {
		return _fileAttachment.getCustom1Image();
	}

	/**
	* Sets the custom1 image of this file attachment.
	*
	* @param custom1Image the custom1 image of this file attachment
	*/
	@Override
	public void setCustom1Image(long custom1Image) {
		_fileAttachment.setCustom1Image(custom1Image);
	}

	/**
	* Returns the custom2 image of this file attachment.
	*
	* @return the custom2 image of this file attachment
	*/
	@Override
	public long getCustom2Image() {
		return _fileAttachment.getCustom2Image();
	}

	/**
	* Sets the custom2 image of this file attachment.
	*
	* @param custom2Image the custom2 image of this file attachment
	*/
	@Override
	public void setCustom2Image(long custom2Image) {
		_fileAttachment.setCustom2Image(custom2Image);
	}

	/**
	* Returns the is manual check in required of this file attachment.
	*
	* @return the is manual check in required of this file attachment
	*/
	@Override
	public boolean getIsManualCheckInRequired() {
		return _fileAttachment.getIsManualCheckInRequired();
	}

	/**
	* Returns <code>true</code> if this file attachment is is manual check in required.
	*
	* @return <code>true</code> if this file attachment is is manual check in required; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsManualCheckInRequired() {
		return _fileAttachment.isIsManualCheckInRequired();
	}

	/**
	* Sets whether this file attachment is is manual check in required.
	*
	* @param isManualCheckInRequired the is manual check in required of this file attachment
	*/
	@Override
	public void setIsManualCheckInRequired(boolean isManualCheckInRequired) {
		_fileAttachment.setIsManualCheckInRequired(isManualCheckInRequired);
	}

	/**
	* Returns the object type of this file attachment.
	*
	* @return the object type of this file attachment
	*/
	@Override
	public int getObjectType() {
		return _fileAttachment.getObjectType();
	}

	/**
	* Sets the object type of this file attachment.
	*
	* @param objectType the object type of this file attachment
	*/
	@Override
	public void setObjectType(int objectType) {
		_fileAttachment.setObjectType(objectType);
	}

	/**
	* Returns the object ID of this file attachment.
	*
	* @return the object ID of this file attachment
	*/
	@Override
	public long getObjectId() {
		return _fileAttachment.getObjectId();
	}

	/**
	* Sets the object ID of this file attachment.
	*
	* @param objectId the object ID of this file attachment
	*/
	@Override
	public void setObjectId(long objectId) {
		_fileAttachment.setObjectId(objectId);
	}

	/**
	* Returns the modified by ID of this file attachment.
	*
	* @return the modified by ID of this file attachment
	*/
	@Override
	public long getModifiedById() {
		return _fileAttachment.getModifiedById();
	}

	/**
	* Sets the modified by ID of this file attachment.
	*
	* @param modifiedById the modified by ID of this file attachment
	*/
	@Override
	public void setModifiedById(long modifiedById) {
		_fileAttachment.setModifiedById(modifiedById);
	}

	/**
	* Returns the modified date of this file attachment.
	*
	* @return the modified date of this file attachment
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _fileAttachment.getModifiedDate();
	}

	/**
	* Sets the modified date of this file attachment.
	*
	* @param modifiedDate the modified date of this file attachment
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_fileAttachment.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _fileAttachment.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_fileAttachment.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _fileAttachment.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_fileAttachment.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _fileAttachment.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _fileAttachment.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_fileAttachment.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _fileAttachment.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_fileAttachment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_fileAttachment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_fileAttachment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FileAttachmentWrapper((FileAttachment)_fileAttachment.clone());
	}

	@Override
	public int compareTo(
		com.viettel.ims.core.model.FileAttachment fileAttachment) {
		return _fileAttachment.compareTo(fileAttachment);
	}

	@Override
	public int hashCode() {
		return _fileAttachment.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.viettel.ims.core.model.FileAttachment> toCacheModel() {
		return _fileAttachment.toCacheModel();
	}

	@Override
	public com.viettel.ims.core.model.FileAttachment toEscapedModel() {
		return new FileAttachmentWrapper(_fileAttachment.toEscapedModel());
	}

	@Override
	public com.viettel.ims.core.model.FileAttachment toUnescapedModel() {
		return new FileAttachmentWrapper(_fileAttachment.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _fileAttachment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _fileAttachment.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_fileAttachment.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FileAttachmentWrapper)) {
			return false;
		}

		FileAttachmentWrapper fileAttachmentWrapper = (FileAttachmentWrapper)obj;

		if (Validator.equals(_fileAttachment,
					fileAttachmentWrapper._fileAttachment)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public FileAttachment getWrappedFileAttachment() {
		return _fileAttachment;
	}

	@Override
	public FileAttachment getWrappedModel() {
		return _fileAttachment;
	}

	@Override
	public void resetOriginalValues() {
		_fileAttachment.resetOriginalValues();
	}

	private FileAttachment _fileAttachment;
}
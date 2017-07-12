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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.viettel.ims.core.service.http.FileAttachmentServiceSoap}.
 *
 * @author MrNet
 * @see com.viettel.ims.core.service.http.FileAttachmentServiceSoap
 * @generated
 */
public class FileAttachmentSoap implements Serializable {
	public static FileAttachmentSoap toSoapModel(FileAttachment model) {
		FileAttachmentSoap soapModel = new FileAttachmentSoap();

		soapModel.setFileAttachmentId(model.getFileAttachmentId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setRepositoryId(model.getRepositoryId());
		soapModel.setFolderId(model.getFolderId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedById(model.getCreatedById());
		soapModel.setTreePath_(model.getTreePath_());
		soapModel.setName(model.getName());
		soapModel.setExtention(model.getExtention());
		soapModel.setMimeType(model.getMimeType());
		soapModel.setTitle(model.getTitle());
		soapModel.setDescription(model.getDescription());
		soapModel.setExtraSetting(model.getExtraSetting());
		soapModel.setFileTypeId(model.getFileTypeId());
		soapModel.setVersion(model.getVersion());
		soapModel.setSize_(model.getSize_());
		soapModel.setReadCount(model.getReadCount());
		soapModel.setSmallImageId(model.getSmallImageId());
		soapModel.setLargeImageId(model.getLargeImageId());
		soapModel.setCustom1Image(model.getCustom1Image());
		soapModel.setCustom2Image(model.getCustom2Image());
		soapModel.setIsManualCheckInRequired(model.getIsManualCheckInRequired());
		soapModel.setObjectType(model.getObjectType());
		soapModel.setObjectId(model.getObjectId());
		soapModel.setModifiedById(model.getModifiedById());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static FileAttachmentSoap[] toSoapModels(FileAttachment[] models) {
		FileAttachmentSoap[] soapModels = new FileAttachmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FileAttachmentSoap[][] toSoapModels(FileAttachment[][] models) {
		FileAttachmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FileAttachmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FileAttachmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FileAttachmentSoap[] toSoapModels(List<FileAttachment> models) {
		List<FileAttachmentSoap> soapModels = new ArrayList<FileAttachmentSoap>(models.size());

		for (FileAttachment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FileAttachmentSoap[soapModels.size()]);
	}

	public FileAttachmentSoap() {
	}

	public long getPrimaryKey() {
		return _fileAttachmentId;
	}

	public void setPrimaryKey(long pk) {
		setFileAttachmentId(pk);
	}

	public long getFileAttachmentId() {
		return _fileAttachmentId;
	}

	public void setFileAttachmentId(long fileAttachmentId) {
		_fileAttachmentId = fileAttachmentId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getRepositoryId() {
		return _repositoryId;
	}

	public void setRepositoryId(long repositoryId) {
		_repositoryId = repositoryId;
	}

	public long getFolderId() {
		return _folderId;
	}

	public void setFolderId(long folderId) {
		_folderId = folderId;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public long getCreatedById() {
		return _createdById;
	}

	public void setCreatedById(long createdById) {
		_createdById = createdById;
	}

	public String getTreePath_() {
		return _treePath_;
	}

	public void setTreePath_(String treePath_) {
		_treePath_ = treePath_;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getExtention() {
		return _extention;
	}

	public void setExtention(String extention) {
		_extention = extention;
	}

	public String getMimeType() {
		return _mimeType;
	}

	public void setMimeType(String mimeType) {
		_mimeType = mimeType;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getExtraSetting() {
		return _extraSetting;
	}

	public void setExtraSetting(String extraSetting) {
		_extraSetting = extraSetting;
	}

	public long getFileTypeId() {
		return _fileTypeId;
	}

	public void setFileTypeId(long fileTypeId) {
		_fileTypeId = fileTypeId;
	}

	public String getVersion() {
		return _version;
	}

	public void setVersion(String version) {
		_version = version;
	}

	public long getSize_() {
		return _size_;
	}

	public void setSize_(long size_) {
		_size_ = size_;
	}

	public int getReadCount() {
		return _readCount;
	}

	public void setReadCount(int readCount) {
		_readCount = readCount;
	}

	public long getSmallImageId() {
		return _smallImageId;
	}

	public void setSmallImageId(long smallImageId) {
		_smallImageId = smallImageId;
	}

	public long getLargeImageId() {
		return _largeImageId;
	}

	public void setLargeImageId(long largeImageId) {
		_largeImageId = largeImageId;
	}

	public long getCustom1Image() {
		return _custom1Image;
	}

	public void setCustom1Image(long custom1Image) {
		_custom1Image = custom1Image;
	}

	public long getCustom2Image() {
		return _custom2Image;
	}

	public void setCustom2Image(long custom2Image) {
		_custom2Image = custom2Image;
	}

	public boolean getIsManualCheckInRequired() {
		return _isManualCheckInRequired;
	}

	public boolean isIsManualCheckInRequired() {
		return _isManualCheckInRequired;
	}

	public void setIsManualCheckInRequired(boolean isManualCheckInRequired) {
		_isManualCheckInRequired = isManualCheckInRequired;
	}

	public int getObjectType() {
		return _objectType;
	}

	public void setObjectType(int objectType) {
		_objectType = objectType;
	}

	public long getObjectId() {
		return _objectId;
	}

	public void setObjectId(long objectId) {
		_objectId = objectId;
	}

	public long getModifiedById() {
		return _modifiedById;
	}

	public void setModifiedById(long modifiedById) {
		_modifiedById = modifiedById;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
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
}
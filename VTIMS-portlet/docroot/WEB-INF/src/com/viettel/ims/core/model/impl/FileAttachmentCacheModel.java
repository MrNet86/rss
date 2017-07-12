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

package com.viettel.ims.core.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.viettel.ims.core.model.FileAttachment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FileAttachment in entity cache.
 *
 * @author MrNet
 * @see FileAttachment
 * @generated
 */
public class FileAttachmentCacheModel implements CacheModel<FileAttachment>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{fileAttachmentId=");
		sb.append(fileAttachmentId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", repositoryId=");
		sb.append(repositoryId);
		sb.append(", folderId=");
		sb.append(folderId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdById=");
		sb.append(createdById);
		sb.append(", treePath_=");
		sb.append(treePath_);
		sb.append(", name=");
		sb.append(name);
		sb.append(", extention=");
		sb.append(extention);
		sb.append(", mimeType=");
		sb.append(mimeType);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", extraSetting=");
		sb.append(extraSetting);
		sb.append(", fileTypeId=");
		sb.append(fileTypeId);
		sb.append(", version=");
		sb.append(version);
		sb.append(", size_=");
		sb.append(size_);
		sb.append(", readCount=");
		sb.append(readCount);
		sb.append(", smallImageId=");
		sb.append(smallImageId);
		sb.append(", largeImageId=");
		sb.append(largeImageId);
		sb.append(", custom1Image=");
		sb.append(custom1Image);
		sb.append(", custom2Image=");
		sb.append(custom2Image);
		sb.append(", isManualCheckInRequired=");
		sb.append(isManualCheckInRequired);
		sb.append(", objectType=");
		sb.append(objectType);
		sb.append(", objectId=");
		sb.append(objectId);
		sb.append(", modifiedById=");
		sb.append(modifiedById);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FileAttachment toEntityModel() {
		FileAttachmentImpl fileAttachmentImpl = new FileAttachmentImpl();

		fileAttachmentImpl.setFileAttachmentId(fileAttachmentId);
		fileAttachmentImpl.setCompanyId(companyId);
		fileAttachmentImpl.setRepositoryId(repositoryId);
		fileAttachmentImpl.setFolderId(folderId);

		if (createdDate == Long.MIN_VALUE) {
			fileAttachmentImpl.setCreatedDate(null);
		}
		else {
			fileAttachmentImpl.setCreatedDate(new Date(createdDate));
		}

		fileAttachmentImpl.setCreatedById(createdById);

		if (treePath_ == null) {
			fileAttachmentImpl.setTreePath_(StringPool.BLANK);
		}
		else {
			fileAttachmentImpl.setTreePath_(treePath_);
		}

		if (name == null) {
			fileAttachmentImpl.setName(StringPool.BLANK);
		}
		else {
			fileAttachmentImpl.setName(name);
		}

		if (extention == null) {
			fileAttachmentImpl.setExtention(StringPool.BLANK);
		}
		else {
			fileAttachmentImpl.setExtention(extention);
		}

		if (mimeType == null) {
			fileAttachmentImpl.setMimeType(StringPool.BLANK);
		}
		else {
			fileAttachmentImpl.setMimeType(mimeType);
		}

		if (title == null) {
			fileAttachmentImpl.setTitle(StringPool.BLANK);
		}
		else {
			fileAttachmentImpl.setTitle(title);
		}

		if (description == null) {
			fileAttachmentImpl.setDescription(StringPool.BLANK);
		}
		else {
			fileAttachmentImpl.setDescription(description);
		}

		if (extraSetting == null) {
			fileAttachmentImpl.setExtraSetting(StringPool.BLANK);
		}
		else {
			fileAttachmentImpl.setExtraSetting(extraSetting);
		}

		fileAttachmentImpl.setFileTypeId(fileTypeId);

		if (version == null) {
			fileAttachmentImpl.setVersion(StringPool.BLANK);
		}
		else {
			fileAttachmentImpl.setVersion(version);
		}

		fileAttachmentImpl.setSize_(size_);
		fileAttachmentImpl.setReadCount(readCount);
		fileAttachmentImpl.setSmallImageId(smallImageId);
		fileAttachmentImpl.setLargeImageId(largeImageId);
		fileAttachmentImpl.setCustom1Image(custom1Image);
		fileAttachmentImpl.setCustom2Image(custom2Image);
		fileAttachmentImpl.setIsManualCheckInRequired(isManualCheckInRequired);
		fileAttachmentImpl.setObjectType(objectType);
		fileAttachmentImpl.setObjectId(objectId);
		fileAttachmentImpl.setModifiedById(modifiedById);

		if (modifiedDate == Long.MIN_VALUE) {
			fileAttachmentImpl.setModifiedDate(null);
		}
		else {
			fileAttachmentImpl.setModifiedDate(new Date(modifiedDate));
		}

		fileAttachmentImpl.resetOriginalValues();

		return fileAttachmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fileAttachmentId = objectInput.readLong();
		companyId = objectInput.readLong();
		repositoryId = objectInput.readLong();
		folderId = objectInput.readLong();
		createdDate = objectInput.readLong();
		createdById = objectInput.readLong();
		treePath_ = objectInput.readUTF();
		name = objectInput.readUTF();
		extention = objectInput.readUTF();
		mimeType = objectInput.readUTF();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
		extraSetting = objectInput.readUTF();
		fileTypeId = objectInput.readLong();
		version = objectInput.readUTF();
		size_ = objectInput.readLong();
		readCount = objectInput.readInt();
		smallImageId = objectInput.readLong();
		largeImageId = objectInput.readLong();
		custom1Image = objectInput.readLong();
		custom2Image = objectInput.readLong();
		isManualCheckInRequired = objectInput.readBoolean();
		objectType = objectInput.readInt();
		objectId = objectInput.readLong();
		modifiedById = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(fileAttachmentId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(repositoryId);
		objectOutput.writeLong(folderId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(createdById);

		if (treePath_ == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(treePath_);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (extention == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(extention);
		}

		if (mimeType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mimeType);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (extraSetting == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(extraSetting);
		}

		objectOutput.writeLong(fileTypeId);

		if (version == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(version);
		}

		objectOutput.writeLong(size_);
		objectOutput.writeInt(readCount);
		objectOutput.writeLong(smallImageId);
		objectOutput.writeLong(largeImageId);
		objectOutput.writeLong(custom1Image);
		objectOutput.writeLong(custom2Image);
		objectOutput.writeBoolean(isManualCheckInRequired);
		objectOutput.writeInt(objectType);
		objectOutput.writeLong(objectId);
		objectOutput.writeLong(modifiedById);
		objectOutput.writeLong(modifiedDate);
	}

	public long fileAttachmentId;
	public long companyId;
	public long repositoryId;
	public long folderId;
	public long createdDate;
	public long createdById;
	public String treePath_;
	public String name;
	public String extention;
	public String mimeType;
	public String title;
	public String description;
	public String extraSetting;
	public long fileTypeId;
	public String version;
	public long size_;
	public int readCount;
	public long smallImageId;
	public long largeImageId;
	public long custom1Image;
	public long custom2Image;
	public boolean isManualCheckInRequired;
	public int objectType;
	public long objectId;
	public long modifiedById;
	public long modifiedDate;
}
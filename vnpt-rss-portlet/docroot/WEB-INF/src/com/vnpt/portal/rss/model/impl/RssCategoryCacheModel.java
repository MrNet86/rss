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

package com.vnpt.portal.rss.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.vnpt.portal.rss.model.RssCategory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RssCategory in entity cache.
 *
 * @author MrNet
 * @see RssCategory
 * @generated
 */
public class RssCategoryCacheModel implements CacheModel<RssCategory>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{rssCategoryId=");
		sb.append(rssCategoryId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", status=");
		sb.append(status);
		sb.append(", createdId=");
		sb.append(createdId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RssCategory toEntityModel() {
		RssCategoryImpl rssCategoryImpl = new RssCategoryImpl();

		rssCategoryImpl.setRssCategoryId(rssCategoryId);
		rssCategoryImpl.setGroupId(groupId);
		rssCategoryImpl.setCompanyId(companyId);

		if (name == null) {
			rssCategoryImpl.setName(StringPool.BLANK);
		}
		else {
			rssCategoryImpl.setName(name);
		}

		if (description == null) {
			rssCategoryImpl.setDescription(StringPool.BLANK);
		}
		else {
			rssCategoryImpl.setDescription(description);
		}

		rssCategoryImpl.setStatus(status);
		rssCategoryImpl.setCreatedId(createdId);

		if (createdDate == Long.MIN_VALUE) {
			rssCategoryImpl.setCreatedDate(null);
		}
		else {
			rssCategoryImpl.setCreatedDate(new Date(createdDate));
		}

		rssCategoryImpl.resetOriginalValues();

		return rssCategoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		rssCategoryId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		status = objectInput.readInt();
		createdId = objectInput.readLong();
		createdDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(rssCategoryId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeInt(status);
		objectOutput.writeLong(createdId);
		objectOutput.writeLong(createdDate);
	}

	public long rssCategoryId;
	public long groupId;
	public long companyId;
	public String name;
	public String description;
	public int status;
	public long createdId;
	public long createdDate;
}
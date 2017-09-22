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

package com.vnpt.portlet.user.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.vnpt.portlet.user.model.ActIdInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ActIdInfo in entity cache.
 *
 * @author ToanNQ86
 * @see ActIdInfo
 * @generated
 */
public class ActIdInfoCacheModel implements CacheModel<ActIdInfo>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", rev=");
		sb.append(rev);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", type=");
		sb.append(type);
		sb.append(", key=");
		sb.append(key);
		sb.append(", value=");
		sb.append(value);
		sb.append(", password=");
		sb.append(password);
		sb.append(", parent_id_=");
		sb.append(parent_id_);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ActIdInfo toEntityModel() {
		ActIdInfoImpl actIdInfoImpl = new ActIdInfoImpl();

		actIdInfoImpl.setId(id);
		actIdInfoImpl.setRev(rev);

		if (userId == null) {
			actIdInfoImpl.setUserId(StringPool.BLANK);
		}
		else {
			actIdInfoImpl.setUserId(userId);
		}

		if (type == null) {
			actIdInfoImpl.setType(StringPool.BLANK);
		}
		else {
			actIdInfoImpl.setType(type);
		}

		if (key == null) {
			actIdInfoImpl.setKey(StringPool.BLANK);
		}
		else {
			actIdInfoImpl.setKey(key);
		}

		if (value == null) {
			actIdInfoImpl.setValue(StringPool.BLANK);
		}
		else {
			actIdInfoImpl.setValue(value);
		}

		if (password == null) {
			actIdInfoImpl.setPassword(StringPool.BLANK);
		}
		else {
			actIdInfoImpl.setPassword(password);
		}

		if (parent_id_ == null) {
			actIdInfoImpl.setParent_id_(StringPool.BLANK);
		}
		else {
			actIdInfoImpl.setParent_id_(parent_id_);
		}

		actIdInfoImpl.resetOriginalValues();

		return actIdInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		rev = objectInput.readLong();
		userId = objectInput.readUTF();
		type = objectInput.readUTF();
		key = objectInput.readUTF();
		value = objectInput.readUTF();
		password = objectInput.readUTF();
		parent_id_ = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(rev);

		if (userId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userId);
		}

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}

		if (key == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(key);
		}

		if (value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(value);
		}

		if (password == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(password);
		}

		if (parent_id_ == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(parent_id_);
		}
	}

	public long id;
	public long rev;
	public String userId;
	public String type;
	public String key;
	public String value;
	public String password;
	public String parent_id_;
}
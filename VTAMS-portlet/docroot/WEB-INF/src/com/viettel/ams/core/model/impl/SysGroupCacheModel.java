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

package com.viettel.ams.core.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.viettel.ams.core.model.SysGroup;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SysGroup in entity cache.
 *
 * @author MrNet
 * @see SysGroup
 * @generated
 */
public class SysGroupCacheModel implements CacheModel<SysGroup>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{groupId=");
		sb.append(groupId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", groupCode=");
		sb.append(groupCode);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", description=");
		sb.append(description);
		sb.append(", provinceId=");
		sb.append(provinceId);
		sb.append(", address=");
		sb.append(address);
		sb.append(", parentId=");
		sb.append(parentId);
		sb.append(", path=");
		sb.append(path);
		sb.append(", status=");
		sb.append(status);
		sb.append(", titleName=");
		sb.append(titleName);
		sb.append(", isOff=");
		sb.append(isOff);
		sb.append(", lockStatus=");
		sb.append(lockStatus);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SysGroup toEntityModel() {
		SysGroupImpl sysGroupImpl = new SysGroupImpl();

		sysGroupImpl.setGroupId(groupId);

		if (name == null) {
			sysGroupImpl.setName(StringPool.BLANK);
		}
		else {
			sysGroupImpl.setName(name);
		}

		if (groupCode == null) {
			sysGroupImpl.setGroupCode(StringPool.BLANK);
		}
		else {
			sysGroupImpl.setGroupCode(groupCode);
		}

		if (fullName == null) {
			sysGroupImpl.setFullName(StringPool.BLANK);
		}
		else {
			sysGroupImpl.setFullName(fullName);
		}

		if (description == null) {
			sysGroupImpl.setDescription(StringPool.BLANK);
		}
		else {
			sysGroupImpl.setDescription(description);
		}

		sysGroupImpl.setProvinceId(provinceId);

		if (address == null) {
			sysGroupImpl.setAddress(StringPool.BLANK);
		}
		else {
			sysGroupImpl.setAddress(address);
		}

		sysGroupImpl.setParentId(parentId);

		if (path == null) {
			sysGroupImpl.setPath(StringPool.BLANK);
		}
		else {
			sysGroupImpl.setPath(path);
		}

		sysGroupImpl.setStatus(status);
		sysGroupImpl.setTitleName(titleName);
		sysGroupImpl.setIsOff(isOff);
		sysGroupImpl.setLockStatus(lockStatus);

		sysGroupImpl.resetOriginalValues();

		return sysGroupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		groupId = objectInput.readLong();
		name = objectInput.readUTF();
		groupCode = objectInput.readUTF();
		fullName = objectInput.readUTF();
		description = objectInput.readUTF();
		provinceId = objectInput.readLong();
		address = objectInput.readUTF();
		parentId = objectInput.readLong();
		path = objectInput.readUTF();
		status = objectInput.readLong();
		titleName = objectInput.readLong();
		isOff = objectInput.readLong();
		lockStatus = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(groupId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (groupCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(groupCode);
		}

		if (fullName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(provinceId);

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		objectOutput.writeLong(parentId);

		if (path == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(path);
		}

		objectOutput.writeLong(status);
		objectOutput.writeLong(titleName);
		objectOutput.writeLong(isOff);
		objectOutput.writeLong(lockStatus);
	}

	public long groupId;
	public String name;
	public String groupCode;
	public String fullName;
	public String description;
	public Long provinceId;
	public String address;
	public Long parentId;
	public String path;
	public Long status;
	public Long titleName;
	public Long isOff;
	public Long lockStatus;
}
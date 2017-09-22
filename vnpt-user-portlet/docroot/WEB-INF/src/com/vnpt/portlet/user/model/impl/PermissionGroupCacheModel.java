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

import com.vnpt.portlet.user.model.PermissionGroup;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PermissionGroup in entity cache.
 *
 * @author ToanNQ86
 * @see PermissionGroup
 * @generated
 */
public class PermissionGroupCacheModel implements CacheModel<PermissionGroup>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{permissionGroupId=");
		sb.append(permissionGroupId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupName=");
		sb.append(groupName);
		sb.append(", groupCode=");
		sb.append(groupCode);
		sb.append(", isActive=");
		sb.append(isActive);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PermissionGroup toEntityModel() {
		PermissionGroupImpl permissionGroupImpl = new PermissionGroupImpl();

		permissionGroupImpl.setPermissionGroupId(permissionGroupId);
		permissionGroupImpl.setGroupId(groupId);
		permissionGroupImpl.setCompanyId(companyId);

		if (groupName == null) {
			permissionGroupImpl.setGroupName(StringPool.BLANK);
		}
		else {
			permissionGroupImpl.setGroupName(groupName);
		}

		if (groupCode == null) {
			permissionGroupImpl.setGroupCode(StringPool.BLANK);
		}
		else {
			permissionGroupImpl.setGroupCode(groupCode);
		}

		permissionGroupImpl.setIsActive(isActive);

		if (description == null) {
			permissionGroupImpl.setDescription(StringPool.BLANK);
		}
		else {
			permissionGroupImpl.setDescription(description);
		}

		permissionGroupImpl.resetOriginalValues();

		return permissionGroupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		permissionGroupId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupName = objectInput.readUTF();
		groupCode = objectInput.readUTF();
		isActive = objectInput.readInt();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(permissionGroupId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);

		if (groupName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(groupName);
		}

		if (groupCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(groupCode);
		}

		objectOutput.writeInt(isActive);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long permissionGroupId;
	public long groupId;
	public long companyId;
	public String groupName;
	public String groupCode;
	public int isActive;
	public String description;
}
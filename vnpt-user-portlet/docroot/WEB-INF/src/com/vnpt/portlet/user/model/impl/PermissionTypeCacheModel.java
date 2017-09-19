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

import com.vnpt.portlet.user.model.PermissionType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PermissionType in entity cache.
 *
 * @author ToanNQ86
 * @see PermissionType
 * @generated
 */
public class PermissionTypeCacheModel implements CacheModel<PermissionType>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{permissionTypeId=");
		sb.append(permissionTypeId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", typeName=");
		sb.append(typeName);
		sb.append(", typeCode=");
		sb.append(typeCode);
		sb.append(", isActive=");
		sb.append(isActive);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PermissionType toEntityModel() {
		PermissionTypeImpl permissionTypeImpl = new PermissionTypeImpl();

		permissionTypeImpl.setPermissionTypeId(permissionTypeId);
		permissionTypeImpl.setGroupId(groupId);
		permissionTypeImpl.setCompanyId(companyId);

		if (typeName == null) {
			permissionTypeImpl.setTypeName(StringPool.BLANK);
		}
		else {
			permissionTypeImpl.setTypeName(typeName);
		}

		if (typeCode == null) {
			permissionTypeImpl.setTypeCode(StringPool.BLANK);
		}
		else {
			permissionTypeImpl.setTypeCode(typeCode);
		}

		permissionTypeImpl.setIsActive(isActive);

		if (description == null) {
			permissionTypeImpl.setDescription(StringPool.BLANK);
		}
		else {
			permissionTypeImpl.setDescription(description);
		}

		permissionTypeImpl.resetOriginalValues();

		return permissionTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		permissionTypeId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		typeName = objectInput.readUTF();
		typeCode = objectInput.readUTF();
		isActive = objectInput.readInt();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(permissionTypeId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);

		if (typeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(typeName);
		}

		if (typeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(typeCode);
		}

		objectOutput.writeInt(isActive);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long permissionTypeId;
	public long groupId;
	public long companyId;
	public String typeName;
	public String typeCode;
	public int isActive;
	public String description;
}
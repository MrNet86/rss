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
import com.liferay.portal.model.CacheModel;

import com.vnpt.portlet.user.model.GroupRoles;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing GroupRoles in entity cache.
 *
 * @author ToanNQ86
 * @see GroupRoles
 * @generated
 */
public class GroupRolesCacheModel implements CacheModel<GroupRoles>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{permissionGroupId=");
		sb.append(permissionGroupId);
		sb.append(", roleId=");
		sb.append(roleId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public GroupRoles toEntityModel() {
		GroupRolesImpl groupRolesImpl = new GroupRolesImpl();

		groupRolesImpl.setPermissionGroupId(permissionGroupId);
		groupRolesImpl.setRoleId(roleId);

		groupRolesImpl.resetOriginalValues();

		return groupRolesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		permissionGroupId = objectInput.readLong();
		roleId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(permissionGroupId);
		objectOutput.writeLong(roleId);
	}

	public long permissionGroupId;
	public long roleId;
}
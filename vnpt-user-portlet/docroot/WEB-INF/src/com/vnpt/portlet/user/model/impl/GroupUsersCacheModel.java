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

import com.vnpt.portlet.user.model.GroupUsers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing GroupUsers in entity cache.
 *
 * @author ToanNQ86
 * @see GroupUsers
 * @generated
 */
public class GroupUsersCacheModel implements CacheModel<GroupUsers>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{permissionGroupId=");
		sb.append(permissionGroupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public GroupUsers toEntityModel() {
		GroupUsersImpl groupUsersImpl = new GroupUsersImpl();

		groupUsersImpl.setPermissionGroupId(permissionGroupId);
		groupUsersImpl.setUserId(userId);

		groupUsersImpl.resetOriginalValues();

		return groupUsersImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		permissionGroupId = objectInput.readLong();
		userId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(permissionGroupId);
		objectOutput.writeLong(userId);
	}

	public long permissionGroupId;
	public long userId;
}
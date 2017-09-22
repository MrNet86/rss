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

import com.vnpt.portlet.user.model.ActIdMembership;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ActIdMembership in entity cache.
 *
 * @author ToanNQ86
 * @see ActIdMembership
 * @generated
 */
public class ActIdMembershipCacheModel implements CacheModel<ActIdMembership>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ActIdMembership toEntityModel() {
		ActIdMembershipImpl actIdMembershipImpl = new ActIdMembershipImpl();

		actIdMembershipImpl.setUserId(userId);
		actIdMembershipImpl.setGroupId(groupId);

		actIdMembershipImpl.resetOriginalValues();

		return actIdMembershipImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
	}

	public long userId;
	public long groupId;
}
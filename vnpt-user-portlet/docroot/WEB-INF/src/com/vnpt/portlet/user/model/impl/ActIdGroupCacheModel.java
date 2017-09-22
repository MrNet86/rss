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

import com.vnpt.portlet.user.model.ActIdGroup;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ActIdGroup in entity cache.
 *
 * @author ToanNQ86
 * @see ActIdGroup
 * @generated
 */
public class ActIdGroupCacheModel implements CacheModel<ActIdGroup>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", rev=");
		sb.append(rev);
		sb.append(", name=");
		sb.append(name);
		sb.append(", type=");
		sb.append(type);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ActIdGroup toEntityModel() {
		ActIdGroupImpl actIdGroupImpl = new ActIdGroupImpl();

		if (id == null) {
			actIdGroupImpl.setId(StringPool.BLANK);
		}
		else {
			actIdGroupImpl.setId(id);
		}

		actIdGroupImpl.setRev(rev);

		if (name == null) {
			actIdGroupImpl.setName(StringPool.BLANK);
		}
		else {
			actIdGroupImpl.setName(name);
		}

		if (type == null) {
			actIdGroupImpl.setType(StringPool.BLANK);
		}
		else {
			actIdGroupImpl.setType(type);
		}

		actIdGroupImpl.resetOriginalValues();

		return actIdGroupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readUTF();
		rev = objectInput.readLong();
		name = objectInput.readUTF();
		type = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (id == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(id);
		}

		objectOutput.writeLong(rev);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}
	}

	public String id;
	public long rev;
	public String name;
	public String type;
}
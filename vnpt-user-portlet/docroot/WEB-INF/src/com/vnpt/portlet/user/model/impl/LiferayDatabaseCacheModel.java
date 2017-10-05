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

import com.vnpt.portlet.user.model.LiferayDatabase;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LiferayDatabase in entity cache.
 *
 * @author ToanNQ86
 * @see LiferayDatabase
 * @generated
 */
public class LiferayDatabaseCacheModel implements CacheModel<LiferayDatabase>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{itemFieldId=");
		sb.append(itemFieldId);
		sb.append(", itemId=");
		sb.append(itemId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", values=");
		sb.append(values);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LiferayDatabase toEntityModel() {
		LiferayDatabaseImpl liferayDatabaseImpl = new LiferayDatabaseImpl();

		liferayDatabaseImpl.setItemFieldId(itemFieldId);
		liferayDatabaseImpl.setItemId(itemId);

		if (name == null) {
			liferayDatabaseImpl.setName(StringPool.BLANK);
		}
		else {
			liferayDatabaseImpl.setName(name);
		}

		if (values == null) {
			liferayDatabaseImpl.setValues(StringPool.BLANK);
		}
		else {
			liferayDatabaseImpl.setValues(values);
		}

		if (description == null) {
			liferayDatabaseImpl.setDescription(StringPool.BLANK);
		}
		else {
			liferayDatabaseImpl.setDescription(description);
		}

		liferayDatabaseImpl.resetOriginalValues();

		return liferayDatabaseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		itemFieldId = objectInput.readLong();
		itemId = objectInput.readLong();
		name = objectInput.readUTF();
		values = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(itemFieldId);
		objectOutput.writeLong(itemId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (values == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(values);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long itemFieldId;
	public long itemId;
	public String name;
	public String values;
	public String description;
}
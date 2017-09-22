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

import com.vnpt.portlet.user.model.ActIdUser;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ActIdUser in entity cache.
 *
 * @author ToanNQ86
 * @see ActIdUser
 * @generated
 */
public class ActIdUserCacheModel implements CacheModel<ActIdUser>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", rev=");
		sb.append(rev);
		sb.append(", first=");
		sb.append(first);
		sb.append(", last=");
		sb.append(last);
		sb.append(", email=");
		sb.append(email);
		sb.append(", pwd=");
		sb.append(pwd);
		sb.append(", pictureId=");
		sb.append(pictureId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ActIdUser toEntityModel() {
		ActIdUserImpl actIdUserImpl = new ActIdUserImpl();

		if (id == null) {
			actIdUserImpl.setId(StringPool.BLANK);
		}
		else {
			actIdUserImpl.setId(id);
		}

		actIdUserImpl.setRev(rev);

		if (first == null) {
			actIdUserImpl.setFirst(StringPool.BLANK);
		}
		else {
			actIdUserImpl.setFirst(first);
		}

		if (last == null) {
			actIdUserImpl.setLast(StringPool.BLANK);
		}
		else {
			actIdUserImpl.setLast(last);
		}

		if (email == null) {
			actIdUserImpl.setEmail(StringPool.BLANK);
		}
		else {
			actIdUserImpl.setEmail(email);
		}

		if (pwd == null) {
			actIdUserImpl.setPwd(StringPool.BLANK);
		}
		else {
			actIdUserImpl.setPwd(pwd);
		}

		if (pictureId == null) {
			actIdUserImpl.setPictureId(StringPool.BLANK);
		}
		else {
			actIdUserImpl.setPictureId(pictureId);
		}

		actIdUserImpl.resetOriginalValues();

		return actIdUserImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readUTF();
		rev = objectInput.readLong();
		first = objectInput.readUTF();
		last = objectInput.readUTF();
		email = objectInput.readUTF();
		pwd = objectInput.readUTF();
		pictureId = objectInput.readUTF();
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

		if (first == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(first);
		}

		if (last == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(last);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (pwd == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(pwd);
		}

		if (pictureId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(pictureId);
		}
	}

	public String id;
	public long rev;
	public String first;
	public String last;
	public String email;
	public String pwd;
	public String pictureId;
}
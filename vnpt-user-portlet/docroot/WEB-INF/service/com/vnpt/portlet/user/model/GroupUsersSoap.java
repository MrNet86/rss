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

package com.vnpt.portlet.user.model;

import com.vnpt.portlet.user.service.persistence.GroupUsersPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author ToanNQ86
 * @generated
 */
public class GroupUsersSoap implements Serializable {
	public static GroupUsersSoap toSoapModel(GroupUsers model) {
		GroupUsersSoap soapModel = new GroupUsersSoap();

		soapModel.setPermissionGroupId(model.getPermissionGroupId());
		soapModel.setUserId(model.getUserId());

		return soapModel;
	}

	public static GroupUsersSoap[] toSoapModels(GroupUsers[] models) {
		GroupUsersSoap[] soapModels = new GroupUsersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static GroupUsersSoap[][] toSoapModels(GroupUsers[][] models) {
		GroupUsersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new GroupUsersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new GroupUsersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static GroupUsersSoap[] toSoapModels(List<GroupUsers> models) {
		List<GroupUsersSoap> soapModels = new ArrayList<GroupUsersSoap>(models.size());

		for (GroupUsers model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new GroupUsersSoap[soapModels.size()]);
	}

	public GroupUsersSoap() {
	}

	public GroupUsersPK getPrimaryKey() {
		return new GroupUsersPK(_permissionGroupId, _userId);
	}

	public void setPrimaryKey(GroupUsersPK pk) {
		setPermissionGroupId(pk.permissionGroupId);
		setUserId(pk.userId);
	}

	public long getPermissionGroupId() {
		return _permissionGroupId;
	}

	public void setPermissionGroupId(long permissionGroupId) {
		_permissionGroupId = permissionGroupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	private long _permissionGroupId;
	private long _userId;
}
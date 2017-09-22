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

import com.vnpt.portlet.user.service.persistence.GroupRolesPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author ToanNQ86
 * @generated
 */
public class GroupRolesSoap implements Serializable {
	public static GroupRolesSoap toSoapModel(GroupRoles model) {
		GroupRolesSoap soapModel = new GroupRolesSoap();

		soapModel.setPermissionGroupId(model.getPermissionGroupId());
		soapModel.setRoleId(model.getRoleId());

		return soapModel;
	}

	public static GroupRolesSoap[] toSoapModels(GroupRoles[] models) {
		GroupRolesSoap[] soapModels = new GroupRolesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static GroupRolesSoap[][] toSoapModels(GroupRoles[][] models) {
		GroupRolesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new GroupRolesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new GroupRolesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static GroupRolesSoap[] toSoapModels(List<GroupRoles> models) {
		List<GroupRolesSoap> soapModels = new ArrayList<GroupRolesSoap>(models.size());

		for (GroupRoles model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new GroupRolesSoap[soapModels.size()]);
	}

	public GroupRolesSoap() {
	}

	public GroupRolesPK getPrimaryKey() {
		return new GroupRolesPK(_permissionGroupId, _roleId);
	}

	public void setPrimaryKey(GroupRolesPK pk) {
		setPermissionGroupId(pk.permissionGroupId);
		setRoleId(pk.roleId);
	}

	public long getPermissionGroupId() {
		return _permissionGroupId;
	}

	public void setPermissionGroupId(long permissionGroupId) {
		_permissionGroupId = permissionGroupId;
	}

	public long getRoleId() {
		return _roleId;
	}

	public void setRoleId(long roleId) {
		_roleId = roleId;
	}

	private long _permissionGroupId;
	private long _roleId;
}
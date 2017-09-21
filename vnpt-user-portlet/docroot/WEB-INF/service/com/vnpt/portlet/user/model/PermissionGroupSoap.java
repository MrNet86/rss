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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author ToanNQ86
 * @generated
 */
public class PermissionGroupSoap implements Serializable {
	public static PermissionGroupSoap toSoapModel(PermissionGroup model) {
		PermissionGroupSoap soapModel = new PermissionGroupSoap();

		soapModel.setPermissionGroupId(model.getPermissionGroupId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupName(model.getGroupName());
		soapModel.setGroupCode(model.getGroupCode());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setDescription(model.getDescription());
		soapModel.setRoleId(model.getRoleId());

		return soapModel;
	}

	public static PermissionGroupSoap[] toSoapModels(PermissionGroup[] models) {
		PermissionGroupSoap[] soapModels = new PermissionGroupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PermissionGroupSoap[][] toSoapModels(
		PermissionGroup[][] models) {
		PermissionGroupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PermissionGroupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PermissionGroupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PermissionGroupSoap[] toSoapModels(
		List<PermissionGroup> models) {
		List<PermissionGroupSoap> soapModels = new ArrayList<PermissionGroupSoap>(models.size());

		for (PermissionGroup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PermissionGroupSoap[soapModels.size()]);
	}

	public PermissionGroupSoap() {
	}

	public long getPrimaryKey() {
		return _permissionGroupId;
	}

	public void setPrimaryKey(long pk) {
		setPermissionGroupId(pk);
	}

	public long getPermissionGroupId() {
		return _permissionGroupId;
	}

	public void setPermissionGroupId(long permissionGroupId) {
		_permissionGroupId = permissionGroupId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public String getGroupName() {
		return _groupName;
	}

	public void setGroupName(String groupName) {
		_groupName = groupName;
	}

	public String getGroupCode() {
		return _groupCode;
	}

	public void setGroupCode(String groupCode) {
		_groupCode = groupCode;
	}

	public int getIsActive() {
		return _isActive;
	}

	public void setIsActive(int isActive) {
		_isActive = isActive;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getRoleId() {
		return _roleId;
	}

	public void setRoleId(long roleId) {
		_roleId = roleId;
	}

	private long _permissionGroupId;
	private long _groupId;
	private long _companyId;
	private String _groupName;
	private String _groupCode;
	private int _isActive;
	private String _description;
	private long _roleId;
}
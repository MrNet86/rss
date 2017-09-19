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
public class PermissionTypeSoap implements Serializable {
	public static PermissionTypeSoap toSoapModel(PermissionType model) {
		PermissionTypeSoap soapModel = new PermissionTypeSoap();

		soapModel.setPermissionTypeId(model.getPermissionTypeId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setTypeName(model.getTypeName());
		soapModel.setTypeCode(model.getTypeCode());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static PermissionTypeSoap[] toSoapModels(PermissionType[] models) {
		PermissionTypeSoap[] soapModels = new PermissionTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PermissionTypeSoap[][] toSoapModels(PermissionType[][] models) {
		PermissionTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PermissionTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PermissionTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PermissionTypeSoap[] toSoapModels(List<PermissionType> models) {
		List<PermissionTypeSoap> soapModels = new ArrayList<PermissionTypeSoap>(models.size());

		for (PermissionType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PermissionTypeSoap[soapModels.size()]);
	}

	public PermissionTypeSoap() {
	}

	public long getPrimaryKey() {
		return _permissionTypeId;
	}

	public void setPrimaryKey(long pk) {
		setPermissionTypeId(pk);
	}

	public long getPermissionTypeId() {
		return _permissionTypeId;
	}

	public void setPermissionTypeId(long permissionTypeId) {
		_permissionTypeId = permissionTypeId;
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

	public String getTypeName() {
		return _typeName;
	}

	public void setTypeName(String typeName) {
		_typeName = typeName;
	}

	public String getTypeCode() {
		return _typeCode;
	}

	public void setTypeCode(String typeCode) {
		_typeCode = typeCode;
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

	private long _permissionTypeId;
	private long _groupId;
	private long _companyId;
	private String _typeName;
	private String _typeCode;
	private int _isActive;
	private String _description;
}
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

package com.viettel.ams.core.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.viettel.ams.core.service.http.SysGroupServiceSoap}.
 *
 * @author MrNet
 * @see com.viettel.ams.core.service.http.SysGroupServiceSoap
 * @generated
 */
public class SysGroupSoap implements Serializable {
	public static SysGroupSoap toSoapModel(SysGroup model) {
		SysGroupSoap soapModel = new SysGroupSoap();

		soapModel.setGroupId(model.getGroupId());
		soapModel.setName(model.getName());
		soapModel.setGroupCode(model.getGroupCode());
		soapModel.setFullName(model.getFullName());
		soapModel.setDescription(model.getDescription());
		soapModel.setProvinceId(model.getProvinceId());
		soapModel.setAddress(model.getAddress());
		soapModel.setParentId(model.getParentId());
		soapModel.setPath(model.getPath());
		soapModel.setStatus(model.getStatus());
		soapModel.setTitleName(model.getTitleName());
		soapModel.setIsOff(model.getIsOff());
		soapModel.setLockStatus(model.getLockStatus());

		return soapModel;
	}

	public static SysGroupSoap[] toSoapModels(SysGroup[] models) {
		SysGroupSoap[] soapModels = new SysGroupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SysGroupSoap[][] toSoapModels(SysGroup[][] models) {
		SysGroupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SysGroupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SysGroupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SysGroupSoap[] toSoapModels(List<SysGroup> models) {
		List<SysGroupSoap> soapModels = new ArrayList<SysGroupSoap>(models.size());

		for (SysGroup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SysGroupSoap[soapModels.size()]);
	}

	public SysGroupSoap() {
	}

	public long getPrimaryKey() {
		return _groupId;
	}

	public void setPrimaryKey(long pk) {
		setGroupId(pk);
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getGroupCode() {
		return _groupCode;
	}

	public void setGroupCode(String groupCode) {
		_groupCode = groupCode;
	}

	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Long getProvinceId() {
		return _provinceId;
	}

	public void setProvinceId(Long provinceId) {
		_provinceId = provinceId;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public Long getParentId() {
		return _parentId;
	}

	public void setParentId(Long parentId) {
		_parentId = parentId;
	}

	public String getPath() {
		return _path;
	}

	public void setPath(String path) {
		_path = path;
	}

	public Long getStatus() {
		return _status;
	}

	public void setStatus(Long status) {
		_status = status;
	}

	public Long getTitleName() {
		return _titleName;
	}

	public void setTitleName(Long titleName) {
		_titleName = titleName;
	}

	public Long getIsOff() {
		return _isOff;
	}

	public void setIsOff(Long isOff) {
		_isOff = isOff;
	}

	public Long getLockStatus() {
		return _lockStatus;
	}

	public void setLockStatus(Long lockStatus) {
		_lockStatus = lockStatus;
	}

	private long _groupId;
	private String _name;
	private String _groupCode;
	private String _fullName;
	private String _description;
	private Long _provinceId;
	private String _address;
	private Long _parentId;
	private String _path;
	private Long _status;
	private Long _titleName;
	private Long _isOff;
	private Long _lockStatus;
}
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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.viettel.ams.core.service.ClpSerializer;
import com.viettel.ams.core.service.SysGroupLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MrNet
 */
public class SysGroupClp extends BaseModelImpl<SysGroup> implements SysGroup {
	public SysGroupClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return SysGroup.class;
	}

	@Override
	public String getModelClassName() {
		return SysGroup.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _groupId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setGroupId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _groupId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("groupId", getGroupId());
		attributes.put("name", getName());
		attributes.put("groupCode", getGroupCode());
		attributes.put("fullName", getFullName());
		attributes.put("description", getDescription());
		attributes.put("provinceId", getProvinceId());
		attributes.put("address", getAddress());
		attributes.put("parentId", getParentId());
		attributes.put("path", getPath());
		attributes.put("status", getStatus());
		attributes.put("titleName", getTitleName());
		attributes.put("isOff", getIsOff());
		attributes.put("lockStatus", getLockStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String groupCode = (String)attributes.get("groupCode");

		if (groupCode != null) {
			setGroupCode(groupCode);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long provinceId = (Long)attributes.get("provinceId");

		if (provinceId != null) {
			setProvinceId(provinceId);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		Long parentId = (Long)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}

		String path = (String)attributes.get("path");

		if (path != null) {
			setPath(path);
		}

		Long status = (Long)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long titleName = (Long)attributes.get("titleName");

		if (titleName != null) {
			setTitleName(titleName);
		}

		Long isOff = (Long)attributes.get("isOff");

		if (isOff != null) {
			setIsOff(isOff);
		}

		Long lockStatus = (Long)attributes.get("lockStatus");

		if (lockStatus != null) {
			setLockStatus(lockStatus);
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_sysGroupRemoteModel != null) {
			try {
				Class<?> clazz = _sysGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_sysGroupRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_sysGroupRemoteModel != null) {
			try {
				Class<?> clazz = _sysGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_sysGroupRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGroupCode() {
		return _groupCode;
	}

	@Override
	public void setGroupCode(String groupCode) {
		_groupCode = groupCode;

		if (_sysGroupRemoteModel != null) {
			try {
				Class<?> clazz = _sysGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupCode", String.class);

				method.invoke(_sysGroupRemoteModel, groupCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFullName() {
		return _fullName;
	}

	@Override
	public void setFullName(String fullName) {
		_fullName = fullName;

		if (_sysGroupRemoteModel != null) {
			try {
				Class<?> clazz = _sysGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setFullName", String.class);

				method.invoke(_sysGroupRemoteModel, fullName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_sysGroupRemoteModel != null) {
			try {
				Class<?> clazz = _sysGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_sysGroupRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getProvinceId() {
		return _provinceId;
	}

	@Override
	public void setProvinceId(Long provinceId) {
		_provinceId = provinceId;

		if (_sysGroupRemoteModel != null) {
			try {
				Class<?> clazz = _sysGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setProvinceId", Long.class);

				method.invoke(_sysGroupRemoteModel, provinceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddress() {
		return _address;
	}

	@Override
	public void setAddress(String address) {
		_address = address;

		if (_sysGroupRemoteModel != null) {
			try {
				Class<?> clazz = _sysGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_sysGroupRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getParentId() {
		return _parentId;
	}

	@Override
	public void setParentId(Long parentId) {
		_parentId = parentId;

		if (_sysGroupRemoteModel != null) {
			try {
				Class<?> clazz = _sysGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setParentId", Long.class);

				method.invoke(_sysGroupRemoteModel, parentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPath() {
		return _path;
	}

	@Override
	public void setPath(String path) {
		_path = path;

		if (_sysGroupRemoteModel != null) {
			try {
				Class<?> clazz = _sysGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setPath", String.class);

				method.invoke(_sysGroupRemoteModel, path);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getStatus() {
		return _status;
	}

	@Override
	public void setStatus(Long status) {
		_status = status;

		if (_sysGroupRemoteModel != null) {
			try {
				Class<?> clazz = _sysGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", Long.class);

				method.invoke(_sysGroupRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getTitleName() {
		return _titleName;
	}

	@Override
	public void setTitleName(Long titleName) {
		_titleName = titleName;

		if (_sysGroupRemoteModel != null) {
			try {
				Class<?> clazz = _sysGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setTitleName", Long.class);

				method.invoke(_sysGroupRemoteModel, titleName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getIsOff() {
		return _isOff;
	}

	@Override
	public void setIsOff(Long isOff) {
		_isOff = isOff;

		if (_sysGroupRemoteModel != null) {
			try {
				Class<?> clazz = _sysGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setIsOff", Long.class);

				method.invoke(_sysGroupRemoteModel, isOff);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getLockStatus() {
		return _lockStatus;
	}

	@Override
	public void setLockStatus(Long lockStatus) {
		_lockStatus = lockStatus;

		if (_sysGroupRemoteModel != null) {
			try {
				Class<?> clazz = _sysGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setLockStatus", Long.class);

				method.invoke(_sysGroupRemoteModel, lockStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSysGroupRemoteModel() {
		return _sysGroupRemoteModel;
	}

	public void setSysGroupRemoteModel(BaseModel<?> sysGroupRemoteModel) {
		_sysGroupRemoteModel = sysGroupRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _sysGroupRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_sysGroupRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SysGroupLocalServiceUtil.addSysGroup(this);
		}
		else {
			SysGroupLocalServiceUtil.updateSysGroup(this);
		}
	}

	@Override
	public SysGroup toEscapedModel() {
		return (SysGroup)ProxyUtil.newProxyInstance(SysGroup.class.getClassLoader(),
			new Class[] { SysGroup.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SysGroupClp clone = new SysGroupClp();

		clone.setGroupId(getGroupId());
		clone.setName(getName());
		clone.setGroupCode(getGroupCode());
		clone.setFullName(getFullName());
		clone.setDescription(getDescription());
		clone.setProvinceId(getProvinceId());
		clone.setAddress(getAddress());
		clone.setParentId(getParentId());
		clone.setPath(getPath());
		clone.setStatus(getStatus());
		clone.setTitleName(getTitleName());
		clone.setIsOff(getIsOff());
		clone.setLockStatus(getLockStatus());

		return clone;
	}

	@Override
	public int compareTo(SysGroup sysGroup) {
		int value = 0;

		value = getGroupCode().compareTo(sysGroup.getGroupCode());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SysGroupClp)) {
			return false;
		}

		SysGroupClp sysGroup = (SysGroupClp)obj;

		long primaryKey = sysGroup.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{groupId=");
		sb.append(getGroupId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", groupCode=");
		sb.append(getGroupCode());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", provinceId=");
		sb.append(getProvinceId());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", parentId=");
		sb.append(getParentId());
		sb.append(", path=");
		sb.append(getPath());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", titleName=");
		sb.append(getTitleName());
		sb.append(", isOff=");
		sb.append(getIsOff());
		sb.append(", lockStatus=");
		sb.append(getLockStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.viettel.ams.core.model.SysGroup");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupCode</column-name><column-value><![CDATA[");
		sb.append(getGroupCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>provinceId</column-name><column-value><![CDATA[");
		sb.append(getProvinceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentId</column-name><column-value><![CDATA[");
		sb.append(getParentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>path</column-name><column-value><![CDATA[");
		sb.append(getPath());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>titleName</column-name><column-value><![CDATA[");
		sb.append(getTitleName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isOff</column-name><column-value><![CDATA[");
		sb.append(getIsOff());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lockStatus</column-name><column-value><![CDATA[");
		sb.append(getLockStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _sysGroupRemoteModel;
	private Class<?> _clpSerializerClass = com.viettel.ams.core.service.ClpSerializer.class;
}
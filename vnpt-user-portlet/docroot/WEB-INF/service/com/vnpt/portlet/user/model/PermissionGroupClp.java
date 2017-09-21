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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.vnpt.portlet.user.service.ClpSerializer;
import com.vnpt.portlet.user.service.PermissionGroupLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ToanNQ86
 */
public class PermissionGroupClp extends BaseModelImpl<PermissionGroup>
	implements PermissionGroup {
	public PermissionGroupClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PermissionGroup.class;
	}

	@Override
	public String getModelClassName() {
		return PermissionGroup.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _permissionGroupId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPermissionGroupId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _permissionGroupId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("permissionGroupId", getPermissionGroupId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupName", getGroupName());
		attributes.put("groupCode", getGroupCode());
		attributes.put("isActive", getIsActive());
		attributes.put("description", getDescription());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long permissionGroupId = (Long)attributes.get("permissionGroupId");

		if (permissionGroupId != null) {
			setPermissionGroupId(permissionGroupId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String groupName = (String)attributes.get("groupName");

		if (groupName != null) {
			setGroupName(groupName);
		}

		String groupCode = (String)attributes.get("groupCode");

		if (groupCode != null) {
			setGroupCode(groupCode);
		}

		Integer isActive = (Integer)attributes.get("isActive");

		if (isActive != null) {
			setIsActive(isActive);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	@Override
	public long getPermissionGroupId() {
		return _permissionGroupId;
	}

	@Override
	public void setPermissionGroupId(long permissionGroupId) {
		_permissionGroupId = permissionGroupId;

		if (_permissionGroupRemoteModel != null) {
			try {
				Class<?> clazz = _permissionGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setPermissionGroupId",
						long.class);

				method.invoke(_permissionGroupRemoteModel, permissionGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_permissionGroupRemoteModel != null) {
			try {
				Class<?> clazz = _permissionGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_permissionGroupRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_permissionGroupRemoteModel != null) {
			try {
				Class<?> clazz = _permissionGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_permissionGroupRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGroupName() {
		return _groupName;
	}

	@Override
	public void setGroupName(String groupName) {
		_groupName = groupName;

		if (_permissionGroupRemoteModel != null) {
			try {
				Class<?> clazz = _permissionGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupName", String.class);

				method.invoke(_permissionGroupRemoteModel, groupName);
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

		if (_permissionGroupRemoteModel != null) {
			try {
				Class<?> clazz = _permissionGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupCode", String.class);

				method.invoke(_permissionGroupRemoteModel, groupCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsActive() {
		return _isActive;
	}

	@Override
	public void setIsActive(int isActive) {
		_isActive = isActive;

		if (_permissionGroupRemoteModel != null) {
			try {
				Class<?> clazz = _permissionGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", int.class);

				method.invoke(_permissionGroupRemoteModel, isActive);
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

		if (_permissionGroupRemoteModel != null) {
			try {
				Class<?> clazz = _permissionGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_permissionGroupRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRoleId() {
		return _roleId;
	}

	@Override
	public void setRoleId(long roleId) {
		_roleId = roleId;

		if (_permissionGroupRemoteModel != null) {
			try {
				Class<?> clazz = _permissionGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setRoleId", long.class);

				method.invoke(_permissionGroupRemoteModel, roleId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPermissionGroupRemoteModel() {
		return _permissionGroupRemoteModel;
	}

	public void setPermissionGroupRemoteModel(
		BaseModel<?> permissionGroupRemoteModel) {
		_permissionGroupRemoteModel = permissionGroupRemoteModel;
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

		Class<?> remoteModelClass = _permissionGroupRemoteModel.getClass();

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

		Object returnValue = method.invoke(_permissionGroupRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PermissionGroupLocalServiceUtil.addPermissionGroup(this);
		}
		else {
			PermissionGroupLocalServiceUtil.updatePermissionGroup(this);
		}
	}

	@Override
	public PermissionGroup toEscapedModel() {
		return (PermissionGroup)ProxyUtil.newProxyInstance(PermissionGroup.class.getClassLoader(),
			new Class[] { PermissionGroup.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PermissionGroupClp clone = new PermissionGroupClp();

		clone.setPermissionGroupId(getPermissionGroupId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupName(getGroupName());
		clone.setGroupCode(getGroupCode());
		clone.setIsActive(getIsActive());
		clone.setDescription(getDescription());
		clone.setRoleId(getRoleId());

		return clone;
	}

	@Override
	public int compareTo(PermissionGroup permissionGroup) {
		long primaryKey = permissionGroup.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PermissionGroupClp)) {
			return false;
		}

		PermissionGroupClp permissionGroup = (PermissionGroupClp)obj;

		long primaryKey = permissionGroup.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{permissionGroupId=");
		sb.append(getPermissionGroupId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupName=");
		sb.append(getGroupName());
		sb.append(", groupCode=");
		sb.append(getGroupCode());
		sb.append(", isActive=");
		sb.append(getIsActive());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.vnpt.portlet.user.model.PermissionGroup");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>permissionGroupId</column-name><column-value><![CDATA[");
		sb.append(getPermissionGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupName</column-name><column-value><![CDATA[");
		sb.append(getGroupName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupCode</column-name><column-value><![CDATA[");
		sb.append(getGroupCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _permissionGroupId;
	private long _groupId;
	private long _companyId;
	private String _groupName;
	private String _groupCode;
	private int _isActive;
	private String _description;
	private long _roleId;
	private BaseModel<?> _permissionGroupRemoteModel;
	private Class<?> _clpSerializerClass = com.vnpt.portlet.user.service.ClpSerializer.class;
}
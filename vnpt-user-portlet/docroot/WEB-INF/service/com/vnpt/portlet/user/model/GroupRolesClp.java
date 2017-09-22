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
import com.vnpt.portlet.user.service.GroupRolesLocalServiceUtil;
import com.vnpt.portlet.user.service.persistence.GroupRolesPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ToanNQ86
 */
public class GroupRolesClp extends BaseModelImpl<GroupRoles>
	implements GroupRoles {
	public GroupRolesClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return GroupRoles.class;
	}

	@Override
	public String getModelClassName() {
		return GroupRoles.class.getName();
	}

	@Override
	public GroupRolesPK getPrimaryKey() {
		return new GroupRolesPK(_permissionGroupId, _roleId);
	}

	@Override
	public void setPrimaryKey(GroupRolesPK primaryKey) {
		setPermissionGroupId(primaryKey.permissionGroupId);
		setRoleId(primaryKey.roleId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new GroupRolesPK(_permissionGroupId, _roleId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((GroupRolesPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("permissionGroupId", getPermissionGroupId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long permissionGroupId = (Long)attributes.get("permissionGroupId");

		if (permissionGroupId != null) {
			setPermissionGroupId(permissionGroupId);
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

		if (_groupRolesRemoteModel != null) {
			try {
				Class<?> clazz = _groupRolesRemoteModel.getClass();

				Method method = clazz.getMethod("setPermissionGroupId",
						long.class);

				method.invoke(_groupRolesRemoteModel, permissionGroupId);
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

		if (_groupRolesRemoteModel != null) {
			try {
				Class<?> clazz = _groupRolesRemoteModel.getClass();

				Method method = clazz.getMethod("setRoleId", long.class);

				method.invoke(_groupRolesRemoteModel, roleId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getGroupRolesRemoteModel() {
		return _groupRolesRemoteModel;
	}

	public void setGroupRolesRemoteModel(BaseModel<?> groupRolesRemoteModel) {
		_groupRolesRemoteModel = groupRolesRemoteModel;
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

		Class<?> remoteModelClass = _groupRolesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_groupRolesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			GroupRolesLocalServiceUtil.addGroupRoles(this);
		}
		else {
			GroupRolesLocalServiceUtil.updateGroupRoles(this);
		}
	}

	@Override
	public GroupRoles toEscapedModel() {
		return (GroupRoles)ProxyUtil.newProxyInstance(GroupRoles.class.getClassLoader(),
			new Class[] { GroupRoles.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		GroupRolesClp clone = new GroupRolesClp();

		clone.setPermissionGroupId(getPermissionGroupId());
		clone.setRoleId(getRoleId());

		return clone;
	}

	@Override
	public int compareTo(GroupRoles groupRoles) {
		GroupRolesPK primaryKey = groupRoles.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof GroupRolesClp)) {
			return false;
		}

		GroupRolesClp groupRoles = (GroupRolesClp)obj;

		GroupRolesPK primaryKey = groupRoles.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
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
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{permissionGroupId=");
		sb.append(getPermissionGroupId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.vnpt.portlet.user.model.GroupRoles");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>permissionGroupId</column-name><column-value><![CDATA[");
		sb.append(getPermissionGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _permissionGroupId;
	private long _roleId;
	private BaseModel<?> _groupRolesRemoteModel;
	private Class<?> _clpSerializerClass = com.vnpt.portlet.user.service.ClpSerializer.class;
}
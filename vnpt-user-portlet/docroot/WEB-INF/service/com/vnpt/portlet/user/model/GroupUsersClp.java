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
import com.liferay.portal.util.PortalUtil;

import com.vnpt.portlet.user.service.ClpSerializer;
import com.vnpt.portlet.user.service.GroupUsersLocalServiceUtil;
import com.vnpt.portlet.user.service.persistence.GroupUsersPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ToanNQ86
 */
public class GroupUsersClp extends BaseModelImpl<GroupUsers>
	implements GroupUsers {
	public GroupUsersClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return GroupUsers.class;
	}

	@Override
	public String getModelClassName() {
		return GroupUsers.class.getName();
	}

	@Override
	public GroupUsersPK getPrimaryKey() {
		return new GroupUsersPK(_permissionGroupId, _userId);
	}

	@Override
	public void setPrimaryKey(GroupUsersPK primaryKey) {
		setPermissionGroupId(primaryKey.permissionGroupId);
		setUserId(primaryKey.userId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new GroupUsersPK(_permissionGroupId, _userId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((GroupUsersPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("permissionGroupId", getPermissionGroupId());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long permissionGroupId = (Long)attributes.get("permissionGroupId");

		if (permissionGroupId != null) {
			setPermissionGroupId(permissionGroupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	@Override
	public long getPermissionGroupId() {
		return _permissionGroupId;
	}

	@Override
	public void setPermissionGroupId(long permissionGroupId) {
		_permissionGroupId = permissionGroupId;

		if (_groupUsersRemoteModel != null) {
			try {
				Class<?> clazz = _groupUsersRemoteModel.getClass();

				Method method = clazz.getMethod("setPermissionGroupId",
						long.class);

				method.invoke(_groupUsersRemoteModel, permissionGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_groupUsersRemoteModel != null) {
			try {
				Class<?> clazz = _groupUsersRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_groupUsersRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public BaseModel<?> getGroupUsersRemoteModel() {
		return _groupUsersRemoteModel;
	}

	public void setGroupUsersRemoteModel(BaseModel<?> groupUsersRemoteModel) {
		_groupUsersRemoteModel = groupUsersRemoteModel;
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

		Class<?> remoteModelClass = _groupUsersRemoteModel.getClass();

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

		Object returnValue = method.invoke(_groupUsersRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			GroupUsersLocalServiceUtil.addGroupUsers(this);
		}
		else {
			GroupUsersLocalServiceUtil.updateGroupUsers(this);
		}
	}

	@Override
	public GroupUsers toEscapedModel() {
		return (GroupUsers)ProxyUtil.newProxyInstance(GroupUsers.class.getClassLoader(),
			new Class[] { GroupUsers.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		GroupUsersClp clone = new GroupUsersClp();

		clone.setPermissionGroupId(getPermissionGroupId());
		clone.setUserId(getUserId());

		return clone;
	}

	@Override
	public int compareTo(GroupUsers groupUsers) {
		GroupUsersPK primaryKey = groupUsers.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof GroupUsersClp)) {
			return false;
		}

		GroupUsersClp groupUsers = (GroupUsersClp)obj;

		GroupUsersPK primaryKey = groupUsers.getPrimaryKey();

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
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.vnpt.portlet.user.model.GroupUsers");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>permissionGroupId</column-name><column-value><![CDATA[");
		sb.append(getPermissionGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _permissionGroupId;
	private long _userId;
	private String _userUuid;
	private BaseModel<?> _groupUsersRemoteModel;
	private Class<?> _clpSerializerClass = com.vnpt.portlet.user.service.ClpSerializer.class;
}
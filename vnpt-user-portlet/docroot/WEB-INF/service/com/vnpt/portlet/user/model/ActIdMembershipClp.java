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

import com.vnpt.portlet.user.service.ActIdMembershipLocalServiceUtil;
import com.vnpt.portlet.user.service.ClpSerializer;
import com.vnpt.portlet.user.service.persistence.ActIdMembershipPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ToanNQ86
 */
public class ActIdMembershipClp extends BaseModelImpl<ActIdMembership>
	implements ActIdMembership {
	public ActIdMembershipClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ActIdMembership.class;
	}

	@Override
	public String getModelClassName() {
		return ActIdMembership.class.getName();
	}

	@Override
	public ActIdMembershipPK getPrimaryKey() {
		return new ActIdMembershipPK(_userId, _groupId);
	}

	@Override
	public void setPrimaryKey(ActIdMembershipPK primaryKey) {
		setUserId(primaryKey.userId);
		setGroupId(primaryKey.groupId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new ActIdMembershipPK(_userId, _groupId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((ActIdMembershipPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_actIdMembershipRemoteModel != null) {
			try {
				Class<?> clazz = _actIdMembershipRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_actIdMembershipRemoteModel, userId);
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

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_actIdMembershipRemoteModel != null) {
			try {
				Class<?> clazz = _actIdMembershipRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_actIdMembershipRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getActIdMembershipRemoteModel() {
		return _actIdMembershipRemoteModel;
	}

	public void setActIdMembershipRemoteModel(
		BaseModel<?> actIdMembershipRemoteModel) {
		_actIdMembershipRemoteModel = actIdMembershipRemoteModel;
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

		Class<?> remoteModelClass = _actIdMembershipRemoteModel.getClass();

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

		Object returnValue = method.invoke(_actIdMembershipRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ActIdMembershipLocalServiceUtil.addActIdMembership(this);
		}
		else {
			ActIdMembershipLocalServiceUtil.updateActIdMembership(this);
		}
	}

	@Override
	public ActIdMembership toEscapedModel() {
		return (ActIdMembership)ProxyUtil.newProxyInstance(ActIdMembership.class.getClassLoader(),
			new Class[] { ActIdMembership.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ActIdMembershipClp clone = new ActIdMembershipClp();

		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());

		return clone;
	}

	@Override
	public int compareTo(ActIdMembership actIdMembership) {
		ActIdMembershipPK primaryKey = actIdMembership.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActIdMembershipClp)) {
			return false;
		}

		ActIdMembershipClp actIdMembership = (ActIdMembershipClp)obj;

		ActIdMembershipPK primaryKey = actIdMembership.getPrimaryKey();

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

		sb.append("{userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.vnpt.portlet.user.model.ActIdMembership");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _userId;
	private String _userUuid;
	private long _groupId;
	private BaseModel<?> _actIdMembershipRemoteModel;
	private Class<?> _clpSerializerClass = com.vnpt.portlet.user.service.ClpSerializer.class;
}
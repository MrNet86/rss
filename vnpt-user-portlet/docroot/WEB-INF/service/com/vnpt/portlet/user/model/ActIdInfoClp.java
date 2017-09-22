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

import com.vnpt.portlet.user.service.ActIdInfoLocalServiceUtil;
import com.vnpt.portlet.user.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ToanNQ86
 */
public class ActIdInfoClp extends BaseModelImpl<ActIdInfo> implements ActIdInfo {
	public ActIdInfoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ActIdInfo.class;
	}

	@Override
	public String getModelClassName() {
		return ActIdInfo.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("rev", getRev());
		attributes.put("userId", getUserId());
		attributes.put("type", getType());
		attributes.put("key", getKey());
		attributes.put("value", getValue());
		attributes.put("password", getPassword());
		attributes.put("parent_id_", getParent_id_());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long rev = (Long)attributes.get("rev");

		if (rev != null) {
			setRev(rev);
		}

		String userId = (String)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String key = (String)attributes.get("key");

		if (key != null) {
			setKey(key);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		String parent_id_ = (String)attributes.get("parent_id_");

		if (parent_id_ != null) {
			setParent_id_(parent_id_);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_actIdInfoRemoteModel != null) {
			try {
				Class<?> clazz = _actIdInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_actIdInfoRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRev() {
		return _rev;
	}

	@Override
	public void setRev(long rev) {
		_rev = rev;

		if (_actIdInfoRemoteModel != null) {
			try {
				Class<?> clazz = _actIdInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setRev", long.class);

				method.invoke(_actIdInfoRemoteModel, rev);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(String userId) {
		_userId = userId;

		if (_actIdInfoRemoteModel != null) {
			try {
				Class<?> clazz = _actIdInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", String.class);

				method.invoke(_actIdInfoRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getType() {
		return _type;
	}

	@Override
	public void setType(String type) {
		_type = type;

		if (_actIdInfoRemoteModel != null) {
			try {
				Class<?> clazz = _actIdInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setType", String.class);

				method.invoke(_actIdInfoRemoteModel, type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKey() {
		return _key;
	}

	@Override
	public void setKey(String key) {
		_key = key;

		if (_actIdInfoRemoteModel != null) {
			try {
				Class<?> clazz = _actIdInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setKey", String.class);

				method.invoke(_actIdInfoRemoteModel, key);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getValue() {
		return _value;
	}

	@Override
	public void setValue(String value) {
		_value = value;

		if (_actIdInfoRemoteModel != null) {
			try {
				Class<?> clazz = _actIdInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setValue", String.class);

				method.invoke(_actIdInfoRemoteModel, value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassword() {
		return _password;
	}

	@Override
	public void setPassword(String password) {
		_password = password;

		if (_actIdInfoRemoteModel != null) {
			try {
				Class<?> clazz = _actIdInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setPassword", String.class);

				method.invoke(_actIdInfoRemoteModel, password);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getParent_id_() {
		return _parent_id_;
	}

	@Override
	public void setParent_id_(String parent_id_) {
		_parent_id_ = parent_id_;

		if (_actIdInfoRemoteModel != null) {
			try {
				Class<?> clazz = _actIdInfoRemoteModel.getClass();

				Method method = clazz.getMethod("setParent_id_", String.class);

				method.invoke(_actIdInfoRemoteModel, parent_id_);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getActIdInfoRemoteModel() {
		return _actIdInfoRemoteModel;
	}

	public void setActIdInfoRemoteModel(BaseModel<?> actIdInfoRemoteModel) {
		_actIdInfoRemoteModel = actIdInfoRemoteModel;
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

		Class<?> remoteModelClass = _actIdInfoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_actIdInfoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ActIdInfoLocalServiceUtil.addActIdInfo(this);
		}
		else {
			ActIdInfoLocalServiceUtil.updateActIdInfo(this);
		}
	}

	@Override
	public ActIdInfo toEscapedModel() {
		return (ActIdInfo)ProxyUtil.newProxyInstance(ActIdInfo.class.getClassLoader(),
			new Class[] { ActIdInfo.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ActIdInfoClp clone = new ActIdInfoClp();

		clone.setId(getId());
		clone.setRev(getRev());
		clone.setUserId(getUserId());
		clone.setType(getType());
		clone.setKey(getKey());
		clone.setValue(getValue());
		clone.setPassword(getPassword());
		clone.setParent_id_(getParent_id_());

		return clone;
	}

	@Override
	public int compareTo(ActIdInfo actIdInfo) {
		long primaryKey = actIdInfo.getPrimaryKey();

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

		if (!(obj instanceof ActIdInfoClp)) {
			return false;
		}

		ActIdInfoClp actIdInfo = (ActIdInfoClp)obj;

		long primaryKey = actIdInfo.getPrimaryKey();

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

		sb.append("{id=");
		sb.append(getId());
		sb.append(", rev=");
		sb.append(getRev());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", key=");
		sb.append(getKey());
		sb.append(", value=");
		sb.append(getValue());
		sb.append(", password=");
		sb.append(getPassword());
		sb.append(", parent_id_=");
		sb.append(getParent_id_());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.vnpt.portlet.user.model.ActIdInfo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rev</column-name><column-value><![CDATA[");
		sb.append(getRev());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>key</column-name><column-value><![CDATA[");
		sb.append(getKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>value</column-name><column-value><![CDATA[");
		sb.append(getValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>password</column-name><column-value><![CDATA[");
		sb.append(getPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parent_id_</column-name><column-value><![CDATA[");
		sb.append(getParent_id_());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _rev;
	private String _userId;
	private String _type;
	private String _key;
	private String _value;
	private String _password;
	private String _parent_id_;
	private BaseModel<?> _actIdInfoRemoteModel;
	private Class<?> _clpSerializerClass = com.vnpt.portlet.user.service.ClpSerializer.class;
}
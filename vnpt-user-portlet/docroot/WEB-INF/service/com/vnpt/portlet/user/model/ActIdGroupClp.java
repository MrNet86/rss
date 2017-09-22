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

import com.vnpt.portlet.user.service.ActIdGroupLocalServiceUtil;
import com.vnpt.portlet.user.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ToanNQ86
 */
public class ActIdGroupClp extends BaseModelImpl<ActIdGroup>
	implements ActIdGroup {
	public ActIdGroupClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ActIdGroup.class;
	}

	@Override
	public String getModelClassName() {
		return ActIdGroup.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("rev", getRev());
		attributes.put("name", getName());
		attributes.put("type", getType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String id = (String)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long rev = (Long)attributes.get("rev");

		if (rev != null) {
			setRev(rev);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}
	}

	@Override
	public String getId() {
		return _id;
	}

	@Override
	public void setId(String id) {
		_id = id;

		if (_actIdGroupRemoteModel != null) {
			try {
				Class<?> clazz = _actIdGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setId", String.class);

				method.invoke(_actIdGroupRemoteModel, id);
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

		if (_actIdGroupRemoteModel != null) {
			try {
				Class<?> clazz = _actIdGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setRev", long.class);

				method.invoke(_actIdGroupRemoteModel, rev);
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

		if (_actIdGroupRemoteModel != null) {
			try {
				Class<?> clazz = _actIdGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_actIdGroupRemoteModel, name);
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

		if (_actIdGroupRemoteModel != null) {
			try {
				Class<?> clazz = _actIdGroupRemoteModel.getClass();

				Method method = clazz.getMethod("setType", String.class);

				method.invoke(_actIdGroupRemoteModel, type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getActIdGroupRemoteModel() {
		return _actIdGroupRemoteModel;
	}

	public void setActIdGroupRemoteModel(BaseModel<?> actIdGroupRemoteModel) {
		_actIdGroupRemoteModel = actIdGroupRemoteModel;
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

		Class<?> remoteModelClass = _actIdGroupRemoteModel.getClass();

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

		Object returnValue = method.invoke(_actIdGroupRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ActIdGroupLocalServiceUtil.addActIdGroup(this);
		}
		else {
			ActIdGroupLocalServiceUtil.updateActIdGroup(this);
		}
	}

	@Override
	public ActIdGroup toEscapedModel() {
		return (ActIdGroup)ProxyUtil.newProxyInstance(ActIdGroup.class.getClassLoader(),
			new Class[] { ActIdGroup.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ActIdGroupClp clone = new ActIdGroupClp();

		clone.setId(getId());
		clone.setRev(getRev());
		clone.setName(getName());
		clone.setType(getType());

		return clone;
	}

	@Override
	public int compareTo(ActIdGroup actIdGroup) {
		String primaryKey = actIdGroup.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActIdGroupClp)) {
			return false;
		}

		ActIdGroupClp actIdGroup = (ActIdGroupClp)obj;

		String primaryKey = actIdGroup.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", rev=");
		sb.append(getRev());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", type=");
		sb.append(getType());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.vnpt.portlet.user.model.ActIdGroup");
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
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _id;
	private long _rev;
	private String _name;
	private String _type;
	private BaseModel<?> _actIdGroupRemoteModel;
	private Class<?> _clpSerializerClass = com.vnpt.portlet.user.service.ClpSerializer.class;
}
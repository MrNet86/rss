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
import com.vnpt.portlet.user.service.LiferayDatabaseLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ToanNQ86
 */
public class LiferayDatabaseClp extends BaseModelImpl<LiferayDatabase>
	implements LiferayDatabase {
	public LiferayDatabaseClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LiferayDatabase.class;
	}

	@Override
	public String getModelClassName() {
		return LiferayDatabase.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _itemFieldId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setItemFieldId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _itemFieldId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemFieldId", getItemFieldId());
		attributes.put("itemId", getItemId());
		attributes.put("name", getName());
		attributes.put("values", getValues());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemFieldId = (Long)attributes.get("itemFieldId");

		if (itemFieldId != null) {
			setItemFieldId(itemFieldId);
		}

		Long itemId = (Long)attributes.get("itemId");

		if (itemId != null) {
			setItemId(itemId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String values = (String)attributes.get("values");

		if (values != null) {
			setValues(values);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public long getItemFieldId() {
		return _itemFieldId;
	}

	@Override
	public void setItemFieldId(long itemFieldId) {
		_itemFieldId = itemFieldId;

		if (_liferayDatabaseRemoteModel != null) {
			try {
				Class<?> clazz = _liferayDatabaseRemoteModel.getClass();

				Method method = clazz.getMethod("setItemFieldId", long.class);

				method.invoke(_liferayDatabaseRemoteModel, itemFieldId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getItemId() {
		return _itemId;
	}

	@Override
	public void setItemId(long itemId) {
		_itemId = itemId;

		if (_liferayDatabaseRemoteModel != null) {
			try {
				Class<?> clazz = _liferayDatabaseRemoteModel.getClass();

				Method method = clazz.getMethod("setItemId", long.class);

				method.invoke(_liferayDatabaseRemoteModel, itemId);
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

		if (_liferayDatabaseRemoteModel != null) {
			try {
				Class<?> clazz = _liferayDatabaseRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_liferayDatabaseRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getValues() {
		return _values;
	}

	@Override
	public void setValues(String values) {
		_values = values;

		if (_liferayDatabaseRemoteModel != null) {
			try {
				Class<?> clazz = _liferayDatabaseRemoteModel.getClass();

				Method method = clazz.getMethod("setValues", String.class);

				method.invoke(_liferayDatabaseRemoteModel, values);
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

		if (_liferayDatabaseRemoteModel != null) {
			try {
				Class<?> clazz = _liferayDatabaseRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_liferayDatabaseRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLiferayDatabaseRemoteModel() {
		return _liferayDatabaseRemoteModel;
	}

	public void setLiferayDatabaseRemoteModel(
		BaseModel<?> liferayDatabaseRemoteModel) {
		_liferayDatabaseRemoteModel = liferayDatabaseRemoteModel;
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

		Class<?> remoteModelClass = _liferayDatabaseRemoteModel.getClass();

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

		Object returnValue = method.invoke(_liferayDatabaseRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LiferayDatabaseLocalServiceUtil.addLiferayDatabase(this);
		}
		else {
			LiferayDatabaseLocalServiceUtil.updateLiferayDatabase(this);
		}
	}

	@Override
	public LiferayDatabase toEscapedModel() {
		return (LiferayDatabase)ProxyUtil.newProxyInstance(LiferayDatabase.class.getClassLoader(),
			new Class[] { LiferayDatabase.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LiferayDatabaseClp clone = new LiferayDatabaseClp();

		clone.setItemFieldId(getItemFieldId());
		clone.setItemId(getItemId());
		clone.setName(getName());
		clone.setValues(getValues());
		clone.setDescription(getDescription());

		return clone;
	}

	@Override
	public int compareTo(LiferayDatabase liferayDatabase) {
		long primaryKey = liferayDatabase.getPrimaryKey();

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

		if (!(obj instanceof LiferayDatabaseClp)) {
			return false;
		}

		LiferayDatabaseClp liferayDatabase = (LiferayDatabaseClp)obj;

		long primaryKey = liferayDatabase.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{itemFieldId=");
		sb.append(getItemFieldId());
		sb.append(", itemId=");
		sb.append(getItemId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", values=");
		sb.append(getValues());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.vnpt.portlet.user.model.LiferayDatabase");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>itemFieldId</column-name><column-value><![CDATA[");
		sb.append(getItemFieldId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>itemId</column-name><column-value><![CDATA[");
		sb.append(getItemId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>values</column-name><column-value><![CDATA[");
		sb.append(getValues());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _itemFieldId;
	private long _itemId;
	private String _name;
	private String _values;
	private String _description;
	private BaseModel<?> _liferayDatabaseRemoteModel;
	private Class<?> _clpSerializerClass = com.vnpt.portlet.user.service.ClpSerializer.class;
}
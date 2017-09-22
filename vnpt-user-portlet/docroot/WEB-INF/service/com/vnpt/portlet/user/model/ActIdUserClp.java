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

import com.vnpt.portlet.user.service.ActIdUserLocalServiceUtil;
import com.vnpt.portlet.user.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ToanNQ86
 */
public class ActIdUserClp extends BaseModelImpl<ActIdUser> implements ActIdUser {
	public ActIdUserClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ActIdUser.class;
	}

	@Override
	public String getModelClassName() {
		return ActIdUser.class.getName();
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
		attributes.put("first", getFirst());
		attributes.put("last", getLast());
		attributes.put("email", getEmail());
		attributes.put("pwd", getPwd());
		attributes.put("pictureId", getPictureId());

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

		String first = (String)attributes.get("first");

		if (first != null) {
			setFirst(first);
		}

		String last = (String)attributes.get("last");

		if (last != null) {
			setLast(last);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String pwd = (String)attributes.get("pwd");

		if (pwd != null) {
			setPwd(pwd);
		}

		String pictureId = (String)attributes.get("pictureId");

		if (pictureId != null) {
			setPictureId(pictureId);
		}
	}

	@Override
	public String getId() {
		return _id;
	}

	@Override
	public void setId(String id) {
		_id = id;

		if (_actIdUserRemoteModel != null) {
			try {
				Class<?> clazz = _actIdUserRemoteModel.getClass();

				Method method = clazz.getMethod("setId", String.class);

				method.invoke(_actIdUserRemoteModel, id);
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

		if (_actIdUserRemoteModel != null) {
			try {
				Class<?> clazz = _actIdUserRemoteModel.getClass();

				Method method = clazz.getMethod("setRev", long.class);

				method.invoke(_actIdUserRemoteModel, rev);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFirst() {
		return _first;
	}

	@Override
	public void setFirst(String first) {
		_first = first;

		if (_actIdUserRemoteModel != null) {
			try {
				Class<?> clazz = _actIdUserRemoteModel.getClass();

				Method method = clazz.getMethod("setFirst", String.class);

				method.invoke(_actIdUserRemoteModel, first);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLast() {
		return _last;
	}

	@Override
	public void setLast(String last) {
		_last = last;

		if (_actIdUserRemoteModel != null) {
			try {
				Class<?> clazz = _actIdUserRemoteModel.getClass();

				Method method = clazz.getMethod("setLast", String.class);

				method.invoke(_actIdUserRemoteModel, last);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_actIdUserRemoteModel != null) {
			try {
				Class<?> clazz = _actIdUserRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_actIdUserRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPwd() {
		return _pwd;
	}

	@Override
	public void setPwd(String pwd) {
		_pwd = pwd;

		if (_actIdUserRemoteModel != null) {
			try {
				Class<?> clazz = _actIdUserRemoteModel.getClass();

				Method method = clazz.getMethod("setPwd", String.class);

				method.invoke(_actIdUserRemoteModel, pwd);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPictureId() {
		return _pictureId;
	}

	@Override
	public void setPictureId(String pictureId) {
		_pictureId = pictureId;

		if (_actIdUserRemoteModel != null) {
			try {
				Class<?> clazz = _actIdUserRemoteModel.getClass();

				Method method = clazz.getMethod("setPictureId", String.class);

				method.invoke(_actIdUserRemoteModel, pictureId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getActIdUserRemoteModel() {
		return _actIdUserRemoteModel;
	}

	public void setActIdUserRemoteModel(BaseModel<?> actIdUserRemoteModel) {
		_actIdUserRemoteModel = actIdUserRemoteModel;
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

		Class<?> remoteModelClass = _actIdUserRemoteModel.getClass();

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

		Object returnValue = method.invoke(_actIdUserRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ActIdUserLocalServiceUtil.addActIdUser(this);
		}
		else {
			ActIdUserLocalServiceUtil.updateActIdUser(this);
		}
	}

	@Override
	public ActIdUser toEscapedModel() {
		return (ActIdUser)ProxyUtil.newProxyInstance(ActIdUser.class.getClassLoader(),
			new Class[] { ActIdUser.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ActIdUserClp clone = new ActIdUserClp();

		clone.setId(getId());
		clone.setRev(getRev());
		clone.setFirst(getFirst());
		clone.setLast(getLast());
		clone.setEmail(getEmail());
		clone.setPwd(getPwd());
		clone.setPictureId(getPictureId());

		return clone;
	}

	@Override
	public int compareTo(ActIdUser actIdUser) {
		String primaryKey = actIdUser.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActIdUserClp)) {
			return false;
		}

		ActIdUserClp actIdUser = (ActIdUserClp)obj;

		String primaryKey = actIdUser.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", rev=");
		sb.append(getRev());
		sb.append(", first=");
		sb.append(getFirst());
		sb.append(", last=");
		sb.append(getLast());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", pwd=");
		sb.append(getPwd());
		sb.append(", pictureId=");
		sb.append(getPictureId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.vnpt.portlet.user.model.ActIdUser");
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
			"<column><column-name>first</column-name><column-value><![CDATA[");
		sb.append(getFirst());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>last</column-name><column-value><![CDATA[");
		sb.append(getLast());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pwd</column-name><column-value><![CDATA[");
		sb.append(getPwd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pictureId</column-name><column-value><![CDATA[");
		sb.append(getPictureId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _id;
	private long _rev;
	private String _first;
	private String _last;
	private String _email;
	private String _pwd;
	private String _pictureId;
	private BaseModel<?> _actIdUserRemoteModel;
	private Class<?> _clpSerializerClass = com.vnpt.portlet.user.service.ClpSerializer.class;
}
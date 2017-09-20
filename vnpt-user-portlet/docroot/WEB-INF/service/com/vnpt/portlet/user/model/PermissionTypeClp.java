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
import com.vnpt.portlet.user.service.PermissionTypeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ToanNQ86
 */
public class PermissionTypeClp extends BaseModelImpl<PermissionType>
	implements PermissionType {
	public PermissionTypeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PermissionType.class;
	}

	@Override
	public String getModelClassName() {
		return PermissionType.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _permissionTypeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPermissionTypeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _permissionTypeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("permissionTypeId", getPermissionTypeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("typeName", getTypeName());
		attributes.put("typeCode", getTypeCode());
		attributes.put("isActive", getIsActive());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long permissionTypeId = (Long)attributes.get("permissionTypeId");

		if (permissionTypeId != null) {
			setPermissionTypeId(permissionTypeId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String typeName = (String)attributes.get("typeName");

		if (typeName != null) {
			setTypeName(typeName);
		}

		String typeCode = (String)attributes.get("typeCode");

		if (typeCode != null) {
			setTypeCode(typeCode);
		}

		Integer isActive = (Integer)attributes.get("isActive");

		if (isActive != null) {
			setIsActive(isActive);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public long getPermissionTypeId() {
		return _permissionTypeId;
	}

	@Override
	public void setPermissionTypeId(long permissionTypeId) {
		_permissionTypeId = permissionTypeId;

		if (_permissionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _permissionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setPermissionTypeId",
						long.class);

				method.invoke(_permissionTypeRemoteModel, permissionTypeId);
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

		if (_permissionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _permissionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_permissionTypeRemoteModel, groupId);
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

		if (_permissionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _permissionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_permissionTypeRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTypeName() {
		return _typeName;
	}

	@Override
	public void setTypeName(String typeName) {
		_typeName = typeName;

		if (_permissionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _permissionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setTypeName", String.class);

				method.invoke(_permissionTypeRemoteModel, typeName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTypeCode() {
		return _typeCode;
	}

	@Override
	public void setTypeCode(String typeCode) {
		_typeCode = typeCode;

		if (_permissionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _permissionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setTypeCode", String.class);

				method.invoke(_permissionTypeRemoteModel, typeCode);
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

		if (_permissionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _permissionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", int.class);

				method.invoke(_permissionTypeRemoteModel, isActive);
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

		if (_permissionTypeRemoteModel != null) {
			try {
				Class<?> clazz = _permissionTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_permissionTypeRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPermissionTypeRemoteModel() {
		return _permissionTypeRemoteModel;
	}

	public void setPermissionTypeRemoteModel(
		BaseModel<?> permissionTypeRemoteModel) {
		_permissionTypeRemoteModel = permissionTypeRemoteModel;
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

		Class<?> remoteModelClass = _permissionTypeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_permissionTypeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PermissionTypeLocalServiceUtil.addPermissionType(this);
		}
		else {
			PermissionTypeLocalServiceUtil.updatePermissionType(this);
		}
	}

	@Override
	public PermissionType toEscapedModel() {
		return (PermissionType)ProxyUtil.newProxyInstance(PermissionType.class.getClassLoader(),
			new Class[] { PermissionType.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PermissionTypeClp clone = new PermissionTypeClp();

		clone.setPermissionTypeId(getPermissionTypeId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setTypeName(getTypeName());
		clone.setTypeCode(getTypeCode());
		clone.setIsActive(getIsActive());
		clone.setDescription(getDescription());

		return clone;
	}

	@Override
	public int compareTo(PermissionType permissionType) {
		long primaryKey = permissionType.getPrimaryKey();

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

		if (!(obj instanceof PermissionTypeClp)) {
			return false;
		}

		PermissionTypeClp permissionType = (PermissionTypeClp)obj;

		long primaryKey = permissionType.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{permissionTypeId=");
		sb.append(getPermissionTypeId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", typeName=");
		sb.append(getTypeName());
		sb.append(", typeCode=");
		sb.append(getTypeCode());
		sb.append(", isActive=");
		sb.append(getIsActive());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.vnpt.portlet.user.model.PermissionType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>permissionTypeId</column-name><column-value><![CDATA[");
		sb.append(getPermissionTypeId());
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
			"<column><column-name>typeName</column-name><column-value><![CDATA[");
		sb.append(getTypeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typeCode</column-name><column-value><![CDATA[");
		sb.append(getTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _permissionTypeId;
	private long _groupId;
	private long _companyId;
	private String _typeName;
	private String _typeCode;
	private int _isActive;
	private String _description;
	private BaseModel<?> _permissionTypeRemoteModel;
	private Class<?> _clpSerializerClass = com.vnpt.portlet.user.service.ClpSerializer.class;
}
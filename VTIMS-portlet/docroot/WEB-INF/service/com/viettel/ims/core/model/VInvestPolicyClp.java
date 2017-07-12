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

package com.viettel.ims.core.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.viettel.ims.core.service.ClpSerializer;
import com.viettel.ims.core.service.VInvestPolicyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MrNet
 */
public class VInvestPolicyClp extends BaseModelImpl<VInvestPolicy>
	implements VInvestPolicy {
	public VInvestPolicyClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return VInvestPolicy.class;
	}

	@Override
	public String getModelClassName() {
		return VInvestPolicy.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _investPolicyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setInvestPolicyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _investPolicyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("investPolicyId", getInvestPolicyId());
		attributes.put("infoPolicyTypeName", getInfoPolicyTypeName());
		attributes.put("infoPolicyName", getInfoPolicyName());
		attributes.put("infoProposeGroupName", getInfoProposeGroupName());
		attributes.put("infoVerifyGroupName", getInfoVerifyGroupName());
		attributes.put("infoPolicyDate", getInfoPolicyDate());
		attributes.put("infoPolicyDeployDate", getInfoPolicyDeployDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long investPolicyId = (Long)attributes.get("investPolicyId");

		if (investPolicyId != null) {
			setInvestPolicyId(investPolicyId);
		}

		String infoPolicyTypeName = (String)attributes.get("infoPolicyTypeName");

		if (infoPolicyTypeName != null) {
			setInfoPolicyTypeName(infoPolicyTypeName);
		}

		String infoPolicyName = (String)attributes.get("infoPolicyName");

		if (infoPolicyName != null) {
			setInfoPolicyName(infoPolicyName);
		}

		String infoProposeGroupName = (String)attributes.get(
				"infoProposeGroupName");

		if (infoProposeGroupName != null) {
			setInfoProposeGroupName(infoProposeGroupName);
		}

		String infoVerifyGroupName = (String)attributes.get(
				"infoVerifyGroupName");

		if (infoVerifyGroupName != null) {
			setInfoVerifyGroupName(infoVerifyGroupName);
		}

		Date infoPolicyDate = (Date)attributes.get("infoPolicyDate");

		if (infoPolicyDate != null) {
			setInfoPolicyDate(infoPolicyDate);
		}

		Date infoPolicyDeployDate = (Date)attributes.get("infoPolicyDeployDate");

		if (infoPolicyDeployDate != null) {
			setInfoPolicyDeployDate(infoPolicyDeployDate);
		}
	}

	@Override
	public long getInvestPolicyId() {
		return _investPolicyId;
	}

	@Override
	public void setInvestPolicyId(long investPolicyId) {
		_investPolicyId = investPolicyId;

		if (_vInvestPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _vInvestPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInvestPolicyId", long.class);

				method.invoke(_vInvestPolicyRemoteModel, investPolicyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInfoPolicyTypeName() {
		return _infoPolicyTypeName;
	}

	@Override
	public void setInfoPolicyTypeName(String infoPolicyTypeName) {
		_infoPolicyTypeName = infoPolicyTypeName;

		if (_vInvestPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _vInvestPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoPolicyTypeName",
						String.class);

				method.invoke(_vInvestPolicyRemoteModel, infoPolicyTypeName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInfoPolicyName() {
		return _infoPolicyName;
	}

	@Override
	public void setInfoPolicyName(String infoPolicyName) {
		_infoPolicyName = infoPolicyName;

		if (_vInvestPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _vInvestPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoPolicyName",
						String.class);

				method.invoke(_vInvestPolicyRemoteModel, infoPolicyName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInfoProposeGroupName() {
		return _infoProposeGroupName;
	}

	@Override
	public void setInfoProposeGroupName(String infoProposeGroupName) {
		_infoProposeGroupName = infoProposeGroupName;

		if (_vInvestPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _vInvestPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoProposeGroupName",
						String.class);

				method.invoke(_vInvestPolicyRemoteModel, infoProposeGroupName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInfoVerifyGroupName() {
		return _infoVerifyGroupName;
	}

	@Override
	public void setInfoVerifyGroupName(String infoVerifyGroupName) {
		_infoVerifyGroupName = infoVerifyGroupName;

		if (_vInvestPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _vInvestPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoVerifyGroupName",
						String.class);

				method.invoke(_vInvestPolicyRemoteModel, infoVerifyGroupName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInfoPolicyDate() {
		return _infoPolicyDate;
	}

	@Override
	public void setInfoPolicyDate(Date infoPolicyDate) {
		_infoPolicyDate = infoPolicyDate;

		if (_vInvestPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _vInvestPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoPolicyDate", Date.class);

				method.invoke(_vInvestPolicyRemoteModel, infoPolicyDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInfoPolicyDeployDate() {
		return _infoPolicyDeployDate;
	}

	@Override
	public void setInfoPolicyDeployDate(Date infoPolicyDeployDate) {
		_infoPolicyDeployDate = infoPolicyDeployDate;

		if (_vInvestPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _vInvestPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoPolicyDeployDate",
						Date.class);

				method.invoke(_vInvestPolicyRemoteModel, infoPolicyDeployDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getVInvestPolicyRemoteModel() {
		return _vInvestPolicyRemoteModel;
	}

	public void setVInvestPolicyRemoteModel(
		BaseModel<?> vInvestPolicyRemoteModel) {
		_vInvestPolicyRemoteModel = vInvestPolicyRemoteModel;
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

		Class<?> remoteModelClass = _vInvestPolicyRemoteModel.getClass();

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

		Object returnValue = method.invoke(_vInvestPolicyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VInvestPolicyLocalServiceUtil.addVInvestPolicy(this);
		}
		else {
			VInvestPolicyLocalServiceUtil.updateVInvestPolicy(this);
		}
	}

	@Override
	public VInvestPolicy toEscapedModel() {
		return (VInvestPolicy)ProxyUtil.newProxyInstance(VInvestPolicy.class.getClassLoader(),
			new Class[] { VInvestPolicy.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		VInvestPolicyClp clone = new VInvestPolicyClp();

		clone.setInvestPolicyId(getInvestPolicyId());
		clone.setInfoPolicyTypeName(getInfoPolicyTypeName());
		clone.setInfoPolicyName(getInfoPolicyName());
		clone.setInfoProposeGroupName(getInfoProposeGroupName());
		clone.setInfoVerifyGroupName(getInfoVerifyGroupName());
		clone.setInfoPolicyDate(getInfoPolicyDate());
		clone.setInfoPolicyDeployDate(getInfoPolicyDeployDate());

		return clone;
	}

	@Override
	public int compareTo(VInvestPolicy vInvestPolicy) {
		long primaryKey = vInvestPolicy.getPrimaryKey();

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

		if (!(obj instanceof VInvestPolicyClp)) {
			return false;
		}

		VInvestPolicyClp vInvestPolicy = (VInvestPolicyClp)obj;

		long primaryKey = vInvestPolicy.getPrimaryKey();

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

		sb.append("{investPolicyId=");
		sb.append(getInvestPolicyId());
		sb.append(", infoPolicyTypeName=");
		sb.append(getInfoPolicyTypeName());
		sb.append(", infoPolicyName=");
		sb.append(getInfoPolicyName());
		sb.append(", infoProposeGroupName=");
		sb.append(getInfoProposeGroupName());
		sb.append(", infoVerifyGroupName=");
		sb.append(getInfoVerifyGroupName());
		sb.append(", infoPolicyDate=");
		sb.append(getInfoPolicyDate());
		sb.append(", infoPolicyDeployDate=");
		sb.append(getInfoPolicyDeployDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.viettel.ims.core.model.VInvestPolicy");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>investPolicyId</column-name><column-value><![CDATA[");
		sb.append(getInvestPolicyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoPolicyTypeName</column-name><column-value><![CDATA[");
		sb.append(getInfoPolicyTypeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoPolicyName</column-name><column-value><![CDATA[");
		sb.append(getInfoPolicyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoProposeGroupName</column-name><column-value><![CDATA[");
		sb.append(getInfoProposeGroupName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoVerifyGroupName</column-name><column-value><![CDATA[");
		sb.append(getInfoVerifyGroupName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoPolicyDate</column-name><column-value><![CDATA[");
		sb.append(getInfoPolicyDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoPolicyDeployDate</column-name><column-value><![CDATA[");
		sb.append(getInfoPolicyDeployDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _investPolicyId;
	private String _infoPolicyTypeName;
	private String _infoPolicyName;
	private String _infoProposeGroupName;
	private String _infoVerifyGroupName;
	private Date _infoPolicyDate;
	private Date _infoPolicyDeployDate;
	private BaseModel<?> _vInvestPolicyRemoteModel;
	private Class<?> _clpSerializerClass = com.viettel.ims.core.service.ClpSerializer.class;
}
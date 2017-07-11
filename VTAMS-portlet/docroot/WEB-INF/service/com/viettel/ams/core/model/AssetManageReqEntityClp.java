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

package com.viettel.ams.core.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.viettel.ams.core.service.AssetManageReqEntityLocalServiceUtil;
import com.viettel.ams.core.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MrNet
 */
public class AssetManageReqEntityClp extends BaseModelImpl<AssetManageReqEntity>
	implements AssetManageReqEntity {
	public AssetManageReqEntityClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AssetManageReqEntity.class;
	}

	@Override
	public String getModelClassName() {
		return AssetManageReqEntity.class.getName();
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
		attributes.put("reqId", getReqId());
		attributes.put("merEntityId", getMerEntityId());
		attributes.put("stationId", getStationId());
		attributes.put("failDate", getFailDate());
		attributes.put("failReason", getFailReason());
		attributes.put("usedDate", getUsedDate());
		attributes.put("preStatusId", getPreStatusId());
		attributes.put("groupId", getGroupId());
		attributes.put("quantity", getQuantity());
		attributes.put("description", getDescription());
		attributes.put("unitPrice", getUnitPrice());
		attributes.put("timeRetrieve", getTimeRetrieve());
		attributes.put("constructionId", getConstructionId());
		attributes.put("conditionerId", getConditionerId());
		attributes.put("catGroupMerId", getCatGroupMerId());
		attributes.put("upgradeParentId", getUpgradeParentId());
		attributes.put("partnerId", getPartnerId());
		attributes.put("deliveryNoteId", getDeliveryNoteId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long reqId = (Long)attributes.get("reqId");

		if (reqId != null) {
			setReqId(reqId);
		}

		Long merEntityId = (Long)attributes.get("merEntityId");

		if (merEntityId != null) {
			setMerEntityId(merEntityId);
		}

		Long stationId = (Long)attributes.get("stationId");

		if (stationId != null) {
			setStationId(stationId);
		}

		Date failDate = (Date)attributes.get("failDate");

		if (failDate != null) {
			setFailDate(failDate);
		}

		String failReason = (String)attributes.get("failReason");

		if (failReason != null) {
			setFailReason(failReason);
		}

		Date usedDate = (Date)attributes.get("usedDate");

		if (usedDate != null) {
			setUsedDate(usedDate);
		}

		Long preStatusId = (Long)attributes.get("preStatusId");

		if (preStatusId != null) {
			setPreStatusId(preStatusId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Double quantity = (Double)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Double unitPrice = (Double)attributes.get("unitPrice");

		if (unitPrice != null) {
			setUnitPrice(unitPrice);
		}

		Date timeRetrieve = (Date)attributes.get("timeRetrieve");

		if (timeRetrieve != null) {
			setTimeRetrieve(timeRetrieve);
		}

		Long constructionId = (Long)attributes.get("constructionId");

		if (constructionId != null) {
			setConstructionId(constructionId);
		}

		Long conditionerId = (Long)attributes.get("conditionerId");

		if (conditionerId != null) {
			setConditionerId(conditionerId);
		}

		Long catGroupMerId = (Long)attributes.get("catGroupMerId");

		if (catGroupMerId != null) {
			setCatGroupMerId(catGroupMerId);
		}

		Long upgradeParentId = (Long)attributes.get("upgradeParentId");

		if (upgradeParentId != null) {
			setUpgradeParentId(upgradeParentId);
		}

		Long partnerId = (Long)attributes.get("partnerId");

		if (partnerId != null) {
			setPartnerId(partnerId);
		}

		Long deliveryNoteId = (Long)attributes.get("deliveryNoteId");

		if (deliveryNoteId != null) {
			setDeliveryNoteId(deliveryNoteId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_assetManageReqEntityRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getReqId() {
		return _reqId;
	}

	@Override
	public void setReqId(Long reqId) {
		_reqId = reqId;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setReqId", Long.class);

				method.invoke(_assetManageReqEntityRemoteModel, reqId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getMerEntityId() {
		return _merEntityId;
	}

	@Override
	public void setMerEntityId(Long merEntityId) {
		_merEntityId = merEntityId;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setMerEntityId", Long.class);

				method.invoke(_assetManageReqEntityRemoteModel, merEntityId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getStationId() {
		return _stationId;
	}

	@Override
	public void setStationId(Long stationId) {
		_stationId = stationId;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setStationId", Long.class);

				method.invoke(_assetManageReqEntityRemoteModel, stationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFailDate() {
		return _failDate;
	}

	@Override
	public void setFailDate(Date failDate) {
		_failDate = failDate;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setFailDate", Date.class);

				method.invoke(_assetManageReqEntityRemoteModel, failDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFailReason() {
		return _failReason;
	}

	@Override
	public void setFailReason(String failReason) {
		_failReason = failReason;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setFailReason", String.class);

				method.invoke(_assetManageReqEntityRemoteModel, failReason);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUsedDate() {
		return _usedDate;
	}

	@Override
	public void setUsedDate(Date usedDate) {
		_usedDate = usedDate;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setUsedDate", Date.class);

				method.invoke(_assetManageReqEntityRemoteModel, usedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getPreStatusId() {
		return _preStatusId;
	}

	@Override
	public void setPreStatusId(Long preStatusId) {
		_preStatusId = preStatusId;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setPreStatusId", Long.class);

				method.invoke(_assetManageReqEntityRemoteModel, preStatusId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(Long groupId) {
		_groupId = groupId;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", Long.class);

				method.invoke(_assetManageReqEntityRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Double getQuantity() {
		return _quantity;
	}

	@Override
	public void setQuantity(Double quantity) {
		_quantity = quantity;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setQuantity", Double.class);

				method.invoke(_assetManageReqEntityRemoteModel, quantity);
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

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_assetManageReqEntityRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Double getUnitPrice() {
		return _unitPrice;
	}

	@Override
	public void setUnitPrice(Double unitPrice) {
		_unitPrice = unitPrice;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitPrice", Double.class);

				method.invoke(_assetManageReqEntityRemoteModel, unitPrice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTimeRetrieve() {
		return _timeRetrieve;
	}

	@Override
	public void setTimeRetrieve(Date timeRetrieve) {
		_timeRetrieve = timeRetrieve;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setTimeRetrieve", Date.class);

				method.invoke(_assetManageReqEntityRemoteModel, timeRetrieve);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getConstructionId() {
		return _constructionId;
	}

	@Override
	public void setConstructionId(Long constructionId) {
		_constructionId = constructionId;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setConstructionId", Long.class);

				method.invoke(_assetManageReqEntityRemoteModel, constructionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getConditionerId() {
		return _conditionerId;
	}

	@Override
	public void setConditionerId(Long conditionerId) {
		_conditionerId = conditionerId;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setConditionerId", Long.class);

				method.invoke(_assetManageReqEntityRemoteModel, conditionerId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getCatGroupMerId() {
		return _catGroupMerId;
	}

	@Override
	public void setCatGroupMerId(Long catGroupMerId) {
		_catGroupMerId = catGroupMerId;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setCatGroupMerId", Long.class);

				method.invoke(_assetManageReqEntityRemoteModel, catGroupMerId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getUpgradeParentId() {
		return _upgradeParentId;
	}

	@Override
	public void setUpgradeParentId(Long upgradeParentId) {
		_upgradeParentId = upgradeParentId;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setUpgradeParentId", Long.class);

				method.invoke(_assetManageReqEntityRemoteModel, upgradeParentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getPartnerId() {
		return _partnerId;
	}

	@Override
	public void setPartnerId(Long partnerId) {
		_partnerId = partnerId;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setPartnerId", Long.class);

				method.invoke(_assetManageReqEntityRemoteModel, partnerId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getDeliveryNoteId() {
		return _deliveryNoteId;
	}

	@Override
	public void setDeliveryNoteId(Long deliveryNoteId) {
		_deliveryNoteId = deliveryNoteId;

		if (_assetManageReqEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setDeliveryNoteId", Long.class);

				method.invoke(_assetManageReqEntityRemoteModel, deliveryNoteId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAssetManageReqEntityRemoteModel() {
		return _assetManageReqEntityRemoteModel;
	}

	public void setAssetManageReqEntityRemoteModel(
		BaseModel<?> assetManageReqEntityRemoteModel) {
		_assetManageReqEntityRemoteModel = assetManageReqEntityRemoteModel;
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

		Class<?> remoteModelClass = _assetManageReqEntityRemoteModel.getClass();

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

		Object returnValue = method.invoke(_assetManageReqEntityRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AssetManageReqEntityLocalServiceUtil.addAssetManageReqEntity(this);
		}
		else {
			AssetManageReqEntityLocalServiceUtil.updateAssetManageReqEntity(this);
		}
	}

	@Override
	public AssetManageReqEntity toEscapedModel() {
		return (AssetManageReqEntity)ProxyUtil.newProxyInstance(AssetManageReqEntity.class.getClassLoader(),
			new Class[] { AssetManageReqEntity.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AssetManageReqEntityClp clone = new AssetManageReqEntityClp();

		clone.setId(getId());
		clone.setReqId(getReqId());
		clone.setMerEntityId(getMerEntityId());
		clone.setStationId(getStationId());
		clone.setFailDate(getFailDate());
		clone.setFailReason(getFailReason());
		clone.setUsedDate(getUsedDate());
		clone.setPreStatusId(getPreStatusId());
		clone.setGroupId(getGroupId());
		clone.setQuantity(getQuantity());
		clone.setDescription(getDescription());
		clone.setUnitPrice(getUnitPrice());
		clone.setTimeRetrieve(getTimeRetrieve());
		clone.setConstructionId(getConstructionId());
		clone.setConditionerId(getConditionerId());
		clone.setCatGroupMerId(getCatGroupMerId());
		clone.setUpgradeParentId(getUpgradeParentId());
		clone.setPartnerId(getPartnerId());
		clone.setDeliveryNoteId(getDeliveryNoteId());

		return clone;
	}

	@Override
	public int compareTo(AssetManageReqEntity assetManageReqEntity) {
		long primaryKey = assetManageReqEntity.getPrimaryKey();

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

		if (!(obj instanceof AssetManageReqEntityClp)) {
			return false;
		}

		AssetManageReqEntityClp assetManageReqEntity = (AssetManageReqEntityClp)obj;

		long primaryKey = assetManageReqEntity.getPrimaryKey();

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
		StringBundler sb = new StringBundler(39);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", reqId=");
		sb.append(getReqId());
		sb.append(", merEntityId=");
		sb.append(getMerEntityId());
		sb.append(", stationId=");
		sb.append(getStationId());
		sb.append(", failDate=");
		sb.append(getFailDate());
		sb.append(", failReason=");
		sb.append(getFailReason());
		sb.append(", usedDate=");
		sb.append(getUsedDate());
		sb.append(", preStatusId=");
		sb.append(getPreStatusId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", quantity=");
		sb.append(getQuantity());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", unitPrice=");
		sb.append(getUnitPrice());
		sb.append(", timeRetrieve=");
		sb.append(getTimeRetrieve());
		sb.append(", constructionId=");
		sb.append(getConstructionId());
		sb.append(", conditionerId=");
		sb.append(getConditionerId());
		sb.append(", catGroupMerId=");
		sb.append(getCatGroupMerId());
		sb.append(", upgradeParentId=");
		sb.append(getUpgradeParentId());
		sb.append(", partnerId=");
		sb.append(getPartnerId());
		sb.append(", deliveryNoteId=");
		sb.append(getDeliveryNoteId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("com.viettel.ams.core.model.AssetManageReqEntity");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reqId</column-name><column-value><![CDATA[");
		sb.append(getReqId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>merEntityId</column-name><column-value><![CDATA[");
		sb.append(getMerEntityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stationId</column-name><column-value><![CDATA[");
		sb.append(getStationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>failDate</column-name><column-value><![CDATA[");
		sb.append(getFailDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>failReason</column-name><column-value><![CDATA[");
		sb.append(getFailReason());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usedDate</column-name><column-value><![CDATA[");
		sb.append(getUsedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preStatusId</column-name><column-value><![CDATA[");
		sb.append(getPreStatusId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantity</column-name><column-value><![CDATA[");
		sb.append(getQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitPrice</column-name><column-value><![CDATA[");
		sb.append(getUnitPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeRetrieve</column-name><column-value><![CDATA[");
		sb.append(getTimeRetrieve());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>constructionId</column-name><column-value><![CDATA[");
		sb.append(getConstructionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>conditionerId</column-name><column-value><![CDATA[");
		sb.append(getConditionerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>catGroupMerId</column-name><column-value><![CDATA[");
		sb.append(getCatGroupMerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>upgradeParentId</column-name><column-value><![CDATA[");
		sb.append(getUpgradeParentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>partnerId</column-name><column-value><![CDATA[");
		sb.append(getPartnerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deliveryNoteId</column-name><column-value><![CDATA[");
		sb.append(getDeliveryNoteId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private Long _reqId;
	private Long _merEntityId;
	private Long _stationId;
	private Date _failDate;
	private String _failReason;
	private Date _usedDate;
	private Long _preStatusId;
	private Long _groupId;
	private Double _quantity;
	private String _description;
	private Double _unitPrice;
	private Date _timeRetrieve;
	private Long _constructionId;
	private Long _conditionerId;
	private Long _catGroupMerId;
	private Long _upgradeParentId;
	private Long _partnerId;
	private Long _deliveryNoteId;
	private BaseModel<?> _assetManageReqEntityRemoteModel;
	private Class<?> _clpSerializerClass = com.viettel.ams.core.service.ClpSerializer.class;
}
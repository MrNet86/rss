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

import com.viettel.ams.core.service.AssetManageReqHandleEntityLocalServiceUtil;
import com.viettel.ams.core.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MrNet
 */
public class AssetManageReqHandleEntityClp extends BaseModelImpl<AssetManageReqHandleEntity>
	implements AssetManageReqHandleEntity {
	public AssetManageReqHandleEntityClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AssetManageReqHandleEntity.class;
	}

	@Override
	public String getModelClassName() {
		return AssetManageReqHandleEntity.class.getName();
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
		attributes.put("handleId", getHandleId());
		attributes.put("merEntityId", getMerEntityId());
		attributes.put("status", getStatus());
		attributes.put("stationId", getStationId());
		attributes.put("failDate", getFailDate());
		attributes.put("failReason", getFailReason());
		attributes.put("usedDate", getUsedDate());
		attributes.put("handOverId", getHandOverId());
		attributes.put("quantity", getQuantity());
		attributes.put("unitPrice", getUnitPrice());
		attributes.put("description", getDescription());
		attributes.put("upgradeParentId", getUpgradeParentId());
		attributes.put("parentId", getParentId());
		attributes.put("groupId", getGroupId());
		attributes.put("timeRetrieve", getTimeRetrieve());
		attributes.put("statusId", getStatusId());
		attributes.put("mark", getMark());
		attributes.put("oldStatusId", getOldStatusId());
		attributes.put("preCatEmployeeId", getPreCatEmployeeId());
		attributes.put("percentQuality", getPercentQuality());
		attributes.put("withdrawPrice", getWithdrawPrice());
		attributes.put("deliveryNoteId", getDeliveryNoteId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long handleId = (Long)attributes.get("handleId");

		if (handleId != null) {
			setHandleId(handleId);
		}

		Long merEntityId = (Long)attributes.get("merEntityId");

		if (merEntityId != null) {
			setMerEntityId(merEntityId);
		}

		Long status = (Long)attributes.get("status");

		if (status != null) {
			setStatus(status);
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

		Long handOverId = (Long)attributes.get("handOverId");

		if (handOverId != null) {
			setHandOverId(handOverId);
		}

		Double quantity = (Double)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		Double unitPrice = (Double)attributes.get("unitPrice");

		if (unitPrice != null) {
			setUnitPrice(unitPrice);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long upgradeParentId = (Long)attributes.get("upgradeParentId");

		if (upgradeParentId != null) {
			setUpgradeParentId(upgradeParentId);
		}

		Long parentId = (Long)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date timeRetrieve = (Date)attributes.get("timeRetrieve");

		if (timeRetrieve != null) {
			setTimeRetrieve(timeRetrieve);
		}

		Long statusId = (Long)attributes.get("statusId");

		if (statusId != null) {
			setStatusId(statusId);
		}

		Long mark = (Long)attributes.get("mark");

		if (mark != null) {
			setMark(mark);
		}

		Long oldStatusId = (Long)attributes.get("oldStatusId");

		if (oldStatusId != null) {
			setOldStatusId(oldStatusId);
		}

		Long preCatEmployeeId = (Long)attributes.get("preCatEmployeeId");

		if (preCatEmployeeId != null) {
			setPreCatEmployeeId(preCatEmployeeId);
		}

		Long percentQuality = (Long)attributes.get("percentQuality");

		if (percentQuality != null) {
			setPercentQuality(percentQuality);
		}

		Long withdrawPrice = (Long)attributes.get("withdrawPrice");

		if (withdrawPrice != null) {
			setWithdrawPrice(withdrawPrice);
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

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getHandleId() {
		return _handleId;
	}

	@Override
	public void setHandleId(Long handleId) {
		_handleId = handleId;

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setHandleId", Long.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel, handleId);
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

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setMerEntityId", Long.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel,
					merEntityId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getStatus() {
		return _status;
	}

	@Override
	public void setStatus(Long status) {
		_status = status;

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", Long.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel, status);
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

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setStationId", Long.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel, stationId);
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

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setFailDate", Date.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel, failDate);
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

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setFailReason", String.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel, failReason);
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

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setUsedDate", Date.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel, usedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getHandOverId() {
		return _handOverId;
	}

	@Override
	public void setHandOverId(Long handOverId) {
		_handOverId = handOverId;

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setHandOverId", Long.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel, handOverId);
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

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setQuantity", Double.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel, quantity);
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

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitPrice", Double.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel, unitPrice);
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

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel,
					description);
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

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setUpgradeParentId", Long.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel,
					upgradeParentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getParentId() {
		return _parentId;
	}

	@Override
	public void setParentId(Long parentId) {
		_parentId = parentId;

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setParentId", Long.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel, parentId);
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

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", Long.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel, groupId);
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

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setTimeRetrieve", Date.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel,
					timeRetrieve);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getStatusId() {
		return _statusId;
	}

	@Override
	public void setStatusId(Long statusId) {
		_statusId = statusId;

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusId", Long.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel, statusId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getMark() {
		return _mark;
	}

	@Override
	public void setMark(Long mark) {
		_mark = mark;

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setMark", Long.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel, mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getOldStatusId() {
		return _oldStatusId;
	}

	@Override
	public void setOldStatusId(Long oldStatusId) {
		_oldStatusId = oldStatusId;

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setOldStatusId", Long.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel,
					oldStatusId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getPreCatEmployeeId() {
		return _preCatEmployeeId;
	}

	@Override
	public void setPreCatEmployeeId(Long preCatEmployeeId) {
		_preCatEmployeeId = preCatEmployeeId;

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setPreCatEmployeeId",
						Long.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel,
					preCatEmployeeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getPercentQuality() {
		return _percentQuality;
	}

	@Override
	public void setPercentQuality(Long percentQuality) {
		_percentQuality = percentQuality;

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setPercentQuality", Long.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel,
					percentQuality);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getWithdrawPrice() {
		return _withdrawPrice;
	}

	@Override
	public void setWithdrawPrice(Long withdrawPrice) {
		_withdrawPrice = withdrawPrice;

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setWithdrawPrice", Long.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel,
					withdrawPrice);
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

		if (_assetManageReqHandleEntityRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setDeliveryNoteId", Long.class);

				method.invoke(_assetManageReqHandleEntityRemoteModel,
					deliveryNoteId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAssetManageReqHandleEntityRemoteModel() {
		return _assetManageReqHandleEntityRemoteModel;
	}

	public void setAssetManageReqHandleEntityRemoteModel(
		BaseModel<?> assetManageReqHandleEntityRemoteModel) {
		_assetManageReqHandleEntityRemoteModel = assetManageReqHandleEntityRemoteModel;
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

		Class<?> remoteModelClass = _assetManageReqHandleEntityRemoteModel.getClass();

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

		Object returnValue = method.invoke(_assetManageReqHandleEntityRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AssetManageReqHandleEntityLocalServiceUtil.addAssetManageReqHandleEntity(this);
		}
		else {
			AssetManageReqHandleEntityLocalServiceUtil.updateAssetManageReqHandleEntity(this);
		}
	}

	@Override
	public AssetManageReqHandleEntity toEscapedModel() {
		return (AssetManageReqHandleEntity)ProxyUtil.newProxyInstance(AssetManageReqHandleEntity.class.getClassLoader(),
			new Class[] { AssetManageReqHandleEntity.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AssetManageReqHandleEntityClp clone = new AssetManageReqHandleEntityClp();

		clone.setId(getId());
		clone.setHandleId(getHandleId());
		clone.setMerEntityId(getMerEntityId());
		clone.setStatus(getStatus());
		clone.setStationId(getStationId());
		clone.setFailDate(getFailDate());
		clone.setFailReason(getFailReason());
		clone.setUsedDate(getUsedDate());
		clone.setHandOverId(getHandOverId());
		clone.setQuantity(getQuantity());
		clone.setUnitPrice(getUnitPrice());
		clone.setDescription(getDescription());
		clone.setUpgradeParentId(getUpgradeParentId());
		clone.setParentId(getParentId());
		clone.setGroupId(getGroupId());
		clone.setTimeRetrieve(getTimeRetrieve());
		clone.setStatusId(getStatusId());
		clone.setMark(getMark());
		clone.setOldStatusId(getOldStatusId());
		clone.setPreCatEmployeeId(getPreCatEmployeeId());
		clone.setPercentQuality(getPercentQuality());
		clone.setWithdrawPrice(getWithdrawPrice());
		clone.setDeliveryNoteId(getDeliveryNoteId());

		return clone;
	}

	@Override
	public int compareTo(AssetManageReqHandleEntity assetManageReqHandleEntity) {
		long primaryKey = assetManageReqHandleEntity.getPrimaryKey();

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

		if (!(obj instanceof AssetManageReqHandleEntityClp)) {
			return false;
		}

		AssetManageReqHandleEntityClp assetManageReqHandleEntity = (AssetManageReqHandleEntityClp)obj;

		long primaryKey = assetManageReqHandleEntity.getPrimaryKey();

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
		StringBundler sb = new StringBundler(47);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", handleId=");
		sb.append(getHandleId());
		sb.append(", merEntityId=");
		sb.append(getMerEntityId());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", stationId=");
		sb.append(getStationId());
		sb.append(", failDate=");
		sb.append(getFailDate());
		sb.append(", failReason=");
		sb.append(getFailReason());
		sb.append(", usedDate=");
		sb.append(getUsedDate());
		sb.append(", handOverId=");
		sb.append(getHandOverId());
		sb.append(", quantity=");
		sb.append(getQuantity());
		sb.append(", unitPrice=");
		sb.append(getUnitPrice());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", upgradeParentId=");
		sb.append(getUpgradeParentId());
		sb.append(", parentId=");
		sb.append(getParentId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", timeRetrieve=");
		sb.append(getTimeRetrieve());
		sb.append(", statusId=");
		sb.append(getStatusId());
		sb.append(", mark=");
		sb.append(getMark());
		sb.append(", oldStatusId=");
		sb.append(getOldStatusId());
		sb.append(", preCatEmployeeId=");
		sb.append(getPreCatEmployeeId());
		sb.append(", percentQuality=");
		sb.append(getPercentQuality());
		sb.append(", withdrawPrice=");
		sb.append(getWithdrawPrice());
		sb.append(", deliveryNoteId=");
		sb.append(getDeliveryNoteId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(73);

		sb.append("<model><model-name>");
		sb.append("com.viettel.ams.core.model.AssetManageReqHandleEntity");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>handleId</column-name><column-value><![CDATA[");
		sb.append(getHandleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>merEntityId</column-name><column-value><![CDATA[");
		sb.append(getMerEntityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
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
			"<column><column-name>handOverId</column-name><column-value><![CDATA[");
		sb.append(getHandOverId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantity</column-name><column-value><![CDATA[");
		sb.append(getQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitPrice</column-name><column-value><![CDATA[");
		sb.append(getUnitPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>upgradeParentId</column-name><column-value><![CDATA[");
		sb.append(getUpgradeParentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentId</column-name><column-value><![CDATA[");
		sb.append(getParentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeRetrieve</column-name><column-value><![CDATA[");
		sb.append(getTimeRetrieve());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusId</column-name><column-value><![CDATA[");
		sb.append(getStatusId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mark</column-name><column-value><![CDATA[");
		sb.append(getMark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oldStatusId</column-name><column-value><![CDATA[");
		sb.append(getOldStatusId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preCatEmployeeId</column-name><column-value><![CDATA[");
		sb.append(getPreCatEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>percentQuality</column-name><column-value><![CDATA[");
		sb.append(getPercentQuality());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>withdrawPrice</column-name><column-value><![CDATA[");
		sb.append(getWithdrawPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deliveryNoteId</column-name><column-value><![CDATA[");
		sb.append(getDeliveryNoteId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private Long _handleId;
	private Long _merEntityId;
	private Long _status;
	private Long _stationId;
	private Date _failDate;
	private String _failReason;
	private Date _usedDate;
	private Long _handOverId;
	private Double _quantity;
	private Double _unitPrice;
	private String _description;
	private Long _upgradeParentId;
	private Long _parentId;
	private Long _groupId;
	private Date _timeRetrieve;
	private Long _statusId;
	private Long _mark;
	private Long _oldStatusId;
	private Long _preCatEmployeeId;
	private Long _percentQuality;
	private Long _withdrawPrice;
	private Long _deliveryNoteId;
	private BaseModel<?> _assetManageReqHandleEntityRemoteModel;
	private Class<?> _clpSerializerClass = com.viettel.ams.core.service.ClpSerializer.class;
}
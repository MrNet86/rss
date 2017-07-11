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

import com.viettel.ams.core.service.ClpSerializer;
import com.viettel.ams.core.service.MerEntityLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MrNet
 */
public class MerEntityClp extends BaseModelImpl<MerEntity> implements MerEntity {
	public MerEntityClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MerEntity.class;
	}

	@Override
	public String getModelClassName() {
		return MerEntity.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _merEntityId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMerEntityId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _merEntityId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("merEntityId", getMerEntityId());
		attributes.put("serialNumber", getSerialNumber());
		attributes.put("unitPrice", getUnitPrice());
		attributes.put("merId", getMerId());
		attributes.put("contractid", getContractid());
		attributes.put("groupId", getGroupId());
		attributes.put("warehouseId", getWarehouseId());
		attributes.put("constructionId", getConstructionId());
		attributes.put("isMerchandise", getIsMerchandise());
		attributes.put("statusId", getStatusId());
		attributes.put("parentId", getParentId());
		attributes.put("userId", getUserId());
		attributes.put("upgradeParentId", getUpgradeParentId());
		attributes.put("partNumber", getPartNumber());
		attributes.put("count", getCount());
		attributes.put("isTemp", getIsTemp());
		attributes.put("path", getPath());
		attributes.put("originalPrice", getOriginalPrice());
		attributes.put("managerName", getManagerName());
		attributes.put("isExpense", getIsExpense());
		attributes.put("useGroupId", getUseGroupId());
		attributes.put("keySearch", getKeySearch());
		attributes.put("contractCode", getContractCode());
		attributes.put("description", getDescription());
		attributes.put("stationId", getStationId());
		attributes.put("isInventory", getIsInventory());
		attributes.put("entityType", getEntityType());
		attributes.put("quality", getQuality());
		attributes.put("catEmployeeId", getCatEmployeeId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("isLock", getIsLock());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long merEntityId = (Long)attributes.get("merEntityId");

		if (merEntityId != null) {
			setMerEntityId(merEntityId);
		}

		String serialNumber = (String)attributes.get("serialNumber");

		if (serialNumber != null) {
			setSerialNumber(serialNumber);
		}

		Double unitPrice = (Double)attributes.get("unitPrice");

		if (unitPrice != null) {
			setUnitPrice(unitPrice);
		}

		Long merId = (Long)attributes.get("merId");

		if (merId != null) {
			setMerId(merId);
		}

		Long contractid = (Long)attributes.get("contractid");

		if (contractid != null) {
			setContractid(contractid);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long warehouseId = (Long)attributes.get("warehouseId");

		if (warehouseId != null) {
			setWarehouseId(warehouseId);
		}

		Long constructionId = (Long)attributes.get("constructionId");

		if (constructionId != null) {
			setConstructionId(constructionId);
		}

		Long isMerchandise = (Long)attributes.get("isMerchandise");

		if (isMerchandise != null) {
			setIsMerchandise(isMerchandise);
		}

		Long statusId = (Long)attributes.get("statusId");

		if (statusId != null) {
			setStatusId(statusId);
		}

		Long parentId = (Long)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long upgradeParentId = (Long)attributes.get("upgradeParentId");

		if (upgradeParentId != null) {
			setUpgradeParentId(upgradeParentId);
		}

		String partNumber = (String)attributes.get("partNumber");

		if (partNumber != null) {
			setPartNumber(partNumber);
		}

		Double count = (Double)attributes.get("count");

		if (count != null) {
			setCount(count);
		}

		Long isTemp = (Long)attributes.get("isTemp");

		if (isTemp != null) {
			setIsTemp(isTemp);
		}

		String path = (String)attributes.get("path");

		if (path != null) {
			setPath(path);
		}

		Double originalPrice = (Double)attributes.get("originalPrice");

		if (originalPrice != null) {
			setOriginalPrice(originalPrice);
		}

		String managerName = (String)attributes.get("managerName");

		if (managerName != null) {
			setManagerName(managerName);
		}

		Long isExpense = (Long)attributes.get("isExpense");

		if (isExpense != null) {
			setIsExpense(isExpense);
		}

		Long useGroupId = (Long)attributes.get("useGroupId");

		if (useGroupId != null) {
			setUseGroupId(useGroupId);
		}

		Long keySearch = (Long)attributes.get("keySearch");

		if (keySearch != null) {
			setKeySearch(keySearch);
		}

		String contractCode = (String)attributes.get("contractCode");

		if (contractCode != null) {
			setContractCode(contractCode);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long stationId = (Long)attributes.get("stationId");

		if (stationId != null) {
			setStationId(stationId);
		}

		Long isInventory = (Long)attributes.get("isInventory");

		if (isInventory != null) {
			setIsInventory(isInventory);
		}

		Long entityType = (Long)attributes.get("entityType");

		if (entityType != null) {
			setEntityType(entityType);
		}

		Long quality = (Long)attributes.get("quality");

		if (quality != null) {
			setQuality(quality);
		}

		Long catEmployeeId = (Long)attributes.get("catEmployeeId");

		if (catEmployeeId != null) {
			setCatEmployeeId(catEmployeeId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long isLock = (Long)attributes.get("isLock");

		if (isLock != null) {
			setIsLock(isLock);
		}
	}

	@Override
	public long getMerEntityId() {
		return _merEntityId;
	}

	@Override
	public void setMerEntityId(long merEntityId) {
		_merEntityId = merEntityId;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setMerEntityId", long.class);

				method.invoke(_merEntityRemoteModel, merEntityId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSerialNumber() {
		return _serialNumber;
	}

	@Override
	public void setSerialNumber(String serialNumber) {
		_serialNumber = serialNumber;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setSerialNumber", String.class);

				method.invoke(_merEntityRemoteModel, serialNumber);
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

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitPrice", Double.class);

				method.invoke(_merEntityRemoteModel, unitPrice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getMerId() {
		return _merId;
	}

	@Override
	public void setMerId(Long merId) {
		_merId = merId;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setMerId", Long.class);

				method.invoke(_merEntityRemoteModel, merId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getContractid() {
		return _contractid;
	}

	@Override
	public void setContractid(Long contractid) {
		_contractid = contractid;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setContractid", Long.class);

				method.invoke(_merEntityRemoteModel, contractid);
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

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", Long.class);

				method.invoke(_merEntityRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getWarehouseId() {
		return _warehouseId;
	}

	@Override
	public void setWarehouseId(Long warehouseId) {
		_warehouseId = warehouseId;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setWarehouseId", Long.class);

				method.invoke(_merEntityRemoteModel, warehouseId);
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

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setConstructionId", Long.class);

				method.invoke(_merEntityRemoteModel, constructionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getIsMerchandise() {
		return _isMerchandise;
	}

	@Override
	public void setIsMerchandise(Long isMerchandise) {
		_isMerchandise = isMerchandise;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setIsMerchandise", Long.class);

				method.invoke(_merEntityRemoteModel, isMerchandise);
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

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusId", Long.class);

				method.invoke(_merEntityRemoteModel, statusId);
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

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setParentId", Long.class);

				method.invoke(_merEntityRemoteModel, parentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(Long userId) {
		_userId = userId;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", Long.class);

				method.invoke(_merEntityRemoteModel, userId);
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

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setUpgradeParentId", Long.class);

				method.invoke(_merEntityRemoteModel, upgradeParentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPartNumber() {
		return _partNumber;
	}

	@Override
	public void setPartNumber(String partNumber) {
		_partNumber = partNumber;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setPartNumber", String.class);

				method.invoke(_merEntityRemoteModel, partNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Double getCount() {
		return _count;
	}

	@Override
	public void setCount(Double count) {
		_count = count;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setCount", Double.class);

				method.invoke(_merEntityRemoteModel, count);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getIsTemp() {
		return _isTemp;
	}

	@Override
	public void setIsTemp(Long isTemp) {
		_isTemp = isTemp;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setIsTemp", Long.class);

				method.invoke(_merEntityRemoteModel, isTemp);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPath() {
		return _path;
	}

	@Override
	public void setPath(String path) {
		_path = path;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setPath", String.class);

				method.invoke(_merEntityRemoteModel, path);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Double getOriginalPrice() {
		return _originalPrice;
	}

	@Override
	public void setOriginalPrice(Double originalPrice) {
		_originalPrice = originalPrice;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setOriginalPrice", Double.class);

				method.invoke(_merEntityRemoteModel, originalPrice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getManagerName() {
		return _managerName;
	}

	@Override
	public void setManagerName(String managerName) {
		_managerName = managerName;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setManagerName", String.class);

				method.invoke(_merEntityRemoteModel, managerName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getIsExpense() {
		return _isExpense;
	}

	@Override
	public void setIsExpense(Long isExpense) {
		_isExpense = isExpense;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setIsExpense", Long.class);

				method.invoke(_merEntityRemoteModel, isExpense);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getUseGroupId() {
		return _useGroupId;
	}

	@Override
	public void setUseGroupId(Long useGroupId) {
		_useGroupId = useGroupId;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setUseGroupId", Long.class);

				method.invoke(_merEntityRemoteModel, useGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getKeySearch() {
		return _keySearch;
	}

	@Override
	public void setKeySearch(Long keySearch) {
		_keySearch = keySearch;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setKeySearch", Long.class);

				method.invoke(_merEntityRemoteModel, keySearch);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContractCode() {
		return _contractCode;
	}

	@Override
	public void setContractCode(String contractCode) {
		_contractCode = contractCode;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setContractCode", String.class);

				method.invoke(_merEntityRemoteModel, contractCode);
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

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_merEntityRemoteModel, description);
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

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setStationId", Long.class);

				method.invoke(_merEntityRemoteModel, stationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getIsInventory() {
		return _isInventory;
	}

	@Override
	public void setIsInventory(Long isInventory) {
		_isInventory = isInventory;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setIsInventory", Long.class);

				method.invoke(_merEntityRemoteModel, isInventory);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getEntityType() {
		return _entityType;
	}

	@Override
	public void setEntityType(Long entityType) {
		_entityType = entityType;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setEntityType", Long.class);

				method.invoke(_merEntityRemoteModel, entityType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getQuality() {
		return _quality;
	}

	@Override
	public void setQuality(Long quality) {
		_quality = quality;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setQuality", Long.class);

				method.invoke(_merEntityRemoteModel, quality);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getCatEmployeeId() {
		return _catEmployeeId;
	}

	@Override
	public void setCatEmployeeId(Long catEmployeeId) {
		_catEmployeeId = catEmployeeId;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setCatEmployeeId", Long.class);

				method.invoke(_merEntityRemoteModel, catEmployeeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_merEntityRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getIsLock() {
		return _isLock;
	}

	@Override
	public void setIsLock(Long isLock) {
		_isLock = isLock;

		if (_merEntityRemoteModel != null) {
			try {
				Class<?> clazz = _merEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setIsLock", Long.class);

				method.invoke(_merEntityRemoteModel, isLock);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMerEntityRemoteModel() {
		return _merEntityRemoteModel;
	}

	public void setMerEntityRemoteModel(BaseModel<?> merEntityRemoteModel) {
		_merEntityRemoteModel = merEntityRemoteModel;
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

		Class<?> remoteModelClass = _merEntityRemoteModel.getClass();

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

		Object returnValue = method.invoke(_merEntityRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MerEntityLocalServiceUtil.addMerEntity(this);
		}
		else {
			MerEntityLocalServiceUtil.updateMerEntity(this);
		}
	}

	@Override
	public MerEntity toEscapedModel() {
		return (MerEntity)ProxyUtil.newProxyInstance(MerEntity.class.getClassLoader(),
			new Class[] { MerEntity.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MerEntityClp clone = new MerEntityClp();

		clone.setMerEntityId(getMerEntityId());
		clone.setSerialNumber(getSerialNumber());
		clone.setUnitPrice(getUnitPrice());
		clone.setMerId(getMerId());
		clone.setContractid(getContractid());
		clone.setGroupId(getGroupId());
		clone.setWarehouseId(getWarehouseId());
		clone.setConstructionId(getConstructionId());
		clone.setIsMerchandise(getIsMerchandise());
		clone.setStatusId(getStatusId());
		clone.setParentId(getParentId());
		clone.setUserId(getUserId());
		clone.setUpgradeParentId(getUpgradeParentId());
		clone.setPartNumber(getPartNumber());
		clone.setCount(getCount());
		clone.setIsTemp(getIsTemp());
		clone.setPath(getPath());
		clone.setOriginalPrice(getOriginalPrice());
		clone.setManagerName(getManagerName());
		clone.setIsExpense(getIsExpense());
		clone.setUseGroupId(getUseGroupId());
		clone.setKeySearch(getKeySearch());
		clone.setContractCode(getContractCode());
		clone.setDescription(getDescription());
		clone.setStationId(getStationId());
		clone.setIsInventory(getIsInventory());
		clone.setEntityType(getEntityType());
		clone.setQuality(getQuality());
		clone.setCatEmployeeId(getCatEmployeeId());
		clone.setCreatedDate(getCreatedDate());
		clone.setIsLock(getIsLock());

		return clone;
	}

	@Override
	public int compareTo(MerEntity merEntity) {
		long primaryKey = merEntity.getPrimaryKey();

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

		if (!(obj instanceof MerEntityClp)) {
			return false;
		}

		MerEntityClp merEntity = (MerEntityClp)obj;

		long primaryKey = merEntity.getPrimaryKey();

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
		StringBundler sb = new StringBundler(63);

		sb.append("{merEntityId=");
		sb.append(getMerEntityId());
		sb.append(", serialNumber=");
		sb.append(getSerialNumber());
		sb.append(", unitPrice=");
		sb.append(getUnitPrice());
		sb.append(", merId=");
		sb.append(getMerId());
		sb.append(", contractid=");
		sb.append(getContractid());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", warehouseId=");
		sb.append(getWarehouseId());
		sb.append(", constructionId=");
		sb.append(getConstructionId());
		sb.append(", isMerchandise=");
		sb.append(getIsMerchandise());
		sb.append(", statusId=");
		sb.append(getStatusId());
		sb.append(", parentId=");
		sb.append(getParentId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", upgradeParentId=");
		sb.append(getUpgradeParentId());
		sb.append(", partNumber=");
		sb.append(getPartNumber());
		sb.append(", count=");
		sb.append(getCount());
		sb.append(", isTemp=");
		sb.append(getIsTemp());
		sb.append(", path=");
		sb.append(getPath());
		sb.append(", originalPrice=");
		sb.append(getOriginalPrice());
		sb.append(", managerName=");
		sb.append(getManagerName());
		sb.append(", isExpense=");
		sb.append(getIsExpense());
		sb.append(", useGroupId=");
		sb.append(getUseGroupId());
		sb.append(", keySearch=");
		sb.append(getKeySearch());
		sb.append(", contractCode=");
		sb.append(getContractCode());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", stationId=");
		sb.append(getStationId());
		sb.append(", isInventory=");
		sb.append(getIsInventory());
		sb.append(", entityType=");
		sb.append(getEntityType());
		sb.append(", quality=");
		sb.append(getQuality());
		sb.append(", catEmployeeId=");
		sb.append(getCatEmployeeId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", isLock=");
		sb.append(getIsLock());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(97);

		sb.append("<model><model-name>");
		sb.append("com.viettel.ams.core.model.MerEntity");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>merEntityId</column-name><column-value><![CDATA[");
		sb.append(getMerEntityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serialNumber</column-name><column-value><![CDATA[");
		sb.append(getSerialNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitPrice</column-name><column-value><![CDATA[");
		sb.append(getUnitPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>merId</column-name><column-value><![CDATA[");
		sb.append(getMerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contractid</column-name><column-value><![CDATA[");
		sb.append(getContractid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>warehouseId</column-name><column-value><![CDATA[");
		sb.append(getWarehouseId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>constructionId</column-name><column-value><![CDATA[");
		sb.append(getConstructionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isMerchandise</column-name><column-value><![CDATA[");
		sb.append(getIsMerchandise());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusId</column-name><column-value><![CDATA[");
		sb.append(getStatusId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentId</column-name><column-value><![CDATA[");
		sb.append(getParentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>upgradeParentId</column-name><column-value><![CDATA[");
		sb.append(getUpgradeParentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>partNumber</column-name><column-value><![CDATA[");
		sb.append(getPartNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>count</column-name><column-value><![CDATA[");
		sb.append(getCount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isTemp</column-name><column-value><![CDATA[");
		sb.append(getIsTemp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>path</column-name><column-value><![CDATA[");
		sb.append(getPath());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>originalPrice</column-name><column-value><![CDATA[");
		sb.append(getOriginalPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>managerName</column-name><column-value><![CDATA[");
		sb.append(getManagerName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isExpense</column-name><column-value><![CDATA[");
		sb.append(getIsExpense());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>useGroupId</column-name><column-value><![CDATA[");
		sb.append(getUseGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keySearch</column-name><column-value><![CDATA[");
		sb.append(getKeySearch());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contractCode</column-name><column-value><![CDATA[");
		sb.append(getContractCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stationId</column-name><column-value><![CDATA[");
		sb.append(getStationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isInventory</column-name><column-value><![CDATA[");
		sb.append(getIsInventory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>entityType</column-name><column-value><![CDATA[");
		sb.append(getEntityType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quality</column-name><column-value><![CDATA[");
		sb.append(getQuality());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>catEmployeeId</column-name><column-value><![CDATA[");
		sb.append(getCatEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isLock</column-name><column-value><![CDATA[");
		sb.append(getIsLock());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _merEntityId;
	private String _serialNumber;
	private Double _unitPrice;
	private Long _merId;
	private Long _contractid;
	private Long _groupId;
	private Long _warehouseId;
	private Long _constructionId;
	private Long _isMerchandise;
	private Long _statusId;
	private Long _parentId;
	private Long _userId;
	private Long _upgradeParentId;
	private String _partNumber;
	private Double _count;
	private Long _isTemp;
	private String _path;
	private Double _originalPrice;
	private String _managerName;
	private Long _isExpense;
	private Long _useGroupId;
	private Long _keySearch;
	private String _contractCode;
	private String _description;
	private Long _stationId;
	private Long _isInventory;
	private Long _entityType;
	private Long _quality;
	private Long _catEmployeeId;
	private Date _createdDate;
	private Long _isLock;
	private BaseModel<?> _merEntityRemoteModel;
	private Class<?> _clpSerializerClass = com.viettel.ams.core.service.ClpSerializer.class;
}
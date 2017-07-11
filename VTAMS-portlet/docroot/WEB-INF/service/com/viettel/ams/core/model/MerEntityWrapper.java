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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MerEntity}.
 * </p>
 *
 * @author MrNet
 * @see MerEntity
 * @generated
 */
public class MerEntityWrapper implements MerEntity, ModelWrapper<MerEntity> {
	public MerEntityWrapper(MerEntity merEntity) {
		_merEntity = merEntity;
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

	/**
	* Returns the primary key of this mer entity.
	*
	* @return the primary key of this mer entity
	*/
	@Override
	public long getPrimaryKey() {
		return _merEntity.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mer entity.
	*
	* @param primaryKey the primary key of this mer entity
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_merEntity.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the mer entity ID of this mer entity.
	*
	* @return the mer entity ID of this mer entity
	*/
	@Override
	public long getMerEntityId() {
		return _merEntity.getMerEntityId();
	}

	/**
	* Sets the mer entity ID of this mer entity.
	*
	* @param merEntityId the mer entity ID of this mer entity
	*/
	@Override
	public void setMerEntityId(long merEntityId) {
		_merEntity.setMerEntityId(merEntityId);
	}

	/**
	* Returns the serial number of this mer entity.
	*
	* @return the serial number of this mer entity
	*/
	@Override
	public java.lang.String getSerialNumber() {
		return _merEntity.getSerialNumber();
	}

	/**
	* Sets the serial number of this mer entity.
	*
	* @param serialNumber the serial number of this mer entity
	*/
	@Override
	public void setSerialNumber(java.lang.String serialNumber) {
		_merEntity.setSerialNumber(serialNumber);
	}

	/**
	* Returns the unit price of this mer entity.
	*
	* @return the unit price of this mer entity
	*/
	@Override
	public java.lang.Double getUnitPrice() {
		return _merEntity.getUnitPrice();
	}

	/**
	* Sets the unit price of this mer entity.
	*
	* @param unitPrice the unit price of this mer entity
	*/
	@Override
	public void setUnitPrice(java.lang.Double unitPrice) {
		_merEntity.setUnitPrice(unitPrice);
	}

	/**
	* Returns the mer ID of this mer entity.
	*
	* @return the mer ID of this mer entity
	*/
	@Override
	public java.lang.Long getMerId() {
		return _merEntity.getMerId();
	}

	/**
	* Sets the mer ID of this mer entity.
	*
	* @param merId the mer ID of this mer entity
	*/
	@Override
	public void setMerId(java.lang.Long merId) {
		_merEntity.setMerId(merId);
	}

	/**
	* Returns the contractid of this mer entity.
	*
	* @return the contractid of this mer entity
	*/
	@Override
	public java.lang.Long getContractid() {
		return _merEntity.getContractid();
	}

	/**
	* Sets the contractid of this mer entity.
	*
	* @param contractid the contractid of this mer entity
	*/
	@Override
	public void setContractid(java.lang.Long contractid) {
		_merEntity.setContractid(contractid);
	}

	/**
	* Returns the group ID of this mer entity.
	*
	* @return the group ID of this mer entity
	*/
	@Override
	public java.lang.Long getGroupId() {
		return _merEntity.getGroupId();
	}

	/**
	* Sets the group ID of this mer entity.
	*
	* @param groupId the group ID of this mer entity
	*/
	@Override
	public void setGroupId(java.lang.Long groupId) {
		_merEntity.setGroupId(groupId);
	}

	/**
	* Returns the warehouse ID of this mer entity.
	*
	* @return the warehouse ID of this mer entity
	*/
	@Override
	public java.lang.Long getWarehouseId() {
		return _merEntity.getWarehouseId();
	}

	/**
	* Sets the warehouse ID of this mer entity.
	*
	* @param warehouseId the warehouse ID of this mer entity
	*/
	@Override
	public void setWarehouseId(java.lang.Long warehouseId) {
		_merEntity.setWarehouseId(warehouseId);
	}

	/**
	* Returns the construction ID of this mer entity.
	*
	* @return the construction ID of this mer entity
	*/
	@Override
	public java.lang.Long getConstructionId() {
		return _merEntity.getConstructionId();
	}

	/**
	* Sets the construction ID of this mer entity.
	*
	* @param constructionId the construction ID of this mer entity
	*/
	@Override
	public void setConstructionId(java.lang.Long constructionId) {
		_merEntity.setConstructionId(constructionId);
	}

	/**
	* Returns the is merchandise of this mer entity.
	*
	* @return the is merchandise of this mer entity
	*/
	@Override
	public java.lang.Long getIsMerchandise() {
		return _merEntity.getIsMerchandise();
	}

	/**
	* Sets the is merchandise of this mer entity.
	*
	* @param isMerchandise the is merchandise of this mer entity
	*/
	@Override
	public void setIsMerchandise(java.lang.Long isMerchandise) {
		_merEntity.setIsMerchandise(isMerchandise);
	}

	/**
	* Returns the status ID of this mer entity.
	*
	* @return the status ID of this mer entity
	*/
	@Override
	public java.lang.Long getStatusId() {
		return _merEntity.getStatusId();
	}

	/**
	* Sets the status ID of this mer entity.
	*
	* @param statusId the status ID of this mer entity
	*/
	@Override
	public void setStatusId(java.lang.Long statusId) {
		_merEntity.setStatusId(statusId);
	}

	/**
	* Returns the parent ID of this mer entity.
	*
	* @return the parent ID of this mer entity
	*/
	@Override
	public java.lang.Long getParentId() {
		return _merEntity.getParentId();
	}

	/**
	* Sets the parent ID of this mer entity.
	*
	* @param parentId the parent ID of this mer entity
	*/
	@Override
	public void setParentId(java.lang.Long parentId) {
		_merEntity.setParentId(parentId);
	}

	/**
	* Returns the user ID of this mer entity.
	*
	* @return the user ID of this mer entity
	*/
	@Override
	public java.lang.Long getUserId() {
		return _merEntity.getUserId();
	}

	/**
	* Sets the user ID of this mer entity.
	*
	* @param userId the user ID of this mer entity
	*/
	@Override
	public void setUserId(java.lang.Long userId) {
		_merEntity.setUserId(userId);
	}

	/**
	* Returns the upgrade parent ID of this mer entity.
	*
	* @return the upgrade parent ID of this mer entity
	*/
	@Override
	public java.lang.Long getUpgradeParentId() {
		return _merEntity.getUpgradeParentId();
	}

	/**
	* Sets the upgrade parent ID of this mer entity.
	*
	* @param upgradeParentId the upgrade parent ID of this mer entity
	*/
	@Override
	public void setUpgradeParentId(java.lang.Long upgradeParentId) {
		_merEntity.setUpgradeParentId(upgradeParentId);
	}

	/**
	* Returns the part number of this mer entity.
	*
	* @return the part number of this mer entity
	*/
	@Override
	public java.lang.String getPartNumber() {
		return _merEntity.getPartNumber();
	}

	/**
	* Sets the part number of this mer entity.
	*
	* @param partNumber the part number of this mer entity
	*/
	@Override
	public void setPartNumber(java.lang.String partNumber) {
		_merEntity.setPartNumber(partNumber);
	}

	/**
	* Returns the count of this mer entity.
	*
	* @return the count of this mer entity
	*/
	@Override
	public java.lang.Double getCount() {
		return _merEntity.getCount();
	}

	/**
	* Sets the count of this mer entity.
	*
	* @param count the count of this mer entity
	*/
	@Override
	public void setCount(java.lang.Double count) {
		_merEntity.setCount(count);
	}

	/**
	* Returns the is temp of this mer entity.
	*
	* @return the is temp of this mer entity
	*/
	@Override
	public java.lang.Long getIsTemp() {
		return _merEntity.getIsTemp();
	}

	/**
	* Sets the is temp of this mer entity.
	*
	* @param isTemp the is temp of this mer entity
	*/
	@Override
	public void setIsTemp(java.lang.Long isTemp) {
		_merEntity.setIsTemp(isTemp);
	}

	/**
	* Returns the path of this mer entity.
	*
	* @return the path of this mer entity
	*/
	@Override
	public java.lang.String getPath() {
		return _merEntity.getPath();
	}

	/**
	* Sets the path of this mer entity.
	*
	* @param path the path of this mer entity
	*/
	@Override
	public void setPath(java.lang.String path) {
		_merEntity.setPath(path);
	}

	/**
	* Returns the original price of this mer entity.
	*
	* @return the original price of this mer entity
	*/
	@Override
	public java.lang.Double getOriginalPrice() {
		return _merEntity.getOriginalPrice();
	}

	/**
	* Sets the original price of this mer entity.
	*
	* @param originalPrice the original price of this mer entity
	*/
	@Override
	public void setOriginalPrice(java.lang.Double originalPrice) {
		_merEntity.setOriginalPrice(originalPrice);
	}

	/**
	* Returns the manager name of this mer entity.
	*
	* @return the manager name of this mer entity
	*/
	@Override
	public java.lang.String getManagerName() {
		return _merEntity.getManagerName();
	}

	/**
	* Sets the manager name of this mer entity.
	*
	* @param managerName the manager name of this mer entity
	*/
	@Override
	public void setManagerName(java.lang.String managerName) {
		_merEntity.setManagerName(managerName);
	}

	/**
	* Returns the is expense of this mer entity.
	*
	* @return the is expense of this mer entity
	*/
	@Override
	public java.lang.Long getIsExpense() {
		return _merEntity.getIsExpense();
	}

	/**
	* Sets the is expense of this mer entity.
	*
	* @param isExpense the is expense of this mer entity
	*/
	@Override
	public void setIsExpense(java.lang.Long isExpense) {
		_merEntity.setIsExpense(isExpense);
	}

	/**
	* Returns the use group ID of this mer entity.
	*
	* @return the use group ID of this mer entity
	*/
	@Override
	public java.lang.Long getUseGroupId() {
		return _merEntity.getUseGroupId();
	}

	/**
	* Sets the use group ID of this mer entity.
	*
	* @param useGroupId the use group ID of this mer entity
	*/
	@Override
	public void setUseGroupId(java.lang.Long useGroupId) {
		_merEntity.setUseGroupId(useGroupId);
	}

	/**
	* Returns the key search of this mer entity.
	*
	* @return the key search of this mer entity
	*/
	@Override
	public java.lang.Long getKeySearch() {
		return _merEntity.getKeySearch();
	}

	/**
	* Sets the key search of this mer entity.
	*
	* @param keySearch the key search of this mer entity
	*/
	@Override
	public void setKeySearch(java.lang.Long keySearch) {
		_merEntity.setKeySearch(keySearch);
	}

	/**
	* Returns the contract code of this mer entity.
	*
	* @return the contract code of this mer entity
	*/
	@Override
	public java.lang.String getContractCode() {
		return _merEntity.getContractCode();
	}

	/**
	* Sets the contract code of this mer entity.
	*
	* @param contractCode the contract code of this mer entity
	*/
	@Override
	public void setContractCode(java.lang.String contractCode) {
		_merEntity.setContractCode(contractCode);
	}

	/**
	* Returns the description of this mer entity.
	*
	* @return the description of this mer entity
	*/
	@Override
	public java.lang.String getDescription() {
		return _merEntity.getDescription();
	}

	/**
	* Sets the description of this mer entity.
	*
	* @param description the description of this mer entity
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_merEntity.setDescription(description);
	}

	/**
	* Returns the station ID of this mer entity.
	*
	* @return the station ID of this mer entity
	*/
	@Override
	public java.lang.Long getStationId() {
		return _merEntity.getStationId();
	}

	/**
	* Sets the station ID of this mer entity.
	*
	* @param stationId the station ID of this mer entity
	*/
	@Override
	public void setStationId(java.lang.Long stationId) {
		_merEntity.setStationId(stationId);
	}

	/**
	* Returns the is inventory of this mer entity.
	*
	* @return the is inventory of this mer entity
	*/
	@Override
	public java.lang.Long getIsInventory() {
		return _merEntity.getIsInventory();
	}

	/**
	* Sets the is inventory of this mer entity.
	*
	* @param isInventory the is inventory of this mer entity
	*/
	@Override
	public void setIsInventory(java.lang.Long isInventory) {
		_merEntity.setIsInventory(isInventory);
	}

	/**
	* Returns the entity type of this mer entity.
	*
	* @return the entity type of this mer entity
	*/
	@Override
	public java.lang.Long getEntityType() {
		return _merEntity.getEntityType();
	}

	/**
	* Sets the entity type of this mer entity.
	*
	* @param entityType the entity type of this mer entity
	*/
	@Override
	public void setEntityType(java.lang.Long entityType) {
		_merEntity.setEntityType(entityType);
	}

	/**
	* Returns the quality of this mer entity.
	*
	* @return the quality of this mer entity
	*/
	@Override
	public java.lang.Long getQuality() {
		return _merEntity.getQuality();
	}

	/**
	* Sets the quality of this mer entity.
	*
	* @param quality the quality of this mer entity
	*/
	@Override
	public void setQuality(java.lang.Long quality) {
		_merEntity.setQuality(quality);
	}

	/**
	* Returns the cat employee ID of this mer entity.
	*
	* @return the cat employee ID of this mer entity
	*/
	@Override
	public java.lang.Long getCatEmployeeId() {
		return _merEntity.getCatEmployeeId();
	}

	/**
	* Sets the cat employee ID of this mer entity.
	*
	* @param catEmployeeId the cat employee ID of this mer entity
	*/
	@Override
	public void setCatEmployeeId(java.lang.Long catEmployeeId) {
		_merEntity.setCatEmployeeId(catEmployeeId);
	}

	/**
	* Returns the created date of this mer entity.
	*
	* @return the created date of this mer entity
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _merEntity.getCreatedDate();
	}

	/**
	* Sets the created date of this mer entity.
	*
	* @param createdDate the created date of this mer entity
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_merEntity.setCreatedDate(createdDate);
	}

	/**
	* Returns the is lock of this mer entity.
	*
	* @return the is lock of this mer entity
	*/
	@Override
	public java.lang.Long getIsLock() {
		return _merEntity.getIsLock();
	}

	/**
	* Sets the is lock of this mer entity.
	*
	* @param isLock the is lock of this mer entity
	*/
	@Override
	public void setIsLock(java.lang.Long isLock) {
		_merEntity.setIsLock(isLock);
	}

	@Override
	public boolean isNew() {
		return _merEntity.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_merEntity.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _merEntity.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_merEntity.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _merEntity.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _merEntity.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_merEntity.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _merEntity.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_merEntity.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_merEntity.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_merEntity.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MerEntityWrapper((MerEntity)_merEntity.clone());
	}

	@Override
	public int compareTo(com.viettel.ams.core.model.MerEntity merEntity) {
		return _merEntity.compareTo(merEntity);
	}

	@Override
	public int hashCode() {
		return _merEntity.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.viettel.ams.core.model.MerEntity> toCacheModel() {
		return _merEntity.toCacheModel();
	}

	@Override
	public com.viettel.ams.core.model.MerEntity toEscapedModel() {
		return new MerEntityWrapper(_merEntity.toEscapedModel());
	}

	@Override
	public com.viettel.ams.core.model.MerEntity toUnescapedModel() {
		return new MerEntityWrapper(_merEntity.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _merEntity.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _merEntity.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_merEntity.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MerEntityWrapper)) {
			return false;
		}

		MerEntityWrapper merEntityWrapper = (MerEntityWrapper)obj;

		if (Validator.equals(_merEntity, merEntityWrapper._merEntity)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MerEntity getWrappedMerEntity() {
		return _merEntity;
	}

	@Override
	public MerEntity getWrappedModel() {
		return _merEntity;
	}

	@Override
	public void resetOriginalValues() {
		_merEntity.resetOriginalValues();
	}

	private MerEntity _merEntity;
}
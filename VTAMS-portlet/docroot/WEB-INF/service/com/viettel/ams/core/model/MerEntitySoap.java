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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.viettel.ams.core.service.http.MerEntityServiceSoap}.
 *
 * @author MrNet
 * @see com.viettel.ams.core.service.http.MerEntityServiceSoap
 * @generated
 */
public class MerEntitySoap implements Serializable {
	public static MerEntitySoap toSoapModel(MerEntity model) {
		MerEntitySoap soapModel = new MerEntitySoap();

		soapModel.setMerEntityId(model.getMerEntityId());
		soapModel.setSerialNumber(model.getSerialNumber());
		soapModel.setUnitPrice(model.getUnitPrice());
		soapModel.setMerId(model.getMerId());
		soapModel.setContractid(model.getContractid());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setWarehouseId(model.getWarehouseId());
		soapModel.setConstructionId(model.getConstructionId());
		soapModel.setIsMerchandise(model.getIsMerchandise());
		soapModel.setStatusId(model.getStatusId());
		soapModel.setParentId(model.getParentId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUpgradeParentId(model.getUpgradeParentId());
		soapModel.setPartNumber(model.getPartNumber());
		soapModel.setCount(model.getCount());
		soapModel.setIsTemp(model.getIsTemp());
		soapModel.setPath(model.getPath());
		soapModel.setOriginalPrice(model.getOriginalPrice());
		soapModel.setManagerName(model.getManagerName());
		soapModel.setIsExpense(model.getIsExpense());
		soapModel.setUseGroupId(model.getUseGroupId());
		soapModel.setKeySearch(model.getKeySearch());
		soapModel.setContractCode(model.getContractCode());
		soapModel.setDescription(model.getDescription());
		soapModel.setStationId(model.getStationId());
		soapModel.setIsInventory(model.getIsInventory());
		soapModel.setEntityType(model.getEntityType());
		soapModel.setQuality(model.getQuality());
		soapModel.setCatEmployeeId(model.getCatEmployeeId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setIsLock(model.getIsLock());

		return soapModel;
	}

	public static MerEntitySoap[] toSoapModels(MerEntity[] models) {
		MerEntitySoap[] soapModels = new MerEntitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MerEntitySoap[][] toSoapModels(MerEntity[][] models) {
		MerEntitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MerEntitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new MerEntitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MerEntitySoap[] toSoapModels(List<MerEntity> models) {
		List<MerEntitySoap> soapModels = new ArrayList<MerEntitySoap>(models.size());

		for (MerEntity model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MerEntitySoap[soapModels.size()]);
	}

	public MerEntitySoap() {
	}

	public long getPrimaryKey() {
		return _merEntityId;
	}

	public void setPrimaryKey(long pk) {
		setMerEntityId(pk);
	}

	public long getMerEntityId() {
		return _merEntityId;
	}

	public void setMerEntityId(long merEntityId) {
		_merEntityId = merEntityId;
	}

	public String getSerialNumber() {
		return _serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		_serialNumber = serialNumber;
	}

	public Double getUnitPrice() {
		return _unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		_unitPrice = unitPrice;
	}

	public Long getMerId() {
		return _merId;
	}

	public void setMerId(Long merId) {
		_merId = merId;
	}

	public Long getContractid() {
		return _contractid;
	}

	public void setContractid(Long contractid) {
		_contractid = contractid;
	}

	public Long getGroupId() {
		return _groupId;
	}

	public void setGroupId(Long groupId) {
		_groupId = groupId;
	}

	public Long getWarehouseId() {
		return _warehouseId;
	}

	public void setWarehouseId(Long warehouseId) {
		_warehouseId = warehouseId;
	}

	public Long getConstructionId() {
		return _constructionId;
	}

	public void setConstructionId(Long constructionId) {
		_constructionId = constructionId;
	}

	public Long getIsMerchandise() {
		return _isMerchandise;
	}

	public void setIsMerchandise(Long isMerchandise) {
		_isMerchandise = isMerchandise;
	}

	public Long getStatusId() {
		return _statusId;
	}

	public void setStatusId(Long statusId) {
		_statusId = statusId;
	}

	public Long getParentId() {
		return _parentId;
	}

	public void setParentId(Long parentId) {
		_parentId = parentId;
	}

	public Long getUserId() {
		return _userId;
	}

	public void setUserId(Long userId) {
		_userId = userId;
	}

	public Long getUpgradeParentId() {
		return _upgradeParentId;
	}

	public void setUpgradeParentId(Long upgradeParentId) {
		_upgradeParentId = upgradeParentId;
	}

	public String getPartNumber() {
		return _partNumber;
	}

	public void setPartNumber(String partNumber) {
		_partNumber = partNumber;
	}

	public Double getCount() {
		return _count;
	}

	public void setCount(Double count) {
		_count = count;
	}

	public Long getIsTemp() {
		return _isTemp;
	}

	public void setIsTemp(Long isTemp) {
		_isTemp = isTemp;
	}

	public String getPath() {
		return _path;
	}

	public void setPath(String path) {
		_path = path;
	}

	public Double getOriginalPrice() {
		return _originalPrice;
	}

	public void setOriginalPrice(Double originalPrice) {
		_originalPrice = originalPrice;
	}

	public String getManagerName() {
		return _managerName;
	}

	public void setManagerName(String managerName) {
		_managerName = managerName;
	}

	public Long getIsExpense() {
		return _isExpense;
	}

	public void setIsExpense(Long isExpense) {
		_isExpense = isExpense;
	}

	public Long getUseGroupId() {
		return _useGroupId;
	}

	public void setUseGroupId(Long useGroupId) {
		_useGroupId = useGroupId;
	}

	public Long getKeySearch() {
		return _keySearch;
	}

	public void setKeySearch(Long keySearch) {
		_keySearch = keySearch;
	}

	public String getContractCode() {
		return _contractCode;
	}

	public void setContractCode(String contractCode) {
		_contractCode = contractCode;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Long getStationId() {
		return _stationId;
	}

	public void setStationId(Long stationId) {
		_stationId = stationId;
	}

	public Long getIsInventory() {
		return _isInventory;
	}

	public void setIsInventory(Long isInventory) {
		_isInventory = isInventory;
	}

	public Long getEntityType() {
		return _entityType;
	}

	public void setEntityType(Long entityType) {
		_entityType = entityType;
	}

	public Long getQuality() {
		return _quality;
	}

	public void setQuality(Long quality) {
		_quality = quality;
	}

	public Long getCatEmployeeId() {
		return _catEmployeeId;
	}

	public void setCatEmployeeId(Long catEmployeeId) {
		_catEmployeeId = catEmployeeId;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public Long getIsLock() {
		return _isLock;
	}

	public void setIsLock(Long isLock) {
		_isLock = isLock;
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
}
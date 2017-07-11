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

package com.viettel.ams.core.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.viettel.ams.core.model.MerEntity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MerEntity in entity cache.
 *
 * @author MrNet
 * @see MerEntity
 * @generated
 */
public class MerEntityCacheModel implements CacheModel<MerEntity>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(63);

		sb.append("{merEntityId=");
		sb.append(merEntityId);
		sb.append(", serialNumber=");
		sb.append(serialNumber);
		sb.append(", unitPrice=");
		sb.append(unitPrice);
		sb.append(", merId=");
		sb.append(merId);
		sb.append(", contractid=");
		sb.append(contractid);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", warehouseId=");
		sb.append(warehouseId);
		sb.append(", constructionId=");
		sb.append(constructionId);
		sb.append(", isMerchandise=");
		sb.append(isMerchandise);
		sb.append(", statusId=");
		sb.append(statusId);
		sb.append(", parentId=");
		sb.append(parentId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", upgradeParentId=");
		sb.append(upgradeParentId);
		sb.append(", partNumber=");
		sb.append(partNumber);
		sb.append(", count=");
		sb.append(count);
		sb.append(", isTemp=");
		sb.append(isTemp);
		sb.append(", path=");
		sb.append(path);
		sb.append(", originalPrice=");
		sb.append(originalPrice);
		sb.append(", managerName=");
		sb.append(managerName);
		sb.append(", isExpense=");
		sb.append(isExpense);
		sb.append(", useGroupId=");
		sb.append(useGroupId);
		sb.append(", keySearch=");
		sb.append(keySearch);
		sb.append(", contractCode=");
		sb.append(contractCode);
		sb.append(", description=");
		sb.append(description);
		sb.append(", stationId=");
		sb.append(stationId);
		sb.append(", isInventory=");
		sb.append(isInventory);
		sb.append(", entityType=");
		sb.append(entityType);
		sb.append(", quality=");
		sb.append(quality);
		sb.append(", catEmployeeId=");
		sb.append(catEmployeeId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", isLock=");
		sb.append(isLock);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MerEntity toEntityModel() {
		MerEntityImpl merEntityImpl = new MerEntityImpl();

		merEntityImpl.setMerEntityId(merEntityId);

		if (serialNumber == null) {
			merEntityImpl.setSerialNumber(StringPool.BLANK);
		}
		else {
			merEntityImpl.setSerialNumber(serialNumber);
		}

		merEntityImpl.setUnitPrice(unitPrice);
		merEntityImpl.setMerId(merId);
		merEntityImpl.setContractid(contractid);
		merEntityImpl.setGroupId(groupId);
		merEntityImpl.setWarehouseId(warehouseId);
		merEntityImpl.setConstructionId(constructionId);
		merEntityImpl.setIsMerchandise(isMerchandise);
		merEntityImpl.setStatusId(statusId);
		merEntityImpl.setParentId(parentId);
		merEntityImpl.setUserId(userId);
		merEntityImpl.setUpgradeParentId(upgradeParentId);

		if (partNumber == null) {
			merEntityImpl.setPartNumber(StringPool.BLANK);
		}
		else {
			merEntityImpl.setPartNumber(partNumber);
		}

		merEntityImpl.setCount(count);
		merEntityImpl.setIsTemp(isTemp);

		if (path == null) {
			merEntityImpl.setPath(StringPool.BLANK);
		}
		else {
			merEntityImpl.setPath(path);
		}

		merEntityImpl.setOriginalPrice(originalPrice);

		if (managerName == null) {
			merEntityImpl.setManagerName(StringPool.BLANK);
		}
		else {
			merEntityImpl.setManagerName(managerName);
		}

		merEntityImpl.setIsExpense(isExpense);
		merEntityImpl.setUseGroupId(useGroupId);
		merEntityImpl.setKeySearch(keySearch);

		if (contractCode == null) {
			merEntityImpl.setContractCode(StringPool.BLANK);
		}
		else {
			merEntityImpl.setContractCode(contractCode);
		}

		if (description == null) {
			merEntityImpl.setDescription(StringPool.BLANK);
		}
		else {
			merEntityImpl.setDescription(description);
		}

		merEntityImpl.setStationId(stationId);
		merEntityImpl.setIsInventory(isInventory);
		merEntityImpl.setEntityType(entityType);
		merEntityImpl.setQuality(quality);
		merEntityImpl.setCatEmployeeId(catEmployeeId);

		if (createdDate == Long.MIN_VALUE) {
			merEntityImpl.setCreatedDate(null);
		}
		else {
			merEntityImpl.setCreatedDate(new Date(createdDate));
		}

		merEntityImpl.setIsLock(isLock);

		merEntityImpl.resetOriginalValues();

		return merEntityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		merEntityId = objectInput.readLong();
		serialNumber = objectInput.readUTF();
		unitPrice = objectInput.readDouble();
		merId = objectInput.readLong();
		contractid = objectInput.readLong();
		groupId = objectInput.readLong();
		warehouseId = objectInput.readLong();
		constructionId = objectInput.readLong();
		isMerchandise = objectInput.readLong();
		statusId = objectInput.readLong();
		parentId = objectInput.readLong();
		userId = objectInput.readLong();
		upgradeParentId = objectInput.readLong();
		partNumber = objectInput.readUTF();
		count = objectInput.readDouble();
		isTemp = objectInput.readLong();
		path = objectInput.readUTF();
		originalPrice = objectInput.readDouble();
		managerName = objectInput.readUTF();
		isExpense = objectInput.readLong();
		useGroupId = objectInput.readLong();
		keySearch = objectInput.readLong();
		contractCode = objectInput.readUTF();
		description = objectInput.readUTF();
		stationId = objectInput.readLong();
		isInventory = objectInput.readLong();
		entityType = objectInput.readLong();
		quality = objectInput.readLong();
		catEmployeeId = objectInput.readLong();
		createdDate = objectInput.readLong();
		isLock = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(merEntityId);

		if (serialNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(serialNumber);
		}

		objectOutput.writeDouble(unitPrice);
		objectOutput.writeLong(merId);
		objectOutput.writeLong(contractid);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(warehouseId);
		objectOutput.writeLong(constructionId);
		objectOutput.writeLong(isMerchandise);
		objectOutput.writeLong(statusId);
		objectOutput.writeLong(parentId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(upgradeParentId);

		if (partNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(partNumber);
		}

		objectOutput.writeDouble(count);
		objectOutput.writeLong(isTemp);

		if (path == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(path);
		}

		objectOutput.writeDouble(originalPrice);

		if (managerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(managerName);
		}

		objectOutput.writeLong(isExpense);
		objectOutput.writeLong(useGroupId);
		objectOutput.writeLong(keySearch);

		if (contractCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contractCode);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(stationId);
		objectOutput.writeLong(isInventory);
		objectOutput.writeLong(entityType);
		objectOutput.writeLong(quality);
		objectOutput.writeLong(catEmployeeId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(isLock);
	}

	public long merEntityId;
	public String serialNumber;
	public Double unitPrice;
	public Long merId;
	public Long contractid;
	public Long groupId;
	public Long warehouseId;
	public Long constructionId;
	public Long isMerchandise;
	public Long statusId;
	public Long parentId;
	public Long userId;
	public Long upgradeParentId;
	public String partNumber;
	public Double count;
	public Long isTemp;
	public String path;
	public Double originalPrice;
	public String managerName;
	public Long isExpense;
	public Long useGroupId;
	public Long keySearch;
	public String contractCode;
	public String description;
	public Long stationId;
	public Long isInventory;
	public Long entityType;
	public Long quality;
	public Long catEmployeeId;
	public long createdDate;
	public Long isLock;
}
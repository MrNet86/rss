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

import com.viettel.ams.core.model.AssetManageReqEntity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssetManageReqEntity in entity cache.
 *
 * @author MrNet
 * @see AssetManageReqEntity
 * @generated
 */
public class AssetManageReqEntityCacheModel implements CacheModel<AssetManageReqEntity>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{id=");
		sb.append(id);
		sb.append(", reqId=");
		sb.append(reqId);
		sb.append(", merEntityId=");
		sb.append(merEntityId);
		sb.append(", stationId=");
		sb.append(stationId);
		sb.append(", failDate=");
		sb.append(failDate);
		sb.append(", failReason=");
		sb.append(failReason);
		sb.append(", usedDate=");
		sb.append(usedDate);
		sb.append(", preStatusId=");
		sb.append(preStatusId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", description=");
		sb.append(description);
		sb.append(", unitPrice=");
		sb.append(unitPrice);
		sb.append(", timeRetrieve=");
		sb.append(timeRetrieve);
		sb.append(", constructionId=");
		sb.append(constructionId);
		sb.append(", conditionerId=");
		sb.append(conditionerId);
		sb.append(", catGroupMerId=");
		sb.append(catGroupMerId);
		sb.append(", upgradeParentId=");
		sb.append(upgradeParentId);
		sb.append(", partnerId=");
		sb.append(partnerId);
		sb.append(", deliveryNoteId=");
		sb.append(deliveryNoteId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssetManageReqEntity toEntityModel() {
		AssetManageReqEntityImpl assetManageReqEntityImpl = new AssetManageReqEntityImpl();

		assetManageReqEntityImpl.setId(id);
		assetManageReqEntityImpl.setReqId(reqId);
		assetManageReqEntityImpl.setMerEntityId(merEntityId);
		assetManageReqEntityImpl.setStationId(stationId);

		if (failDate == Long.MIN_VALUE) {
			assetManageReqEntityImpl.setFailDate(null);
		}
		else {
			assetManageReqEntityImpl.setFailDate(new Date(failDate));
		}

		if (failReason == null) {
			assetManageReqEntityImpl.setFailReason(StringPool.BLANK);
		}
		else {
			assetManageReqEntityImpl.setFailReason(failReason);
		}

		if (usedDate == Long.MIN_VALUE) {
			assetManageReqEntityImpl.setUsedDate(null);
		}
		else {
			assetManageReqEntityImpl.setUsedDate(new Date(usedDate));
		}

		assetManageReqEntityImpl.setPreStatusId(preStatusId);
		assetManageReqEntityImpl.setGroupId(groupId);
		assetManageReqEntityImpl.setQuantity(quantity);

		if (description == null) {
			assetManageReqEntityImpl.setDescription(StringPool.BLANK);
		}
		else {
			assetManageReqEntityImpl.setDescription(description);
		}

		assetManageReqEntityImpl.setUnitPrice(unitPrice);

		if (timeRetrieve == Long.MIN_VALUE) {
			assetManageReqEntityImpl.setTimeRetrieve(null);
		}
		else {
			assetManageReqEntityImpl.setTimeRetrieve(new Date(timeRetrieve));
		}

		assetManageReqEntityImpl.setConstructionId(constructionId);
		assetManageReqEntityImpl.setConditionerId(conditionerId);
		assetManageReqEntityImpl.setCatGroupMerId(catGroupMerId);
		assetManageReqEntityImpl.setUpgradeParentId(upgradeParentId);
		assetManageReqEntityImpl.setPartnerId(partnerId);
		assetManageReqEntityImpl.setDeliveryNoteId(deliveryNoteId);

		assetManageReqEntityImpl.resetOriginalValues();

		return assetManageReqEntityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		reqId = objectInput.readLong();
		merEntityId = objectInput.readLong();
		stationId = objectInput.readLong();
		failDate = objectInput.readLong();
		failReason = objectInput.readUTF();
		usedDate = objectInput.readLong();
		preStatusId = objectInput.readLong();
		groupId = objectInput.readLong();
		quantity = objectInput.readDouble();
		description = objectInput.readUTF();
		unitPrice = objectInput.readDouble();
		timeRetrieve = objectInput.readLong();
		constructionId = objectInput.readLong();
		conditionerId = objectInput.readLong();
		catGroupMerId = objectInput.readLong();
		upgradeParentId = objectInput.readLong();
		partnerId = objectInput.readLong();
		deliveryNoteId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(reqId);
		objectOutput.writeLong(merEntityId);
		objectOutput.writeLong(stationId);
		objectOutput.writeLong(failDate);

		if (failReason == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(failReason);
		}

		objectOutput.writeLong(usedDate);
		objectOutput.writeLong(preStatusId);
		objectOutput.writeLong(groupId);
		objectOutput.writeDouble(quantity);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeDouble(unitPrice);
		objectOutput.writeLong(timeRetrieve);
		objectOutput.writeLong(constructionId);
		objectOutput.writeLong(conditionerId);
		objectOutput.writeLong(catGroupMerId);
		objectOutput.writeLong(upgradeParentId);
		objectOutput.writeLong(partnerId);
		objectOutput.writeLong(deliveryNoteId);
	}

	public long id;
	public Long reqId;
	public Long merEntityId;
	public Long stationId;
	public long failDate;
	public String failReason;
	public long usedDate;
	public Long preStatusId;
	public Long groupId;
	public Double quantity;
	public String description;
	public Double unitPrice;
	public long timeRetrieve;
	public Long constructionId;
	public Long conditionerId;
	public Long catGroupMerId;
	public Long upgradeParentId;
	public Long partnerId;
	public Long deliveryNoteId;
}
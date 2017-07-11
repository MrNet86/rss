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

import com.viettel.ams.core.model.AssetManageReqHandleEntity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssetManageReqHandleEntity in entity cache.
 *
 * @author MrNet
 * @see AssetManageReqHandleEntity
 * @generated
 */
public class AssetManageReqHandleEntityCacheModel implements CacheModel<AssetManageReqHandleEntity>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{id=");
		sb.append(id);
		sb.append(", handleId=");
		sb.append(handleId);
		sb.append(", merEntityId=");
		sb.append(merEntityId);
		sb.append(", status=");
		sb.append(status);
		sb.append(", stationId=");
		sb.append(stationId);
		sb.append(", failDate=");
		sb.append(failDate);
		sb.append(", failReason=");
		sb.append(failReason);
		sb.append(", usedDate=");
		sb.append(usedDate);
		sb.append(", handOverId=");
		sb.append(handOverId);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", unitPrice=");
		sb.append(unitPrice);
		sb.append(", description=");
		sb.append(description);
		sb.append(", upgradeParentId=");
		sb.append(upgradeParentId);
		sb.append(", parentId=");
		sb.append(parentId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", timeRetrieve=");
		sb.append(timeRetrieve);
		sb.append(", statusId=");
		sb.append(statusId);
		sb.append(", mark=");
		sb.append(mark);
		sb.append(", oldStatusId=");
		sb.append(oldStatusId);
		sb.append(", preCatEmployeeId=");
		sb.append(preCatEmployeeId);
		sb.append(", percentQuality=");
		sb.append(percentQuality);
		sb.append(", withdrawPrice=");
		sb.append(withdrawPrice);
		sb.append(", deliveryNoteId=");
		sb.append(deliveryNoteId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssetManageReqHandleEntity toEntityModel() {
		AssetManageReqHandleEntityImpl assetManageReqHandleEntityImpl = new AssetManageReqHandleEntityImpl();

		assetManageReqHandleEntityImpl.setId(id);
		assetManageReqHandleEntityImpl.setHandleId(handleId);
		assetManageReqHandleEntityImpl.setMerEntityId(merEntityId);
		assetManageReqHandleEntityImpl.setStatus(status);
		assetManageReqHandleEntityImpl.setStationId(stationId);

		if (failDate == Long.MIN_VALUE) {
			assetManageReqHandleEntityImpl.setFailDate(null);
		}
		else {
			assetManageReqHandleEntityImpl.setFailDate(new Date(failDate));
		}

		if (failReason == null) {
			assetManageReqHandleEntityImpl.setFailReason(StringPool.BLANK);
		}
		else {
			assetManageReqHandleEntityImpl.setFailReason(failReason);
		}

		if (usedDate == Long.MIN_VALUE) {
			assetManageReqHandleEntityImpl.setUsedDate(null);
		}
		else {
			assetManageReqHandleEntityImpl.setUsedDate(new Date(usedDate));
		}

		assetManageReqHandleEntityImpl.setHandOverId(handOverId);
		assetManageReqHandleEntityImpl.setQuantity(quantity);
		assetManageReqHandleEntityImpl.setUnitPrice(unitPrice);

		if (description == null) {
			assetManageReqHandleEntityImpl.setDescription(StringPool.BLANK);
		}
		else {
			assetManageReqHandleEntityImpl.setDescription(description);
		}

		assetManageReqHandleEntityImpl.setUpgradeParentId(upgradeParentId);
		assetManageReqHandleEntityImpl.setParentId(parentId);
		assetManageReqHandleEntityImpl.setGroupId(groupId);

		if (timeRetrieve == Long.MIN_VALUE) {
			assetManageReqHandleEntityImpl.setTimeRetrieve(null);
		}
		else {
			assetManageReqHandleEntityImpl.setTimeRetrieve(new Date(
					timeRetrieve));
		}

		assetManageReqHandleEntityImpl.setStatusId(statusId);
		assetManageReqHandleEntityImpl.setMark(mark);
		assetManageReqHandleEntityImpl.setOldStatusId(oldStatusId);
		assetManageReqHandleEntityImpl.setPreCatEmployeeId(preCatEmployeeId);
		assetManageReqHandleEntityImpl.setPercentQuality(percentQuality);
		assetManageReqHandleEntityImpl.setWithdrawPrice(withdrawPrice);
		assetManageReqHandleEntityImpl.setDeliveryNoteId(deliveryNoteId);

		assetManageReqHandleEntityImpl.resetOriginalValues();

		return assetManageReqHandleEntityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		handleId = objectInput.readLong();
		merEntityId = objectInput.readLong();
		status = objectInput.readLong();
		stationId = objectInput.readLong();
		failDate = objectInput.readLong();
		failReason = objectInput.readUTF();
		usedDate = objectInput.readLong();
		handOverId = objectInput.readLong();
		quantity = objectInput.readDouble();
		unitPrice = objectInput.readDouble();
		description = objectInput.readUTF();
		upgradeParentId = objectInput.readLong();
		parentId = objectInput.readLong();
		groupId = objectInput.readLong();
		timeRetrieve = objectInput.readLong();
		statusId = objectInput.readLong();
		mark = objectInput.readLong();
		oldStatusId = objectInput.readLong();
		preCatEmployeeId = objectInput.readLong();
		percentQuality = objectInput.readLong();
		withdrawPrice = objectInput.readLong();
		deliveryNoteId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(handleId);
		objectOutput.writeLong(merEntityId);
		objectOutput.writeLong(status);
		objectOutput.writeLong(stationId);
		objectOutput.writeLong(failDate);

		if (failReason == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(failReason);
		}

		objectOutput.writeLong(usedDate);
		objectOutput.writeLong(handOverId);
		objectOutput.writeDouble(quantity);
		objectOutput.writeDouble(unitPrice);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(upgradeParentId);
		objectOutput.writeLong(parentId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(timeRetrieve);
		objectOutput.writeLong(statusId);
		objectOutput.writeLong(mark);
		objectOutput.writeLong(oldStatusId);
		objectOutput.writeLong(preCatEmployeeId);
		objectOutput.writeLong(percentQuality);
		objectOutput.writeLong(withdrawPrice);
		objectOutput.writeLong(deliveryNoteId);
	}

	public long id;
	public Long handleId;
	public Long merEntityId;
	public Long status;
	public Long stationId;
	public long failDate;
	public String failReason;
	public long usedDate;
	public Long handOverId;
	public Double quantity;
	public Double unitPrice;
	public String description;
	public Long upgradeParentId;
	public Long parentId;
	public Long groupId;
	public long timeRetrieve;
	public Long statusId;
	public Long mark;
	public Long oldStatusId;
	public Long preCatEmployeeId;
	public Long percentQuality;
	public Long withdrawPrice;
	public Long deliveryNoteId;
}
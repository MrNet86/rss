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
 * This class is used by SOAP remote services, specifically {@link com.viettel.ams.core.service.http.AssetManageReqHandleEntityServiceSoap}.
 *
 * @author MrNet
 * @see com.viettel.ams.core.service.http.AssetManageReqHandleEntityServiceSoap
 * @generated
 */
public class AssetManageReqHandleEntitySoap implements Serializable {
	public static AssetManageReqHandleEntitySoap toSoapModel(
		AssetManageReqHandleEntity model) {
		AssetManageReqHandleEntitySoap soapModel = new AssetManageReqHandleEntitySoap();

		soapModel.setId(model.getId());
		soapModel.setHandleId(model.getHandleId());
		soapModel.setMerEntityId(model.getMerEntityId());
		soapModel.setStatus(model.getStatus());
		soapModel.setStationId(model.getStationId());
		soapModel.setFailDate(model.getFailDate());
		soapModel.setFailReason(model.getFailReason());
		soapModel.setUsedDate(model.getUsedDate());
		soapModel.setHandOverId(model.getHandOverId());
		soapModel.setQuantity(model.getQuantity());
		soapModel.setUnitPrice(model.getUnitPrice());
		soapModel.setDescription(model.getDescription());
		soapModel.setUpgradeParentId(model.getUpgradeParentId());
		soapModel.setParentId(model.getParentId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setTimeRetrieve(model.getTimeRetrieve());
		soapModel.setStatusId(model.getStatusId());
		soapModel.setMark(model.getMark());
		soapModel.setOldStatusId(model.getOldStatusId());
		soapModel.setPreCatEmployeeId(model.getPreCatEmployeeId());
		soapModel.setPercentQuality(model.getPercentQuality());
		soapModel.setWithdrawPrice(model.getWithdrawPrice());
		soapModel.setDeliveryNoteId(model.getDeliveryNoteId());

		return soapModel;
	}

	public static AssetManageReqHandleEntitySoap[] toSoapModels(
		AssetManageReqHandleEntity[] models) {
		AssetManageReqHandleEntitySoap[] soapModels = new AssetManageReqHandleEntitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssetManageReqHandleEntitySoap[][] toSoapModels(
		AssetManageReqHandleEntity[][] models) {
		AssetManageReqHandleEntitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssetManageReqHandleEntitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssetManageReqHandleEntitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssetManageReqHandleEntitySoap[] toSoapModels(
		List<AssetManageReqHandleEntity> models) {
		List<AssetManageReqHandleEntitySoap> soapModels = new ArrayList<AssetManageReqHandleEntitySoap>(models.size());

		for (AssetManageReqHandleEntity model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssetManageReqHandleEntitySoap[soapModels.size()]);
	}

	public AssetManageReqHandleEntitySoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public Long getHandleId() {
		return _handleId;
	}

	public void setHandleId(Long handleId) {
		_handleId = handleId;
	}

	public Long getMerEntityId() {
		return _merEntityId;
	}

	public void setMerEntityId(Long merEntityId) {
		_merEntityId = merEntityId;
	}

	public Long getStatus() {
		return _status;
	}

	public void setStatus(Long status) {
		_status = status;
	}

	public Long getStationId() {
		return _stationId;
	}

	public void setStationId(Long stationId) {
		_stationId = stationId;
	}

	public Date getFailDate() {
		return _failDate;
	}

	public void setFailDate(Date failDate) {
		_failDate = failDate;
	}

	public String getFailReason() {
		return _failReason;
	}

	public void setFailReason(String failReason) {
		_failReason = failReason;
	}

	public Date getUsedDate() {
		return _usedDate;
	}

	public void setUsedDate(Date usedDate) {
		_usedDate = usedDate;
	}

	public Long getHandOverId() {
		return _handOverId;
	}

	public void setHandOverId(Long handOverId) {
		_handOverId = handOverId;
	}

	public Double getQuantity() {
		return _quantity;
	}

	public void setQuantity(Double quantity) {
		_quantity = quantity;
	}

	public Double getUnitPrice() {
		return _unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		_unitPrice = unitPrice;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Long getUpgradeParentId() {
		return _upgradeParentId;
	}

	public void setUpgradeParentId(Long upgradeParentId) {
		_upgradeParentId = upgradeParentId;
	}

	public Long getParentId() {
		return _parentId;
	}

	public void setParentId(Long parentId) {
		_parentId = parentId;
	}

	public Long getGroupId() {
		return _groupId;
	}

	public void setGroupId(Long groupId) {
		_groupId = groupId;
	}

	public Date getTimeRetrieve() {
		return _timeRetrieve;
	}

	public void setTimeRetrieve(Date timeRetrieve) {
		_timeRetrieve = timeRetrieve;
	}

	public Long getStatusId() {
		return _statusId;
	}

	public void setStatusId(Long statusId) {
		_statusId = statusId;
	}

	public Long getMark() {
		return _mark;
	}

	public void setMark(Long mark) {
		_mark = mark;
	}

	public Long getOldStatusId() {
		return _oldStatusId;
	}

	public void setOldStatusId(Long oldStatusId) {
		_oldStatusId = oldStatusId;
	}

	public Long getPreCatEmployeeId() {
		return _preCatEmployeeId;
	}

	public void setPreCatEmployeeId(Long preCatEmployeeId) {
		_preCatEmployeeId = preCatEmployeeId;
	}

	public Long getPercentQuality() {
		return _percentQuality;
	}

	public void setPercentQuality(Long percentQuality) {
		_percentQuality = percentQuality;
	}

	public Long getWithdrawPrice() {
		return _withdrawPrice;
	}

	public void setWithdrawPrice(Long withdrawPrice) {
		_withdrawPrice = withdrawPrice;
	}

	public Long getDeliveryNoteId() {
		return _deliveryNoteId;
	}

	public void setDeliveryNoteId(Long deliveryNoteId) {
		_deliveryNoteId = deliveryNoteId;
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
}
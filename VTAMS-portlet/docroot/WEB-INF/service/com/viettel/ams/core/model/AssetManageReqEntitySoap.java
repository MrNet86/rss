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
 * This class is used by SOAP remote services, specifically {@link com.viettel.ams.core.service.http.AssetManageReqEntityServiceSoap}.
 *
 * @author MrNet
 * @see com.viettel.ams.core.service.http.AssetManageReqEntityServiceSoap
 * @generated
 */
public class AssetManageReqEntitySoap implements Serializable {
	public static AssetManageReqEntitySoap toSoapModel(
		AssetManageReqEntity model) {
		AssetManageReqEntitySoap soapModel = new AssetManageReqEntitySoap();

		soapModel.setId(model.getId());
		soapModel.setReqId(model.getReqId());
		soapModel.setMerEntityId(model.getMerEntityId());
		soapModel.setStationId(model.getStationId());
		soapModel.setFailDate(model.getFailDate());
		soapModel.setFailReason(model.getFailReason());
		soapModel.setUsedDate(model.getUsedDate());
		soapModel.setPreStatusId(model.getPreStatusId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setQuantity(model.getQuantity());
		soapModel.setDescription(model.getDescription());
		soapModel.setUnitPrice(model.getUnitPrice());
		soapModel.setTimeRetrieve(model.getTimeRetrieve());
		soapModel.setConstructionId(model.getConstructionId());
		soapModel.setConditionerId(model.getConditionerId());
		soapModel.setCatGroupMerId(model.getCatGroupMerId());
		soapModel.setUpgradeParentId(model.getUpgradeParentId());
		soapModel.setPartnerId(model.getPartnerId());
		soapModel.setDeliveryNoteId(model.getDeliveryNoteId());

		return soapModel;
	}

	public static AssetManageReqEntitySoap[] toSoapModels(
		AssetManageReqEntity[] models) {
		AssetManageReqEntitySoap[] soapModels = new AssetManageReqEntitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssetManageReqEntitySoap[][] toSoapModels(
		AssetManageReqEntity[][] models) {
		AssetManageReqEntitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssetManageReqEntitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssetManageReqEntitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssetManageReqEntitySoap[] toSoapModels(
		List<AssetManageReqEntity> models) {
		List<AssetManageReqEntitySoap> soapModels = new ArrayList<AssetManageReqEntitySoap>(models.size());

		for (AssetManageReqEntity model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssetManageReqEntitySoap[soapModels.size()]);
	}

	public AssetManageReqEntitySoap() {
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

	public Long getReqId() {
		return _reqId;
	}

	public void setReqId(Long reqId) {
		_reqId = reqId;
	}

	public Long getMerEntityId() {
		return _merEntityId;
	}

	public void setMerEntityId(Long merEntityId) {
		_merEntityId = merEntityId;
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

	public Long getPreStatusId() {
		return _preStatusId;
	}

	public void setPreStatusId(Long preStatusId) {
		_preStatusId = preStatusId;
	}

	public Long getGroupId() {
		return _groupId;
	}

	public void setGroupId(Long groupId) {
		_groupId = groupId;
	}

	public Double getQuantity() {
		return _quantity;
	}

	public void setQuantity(Double quantity) {
		_quantity = quantity;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Double getUnitPrice() {
		return _unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		_unitPrice = unitPrice;
	}

	public Date getTimeRetrieve() {
		return _timeRetrieve;
	}

	public void setTimeRetrieve(Date timeRetrieve) {
		_timeRetrieve = timeRetrieve;
	}

	public Long getConstructionId() {
		return _constructionId;
	}

	public void setConstructionId(Long constructionId) {
		_constructionId = constructionId;
	}

	public Long getConditionerId() {
		return _conditionerId;
	}

	public void setConditionerId(Long conditionerId) {
		_conditionerId = conditionerId;
	}

	public Long getCatGroupMerId() {
		return _catGroupMerId;
	}

	public void setCatGroupMerId(Long catGroupMerId) {
		_catGroupMerId = catGroupMerId;
	}

	public Long getUpgradeParentId() {
		return _upgradeParentId;
	}

	public void setUpgradeParentId(Long upgradeParentId) {
		_upgradeParentId = upgradeParentId;
	}

	public Long getPartnerId() {
		return _partnerId;
	}

	public void setPartnerId(Long partnerId) {
		_partnerId = partnerId;
	}

	public Long getDeliveryNoteId() {
		return _deliveryNoteId;
	}

	public void setDeliveryNoteId(Long deliveryNoteId) {
		_deliveryNoteId = deliveryNoteId;
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
}
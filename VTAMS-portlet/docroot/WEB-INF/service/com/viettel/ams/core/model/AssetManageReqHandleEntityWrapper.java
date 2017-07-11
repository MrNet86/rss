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
 * This class is a wrapper for {@link AssetManageReqHandleEntity}.
 * </p>
 *
 * @author MrNet
 * @see AssetManageReqHandleEntity
 * @generated
 */
public class AssetManageReqHandleEntityWrapper
	implements AssetManageReqHandleEntity,
		ModelWrapper<AssetManageReqHandleEntity> {
	public AssetManageReqHandleEntityWrapper(
		AssetManageReqHandleEntity assetManageReqHandleEntity) {
		_assetManageReqHandleEntity = assetManageReqHandleEntity;
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

	/**
	* Returns the primary key of this asset manage req handle entity.
	*
	* @return the primary key of this asset manage req handle entity
	*/
	@Override
	public long getPrimaryKey() {
		return _assetManageReqHandleEntity.getPrimaryKey();
	}

	/**
	* Sets the primary key of this asset manage req handle entity.
	*
	* @param primaryKey the primary key of this asset manage req handle entity
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assetManageReqHandleEntity.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this asset manage req handle entity.
	*
	* @return the ID of this asset manage req handle entity
	*/
	@Override
	public long getId() {
		return _assetManageReqHandleEntity.getId();
	}

	/**
	* Sets the ID of this asset manage req handle entity.
	*
	* @param id the ID of this asset manage req handle entity
	*/
	@Override
	public void setId(long id) {
		_assetManageReqHandleEntity.setId(id);
	}

	/**
	* Returns the handle ID of this asset manage req handle entity.
	*
	* @return the handle ID of this asset manage req handle entity
	*/
	@Override
	public java.lang.Long getHandleId() {
		return _assetManageReqHandleEntity.getHandleId();
	}

	/**
	* Sets the handle ID of this asset manage req handle entity.
	*
	* @param handleId the handle ID of this asset manage req handle entity
	*/
	@Override
	public void setHandleId(java.lang.Long handleId) {
		_assetManageReqHandleEntity.setHandleId(handleId);
	}

	/**
	* Returns the mer entity ID of this asset manage req handle entity.
	*
	* @return the mer entity ID of this asset manage req handle entity
	*/
	@Override
	public java.lang.Long getMerEntityId() {
		return _assetManageReqHandleEntity.getMerEntityId();
	}

	/**
	* Sets the mer entity ID of this asset manage req handle entity.
	*
	* @param merEntityId the mer entity ID of this asset manage req handle entity
	*/
	@Override
	public void setMerEntityId(java.lang.Long merEntityId) {
		_assetManageReqHandleEntity.setMerEntityId(merEntityId);
	}

	/**
	* Returns the status of this asset manage req handle entity.
	*
	* @return the status of this asset manage req handle entity
	*/
	@Override
	public java.lang.Long getStatus() {
		return _assetManageReqHandleEntity.getStatus();
	}

	/**
	* Sets the status of this asset manage req handle entity.
	*
	* @param status the status of this asset manage req handle entity
	*/
	@Override
	public void setStatus(java.lang.Long status) {
		_assetManageReqHandleEntity.setStatus(status);
	}

	/**
	* Returns the station ID of this asset manage req handle entity.
	*
	* @return the station ID of this asset manage req handle entity
	*/
	@Override
	public java.lang.Long getStationId() {
		return _assetManageReqHandleEntity.getStationId();
	}

	/**
	* Sets the station ID of this asset manage req handle entity.
	*
	* @param stationId the station ID of this asset manage req handle entity
	*/
	@Override
	public void setStationId(java.lang.Long stationId) {
		_assetManageReqHandleEntity.setStationId(stationId);
	}

	/**
	* Returns the fail date of this asset manage req handle entity.
	*
	* @return the fail date of this asset manage req handle entity
	*/
	@Override
	public java.util.Date getFailDate() {
		return _assetManageReqHandleEntity.getFailDate();
	}

	/**
	* Sets the fail date of this asset manage req handle entity.
	*
	* @param failDate the fail date of this asset manage req handle entity
	*/
	@Override
	public void setFailDate(java.util.Date failDate) {
		_assetManageReqHandleEntity.setFailDate(failDate);
	}

	/**
	* Returns the fail reason of this asset manage req handle entity.
	*
	* @return the fail reason of this asset manage req handle entity
	*/
	@Override
	public java.lang.String getFailReason() {
		return _assetManageReqHandleEntity.getFailReason();
	}

	/**
	* Sets the fail reason of this asset manage req handle entity.
	*
	* @param failReason the fail reason of this asset manage req handle entity
	*/
	@Override
	public void setFailReason(java.lang.String failReason) {
		_assetManageReqHandleEntity.setFailReason(failReason);
	}

	/**
	* Returns the used date of this asset manage req handle entity.
	*
	* @return the used date of this asset manage req handle entity
	*/
	@Override
	public java.util.Date getUsedDate() {
		return _assetManageReqHandleEntity.getUsedDate();
	}

	/**
	* Sets the used date of this asset manage req handle entity.
	*
	* @param usedDate the used date of this asset manage req handle entity
	*/
	@Override
	public void setUsedDate(java.util.Date usedDate) {
		_assetManageReqHandleEntity.setUsedDate(usedDate);
	}

	/**
	* Returns the hand over ID of this asset manage req handle entity.
	*
	* @return the hand over ID of this asset manage req handle entity
	*/
	@Override
	public java.lang.Long getHandOverId() {
		return _assetManageReqHandleEntity.getHandOverId();
	}

	/**
	* Sets the hand over ID of this asset manage req handle entity.
	*
	* @param handOverId the hand over ID of this asset manage req handle entity
	*/
	@Override
	public void setHandOverId(java.lang.Long handOverId) {
		_assetManageReqHandleEntity.setHandOverId(handOverId);
	}

	/**
	* Returns the quantity of this asset manage req handle entity.
	*
	* @return the quantity of this asset manage req handle entity
	*/
	@Override
	public java.lang.Double getQuantity() {
		return _assetManageReqHandleEntity.getQuantity();
	}

	/**
	* Sets the quantity of this asset manage req handle entity.
	*
	* @param quantity the quantity of this asset manage req handle entity
	*/
	@Override
	public void setQuantity(java.lang.Double quantity) {
		_assetManageReqHandleEntity.setQuantity(quantity);
	}

	/**
	* Returns the unit price of this asset manage req handle entity.
	*
	* @return the unit price of this asset manage req handle entity
	*/
	@Override
	public java.lang.Double getUnitPrice() {
		return _assetManageReqHandleEntity.getUnitPrice();
	}

	/**
	* Sets the unit price of this asset manage req handle entity.
	*
	* @param unitPrice the unit price of this asset manage req handle entity
	*/
	@Override
	public void setUnitPrice(java.lang.Double unitPrice) {
		_assetManageReqHandleEntity.setUnitPrice(unitPrice);
	}

	/**
	* Returns the description of this asset manage req handle entity.
	*
	* @return the description of this asset manage req handle entity
	*/
	@Override
	public java.lang.String getDescription() {
		return _assetManageReqHandleEntity.getDescription();
	}

	/**
	* Sets the description of this asset manage req handle entity.
	*
	* @param description the description of this asset manage req handle entity
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_assetManageReqHandleEntity.setDescription(description);
	}

	/**
	* Returns the upgrade parent ID of this asset manage req handle entity.
	*
	* @return the upgrade parent ID of this asset manage req handle entity
	*/
	@Override
	public java.lang.Long getUpgradeParentId() {
		return _assetManageReqHandleEntity.getUpgradeParentId();
	}

	/**
	* Sets the upgrade parent ID of this asset manage req handle entity.
	*
	* @param upgradeParentId the upgrade parent ID of this asset manage req handle entity
	*/
	@Override
	public void setUpgradeParentId(java.lang.Long upgradeParentId) {
		_assetManageReqHandleEntity.setUpgradeParentId(upgradeParentId);
	}

	/**
	* Returns the parent ID of this asset manage req handle entity.
	*
	* @return the parent ID of this asset manage req handle entity
	*/
	@Override
	public java.lang.Long getParentId() {
		return _assetManageReqHandleEntity.getParentId();
	}

	/**
	* Sets the parent ID of this asset manage req handle entity.
	*
	* @param parentId the parent ID of this asset manage req handle entity
	*/
	@Override
	public void setParentId(java.lang.Long parentId) {
		_assetManageReqHandleEntity.setParentId(parentId);
	}

	/**
	* Returns the group ID of this asset manage req handle entity.
	*
	* @return the group ID of this asset manage req handle entity
	*/
	@Override
	public java.lang.Long getGroupId() {
		return _assetManageReqHandleEntity.getGroupId();
	}

	/**
	* Sets the group ID of this asset manage req handle entity.
	*
	* @param groupId the group ID of this asset manage req handle entity
	*/
	@Override
	public void setGroupId(java.lang.Long groupId) {
		_assetManageReqHandleEntity.setGroupId(groupId);
	}

	/**
	* Returns the time retrieve of this asset manage req handle entity.
	*
	* @return the time retrieve of this asset manage req handle entity
	*/
	@Override
	public java.util.Date getTimeRetrieve() {
		return _assetManageReqHandleEntity.getTimeRetrieve();
	}

	/**
	* Sets the time retrieve of this asset manage req handle entity.
	*
	* @param timeRetrieve the time retrieve of this asset manage req handle entity
	*/
	@Override
	public void setTimeRetrieve(java.util.Date timeRetrieve) {
		_assetManageReqHandleEntity.setTimeRetrieve(timeRetrieve);
	}

	/**
	* Returns the status ID of this asset manage req handle entity.
	*
	* @return the status ID of this asset manage req handle entity
	*/
	@Override
	public java.lang.Long getStatusId() {
		return _assetManageReqHandleEntity.getStatusId();
	}

	/**
	* Sets the status ID of this asset manage req handle entity.
	*
	* @param statusId the status ID of this asset manage req handle entity
	*/
	@Override
	public void setStatusId(java.lang.Long statusId) {
		_assetManageReqHandleEntity.setStatusId(statusId);
	}

	/**
	* Returns the mark of this asset manage req handle entity.
	*
	* @return the mark of this asset manage req handle entity
	*/
	@Override
	public java.lang.Long getMark() {
		return _assetManageReqHandleEntity.getMark();
	}

	/**
	* Sets the mark of this asset manage req handle entity.
	*
	* @param mark the mark of this asset manage req handle entity
	*/
	@Override
	public void setMark(java.lang.Long mark) {
		_assetManageReqHandleEntity.setMark(mark);
	}

	/**
	* Returns the old status ID of this asset manage req handle entity.
	*
	* @return the old status ID of this asset manage req handle entity
	*/
	@Override
	public java.lang.Long getOldStatusId() {
		return _assetManageReqHandleEntity.getOldStatusId();
	}

	/**
	* Sets the old status ID of this asset manage req handle entity.
	*
	* @param oldStatusId the old status ID of this asset manage req handle entity
	*/
	@Override
	public void setOldStatusId(java.lang.Long oldStatusId) {
		_assetManageReqHandleEntity.setOldStatusId(oldStatusId);
	}

	/**
	* Returns the pre cat employee ID of this asset manage req handle entity.
	*
	* @return the pre cat employee ID of this asset manage req handle entity
	*/
	@Override
	public java.lang.Long getPreCatEmployeeId() {
		return _assetManageReqHandleEntity.getPreCatEmployeeId();
	}

	/**
	* Sets the pre cat employee ID of this asset manage req handle entity.
	*
	* @param preCatEmployeeId the pre cat employee ID of this asset manage req handle entity
	*/
	@Override
	public void setPreCatEmployeeId(java.lang.Long preCatEmployeeId) {
		_assetManageReqHandleEntity.setPreCatEmployeeId(preCatEmployeeId);
	}

	/**
	* Returns the percent quality of this asset manage req handle entity.
	*
	* @return the percent quality of this asset manage req handle entity
	*/
	@Override
	public java.lang.Long getPercentQuality() {
		return _assetManageReqHandleEntity.getPercentQuality();
	}

	/**
	* Sets the percent quality of this asset manage req handle entity.
	*
	* @param percentQuality the percent quality of this asset manage req handle entity
	*/
	@Override
	public void setPercentQuality(java.lang.Long percentQuality) {
		_assetManageReqHandleEntity.setPercentQuality(percentQuality);
	}

	/**
	* Returns the withdraw price of this asset manage req handle entity.
	*
	* @return the withdraw price of this asset manage req handle entity
	*/
	@Override
	public java.lang.Long getWithdrawPrice() {
		return _assetManageReqHandleEntity.getWithdrawPrice();
	}

	/**
	* Sets the withdraw price of this asset manage req handle entity.
	*
	* @param withdrawPrice the withdraw price of this asset manage req handle entity
	*/
	@Override
	public void setWithdrawPrice(java.lang.Long withdrawPrice) {
		_assetManageReqHandleEntity.setWithdrawPrice(withdrawPrice);
	}

	/**
	* Returns the delivery note ID of this asset manage req handle entity.
	*
	* @return the delivery note ID of this asset manage req handle entity
	*/
	@Override
	public java.lang.Long getDeliveryNoteId() {
		return _assetManageReqHandleEntity.getDeliveryNoteId();
	}

	/**
	* Sets the delivery note ID of this asset manage req handle entity.
	*
	* @param deliveryNoteId the delivery note ID of this asset manage req handle entity
	*/
	@Override
	public void setDeliveryNoteId(java.lang.Long deliveryNoteId) {
		_assetManageReqHandleEntity.setDeliveryNoteId(deliveryNoteId);
	}

	@Override
	public boolean isNew() {
		return _assetManageReqHandleEntity.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assetManageReqHandleEntity.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assetManageReqHandleEntity.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assetManageReqHandleEntity.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assetManageReqHandleEntity.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assetManageReqHandleEntity.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assetManageReqHandleEntity.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assetManageReqHandleEntity.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assetManageReqHandleEntity.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assetManageReqHandleEntity.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assetManageReqHandleEntity.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssetManageReqHandleEntityWrapper((AssetManageReqHandleEntity)_assetManageReqHandleEntity.clone());
	}

	@Override
	public int compareTo(
		com.viettel.ams.core.model.AssetManageReqHandleEntity assetManageReqHandleEntity) {
		return _assetManageReqHandleEntity.compareTo(assetManageReqHandleEntity);
	}

	@Override
	public int hashCode() {
		return _assetManageReqHandleEntity.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.viettel.ams.core.model.AssetManageReqHandleEntity> toCacheModel() {
		return _assetManageReqHandleEntity.toCacheModel();
	}

	@Override
	public com.viettel.ams.core.model.AssetManageReqHandleEntity toEscapedModel() {
		return new AssetManageReqHandleEntityWrapper(_assetManageReqHandleEntity.toEscapedModel());
	}

	@Override
	public com.viettel.ams.core.model.AssetManageReqHandleEntity toUnescapedModel() {
		return new AssetManageReqHandleEntityWrapper(_assetManageReqHandleEntity.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assetManageReqHandleEntity.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assetManageReqHandleEntity.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assetManageReqHandleEntity.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetManageReqHandleEntityWrapper)) {
			return false;
		}

		AssetManageReqHandleEntityWrapper assetManageReqHandleEntityWrapper = (AssetManageReqHandleEntityWrapper)obj;

		if (Validator.equals(_assetManageReqHandleEntity,
					assetManageReqHandleEntityWrapper._assetManageReqHandleEntity)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AssetManageReqHandleEntity getWrappedAssetManageReqHandleEntity() {
		return _assetManageReqHandleEntity;
	}

	@Override
	public AssetManageReqHandleEntity getWrappedModel() {
		return _assetManageReqHandleEntity;
	}

	@Override
	public void resetOriginalValues() {
		_assetManageReqHandleEntity.resetOriginalValues();
	}

	private AssetManageReqHandleEntity _assetManageReqHandleEntity;
}
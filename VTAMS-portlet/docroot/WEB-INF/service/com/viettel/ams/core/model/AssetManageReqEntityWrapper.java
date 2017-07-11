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
 * This class is a wrapper for {@link AssetManageReqEntity}.
 * </p>
 *
 * @author MrNet
 * @see AssetManageReqEntity
 * @generated
 */
public class AssetManageReqEntityWrapper implements AssetManageReqEntity,
	ModelWrapper<AssetManageReqEntity> {
	public AssetManageReqEntityWrapper(
		AssetManageReqEntity assetManageReqEntity) {
		_assetManageReqEntity = assetManageReqEntity;
	}

	@Override
	public Class<?> getModelClass() {
		return AssetManageReqEntity.class;
	}

	@Override
	public String getModelClassName() {
		return AssetManageReqEntity.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("reqId", getReqId());
		attributes.put("merEntityId", getMerEntityId());
		attributes.put("stationId", getStationId());
		attributes.put("failDate", getFailDate());
		attributes.put("failReason", getFailReason());
		attributes.put("usedDate", getUsedDate());
		attributes.put("preStatusId", getPreStatusId());
		attributes.put("groupId", getGroupId());
		attributes.put("quantity", getQuantity());
		attributes.put("description", getDescription());
		attributes.put("unitPrice", getUnitPrice());
		attributes.put("timeRetrieve", getTimeRetrieve());
		attributes.put("constructionId", getConstructionId());
		attributes.put("conditionerId", getConditionerId());
		attributes.put("catGroupMerId", getCatGroupMerId());
		attributes.put("upgradeParentId", getUpgradeParentId());
		attributes.put("partnerId", getPartnerId());
		attributes.put("deliveryNoteId", getDeliveryNoteId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long reqId = (Long)attributes.get("reqId");

		if (reqId != null) {
			setReqId(reqId);
		}

		Long merEntityId = (Long)attributes.get("merEntityId");

		if (merEntityId != null) {
			setMerEntityId(merEntityId);
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

		Long preStatusId = (Long)attributes.get("preStatusId");

		if (preStatusId != null) {
			setPreStatusId(preStatusId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Double quantity = (Double)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Double unitPrice = (Double)attributes.get("unitPrice");

		if (unitPrice != null) {
			setUnitPrice(unitPrice);
		}

		Date timeRetrieve = (Date)attributes.get("timeRetrieve");

		if (timeRetrieve != null) {
			setTimeRetrieve(timeRetrieve);
		}

		Long constructionId = (Long)attributes.get("constructionId");

		if (constructionId != null) {
			setConstructionId(constructionId);
		}

		Long conditionerId = (Long)attributes.get("conditionerId");

		if (conditionerId != null) {
			setConditionerId(conditionerId);
		}

		Long catGroupMerId = (Long)attributes.get("catGroupMerId");

		if (catGroupMerId != null) {
			setCatGroupMerId(catGroupMerId);
		}

		Long upgradeParentId = (Long)attributes.get("upgradeParentId");

		if (upgradeParentId != null) {
			setUpgradeParentId(upgradeParentId);
		}

		Long partnerId = (Long)attributes.get("partnerId");

		if (partnerId != null) {
			setPartnerId(partnerId);
		}

		Long deliveryNoteId = (Long)attributes.get("deliveryNoteId");

		if (deliveryNoteId != null) {
			setDeliveryNoteId(deliveryNoteId);
		}
	}

	/**
	* Returns the primary key of this asset manage req entity.
	*
	* @return the primary key of this asset manage req entity
	*/
	@Override
	public long getPrimaryKey() {
		return _assetManageReqEntity.getPrimaryKey();
	}

	/**
	* Sets the primary key of this asset manage req entity.
	*
	* @param primaryKey the primary key of this asset manage req entity
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assetManageReqEntity.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this asset manage req entity.
	*
	* @return the ID of this asset manage req entity
	*/
	@Override
	public long getId() {
		return _assetManageReqEntity.getId();
	}

	/**
	* Sets the ID of this asset manage req entity.
	*
	* @param id the ID of this asset manage req entity
	*/
	@Override
	public void setId(long id) {
		_assetManageReqEntity.setId(id);
	}

	/**
	* Returns the req ID of this asset manage req entity.
	*
	* @return the req ID of this asset manage req entity
	*/
	@Override
	public java.lang.Long getReqId() {
		return _assetManageReqEntity.getReqId();
	}

	/**
	* Sets the req ID of this asset manage req entity.
	*
	* @param reqId the req ID of this asset manage req entity
	*/
	@Override
	public void setReqId(java.lang.Long reqId) {
		_assetManageReqEntity.setReqId(reqId);
	}

	/**
	* Returns the mer entity ID of this asset manage req entity.
	*
	* @return the mer entity ID of this asset manage req entity
	*/
	@Override
	public java.lang.Long getMerEntityId() {
		return _assetManageReqEntity.getMerEntityId();
	}

	/**
	* Sets the mer entity ID of this asset manage req entity.
	*
	* @param merEntityId the mer entity ID of this asset manage req entity
	*/
	@Override
	public void setMerEntityId(java.lang.Long merEntityId) {
		_assetManageReqEntity.setMerEntityId(merEntityId);
	}

	/**
	* Returns the station ID of this asset manage req entity.
	*
	* @return the station ID of this asset manage req entity
	*/
	@Override
	public java.lang.Long getStationId() {
		return _assetManageReqEntity.getStationId();
	}

	/**
	* Sets the station ID of this asset manage req entity.
	*
	* @param stationId the station ID of this asset manage req entity
	*/
	@Override
	public void setStationId(java.lang.Long stationId) {
		_assetManageReqEntity.setStationId(stationId);
	}

	/**
	* Returns the fail date of this asset manage req entity.
	*
	* @return the fail date of this asset manage req entity
	*/
	@Override
	public java.util.Date getFailDate() {
		return _assetManageReqEntity.getFailDate();
	}

	/**
	* Sets the fail date of this asset manage req entity.
	*
	* @param failDate the fail date of this asset manage req entity
	*/
	@Override
	public void setFailDate(java.util.Date failDate) {
		_assetManageReqEntity.setFailDate(failDate);
	}

	/**
	* Returns the fail reason of this asset manage req entity.
	*
	* @return the fail reason of this asset manage req entity
	*/
	@Override
	public java.lang.String getFailReason() {
		return _assetManageReqEntity.getFailReason();
	}

	/**
	* Sets the fail reason of this asset manage req entity.
	*
	* @param failReason the fail reason of this asset manage req entity
	*/
	@Override
	public void setFailReason(java.lang.String failReason) {
		_assetManageReqEntity.setFailReason(failReason);
	}

	/**
	* Returns the used date of this asset manage req entity.
	*
	* @return the used date of this asset manage req entity
	*/
	@Override
	public java.util.Date getUsedDate() {
		return _assetManageReqEntity.getUsedDate();
	}

	/**
	* Sets the used date of this asset manage req entity.
	*
	* @param usedDate the used date of this asset manage req entity
	*/
	@Override
	public void setUsedDate(java.util.Date usedDate) {
		_assetManageReqEntity.setUsedDate(usedDate);
	}

	/**
	* Returns the pre status ID of this asset manage req entity.
	*
	* @return the pre status ID of this asset manage req entity
	*/
	@Override
	public java.lang.Long getPreStatusId() {
		return _assetManageReqEntity.getPreStatusId();
	}

	/**
	* Sets the pre status ID of this asset manage req entity.
	*
	* @param preStatusId the pre status ID of this asset manage req entity
	*/
	@Override
	public void setPreStatusId(java.lang.Long preStatusId) {
		_assetManageReqEntity.setPreStatusId(preStatusId);
	}

	/**
	* Returns the group ID of this asset manage req entity.
	*
	* @return the group ID of this asset manage req entity
	*/
	@Override
	public java.lang.Long getGroupId() {
		return _assetManageReqEntity.getGroupId();
	}

	/**
	* Sets the group ID of this asset manage req entity.
	*
	* @param groupId the group ID of this asset manage req entity
	*/
	@Override
	public void setGroupId(java.lang.Long groupId) {
		_assetManageReqEntity.setGroupId(groupId);
	}

	/**
	* Returns the quantity of this asset manage req entity.
	*
	* @return the quantity of this asset manage req entity
	*/
	@Override
	public java.lang.Double getQuantity() {
		return _assetManageReqEntity.getQuantity();
	}

	/**
	* Sets the quantity of this asset manage req entity.
	*
	* @param quantity the quantity of this asset manage req entity
	*/
	@Override
	public void setQuantity(java.lang.Double quantity) {
		_assetManageReqEntity.setQuantity(quantity);
	}

	/**
	* Returns the description of this asset manage req entity.
	*
	* @return the description of this asset manage req entity
	*/
	@Override
	public java.lang.String getDescription() {
		return _assetManageReqEntity.getDescription();
	}

	/**
	* Sets the description of this asset manage req entity.
	*
	* @param description the description of this asset manage req entity
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_assetManageReqEntity.setDescription(description);
	}

	/**
	* Returns the unit price of this asset manage req entity.
	*
	* @return the unit price of this asset manage req entity
	*/
	@Override
	public java.lang.Double getUnitPrice() {
		return _assetManageReqEntity.getUnitPrice();
	}

	/**
	* Sets the unit price of this asset manage req entity.
	*
	* @param unitPrice the unit price of this asset manage req entity
	*/
	@Override
	public void setUnitPrice(java.lang.Double unitPrice) {
		_assetManageReqEntity.setUnitPrice(unitPrice);
	}

	/**
	* Returns the time retrieve of this asset manage req entity.
	*
	* @return the time retrieve of this asset manage req entity
	*/
	@Override
	public java.util.Date getTimeRetrieve() {
		return _assetManageReqEntity.getTimeRetrieve();
	}

	/**
	* Sets the time retrieve of this asset manage req entity.
	*
	* @param timeRetrieve the time retrieve of this asset manage req entity
	*/
	@Override
	public void setTimeRetrieve(java.util.Date timeRetrieve) {
		_assetManageReqEntity.setTimeRetrieve(timeRetrieve);
	}

	/**
	* Returns the construction ID of this asset manage req entity.
	*
	* @return the construction ID of this asset manage req entity
	*/
	@Override
	public java.lang.Long getConstructionId() {
		return _assetManageReqEntity.getConstructionId();
	}

	/**
	* Sets the construction ID of this asset manage req entity.
	*
	* @param constructionId the construction ID of this asset manage req entity
	*/
	@Override
	public void setConstructionId(java.lang.Long constructionId) {
		_assetManageReqEntity.setConstructionId(constructionId);
	}

	/**
	* Returns the conditioner ID of this asset manage req entity.
	*
	* @return the conditioner ID of this asset manage req entity
	*/
	@Override
	public java.lang.Long getConditionerId() {
		return _assetManageReqEntity.getConditionerId();
	}

	/**
	* Sets the conditioner ID of this asset manage req entity.
	*
	* @param conditionerId the conditioner ID of this asset manage req entity
	*/
	@Override
	public void setConditionerId(java.lang.Long conditionerId) {
		_assetManageReqEntity.setConditionerId(conditionerId);
	}

	/**
	* Returns the cat group mer ID of this asset manage req entity.
	*
	* @return the cat group mer ID of this asset manage req entity
	*/
	@Override
	public java.lang.Long getCatGroupMerId() {
		return _assetManageReqEntity.getCatGroupMerId();
	}

	/**
	* Sets the cat group mer ID of this asset manage req entity.
	*
	* @param catGroupMerId the cat group mer ID of this asset manage req entity
	*/
	@Override
	public void setCatGroupMerId(java.lang.Long catGroupMerId) {
		_assetManageReqEntity.setCatGroupMerId(catGroupMerId);
	}

	/**
	* Returns the upgrade parent ID of this asset manage req entity.
	*
	* @return the upgrade parent ID of this asset manage req entity
	*/
	@Override
	public java.lang.Long getUpgradeParentId() {
		return _assetManageReqEntity.getUpgradeParentId();
	}

	/**
	* Sets the upgrade parent ID of this asset manage req entity.
	*
	* @param upgradeParentId the upgrade parent ID of this asset manage req entity
	*/
	@Override
	public void setUpgradeParentId(java.lang.Long upgradeParentId) {
		_assetManageReqEntity.setUpgradeParentId(upgradeParentId);
	}

	/**
	* Returns the partner ID of this asset manage req entity.
	*
	* @return the partner ID of this asset manage req entity
	*/
	@Override
	public java.lang.Long getPartnerId() {
		return _assetManageReqEntity.getPartnerId();
	}

	/**
	* Sets the partner ID of this asset manage req entity.
	*
	* @param partnerId the partner ID of this asset manage req entity
	*/
	@Override
	public void setPartnerId(java.lang.Long partnerId) {
		_assetManageReqEntity.setPartnerId(partnerId);
	}

	/**
	* Returns the delivery note ID of this asset manage req entity.
	*
	* @return the delivery note ID of this asset manage req entity
	*/
	@Override
	public java.lang.Long getDeliveryNoteId() {
		return _assetManageReqEntity.getDeliveryNoteId();
	}

	/**
	* Sets the delivery note ID of this asset manage req entity.
	*
	* @param deliveryNoteId the delivery note ID of this asset manage req entity
	*/
	@Override
	public void setDeliveryNoteId(java.lang.Long deliveryNoteId) {
		_assetManageReqEntity.setDeliveryNoteId(deliveryNoteId);
	}

	@Override
	public boolean isNew() {
		return _assetManageReqEntity.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assetManageReqEntity.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assetManageReqEntity.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assetManageReqEntity.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assetManageReqEntity.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assetManageReqEntity.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assetManageReqEntity.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assetManageReqEntity.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assetManageReqEntity.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assetManageReqEntity.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assetManageReqEntity.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssetManageReqEntityWrapper((AssetManageReqEntity)_assetManageReqEntity.clone());
	}

	@Override
	public int compareTo(
		com.viettel.ams.core.model.AssetManageReqEntity assetManageReqEntity) {
		return _assetManageReqEntity.compareTo(assetManageReqEntity);
	}

	@Override
	public int hashCode() {
		return _assetManageReqEntity.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.viettel.ams.core.model.AssetManageReqEntity> toCacheModel() {
		return _assetManageReqEntity.toCacheModel();
	}

	@Override
	public com.viettel.ams.core.model.AssetManageReqEntity toEscapedModel() {
		return new AssetManageReqEntityWrapper(_assetManageReqEntity.toEscapedModel());
	}

	@Override
	public com.viettel.ams.core.model.AssetManageReqEntity toUnescapedModel() {
		return new AssetManageReqEntityWrapper(_assetManageReqEntity.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assetManageReqEntity.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assetManageReqEntity.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assetManageReqEntity.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetManageReqEntityWrapper)) {
			return false;
		}

		AssetManageReqEntityWrapper assetManageReqEntityWrapper = (AssetManageReqEntityWrapper)obj;

		if (Validator.equals(_assetManageReqEntity,
					assetManageReqEntityWrapper._assetManageReqEntity)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AssetManageReqEntity getWrappedAssetManageReqEntity() {
		return _assetManageReqEntity;
	}

	@Override
	public AssetManageReqEntity getWrappedModel() {
		return _assetManageReqEntity;
	}

	@Override
	public void resetOriginalValues() {
		_assetManageReqEntity.resetOriginalValues();
	}

	private AssetManageReqEntity _assetManageReqEntity;
}
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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the AssetManageReqEntity service. Represents a row in the &quot;Asset_Manage_Req_Entity&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.viettel.ams.core.model.impl.AssetManageReqEntityModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.viettel.ams.core.model.impl.AssetManageReqEntityImpl}.
 * </p>
 *
 * @author MrNet
 * @see AssetManageReqEntity
 * @see com.viettel.ams.core.model.impl.AssetManageReqEntityImpl
 * @see com.viettel.ams.core.model.impl.AssetManageReqEntityModelImpl
 * @generated
 */
public interface AssetManageReqEntityModel extends BaseModel<AssetManageReqEntity> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a asset manage req entity model instance should use the {@link AssetManageReqEntity} interface instead.
	 */

	/**
	 * Returns the primary key of this asset manage req entity.
	 *
	 * @return the primary key of this asset manage req entity
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this asset manage req entity.
	 *
	 * @param primaryKey the primary key of this asset manage req entity
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this asset manage req entity.
	 *
	 * @return the ID of this asset manage req entity
	 */
	public long getId();

	/**
	 * Sets the ID of this asset manage req entity.
	 *
	 * @param id the ID of this asset manage req entity
	 */
	public void setId(long id);

	/**
	 * Returns the req ID of this asset manage req entity.
	 *
	 * @return the req ID of this asset manage req entity
	 */
	public Long getReqId();

	/**
	 * Sets the req ID of this asset manage req entity.
	 *
	 * @param reqId the req ID of this asset manage req entity
	 */
	public void setReqId(Long reqId);

	/**
	 * Returns the mer entity ID of this asset manage req entity.
	 *
	 * @return the mer entity ID of this asset manage req entity
	 */
	public Long getMerEntityId();

	/**
	 * Sets the mer entity ID of this asset manage req entity.
	 *
	 * @param merEntityId the mer entity ID of this asset manage req entity
	 */
	public void setMerEntityId(Long merEntityId);

	/**
	 * Returns the station ID of this asset manage req entity.
	 *
	 * @return the station ID of this asset manage req entity
	 */
	public Long getStationId();

	/**
	 * Sets the station ID of this asset manage req entity.
	 *
	 * @param stationId the station ID of this asset manage req entity
	 */
	public void setStationId(Long stationId);

	/**
	 * Returns the fail date of this asset manage req entity.
	 *
	 * @return the fail date of this asset manage req entity
	 */
	public Date getFailDate();

	/**
	 * Sets the fail date of this asset manage req entity.
	 *
	 * @param failDate the fail date of this asset manage req entity
	 */
	public void setFailDate(Date failDate);

	/**
	 * Returns the fail reason of this asset manage req entity.
	 *
	 * @return the fail reason of this asset manage req entity
	 */
	@AutoEscape
	public String getFailReason();

	/**
	 * Sets the fail reason of this asset manage req entity.
	 *
	 * @param failReason the fail reason of this asset manage req entity
	 */
	public void setFailReason(String failReason);

	/**
	 * Returns the used date of this asset manage req entity.
	 *
	 * @return the used date of this asset manage req entity
	 */
	public Date getUsedDate();

	/**
	 * Sets the used date of this asset manage req entity.
	 *
	 * @param usedDate the used date of this asset manage req entity
	 */
	public void setUsedDate(Date usedDate);

	/**
	 * Returns the pre status ID of this asset manage req entity.
	 *
	 * @return the pre status ID of this asset manage req entity
	 */
	public Long getPreStatusId();

	/**
	 * Sets the pre status ID of this asset manage req entity.
	 *
	 * @param preStatusId the pre status ID of this asset manage req entity
	 */
	public void setPreStatusId(Long preStatusId);

	/**
	 * Returns the group ID of this asset manage req entity.
	 *
	 * @return the group ID of this asset manage req entity
	 */
	public Long getGroupId();

	/**
	 * Sets the group ID of this asset manage req entity.
	 *
	 * @param groupId the group ID of this asset manage req entity
	 */
	public void setGroupId(Long groupId);

	/**
	 * Returns the quantity of this asset manage req entity.
	 *
	 * @return the quantity of this asset manage req entity
	 */
	public Double getQuantity();

	/**
	 * Sets the quantity of this asset manage req entity.
	 *
	 * @param quantity the quantity of this asset manage req entity
	 */
	public void setQuantity(Double quantity);

	/**
	 * Returns the description of this asset manage req entity.
	 *
	 * @return the description of this asset manage req entity
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this asset manage req entity.
	 *
	 * @param description the description of this asset manage req entity
	 */
	public void setDescription(String description);

	/**
	 * Returns the unit price of this asset manage req entity.
	 *
	 * @return the unit price of this asset manage req entity
	 */
	public Double getUnitPrice();

	/**
	 * Sets the unit price of this asset manage req entity.
	 *
	 * @param unitPrice the unit price of this asset manage req entity
	 */
	public void setUnitPrice(Double unitPrice);

	/**
	 * Returns the time retrieve of this asset manage req entity.
	 *
	 * @return the time retrieve of this asset manage req entity
	 */
	public Date getTimeRetrieve();

	/**
	 * Sets the time retrieve of this asset manage req entity.
	 *
	 * @param timeRetrieve the time retrieve of this asset manage req entity
	 */
	public void setTimeRetrieve(Date timeRetrieve);

	/**
	 * Returns the construction ID of this asset manage req entity.
	 *
	 * @return the construction ID of this asset manage req entity
	 */
	public Long getConstructionId();

	/**
	 * Sets the construction ID of this asset manage req entity.
	 *
	 * @param constructionId the construction ID of this asset manage req entity
	 */
	public void setConstructionId(Long constructionId);

	/**
	 * Returns the conditioner ID of this asset manage req entity.
	 *
	 * @return the conditioner ID of this asset manage req entity
	 */
	public Long getConditionerId();

	/**
	 * Sets the conditioner ID of this asset manage req entity.
	 *
	 * @param conditionerId the conditioner ID of this asset manage req entity
	 */
	public void setConditionerId(Long conditionerId);

	/**
	 * Returns the cat group mer ID of this asset manage req entity.
	 *
	 * @return the cat group mer ID of this asset manage req entity
	 */
	public Long getCatGroupMerId();

	/**
	 * Sets the cat group mer ID of this asset manage req entity.
	 *
	 * @param catGroupMerId the cat group mer ID of this asset manage req entity
	 */
	public void setCatGroupMerId(Long catGroupMerId);

	/**
	 * Returns the upgrade parent ID of this asset manage req entity.
	 *
	 * @return the upgrade parent ID of this asset manage req entity
	 */
	public Long getUpgradeParentId();

	/**
	 * Sets the upgrade parent ID of this asset manage req entity.
	 *
	 * @param upgradeParentId the upgrade parent ID of this asset manage req entity
	 */
	public void setUpgradeParentId(Long upgradeParentId);

	/**
	 * Returns the partner ID of this asset manage req entity.
	 *
	 * @return the partner ID of this asset manage req entity
	 */
	public Long getPartnerId();

	/**
	 * Sets the partner ID of this asset manage req entity.
	 *
	 * @param partnerId the partner ID of this asset manage req entity
	 */
	public void setPartnerId(Long partnerId);

	/**
	 * Returns the delivery note ID of this asset manage req entity.
	 *
	 * @return the delivery note ID of this asset manage req entity
	 */
	public Long getDeliveryNoteId();

	/**
	 * Sets the delivery note ID of this asset manage req entity.
	 *
	 * @param deliveryNoteId the delivery note ID of this asset manage req entity
	 */
	public void setDeliveryNoteId(Long deliveryNoteId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.viettel.ams.core.model.AssetManageReqEntity assetManageReqEntity);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.viettel.ams.core.model.AssetManageReqEntity> toCacheModel();

	@Override
	public com.viettel.ams.core.model.AssetManageReqEntity toEscapedModel();

	@Override
	public com.viettel.ams.core.model.AssetManageReqEntity toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
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
 * This class is a wrapper for {@link AssetManageReqHandle}.
 * </p>
 *
 * @author MrNet
 * @see AssetManageReqHandle
 * @generated
 */
public class AssetManageReqHandleWrapper implements AssetManageReqHandle,
	ModelWrapper<AssetManageReqHandle> {
	public AssetManageReqHandleWrapper(
		AssetManageReqHandle assetManageReqHandle) {
		_assetManageReqHandle = assetManageReqHandle;
	}

	@Override
	public Class<?> getModelClass() {
		return AssetManageReqHandle.class;
	}

	@Override
	public String getModelClassName() {
		return AssetManageReqHandle.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("handleId", getHandleId());
		attributes.put("manageReqId", getManageReqId());
		attributes.put("description", getDescription());
		attributes.put("updatorId", getUpdatorId());
		attributes.put("updateDate", getUpdateDate());
		attributes.put("status", getStatus());
		attributes.put("code", getCode());
		attributes.put("createGroupId", getCreateGroupId());
		attributes.put("impReqId", getImpReqId());
		attributes.put("reqDelegator", getReqDelegator());
		attributes.put("reqDelegatorPosition", getReqDelegatorPosition());
		attributes.put("document", getDocument());
		attributes.put("beginDate", getBeginDate());
		attributes.put("endDate", getEndDate());
		attributes.put("kcsCode", getKcsCode());
		attributes.put("handOverId", getHandOverId());
		attributes.put("impReqCode", getImpReqCode());
		attributes.put("baseKcsCode", getBaseKcsCode());
		attributes.put("creatorKcs", getCreatorKcs());
		attributes.put("assetType", getAssetType());
		attributes.put("isNotModify", getIsNotModify());
		attributes.put("handleDelegator", getHandleDelegator());
		attributes.put("handleDelegatorPosition", getHandleDelegatorPosition());
		attributes.put("contractId", getContractId());
		attributes.put("statusCa", getStatusCa());
		attributes.put("commentCa", getCommentCa());
		attributes.put("documentCaId", getDocumentCaId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long handleId = (Long)attributes.get("handleId");

		if (handleId != null) {
			setHandleId(handleId);
		}

		Long manageReqId = (Long)attributes.get("manageReqId");

		if (manageReqId != null) {
			setManageReqId(manageReqId);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long updatorId = (Long)attributes.get("updatorId");

		if (updatorId != null) {
			setUpdatorId(updatorId);
		}

		Date updateDate = (Date)attributes.get("updateDate");

		if (updateDate != null) {
			setUpdateDate(updateDate);
		}

		Long status = (Long)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		Long createGroupId = (Long)attributes.get("createGroupId");

		if (createGroupId != null) {
			setCreateGroupId(createGroupId);
		}

		Long impReqId = (Long)attributes.get("impReqId");

		if (impReqId != null) {
			setImpReqId(impReqId);
		}

		String reqDelegator = (String)attributes.get("reqDelegator");

		if (reqDelegator != null) {
			setReqDelegator(reqDelegator);
		}

		String reqDelegatorPosition = (String)attributes.get(
				"reqDelegatorPosition");

		if (reqDelegatorPosition != null) {
			setReqDelegatorPosition(reqDelegatorPosition);
		}

		String document = (String)attributes.get("document");

		if (document != null) {
			setDocument(document);
		}

		Date beginDate = (Date)attributes.get("beginDate");

		if (beginDate != null) {
			setBeginDate(beginDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		String kcsCode = (String)attributes.get("kcsCode");

		if (kcsCode != null) {
			setKcsCode(kcsCode);
		}

		Long handOverId = (Long)attributes.get("handOverId");

		if (handOverId != null) {
			setHandOverId(handOverId);
		}

		String impReqCode = (String)attributes.get("impReqCode");

		if (impReqCode != null) {
			setImpReqCode(impReqCode);
		}

		Long baseKcsCode = (Long)attributes.get("baseKcsCode");

		if (baseKcsCode != null) {
			setBaseKcsCode(baseKcsCode);
		}

		Long creatorKcs = (Long)attributes.get("creatorKcs");

		if (creatorKcs != null) {
			setCreatorKcs(creatorKcs);
		}

		Long assetType = (Long)attributes.get("assetType");

		if (assetType != null) {
			setAssetType(assetType);
		}

		Long isNotModify = (Long)attributes.get("isNotModify");

		if (isNotModify != null) {
			setIsNotModify(isNotModify);
		}

		String handleDelegator = (String)attributes.get("handleDelegator");

		if (handleDelegator != null) {
			setHandleDelegator(handleDelegator);
		}

		String handleDelegatorPosition = (String)attributes.get(
				"handleDelegatorPosition");

		if (handleDelegatorPosition != null) {
			setHandleDelegatorPosition(handleDelegatorPosition);
		}

		Long contractId = (Long)attributes.get("contractId");

		if (contractId != null) {
			setContractId(contractId);
		}

		Long statusCa = (Long)attributes.get("statusCa");

		if (statusCa != null) {
			setStatusCa(statusCa);
		}

		String commentCa = (String)attributes.get("commentCa");

		if (commentCa != null) {
			setCommentCa(commentCa);
		}

		Long documentCaId = (Long)attributes.get("documentCaId");

		if (documentCaId != null) {
			setDocumentCaId(documentCaId);
		}
	}

	/**
	* Returns the primary key of this asset manage req handle.
	*
	* @return the primary key of this asset manage req handle
	*/
	@Override
	public long getPrimaryKey() {
		return _assetManageReqHandle.getPrimaryKey();
	}

	/**
	* Sets the primary key of this asset manage req handle.
	*
	* @param primaryKey the primary key of this asset manage req handle
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assetManageReqHandle.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the handle ID of this asset manage req handle.
	*
	* @return the handle ID of this asset manage req handle
	*/
	@Override
	public long getHandleId() {
		return _assetManageReqHandle.getHandleId();
	}

	/**
	* Sets the handle ID of this asset manage req handle.
	*
	* @param handleId the handle ID of this asset manage req handle
	*/
	@Override
	public void setHandleId(long handleId) {
		_assetManageReqHandle.setHandleId(handleId);
	}

	/**
	* Returns the manage req ID of this asset manage req handle.
	*
	* @return the manage req ID of this asset manage req handle
	*/
	@Override
	public java.lang.Long getManageReqId() {
		return _assetManageReqHandle.getManageReqId();
	}

	/**
	* Sets the manage req ID of this asset manage req handle.
	*
	* @param manageReqId the manage req ID of this asset manage req handle
	*/
	@Override
	public void setManageReqId(java.lang.Long manageReqId) {
		_assetManageReqHandle.setManageReqId(manageReqId);
	}

	/**
	* Returns the description of this asset manage req handle.
	*
	* @return the description of this asset manage req handle
	*/
	@Override
	public java.lang.String getDescription() {
		return _assetManageReqHandle.getDescription();
	}

	/**
	* Sets the description of this asset manage req handle.
	*
	* @param description the description of this asset manage req handle
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_assetManageReqHandle.setDescription(description);
	}

	/**
	* Returns the updator ID of this asset manage req handle.
	*
	* @return the updator ID of this asset manage req handle
	*/
	@Override
	public java.lang.Long getUpdatorId() {
		return _assetManageReqHandle.getUpdatorId();
	}

	/**
	* Sets the updator ID of this asset manage req handle.
	*
	* @param updatorId the updator ID of this asset manage req handle
	*/
	@Override
	public void setUpdatorId(java.lang.Long updatorId) {
		_assetManageReqHandle.setUpdatorId(updatorId);
	}

	/**
	* Returns the update date of this asset manage req handle.
	*
	* @return the update date of this asset manage req handle
	*/
	@Override
	public java.util.Date getUpdateDate() {
		return _assetManageReqHandle.getUpdateDate();
	}

	/**
	* Sets the update date of this asset manage req handle.
	*
	* @param updateDate the update date of this asset manage req handle
	*/
	@Override
	public void setUpdateDate(java.util.Date updateDate) {
		_assetManageReqHandle.setUpdateDate(updateDate);
	}

	/**
	* Returns the status of this asset manage req handle.
	*
	* @return the status of this asset manage req handle
	*/
	@Override
	public java.lang.Long getStatus() {
		return _assetManageReqHandle.getStatus();
	}

	/**
	* Sets the status of this asset manage req handle.
	*
	* @param status the status of this asset manage req handle
	*/
	@Override
	public void setStatus(java.lang.Long status) {
		_assetManageReqHandle.setStatus(status);
	}

	/**
	* Returns the code of this asset manage req handle.
	*
	* @return the code of this asset manage req handle
	*/
	@Override
	public java.lang.String getCode() {
		return _assetManageReqHandle.getCode();
	}

	/**
	* Sets the code of this asset manage req handle.
	*
	* @param code the code of this asset manage req handle
	*/
	@Override
	public void setCode(java.lang.String code) {
		_assetManageReqHandle.setCode(code);
	}

	/**
	* Returns the create group ID of this asset manage req handle.
	*
	* @return the create group ID of this asset manage req handle
	*/
	@Override
	public java.lang.Long getCreateGroupId() {
		return _assetManageReqHandle.getCreateGroupId();
	}

	/**
	* Sets the create group ID of this asset manage req handle.
	*
	* @param createGroupId the create group ID of this asset manage req handle
	*/
	@Override
	public void setCreateGroupId(java.lang.Long createGroupId) {
		_assetManageReqHandle.setCreateGroupId(createGroupId);
	}

	/**
	* Returns the imp req ID of this asset manage req handle.
	*
	* @return the imp req ID of this asset manage req handle
	*/
	@Override
	public java.lang.Long getImpReqId() {
		return _assetManageReqHandle.getImpReqId();
	}

	/**
	* Sets the imp req ID of this asset manage req handle.
	*
	* @param impReqId the imp req ID of this asset manage req handle
	*/
	@Override
	public void setImpReqId(java.lang.Long impReqId) {
		_assetManageReqHandle.setImpReqId(impReqId);
	}

	/**
	* Returns the req delegator of this asset manage req handle.
	*
	* @return the req delegator of this asset manage req handle
	*/
	@Override
	public java.lang.String getReqDelegator() {
		return _assetManageReqHandle.getReqDelegator();
	}

	/**
	* Sets the req delegator of this asset manage req handle.
	*
	* @param reqDelegator the req delegator of this asset manage req handle
	*/
	@Override
	public void setReqDelegator(java.lang.String reqDelegator) {
		_assetManageReqHandle.setReqDelegator(reqDelegator);
	}

	/**
	* Returns the req delegator position of this asset manage req handle.
	*
	* @return the req delegator position of this asset manage req handle
	*/
	@Override
	public java.lang.String getReqDelegatorPosition() {
		return _assetManageReqHandle.getReqDelegatorPosition();
	}

	/**
	* Sets the req delegator position of this asset manage req handle.
	*
	* @param reqDelegatorPosition the req delegator position of this asset manage req handle
	*/
	@Override
	public void setReqDelegatorPosition(java.lang.String reqDelegatorPosition) {
		_assetManageReqHandle.setReqDelegatorPosition(reqDelegatorPosition);
	}

	/**
	* Returns the document of this asset manage req handle.
	*
	* @return the document of this asset manage req handle
	*/
	@Override
	public java.lang.String getDocument() {
		return _assetManageReqHandle.getDocument();
	}

	/**
	* Sets the document of this asset manage req handle.
	*
	* @param document the document of this asset manage req handle
	*/
	@Override
	public void setDocument(java.lang.String document) {
		_assetManageReqHandle.setDocument(document);
	}

	/**
	* Returns the begin date of this asset manage req handle.
	*
	* @return the begin date of this asset manage req handle
	*/
	@Override
	public java.util.Date getBeginDate() {
		return _assetManageReqHandle.getBeginDate();
	}

	/**
	* Sets the begin date of this asset manage req handle.
	*
	* @param beginDate the begin date of this asset manage req handle
	*/
	@Override
	public void setBeginDate(java.util.Date beginDate) {
		_assetManageReqHandle.setBeginDate(beginDate);
	}

	/**
	* Returns the end date of this asset manage req handle.
	*
	* @return the end date of this asset manage req handle
	*/
	@Override
	public java.util.Date getEndDate() {
		return _assetManageReqHandle.getEndDate();
	}

	/**
	* Sets the end date of this asset manage req handle.
	*
	* @param endDate the end date of this asset manage req handle
	*/
	@Override
	public void setEndDate(java.util.Date endDate) {
		_assetManageReqHandle.setEndDate(endDate);
	}

	/**
	* Returns the kcs code of this asset manage req handle.
	*
	* @return the kcs code of this asset manage req handle
	*/
	@Override
	public java.lang.String getKcsCode() {
		return _assetManageReqHandle.getKcsCode();
	}

	/**
	* Sets the kcs code of this asset manage req handle.
	*
	* @param kcsCode the kcs code of this asset manage req handle
	*/
	@Override
	public void setKcsCode(java.lang.String kcsCode) {
		_assetManageReqHandle.setKcsCode(kcsCode);
	}

	/**
	* Returns the hand over ID of this asset manage req handle.
	*
	* @return the hand over ID of this asset manage req handle
	*/
	@Override
	public java.lang.Long getHandOverId() {
		return _assetManageReqHandle.getHandOverId();
	}

	/**
	* Sets the hand over ID of this asset manage req handle.
	*
	* @param handOverId the hand over ID of this asset manage req handle
	*/
	@Override
	public void setHandOverId(java.lang.Long handOverId) {
		_assetManageReqHandle.setHandOverId(handOverId);
	}

	/**
	* Returns the imp req code of this asset manage req handle.
	*
	* @return the imp req code of this asset manage req handle
	*/
	@Override
	public java.lang.String getImpReqCode() {
		return _assetManageReqHandle.getImpReqCode();
	}

	/**
	* Sets the imp req code of this asset manage req handle.
	*
	* @param impReqCode the imp req code of this asset manage req handle
	*/
	@Override
	public void setImpReqCode(java.lang.String impReqCode) {
		_assetManageReqHandle.setImpReqCode(impReqCode);
	}

	/**
	* Returns the base kcs code of this asset manage req handle.
	*
	* @return the base kcs code of this asset manage req handle
	*/
	@Override
	public java.lang.Long getBaseKcsCode() {
		return _assetManageReqHandle.getBaseKcsCode();
	}

	/**
	* Sets the base kcs code of this asset manage req handle.
	*
	* @param baseKcsCode the base kcs code of this asset manage req handle
	*/
	@Override
	public void setBaseKcsCode(java.lang.Long baseKcsCode) {
		_assetManageReqHandle.setBaseKcsCode(baseKcsCode);
	}

	/**
	* Returns the creator kcs of this asset manage req handle.
	*
	* @return the creator kcs of this asset manage req handle
	*/
	@Override
	public java.lang.Long getCreatorKcs() {
		return _assetManageReqHandle.getCreatorKcs();
	}

	/**
	* Sets the creator kcs of this asset manage req handle.
	*
	* @param creatorKcs the creator kcs of this asset manage req handle
	*/
	@Override
	public void setCreatorKcs(java.lang.Long creatorKcs) {
		_assetManageReqHandle.setCreatorKcs(creatorKcs);
	}

	/**
	* Returns the asset type of this asset manage req handle.
	*
	* @return the asset type of this asset manage req handle
	*/
	@Override
	public java.lang.Long getAssetType() {
		return _assetManageReqHandle.getAssetType();
	}

	/**
	* Sets the asset type of this asset manage req handle.
	*
	* @param assetType the asset type of this asset manage req handle
	*/
	@Override
	public void setAssetType(java.lang.Long assetType) {
		_assetManageReqHandle.setAssetType(assetType);
	}

	/**
	* Returns the is not modify of this asset manage req handle.
	*
	* @return the is not modify of this asset manage req handle
	*/
	@Override
	public java.lang.Long getIsNotModify() {
		return _assetManageReqHandle.getIsNotModify();
	}

	/**
	* Sets the is not modify of this asset manage req handle.
	*
	* @param isNotModify the is not modify of this asset manage req handle
	*/
	@Override
	public void setIsNotModify(java.lang.Long isNotModify) {
		_assetManageReqHandle.setIsNotModify(isNotModify);
	}

	/**
	* Returns the handle delegator of this asset manage req handle.
	*
	* @return the handle delegator of this asset manage req handle
	*/
	@Override
	public java.lang.String getHandleDelegator() {
		return _assetManageReqHandle.getHandleDelegator();
	}

	/**
	* Sets the handle delegator of this asset manage req handle.
	*
	* @param handleDelegator the handle delegator of this asset manage req handle
	*/
	@Override
	public void setHandleDelegator(java.lang.String handleDelegator) {
		_assetManageReqHandle.setHandleDelegator(handleDelegator);
	}

	/**
	* Returns the handle delegator position of this asset manage req handle.
	*
	* @return the handle delegator position of this asset manage req handle
	*/
	@Override
	public java.lang.String getHandleDelegatorPosition() {
		return _assetManageReqHandle.getHandleDelegatorPosition();
	}

	/**
	* Sets the handle delegator position of this asset manage req handle.
	*
	* @param handleDelegatorPosition the handle delegator position of this asset manage req handle
	*/
	@Override
	public void setHandleDelegatorPosition(
		java.lang.String handleDelegatorPosition) {
		_assetManageReqHandle.setHandleDelegatorPosition(handleDelegatorPosition);
	}

	/**
	* Returns the contract ID of this asset manage req handle.
	*
	* @return the contract ID of this asset manage req handle
	*/
	@Override
	public java.lang.Long getContractId() {
		return _assetManageReqHandle.getContractId();
	}

	/**
	* Sets the contract ID of this asset manage req handle.
	*
	* @param contractId the contract ID of this asset manage req handle
	*/
	@Override
	public void setContractId(java.lang.Long contractId) {
		_assetManageReqHandle.setContractId(contractId);
	}

	/**
	* Returns the status ca of this asset manage req handle.
	*
	* @return the status ca of this asset manage req handle
	*/
	@Override
	public java.lang.Long getStatusCa() {
		return _assetManageReqHandle.getStatusCa();
	}

	/**
	* Sets the status ca of this asset manage req handle.
	*
	* @param statusCa the status ca of this asset manage req handle
	*/
	@Override
	public void setStatusCa(java.lang.Long statusCa) {
		_assetManageReqHandle.setStatusCa(statusCa);
	}

	/**
	* Returns the comment ca of this asset manage req handle.
	*
	* @return the comment ca of this asset manage req handle
	*/
	@Override
	public java.lang.String getCommentCa() {
		return _assetManageReqHandle.getCommentCa();
	}

	/**
	* Sets the comment ca of this asset manage req handle.
	*
	* @param commentCa the comment ca of this asset manage req handle
	*/
	@Override
	public void setCommentCa(java.lang.String commentCa) {
		_assetManageReqHandle.setCommentCa(commentCa);
	}

	/**
	* Returns the document ca ID of this asset manage req handle.
	*
	* @return the document ca ID of this asset manage req handle
	*/
	@Override
	public java.lang.Long getDocumentCaId() {
		return _assetManageReqHandle.getDocumentCaId();
	}

	/**
	* Sets the document ca ID of this asset manage req handle.
	*
	* @param documentCaId the document ca ID of this asset manage req handle
	*/
	@Override
	public void setDocumentCaId(java.lang.Long documentCaId) {
		_assetManageReqHandle.setDocumentCaId(documentCaId);
	}

	@Override
	public boolean isNew() {
		return _assetManageReqHandle.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assetManageReqHandle.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assetManageReqHandle.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assetManageReqHandle.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assetManageReqHandle.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assetManageReqHandle.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assetManageReqHandle.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assetManageReqHandle.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assetManageReqHandle.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assetManageReqHandle.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assetManageReqHandle.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssetManageReqHandleWrapper((AssetManageReqHandle)_assetManageReqHandle.clone());
	}

	@Override
	public int compareTo(
		com.viettel.ams.core.model.AssetManageReqHandle assetManageReqHandle) {
		return _assetManageReqHandle.compareTo(assetManageReqHandle);
	}

	@Override
	public int hashCode() {
		return _assetManageReqHandle.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.viettel.ams.core.model.AssetManageReqHandle> toCacheModel() {
		return _assetManageReqHandle.toCacheModel();
	}

	@Override
	public com.viettel.ams.core.model.AssetManageReqHandle toEscapedModel() {
		return new AssetManageReqHandleWrapper(_assetManageReqHandle.toEscapedModel());
	}

	@Override
	public com.viettel.ams.core.model.AssetManageReqHandle toUnescapedModel() {
		return new AssetManageReqHandleWrapper(_assetManageReqHandle.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assetManageReqHandle.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assetManageReqHandle.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assetManageReqHandle.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetManageReqHandleWrapper)) {
			return false;
		}

		AssetManageReqHandleWrapper assetManageReqHandleWrapper = (AssetManageReqHandleWrapper)obj;

		if (Validator.equals(_assetManageReqHandle,
					assetManageReqHandleWrapper._assetManageReqHandle)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AssetManageReqHandle getWrappedAssetManageReqHandle() {
		return _assetManageReqHandle;
	}

	@Override
	public AssetManageReqHandle getWrappedModel() {
		return _assetManageReqHandle;
	}

	@Override
	public void resetOriginalValues() {
		_assetManageReqHandle.resetOriginalValues();
	}

	private AssetManageReqHandle _assetManageReqHandle;
}
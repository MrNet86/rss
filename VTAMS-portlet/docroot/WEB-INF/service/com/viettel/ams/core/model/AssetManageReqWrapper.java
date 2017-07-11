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
 * This class is a wrapper for {@link AssetManageReq}.
 * </p>
 *
 * @author MrNet
 * @see AssetManageReq
 * @generated
 */
public class AssetManageReqWrapper implements AssetManageReq,
	ModelWrapper<AssetManageReq> {
	public AssetManageReqWrapper(AssetManageReq assetManageReq) {
		_assetManageReq = assetManageReq;
	}

	@Override
	public Class<?> getModelClass() {
		return AssetManageReq.class;
	}

	@Override
	public String getModelClassName() {
		return AssetManageReq.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("manageReqId", getManageReqId());
		attributes.put("reqGroupId", getReqGroupId());
		attributes.put("userId", getUserId());
		attributes.put("recvGroupId", getRecvGroupId());
		attributes.put("cause", getCause());
		attributes.put("creatorId", getCreatorId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("status", getStatus());
		attributes.put("type", getType());
		attributes.put("usedGroupId", getUsedGroupId());
		attributes.put("code", getCode());
		attributes.put("acceptorId", getAcceptorId());
		attributes.put("acceptComment", getAcceptComment());
		attributes.put("retrieveCauseId", getRetrieveCauseId());
		attributes.put("constructId", getConstructId());
		attributes.put("delegator", getDelegator());
		attributes.put("isFull", getIsFull());
		attributes.put("titleDelegator", getTitleDelegator());
		attributes.put("mobileNumber", getMobileNumber());
		attributes.put("document", getDocument());
		attributes.put("failCheckId", getFailCheckId());
		attributes.put("deliveryNoteId", getDeliveryNoteId());
		attributes.put("isMaintain", getIsMaintain());
		attributes.put("causeReject", getCauseReject());
		attributes.put("assetType", getAssetType());
		attributes.put("retrieveType", getRetrieveType());
		attributes.put("retrieveCmdId", getRetrieveCmdId());
		attributes.put("planSwapId", getPlanSwapId());
		attributes.put("certificateRegistrationId",
			getCertificateRegistrationId());
		attributes.put("contractid", getContractid());
		attributes.put("partnerId", getPartnerId());
		attributes.put("statusCa", getStatusCa());
		attributes.put("commentCa", getCommentCa());
		attributes.put("documentCaId", getDocumentCaId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long manageReqId = (Long)attributes.get("manageReqId");

		if (manageReqId != null) {
			setManageReqId(manageReqId);
		}

		Long reqGroupId = (Long)attributes.get("reqGroupId");

		if (reqGroupId != null) {
			setReqGroupId(reqGroupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long recvGroupId = (Long)attributes.get("recvGroupId");

		if (recvGroupId != null) {
			setRecvGroupId(recvGroupId);
		}

		String cause = (String)attributes.get("cause");

		if (cause != null) {
			setCause(cause);
		}

		Long creatorId = (Long)attributes.get("creatorId");

		if (creatorId != null) {
			setCreatorId(creatorId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long status = (Long)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long type = (Long)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Long usedGroupId = (Long)attributes.get("usedGroupId");

		if (usedGroupId != null) {
			setUsedGroupId(usedGroupId);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		Long acceptorId = (Long)attributes.get("acceptorId");

		if (acceptorId != null) {
			setAcceptorId(acceptorId);
		}

		String acceptComment = (String)attributes.get("acceptComment");

		if (acceptComment != null) {
			setAcceptComment(acceptComment);
		}

		Long retrieveCauseId = (Long)attributes.get("retrieveCauseId");

		if (retrieveCauseId != null) {
			setRetrieveCauseId(retrieveCauseId);
		}

		Long constructId = (Long)attributes.get("constructId");

		if (constructId != null) {
			setConstructId(constructId);
		}

		String delegator = (String)attributes.get("delegator");

		if (delegator != null) {
			setDelegator(delegator);
		}

		Long isFull = (Long)attributes.get("isFull");

		if (isFull != null) {
			setIsFull(isFull);
		}

		String titleDelegator = (String)attributes.get("titleDelegator");

		if (titleDelegator != null) {
			setTitleDelegator(titleDelegator);
		}

		Long mobileNumber = (Long)attributes.get("mobileNumber");

		if (mobileNumber != null) {
			setMobileNumber(mobileNumber);
		}

		String document = (String)attributes.get("document");

		if (document != null) {
			setDocument(document);
		}

		Long failCheckId = (Long)attributes.get("failCheckId");

		if (failCheckId != null) {
			setFailCheckId(failCheckId);
		}

		Long deliveryNoteId = (Long)attributes.get("deliveryNoteId");

		if (deliveryNoteId != null) {
			setDeliveryNoteId(deliveryNoteId);
		}

		Long isMaintain = (Long)attributes.get("isMaintain");

		if (isMaintain != null) {
			setIsMaintain(isMaintain);
		}

		String causeReject = (String)attributes.get("causeReject");

		if (causeReject != null) {
			setCauseReject(causeReject);
		}

		Long assetType = (Long)attributes.get("assetType");

		if (assetType != null) {
			setAssetType(assetType);
		}

		Long retrieveType = (Long)attributes.get("retrieveType");

		if (retrieveType != null) {
			setRetrieveType(retrieveType);
		}

		Long retrieveCmdId = (Long)attributes.get("retrieveCmdId");

		if (retrieveCmdId != null) {
			setRetrieveCmdId(retrieveCmdId);
		}

		Long planSwapId = (Long)attributes.get("planSwapId");

		if (planSwapId != null) {
			setPlanSwapId(planSwapId);
		}

		Long certificateRegistrationId = (Long)attributes.get(
				"certificateRegistrationId");

		if (certificateRegistrationId != null) {
			setCertificateRegistrationId(certificateRegistrationId);
		}

		Long contractid = (Long)attributes.get("contractid");

		if (contractid != null) {
			setContractid(contractid);
		}

		Long partnerId = (Long)attributes.get("partnerId");

		if (partnerId != null) {
			setPartnerId(partnerId);
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
	* Returns the primary key of this asset manage req.
	*
	* @return the primary key of this asset manage req
	*/
	@Override
	public long getPrimaryKey() {
		return _assetManageReq.getPrimaryKey();
	}

	/**
	* Sets the primary key of this asset manage req.
	*
	* @param primaryKey the primary key of this asset manage req
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assetManageReq.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the manage req ID of this asset manage req.
	*
	* @return the manage req ID of this asset manage req
	*/
	@Override
	public long getManageReqId() {
		return _assetManageReq.getManageReqId();
	}

	/**
	* Sets the manage req ID of this asset manage req.
	*
	* @param manageReqId the manage req ID of this asset manage req
	*/
	@Override
	public void setManageReqId(long manageReqId) {
		_assetManageReq.setManageReqId(manageReqId);
	}

	/**
	* Returns the req group ID of this asset manage req.
	*
	* @return the req group ID of this asset manage req
	*/
	@Override
	public java.lang.Long getReqGroupId() {
		return _assetManageReq.getReqGroupId();
	}

	/**
	* Sets the req group ID of this asset manage req.
	*
	* @param reqGroupId the req group ID of this asset manage req
	*/
	@Override
	public void setReqGroupId(java.lang.Long reqGroupId) {
		_assetManageReq.setReqGroupId(reqGroupId);
	}

	/**
	* Returns the user ID of this asset manage req.
	*
	* @return the user ID of this asset manage req
	*/
	@Override
	public java.lang.Long getUserId() {
		return _assetManageReq.getUserId();
	}

	/**
	* Sets the user ID of this asset manage req.
	*
	* @param userId the user ID of this asset manage req
	*/
	@Override
	public void setUserId(java.lang.Long userId) {
		_assetManageReq.setUserId(userId);
	}

	/**
	* Returns the recv group ID of this asset manage req.
	*
	* @return the recv group ID of this asset manage req
	*/
	@Override
	public java.lang.Long getRecvGroupId() {
		return _assetManageReq.getRecvGroupId();
	}

	/**
	* Sets the recv group ID of this asset manage req.
	*
	* @param recvGroupId the recv group ID of this asset manage req
	*/
	@Override
	public void setRecvGroupId(java.lang.Long recvGroupId) {
		_assetManageReq.setRecvGroupId(recvGroupId);
	}

	/**
	* Returns the cause of this asset manage req.
	*
	* @return the cause of this asset manage req
	*/
	@Override
	public java.lang.String getCause() {
		return _assetManageReq.getCause();
	}

	/**
	* Sets the cause of this asset manage req.
	*
	* @param cause the cause of this asset manage req
	*/
	@Override
	public void setCause(java.lang.String cause) {
		_assetManageReq.setCause(cause);
	}

	/**
	* Returns the creator ID of this asset manage req.
	*
	* @return the creator ID of this asset manage req
	*/
	@Override
	public java.lang.Long getCreatorId() {
		return _assetManageReq.getCreatorId();
	}

	/**
	* Sets the creator ID of this asset manage req.
	*
	* @param creatorId the creator ID of this asset manage req
	*/
	@Override
	public void setCreatorId(java.lang.Long creatorId) {
		_assetManageReq.setCreatorId(creatorId);
	}

	/**
	* Returns the created date of this asset manage req.
	*
	* @return the created date of this asset manage req
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _assetManageReq.getCreatedDate();
	}

	/**
	* Sets the created date of this asset manage req.
	*
	* @param createdDate the created date of this asset manage req
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_assetManageReq.setCreatedDate(createdDate);
	}

	/**
	* Returns the status of this asset manage req.
	*
	* @return the status of this asset manage req
	*/
	@Override
	public java.lang.Long getStatus() {
		return _assetManageReq.getStatus();
	}

	/**
	* Sets the status of this asset manage req.
	*
	* @param status the status of this asset manage req
	*/
	@Override
	public void setStatus(java.lang.Long status) {
		_assetManageReq.setStatus(status);
	}

	/**
	* Returns the type of this asset manage req.
	*
	* @return the type of this asset manage req
	*/
	@Override
	public java.lang.Long getType() {
		return _assetManageReq.getType();
	}

	/**
	* Sets the type of this asset manage req.
	*
	* @param type the type of this asset manage req
	*/
	@Override
	public void setType(java.lang.Long type) {
		_assetManageReq.setType(type);
	}

	/**
	* Returns the used group ID of this asset manage req.
	*
	* @return the used group ID of this asset manage req
	*/
	@Override
	public java.lang.Long getUsedGroupId() {
		return _assetManageReq.getUsedGroupId();
	}

	/**
	* Sets the used group ID of this asset manage req.
	*
	* @param usedGroupId the used group ID of this asset manage req
	*/
	@Override
	public void setUsedGroupId(java.lang.Long usedGroupId) {
		_assetManageReq.setUsedGroupId(usedGroupId);
	}

	/**
	* Returns the code of this asset manage req.
	*
	* @return the code of this asset manage req
	*/
	@Override
	public java.lang.String getCode() {
		return _assetManageReq.getCode();
	}

	/**
	* Sets the code of this asset manage req.
	*
	* @param code the code of this asset manage req
	*/
	@Override
	public void setCode(java.lang.String code) {
		_assetManageReq.setCode(code);
	}

	/**
	* Returns the acceptor ID of this asset manage req.
	*
	* @return the acceptor ID of this asset manage req
	*/
	@Override
	public java.lang.Long getAcceptorId() {
		return _assetManageReq.getAcceptorId();
	}

	/**
	* Sets the acceptor ID of this asset manage req.
	*
	* @param acceptorId the acceptor ID of this asset manage req
	*/
	@Override
	public void setAcceptorId(java.lang.Long acceptorId) {
		_assetManageReq.setAcceptorId(acceptorId);
	}

	/**
	* Returns the accept comment of this asset manage req.
	*
	* @return the accept comment of this asset manage req
	*/
	@Override
	public java.lang.String getAcceptComment() {
		return _assetManageReq.getAcceptComment();
	}

	/**
	* Sets the accept comment of this asset manage req.
	*
	* @param acceptComment the accept comment of this asset manage req
	*/
	@Override
	public void setAcceptComment(java.lang.String acceptComment) {
		_assetManageReq.setAcceptComment(acceptComment);
	}

	/**
	* Returns the retrieve cause ID of this asset manage req.
	*
	* @return the retrieve cause ID of this asset manage req
	*/
	@Override
	public java.lang.Long getRetrieveCauseId() {
		return _assetManageReq.getRetrieveCauseId();
	}

	/**
	* Sets the retrieve cause ID of this asset manage req.
	*
	* @param retrieveCauseId the retrieve cause ID of this asset manage req
	*/
	@Override
	public void setRetrieveCauseId(java.lang.Long retrieveCauseId) {
		_assetManageReq.setRetrieveCauseId(retrieveCauseId);
	}

	/**
	* Returns the construct ID of this asset manage req.
	*
	* @return the construct ID of this asset manage req
	*/
	@Override
	public java.lang.Long getConstructId() {
		return _assetManageReq.getConstructId();
	}

	/**
	* Sets the construct ID of this asset manage req.
	*
	* @param constructId the construct ID of this asset manage req
	*/
	@Override
	public void setConstructId(java.lang.Long constructId) {
		_assetManageReq.setConstructId(constructId);
	}

	/**
	* Returns the delegator of this asset manage req.
	*
	* @return the delegator of this asset manage req
	*/
	@Override
	public java.lang.String getDelegator() {
		return _assetManageReq.getDelegator();
	}

	/**
	* Sets the delegator of this asset manage req.
	*
	* @param delegator the delegator of this asset manage req
	*/
	@Override
	public void setDelegator(java.lang.String delegator) {
		_assetManageReq.setDelegator(delegator);
	}

	/**
	* Returns the is full of this asset manage req.
	*
	* @return the is full of this asset manage req
	*/
	@Override
	public java.lang.Long getIsFull() {
		return _assetManageReq.getIsFull();
	}

	/**
	* Sets the is full of this asset manage req.
	*
	* @param isFull the is full of this asset manage req
	*/
	@Override
	public void setIsFull(java.lang.Long isFull) {
		_assetManageReq.setIsFull(isFull);
	}

	/**
	* Returns the title delegator of this asset manage req.
	*
	* @return the title delegator of this asset manage req
	*/
	@Override
	public java.lang.String getTitleDelegator() {
		return _assetManageReq.getTitleDelegator();
	}

	/**
	* Sets the title delegator of this asset manage req.
	*
	* @param titleDelegator the title delegator of this asset manage req
	*/
	@Override
	public void setTitleDelegator(java.lang.String titleDelegator) {
		_assetManageReq.setTitleDelegator(titleDelegator);
	}

	/**
	* Returns the mobile number of this asset manage req.
	*
	* @return the mobile number of this asset manage req
	*/
	@Override
	public java.lang.Long getMobileNumber() {
		return _assetManageReq.getMobileNumber();
	}

	/**
	* Sets the mobile number of this asset manage req.
	*
	* @param mobileNumber the mobile number of this asset manage req
	*/
	@Override
	public void setMobileNumber(java.lang.Long mobileNumber) {
		_assetManageReq.setMobileNumber(mobileNumber);
	}

	/**
	* Returns the document of this asset manage req.
	*
	* @return the document of this asset manage req
	*/
	@Override
	public java.lang.String getDocument() {
		return _assetManageReq.getDocument();
	}

	/**
	* Sets the document of this asset manage req.
	*
	* @param document the document of this asset manage req
	*/
	@Override
	public void setDocument(java.lang.String document) {
		_assetManageReq.setDocument(document);
	}

	/**
	* Returns the fail check ID of this asset manage req.
	*
	* @return the fail check ID of this asset manage req
	*/
	@Override
	public java.lang.Long getFailCheckId() {
		return _assetManageReq.getFailCheckId();
	}

	/**
	* Sets the fail check ID of this asset manage req.
	*
	* @param failCheckId the fail check ID of this asset manage req
	*/
	@Override
	public void setFailCheckId(java.lang.Long failCheckId) {
		_assetManageReq.setFailCheckId(failCheckId);
	}

	/**
	* Returns the delivery note ID of this asset manage req.
	*
	* @return the delivery note ID of this asset manage req
	*/
	@Override
	public java.lang.Long getDeliveryNoteId() {
		return _assetManageReq.getDeliveryNoteId();
	}

	/**
	* Sets the delivery note ID of this asset manage req.
	*
	* @param deliveryNoteId the delivery note ID of this asset manage req
	*/
	@Override
	public void setDeliveryNoteId(java.lang.Long deliveryNoteId) {
		_assetManageReq.setDeliveryNoteId(deliveryNoteId);
	}

	/**
	* Returns the is maintain of this asset manage req.
	*
	* @return the is maintain of this asset manage req
	*/
	@Override
	public java.lang.Long getIsMaintain() {
		return _assetManageReq.getIsMaintain();
	}

	/**
	* Sets the is maintain of this asset manage req.
	*
	* @param isMaintain the is maintain of this asset manage req
	*/
	@Override
	public void setIsMaintain(java.lang.Long isMaintain) {
		_assetManageReq.setIsMaintain(isMaintain);
	}

	/**
	* Returns the cause reject of this asset manage req.
	*
	* @return the cause reject of this asset manage req
	*/
	@Override
	public java.lang.String getCauseReject() {
		return _assetManageReq.getCauseReject();
	}

	/**
	* Sets the cause reject of this asset manage req.
	*
	* @param causeReject the cause reject of this asset manage req
	*/
	@Override
	public void setCauseReject(java.lang.String causeReject) {
		_assetManageReq.setCauseReject(causeReject);
	}

	/**
	* Returns the asset type of this asset manage req.
	*
	* @return the asset type of this asset manage req
	*/
	@Override
	public java.lang.Long getAssetType() {
		return _assetManageReq.getAssetType();
	}

	/**
	* Sets the asset type of this asset manage req.
	*
	* @param assetType the asset type of this asset manage req
	*/
	@Override
	public void setAssetType(java.lang.Long assetType) {
		_assetManageReq.setAssetType(assetType);
	}

	/**
	* Returns the retrieve type of this asset manage req.
	*
	* @return the retrieve type of this asset manage req
	*/
	@Override
	public java.lang.Long getRetrieveType() {
		return _assetManageReq.getRetrieveType();
	}

	/**
	* Sets the retrieve type of this asset manage req.
	*
	* @param retrieveType the retrieve type of this asset manage req
	*/
	@Override
	public void setRetrieveType(java.lang.Long retrieveType) {
		_assetManageReq.setRetrieveType(retrieveType);
	}

	/**
	* Returns the retrieve cmd ID of this asset manage req.
	*
	* @return the retrieve cmd ID of this asset manage req
	*/
	@Override
	public java.lang.Long getRetrieveCmdId() {
		return _assetManageReq.getRetrieveCmdId();
	}

	/**
	* Sets the retrieve cmd ID of this asset manage req.
	*
	* @param retrieveCmdId the retrieve cmd ID of this asset manage req
	*/
	@Override
	public void setRetrieveCmdId(java.lang.Long retrieveCmdId) {
		_assetManageReq.setRetrieveCmdId(retrieveCmdId);
	}

	/**
	* Returns the plan swap ID of this asset manage req.
	*
	* @return the plan swap ID of this asset manage req
	*/
	@Override
	public java.lang.Long getPlanSwapId() {
		return _assetManageReq.getPlanSwapId();
	}

	/**
	* Sets the plan swap ID of this asset manage req.
	*
	* @param planSwapId the plan swap ID of this asset manage req
	*/
	@Override
	public void setPlanSwapId(java.lang.Long planSwapId) {
		_assetManageReq.setPlanSwapId(planSwapId);
	}

	/**
	* Returns the certificate registration ID of this asset manage req.
	*
	* @return the certificate registration ID of this asset manage req
	*/
	@Override
	public java.lang.Long getCertificateRegistrationId() {
		return _assetManageReq.getCertificateRegistrationId();
	}

	/**
	* Sets the certificate registration ID of this asset manage req.
	*
	* @param certificateRegistrationId the certificate registration ID of this asset manage req
	*/
	@Override
	public void setCertificateRegistrationId(
		java.lang.Long certificateRegistrationId) {
		_assetManageReq.setCertificateRegistrationId(certificateRegistrationId);
	}

	/**
	* Returns the contractid of this asset manage req.
	*
	* @return the contractid of this asset manage req
	*/
	@Override
	public java.lang.Long getContractid() {
		return _assetManageReq.getContractid();
	}

	/**
	* Sets the contractid of this asset manage req.
	*
	* @param contractid the contractid of this asset manage req
	*/
	@Override
	public void setContractid(java.lang.Long contractid) {
		_assetManageReq.setContractid(contractid);
	}

	/**
	* Returns the partner ID of this asset manage req.
	*
	* @return the partner ID of this asset manage req
	*/
	@Override
	public java.lang.Long getPartnerId() {
		return _assetManageReq.getPartnerId();
	}

	/**
	* Sets the partner ID of this asset manage req.
	*
	* @param partnerId the partner ID of this asset manage req
	*/
	@Override
	public void setPartnerId(java.lang.Long partnerId) {
		_assetManageReq.setPartnerId(partnerId);
	}

	/**
	* Returns the status ca of this asset manage req.
	*
	* @return the status ca of this asset manage req
	*/
	@Override
	public java.lang.Long getStatusCa() {
		return _assetManageReq.getStatusCa();
	}

	/**
	* Sets the status ca of this asset manage req.
	*
	* @param statusCa the status ca of this asset manage req
	*/
	@Override
	public void setStatusCa(java.lang.Long statusCa) {
		_assetManageReq.setStatusCa(statusCa);
	}

	/**
	* Returns the comment ca of this asset manage req.
	*
	* @return the comment ca of this asset manage req
	*/
	@Override
	public java.lang.String getCommentCa() {
		return _assetManageReq.getCommentCa();
	}

	/**
	* Sets the comment ca of this asset manage req.
	*
	* @param commentCa the comment ca of this asset manage req
	*/
	@Override
	public void setCommentCa(java.lang.String commentCa) {
		_assetManageReq.setCommentCa(commentCa);
	}

	/**
	* Returns the document ca ID of this asset manage req.
	*
	* @return the document ca ID of this asset manage req
	*/
	@Override
	public java.lang.Long getDocumentCaId() {
		return _assetManageReq.getDocumentCaId();
	}

	/**
	* Sets the document ca ID of this asset manage req.
	*
	* @param documentCaId the document ca ID of this asset manage req
	*/
	@Override
	public void setDocumentCaId(java.lang.Long documentCaId) {
		_assetManageReq.setDocumentCaId(documentCaId);
	}

	@Override
	public boolean isNew() {
		return _assetManageReq.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assetManageReq.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assetManageReq.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assetManageReq.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assetManageReq.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assetManageReq.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assetManageReq.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assetManageReq.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assetManageReq.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assetManageReq.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assetManageReq.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssetManageReqWrapper((AssetManageReq)_assetManageReq.clone());
	}

	@Override
	public int compareTo(
		com.viettel.ams.core.model.AssetManageReq assetManageReq) {
		return _assetManageReq.compareTo(assetManageReq);
	}

	@Override
	public int hashCode() {
		return _assetManageReq.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.viettel.ams.core.model.AssetManageReq> toCacheModel() {
		return _assetManageReq.toCacheModel();
	}

	@Override
	public com.viettel.ams.core.model.AssetManageReq toEscapedModel() {
		return new AssetManageReqWrapper(_assetManageReq.toEscapedModel());
	}

	@Override
	public com.viettel.ams.core.model.AssetManageReq toUnescapedModel() {
		return new AssetManageReqWrapper(_assetManageReq.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assetManageReq.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assetManageReq.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assetManageReq.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetManageReqWrapper)) {
			return false;
		}

		AssetManageReqWrapper assetManageReqWrapper = (AssetManageReqWrapper)obj;

		if (Validator.equals(_assetManageReq,
					assetManageReqWrapper._assetManageReq)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AssetManageReq getWrappedAssetManageReq() {
		return _assetManageReq;
	}

	@Override
	public AssetManageReq getWrappedModel() {
		return _assetManageReq;
	}

	@Override
	public void resetOriginalValues() {
		_assetManageReq.resetOriginalValues();
	}

	private AssetManageReq _assetManageReq;
}
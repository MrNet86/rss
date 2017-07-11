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
 * This class is used by SOAP remote services, specifically {@link com.viettel.ams.core.service.http.AssetManageReqServiceSoap}.
 *
 * @author MrNet
 * @see com.viettel.ams.core.service.http.AssetManageReqServiceSoap
 * @generated
 */
public class AssetManageReqSoap implements Serializable {
	public static AssetManageReqSoap toSoapModel(AssetManageReq model) {
		AssetManageReqSoap soapModel = new AssetManageReqSoap();

		soapModel.setManageReqId(model.getManageReqId());
		soapModel.setReqGroupId(model.getReqGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setRecvGroupId(model.getRecvGroupId());
		soapModel.setCause(model.getCause());
		soapModel.setCreatorId(model.getCreatorId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setType(model.getType());
		soapModel.setUsedGroupId(model.getUsedGroupId());
		soapModel.setCode(model.getCode());
		soapModel.setAcceptorId(model.getAcceptorId());
		soapModel.setAcceptComment(model.getAcceptComment());
		soapModel.setRetrieveCauseId(model.getRetrieveCauseId());
		soapModel.setConstructId(model.getConstructId());
		soapModel.setDelegator(model.getDelegator());
		soapModel.setIsFull(model.getIsFull());
		soapModel.setTitleDelegator(model.getTitleDelegator());
		soapModel.setMobileNumber(model.getMobileNumber());
		soapModel.setDocument(model.getDocument());
		soapModel.setFailCheckId(model.getFailCheckId());
		soapModel.setDeliveryNoteId(model.getDeliveryNoteId());
		soapModel.setIsMaintain(model.getIsMaintain());
		soapModel.setCauseReject(model.getCauseReject());
		soapModel.setAssetType(model.getAssetType());
		soapModel.setRetrieveType(model.getRetrieveType());
		soapModel.setRetrieveCmdId(model.getRetrieveCmdId());
		soapModel.setPlanSwapId(model.getPlanSwapId());
		soapModel.setCertificateRegistrationId(model.getCertificateRegistrationId());
		soapModel.setContractid(model.getContractid());
		soapModel.setPartnerId(model.getPartnerId());
		soapModel.setStatusCa(model.getStatusCa());
		soapModel.setCommentCa(model.getCommentCa());
		soapModel.setDocumentCaId(model.getDocumentCaId());

		return soapModel;
	}

	public static AssetManageReqSoap[] toSoapModels(AssetManageReq[] models) {
		AssetManageReqSoap[] soapModels = new AssetManageReqSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssetManageReqSoap[][] toSoapModels(AssetManageReq[][] models) {
		AssetManageReqSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssetManageReqSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssetManageReqSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssetManageReqSoap[] toSoapModels(List<AssetManageReq> models) {
		List<AssetManageReqSoap> soapModels = new ArrayList<AssetManageReqSoap>(models.size());

		for (AssetManageReq model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssetManageReqSoap[soapModels.size()]);
	}

	public AssetManageReqSoap() {
	}

	public long getPrimaryKey() {
		return _manageReqId;
	}

	public void setPrimaryKey(long pk) {
		setManageReqId(pk);
	}

	public long getManageReqId() {
		return _manageReqId;
	}

	public void setManageReqId(long manageReqId) {
		_manageReqId = manageReqId;
	}

	public Long getReqGroupId() {
		return _reqGroupId;
	}

	public void setReqGroupId(Long reqGroupId) {
		_reqGroupId = reqGroupId;
	}

	public Long getUserId() {
		return _userId;
	}

	public void setUserId(Long userId) {
		_userId = userId;
	}

	public Long getRecvGroupId() {
		return _recvGroupId;
	}

	public void setRecvGroupId(Long recvGroupId) {
		_recvGroupId = recvGroupId;
	}

	public String getCause() {
		return _cause;
	}

	public void setCause(String cause) {
		_cause = cause;
	}

	public Long getCreatorId() {
		return _creatorId;
	}

	public void setCreatorId(Long creatorId) {
		_creatorId = creatorId;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public Long getStatus() {
		return _status;
	}

	public void setStatus(Long status) {
		_status = status;
	}

	public Long getType() {
		return _type;
	}

	public void setType(Long type) {
		_type = type;
	}

	public Long getUsedGroupId() {
		return _usedGroupId;
	}

	public void setUsedGroupId(Long usedGroupId) {
		_usedGroupId = usedGroupId;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public Long getAcceptorId() {
		return _acceptorId;
	}

	public void setAcceptorId(Long acceptorId) {
		_acceptorId = acceptorId;
	}

	public String getAcceptComment() {
		return _acceptComment;
	}

	public void setAcceptComment(String acceptComment) {
		_acceptComment = acceptComment;
	}

	public Long getRetrieveCauseId() {
		return _retrieveCauseId;
	}

	public void setRetrieveCauseId(Long retrieveCauseId) {
		_retrieveCauseId = retrieveCauseId;
	}

	public Long getConstructId() {
		return _constructId;
	}

	public void setConstructId(Long constructId) {
		_constructId = constructId;
	}

	public String getDelegator() {
		return _delegator;
	}

	public void setDelegator(String delegator) {
		_delegator = delegator;
	}

	public Long getIsFull() {
		return _isFull;
	}

	public void setIsFull(Long isFull) {
		_isFull = isFull;
	}

	public String getTitleDelegator() {
		return _titleDelegator;
	}

	public void setTitleDelegator(String titleDelegator) {
		_titleDelegator = titleDelegator;
	}

	public Long getMobileNumber() {
		return _mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		_mobileNumber = mobileNumber;
	}

	public String getDocument() {
		return _document;
	}

	public void setDocument(String document) {
		_document = document;
	}

	public Long getFailCheckId() {
		return _failCheckId;
	}

	public void setFailCheckId(Long failCheckId) {
		_failCheckId = failCheckId;
	}

	public Long getDeliveryNoteId() {
		return _deliveryNoteId;
	}

	public void setDeliveryNoteId(Long deliveryNoteId) {
		_deliveryNoteId = deliveryNoteId;
	}

	public Long getIsMaintain() {
		return _isMaintain;
	}

	public void setIsMaintain(Long isMaintain) {
		_isMaintain = isMaintain;
	}

	public String getCauseReject() {
		return _causeReject;
	}

	public void setCauseReject(String causeReject) {
		_causeReject = causeReject;
	}

	public Long getAssetType() {
		return _assetType;
	}

	public void setAssetType(Long assetType) {
		_assetType = assetType;
	}

	public Long getRetrieveType() {
		return _retrieveType;
	}

	public void setRetrieveType(Long retrieveType) {
		_retrieveType = retrieveType;
	}

	public Long getRetrieveCmdId() {
		return _retrieveCmdId;
	}

	public void setRetrieveCmdId(Long retrieveCmdId) {
		_retrieveCmdId = retrieveCmdId;
	}

	public Long getPlanSwapId() {
		return _planSwapId;
	}

	public void setPlanSwapId(Long planSwapId) {
		_planSwapId = planSwapId;
	}

	public Long getCertificateRegistrationId() {
		return _certificateRegistrationId;
	}

	public void setCertificateRegistrationId(Long certificateRegistrationId) {
		_certificateRegistrationId = certificateRegistrationId;
	}

	public Long getContractid() {
		return _contractid;
	}

	public void setContractid(Long contractid) {
		_contractid = contractid;
	}

	public Long getPartnerId() {
		return _partnerId;
	}

	public void setPartnerId(Long partnerId) {
		_partnerId = partnerId;
	}

	public Long getStatusCa() {
		return _statusCa;
	}

	public void setStatusCa(Long statusCa) {
		_statusCa = statusCa;
	}

	public String getCommentCa() {
		return _commentCa;
	}

	public void setCommentCa(String commentCa) {
		_commentCa = commentCa;
	}

	public Long getDocumentCaId() {
		return _documentCaId;
	}

	public void setDocumentCaId(Long documentCaId) {
		_documentCaId = documentCaId;
	}

	private long _manageReqId;
	private Long _reqGroupId;
	private Long _userId;
	private Long _recvGroupId;
	private String _cause;
	private Long _creatorId;
	private Date _createdDate;
	private Long _status;
	private Long _type;
	private Long _usedGroupId;
	private String _code;
	private Long _acceptorId;
	private String _acceptComment;
	private Long _retrieveCauseId;
	private Long _constructId;
	private String _delegator;
	private Long _isFull;
	private String _titleDelegator;
	private Long _mobileNumber;
	private String _document;
	private Long _failCheckId;
	private Long _deliveryNoteId;
	private Long _isMaintain;
	private String _causeReject;
	private Long _assetType;
	private Long _retrieveType;
	private Long _retrieveCmdId;
	private Long _planSwapId;
	private Long _certificateRegistrationId;
	private Long _contractid;
	private Long _partnerId;
	private Long _statusCa;
	private String _commentCa;
	private Long _documentCaId;
}
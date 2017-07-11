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
 * This class is used by SOAP remote services, specifically {@link com.viettel.ams.core.service.http.AssetManageReqHandleServiceSoap}.
 *
 * @author MrNet
 * @see com.viettel.ams.core.service.http.AssetManageReqHandleServiceSoap
 * @generated
 */
public class AssetManageReqHandleSoap implements Serializable {
	public static AssetManageReqHandleSoap toSoapModel(
		AssetManageReqHandle model) {
		AssetManageReqHandleSoap soapModel = new AssetManageReqHandleSoap();

		soapModel.setHandleId(model.getHandleId());
		soapModel.setManageReqId(model.getManageReqId());
		soapModel.setDescription(model.getDescription());
		soapModel.setUpdatorId(model.getUpdatorId());
		soapModel.setUpdateDate(model.getUpdateDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setCode(model.getCode());
		soapModel.setCreateGroupId(model.getCreateGroupId());
		soapModel.setImpReqId(model.getImpReqId());
		soapModel.setReqDelegator(model.getReqDelegator());
		soapModel.setReqDelegatorPosition(model.getReqDelegatorPosition());
		soapModel.setDocument(model.getDocument());
		soapModel.setBeginDate(model.getBeginDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setKcsCode(model.getKcsCode());
		soapModel.setHandOverId(model.getHandOverId());
		soapModel.setImpReqCode(model.getImpReqCode());
		soapModel.setBaseKcsCode(model.getBaseKcsCode());
		soapModel.setCreatorKcs(model.getCreatorKcs());
		soapModel.setAssetType(model.getAssetType());
		soapModel.setIsNotModify(model.getIsNotModify());
		soapModel.setHandleDelegator(model.getHandleDelegator());
		soapModel.setHandleDelegatorPosition(model.getHandleDelegatorPosition());
		soapModel.setContractId(model.getContractId());
		soapModel.setStatusCa(model.getStatusCa());
		soapModel.setCommentCa(model.getCommentCa());
		soapModel.setDocumentCaId(model.getDocumentCaId());

		return soapModel;
	}

	public static AssetManageReqHandleSoap[] toSoapModels(
		AssetManageReqHandle[] models) {
		AssetManageReqHandleSoap[] soapModels = new AssetManageReqHandleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssetManageReqHandleSoap[][] toSoapModels(
		AssetManageReqHandle[][] models) {
		AssetManageReqHandleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssetManageReqHandleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssetManageReqHandleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssetManageReqHandleSoap[] toSoapModels(
		List<AssetManageReqHandle> models) {
		List<AssetManageReqHandleSoap> soapModels = new ArrayList<AssetManageReqHandleSoap>(models.size());

		for (AssetManageReqHandle model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssetManageReqHandleSoap[soapModels.size()]);
	}

	public AssetManageReqHandleSoap() {
	}

	public long getPrimaryKey() {
		return _handleId;
	}

	public void setPrimaryKey(long pk) {
		setHandleId(pk);
	}

	public long getHandleId() {
		return _handleId;
	}

	public void setHandleId(long handleId) {
		_handleId = handleId;
	}

	public Long getManageReqId() {
		return _manageReqId;
	}

	public void setManageReqId(Long manageReqId) {
		_manageReqId = manageReqId;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Long getUpdatorId() {
		return _updatorId;
	}

	public void setUpdatorId(Long updatorId) {
		_updatorId = updatorId;
	}

	public Date getUpdateDate() {
		return _updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		_updateDate = updateDate;
	}

	public Long getStatus() {
		return _status;
	}

	public void setStatus(Long status) {
		_status = status;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public Long getCreateGroupId() {
		return _createGroupId;
	}

	public void setCreateGroupId(Long createGroupId) {
		_createGroupId = createGroupId;
	}

	public Long getImpReqId() {
		return _impReqId;
	}

	public void setImpReqId(Long impReqId) {
		_impReqId = impReqId;
	}

	public String getReqDelegator() {
		return _reqDelegator;
	}

	public void setReqDelegator(String reqDelegator) {
		_reqDelegator = reqDelegator;
	}

	public String getReqDelegatorPosition() {
		return _reqDelegatorPosition;
	}

	public void setReqDelegatorPosition(String reqDelegatorPosition) {
		_reqDelegatorPosition = reqDelegatorPosition;
	}

	public String getDocument() {
		return _document;
	}

	public void setDocument(String document) {
		_document = document;
	}

	public Date getBeginDate() {
		return _beginDate;
	}

	public void setBeginDate(Date beginDate) {
		_beginDate = beginDate;
	}

	public Date getEndDate() {
		return _endDate;
	}

	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	public String getKcsCode() {
		return _kcsCode;
	}

	public void setKcsCode(String kcsCode) {
		_kcsCode = kcsCode;
	}

	public Long getHandOverId() {
		return _handOverId;
	}

	public void setHandOverId(Long handOverId) {
		_handOverId = handOverId;
	}

	public String getImpReqCode() {
		return _impReqCode;
	}

	public void setImpReqCode(String impReqCode) {
		_impReqCode = impReqCode;
	}

	public Long getBaseKcsCode() {
		return _baseKcsCode;
	}

	public void setBaseKcsCode(Long baseKcsCode) {
		_baseKcsCode = baseKcsCode;
	}

	public Long getCreatorKcs() {
		return _creatorKcs;
	}

	public void setCreatorKcs(Long creatorKcs) {
		_creatorKcs = creatorKcs;
	}

	public Long getAssetType() {
		return _assetType;
	}

	public void setAssetType(Long assetType) {
		_assetType = assetType;
	}

	public Long getIsNotModify() {
		return _isNotModify;
	}

	public void setIsNotModify(Long isNotModify) {
		_isNotModify = isNotModify;
	}

	public String getHandleDelegator() {
		return _handleDelegator;
	}

	public void setHandleDelegator(String handleDelegator) {
		_handleDelegator = handleDelegator;
	}

	public String getHandleDelegatorPosition() {
		return _handleDelegatorPosition;
	}

	public void setHandleDelegatorPosition(String handleDelegatorPosition) {
		_handleDelegatorPosition = handleDelegatorPosition;
	}

	public Long getContractId() {
		return _contractId;
	}

	public void setContractId(Long contractId) {
		_contractId = contractId;
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

	private long _handleId;
	private Long _manageReqId;
	private String _description;
	private Long _updatorId;
	private Date _updateDate;
	private Long _status;
	private String _code;
	private Long _createGroupId;
	private Long _impReqId;
	private String _reqDelegator;
	private String _reqDelegatorPosition;
	private String _document;
	private Date _beginDate;
	private Date _endDate;
	private String _kcsCode;
	private Long _handOverId;
	private String _impReqCode;
	private Long _baseKcsCode;
	private Long _creatorKcs;
	private Long _assetType;
	private Long _isNotModify;
	private String _handleDelegator;
	private String _handleDelegatorPosition;
	private Long _contractId;
	private Long _statusCa;
	private String _commentCa;
	private Long _documentCaId;
}
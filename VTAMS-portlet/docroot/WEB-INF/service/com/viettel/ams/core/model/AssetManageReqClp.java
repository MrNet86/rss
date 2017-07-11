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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.viettel.ams.core.service.AssetManageReqLocalServiceUtil;
import com.viettel.ams.core.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MrNet
 */
public class AssetManageReqClp extends BaseModelImpl<AssetManageReq>
	implements AssetManageReq {
	public AssetManageReqClp() {
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
	public long getPrimaryKey() {
		return _manageReqId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setManageReqId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _manageReqId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getManageReqId() {
		return _manageReqId;
	}

	@Override
	public void setManageReqId(long manageReqId) {
		_manageReqId = manageReqId;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setManageReqId", long.class);

				method.invoke(_assetManageReqRemoteModel, manageReqId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getReqGroupId() {
		return _reqGroupId;
	}

	@Override
	public void setReqGroupId(Long reqGroupId) {
		_reqGroupId = reqGroupId;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setReqGroupId", Long.class);

				method.invoke(_assetManageReqRemoteModel, reqGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(Long userId) {
		_userId = userId;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", Long.class);

				method.invoke(_assetManageReqRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getRecvGroupId() {
		return _recvGroupId;
	}

	@Override
	public void setRecvGroupId(Long recvGroupId) {
		_recvGroupId = recvGroupId;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setRecvGroupId", Long.class);

				method.invoke(_assetManageReqRemoteModel, recvGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCause() {
		return _cause;
	}

	@Override
	public void setCause(String cause) {
		_cause = cause;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setCause", String.class);

				method.invoke(_assetManageReqRemoteModel, cause);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getCreatorId() {
		return _creatorId;
	}

	@Override
	public void setCreatorId(Long creatorId) {
		_creatorId = creatorId;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatorId", Long.class);

				method.invoke(_assetManageReqRemoteModel, creatorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_assetManageReqRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getStatus() {
		return _status;
	}

	@Override
	public void setStatus(Long status) {
		_status = status;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", Long.class);

				method.invoke(_assetManageReqRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getType() {
		return _type;
	}

	@Override
	public void setType(Long type) {
		_type = type;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setType", Long.class);

				method.invoke(_assetManageReqRemoteModel, type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getUsedGroupId() {
		return _usedGroupId;
	}

	@Override
	public void setUsedGroupId(Long usedGroupId) {
		_usedGroupId = usedGroupId;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setUsedGroupId", Long.class);

				method.invoke(_assetManageReqRemoteModel, usedGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode() {
		return _code;
	}

	@Override
	public void setCode(String code) {
		_code = code;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setCode", String.class);

				method.invoke(_assetManageReqRemoteModel, code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getAcceptorId() {
		return _acceptorId;
	}

	@Override
	public void setAcceptorId(Long acceptorId) {
		_acceptorId = acceptorId;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setAcceptorId", Long.class);

				method.invoke(_assetManageReqRemoteModel, acceptorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAcceptComment() {
		return _acceptComment;
	}

	@Override
	public void setAcceptComment(String acceptComment) {
		_acceptComment = acceptComment;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setAcceptComment", String.class);

				method.invoke(_assetManageReqRemoteModel, acceptComment);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getRetrieveCauseId() {
		return _retrieveCauseId;
	}

	@Override
	public void setRetrieveCauseId(Long retrieveCauseId) {
		_retrieveCauseId = retrieveCauseId;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setRetrieveCauseId", Long.class);

				method.invoke(_assetManageReqRemoteModel, retrieveCauseId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getConstructId() {
		return _constructId;
	}

	@Override
	public void setConstructId(Long constructId) {
		_constructId = constructId;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setConstructId", Long.class);

				method.invoke(_assetManageReqRemoteModel, constructId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDelegator() {
		return _delegator;
	}

	@Override
	public void setDelegator(String delegator) {
		_delegator = delegator;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setDelegator", String.class);

				method.invoke(_assetManageReqRemoteModel, delegator);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getIsFull() {
		return _isFull;
	}

	@Override
	public void setIsFull(Long isFull) {
		_isFull = isFull;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setIsFull", Long.class);

				method.invoke(_assetManageReqRemoteModel, isFull);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTitleDelegator() {
		return _titleDelegator;
	}

	@Override
	public void setTitleDelegator(String titleDelegator) {
		_titleDelegator = titleDelegator;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setTitleDelegator",
						String.class);

				method.invoke(_assetManageReqRemoteModel, titleDelegator);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getMobileNumber() {
		return _mobileNumber;
	}

	@Override
	public void setMobileNumber(Long mobileNumber) {
		_mobileNumber = mobileNumber;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setMobileNumber", Long.class);

				method.invoke(_assetManageReqRemoteModel, mobileNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocument() {
		return _document;
	}

	@Override
	public void setDocument(String document) {
		_document = document;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setDocument", String.class);

				method.invoke(_assetManageReqRemoteModel, document);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getFailCheckId() {
		return _failCheckId;
	}

	@Override
	public void setFailCheckId(Long failCheckId) {
		_failCheckId = failCheckId;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setFailCheckId", Long.class);

				method.invoke(_assetManageReqRemoteModel, failCheckId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getDeliveryNoteId() {
		return _deliveryNoteId;
	}

	@Override
	public void setDeliveryNoteId(Long deliveryNoteId) {
		_deliveryNoteId = deliveryNoteId;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setDeliveryNoteId", Long.class);

				method.invoke(_assetManageReqRemoteModel, deliveryNoteId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getIsMaintain() {
		return _isMaintain;
	}

	@Override
	public void setIsMaintain(Long isMaintain) {
		_isMaintain = isMaintain;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setIsMaintain", Long.class);

				method.invoke(_assetManageReqRemoteModel, isMaintain);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCauseReject() {
		return _causeReject;
	}

	@Override
	public void setCauseReject(String causeReject) {
		_causeReject = causeReject;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setCauseReject", String.class);

				method.invoke(_assetManageReqRemoteModel, causeReject);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getAssetType() {
		return _assetType;
	}

	@Override
	public void setAssetType(Long assetType) {
		_assetType = assetType;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetType", Long.class);

				method.invoke(_assetManageReqRemoteModel, assetType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getRetrieveType() {
		return _retrieveType;
	}

	@Override
	public void setRetrieveType(Long retrieveType) {
		_retrieveType = retrieveType;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setRetrieveType", Long.class);

				method.invoke(_assetManageReqRemoteModel, retrieveType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getRetrieveCmdId() {
		return _retrieveCmdId;
	}

	@Override
	public void setRetrieveCmdId(Long retrieveCmdId) {
		_retrieveCmdId = retrieveCmdId;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setRetrieveCmdId", Long.class);

				method.invoke(_assetManageReqRemoteModel, retrieveCmdId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getPlanSwapId() {
		return _planSwapId;
	}

	@Override
	public void setPlanSwapId(Long planSwapId) {
		_planSwapId = planSwapId;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setPlanSwapId", Long.class);

				method.invoke(_assetManageReqRemoteModel, planSwapId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getCertificateRegistrationId() {
		return _certificateRegistrationId;
	}

	@Override
	public void setCertificateRegistrationId(Long certificateRegistrationId) {
		_certificateRegistrationId = certificateRegistrationId;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateRegistrationId",
						Long.class);

				method.invoke(_assetManageReqRemoteModel,
					certificateRegistrationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getContractid() {
		return _contractid;
	}

	@Override
	public void setContractid(Long contractid) {
		_contractid = contractid;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setContractid", Long.class);

				method.invoke(_assetManageReqRemoteModel, contractid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getPartnerId() {
		return _partnerId;
	}

	@Override
	public void setPartnerId(Long partnerId) {
		_partnerId = partnerId;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setPartnerId", Long.class);

				method.invoke(_assetManageReqRemoteModel, partnerId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getStatusCa() {
		return _statusCa;
	}

	@Override
	public void setStatusCa(Long statusCa) {
		_statusCa = statusCa;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusCa", Long.class);

				method.invoke(_assetManageReqRemoteModel, statusCa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCommentCa() {
		return _commentCa;
	}

	@Override
	public void setCommentCa(String commentCa) {
		_commentCa = commentCa;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setCommentCa", String.class);

				method.invoke(_assetManageReqRemoteModel, commentCa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getDocumentCaId() {
		return _documentCaId;
	}

	@Override
	public void setDocumentCaId(Long documentCaId) {
		_documentCaId = documentCaId;

		if (_assetManageReqRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentCaId", Long.class);

				method.invoke(_assetManageReqRemoteModel, documentCaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAssetManageReqRemoteModel() {
		return _assetManageReqRemoteModel;
	}

	public void setAssetManageReqRemoteModel(
		BaseModel<?> assetManageReqRemoteModel) {
		_assetManageReqRemoteModel = assetManageReqRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _assetManageReqRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_assetManageReqRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AssetManageReqLocalServiceUtil.addAssetManageReq(this);
		}
		else {
			AssetManageReqLocalServiceUtil.updateAssetManageReq(this);
		}
	}

	@Override
	public AssetManageReq toEscapedModel() {
		return (AssetManageReq)ProxyUtil.newProxyInstance(AssetManageReq.class.getClassLoader(),
			new Class[] { AssetManageReq.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AssetManageReqClp clone = new AssetManageReqClp();

		clone.setManageReqId(getManageReqId());
		clone.setReqGroupId(getReqGroupId());
		clone.setUserId(getUserId());
		clone.setRecvGroupId(getRecvGroupId());
		clone.setCause(getCause());
		clone.setCreatorId(getCreatorId());
		clone.setCreatedDate(getCreatedDate());
		clone.setStatus(getStatus());
		clone.setType(getType());
		clone.setUsedGroupId(getUsedGroupId());
		clone.setCode(getCode());
		clone.setAcceptorId(getAcceptorId());
		clone.setAcceptComment(getAcceptComment());
		clone.setRetrieveCauseId(getRetrieveCauseId());
		clone.setConstructId(getConstructId());
		clone.setDelegator(getDelegator());
		clone.setIsFull(getIsFull());
		clone.setTitleDelegator(getTitleDelegator());
		clone.setMobileNumber(getMobileNumber());
		clone.setDocument(getDocument());
		clone.setFailCheckId(getFailCheckId());
		clone.setDeliveryNoteId(getDeliveryNoteId());
		clone.setIsMaintain(getIsMaintain());
		clone.setCauseReject(getCauseReject());
		clone.setAssetType(getAssetType());
		clone.setRetrieveType(getRetrieveType());
		clone.setRetrieveCmdId(getRetrieveCmdId());
		clone.setPlanSwapId(getPlanSwapId());
		clone.setCertificateRegistrationId(getCertificateRegistrationId());
		clone.setContractid(getContractid());
		clone.setPartnerId(getPartnerId());
		clone.setStatusCa(getStatusCa());
		clone.setCommentCa(getCommentCa());
		clone.setDocumentCaId(getDocumentCaId());

		return clone;
	}

	@Override
	public int compareTo(AssetManageReq assetManageReq) {
		long primaryKey = assetManageReq.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetManageReqClp)) {
			return false;
		}

		AssetManageReqClp assetManageReq = (AssetManageReqClp)obj;

		long primaryKey = assetManageReq.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(69);

		sb.append("{manageReqId=");
		sb.append(getManageReqId());
		sb.append(", reqGroupId=");
		sb.append(getReqGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", recvGroupId=");
		sb.append(getRecvGroupId());
		sb.append(", cause=");
		sb.append(getCause());
		sb.append(", creatorId=");
		sb.append(getCreatorId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", usedGroupId=");
		sb.append(getUsedGroupId());
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", acceptorId=");
		sb.append(getAcceptorId());
		sb.append(", acceptComment=");
		sb.append(getAcceptComment());
		sb.append(", retrieveCauseId=");
		sb.append(getRetrieveCauseId());
		sb.append(", constructId=");
		sb.append(getConstructId());
		sb.append(", delegator=");
		sb.append(getDelegator());
		sb.append(", isFull=");
		sb.append(getIsFull());
		sb.append(", titleDelegator=");
		sb.append(getTitleDelegator());
		sb.append(", mobileNumber=");
		sb.append(getMobileNumber());
		sb.append(", document=");
		sb.append(getDocument());
		sb.append(", failCheckId=");
		sb.append(getFailCheckId());
		sb.append(", deliveryNoteId=");
		sb.append(getDeliveryNoteId());
		sb.append(", isMaintain=");
		sb.append(getIsMaintain());
		sb.append(", causeReject=");
		sb.append(getCauseReject());
		sb.append(", assetType=");
		sb.append(getAssetType());
		sb.append(", retrieveType=");
		sb.append(getRetrieveType());
		sb.append(", retrieveCmdId=");
		sb.append(getRetrieveCmdId());
		sb.append(", planSwapId=");
		sb.append(getPlanSwapId());
		sb.append(", certificateRegistrationId=");
		sb.append(getCertificateRegistrationId());
		sb.append(", contractid=");
		sb.append(getContractid());
		sb.append(", partnerId=");
		sb.append(getPartnerId());
		sb.append(", statusCa=");
		sb.append(getStatusCa());
		sb.append(", commentCa=");
		sb.append(getCommentCa());
		sb.append(", documentCaId=");
		sb.append(getDocumentCaId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(106);

		sb.append("<model><model-name>");
		sb.append("com.viettel.ams.core.model.AssetManageReq");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>manageReqId</column-name><column-value><![CDATA[");
		sb.append(getManageReqId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reqGroupId</column-name><column-value><![CDATA[");
		sb.append(getReqGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recvGroupId</column-name><column-value><![CDATA[");
		sb.append(getRecvGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cause</column-name><column-value><![CDATA[");
		sb.append(getCause());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>creatorId</column-name><column-value><![CDATA[");
		sb.append(getCreatorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usedGroupId</column-name><column-value><![CDATA[");
		sb.append(getUsedGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acceptorId</column-name><column-value><![CDATA[");
		sb.append(getAcceptorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acceptComment</column-name><column-value><![CDATA[");
		sb.append(getAcceptComment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>retrieveCauseId</column-name><column-value><![CDATA[");
		sb.append(getRetrieveCauseId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>constructId</column-name><column-value><![CDATA[");
		sb.append(getConstructId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>delegator</column-name><column-value><![CDATA[");
		sb.append(getDelegator());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isFull</column-name><column-value><![CDATA[");
		sb.append(getIsFull());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>titleDelegator</column-name><column-value><![CDATA[");
		sb.append(getTitleDelegator());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mobileNumber</column-name><column-value><![CDATA[");
		sb.append(getMobileNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>document</column-name><column-value><![CDATA[");
		sb.append(getDocument());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>failCheckId</column-name><column-value><![CDATA[");
		sb.append(getFailCheckId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deliveryNoteId</column-name><column-value><![CDATA[");
		sb.append(getDeliveryNoteId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isMaintain</column-name><column-value><![CDATA[");
		sb.append(getIsMaintain());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>causeReject</column-name><column-value><![CDATA[");
		sb.append(getCauseReject());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetType</column-name><column-value><![CDATA[");
		sb.append(getAssetType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>retrieveType</column-name><column-value><![CDATA[");
		sb.append(getRetrieveType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>retrieveCmdId</column-name><column-value><![CDATA[");
		sb.append(getRetrieveCmdId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>planSwapId</column-name><column-value><![CDATA[");
		sb.append(getPlanSwapId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateRegistrationId</column-name><column-value><![CDATA[");
		sb.append(getCertificateRegistrationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contractid</column-name><column-value><![CDATA[");
		sb.append(getContractid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>partnerId</column-name><column-value><![CDATA[");
		sb.append(getPartnerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusCa</column-name><column-value><![CDATA[");
		sb.append(getStatusCa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commentCa</column-name><column-value><![CDATA[");
		sb.append(getCommentCa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentCaId</column-name><column-value><![CDATA[");
		sb.append(getDocumentCaId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _assetManageReqRemoteModel;
	private Class<?> _clpSerializerClass = com.viettel.ams.core.service.ClpSerializer.class;
}
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

import com.viettel.ams.core.service.AssetManageReqHandleLocalServiceUtil;
import com.viettel.ams.core.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MrNet
 */
public class AssetManageReqHandleClp extends BaseModelImpl<AssetManageReqHandle>
	implements AssetManageReqHandle {
	public AssetManageReqHandleClp() {
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
	public long getPrimaryKey() {
		return _handleId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setHandleId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _handleId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getHandleId() {
		return _handleId;
	}

	@Override
	public void setHandleId(long handleId) {
		_handleId = handleId;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setHandleId", long.class);

				method.invoke(_assetManageReqHandleRemoteModel, handleId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getManageReqId() {
		return _manageReqId;
	}

	@Override
	public void setManageReqId(Long manageReqId) {
		_manageReqId = manageReqId;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setManageReqId", Long.class);

				method.invoke(_assetManageReqHandleRemoteModel, manageReqId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_assetManageReqHandleRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getUpdatorId() {
		return _updatorId;
	}

	@Override
	public void setUpdatorId(Long updatorId) {
		_updatorId = updatorId;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdatorId", Long.class);

				method.invoke(_assetManageReqHandleRemoteModel, updatorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUpdateDate() {
		return _updateDate;
	}

	@Override
	public void setUpdateDate(Date updateDate) {
		_updateDate = updateDate;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdateDate", Date.class);

				method.invoke(_assetManageReqHandleRemoteModel, updateDate);
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

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", Long.class);

				method.invoke(_assetManageReqHandleRemoteModel, status);
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

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setCode", String.class);

				method.invoke(_assetManageReqHandleRemoteModel, code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getCreateGroupId() {
		return _createGroupId;
	}

	@Override
	public void setCreateGroupId(Long createGroupId) {
		_createGroupId = createGroupId;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateGroupId", Long.class);

				method.invoke(_assetManageReqHandleRemoteModel, createGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getImpReqId() {
		return _impReqId;
	}

	@Override
	public void setImpReqId(Long impReqId) {
		_impReqId = impReqId;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setImpReqId", Long.class);

				method.invoke(_assetManageReqHandleRemoteModel, impReqId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReqDelegator() {
		return _reqDelegator;
	}

	@Override
	public void setReqDelegator(String reqDelegator) {
		_reqDelegator = reqDelegator;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setReqDelegator", String.class);

				method.invoke(_assetManageReqHandleRemoteModel, reqDelegator);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReqDelegatorPosition() {
		return _reqDelegatorPosition;
	}

	@Override
	public void setReqDelegatorPosition(String reqDelegatorPosition) {
		_reqDelegatorPosition = reqDelegatorPosition;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setReqDelegatorPosition",
						String.class);

				method.invoke(_assetManageReqHandleRemoteModel,
					reqDelegatorPosition);
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

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setDocument", String.class);

				method.invoke(_assetManageReqHandleRemoteModel, document);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getBeginDate() {
		return _beginDate;
	}

	@Override
	public void setBeginDate(Date beginDate) {
		_beginDate = beginDate;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setBeginDate", Date.class);

				method.invoke(_assetManageReqHandleRemoteModel, beginDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEndDate() {
		return _endDate;
	}

	@Override
	public void setEndDate(Date endDate) {
		_endDate = endDate;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setEndDate", Date.class);

				method.invoke(_assetManageReqHandleRemoteModel, endDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKcsCode() {
		return _kcsCode;
	}

	@Override
	public void setKcsCode(String kcsCode) {
		_kcsCode = kcsCode;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setKcsCode", String.class);

				method.invoke(_assetManageReqHandleRemoteModel, kcsCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getHandOverId() {
		return _handOverId;
	}

	@Override
	public void setHandOverId(Long handOverId) {
		_handOverId = handOverId;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setHandOverId", Long.class);

				method.invoke(_assetManageReqHandleRemoteModel, handOverId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImpReqCode() {
		return _impReqCode;
	}

	@Override
	public void setImpReqCode(String impReqCode) {
		_impReqCode = impReqCode;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setImpReqCode", String.class);

				method.invoke(_assetManageReqHandleRemoteModel, impReqCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getBaseKcsCode() {
		return _baseKcsCode;
	}

	@Override
	public void setBaseKcsCode(Long baseKcsCode) {
		_baseKcsCode = baseKcsCode;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setBaseKcsCode", Long.class);

				method.invoke(_assetManageReqHandleRemoteModel, baseKcsCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getCreatorKcs() {
		return _creatorKcs;
	}

	@Override
	public void setCreatorKcs(Long creatorKcs) {
		_creatorKcs = creatorKcs;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatorKcs", Long.class);

				method.invoke(_assetManageReqHandleRemoteModel, creatorKcs);
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

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetType", Long.class);

				method.invoke(_assetManageReqHandleRemoteModel, assetType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getIsNotModify() {
		return _isNotModify;
	}

	@Override
	public void setIsNotModify(Long isNotModify) {
		_isNotModify = isNotModify;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setIsNotModify", Long.class);

				method.invoke(_assetManageReqHandleRemoteModel, isNotModify);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHandleDelegator() {
		return _handleDelegator;
	}

	@Override
	public void setHandleDelegator(String handleDelegator) {
		_handleDelegator = handleDelegator;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setHandleDelegator",
						String.class);

				method.invoke(_assetManageReqHandleRemoteModel, handleDelegator);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHandleDelegatorPosition() {
		return _handleDelegatorPosition;
	}

	@Override
	public void setHandleDelegatorPosition(String handleDelegatorPosition) {
		_handleDelegatorPosition = handleDelegatorPosition;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setHandleDelegatorPosition",
						String.class);

				method.invoke(_assetManageReqHandleRemoteModel,
					handleDelegatorPosition);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Long getContractId() {
		return _contractId;
	}

	@Override
	public void setContractId(Long contractId) {
		_contractId = contractId;

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setContractId", Long.class);

				method.invoke(_assetManageReqHandleRemoteModel, contractId);
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

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusCa", Long.class);

				method.invoke(_assetManageReqHandleRemoteModel, statusCa);
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

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setCommentCa", String.class);

				method.invoke(_assetManageReqHandleRemoteModel, commentCa);
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

		if (_assetManageReqHandleRemoteModel != null) {
			try {
				Class<?> clazz = _assetManageReqHandleRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentCaId", Long.class);

				method.invoke(_assetManageReqHandleRemoteModel, documentCaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAssetManageReqHandleRemoteModel() {
		return _assetManageReqHandleRemoteModel;
	}

	public void setAssetManageReqHandleRemoteModel(
		BaseModel<?> assetManageReqHandleRemoteModel) {
		_assetManageReqHandleRemoteModel = assetManageReqHandleRemoteModel;
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

		Class<?> remoteModelClass = _assetManageReqHandleRemoteModel.getClass();

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

		Object returnValue = method.invoke(_assetManageReqHandleRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AssetManageReqHandleLocalServiceUtil.addAssetManageReqHandle(this);
		}
		else {
			AssetManageReqHandleLocalServiceUtil.updateAssetManageReqHandle(this);
		}
	}

	@Override
	public AssetManageReqHandle toEscapedModel() {
		return (AssetManageReqHandle)ProxyUtil.newProxyInstance(AssetManageReqHandle.class.getClassLoader(),
			new Class[] { AssetManageReqHandle.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AssetManageReqHandleClp clone = new AssetManageReqHandleClp();

		clone.setHandleId(getHandleId());
		clone.setManageReqId(getManageReqId());
		clone.setDescription(getDescription());
		clone.setUpdatorId(getUpdatorId());
		clone.setUpdateDate(getUpdateDate());
		clone.setStatus(getStatus());
		clone.setCode(getCode());
		clone.setCreateGroupId(getCreateGroupId());
		clone.setImpReqId(getImpReqId());
		clone.setReqDelegator(getReqDelegator());
		clone.setReqDelegatorPosition(getReqDelegatorPosition());
		clone.setDocument(getDocument());
		clone.setBeginDate(getBeginDate());
		clone.setEndDate(getEndDate());
		clone.setKcsCode(getKcsCode());
		clone.setHandOverId(getHandOverId());
		clone.setImpReqCode(getImpReqCode());
		clone.setBaseKcsCode(getBaseKcsCode());
		clone.setCreatorKcs(getCreatorKcs());
		clone.setAssetType(getAssetType());
		clone.setIsNotModify(getIsNotModify());
		clone.setHandleDelegator(getHandleDelegator());
		clone.setHandleDelegatorPosition(getHandleDelegatorPosition());
		clone.setContractId(getContractId());
		clone.setStatusCa(getStatusCa());
		clone.setCommentCa(getCommentCa());
		clone.setDocumentCaId(getDocumentCaId());

		return clone;
	}

	@Override
	public int compareTo(AssetManageReqHandle assetManageReqHandle) {
		long primaryKey = assetManageReqHandle.getPrimaryKey();

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

		if (!(obj instanceof AssetManageReqHandleClp)) {
			return false;
		}

		AssetManageReqHandleClp assetManageReqHandle = (AssetManageReqHandleClp)obj;

		long primaryKey = assetManageReqHandle.getPrimaryKey();

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
		StringBundler sb = new StringBundler(55);

		sb.append("{handleId=");
		sb.append(getHandleId());
		sb.append(", manageReqId=");
		sb.append(getManageReqId());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", updatorId=");
		sb.append(getUpdatorId());
		sb.append(", updateDate=");
		sb.append(getUpdateDate());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", createGroupId=");
		sb.append(getCreateGroupId());
		sb.append(", impReqId=");
		sb.append(getImpReqId());
		sb.append(", reqDelegator=");
		sb.append(getReqDelegator());
		sb.append(", reqDelegatorPosition=");
		sb.append(getReqDelegatorPosition());
		sb.append(", document=");
		sb.append(getDocument());
		sb.append(", beginDate=");
		sb.append(getBeginDate());
		sb.append(", endDate=");
		sb.append(getEndDate());
		sb.append(", kcsCode=");
		sb.append(getKcsCode());
		sb.append(", handOverId=");
		sb.append(getHandOverId());
		sb.append(", impReqCode=");
		sb.append(getImpReqCode());
		sb.append(", baseKcsCode=");
		sb.append(getBaseKcsCode());
		sb.append(", creatorKcs=");
		sb.append(getCreatorKcs());
		sb.append(", assetType=");
		sb.append(getAssetType());
		sb.append(", isNotModify=");
		sb.append(getIsNotModify());
		sb.append(", handleDelegator=");
		sb.append(getHandleDelegator());
		sb.append(", handleDelegatorPosition=");
		sb.append(getHandleDelegatorPosition());
		sb.append(", contractId=");
		sb.append(getContractId());
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
		StringBundler sb = new StringBundler(85);

		sb.append("<model><model-name>");
		sb.append("com.viettel.ams.core.model.AssetManageReqHandle");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>handleId</column-name><column-value><![CDATA[");
		sb.append(getHandleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>manageReqId</column-name><column-value><![CDATA[");
		sb.append(getManageReqId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatorId</column-name><column-value><![CDATA[");
		sb.append(getUpdatorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updateDate</column-name><column-value><![CDATA[");
		sb.append(getUpdateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createGroupId</column-name><column-value><![CDATA[");
		sb.append(getCreateGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>impReqId</column-name><column-value><![CDATA[");
		sb.append(getImpReqId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reqDelegator</column-name><column-value><![CDATA[");
		sb.append(getReqDelegator());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reqDelegatorPosition</column-name><column-value><![CDATA[");
		sb.append(getReqDelegatorPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>document</column-name><column-value><![CDATA[");
		sb.append(getDocument());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>beginDate</column-name><column-value><![CDATA[");
		sb.append(getBeginDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endDate</column-name><column-value><![CDATA[");
		sb.append(getEndDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kcsCode</column-name><column-value><![CDATA[");
		sb.append(getKcsCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>handOverId</column-name><column-value><![CDATA[");
		sb.append(getHandOverId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>impReqCode</column-name><column-value><![CDATA[");
		sb.append(getImpReqCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>baseKcsCode</column-name><column-value><![CDATA[");
		sb.append(getBaseKcsCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>creatorKcs</column-name><column-value><![CDATA[");
		sb.append(getCreatorKcs());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetType</column-name><column-value><![CDATA[");
		sb.append(getAssetType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isNotModify</column-name><column-value><![CDATA[");
		sb.append(getIsNotModify());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>handleDelegator</column-name><column-value><![CDATA[");
		sb.append(getHandleDelegator());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>handleDelegatorPosition</column-name><column-value><![CDATA[");
		sb.append(getHandleDelegatorPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contractId</column-name><column-value><![CDATA[");
		sb.append(getContractId());
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
	private BaseModel<?> _assetManageReqHandleRemoteModel;
	private Class<?> _clpSerializerClass = com.viettel.ams.core.service.ClpSerializer.class;
}
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

package com.viettel.ams.core.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.viettel.ams.core.model.AssetManageReqHandle;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssetManageReqHandle in entity cache.
 *
 * @author MrNet
 * @see AssetManageReqHandle
 * @generated
 */
public class AssetManageReqHandleCacheModel implements CacheModel<AssetManageReqHandle>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{handleId=");
		sb.append(handleId);
		sb.append(", manageReqId=");
		sb.append(manageReqId);
		sb.append(", description=");
		sb.append(description);
		sb.append(", updatorId=");
		sb.append(updatorId);
		sb.append(", updateDate=");
		sb.append(updateDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", code=");
		sb.append(code);
		sb.append(", createGroupId=");
		sb.append(createGroupId);
		sb.append(", impReqId=");
		sb.append(impReqId);
		sb.append(", reqDelegator=");
		sb.append(reqDelegator);
		sb.append(", reqDelegatorPosition=");
		sb.append(reqDelegatorPosition);
		sb.append(", document=");
		sb.append(document);
		sb.append(", beginDate=");
		sb.append(beginDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", kcsCode=");
		sb.append(kcsCode);
		sb.append(", handOverId=");
		sb.append(handOverId);
		sb.append(", impReqCode=");
		sb.append(impReqCode);
		sb.append(", baseKcsCode=");
		sb.append(baseKcsCode);
		sb.append(", creatorKcs=");
		sb.append(creatorKcs);
		sb.append(", assetType=");
		sb.append(assetType);
		sb.append(", isNotModify=");
		sb.append(isNotModify);
		sb.append(", handleDelegator=");
		sb.append(handleDelegator);
		sb.append(", handleDelegatorPosition=");
		sb.append(handleDelegatorPosition);
		sb.append(", contractId=");
		sb.append(contractId);
		sb.append(", statusCa=");
		sb.append(statusCa);
		sb.append(", commentCa=");
		sb.append(commentCa);
		sb.append(", documentCaId=");
		sb.append(documentCaId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssetManageReqHandle toEntityModel() {
		AssetManageReqHandleImpl assetManageReqHandleImpl = new AssetManageReqHandleImpl();

		assetManageReqHandleImpl.setHandleId(handleId);
		assetManageReqHandleImpl.setManageReqId(manageReqId);

		if (description == null) {
			assetManageReqHandleImpl.setDescription(StringPool.BLANK);
		}
		else {
			assetManageReqHandleImpl.setDescription(description);
		}

		assetManageReqHandleImpl.setUpdatorId(updatorId);

		if (updateDate == Long.MIN_VALUE) {
			assetManageReqHandleImpl.setUpdateDate(null);
		}
		else {
			assetManageReqHandleImpl.setUpdateDate(new Date(updateDate));
		}

		assetManageReqHandleImpl.setStatus(status);

		if (code == null) {
			assetManageReqHandleImpl.setCode(StringPool.BLANK);
		}
		else {
			assetManageReqHandleImpl.setCode(code);
		}

		assetManageReqHandleImpl.setCreateGroupId(createGroupId);
		assetManageReqHandleImpl.setImpReqId(impReqId);

		if (reqDelegator == null) {
			assetManageReqHandleImpl.setReqDelegator(StringPool.BLANK);
		}
		else {
			assetManageReqHandleImpl.setReqDelegator(reqDelegator);
		}

		if (reqDelegatorPosition == null) {
			assetManageReqHandleImpl.setReqDelegatorPosition(StringPool.BLANK);
		}
		else {
			assetManageReqHandleImpl.setReqDelegatorPosition(reqDelegatorPosition);
		}

		if (document == null) {
			assetManageReqHandleImpl.setDocument(StringPool.BLANK);
		}
		else {
			assetManageReqHandleImpl.setDocument(document);
		}

		if (beginDate == Long.MIN_VALUE) {
			assetManageReqHandleImpl.setBeginDate(null);
		}
		else {
			assetManageReqHandleImpl.setBeginDate(new Date(beginDate));
		}

		if (endDate == Long.MIN_VALUE) {
			assetManageReqHandleImpl.setEndDate(null);
		}
		else {
			assetManageReqHandleImpl.setEndDate(new Date(endDate));
		}

		if (kcsCode == null) {
			assetManageReqHandleImpl.setKcsCode(StringPool.BLANK);
		}
		else {
			assetManageReqHandleImpl.setKcsCode(kcsCode);
		}

		assetManageReqHandleImpl.setHandOverId(handOverId);

		if (impReqCode == null) {
			assetManageReqHandleImpl.setImpReqCode(StringPool.BLANK);
		}
		else {
			assetManageReqHandleImpl.setImpReqCode(impReqCode);
		}

		assetManageReqHandleImpl.setBaseKcsCode(baseKcsCode);
		assetManageReqHandleImpl.setCreatorKcs(creatorKcs);
		assetManageReqHandleImpl.setAssetType(assetType);
		assetManageReqHandleImpl.setIsNotModify(isNotModify);

		if (handleDelegator == null) {
			assetManageReqHandleImpl.setHandleDelegator(StringPool.BLANK);
		}
		else {
			assetManageReqHandleImpl.setHandleDelegator(handleDelegator);
		}

		if (handleDelegatorPosition == null) {
			assetManageReqHandleImpl.setHandleDelegatorPosition(StringPool.BLANK);
		}
		else {
			assetManageReqHandleImpl.setHandleDelegatorPosition(handleDelegatorPosition);
		}

		assetManageReqHandleImpl.setContractId(contractId);
		assetManageReqHandleImpl.setStatusCa(statusCa);

		if (commentCa == null) {
			assetManageReqHandleImpl.setCommentCa(StringPool.BLANK);
		}
		else {
			assetManageReqHandleImpl.setCommentCa(commentCa);
		}

		assetManageReqHandleImpl.setDocumentCaId(documentCaId);

		assetManageReqHandleImpl.resetOriginalValues();

		return assetManageReqHandleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		handleId = objectInput.readLong();
		manageReqId = objectInput.readLong();
		description = objectInput.readUTF();
		updatorId = objectInput.readLong();
		updateDate = objectInput.readLong();
		status = objectInput.readLong();
		code = objectInput.readUTF();
		createGroupId = objectInput.readLong();
		impReqId = objectInput.readLong();
		reqDelegator = objectInput.readUTF();
		reqDelegatorPosition = objectInput.readUTF();
		document = objectInput.readUTF();
		beginDate = objectInput.readLong();
		endDate = objectInput.readLong();
		kcsCode = objectInput.readUTF();
		handOverId = objectInput.readLong();
		impReqCode = objectInput.readUTF();
		baseKcsCode = objectInput.readLong();
		creatorKcs = objectInput.readLong();
		assetType = objectInput.readLong();
		isNotModify = objectInput.readLong();
		handleDelegator = objectInput.readUTF();
		handleDelegatorPosition = objectInput.readUTF();
		contractId = objectInput.readLong();
		statusCa = objectInput.readLong();
		commentCa = objectInput.readUTF();
		documentCaId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(handleId);
		objectOutput.writeLong(manageReqId);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(updatorId);
		objectOutput.writeLong(updateDate);
		objectOutput.writeLong(status);

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		objectOutput.writeLong(createGroupId);
		objectOutput.writeLong(impReqId);

		if (reqDelegator == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reqDelegator);
		}

		if (reqDelegatorPosition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reqDelegatorPosition);
		}

		if (document == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(document);
		}

		objectOutput.writeLong(beginDate);
		objectOutput.writeLong(endDate);

		if (kcsCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kcsCode);
		}

		objectOutput.writeLong(handOverId);

		if (impReqCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(impReqCode);
		}

		objectOutput.writeLong(baseKcsCode);
		objectOutput.writeLong(creatorKcs);
		objectOutput.writeLong(assetType);
		objectOutput.writeLong(isNotModify);

		if (handleDelegator == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(handleDelegator);
		}

		if (handleDelegatorPosition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(handleDelegatorPosition);
		}

		objectOutput.writeLong(contractId);
		objectOutput.writeLong(statusCa);

		if (commentCa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commentCa);
		}

		objectOutput.writeLong(documentCaId);
	}

	public long handleId;
	public Long manageReqId;
	public String description;
	public Long updatorId;
	public long updateDate;
	public Long status;
	public String code;
	public Long createGroupId;
	public Long impReqId;
	public String reqDelegator;
	public String reqDelegatorPosition;
	public String document;
	public long beginDate;
	public long endDate;
	public String kcsCode;
	public Long handOverId;
	public String impReqCode;
	public Long baseKcsCode;
	public Long creatorKcs;
	public Long assetType;
	public Long isNotModify;
	public String handleDelegator;
	public String handleDelegatorPosition;
	public Long contractId;
	public Long statusCa;
	public String commentCa;
	public Long documentCaId;
}
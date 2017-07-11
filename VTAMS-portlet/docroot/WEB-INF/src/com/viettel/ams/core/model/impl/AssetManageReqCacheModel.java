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

import com.viettel.ams.core.model.AssetManageReq;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssetManageReq in entity cache.
 *
 * @author MrNet
 * @see AssetManageReq
 * @generated
 */
public class AssetManageReqCacheModel implements CacheModel<AssetManageReq>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(69);

		sb.append("{manageReqId=");
		sb.append(manageReqId);
		sb.append(", reqGroupId=");
		sb.append(reqGroupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", recvGroupId=");
		sb.append(recvGroupId);
		sb.append(", cause=");
		sb.append(cause);
		sb.append(", creatorId=");
		sb.append(creatorId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", type=");
		sb.append(type);
		sb.append(", usedGroupId=");
		sb.append(usedGroupId);
		sb.append(", code=");
		sb.append(code);
		sb.append(", acceptorId=");
		sb.append(acceptorId);
		sb.append(", acceptComment=");
		sb.append(acceptComment);
		sb.append(", retrieveCauseId=");
		sb.append(retrieveCauseId);
		sb.append(", constructId=");
		sb.append(constructId);
		sb.append(", delegator=");
		sb.append(delegator);
		sb.append(", isFull=");
		sb.append(isFull);
		sb.append(", titleDelegator=");
		sb.append(titleDelegator);
		sb.append(", mobileNumber=");
		sb.append(mobileNumber);
		sb.append(", document=");
		sb.append(document);
		sb.append(", failCheckId=");
		sb.append(failCheckId);
		sb.append(", deliveryNoteId=");
		sb.append(deliveryNoteId);
		sb.append(", isMaintain=");
		sb.append(isMaintain);
		sb.append(", causeReject=");
		sb.append(causeReject);
		sb.append(", assetType=");
		sb.append(assetType);
		sb.append(", retrieveType=");
		sb.append(retrieveType);
		sb.append(", retrieveCmdId=");
		sb.append(retrieveCmdId);
		sb.append(", planSwapId=");
		sb.append(planSwapId);
		sb.append(", certificateRegistrationId=");
		sb.append(certificateRegistrationId);
		sb.append(", contractid=");
		sb.append(contractid);
		sb.append(", partnerId=");
		sb.append(partnerId);
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
	public AssetManageReq toEntityModel() {
		AssetManageReqImpl assetManageReqImpl = new AssetManageReqImpl();

		assetManageReqImpl.setManageReqId(manageReqId);
		assetManageReqImpl.setReqGroupId(reqGroupId);
		assetManageReqImpl.setUserId(userId);
		assetManageReqImpl.setRecvGroupId(recvGroupId);

		if (cause == null) {
			assetManageReqImpl.setCause(StringPool.BLANK);
		}
		else {
			assetManageReqImpl.setCause(cause);
		}

		assetManageReqImpl.setCreatorId(creatorId);

		if (createdDate == Long.MIN_VALUE) {
			assetManageReqImpl.setCreatedDate(null);
		}
		else {
			assetManageReqImpl.setCreatedDate(new Date(createdDate));
		}

		assetManageReqImpl.setStatus(status);
		assetManageReqImpl.setType(type);
		assetManageReqImpl.setUsedGroupId(usedGroupId);

		if (code == null) {
			assetManageReqImpl.setCode(StringPool.BLANK);
		}
		else {
			assetManageReqImpl.setCode(code);
		}

		assetManageReqImpl.setAcceptorId(acceptorId);

		if (acceptComment == null) {
			assetManageReqImpl.setAcceptComment(StringPool.BLANK);
		}
		else {
			assetManageReqImpl.setAcceptComment(acceptComment);
		}

		assetManageReqImpl.setRetrieveCauseId(retrieveCauseId);
		assetManageReqImpl.setConstructId(constructId);

		if (delegator == null) {
			assetManageReqImpl.setDelegator(StringPool.BLANK);
		}
		else {
			assetManageReqImpl.setDelegator(delegator);
		}

		assetManageReqImpl.setIsFull(isFull);

		if (titleDelegator == null) {
			assetManageReqImpl.setTitleDelegator(StringPool.BLANK);
		}
		else {
			assetManageReqImpl.setTitleDelegator(titleDelegator);
		}

		assetManageReqImpl.setMobileNumber(mobileNumber);

		if (document == null) {
			assetManageReqImpl.setDocument(StringPool.BLANK);
		}
		else {
			assetManageReqImpl.setDocument(document);
		}

		assetManageReqImpl.setFailCheckId(failCheckId);
		assetManageReqImpl.setDeliveryNoteId(deliveryNoteId);
		assetManageReqImpl.setIsMaintain(isMaintain);

		if (causeReject == null) {
			assetManageReqImpl.setCauseReject(StringPool.BLANK);
		}
		else {
			assetManageReqImpl.setCauseReject(causeReject);
		}

		assetManageReqImpl.setAssetType(assetType);
		assetManageReqImpl.setRetrieveType(retrieveType);
		assetManageReqImpl.setRetrieveCmdId(retrieveCmdId);
		assetManageReqImpl.setPlanSwapId(planSwapId);
		assetManageReqImpl.setCertificateRegistrationId(certificateRegistrationId);
		assetManageReqImpl.setContractid(contractid);
		assetManageReqImpl.setPartnerId(partnerId);
		assetManageReqImpl.setStatusCa(statusCa);

		if (commentCa == null) {
			assetManageReqImpl.setCommentCa(StringPool.BLANK);
		}
		else {
			assetManageReqImpl.setCommentCa(commentCa);
		}

		assetManageReqImpl.setDocumentCaId(documentCaId);

		assetManageReqImpl.resetOriginalValues();

		return assetManageReqImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manageReqId = objectInput.readLong();
		reqGroupId = objectInput.readLong();
		userId = objectInput.readLong();
		recvGroupId = objectInput.readLong();
		cause = objectInput.readUTF();
		creatorId = objectInput.readLong();
		createdDate = objectInput.readLong();
		status = objectInput.readLong();
		type = objectInput.readLong();
		usedGroupId = objectInput.readLong();
		code = objectInput.readUTF();
		acceptorId = objectInput.readLong();
		acceptComment = objectInput.readUTF();
		retrieveCauseId = objectInput.readLong();
		constructId = objectInput.readLong();
		delegator = objectInput.readUTF();
		isFull = objectInput.readLong();
		titleDelegator = objectInput.readUTF();
		mobileNumber = objectInput.readLong();
		document = objectInput.readUTF();
		failCheckId = objectInput.readLong();
		deliveryNoteId = objectInput.readLong();
		isMaintain = objectInput.readLong();
		causeReject = objectInput.readUTF();
		assetType = objectInput.readLong();
		retrieveType = objectInput.readLong();
		retrieveCmdId = objectInput.readLong();
		planSwapId = objectInput.readLong();
		certificateRegistrationId = objectInput.readLong();
		contractid = objectInput.readLong();
		partnerId = objectInput.readLong();
		statusCa = objectInput.readLong();
		commentCa = objectInput.readUTF();
		documentCaId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(manageReqId);
		objectOutput.writeLong(reqGroupId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(recvGroupId);

		if (cause == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cause);
		}

		objectOutput.writeLong(creatorId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(status);
		objectOutput.writeLong(type);
		objectOutput.writeLong(usedGroupId);

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		objectOutput.writeLong(acceptorId);

		if (acceptComment == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(acceptComment);
		}

		objectOutput.writeLong(retrieveCauseId);
		objectOutput.writeLong(constructId);

		if (delegator == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(delegator);
		}

		objectOutput.writeLong(isFull);

		if (titleDelegator == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(titleDelegator);
		}

		objectOutput.writeLong(mobileNumber);

		if (document == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(document);
		}

		objectOutput.writeLong(failCheckId);
		objectOutput.writeLong(deliveryNoteId);
		objectOutput.writeLong(isMaintain);

		if (causeReject == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(causeReject);
		}

		objectOutput.writeLong(assetType);
		objectOutput.writeLong(retrieveType);
		objectOutput.writeLong(retrieveCmdId);
		objectOutput.writeLong(planSwapId);
		objectOutput.writeLong(certificateRegistrationId);
		objectOutput.writeLong(contractid);
		objectOutput.writeLong(partnerId);
		objectOutput.writeLong(statusCa);

		if (commentCa == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commentCa);
		}

		objectOutput.writeLong(documentCaId);
	}

	public long manageReqId;
	public Long reqGroupId;
	public Long userId;
	public Long recvGroupId;
	public String cause;
	public Long creatorId;
	public long createdDate;
	public Long status;
	public Long type;
	public Long usedGroupId;
	public String code;
	public Long acceptorId;
	public String acceptComment;
	public Long retrieveCauseId;
	public Long constructId;
	public String delegator;
	public Long isFull;
	public String titleDelegator;
	public Long mobileNumber;
	public String document;
	public Long failCheckId;
	public Long deliveryNoteId;
	public Long isMaintain;
	public String causeReject;
	public Long assetType;
	public Long retrieveType;
	public Long retrieveCmdId;
	public Long planSwapId;
	public Long certificateRegistrationId;
	public Long contractid;
	public Long partnerId;
	public Long statusCa;
	public String commentCa;
	public Long documentCaId;
}
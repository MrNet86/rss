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

package com.viettel.ims.core.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.viettel.ims.core.model.InvestPolicyExt;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing InvestPolicyExt in entity cache.
 *
 * @author MrNet
 * @see InvestPolicyExt
 * @generated
 */
public class InvestPolicyExtCacheModel implements CacheModel<InvestPolicyExt>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(127);

		sb.append("{investPolicyId=");
		sb.append(investPolicyId);
		sb.append(", infoPolicyType=");
		sb.append(infoPolicyType);
		sb.append(", infoPolicyName=");
		sb.append(infoPolicyName);
		sb.append(", infoPolicyCode=");
		sb.append(infoPolicyCode);
		sb.append(", infoProposeGroupId=");
		sb.append(infoProposeGroupId);
		sb.append(", infoVerifyGroupId=");
		sb.append(infoVerifyGroupId);
		sb.append(", infoPolicyDate=");
		sb.append(infoPolicyDate);
		sb.append(", infoPolicyDeployDate=");
		sb.append(infoPolicyDeployDate);
		sb.append(", infoResponsibleUserId=");
		sb.append(infoResponsibleUserId);
		sb.append(", infoService=");
		sb.append(infoService);
		sb.append(", infoInvestTarget=");
		sb.append(infoInvestTarget);
		sb.append(", infoInvestLocation=");
		sb.append(infoInvestLocation);
		sb.append(", infoTechnique=");
		sb.append(infoTechnique);
		sb.append(", infoInvestName=");
		sb.append(infoInvestName);
		sb.append(", infoInvestDeadline=");
		sb.append(infoInvestDeadline);
		sb.append(", infoInvestCreateGroupId=");
		sb.append(infoInvestCreateGroupId);
		sb.append(", infoInvestDeployGroupId=");
		sb.append(infoInvestDeployGroupId);
		sb.append(", costCapital=");
		sb.append(costCapital);
		sb.append(", costCompensate=");
		sb.append(costCompensate);
		sb.append(", costCompensateForeign=");
		sb.append(costCompensateForeign);
		sb.append(", costEquiment=");
		sb.append(costEquiment);
		sb.append(", costEquimentForeign=");
		sb.append(costEquimentForeign);
		sb.append(", costContruction=");
		sb.append(costContruction);
		sb.append(", costContructionForeign=");
		sb.append(costContructionForeign);
		sb.append(", costAdvisory=");
		sb.append(costAdvisory);
		sb.append(", costAdvisoryForeign=");
		sb.append(costAdvisoryForeign);
		sb.append(", costManager=");
		sb.append(costManager);
		sb.append(", costManagerForeign=");
		sb.append(costManagerForeign);
		sb.append(", costOther=");
		sb.append(costOther);
		sb.append(", costOtherForeign=");
		sb.append(costOtherForeign);
		sb.append(", costProvide=");
		sb.append(costProvide);
		sb.append(", costProvideForeign=");
		sb.append(costProvideForeign);
		sb.append(", costLocal=");
		sb.append(costLocal);
		sb.append(", costForeign=");
		sb.append(costForeign);
		sb.append(", costForeignRate=");
		sb.append(costForeignRate);
		sb.append(", costTax=");
		sb.append(costTax);
		sb.append(", costTotalValue=");
		sb.append(costTotalValue);
		sb.append(", costTotalValueTax=");
		sb.append(costTotalValueTax);
		sb.append(", decideDelivererUserId=");
		sb.append(decideDelivererUserId);
		sb.append(", decideReceiveUserId=");
		sb.append(decideReceiveUserId);
		sb.append(", decideAskDate=");
		sb.append(decideAskDate);
		sb.append(", decideDeadline=");
		sb.append(decideDeadline);
		sb.append(", decideFinishDate=");
		sb.append(decideFinishDate);
		sb.append(", decideDescription=");
		sb.append(decideDescription);
		sb.append(", decideUserId=");
		sb.append(decideUserId);
		sb.append(", decideDate=");
		sb.append(decideDate);
		sb.append(", verifyStatus=");
		sb.append(verifyStatus);
		sb.append(", verifyDocNum=");
		sb.append(verifyDocNum);
		sb.append(", verifyDate=");
		sb.append(verifyDate);
		sb.append(", verifyUserId=");
		sb.append(verifyUserId);
		sb.append(", verifyDescription=");
		sb.append(verifyDescription);
		sb.append(", isActive=");
		sb.append(isActive);
		sb.append(", status=");
		sb.append(status);
		sb.append(", createdId=");
		sb.append(createdId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", modifieldId=");
		sb.append(modifieldId);
		sb.append(", modifieldDate=");
		sb.append(modifieldDate);
		sb.append(", infoPolicyTypeName=");
		sb.append(infoPolicyTypeName);
		sb.append(", infoProposeGroupName=");
		sb.append(infoProposeGroupName);
		sb.append(", infoVerifyGroupName=");
		sb.append(infoVerifyGroupName);
		sb.append(", infoResponsibleUserName=");
		sb.append(infoResponsibleUserName);
		sb.append(", infoInvestCreateGroupName=");
		sb.append(infoInvestCreateGroupName);
		sb.append(", infoInvestDeployGroupName=");
		sb.append(infoInvestDeployGroupName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public InvestPolicyExt toEntityModel() {
		InvestPolicyExtImpl investPolicyExtImpl = new InvestPolicyExtImpl();

		investPolicyExtImpl.setInvestPolicyId(investPolicyId);
		investPolicyExtImpl.setInfoPolicyType(infoPolicyType);

		if (infoPolicyName == null) {
			investPolicyExtImpl.setInfoPolicyName(StringPool.BLANK);
		}
		else {
			investPolicyExtImpl.setInfoPolicyName(infoPolicyName);
		}

		if (infoPolicyCode == null) {
			investPolicyExtImpl.setInfoPolicyCode(StringPool.BLANK);
		}
		else {
			investPolicyExtImpl.setInfoPolicyCode(infoPolicyCode);
		}

		investPolicyExtImpl.setInfoProposeGroupId(infoProposeGroupId);
		investPolicyExtImpl.setInfoVerifyGroupId(infoVerifyGroupId);

		if (infoPolicyDate == Long.MIN_VALUE) {
			investPolicyExtImpl.setInfoPolicyDate(null);
		}
		else {
			investPolicyExtImpl.setInfoPolicyDate(new Date(infoPolicyDate));
		}

		if (infoPolicyDeployDate == Long.MIN_VALUE) {
			investPolicyExtImpl.setInfoPolicyDeployDate(null);
		}
		else {
			investPolicyExtImpl.setInfoPolicyDeployDate(new Date(
					infoPolicyDeployDate));
		}

		investPolicyExtImpl.setInfoResponsibleUserId(infoResponsibleUserId);

		if (infoService == null) {
			investPolicyExtImpl.setInfoService(StringPool.BLANK);
		}
		else {
			investPolicyExtImpl.setInfoService(infoService);
		}

		if (infoInvestTarget == null) {
			investPolicyExtImpl.setInfoInvestTarget(StringPool.BLANK);
		}
		else {
			investPolicyExtImpl.setInfoInvestTarget(infoInvestTarget);
		}

		if (infoInvestLocation == null) {
			investPolicyExtImpl.setInfoInvestLocation(StringPool.BLANK);
		}
		else {
			investPolicyExtImpl.setInfoInvestLocation(infoInvestLocation);
		}

		if (infoTechnique == null) {
			investPolicyExtImpl.setInfoTechnique(StringPool.BLANK);
		}
		else {
			investPolicyExtImpl.setInfoTechnique(infoTechnique);
		}

		if (infoInvestName == null) {
			investPolicyExtImpl.setInfoInvestName(StringPool.BLANK);
		}
		else {
			investPolicyExtImpl.setInfoInvestName(infoInvestName);
		}

		investPolicyExtImpl.setInfoInvestDeadline(infoInvestDeadline);
		investPolicyExtImpl.setInfoInvestCreateGroupId(infoInvestCreateGroupId);
		investPolicyExtImpl.setInfoInvestDeployGroupId(infoInvestDeployGroupId);
		investPolicyExtImpl.setCostCapital(costCapital);
		investPolicyExtImpl.setCostCompensate(costCompensate);
		investPolicyExtImpl.setCostCompensateForeign(costCompensateForeign);
		investPolicyExtImpl.setCostEquiment(costEquiment);
		investPolicyExtImpl.setCostEquimentForeign(costEquimentForeign);
		investPolicyExtImpl.setCostContruction(costContruction);
		investPolicyExtImpl.setCostContructionForeign(costContructionForeign);
		investPolicyExtImpl.setCostAdvisory(costAdvisory);
		investPolicyExtImpl.setCostAdvisoryForeign(costAdvisoryForeign);
		investPolicyExtImpl.setCostManager(costManager);
		investPolicyExtImpl.setCostManagerForeign(costManagerForeign);
		investPolicyExtImpl.setCostOther(costOther);
		investPolicyExtImpl.setCostOtherForeign(costOtherForeign);
		investPolicyExtImpl.setCostProvide(costProvide);
		investPolicyExtImpl.setCostProvideForeign(costProvideForeign);
		investPolicyExtImpl.setCostLocal(costLocal);
		investPolicyExtImpl.setCostForeign(costForeign);
		investPolicyExtImpl.setCostForeignRate(costForeignRate);
		investPolicyExtImpl.setCostTax(costTax);
		investPolicyExtImpl.setCostTotalValue(costTotalValue);
		investPolicyExtImpl.setCostTotalValueTax(costTotalValueTax);
		investPolicyExtImpl.setDecideDelivererUserId(decideDelivererUserId);
		investPolicyExtImpl.setDecideReceiveUserId(decideReceiveUserId);

		if (decideAskDate == Long.MIN_VALUE) {
			investPolicyExtImpl.setDecideAskDate(null);
		}
		else {
			investPolicyExtImpl.setDecideAskDate(new Date(decideAskDate));
		}

		investPolicyExtImpl.setDecideDeadline(decideDeadline);

		if (decideFinishDate == Long.MIN_VALUE) {
			investPolicyExtImpl.setDecideFinishDate(null);
		}
		else {
			investPolicyExtImpl.setDecideFinishDate(new Date(decideFinishDate));
		}

		if (decideDescription == null) {
			investPolicyExtImpl.setDecideDescription(StringPool.BLANK);
		}
		else {
			investPolicyExtImpl.setDecideDescription(decideDescription);
		}

		investPolicyExtImpl.setDecideUserId(decideUserId);

		if (decideDate == Long.MIN_VALUE) {
			investPolicyExtImpl.setDecideDate(null);
		}
		else {
			investPolicyExtImpl.setDecideDate(new Date(decideDate));
		}

		investPolicyExtImpl.setVerifyStatus(verifyStatus);

		if (verifyDocNum == null) {
			investPolicyExtImpl.setVerifyDocNum(StringPool.BLANK);
		}
		else {
			investPolicyExtImpl.setVerifyDocNum(verifyDocNum);
		}

		if (verifyDate == Long.MIN_VALUE) {
			investPolicyExtImpl.setVerifyDate(null);
		}
		else {
			investPolicyExtImpl.setVerifyDate(new Date(verifyDate));
		}

		investPolicyExtImpl.setVerifyUserId(verifyUserId);

		if (verifyDescription == null) {
			investPolicyExtImpl.setVerifyDescription(StringPool.BLANK);
		}
		else {
			investPolicyExtImpl.setVerifyDescription(verifyDescription);
		}

		investPolicyExtImpl.setIsActive(isActive);
		investPolicyExtImpl.setStatus(status);
		investPolicyExtImpl.setCreatedId(createdId);

		if (createdDate == Long.MIN_VALUE) {
			investPolicyExtImpl.setCreatedDate(null);
		}
		else {
			investPolicyExtImpl.setCreatedDate(new Date(createdDate));
		}

		investPolicyExtImpl.setModifieldId(modifieldId);

		if (modifieldDate == Long.MIN_VALUE) {
			investPolicyExtImpl.setModifieldDate(null);
		}
		else {
			investPolicyExtImpl.setModifieldDate(new Date(modifieldDate));
		}

		if (infoPolicyTypeName == null) {
			investPolicyExtImpl.setInfoPolicyTypeName(StringPool.BLANK);
		}
		else {
			investPolicyExtImpl.setInfoPolicyTypeName(infoPolicyTypeName);
		}

		if (infoProposeGroupName == null) {
			investPolicyExtImpl.setInfoProposeGroupName(StringPool.BLANK);
		}
		else {
			investPolicyExtImpl.setInfoProposeGroupName(infoProposeGroupName);
		}

		if (infoVerifyGroupName == null) {
			investPolicyExtImpl.setInfoVerifyGroupName(StringPool.BLANK);
		}
		else {
			investPolicyExtImpl.setInfoVerifyGroupName(infoVerifyGroupName);
		}

		if (infoResponsibleUserName == null) {
			investPolicyExtImpl.setInfoResponsibleUserName(StringPool.BLANK);
		}
		else {
			investPolicyExtImpl.setInfoResponsibleUserName(infoResponsibleUserName);
		}

		if (infoInvestCreateGroupName == null) {
			investPolicyExtImpl.setInfoInvestCreateGroupName(StringPool.BLANK);
		}
		else {
			investPolicyExtImpl.setInfoInvestCreateGroupName(infoInvestCreateGroupName);
		}

		if (infoInvestDeployGroupName == null) {
			investPolicyExtImpl.setInfoInvestDeployGroupName(StringPool.BLANK);
		}
		else {
			investPolicyExtImpl.setInfoInvestDeployGroupName(infoInvestDeployGroupName);
		}

		investPolicyExtImpl.resetOriginalValues();

		return investPolicyExtImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		investPolicyId = objectInput.readLong();
		infoPolicyType = objectInput.readLong();
		infoPolicyName = objectInput.readUTF();
		infoPolicyCode = objectInput.readUTF();
		infoProposeGroupId = objectInput.readLong();
		infoVerifyGroupId = objectInput.readLong();
		infoPolicyDate = objectInput.readLong();
		infoPolicyDeployDate = objectInput.readLong();
		infoResponsibleUserId = objectInput.readLong();
		infoService = objectInput.readUTF();
		infoInvestTarget = objectInput.readUTF();
		infoInvestLocation = objectInput.readUTF();
		infoTechnique = objectInput.readUTF();
		infoInvestName = objectInput.readUTF();
		infoInvestDeadline = objectInput.readLong();
		infoInvestCreateGroupId = objectInput.readLong();
		infoInvestDeployGroupId = objectInput.readLong();
		costCapital = objectInput.readLong();
		costCompensate = objectInput.readDouble();
		costCompensateForeign = objectInput.readDouble();
		costEquiment = objectInput.readDouble();
		costEquimentForeign = objectInput.readDouble();
		costContruction = objectInput.readDouble();
		costContructionForeign = objectInput.readDouble();
		costAdvisory = objectInput.readDouble();
		costAdvisoryForeign = objectInput.readDouble();
		costManager = objectInput.readDouble();
		costManagerForeign = objectInput.readDouble();
		costOther = objectInput.readDouble();
		costOtherForeign = objectInput.readDouble();
		costProvide = objectInput.readDouble();
		costProvideForeign = objectInput.readDouble();
		costLocal = objectInput.readDouble();
		costForeign = objectInput.readDouble();
		costForeignRate = objectInput.readDouble();
		costTax = objectInput.readDouble();
		costTotalValue = objectInput.readDouble();
		costTotalValueTax = objectInput.readDouble();
		decideDelivererUserId = objectInput.readLong();
		decideReceiveUserId = objectInput.readLong();
		decideAskDate = objectInput.readLong();
		decideDeadline = objectInput.readLong();
		decideFinishDate = objectInput.readLong();
		decideDescription = objectInput.readUTF();
		decideUserId = objectInput.readLong();
		decideDate = objectInput.readLong();
		verifyStatus = objectInput.readLong();
		verifyDocNum = objectInput.readUTF();
		verifyDate = objectInput.readLong();
		verifyUserId = objectInput.readLong();
		verifyDescription = objectInput.readUTF();
		isActive = objectInput.readLong();
		status = objectInput.readLong();
		createdId = objectInput.readLong();
		createdDate = objectInput.readLong();
		modifieldId = objectInput.readLong();
		modifieldDate = objectInput.readLong();
		infoPolicyTypeName = objectInput.readUTF();
		infoProposeGroupName = objectInput.readUTF();
		infoVerifyGroupName = objectInput.readUTF();
		infoResponsibleUserName = objectInput.readUTF();
		infoInvestCreateGroupName = objectInput.readUTF();
		infoInvestDeployGroupName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(investPolicyId);
		objectOutput.writeLong(infoPolicyType);

		if (infoPolicyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infoPolicyName);
		}

		if (infoPolicyCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infoPolicyCode);
		}

		objectOutput.writeLong(infoProposeGroupId);
		objectOutput.writeLong(infoVerifyGroupId);
		objectOutput.writeLong(infoPolicyDate);
		objectOutput.writeLong(infoPolicyDeployDate);
		objectOutput.writeLong(infoResponsibleUserId);

		if (infoService == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infoService);
		}

		if (infoInvestTarget == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infoInvestTarget);
		}

		if (infoInvestLocation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infoInvestLocation);
		}

		if (infoTechnique == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infoTechnique);
		}

		if (infoInvestName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infoInvestName);
		}

		objectOutput.writeLong(infoInvestDeadline);
		objectOutput.writeLong(infoInvestCreateGroupId);
		objectOutput.writeLong(infoInvestDeployGroupId);
		objectOutput.writeLong(costCapital);
		objectOutput.writeDouble(costCompensate);
		objectOutput.writeDouble(costCompensateForeign);
		objectOutput.writeDouble(costEquiment);
		objectOutput.writeDouble(costEquimentForeign);
		objectOutput.writeDouble(costContruction);
		objectOutput.writeDouble(costContructionForeign);
		objectOutput.writeDouble(costAdvisory);
		objectOutput.writeDouble(costAdvisoryForeign);
		objectOutput.writeDouble(costManager);
		objectOutput.writeDouble(costManagerForeign);
		objectOutput.writeDouble(costOther);
		objectOutput.writeDouble(costOtherForeign);
		objectOutput.writeDouble(costProvide);
		objectOutput.writeDouble(costProvideForeign);
		objectOutput.writeDouble(costLocal);
		objectOutput.writeDouble(costForeign);
		objectOutput.writeDouble(costForeignRate);
		objectOutput.writeDouble(costTax);
		objectOutput.writeDouble(costTotalValue);
		objectOutput.writeDouble(costTotalValueTax);
		objectOutput.writeLong(decideDelivererUserId);
		objectOutput.writeLong(decideReceiveUserId);
		objectOutput.writeLong(decideAskDate);
		objectOutput.writeLong(decideDeadline);
		objectOutput.writeLong(decideFinishDate);

		if (decideDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(decideDescription);
		}

		objectOutput.writeLong(decideUserId);
		objectOutput.writeLong(decideDate);
		objectOutput.writeLong(verifyStatus);

		if (verifyDocNum == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(verifyDocNum);
		}

		objectOutput.writeLong(verifyDate);
		objectOutput.writeLong(verifyUserId);

		if (verifyDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(verifyDescription);
		}

		objectOutput.writeLong(isActive);
		objectOutput.writeLong(status);
		objectOutput.writeLong(createdId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(modifieldId);
		objectOutput.writeLong(modifieldDate);

		if (infoPolicyTypeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infoPolicyTypeName);
		}

		if (infoProposeGroupName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infoProposeGroupName);
		}

		if (infoVerifyGroupName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infoVerifyGroupName);
		}

		if (infoResponsibleUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infoResponsibleUserName);
		}

		if (infoInvestCreateGroupName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infoInvestCreateGroupName);
		}

		if (infoInvestDeployGroupName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infoInvestDeployGroupName);
		}
	}

	public long investPolicyId;
	public long infoPolicyType;
	public String infoPolicyName;
	public String infoPolicyCode;
	public long infoProposeGroupId;
	public long infoVerifyGroupId;
	public long infoPolicyDate;
	public long infoPolicyDeployDate;
	public long infoResponsibleUserId;
	public String infoService;
	public String infoInvestTarget;
	public String infoInvestLocation;
	public String infoTechnique;
	public String infoInvestName;
	public long infoInvestDeadline;
	public long infoInvestCreateGroupId;
	public long infoInvestDeployGroupId;
	public long costCapital;
	public double costCompensate;
	public double costCompensateForeign;
	public double costEquiment;
	public double costEquimentForeign;
	public double costContruction;
	public double costContructionForeign;
	public double costAdvisory;
	public double costAdvisoryForeign;
	public double costManager;
	public double costManagerForeign;
	public double costOther;
	public double costOtherForeign;
	public double costProvide;
	public double costProvideForeign;
	public double costLocal;
	public double costForeign;
	public double costForeignRate;
	public double costTax;
	public double costTotalValue;
	public double costTotalValueTax;
	public long decideDelivererUserId;
	public long decideReceiveUserId;
	public long decideAskDate;
	public long decideDeadline;
	public long decideFinishDate;
	public String decideDescription;
	public long decideUserId;
	public long decideDate;
	public long verifyStatus;
	public String verifyDocNum;
	public long verifyDate;
	public long verifyUserId;
	public String verifyDescription;
	public long isActive;
	public long status;
	public long createdId;
	public long createdDate;
	public long modifieldId;
	public long modifieldDate;
	public String infoPolicyTypeName;
	public String infoProposeGroupName;
	public String infoVerifyGroupName;
	public String infoResponsibleUserName;
	public String infoInvestCreateGroupName;
	public String infoInvestDeployGroupName;
}
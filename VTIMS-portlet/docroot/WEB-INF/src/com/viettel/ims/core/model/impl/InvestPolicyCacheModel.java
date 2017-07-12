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

import com.viettel.ims.core.model.InvestPolicy;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing InvestPolicy in entity cache.
 *
 * @author MrNet
 * @see InvestPolicy
 * @generated
 */
public class InvestPolicyCacheModel implements CacheModel<InvestPolicy>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(115);

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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public InvestPolicy toEntityModel() {
		InvestPolicyImpl investPolicyImpl = new InvestPolicyImpl();

		investPolicyImpl.setInvestPolicyId(investPolicyId);
		investPolicyImpl.setInfoPolicyType(infoPolicyType);

		if (infoPolicyName == null) {
			investPolicyImpl.setInfoPolicyName(StringPool.BLANK);
		}
		else {
			investPolicyImpl.setInfoPolicyName(infoPolicyName);
		}

		if (infoPolicyCode == null) {
			investPolicyImpl.setInfoPolicyCode(StringPool.BLANK);
		}
		else {
			investPolicyImpl.setInfoPolicyCode(infoPolicyCode);
		}

		investPolicyImpl.setInfoProposeGroupId(infoProposeGroupId);
		investPolicyImpl.setInfoVerifyGroupId(infoVerifyGroupId);

		if (infoPolicyDate == Long.MIN_VALUE) {
			investPolicyImpl.setInfoPolicyDate(null);
		}
		else {
			investPolicyImpl.setInfoPolicyDate(new Date(infoPolicyDate));
		}

		if (infoPolicyDeployDate == Long.MIN_VALUE) {
			investPolicyImpl.setInfoPolicyDeployDate(null);
		}
		else {
			investPolicyImpl.setInfoPolicyDeployDate(new Date(
					infoPolicyDeployDate));
		}

		investPolicyImpl.setInfoResponsibleUserId(infoResponsibleUserId);

		if (infoService == null) {
			investPolicyImpl.setInfoService(StringPool.BLANK);
		}
		else {
			investPolicyImpl.setInfoService(infoService);
		}

		if (infoInvestTarget == null) {
			investPolicyImpl.setInfoInvestTarget(StringPool.BLANK);
		}
		else {
			investPolicyImpl.setInfoInvestTarget(infoInvestTarget);
		}

		if (infoInvestLocation == null) {
			investPolicyImpl.setInfoInvestLocation(StringPool.BLANK);
		}
		else {
			investPolicyImpl.setInfoInvestLocation(infoInvestLocation);
		}

		if (infoTechnique == null) {
			investPolicyImpl.setInfoTechnique(StringPool.BLANK);
		}
		else {
			investPolicyImpl.setInfoTechnique(infoTechnique);
		}

		if (infoInvestName == null) {
			investPolicyImpl.setInfoInvestName(StringPool.BLANK);
		}
		else {
			investPolicyImpl.setInfoInvestName(infoInvestName);
		}

		investPolicyImpl.setInfoInvestDeadline(infoInvestDeadline);
		investPolicyImpl.setInfoInvestCreateGroupId(infoInvestCreateGroupId);
		investPolicyImpl.setInfoInvestDeployGroupId(infoInvestDeployGroupId);
		investPolicyImpl.setCostCapital(costCapital);
		investPolicyImpl.setCostCompensate(costCompensate);
		investPolicyImpl.setCostCompensateForeign(costCompensateForeign);
		investPolicyImpl.setCostEquiment(costEquiment);
		investPolicyImpl.setCostEquimentForeign(costEquimentForeign);
		investPolicyImpl.setCostContruction(costContruction);
		investPolicyImpl.setCostContructionForeign(costContructionForeign);
		investPolicyImpl.setCostAdvisory(costAdvisory);
		investPolicyImpl.setCostAdvisoryForeign(costAdvisoryForeign);
		investPolicyImpl.setCostManager(costManager);
		investPolicyImpl.setCostManagerForeign(costManagerForeign);
		investPolicyImpl.setCostOther(costOther);
		investPolicyImpl.setCostOtherForeign(costOtherForeign);
		investPolicyImpl.setCostProvide(costProvide);
		investPolicyImpl.setCostProvideForeign(costProvideForeign);
		investPolicyImpl.setCostLocal(costLocal);
		investPolicyImpl.setCostForeign(costForeign);
		investPolicyImpl.setCostForeignRate(costForeignRate);
		investPolicyImpl.setCostTax(costTax);
		investPolicyImpl.setCostTotalValue(costTotalValue);
		investPolicyImpl.setCostTotalValueTax(costTotalValueTax);
		investPolicyImpl.setDecideDelivererUserId(decideDelivererUserId);
		investPolicyImpl.setDecideReceiveUserId(decideReceiveUserId);

		if (decideAskDate == Long.MIN_VALUE) {
			investPolicyImpl.setDecideAskDate(null);
		}
		else {
			investPolicyImpl.setDecideAskDate(new Date(decideAskDate));
		}

		investPolicyImpl.setDecideDeadline(decideDeadline);

		if (decideFinishDate == Long.MIN_VALUE) {
			investPolicyImpl.setDecideFinishDate(null);
		}
		else {
			investPolicyImpl.setDecideFinishDate(new Date(decideFinishDate));
		}

		if (decideDescription == null) {
			investPolicyImpl.setDecideDescription(StringPool.BLANK);
		}
		else {
			investPolicyImpl.setDecideDescription(decideDescription);
		}

		investPolicyImpl.setDecideUserId(decideUserId);

		if (decideDate == Long.MIN_VALUE) {
			investPolicyImpl.setDecideDate(null);
		}
		else {
			investPolicyImpl.setDecideDate(new Date(decideDate));
		}

		investPolicyImpl.setVerifyStatus(verifyStatus);

		if (verifyDocNum == null) {
			investPolicyImpl.setVerifyDocNum(StringPool.BLANK);
		}
		else {
			investPolicyImpl.setVerifyDocNum(verifyDocNum);
		}

		if (verifyDate == Long.MIN_VALUE) {
			investPolicyImpl.setVerifyDate(null);
		}
		else {
			investPolicyImpl.setVerifyDate(new Date(verifyDate));
		}

		investPolicyImpl.setVerifyUserId(verifyUserId);

		if (verifyDescription == null) {
			investPolicyImpl.setVerifyDescription(StringPool.BLANK);
		}
		else {
			investPolicyImpl.setVerifyDescription(verifyDescription);
		}

		investPolicyImpl.setIsActive(isActive);
		investPolicyImpl.setStatus(status);
		investPolicyImpl.setCreatedId(createdId);

		if (createdDate == Long.MIN_VALUE) {
			investPolicyImpl.setCreatedDate(null);
		}
		else {
			investPolicyImpl.setCreatedDate(new Date(createdDate));
		}

		investPolicyImpl.setModifieldId(modifieldId);

		if (modifieldDate == Long.MIN_VALUE) {
			investPolicyImpl.setModifieldDate(null);
		}
		else {
			investPolicyImpl.setModifieldDate(new Date(modifieldDate));
		}

		investPolicyImpl.resetOriginalValues();

		return investPolicyImpl;
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
}
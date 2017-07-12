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

import com.viettel.ims.core.model.VInvestPolicy;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VInvestPolicy in entity cache.
 *
 * @author MrNet
 * @see VInvestPolicy
 * @generated
 */
public class VInvestPolicyCacheModel implements CacheModel<VInvestPolicy>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{investPolicyId=");
		sb.append(investPolicyId);
		sb.append(", infoPolicyTypeName=");
		sb.append(infoPolicyTypeName);
		sb.append(", infoPolicyName=");
		sb.append(infoPolicyName);
		sb.append(", infoProposeGroupName=");
		sb.append(infoProposeGroupName);
		sb.append(", infoVerifyGroupName=");
		sb.append(infoVerifyGroupName);
		sb.append(", infoPolicyDate=");
		sb.append(infoPolicyDate);
		sb.append(", infoPolicyDeployDate=");
		sb.append(infoPolicyDeployDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VInvestPolicy toEntityModel() {
		VInvestPolicyImpl vInvestPolicyImpl = new VInvestPolicyImpl();

		vInvestPolicyImpl.setInvestPolicyId(investPolicyId);

		if (infoPolicyTypeName == null) {
			vInvestPolicyImpl.setInfoPolicyTypeName(StringPool.BLANK);
		}
		else {
			vInvestPolicyImpl.setInfoPolicyTypeName(infoPolicyTypeName);
		}

		if (infoPolicyName == null) {
			vInvestPolicyImpl.setInfoPolicyName(StringPool.BLANK);
		}
		else {
			vInvestPolicyImpl.setInfoPolicyName(infoPolicyName);
		}

		if (infoProposeGroupName == null) {
			vInvestPolicyImpl.setInfoProposeGroupName(StringPool.BLANK);
		}
		else {
			vInvestPolicyImpl.setInfoProposeGroupName(infoProposeGroupName);
		}

		if (infoVerifyGroupName == null) {
			vInvestPolicyImpl.setInfoVerifyGroupName(StringPool.BLANK);
		}
		else {
			vInvestPolicyImpl.setInfoVerifyGroupName(infoVerifyGroupName);
		}

		if (infoPolicyDate == Long.MIN_VALUE) {
			vInvestPolicyImpl.setInfoPolicyDate(null);
		}
		else {
			vInvestPolicyImpl.setInfoPolicyDate(new Date(infoPolicyDate));
		}

		if (infoPolicyDeployDate == Long.MIN_VALUE) {
			vInvestPolicyImpl.setInfoPolicyDeployDate(null);
		}
		else {
			vInvestPolicyImpl.setInfoPolicyDeployDate(new Date(
					infoPolicyDeployDate));
		}

		vInvestPolicyImpl.resetOriginalValues();

		return vInvestPolicyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		investPolicyId = objectInput.readLong();
		infoPolicyTypeName = objectInput.readUTF();
		infoPolicyName = objectInput.readUTF();
		infoProposeGroupName = objectInput.readUTF();
		infoVerifyGroupName = objectInput.readUTF();
		infoPolicyDate = objectInput.readLong();
		infoPolicyDeployDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(investPolicyId);

		if (infoPolicyTypeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infoPolicyTypeName);
		}

		if (infoPolicyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(infoPolicyName);
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

		objectOutput.writeLong(infoPolicyDate);
		objectOutput.writeLong(infoPolicyDeployDate);
	}

	public long investPolicyId;
	public String infoPolicyTypeName;
	public String infoPolicyName;
	public String infoProposeGroupName;
	public String infoVerifyGroupName;
	public long infoPolicyDate;
	public long infoPolicyDeployDate;
}
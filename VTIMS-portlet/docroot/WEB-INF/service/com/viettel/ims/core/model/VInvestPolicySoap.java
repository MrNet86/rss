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

package com.viettel.ims.core.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author MrNet
 * @generated
 */
public class VInvestPolicySoap implements Serializable {
	public static VInvestPolicySoap toSoapModel(VInvestPolicy model) {
		VInvestPolicySoap soapModel = new VInvestPolicySoap();

		soapModel.setInvestPolicyId(model.getInvestPolicyId());
		soapModel.setInfoPolicyTypeName(model.getInfoPolicyTypeName());
		soapModel.setInfoPolicyName(model.getInfoPolicyName());
		soapModel.setInfoProposeGroupName(model.getInfoProposeGroupName());
		soapModel.setInfoVerifyGroupName(model.getInfoVerifyGroupName());
		soapModel.setInfoPolicyDate(model.getInfoPolicyDate());
		soapModel.setInfoPolicyDeployDate(model.getInfoPolicyDeployDate());

		return soapModel;
	}

	public static VInvestPolicySoap[] toSoapModels(VInvestPolicy[] models) {
		VInvestPolicySoap[] soapModels = new VInvestPolicySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VInvestPolicySoap[][] toSoapModels(VInvestPolicy[][] models) {
		VInvestPolicySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VInvestPolicySoap[models.length][models[0].length];
		}
		else {
			soapModels = new VInvestPolicySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VInvestPolicySoap[] toSoapModels(List<VInvestPolicy> models) {
		List<VInvestPolicySoap> soapModels = new ArrayList<VInvestPolicySoap>(models.size());

		for (VInvestPolicy model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VInvestPolicySoap[soapModels.size()]);
	}

	public VInvestPolicySoap() {
	}

	public long getPrimaryKey() {
		return _investPolicyId;
	}

	public void setPrimaryKey(long pk) {
		setInvestPolicyId(pk);
	}

	public long getInvestPolicyId() {
		return _investPolicyId;
	}

	public void setInvestPolicyId(long investPolicyId) {
		_investPolicyId = investPolicyId;
	}

	public String getInfoPolicyTypeName() {
		return _infoPolicyTypeName;
	}

	public void setInfoPolicyTypeName(String infoPolicyTypeName) {
		_infoPolicyTypeName = infoPolicyTypeName;
	}

	public String getInfoPolicyName() {
		return _infoPolicyName;
	}

	public void setInfoPolicyName(String infoPolicyName) {
		_infoPolicyName = infoPolicyName;
	}

	public String getInfoProposeGroupName() {
		return _infoProposeGroupName;
	}

	public void setInfoProposeGroupName(String infoProposeGroupName) {
		_infoProposeGroupName = infoProposeGroupName;
	}

	public String getInfoVerifyGroupName() {
		return _infoVerifyGroupName;
	}

	public void setInfoVerifyGroupName(String infoVerifyGroupName) {
		_infoVerifyGroupName = infoVerifyGroupName;
	}

	public Date getInfoPolicyDate() {
		return _infoPolicyDate;
	}

	public void setInfoPolicyDate(Date infoPolicyDate) {
		_infoPolicyDate = infoPolicyDate;
	}

	public Date getInfoPolicyDeployDate() {
		return _infoPolicyDeployDate;
	}

	public void setInfoPolicyDeployDate(Date infoPolicyDeployDate) {
		_infoPolicyDeployDate = infoPolicyDeployDate;
	}

	private long _investPolicyId;
	private String _infoPolicyTypeName;
	private String _infoPolicyName;
	private String _infoProposeGroupName;
	private String _infoVerifyGroupName;
	private Date _infoPolicyDate;
	private Date _infoPolicyDeployDate;
}
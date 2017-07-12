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
public class InvestPolicySoap implements Serializable {
	public static InvestPolicySoap toSoapModel(InvestPolicy model) {
		InvestPolicySoap soapModel = new InvestPolicySoap();

		soapModel.setInvestPolicyId(model.getInvestPolicyId());
		soapModel.setInfoPolicyType(model.getInfoPolicyType());
		soapModel.setInfoPolicyName(model.getInfoPolicyName());
		soapModel.setInfoPolicyCode(model.getInfoPolicyCode());
		soapModel.setInfoProposeGroupId(model.getInfoProposeGroupId());
		soapModel.setInfoVerifyGroupId(model.getInfoVerifyGroupId());
		soapModel.setInfoPolicyDate(model.getInfoPolicyDate());
		soapModel.setInfoPolicyDeployDate(model.getInfoPolicyDeployDate());
		soapModel.setInfoResponsibleUserId(model.getInfoResponsibleUserId());
		soapModel.setInfoService(model.getInfoService());
		soapModel.setInfoInvestTarget(model.getInfoInvestTarget());
		soapModel.setInfoInvestLocation(model.getInfoInvestLocation());
		soapModel.setInfoTechnique(model.getInfoTechnique());
		soapModel.setInfoInvestName(model.getInfoInvestName());
		soapModel.setInfoInvestDeadline(model.getInfoInvestDeadline());
		soapModel.setInfoInvestCreateGroupId(model.getInfoInvestCreateGroupId());
		soapModel.setInfoInvestDeployGroupId(model.getInfoInvestDeployGroupId());
		soapModel.setCostCapital(model.getCostCapital());
		soapModel.setCostCompensate(model.getCostCompensate());
		soapModel.setCostCompensateForeign(model.getCostCompensateForeign());
		soapModel.setCostEquiment(model.getCostEquiment());
		soapModel.setCostEquimentForeign(model.getCostEquimentForeign());
		soapModel.setCostContruction(model.getCostContruction());
		soapModel.setCostContructionForeign(model.getCostContructionForeign());
		soapModel.setCostAdvisory(model.getCostAdvisory());
		soapModel.setCostAdvisoryForeign(model.getCostAdvisoryForeign());
		soapModel.setCostManager(model.getCostManager());
		soapModel.setCostManagerForeign(model.getCostManagerForeign());
		soapModel.setCostOther(model.getCostOther());
		soapModel.setCostOtherForeign(model.getCostOtherForeign());
		soapModel.setCostProvide(model.getCostProvide());
		soapModel.setCostProvideForeign(model.getCostProvideForeign());
		soapModel.setCostLocal(model.getCostLocal());
		soapModel.setCostForeign(model.getCostForeign());
		soapModel.setCostForeignRate(model.getCostForeignRate());
		soapModel.setCostTax(model.getCostTax());
		soapModel.setCostTotalValue(model.getCostTotalValue());
		soapModel.setCostTotalValueTax(model.getCostTotalValueTax());
		soapModel.setDecideDelivererUserId(model.getDecideDelivererUserId());
		soapModel.setDecideReceiveUserId(model.getDecideReceiveUserId());
		soapModel.setDecideAskDate(model.getDecideAskDate());
		soapModel.setDecideDeadline(model.getDecideDeadline());
		soapModel.setDecideFinishDate(model.getDecideFinishDate());
		soapModel.setDecideDescription(model.getDecideDescription());
		soapModel.setDecideUserId(model.getDecideUserId());
		soapModel.setDecideDate(model.getDecideDate());
		soapModel.setVerifyStatus(model.getVerifyStatus());
		soapModel.setVerifyDocNum(model.getVerifyDocNum());
		soapModel.setVerifyDate(model.getVerifyDate());
		soapModel.setVerifyUserId(model.getVerifyUserId());
		soapModel.setVerifyDescription(model.getVerifyDescription());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setStatus(model.getStatus());
		soapModel.setCreatedId(model.getCreatedId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifieldId(model.getModifieldId());
		soapModel.setModifieldDate(model.getModifieldDate());

		return soapModel;
	}

	public static InvestPolicySoap[] toSoapModels(InvestPolicy[] models) {
		InvestPolicySoap[] soapModels = new InvestPolicySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InvestPolicySoap[][] toSoapModels(InvestPolicy[][] models) {
		InvestPolicySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InvestPolicySoap[models.length][models[0].length];
		}
		else {
			soapModels = new InvestPolicySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InvestPolicySoap[] toSoapModels(List<InvestPolicy> models) {
		List<InvestPolicySoap> soapModels = new ArrayList<InvestPolicySoap>(models.size());

		for (InvestPolicy model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InvestPolicySoap[soapModels.size()]);
	}

	public InvestPolicySoap() {
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

	public long getInfoPolicyType() {
		return _infoPolicyType;
	}

	public void setInfoPolicyType(long infoPolicyType) {
		_infoPolicyType = infoPolicyType;
	}

	public String getInfoPolicyName() {
		return _infoPolicyName;
	}

	public void setInfoPolicyName(String infoPolicyName) {
		_infoPolicyName = infoPolicyName;
	}

	public String getInfoPolicyCode() {
		return _infoPolicyCode;
	}

	public void setInfoPolicyCode(String infoPolicyCode) {
		_infoPolicyCode = infoPolicyCode;
	}

	public long getInfoProposeGroupId() {
		return _infoProposeGroupId;
	}

	public void setInfoProposeGroupId(long infoProposeGroupId) {
		_infoProposeGroupId = infoProposeGroupId;
	}

	public long getInfoVerifyGroupId() {
		return _infoVerifyGroupId;
	}

	public void setInfoVerifyGroupId(long infoVerifyGroupId) {
		_infoVerifyGroupId = infoVerifyGroupId;
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

	public long getInfoResponsibleUserId() {
		return _infoResponsibleUserId;
	}

	public void setInfoResponsibleUserId(long infoResponsibleUserId) {
		_infoResponsibleUserId = infoResponsibleUserId;
	}

	public String getInfoService() {
		return _infoService;
	}

	public void setInfoService(String infoService) {
		_infoService = infoService;
	}

	public String getInfoInvestTarget() {
		return _infoInvestTarget;
	}

	public void setInfoInvestTarget(String infoInvestTarget) {
		_infoInvestTarget = infoInvestTarget;
	}

	public String getInfoInvestLocation() {
		return _infoInvestLocation;
	}

	public void setInfoInvestLocation(String infoInvestLocation) {
		_infoInvestLocation = infoInvestLocation;
	}

	public String getInfoTechnique() {
		return _infoTechnique;
	}

	public void setInfoTechnique(String infoTechnique) {
		_infoTechnique = infoTechnique;
	}

	public String getInfoInvestName() {
		return _infoInvestName;
	}

	public void setInfoInvestName(String infoInvestName) {
		_infoInvestName = infoInvestName;
	}

	public long getInfoInvestDeadline() {
		return _infoInvestDeadline;
	}

	public void setInfoInvestDeadline(long infoInvestDeadline) {
		_infoInvestDeadline = infoInvestDeadline;
	}

	public long getInfoInvestCreateGroupId() {
		return _infoInvestCreateGroupId;
	}

	public void setInfoInvestCreateGroupId(long infoInvestCreateGroupId) {
		_infoInvestCreateGroupId = infoInvestCreateGroupId;
	}

	public long getInfoInvestDeployGroupId() {
		return _infoInvestDeployGroupId;
	}

	public void setInfoInvestDeployGroupId(long infoInvestDeployGroupId) {
		_infoInvestDeployGroupId = infoInvestDeployGroupId;
	}

	public long getCostCapital() {
		return _costCapital;
	}

	public void setCostCapital(long costCapital) {
		_costCapital = costCapital;
	}

	public double getCostCompensate() {
		return _costCompensate;
	}

	public void setCostCompensate(double costCompensate) {
		_costCompensate = costCompensate;
	}

	public double getCostCompensateForeign() {
		return _costCompensateForeign;
	}

	public void setCostCompensateForeign(double costCompensateForeign) {
		_costCompensateForeign = costCompensateForeign;
	}

	public double getCostEquiment() {
		return _costEquiment;
	}

	public void setCostEquiment(double costEquiment) {
		_costEquiment = costEquiment;
	}

	public double getCostEquimentForeign() {
		return _costEquimentForeign;
	}

	public void setCostEquimentForeign(double costEquimentForeign) {
		_costEquimentForeign = costEquimentForeign;
	}

	public double getCostContruction() {
		return _costContruction;
	}

	public void setCostContruction(double costContruction) {
		_costContruction = costContruction;
	}

	public double getCostContructionForeign() {
		return _costContructionForeign;
	}

	public void setCostContructionForeign(double costContructionForeign) {
		_costContructionForeign = costContructionForeign;
	}

	public double getCostAdvisory() {
		return _costAdvisory;
	}

	public void setCostAdvisory(double costAdvisory) {
		_costAdvisory = costAdvisory;
	}

	public double getCostAdvisoryForeign() {
		return _costAdvisoryForeign;
	}

	public void setCostAdvisoryForeign(double costAdvisoryForeign) {
		_costAdvisoryForeign = costAdvisoryForeign;
	}

	public double getCostManager() {
		return _costManager;
	}

	public void setCostManager(double costManager) {
		_costManager = costManager;
	}

	public double getCostManagerForeign() {
		return _costManagerForeign;
	}

	public void setCostManagerForeign(double costManagerForeign) {
		_costManagerForeign = costManagerForeign;
	}

	public double getCostOther() {
		return _costOther;
	}

	public void setCostOther(double costOther) {
		_costOther = costOther;
	}

	public double getCostOtherForeign() {
		return _costOtherForeign;
	}

	public void setCostOtherForeign(double costOtherForeign) {
		_costOtherForeign = costOtherForeign;
	}

	public double getCostProvide() {
		return _costProvide;
	}

	public void setCostProvide(double costProvide) {
		_costProvide = costProvide;
	}

	public double getCostProvideForeign() {
		return _costProvideForeign;
	}

	public void setCostProvideForeign(double costProvideForeign) {
		_costProvideForeign = costProvideForeign;
	}

	public double getCostLocal() {
		return _costLocal;
	}

	public void setCostLocal(double costLocal) {
		_costLocal = costLocal;
	}

	public double getCostForeign() {
		return _costForeign;
	}

	public void setCostForeign(double costForeign) {
		_costForeign = costForeign;
	}

	public double getCostForeignRate() {
		return _costForeignRate;
	}

	public void setCostForeignRate(double costForeignRate) {
		_costForeignRate = costForeignRate;
	}

	public double getCostTax() {
		return _costTax;
	}

	public void setCostTax(double costTax) {
		_costTax = costTax;
	}

	public double getCostTotalValue() {
		return _costTotalValue;
	}

	public void setCostTotalValue(double costTotalValue) {
		_costTotalValue = costTotalValue;
	}

	public double getCostTotalValueTax() {
		return _costTotalValueTax;
	}

	public void setCostTotalValueTax(double costTotalValueTax) {
		_costTotalValueTax = costTotalValueTax;
	}

	public long getDecideDelivererUserId() {
		return _decideDelivererUserId;
	}

	public void setDecideDelivererUserId(long decideDelivererUserId) {
		_decideDelivererUserId = decideDelivererUserId;
	}

	public long getDecideReceiveUserId() {
		return _decideReceiveUserId;
	}

	public void setDecideReceiveUserId(long decideReceiveUserId) {
		_decideReceiveUserId = decideReceiveUserId;
	}

	public Date getDecideAskDate() {
		return _decideAskDate;
	}

	public void setDecideAskDate(Date decideAskDate) {
		_decideAskDate = decideAskDate;
	}

	public long getDecideDeadline() {
		return _decideDeadline;
	}

	public void setDecideDeadline(long decideDeadline) {
		_decideDeadline = decideDeadline;
	}

	public Date getDecideFinishDate() {
		return _decideFinishDate;
	}

	public void setDecideFinishDate(Date decideFinishDate) {
		_decideFinishDate = decideFinishDate;
	}

	public String getDecideDescription() {
		return _decideDescription;
	}

	public void setDecideDescription(String decideDescription) {
		_decideDescription = decideDescription;
	}

	public long getDecideUserId() {
		return _decideUserId;
	}

	public void setDecideUserId(long decideUserId) {
		_decideUserId = decideUserId;
	}

	public Date getDecideDate() {
		return _decideDate;
	}

	public void setDecideDate(Date decideDate) {
		_decideDate = decideDate;
	}

	public long getVerifyStatus() {
		return _verifyStatus;
	}

	public void setVerifyStatus(long verifyStatus) {
		_verifyStatus = verifyStatus;
	}

	public String getVerifyDocNum() {
		return _verifyDocNum;
	}

	public void setVerifyDocNum(String verifyDocNum) {
		_verifyDocNum = verifyDocNum;
	}

	public Date getVerifyDate() {
		return _verifyDate;
	}

	public void setVerifyDate(Date verifyDate) {
		_verifyDate = verifyDate;
	}

	public long getVerifyUserId() {
		return _verifyUserId;
	}

	public void setVerifyUserId(long verifyUserId) {
		_verifyUserId = verifyUserId;
	}

	public String getVerifyDescription() {
		return _verifyDescription;
	}

	public void setVerifyDescription(String verifyDescription) {
		_verifyDescription = verifyDescription;
	}

	public long getIsActive() {
		return _isActive;
	}

	public void setIsActive(long isActive) {
		_isActive = isActive;
	}

	public long getStatus() {
		return _status;
	}

	public void setStatus(long status) {
		_status = status;
	}

	public long getCreatedId() {
		return _createdId;
	}

	public void setCreatedId(long createdId) {
		_createdId = createdId;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public long getModifieldId() {
		return _modifieldId;
	}

	public void setModifieldId(long modifieldId) {
		_modifieldId = modifieldId;
	}

	public Date getModifieldDate() {
		return _modifieldDate;
	}

	public void setModifieldDate(Date modifieldDate) {
		_modifieldDate = modifieldDate;
	}

	private long _investPolicyId;
	private long _infoPolicyType;
	private String _infoPolicyName;
	private String _infoPolicyCode;
	private long _infoProposeGroupId;
	private long _infoVerifyGroupId;
	private Date _infoPolicyDate;
	private Date _infoPolicyDeployDate;
	private long _infoResponsibleUserId;
	private String _infoService;
	private String _infoInvestTarget;
	private String _infoInvestLocation;
	private String _infoTechnique;
	private String _infoInvestName;
	private long _infoInvestDeadline;
	private long _infoInvestCreateGroupId;
	private long _infoInvestDeployGroupId;
	private long _costCapital;
	private double _costCompensate;
	private double _costCompensateForeign;
	private double _costEquiment;
	private double _costEquimentForeign;
	private double _costContruction;
	private double _costContructionForeign;
	private double _costAdvisory;
	private double _costAdvisoryForeign;
	private double _costManager;
	private double _costManagerForeign;
	private double _costOther;
	private double _costOtherForeign;
	private double _costProvide;
	private double _costProvideForeign;
	private double _costLocal;
	private double _costForeign;
	private double _costForeignRate;
	private double _costTax;
	private double _costTotalValue;
	private double _costTotalValueTax;
	private long _decideDelivererUserId;
	private long _decideReceiveUserId;
	private Date _decideAskDate;
	private long _decideDeadline;
	private Date _decideFinishDate;
	private String _decideDescription;
	private long _decideUserId;
	private Date _decideDate;
	private long _verifyStatus;
	private String _verifyDocNum;
	private Date _verifyDate;
	private long _verifyUserId;
	private String _verifyDescription;
	private long _isActive;
	private long _status;
	private long _createdId;
	private Date _createdDate;
	private long _modifieldId;
	private Date _modifieldDate;
}
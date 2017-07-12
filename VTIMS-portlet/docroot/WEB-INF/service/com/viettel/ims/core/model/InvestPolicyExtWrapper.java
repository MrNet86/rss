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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link InvestPolicyExt}.
 * </p>
 *
 * @author MrNet
 * @see InvestPolicyExt
 * @generated
 */
public class InvestPolicyExtWrapper implements InvestPolicyExt,
	ModelWrapper<InvestPolicyExt> {
	public InvestPolicyExtWrapper(InvestPolicyExt investPolicyExt) {
		_investPolicyExt = investPolicyExt;
	}

	@Override
	public Class<?> getModelClass() {
		return InvestPolicyExt.class;
	}

	@Override
	public String getModelClassName() {
		return InvestPolicyExt.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("investPolicyId", getInvestPolicyId());
		attributes.put("infoPolicyType", getInfoPolicyType());
		attributes.put("infoPolicyName", getInfoPolicyName());
		attributes.put("infoPolicyCode", getInfoPolicyCode());
		attributes.put("infoProposeGroupId", getInfoProposeGroupId());
		attributes.put("infoVerifyGroupId", getInfoVerifyGroupId());
		attributes.put("infoPolicyDate", getInfoPolicyDate());
		attributes.put("infoPolicyDeployDate", getInfoPolicyDeployDate());
		attributes.put("infoResponsibleUserId", getInfoResponsibleUserId());
		attributes.put("infoService", getInfoService());
		attributes.put("infoInvestTarget", getInfoInvestTarget());
		attributes.put("infoInvestLocation", getInfoInvestLocation());
		attributes.put("infoTechnique", getInfoTechnique());
		attributes.put("infoInvestName", getInfoInvestName());
		attributes.put("infoInvestDeadline", getInfoInvestDeadline());
		attributes.put("infoInvestCreateGroupId", getInfoInvestCreateGroupId());
		attributes.put("infoInvestDeployGroupId", getInfoInvestDeployGroupId());
		attributes.put("costCapital", getCostCapital());
		attributes.put("costCompensate", getCostCompensate());
		attributes.put("costCompensateForeign", getCostCompensateForeign());
		attributes.put("costEquiment", getCostEquiment());
		attributes.put("costEquimentForeign", getCostEquimentForeign());
		attributes.put("costContruction", getCostContruction());
		attributes.put("costContructionForeign", getCostContructionForeign());
		attributes.put("costAdvisory", getCostAdvisory());
		attributes.put("costAdvisoryForeign", getCostAdvisoryForeign());
		attributes.put("costManager", getCostManager());
		attributes.put("costManagerForeign", getCostManagerForeign());
		attributes.put("costOther", getCostOther());
		attributes.put("costOtherForeign", getCostOtherForeign());
		attributes.put("costProvide", getCostProvide());
		attributes.put("costProvideForeign", getCostProvideForeign());
		attributes.put("costLocal", getCostLocal());
		attributes.put("costForeign", getCostForeign());
		attributes.put("costForeignRate", getCostForeignRate());
		attributes.put("costTax", getCostTax());
		attributes.put("costTotalValue", getCostTotalValue());
		attributes.put("costTotalValueTax", getCostTotalValueTax());
		attributes.put("decideDelivererUserId", getDecideDelivererUserId());
		attributes.put("decideReceiveUserId", getDecideReceiveUserId());
		attributes.put("decideAskDate", getDecideAskDate());
		attributes.put("decideDeadline", getDecideDeadline());
		attributes.put("decideFinishDate", getDecideFinishDate());
		attributes.put("decideDescription", getDecideDescription());
		attributes.put("decideUserId", getDecideUserId());
		attributes.put("decideDate", getDecideDate());
		attributes.put("verifyStatus", getVerifyStatus());
		attributes.put("verifyDocNum", getVerifyDocNum());
		attributes.put("verifyDate", getVerifyDate());
		attributes.put("verifyUserId", getVerifyUserId());
		attributes.put("verifyDescription", getVerifyDescription());
		attributes.put("isActive", getIsActive());
		attributes.put("status", getStatus());
		attributes.put("createdId", getCreatedId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifieldId", getModifieldId());
		attributes.put("modifieldDate", getModifieldDate());
		attributes.put("infoPolicyTypeName", getInfoPolicyTypeName());
		attributes.put("infoProposeGroupName", getInfoProposeGroupName());
		attributes.put("infoVerifyGroupName", getInfoVerifyGroupName());
		attributes.put("infoResponsibleUserName", getInfoResponsibleUserName());
		attributes.put("infoInvestCreateGroupName",
			getInfoInvestCreateGroupName());
		attributes.put("infoInvestDeployGroupName",
			getInfoInvestDeployGroupName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long investPolicyId = (Long)attributes.get("investPolicyId");

		if (investPolicyId != null) {
			setInvestPolicyId(investPolicyId);
		}

		Long infoPolicyType = (Long)attributes.get("infoPolicyType");

		if (infoPolicyType != null) {
			setInfoPolicyType(infoPolicyType);
		}

		String infoPolicyName = (String)attributes.get("infoPolicyName");

		if (infoPolicyName != null) {
			setInfoPolicyName(infoPolicyName);
		}

		String infoPolicyCode = (String)attributes.get("infoPolicyCode");

		if (infoPolicyCode != null) {
			setInfoPolicyCode(infoPolicyCode);
		}

		Long infoProposeGroupId = (Long)attributes.get("infoProposeGroupId");

		if (infoProposeGroupId != null) {
			setInfoProposeGroupId(infoProposeGroupId);
		}

		Long infoVerifyGroupId = (Long)attributes.get("infoVerifyGroupId");

		if (infoVerifyGroupId != null) {
			setInfoVerifyGroupId(infoVerifyGroupId);
		}

		Date infoPolicyDate = (Date)attributes.get("infoPolicyDate");

		if (infoPolicyDate != null) {
			setInfoPolicyDate(infoPolicyDate);
		}

		Date infoPolicyDeployDate = (Date)attributes.get("infoPolicyDeployDate");

		if (infoPolicyDeployDate != null) {
			setInfoPolicyDeployDate(infoPolicyDeployDate);
		}

		Long infoResponsibleUserId = (Long)attributes.get(
				"infoResponsibleUserId");

		if (infoResponsibleUserId != null) {
			setInfoResponsibleUserId(infoResponsibleUserId);
		}

		String infoService = (String)attributes.get("infoService");

		if (infoService != null) {
			setInfoService(infoService);
		}

		String infoInvestTarget = (String)attributes.get("infoInvestTarget");

		if (infoInvestTarget != null) {
			setInfoInvestTarget(infoInvestTarget);
		}

		String infoInvestLocation = (String)attributes.get("infoInvestLocation");

		if (infoInvestLocation != null) {
			setInfoInvestLocation(infoInvestLocation);
		}

		String infoTechnique = (String)attributes.get("infoTechnique");

		if (infoTechnique != null) {
			setInfoTechnique(infoTechnique);
		}

		String infoInvestName = (String)attributes.get("infoInvestName");

		if (infoInvestName != null) {
			setInfoInvestName(infoInvestName);
		}

		Long infoInvestDeadline = (Long)attributes.get("infoInvestDeadline");

		if (infoInvestDeadline != null) {
			setInfoInvestDeadline(infoInvestDeadline);
		}

		Long infoInvestCreateGroupId = (Long)attributes.get(
				"infoInvestCreateGroupId");

		if (infoInvestCreateGroupId != null) {
			setInfoInvestCreateGroupId(infoInvestCreateGroupId);
		}

		Long infoInvestDeployGroupId = (Long)attributes.get(
				"infoInvestDeployGroupId");

		if (infoInvestDeployGroupId != null) {
			setInfoInvestDeployGroupId(infoInvestDeployGroupId);
		}

		Long costCapital = (Long)attributes.get("costCapital");

		if (costCapital != null) {
			setCostCapital(costCapital);
		}

		Double costCompensate = (Double)attributes.get("costCompensate");

		if (costCompensate != null) {
			setCostCompensate(costCompensate);
		}

		Double costCompensateForeign = (Double)attributes.get(
				"costCompensateForeign");

		if (costCompensateForeign != null) {
			setCostCompensateForeign(costCompensateForeign);
		}

		Double costEquiment = (Double)attributes.get("costEquiment");

		if (costEquiment != null) {
			setCostEquiment(costEquiment);
		}

		Double costEquimentForeign = (Double)attributes.get(
				"costEquimentForeign");

		if (costEquimentForeign != null) {
			setCostEquimentForeign(costEquimentForeign);
		}

		Double costContruction = (Double)attributes.get("costContruction");

		if (costContruction != null) {
			setCostContruction(costContruction);
		}

		Double costContructionForeign = (Double)attributes.get(
				"costContructionForeign");

		if (costContructionForeign != null) {
			setCostContructionForeign(costContructionForeign);
		}

		Double costAdvisory = (Double)attributes.get("costAdvisory");

		if (costAdvisory != null) {
			setCostAdvisory(costAdvisory);
		}

		Double costAdvisoryForeign = (Double)attributes.get(
				"costAdvisoryForeign");

		if (costAdvisoryForeign != null) {
			setCostAdvisoryForeign(costAdvisoryForeign);
		}

		Double costManager = (Double)attributes.get("costManager");

		if (costManager != null) {
			setCostManager(costManager);
		}

		Double costManagerForeign = (Double)attributes.get("costManagerForeign");

		if (costManagerForeign != null) {
			setCostManagerForeign(costManagerForeign);
		}

		Double costOther = (Double)attributes.get("costOther");

		if (costOther != null) {
			setCostOther(costOther);
		}

		Double costOtherForeign = (Double)attributes.get("costOtherForeign");

		if (costOtherForeign != null) {
			setCostOtherForeign(costOtherForeign);
		}

		Double costProvide = (Double)attributes.get("costProvide");

		if (costProvide != null) {
			setCostProvide(costProvide);
		}

		Double costProvideForeign = (Double)attributes.get("costProvideForeign");

		if (costProvideForeign != null) {
			setCostProvideForeign(costProvideForeign);
		}

		Double costLocal = (Double)attributes.get("costLocal");

		if (costLocal != null) {
			setCostLocal(costLocal);
		}

		Double costForeign = (Double)attributes.get("costForeign");

		if (costForeign != null) {
			setCostForeign(costForeign);
		}

		Double costForeignRate = (Double)attributes.get("costForeignRate");

		if (costForeignRate != null) {
			setCostForeignRate(costForeignRate);
		}

		Double costTax = (Double)attributes.get("costTax");

		if (costTax != null) {
			setCostTax(costTax);
		}

		Double costTotalValue = (Double)attributes.get("costTotalValue");

		if (costTotalValue != null) {
			setCostTotalValue(costTotalValue);
		}

		Double costTotalValueTax = (Double)attributes.get("costTotalValueTax");

		if (costTotalValueTax != null) {
			setCostTotalValueTax(costTotalValueTax);
		}

		Long decideDelivererUserId = (Long)attributes.get(
				"decideDelivererUserId");

		if (decideDelivererUserId != null) {
			setDecideDelivererUserId(decideDelivererUserId);
		}

		Long decideReceiveUserId = (Long)attributes.get("decideReceiveUserId");

		if (decideReceiveUserId != null) {
			setDecideReceiveUserId(decideReceiveUserId);
		}

		Date decideAskDate = (Date)attributes.get("decideAskDate");

		if (decideAskDate != null) {
			setDecideAskDate(decideAskDate);
		}

		Long decideDeadline = (Long)attributes.get("decideDeadline");

		if (decideDeadline != null) {
			setDecideDeadline(decideDeadline);
		}

		Date decideFinishDate = (Date)attributes.get("decideFinishDate");

		if (decideFinishDate != null) {
			setDecideFinishDate(decideFinishDate);
		}

		String decideDescription = (String)attributes.get("decideDescription");

		if (decideDescription != null) {
			setDecideDescription(decideDescription);
		}

		Long decideUserId = (Long)attributes.get("decideUserId");

		if (decideUserId != null) {
			setDecideUserId(decideUserId);
		}

		Date decideDate = (Date)attributes.get("decideDate");

		if (decideDate != null) {
			setDecideDate(decideDate);
		}

		Long verifyStatus = (Long)attributes.get("verifyStatus");

		if (verifyStatus != null) {
			setVerifyStatus(verifyStatus);
		}

		String verifyDocNum = (String)attributes.get("verifyDocNum");

		if (verifyDocNum != null) {
			setVerifyDocNum(verifyDocNum);
		}

		Date verifyDate = (Date)attributes.get("verifyDate");

		if (verifyDate != null) {
			setVerifyDate(verifyDate);
		}

		Long verifyUserId = (Long)attributes.get("verifyUserId");

		if (verifyUserId != null) {
			setVerifyUserId(verifyUserId);
		}

		String verifyDescription = (String)attributes.get("verifyDescription");

		if (verifyDescription != null) {
			setVerifyDescription(verifyDescription);
		}

		Long isActive = (Long)attributes.get("isActive");

		if (isActive != null) {
			setIsActive(isActive);
		}

		Long status = (Long)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long createdId = (Long)attributes.get("createdId");

		if (createdId != null) {
			setCreatedId(createdId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long modifieldId = (Long)attributes.get("modifieldId");

		if (modifieldId != null) {
			setModifieldId(modifieldId);
		}

		Date modifieldDate = (Date)attributes.get("modifieldDate");

		if (modifieldDate != null) {
			setModifieldDate(modifieldDate);
		}

		String infoPolicyTypeName = (String)attributes.get("infoPolicyTypeName");

		if (infoPolicyTypeName != null) {
			setInfoPolicyTypeName(infoPolicyTypeName);
		}

		String infoProposeGroupName = (String)attributes.get(
				"infoProposeGroupName");

		if (infoProposeGroupName != null) {
			setInfoProposeGroupName(infoProposeGroupName);
		}

		String infoVerifyGroupName = (String)attributes.get(
				"infoVerifyGroupName");

		if (infoVerifyGroupName != null) {
			setInfoVerifyGroupName(infoVerifyGroupName);
		}

		String infoResponsibleUserName = (String)attributes.get(
				"infoResponsibleUserName");

		if (infoResponsibleUserName != null) {
			setInfoResponsibleUserName(infoResponsibleUserName);
		}

		String infoInvestCreateGroupName = (String)attributes.get(
				"infoInvestCreateGroupName");

		if (infoInvestCreateGroupName != null) {
			setInfoInvestCreateGroupName(infoInvestCreateGroupName);
		}

		String infoInvestDeployGroupName = (String)attributes.get(
				"infoInvestDeployGroupName");

		if (infoInvestDeployGroupName != null) {
			setInfoInvestDeployGroupName(infoInvestDeployGroupName);
		}
	}

	/**
	* Returns the primary key of this invest policy ext.
	*
	* @return the primary key of this invest policy ext
	*/
	@Override
	public long getPrimaryKey() {
		return _investPolicyExt.getPrimaryKey();
	}

	/**
	* Sets the primary key of this invest policy ext.
	*
	* @param primaryKey the primary key of this invest policy ext
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_investPolicyExt.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the invest policy ID of this invest policy ext.
	*
	* @return the invest policy ID of this invest policy ext
	*/
	@Override
	public long getInvestPolicyId() {
		return _investPolicyExt.getInvestPolicyId();
	}

	/**
	* Sets the invest policy ID of this invest policy ext.
	*
	* @param investPolicyId the invest policy ID of this invest policy ext
	*/
	@Override
	public void setInvestPolicyId(long investPolicyId) {
		_investPolicyExt.setInvestPolicyId(investPolicyId);
	}

	/**
	* Returns the info policy type of this invest policy ext.
	*
	* @return the info policy type of this invest policy ext
	*/
	@Override
	public long getInfoPolicyType() {
		return _investPolicyExt.getInfoPolicyType();
	}

	/**
	* Sets the info policy type of this invest policy ext.
	*
	* @param infoPolicyType the info policy type of this invest policy ext
	*/
	@Override
	public void setInfoPolicyType(long infoPolicyType) {
		_investPolicyExt.setInfoPolicyType(infoPolicyType);
	}

	/**
	* Returns the info policy name of this invest policy ext.
	*
	* @return the info policy name of this invest policy ext
	*/
	@Override
	public java.lang.String getInfoPolicyName() {
		return _investPolicyExt.getInfoPolicyName();
	}

	/**
	* Sets the info policy name of this invest policy ext.
	*
	* @param infoPolicyName the info policy name of this invest policy ext
	*/
	@Override
	public void setInfoPolicyName(java.lang.String infoPolicyName) {
		_investPolicyExt.setInfoPolicyName(infoPolicyName);
	}

	/**
	* Returns the info policy code of this invest policy ext.
	*
	* @return the info policy code of this invest policy ext
	*/
	@Override
	public java.lang.String getInfoPolicyCode() {
		return _investPolicyExt.getInfoPolicyCode();
	}

	/**
	* Sets the info policy code of this invest policy ext.
	*
	* @param infoPolicyCode the info policy code of this invest policy ext
	*/
	@Override
	public void setInfoPolicyCode(java.lang.String infoPolicyCode) {
		_investPolicyExt.setInfoPolicyCode(infoPolicyCode);
	}

	/**
	* Returns the info propose group ID of this invest policy ext.
	*
	* @return the info propose group ID of this invest policy ext
	*/
	@Override
	public long getInfoProposeGroupId() {
		return _investPolicyExt.getInfoProposeGroupId();
	}

	/**
	* Sets the info propose group ID of this invest policy ext.
	*
	* @param infoProposeGroupId the info propose group ID of this invest policy ext
	*/
	@Override
	public void setInfoProposeGroupId(long infoProposeGroupId) {
		_investPolicyExt.setInfoProposeGroupId(infoProposeGroupId);
	}

	/**
	* Returns the info verify group ID of this invest policy ext.
	*
	* @return the info verify group ID of this invest policy ext
	*/
	@Override
	public long getInfoVerifyGroupId() {
		return _investPolicyExt.getInfoVerifyGroupId();
	}

	/**
	* Sets the info verify group ID of this invest policy ext.
	*
	* @param infoVerifyGroupId the info verify group ID of this invest policy ext
	*/
	@Override
	public void setInfoVerifyGroupId(long infoVerifyGroupId) {
		_investPolicyExt.setInfoVerifyGroupId(infoVerifyGroupId);
	}

	/**
	* Returns the info policy date of this invest policy ext.
	*
	* @return the info policy date of this invest policy ext
	*/
	@Override
	public java.util.Date getInfoPolicyDate() {
		return _investPolicyExt.getInfoPolicyDate();
	}

	/**
	* Sets the info policy date of this invest policy ext.
	*
	* @param infoPolicyDate the info policy date of this invest policy ext
	*/
	@Override
	public void setInfoPolicyDate(java.util.Date infoPolicyDate) {
		_investPolicyExt.setInfoPolicyDate(infoPolicyDate);
	}

	/**
	* Returns the info policy deploy date of this invest policy ext.
	*
	* @return the info policy deploy date of this invest policy ext
	*/
	@Override
	public java.util.Date getInfoPolicyDeployDate() {
		return _investPolicyExt.getInfoPolicyDeployDate();
	}

	/**
	* Sets the info policy deploy date of this invest policy ext.
	*
	* @param infoPolicyDeployDate the info policy deploy date of this invest policy ext
	*/
	@Override
	public void setInfoPolicyDeployDate(java.util.Date infoPolicyDeployDate) {
		_investPolicyExt.setInfoPolicyDeployDate(infoPolicyDeployDate);
	}

	/**
	* Returns the info responsible user ID of this invest policy ext.
	*
	* @return the info responsible user ID of this invest policy ext
	*/
	@Override
	public long getInfoResponsibleUserId() {
		return _investPolicyExt.getInfoResponsibleUserId();
	}

	/**
	* Sets the info responsible user ID of this invest policy ext.
	*
	* @param infoResponsibleUserId the info responsible user ID of this invest policy ext
	*/
	@Override
	public void setInfoResponsibleUserId(long infoResponsibleUserId) {
		_investPolicyExt.setInfoResponsibleUserId(infoResponsibleUserId);
	}

	/**
	* Returns the info responsible user uuid of this invest policy ext.
	*
	* @return the info responsible user uuid of this invest policy ext
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getInfoResponsibleUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyExt.getInfoResponsibleUserUuid();
	}

	/**
	* Sets the info responsible user uuid of this invest policy ext.
	*
	* @param infoResponsibleUserUuid the info responsible user uuid of this invest policy ext
	*/
	@Override
	public void setInfoResponsibleUserUuid(
		java.lang.String infoResponsibleUserUuid) {
		_investPolicyExt.setInfoResponsibleUserUuid(infoResponsibleUserUuid);
	}

	/**
	* Returns the info service of this invest policy ext.
	*
	* @return the info service of this invest policy ext
	*/
	@Override
	public java.lang.String getInfoService() {
		return _investPolicyExt.getInfoService();
	}

	/**
	* Sets the info service of this invest policy ext.
	*
	* @param infoService the info service of this invest policy ext
	*/
	@Override
	public void setInfoService(java.lang.String infoService) {
		_investPolicyExt.setInfoService(infoService);
	}

	/**
	* Returns the info invest target of this invest policy ext.
	*
	* @return the info invest target of this invest policy ext
	*/
	@Override
	public java.lang.String getInfoInvestTarget() {
		return _investPolicyExt.getInfoInvestTarget();
	}

	/**
	* Sets the info invest target of this invest policy ext.
	*
	* @param infoInvestTarget the info invest target of this invest policy ext
	*/
	@Override
	public void setInfoInvestTarget(java.lang.String infoInvestTarget) {
		_investPolicyExt.setInfoInvestTarget(infoInvestTarget);
	}

	/**
	* Returns the info invest location of this invest policy ext.
	*
	* @return the info invest location of this invest policy ext
	*/
	@Override
	public java.lang.String getInfoInvestLocation() {
		return _investPolicyExt.getInfoInvestLocation();
	}

	/**
	* Sets the info invest location of this invest policy ext.
	*
	* @param infoInvestLocation the info invest location of this invest policy ext
	*/
	@Override
	public void setInfoInvestLocation(java.lang.String infoInvestLocation) {
		_investPolicyExt.setInfoInvestLocation(infoInvestLocation);
	}

	/**
	* Returns the info technique of this invest policy ext.
	*
	* @return the info technique of this invest policy ext
	*/
	@Override
	public java.lang.String getInfoTechnique() {
		return _investPolicyExt.getInfoTechnique();
	}

	/**
	* Sets the info technique of this invest policy ext.
	*
	* @param infoTechnique the info technique of this invest policy ext
	*/
	@Override
	public void setInfoTechnique(java.lang.String infoTechnique) {
		_investPolicyExt.setInfoTechnique(infoTechnique);
	}

	/**
	* Returns the info invest name of this invest policy ext.
	*
	* @return the info invest name of this invest policy ext
	*/
	@Override
	public java.lang.String getInfoInvestName() {
		return _investPolicyExt.getInfoInvestName();
	}

	/**
	* Sets the info invest name of this invest policy ext.
	*
	* @param infoInvestName the info invest name of this invest policy ext
	*/
	@Override
	public void setInfoInvestName(java.lang.String infoInvestName) {
		_investPolicyExt.setInfoInvestName(infoInvestName);
	}

	/**
	* Returns the info invest deadline of this invest policy ext.
	*
	* @return the info invest deadline of this invest policy ext
	*/
	@Override
	public long getInfoInvestDeadline() {
		return _investPolicyExt.getInfoInvestDeadline();
	}

	/**
	* Sets the info invest deadline of this invest policy ext.
	*
	* @param infoInvestDeadline the info invest deadline of this invest policy ext
	*/
	@Override
	public void setInfoInvestDeadline(long infoInvestDeadline) {
		_investPolicyExt.setInfoInvestDeadline(infoInvestDeadline);
	}

	/**
	* Returns the info invest create group ID of this invest policy ext.
	*
	* @return the info invest create group ID of this invest policy ext
	*/
	@Override
	public long getInfoInvestCreateGroupId() {
		return _investPolicyExt.getInfoInvestCreateGroupId();
	}

	/**
	* Sets the info invest create group ID of this invest policy ext.
	*
	* @param infoInvestCreateGroupId the info invest create group ID of this invest policy ext
	*/
	@Override
	public void setInfoInvestCreateGroupId(long infoInvestCreateGroupId) {
		_investPolicyExt.setInfoInvestCreateGroupId(infoInvestCreateGroupId);
	}

	/**
	* Returns the info invest deploy group ID of this invest policy ext.
	*
	* @return the info invest deploy group ID of this invest policy ext
	*/
	@Override
	public long getInfoInvestDeployGroupId() {
		return _investPolicyExt.getInfoInvestDeployGroupId();
	}

	/**
	* Sets the info invest deploy group ID of this invest policy ext.
	*
	* @param infoInvestDeployGroupId the info invest deploy group ID of this invest policy ext
	*/
	@Override
	public void setInfoInvestDeployGroupId(long infoInvestDeployGroupId) {
		_investPolicyExt.setInfoInvestDeployGroupId(infoInvestDeployGroupId);
	}

	/**
	* Returns the cost capital of this invest policy ext.
	*
	* @return the cost capital of this invest policy ext
	*/
	@Override
	public long getCostCapital() {
		return _investPolicyExt.getCostCapital();
	}

	/**
	* Sets the cost capital of this invest policy ext.
	*
	* @param costCapital the cost capital of this invest policy ext
	*/
	@Override
	public void setCostCapital(long costCapital) {
		_investPolicyExt.setCostCapital(costCapital);
	}

	/**
	* Returns the cost compensate of this invest policy ext.
	*
	* @return the cost compensate of this invest policy ext
	*/
	@Override
	public double getCostCompensate() {
		return _investPolicyExt.getCostCompensate();
	}

	/**
	* Sets the cost compensate of this invest policy ext.
	*
	* @param costCompensate the cost compensate of this invest policy ext
	*/
	@Override
	public void setCostCompensate(double costCompensate) {
		_investPolicyExt.setCostCompensate(costCompensate);
	}

	/**
	* Returns the cost compensate foreign of this invest policy ext.
	*
	* @return the cost compensate foreign of this invest policy ext
	*/
	@Override
	public double getCostCompensateForeign() {
		return _investPolicyExt.getCostCompensateForeign();
	}

	/**
	* Sets the cost compensate foreign of this invest policy ext.
	*
	* @param costCompensateForeign the cost compensate foreign of this invest policy ext
	*/
	@Override
	public void setCostCompensateForeign(double costCompensateForeign) {
		_investPolicyExt.setCostCompensateForeign(costCompensateForeign);
	}

	/**
	* Returns the cost equiment of this invest policy ext.
	*
	* @return the cost equiment of this invest policy ext
	*/
	@Override
	public double getCostEquiment() {
		return _investPolicyExt.getCostEquiment();
	}

	/**
	* Sets the cost equiment of this invest policy ext.
	*
	* @param costEquiment the cost equiment of this invest policy ext
	*/
	@Override
	public void setCostEquiment(double costEquiment) {
		_investPolicyExt.setCostEquiment(costEquiment);
	}

	/**
	* Returns the cost equiment foreign of this invest policy ext.
	*
	* @return the cost equiment foreign of this invest policy ext
	*/
	@Override
	public double getCostEquimentForeign() {
		return _investPolicyExt.getCostEquimentForeign();
	}

	/**
	* Sets the cost equiment foreign of this invest policy ext.
	*
	* @param costEquimentForeign the cost equiment foreign of this invest policy ext
	*/
	@Override
	public void setCostEquimentForeign(double costEquimentForeign) {
		_investPolicyExt.setCostEquimentForeign(costEquimentForeign);
	}

	/**
	* Returns the cost contruction of this invest policy ext.
	*
	* @return the cost contruction of this invest policy ext
	*/
	@Override
	public double getCostContruction() {
		return _investPolicyExt.getCostContruction();
	}

	/**
	* Sets the cost contruction of this invest policy ext.
	*
	* @param costContruction the cost contruction of this invest policy ext
	*/
	@Override
	public void setCostContruction(double costContruction) {
		_investPolicyExt.setCostContruction(costContruction);
	}

	/**
	* Returns the cost contruction foreign of this invest policy ext.
	*
	* @return the cost contruction foreign of this invest policy ext
	*/
	@Override
	public double getCostContructionForeign() {
		return _investPolicyExt.getCostContructionForeign();
	}

	/**
	* Sets the cost contruction foreign of this invest policy ext.
	*
	* @param costContructionForeign the cost contruction foreign of this invest policy ext
	*/
	@Override
	public void setCostContructionForeign(double costContructionForeign) {
		_investPolicyExt.setCostContructionForeign(costContructionForeign);
	}

	/**
	* Returns the cost advisory of this invest policy ext.
	*
	* @return the cost advisory of this invest policy ext
	*/
	@Override
	public double getCostAdvisory() {
		return _investPolicyExt.getCostAdvisory();
	}

	/**
	* Sets the cost advisory of this invest policy ext.
	*
	* @param costAdvisory the cost advisory of this invest policy ext
	*/
	@Override
	public void setCostAdvisory(double costAdvisory) {
		_investPolicyExt.setCostAdvisory(costAdvisory);
	}

	/**
	* Returns the cost advisory foreign of this invest policy ext.
	*
	* @return the cost advisory foreign of this invest policy ext
	*/
	@Override
	public double getCostAdvisoryForeign() {
		return _investPolicyExt.getCostAdvisoryForeign();
	}

	/**
	* Sets the cost advisory foreign of this invest policy ext.
	*
	* @param costAdvisoryForeign the cost advisory foreign of this invest policy ext
	*/
	@Override
	public void setCostAdvisoryForeign(double costAdvisoryForeign) {
		_investPolicyExt.setCostAdvisoryForeign(costAdvisoryForeign);
	}

	/**
	* Returns the cost manager of this invest policy ext.
	*
	* @return the cost manager of this invest policy ext
	*/
	@Override
	public double getCostManager() {
		return _investPolicyExt.getCostManager();
	}

	/**
	* Sets the cost manager of this invest policy ext.
	*
	* @param costManager the cost manager of this invest policy ext
	*/
	@Override
	public void setCostManager(double costManager) {
		_investPolicyExt.setCostManager(costManager);
	}

	/**
	* Returns the cost manager foreign of this invest policy ext.
	*
	* @return the cost manager foreign of this invest policy ext
	*/
	@Override
	public double getCostManagerForeign() {
		return _investPolicyExt.getCostManagerForeign();
	}

	/**
	* Sets the cost manager foreign of this invest policy ext.
	*
	* @param costManagerForeign the cost manager foreign of this invest policy ext
	*/
	@Override
	public void setCostManagerForeign(double costManagerForeign) {
		_investPolicyExt.setCostManagerForeign(costManagerForeign);
	}

	/**
	* Returns the cost other of this invest policy ext.
	*
	* @return the cost other of this invest policy ext
	*/
	@Override
	public double getCostOther() {
		return _investPolicyExt.getCostOther();
	}

	/**
	* Sets the cost other of this invest policy ext.
	*
	* @param costOther the cost other of this invest policy ext
	*/
	@Override
	public void setCostOther(double costOther) {
		_investPolicyExt.setCostOther(costOther);
	}

	/**
	* Returns the cost other foreign of this invest policy ext.
	*
	* @return the cost other foreign of this invest policy ext
	*/
	@Override
	public double getCostOtherForeign() {
		return _investPolicyExt.getCostOtherForeign();
	}

	/**
	* Sets the cost other foreign of this invest policy ext.
	*
	* @param costOtherForeign the cost other foreign of this invest policy ext
	*/
	@Override
	public void setCostOtherForeign(double costOtherForeign) {
		_investPolicyExt.setCostOtherForeign(costOtherForeign);
	}

	/**
	* Returns the cost provide of this invest policy ext.
	*
	* @return the cost provide of this invest policy ext
	*/
	@Override
	public double getCostProvide() {
		return _investPolicyExt.getCostProvide();
	}

	/**
	* Sets the cost provide of this invest policy ext.
	*
	* @param costProvide the cost provide of this invest policy ext
	*/
	@Override
	public void setCostProvide(double costProvide) {
		_investPolicyExt.setCostProvide(costProvide);
	}

	/**
	* Returns the cost provide foreign of this invest policy ext.
	*
	* @return the cost provide foreign of this invest policy ext
	*/
	@Override
	public double getCostProvideForeign() {
		return _investPolicyExt.getCostProvideForeign();
	}

	/**
	* Sets the cost provide foreign of this invest policy ext.
	*
	* @param costProvideForeign the cost provide foreign of this invest policy ext
	*/
	@Override
	public void setCostProvideForeign(double costProvideForeign) {
		_investPolicyExt.setCostProvideForeign(costProvideForeign);
	}

	/**
	* Returns the cost local of this invest policy ext.
	*
	* @return the cost local of this invest policy ext
	*/
	@Override
	public double getCostLocal() {
		return _investPolicyExt.getCostLocal();
	}

	/**
	* Sets the cost local of this invest policy ext.
	*
	* @param costLocal the cost local of this invest policy ext
	*/
	@Override
	public void setCostLocal(double costLocal) {
		_investPolicyExt.setCostLocal(costLocal);
	}

	/**
	* Returns the cost foreign of this invest policy ext.
	*
	* @return the cost foreign of this invest policy ext
	*/
	@Override
	public double getCostForeign() {
		return _investPolicyExt.getCostForeign();
	}

	/**
	* Sets the cost foreign of this invest policy ext.
	*
	* @param costForeign the cost foreign of this invest policy ext
	*/
	@Override
	public void setCostForeign(double costForeign) {
		_investPolicyExt.setCostForeign(costForeign);
	}

	/**
	* Returns the cost foreign rate of this invest policy ext.
	*
	* @return the cost foreign rate of this invest policy ext
	*/
	@Override
	public double getCostForeignRate() {
		return _investPolicyExt.getCostForeignRate();
	}

	/**
	* Sets the cost foreign rate of this invest policy ext.
	*
	* @param costForeignRate the cost foreign rate of this invest policy ext
	*/
	@Override
	public void setCostForeignRate(double costForeignRate) {
		_investPolicyExt.setCostForeignRate(costForeignRate);
	}

	/**
	* Returns the cost tax of this invest policy ext.
	*
	* @return the cost tax of this invest policy ext
	*/
	@Override
	public double getCostTax() {
		return _investPolicyExt.getCostTax();
	}

	/**
	* Sets the cost tax of this invest policy ext.
	*
	* @param costTax the cost tax of this invest policy ext
	*/
	@Override
	public void setCostTax(double costTax) {
		_investPolicyExt.setCostTax(costTax);
	}

	/**
	* Returns the cost total value of this invest policy ext.
	*
	* @return the cost total value of this invest policy ext
	*/
	@Override
	public double getCostTotalValue() {
		return _investPolicyExt.getCostTotalValue();
	}

	/**
	* Sets the cost total value of this invest policy ext.
	*
	* @param costTotalValue the cost total value of this invest policy ext
	*/
	@Override
	public void setCostTotalValue(double costTotalValue) {
		_investPolicyExt.setCostTotalValue(costTotalValue);
	}

	/**
	* Returns the cost total value tax of this invest policy ext.
	*
	* @return the cost total value tax of this invest policy ext
	*/
	@Override
	public double getCostTotalValueTax() {
		return _investPolicyExt.getCostTotalValueTax();
	}

	/**
	* Sets the cost total value tax of this invest policy ext.
	*
	* @param costTotalValueTax the cost total value tax of this invest policy ext
	*/
	@Override
	public void setCostTotalValueTax(double costTotalValueTax) {
		_investPolicyExt.setCostTotalValueTax(costTotalValueTax);
	}

	/**
	* Returns the decide deliverer user ID of this invest policy ext.
	*
	* @return the decide deliverer user ID of this invest policy ext
	*/
	@Override
	public long getDecideDelivererUserId() {
		return _investPolicyExt.getDecideDelivererUserId();
	}

	/**
	* Sets the decide deliverer user ID of this invest policy ext.
	*
	* @param decideDelivererUserId the decide deliverer user ID of this invest policy ext
	*/
	@Override
	public void setDecideDelivererUserId(long decideDelivererUserId) {
		_investPolicyExt.setDecideDelivererUserId(decideDelivererUserId);
	}

	/**
	* Returns the decide deliverer user uuid of this invest policy ext.
	*
	* @return the decide deliverer user uuid of this invest policy ext
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getDecideDelivererUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyExt.getDecideDelivererUserUuid();
	}

	/**
	* Sets the decide deliverer user uuid of this invest policy ext.
	*
	* @param decideDelivererUserUuid the decide deliverer user uuid of this invest policy ext
	*/
	@Override
	public void setDecideDelivererUserUuid(
		java.lang.String decideDelivererUserUuid) {
		_investPolicyExt.setDecideDelivererUserUuid(decideDelivererUserUuid);
	}

	/**
	* Returns the decide receive user ID of this invest policy ext.
	*
	* @return the decide receive user ID of this invest policy ext
	*/
	@Override
	public long getDecideReceiveUserId() {
		return _investPolicyExt.getDecideReceiveUserId();
	}

	/**
	* Sets the decide receive user ID of this invest policy ext.
	*
	* @param decideReceiveUserId the decide receive user ID of this invest policy ext
	*/
	@Override
	public void setDecideReceiveUserId(long decideReceiveUserId) {
		_investPolicyExt.setDecideReceiveUserId(decideReceiveUserId);
	}

	/**
	* Returns the decide receive user uuid of this invest policy ext.
	*
	* @return the decide receive user uuid of this invest policy ext
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getDecideReceiveUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyExt.getDecideReceiveUserUuid();
	}

	/**
	* Sets the decide receive user uuid of this invest policy ext.
	*
	* @param decideReceiveUserUuid the decide receive user uuid of this invest policy ext
	*/
	@Override
	public void setDecideReceiveUserUuid(java.lang.String decideReceiveUserUuid) {
		_investPolicyExt.setDecideReceiveUserUuid(decideReceiveUserUuid);
	}

	/**
	* Returns the decide ask date of this invest policy ext.
	*
	* @return the decide ask date of this invest policy ext
	*/
	@Override
	public java.util.Date getDecideAskDate() {
		return _investPolicyExt.getDecideAskDate();
	}

	/**
	* Sets the decide ask date of this invest policy ext.
	*
	* @param decideAskDate the decide ask date of this invest policy ext
	*/
	@Override
	public void setDecideAskDate(java.util.Date decideAskDate) {
		_investPolicyExt.setDecideAskDate(decideAskDate);
	}

	/**
	* Returns the decide deadline of this invest policy ext.
	*
	* @return the decide deadline of this invest policy ext
	*/
	@Override
	public long getDecideDeadline() {
		return _investPolicyExt.getDecideDeadline();
	}

	/**
	* Sets the decide deadline of this invest policy ext.
	*
	* @param decideDeadline the decide deadline of this invest policy ext
	*/
	@Override
	public void setDecideDeadline(long decideDeadline) {
		_investPolicyExt.setDecideDeadline(decideDeadline);
	}

	/**
	* Returns the decide finish date of this invest policy ext.
	*
	* @return the decide finish date of this invest policy ext
	*/
	@Override
	public java.util.Date getDecideFinishDate() {
		return _investPolicyExt.getDecideFinishDate();
	}

	/**
	* Sets the decide finish date of this invest policy ext.
	*
	* @param decideFinishDate the decide finish date of this invest policy ext
	*/
	@Override
	public void setDecideFinishDate(java.util.Date decideFinishDate) {
		_investPolicyExt.setDecideFinishDate(decideFinishDate);
	}

	/**
	* Returns the decide description of this invest policy ext.
	*
	* @return the decide description of this invest policy ext
	*/
	@Override
	public java.lang.String getDecideDescription() {
		return _investPolicyExt.getDecideDescription();
	}

	/**
	* Sets the decide description of this invest policy ext.
	*
	* @param decideDescription the decide description of this invest policy ext
	*/
	@Override
	public void setDecideDescription(java.lang.String decideDescription) {
		_investPolicyExt.setDecideDescription(decideDescription);
	}

	/**
	* Returns the decide user ID of this invest policy ext.
	*
	* @return the decide user ID of this invest policy ext
	*/
	@Override
	public long getDecideUserId() {
		return _investPolicyExt.getDecideUserId();
	}

	/**
	* Sets the decide user ID of this invest policy ext.
	*
	* @param decideUserId the decide user ID of this invest policy ext
	*/
	@Override
	public void setDecideUserId(long decideUserId) {
		_investPolicyExt.setDecideUserId(decideUserId);
	}

	/**
	* Returns the decide user uuid of this invest policy ext.
	*
	* @return the decide user uuid of this invest policy ext
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getDecideUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyExt.getDecideUserUuid();
	}

	/**
	* Sets the decide user uuid of this invest policy ext.
	*
	* @param decideUserUuid the decide user uuid of this invest policy ext
	*/
	@Override
	public void setDecideUserUuid(java.lang.String decideUserUuid) {
		_investPolicyExt.setDecideUserUuid(decideUserUuid);
	}

	/**
	* Returns the decide date of this invest policy ext.
	*
	* @return the decide date of this invest policy ext
	*/
	@Override
	public java.util.Date getDecideDate() {
		return _investPolicyExt.getDecideDate();
	}

	/**
	* Sets the decide date of this invest policy ext.
	*
	* @param decideDate the decide date of this invest policy ext
	*/
	@Override
	public void setDecideDate(java.util.Date decideDate) {
		_investPolicyExt.setDecideDate(decideDate);
	}

	/**
	* Returns the verify status of this invest policy ext.
	*
	* @return the verify status of this invest policy ext
	*/
	@Override
	public long getVerifyStatus() {
		return _investPolicyExt.getVerifyStatus();
	}

	/**
	* Sets the verify status of this invest policy ext.
	*
	* @param verifyStatus the verify status of this invest policy ext
	*/
	@Override
	public void setVerifyStatus(long verifyStatus) {
		_investPolicyExt.setVerifyStatus(verifyStatus);
	}

	/**
	* Returns the verify doc num of this invest policy ext.
	*
	* @return the verify doc num of this invest policy ext
	*/
	@Override
	public java.lang.String getVerifyDocNum() {
		return _investPolicyExt.getVerifyDocNum();
	}

	/**
	* Sets the verify doc num of this invest policy ext.
	*
	* @param verifyDocNum the verify doc num of this invest policy ext
	*/
	@Override
	public void setVerifyDocNum(java.lang.String verifyDocNum) {
		_investPolicyExt.setVerifyDocNum(verifyDocNum);
	}

	/**
	* Returns the verify date of this invest policy ext.
	*
	* @return the verify date of this invest policy ext
	*/
	@Override
	public java.util.Date getVerifyDate() {
		return _investPolicyExt.getVerifyDate();
	}

	/**
	* Sets the verify date of this invest policy ext.
	*
	* @param verifyDate the verify date of this invest policy ext
	*/
	@Override
	public void setVerifyDate(java.util.Date verifyDate) {
		_investPolicyExt.setVerifyDate(verifyDate);
	}

	/**
	* Returns the verify user ID of this invest policy ext.
	*
	* @return the verify user ID of this invest policy ext
	*/
	@Override
	public long getVerifyUserId() {
		return _investPolicyExt.getVerifyUserId();
	}

	/**
	* Sets the verify user ID of this invest policy ext.
	*
	* @param verifyUserId the verify user ID of this invest policy ext
	*/
	@Override
	public void setVerifyUserId(long verifyUserId) {
		_investPolicyExt.setVerifyUserId(verifyUserId);
	}

	/**
	* Returns the verify user uuid of this invest policy ext.
	*
	* @return the verify user uuid of this invest policy ext
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getVerifyUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyExt.getVerifyUserUuid();
	}

	/**
	* Sets the verify user uuid of this invest policy ext.
	*
	* @param verifyUserUuid the verify user uuid of this invest policy ext
	*/
	@Override
	public void setVerifyUserUuid(java.lang.String verifyUserUuid) {
		_investPolicyExt.setVerifyUserUuid(verifyUserUuid);
	}

	/**
	* Returns the verify description of this invest policy ext.
	*
	* @return the verify description of this invest policy ext
	*/
	@Override
	public java.lang.String getVerifyDescription() {
		return _investPolicyExt.getVerifyDescription();
	}

	/**
	* Sets the verify description of this invest policy ext.
	*
	* @param verifyDescription the verify description of this invest policy ext
	*/
	@Override
	public void setVerifyDescription(java.lang.String verifyDescription) {
		_investPolicyExt.setVerifyDescription(verifyDescription);
	}

	/**
	* Returns the is active of this invest policy ext.
	*
	* @return the is active of this invest policy ext
	*/
	@Override
	public long getIsActive() {
		return _investPolicyExt.getIsActive();
	}

	/**
	* Sets the is active of this invest policy ext.
	*
	* @param isActive the is active of this invest policy ext
	*/
	@Override
	public void setIsActive(long isActive) {
		_investPolicyExt.setIsActive(isActive);
	}

	/**
	* Returns the status of this invest policy ext.
	*
	* @return the status of this invest policy ext
	*/
	@Override
	public long getStatus() {
		return _investPolicyExt.getStatus();
	}

	/**
	* Sets the status of this invest policy ext.
	*
	* @param status the status of this invest policy ext
	*/
	@Override
	public void setStatus(long status) {
		_investPolicyExt.setStatus(status);
	}

	/**
	* Returns the created ID of this invest policy ext.
	*
	* @return the created ID of this invest policy ext
	*/
	@Override
	public long getCreatedId() {
		return _investPolicyExt.getCreatedId();
	}

	/**
	* Sets the created ID of this invest policy ext.
	*
	* @param createdId the created ID of this invest policy ext
	*/
	@Override
	public void setCreatedId(long createdId) {
		_investPolicyExt.setCreatedId(createdId);
	}

	/**
	* Returns the created date of this invest policy ext.
	*
	* @return the created date of this invest policy ext
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _investPolicyExt.getCreatedDate();
	}

	/**
	* Sets the created date of this invest policy ext.
	*
	* @param createdDate the created date of this invest policy ext
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_investPolicyExt.setCreatedDate(createdDate);
	}

	/**
	* Returns the modifield ID of this invest policy ext.
	*
	* @return the modifield ID of this invest policy ext
	*/
	@Override
	public long getModifieldId() {
		return _investPolicyExt.getModifieldId();
	}

	/**
	* Sets the modifield ID of this invest policy ext.
	*
	* @param modifieldId the modifield ID of this invest policy ext
	*/
	@Override
	public void setModifieldId(long modifieldId) {
		_investPolicyExt.setModifieldId(modifieldId);
	}

	/**
	* Returns the modifield date of this invest policy ext.
	*
	* @return the modifield date of this invest policy ext
	*/
	@Override
	public java.util.Date getModifieldDate() {
		return _investPolicyExt.getModifieldDate();
	}

	/**
	* Sets the modifield date of this invest policy ext.
	*
	* @param modifieldDate the modifield date of this invest policy ext
	*/
	@Override
	public void setModifieldDate(java.util.Date modifieldDate) {
		_investPolicyExt.setModifieldDate(modifieldDate);
	}

	/**
	* Returns the info policy type name of this invest policy ext.
	*
	* @return the info policy type name of this invest policy ext
	*/
	@Override
	public java.lang.String getInfoPolicyTypeName() {
		return _investPolicyExt.getInfoPolicyTypeName();
	}

	/**
	* Sets the info policy type name of this invest policy ext.
	*
	* @param infoPolicyTypeName the info policy type name of this invest policy ext
	*/
	@Override
	public void setInfoPolicyTypeName(java.lang.String infoPolicyTypeName) {
		_investPolicyExt.setInfoPolicyTypeName(infoPolicyTypeName);
	}

	/**
	* Returns the info propose group name of this invest policy ext.
	*
	* @return the info propose group name of this invest policy ext
	*/
	@Override
	public java.lang.String getInfoProposeGroupName() {
		return _investPolicyExt.getInfoProposeGroupName();
	}

	/**
	* Sets the info propose group name of this invest policy ext.
	*
	* @param infoProposeGroupName the info propose group name of this invest policy ext
	*/
	@Override
	public void setInfoProposeGroupName(java.lang.String infoProposeGroupName) {
		_investPolicyExt.setInfoProposeGroupName(infoProposeGroupName);
	}

	/**
	* Returns the info verify group name of this invest policy ext.
	*
	* @return the info verify group name of this invest policy ext
	*/
	@Override
	public java.lang.String getInfoVerifyGroupName() {
		return _investPolicyExt.getInfoVerifyGroupName();
	}

	/**
	* Sets the info verify group name of this invest policy ext.
	*
	* @param infoVerifyGroupName the info verify group name of this invest policy ext
	*/
	@Override
	public void setInfoVerifyGroupName(java.lang.String infoVerifyGroupName) {
		_investPolicyExt.setInfoVerifyGroupName(infoVerifyGroupName);
	}

	/**
	* Returns the info responsible user name of this invest policy ext.
	*
	* @return the info responsible user name of this invest policy ext
	*/
	@Override
	public java.lang.String getInfoResponsibleUserName() {
		return _investPolicyExt.getInfoResponsibleUserName();
	}

	/**
	* Sets the info responsible user name of this invest policy ext.
	*
	* @param infoResponsibleUserName the info responsible user name of this invest policy ext
	*/
	@Override
	public void setInfoResponsibleUserName(
		java.lang.String infoResponsibleUserName) {
		_investPolicyExt.setInfoResponsibleUserName(infoResponsibleUserName);
	}

	/**
	* Returns the info invest create group name of this invest policy ext.
	*
	* @return the info invest create group name of this invest policy ext
	*/
	@Override
	public java.lang.String getInfoInvestCreateGroupName() {
		return _investPolicyExt.getInfoInvestCreateGroupName();
	}

	/**
	* Sets the info invest create group name of this invest policy ext.
	*
	* @param infoInvestCreateGroupName the info invest create group name of this invest policy ext
	*/
	@Override
	public void setInfoInvestCreateGroupName(
		java.lang.String infoInvestCreateGroupName) {
		_investPolicyExt.setInfoInvestCreateGroupName(infoInvestCreateGroupName);
	}

	/**
	* Returns the info invest deploy group name of this invest policy ext.
	*
	* @return the info invest deploy group name of this invest policy ext
	*/
	@Override
	public java.lang.String getInfoInvestDeployGroupName() {
		return _investPolicyExt.getInfoInvestDeployGroupName();
	}

	/**
	* Sets the info invest deploy group name of this invest policy ext.
	*
	* @param infoInvestDeployGroupName the info invest deploy group name of this invest policy ext
	*/
	@Override
	public void setInfoInvestDeployGroupName(
		java.lang.String infoInvestDeployGroupName) {
		_investPolicyExt.setInfoInvestDeployGroupName(infoInvestDeployGroupName);
	}

	@Override
	public boolean isNew() {
		return _investPolicyExt.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_investPolicyExt.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _investPolicyExt.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_investPolicyExt.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _investPolicyExt.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _investPolicyExt.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_investPolicyExt.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _investPolicyExt.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_investPolicyExt.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_investPolicyExt.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_investPolicyExt.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InvestPolicyExtWrapper((InvestPolicyExt)_investPolicyExt.clone());
	}

	@Override
	public int compareTo(
		com.viettel.ims.core.model.InvestPolicyExt investPolicyExt) {
		return _investPolicyExt.compareTo(investPolicyExt);
	}

	@Override
	public int hashCode() {
		return _investPolicyExt.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.viettel.ims.core.model.InvestPolicyExt> toCacheModel() {
		return _investPolicyExt.toCacheModel();
	}

	@Override
	public com.viettel.ims.core.model.InvestPolicyExt toEscapedModel() {
		return new InvestPolicyExtWrapper(_investPolicyExt.toEscapedModel());
	}

	@Override
	public com.viettel.ims.core.model.InvestPolicyExt toUnescapedModel() {
		return new InvestPolicyExtWrapper(_investPolicyExt.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _investPolicyExt.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _investPolicyExt.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_investPolicyExt.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InvestPolicyExtWrapper)) {
			return false;
		}

		InvestPolicyExtWrapper investPolicyExtWrapper = (InvestPolicyExtWrapper)obj;

		if (Validator.equals(_investPolicyExt,
					investPolicyExtWrapper._investPolicyExt)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public InvestPolicyExt getWrappedInvestPolicyExt() {
		return _investPolicyExt;
	}

	@Override
	public InvestPolicyExt getWrappedModel() {
		return _investPolicyExt;
	}

	@Override
	public void resetOriginalValues() {
		_investPolicyExt.resetOriginalValues();
	}

	private InvestPolicyExt _investPolicyExt;
}
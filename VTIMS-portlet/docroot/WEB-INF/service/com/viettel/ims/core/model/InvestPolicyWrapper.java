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
 * This class is a wrapper for {@link InvestPolicy}.
 * </p>
 *
 * @author MrNet
 * @see InvestPolicy
 * @generated
 */
public class InvestPolicyWrapper implements InvestPolicy,
	ModelWrapper<InvestPolicy> {
	public InvestPolicyWrapper(InvestPolicy investPolicy) {
		_investPolicy = investPolicy;
	}

	@Override
	public Class<?> getModelClass() {
		return InvestPolicy.class;
	}

	@Override
	public String getModelClassName() {
		return InvestPolicy.class.getName();
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
	}

	/**
	* Returns the primary key of this invest policy.
	*
	* @return the primary key of this invest policy
	*/
	@Override
	public long getPrimaryKey() {
		return _investPolicy.getPrimaryKey();
	}

	/**
	* Sets the primary key of this invest policy.
	*
	* @param primaryKey the primary key of this invest policy
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_investPolicy.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the invest policy ID of this invest policy.
	*
	* @return the invest policy ID of this invest policy
	*/
	@Override
	public long getInvestPolicyId() {
		return _investPolicy.getInvestPolicyId();
	}

	/**
	* Sets the invest policy ID of this invest policy.
	*
	* @param investPolicyId the invest policy ID of this invest policy
	*/
	@Override
	public void setInvestPolicyId(long investPolicyId) {
		_investPolicy.setInvestPolicyId(investPolicyId);
	}

	/**
	* Returns the info policy type of this invest policy.
	*
	* @return the info policy type of this invest policy
	*/
	@Override
	public long getInfoPolicyType() {
		return _investPolicy.getInfoPolicyType();
	}

	/**
	* Sets the info policy type of this invest policy.
	*
	* @param infoPolicyType the info policy type of this invest policy
	*/
	@Override
	public void setInfoPolicyType(long infoPolicyType) {
		_investPolicy.setInfoPolicyType(infoPolicyType);
	}

	/**
	* Returns the info policy name of this invest policy.
	*
	* @return the info policy name of this invest policy
	*/
	@Override
	public java.lang.String getInfoPolicyName() {
		return _investPolicy.getInfoPolicyName();
	}

	/**
	* Sets the info policy name of this invest policy.
	*
	* @param infoPolicyName the info policy name of this invest policy
	*/
	@Override
	public void setInfoPolicyName(java.lang.String infoPolicyName) {
		_investPolicy.setInfoPolicyName(infoPolicyName);
	}

	/**
	* Returns the info policy code of this invest policy.
	*
	* @return the info policy code of this invest policy
	*/
	@Override
	public java.lang.String getInfoPolicyCode() {
		return _investPolicy.getInfoPolicyCode();
	}

	/**
	* Sets the info policy code of this invest policy.
	*
	* @param infoPolicyCode the info policy code of this invest policy
	*/
	@Override
	public void setInfoPolicyCode(java.lang.String infoPolicyCode) {
		_investPolicy.setInfoPolicyCode(infoPolicyCode);
	}

	/**
	* Returns the info propose group ID of this invest policy.
	*
	* @return the info propose group ID of this invest policy
	*/
	@Override
	public long getInfoProposeGroupId() {
		return _investPolicy.getInfoProposeGroupId();
	}

	/**
	* Sets the info propose group ID of this invest policy.
	*
	* @param infoProposeGroupId the info propose group ID of this invest policy
	*/
	@Override
	public void setInfoProposeGroupId(long infoProposeGroupId) {
		_investPolicy.setInfoProposeGroupId(infoProposeGroupId);
	}

	/**
	* Returns the info verify group ID of this invest policy.
	*
	* @return the info verify group ID of this invest policy
	*/
	@Override
	public long getInfoVerifyGroupId() {
		return _investPolicy.getInfoVerifyGroupId();
	}

	/**
	* Sets the info verify group ID of this invest policy.
	*
	* @param infoVerifyGroupId the info verify group ID of this invest policy
	*/
	@Override
	public void setInfoVerifyGroupId(long infoVerifyGroupId) {
		_investPolicy.setInfoVerifyGroupId(infoVerifyGroupId);
	}

	/**
	* Returns the info policy date of this invest policy.
	*
	* @return the info policy date of this invest policy
	*/
	@Override
	public java.util.Date getInfoPolicyDate() {
		return _investPolicy.getInfoPolicyDate();
	}

	/**
	* Sets the info policy date of this invest policy.
	*
	* @param infoPolicyDate the info policy date of this invest policy
	*/
	@Override
	public void setInfoPolicyDate(java.util.Date infoPolicyDate) {
		_investPolicy.setInfoPolicyDate(infoPolicyDate);
	}

	/**
	* Returns the info policy deploy date of this invest policy.
	*
	* @return the info policy deploy date of this invest policy
	*/
	@Override
	public java.util.Date getInfoPolicyDeployDate() {
		return _investPolicy.getInfoPolicyDeployDate();
	}

	/**
	* Sets the info policy deploy date of this invest policy.
	*
	* @param infoPolicyDeployDate the info policy deploy date of this invest policy
	*/
	@Override
	public void setInfoPolicyDeployDate(java.util.Date infoPolicyDeployDate) {
		_investPolicy.setInfoPolicyDeployDate(infoPolicyDeployDate);
	}

	/**
	* Returns the info responsible user ID of this invest policy.
	*
	* @return the info responsible user ID of this invest policy
	*/
	@Override
	public long getInfoResponsibleUserId() {
		return _investPolicy.getInfoResponsibleUserId();
	}

	/**
	* Sets the info responsible user ID of this invest policy.
	*
	* @param infoResponsibleUserId the info responsible user ID of this invest policy
	*/
	@Override
	public void setInfoResponsibleUserId(long infoResponsibleUserId) {
		_investPolicy.setInfoResponsibleUserId(infoResponsibleUserId);
	}

	/**
	* Returns the info responsible user uuid of this invest policy.
	*
	* @return the info responsible user uuid of this invest policy
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getInfoResponsibleUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicy.getInfoResponsibleUserUuid();
	}

	/**
	* Sets the info responsible user uuid of this invest policy.
	*
	* @param infoResponsibleUserUuid the info responsible user uuid of this invest policy
	*/
	@Override
	public void setInfoResponsibleUserUuid(
		java.lang.String infoResponsibleUserUuid) {
		_investPolicy.setInfoResponsibleUserUuid(infoResponsibleUserUuid);
	}

	/**
	* Returns the info service of this invest policy.
	*
	* @return the info service of this invest policy
	*/
	@Override
	public java.lang.String getInfoService() {
		return _investPolicy.getInfoService();
	}

	/**
	* Sets the info service of this invest policy.
	*
	* @param infoService the info service of this invest policy
	*/
	@Override
	public void setInfoService(java.lang.String infoService) {
		_investPolicy.setInfoService(infoService);
	}

	/**
	* Returns the info invest target of this invest policy.
	*
	* @return the info invest target of this invest policy
	*/
	@Override
	public java.lang.String getInfoInvestTarget() {
		return _investPolicy.getInfoInvestTarget();
	}

	/**
	* Sets the info invest target of this invest policy.
	*
	* @param infoInvestTarget the info invest target of this invest policy
	*/
	@Override
	public void setInfoInvestTarget(java.lang.String infoInvestTarget) {
		_investPolicy.setInfoInvestTarget(infoInvestTarget);
	}

	/**
	* Returns the info invest location of this invest policy.
	*
	* @return the info invest location of this invest policy
	*/
	@Override
	public java.lang.String getInfoInvestLocation() {
		return _investPolicy.getInfoInvestLocation();
	}

	/**
	* Sets the info invest location of this invest policy.
	*
	* @param infoInvestLocation the info invest location of this invest policy
	*/
	@Override
	public void setInfoInvestLocation(java.lang.String infoInvestLocation) {
		_investPolicy.setInfoInvestLocation(infoInvestLocation);
	}

	/**
	* Returns the info technique of this invest policy.
	*
	* @return the info technique of this invest policy
	*/
	@Override
	public java.lang.String getInfoTechnique() {
		return _investPolicy.getInfoTechnique();
	}

	/**
	* Sets the info technique of this invest policy.
	*
	* @param infoTechnique the info technique of this invest policy
	*/
	@Override
	public void setInfoTechnique(java.lang.String infoTechnique) {
		_investPolicy.setInfoTechnique(infoTechnique);
	}

	/**
	* Returns the info invest name of this invest policy.
	*
	* @return the info invest name of this invest policy
	*/
	@Override
	public java.lang.String getInfoInvestName() {
		return _investPolicy.getInfoInvestName();
	}

	/**
	* Sets the info invest name of this invest policy.
	*
	* @param infoInvestName the info invest name of this invest policy
	*/
	@Override
	public void setInfoInvestName(java.lang.String infoInvestName) {
		_investPolicy.setInfoInvestName(infoInvestName);
	}

	/**
	* Returns the info invest deadline of this invest policy.
	*
	* @return the info invest deadline of this invest policy
	*/
	@Override
	public long getInfoInvestDeadline() {
		return _investPolicy.getInfoInvestDeadline();
	}

	/**
	* Sets the info invest deadline of this invest policy.
	*
	* @param infoInvestDeadline the info invest deadline of this invest policy
	*/
	@Override
	public void setInfoInvestDeadline(long infoInvestDeadline) {
		_investPolicy.setInfoInvestDeadline(infoInvestDeadline);
	}

	/**
	* Returns the info invest create group ID of this invest policy.
	*
	* @return the info invest create group ID of this invest policy
	*/
	@Override
	public long getInfoInvestCreateGroupId() {
		return _investPolicy.getInfoInvestCreateGroupId();
	}

	/**
	* Sets the info invest create group ID of this invest policy.
	*
	* @param infoInvestCreateGroupId the info invest create group ID of this invest policy
	*/
	@Override
	public void setInfoInvestCreateGroupId(long infoInvestCreateGroupId) {
		_investPolicy.setInfoInvestCreateGroupId(infoInvestCreateGroupId);
	}

	/**
	* Returns the info invest deploy group ID of this invest policy.
	*
	* @return the info invest deploy group ID of this invest policy
	*/
	@Override
	public long getInfoInvestDeployGroupId() {
		return _investPolicy.getInfoInvestDeployGroupId();
	}

	/**
	* Sets the info invest deploy group ID of this invest policy.
	*
	* @param infoInvestDeployGroupId the info invest deploy group ID of this invest policy
	*/
	@Override
	public void setInfoInvestDeployGroupId(long infoInvestDeployGroupId) {
		_investPolicy.setInfoInvestDeployGroupId(infoInvestDeployGroupId);
	}

	/**
	* Returns the cost capital of this invest policy.
	*
	* @return the cost capital of this invest policy
	*/
	@Override
	public long getCostCapital() {
		return _investPolicy.getCostCapital();
	}

	/**
	* Sets the cost capital of this invest policy.
	*
	* @param costCapital the cost capital of this invest policy
	*/
	@Override
	public void setCostCapital(long costCapital) {
		_investPolicy.setCostCapital(costCapital);
	}

	/**
	* Returns the cost compensate of this invest policy.
	*
	* @return the cost compensate of this invest policy
	*/
	@Override
	public double getCostCompensate() {
		return _investPolicy.getCostCompensate();
	}

	/**
	* Sets the cost compensate of this invest policy.
	*
	* @param costCompensate the cost compensate of this invest policy
	*/
	@Override
	public void setCostCompensate(double costCompensate) {
		_investPolicy.setCostCompensate(costCompensate);
	}

	/**
	* Returns the cost compensate foreign of this invest policy.
	*
	* @return the cost compensate foreign of this invest policy
	*/
	@Override
	public double getCostCompensateForeign() {
		return _investPolicy.getCostCompensateForeign();
	}

	/**
	* Sets the cost compensate foreign of this invest policy.
	*
	* @param costCompensateForeign the cost compensate foreign of this invest policy
	*/
	@Override
	public void setCostCompensateForeign(double costCompensateForeign) {
		_investPolicy.setCostCompensateForeign(costCompensateForeign);
	}

	/**
	* Returns the cost equiment of this invest policy.
	*
	* @return the cost equiment of this invest policy
	*/
	@Override
	public double getCostEquiment() {
		return _investPolicy.getCostEquiment();
	}

	/**
	* Sets the cost equiment of this invest policy.
	*
	* @param costEquiment the cost equiment of this invest policy
	*/
	@Override
	public void setCostEquiment(double costEquiment) {
		_investPolicy.setCostEquiment(costEquiment);
	}

	/**
	* Returns the cost equiment foreign of this invest policy.
	*
	* @return the cost equiment foreign of this invest policy
	*/
	@Override
	public double getCostEquimentForeign() {
		return _investPolicy.getCostEquimentForeign();
	}

	/**
	* Sets the cost equiment foreign of this invest policy.
	*
	* @param costEquimentForeign the cost equiment foreign of this invest policy
	*/
	@Override
	public void setCostEquimentForeign(double costEquimentForeign) {
		_investPolicy.setCostEquimentForeign(costEquimentForeign);
	}

	/**
	* Returns the cost contruction of this invest policy.
	*
	* @return the cost contruction of this invest policy
	*/
	@Override
	public double getCostContruction() {
		return _investPolicy.getCostContruction();
	}

	/**
	* Sets the cost contruction of this invest policy.
	*
	* @param costContruction the cost contruction of this invest policy
	*/
	@Override
	public void setCostContruction(double costContruction) {
		_investPolicy.setCostContruction(costContruction);
	}

	/**
	* Returns the cost contruction foreign of this invest policy.
	*
	* @return the cost contruction foreign of this invest policy
	*/
	@Override
	public double getCostContructionForeign() {
		return _investPolicy.getCostContructionForeign();
	}

	/**
	* Sets the cost contruction foreign of this invest policy.
	*
	* @param costContructionForeign the cost contruction foreign of this invest policy
	*/
	@Override
	public void setCostContructionForeign(double costContructionForeign) {
		_investPolicy.setCostContructionForeign(costContructionForeign);
	}

	/**
	* Returns the cost advisory of this invest policy.
	*
	* @return the cost advisory of this invest policy
	*/
	@Override
	public double getCostAdvisory() {
		return _investPolicy.getCostAdvisory();
	}

	/**
	* Sets the cost advisory of this invest policy.
	*
	* @param costAdvisory the cost advisory of this invest policy
	*/
	@Override
	public void setCostAdvisory(double costAdvisory) {
		_investPolicy.setCostAdvisory(costAdvisory);
	}

	/**
	* Returns the cost advisory foreign of this invest policy.
	*
	* @return the cost advisory foreign of this invest policy
	*/
	@Override
	public double getCostAdvisoryForeign() {
		return _investPolicy.getCostAdvisoryForeign();
	}

	/**
	* Sets the cost advisory foreign of this invest policy.
	*
	* @param costAdvisoryForeign the cost advisory foreign of this invest policy
	*/
	@Override
	public void setCostAdvisoryForeign(double costAdvisoryForeign) {
		_investPolicy.setCostAdvisoryForeign(costAdvisoryForeign);
	}

	/**
	* Returns the cost manager of this invest policy.
	*
	* @return the cost manager of this invest policy
	*/
	@Override
	public double getCostManager() {
		return _investPolicy.getCostManager();
	}

	/**
	* Sets the cost manager of this invest policy.
	*
	* @param costManager the cost manager of this invest policy
	*/
	@Override
	public void setCostManager(double costManager) {
		_investPolicy.setCostManager(costManager);
	}

	/**
	* Returns the cost manager foreign of this invest policy.
	*
	* @return the cost manager foreign of this invest policy
	*/
	@Override
	public double getCostManagerForeign() {
		return _investPolicy.getCostManagerForeign();
	}

	/**
	* Sets the cost manager foreign of this invest policy.
	*
	* @param costManagerForeign the cost manager foreign of this invest policy
	*/
	@Override
	public void setCostManagerForeign(double costManagerForeign) {
		_investPolicy.setCostManagerForeign(costManagerForeign);
	}

	/**
	* Returns the cost other of this invest policy.
	*
	* @return the cost other of this invest policy
	*/
	@Override
	public double getCostOther() {
		return _investPolicy.getCostOther();
	}

	/**
	* Sets the cost other of this invest policy.
	*
	* @param costOther the cost other of this invest policy
	*/
	@Override
	public void setCostOther(double costOther) {
		_investPolicy.setCostOther(costOther);
	}

	/**
	* Returns the cost other foreign of this invest policy.
	*
	* @return the cost other foreign of this invest policy
	*/
	@Override
	public double getCostOtherForeign() {
		return _investPolicy.getCostOtherForeign();
	}

	/**
	* Sets the cost other foreign of this invest policy.
	*
	* @param costOtherForeign the cost other foreign of this invest policy
	*/
	@Override
	public void setCostOtherForeign(double costOtherForeign) {
		_investPolicy.setCostOtherForeign(costOtherForeign);
	}

	/**
	* Returns the cost provide of this invest policy.
	*
	* @return the cost provide of this invest policy
	*/
	@Override
	public double getCostProvide() {
		return _investPolicy.getCostProvide();
	}

	/**
	* Sets the cost provide of this invest policy.
	*
	* @param costProvide the cost provide of this invest policy
	*/
	@Override
	public void setCostProvide(double costProvide) {
		_investPolicy.setCostProvide(costProvide);
	}

	/**
	* Returns the cost provide foreign of this invest policy.
	*
	* @return the cost provide foreign of this invest policy
	*/
	@Override
	public double getCostProvideForeign() {
		return _investPolicy.getCostProvideForeign();
	}

	/**
	* Sets the cost provide foreign of this invest policy.
	*
	* @param costProvideForeign the cost provide foreign of this invest policy
	*/
	@Override
	public void setCostProvideForeign(double costProvideForeign) {
		_investPolicy.setCostProvideForeign(costProvideForeign);
	}

	/**
	* Returns the cost local of this invest policy.
	*
	* @return the cost local of this invest policy
	*/
	@Override
	public double getCostLocal() {
		return _investPolicy.getCostLocal();
	}

	/**
	* Sets the cost local of this invest policy.
	*
	* @param costLocal the cost local of this invest policy
	*/
	@Override
	public void setCostLocal(double costLocal) {
		_investPolicy.setCostLocal(costLocal);
	}

	/**
	* Returns the cost foreign of this invest policy.
	*
	* @return the cost foreign of this invest policy
	*/
	@Override
	public double getCostForeign() {
		return _investPolicy.getCostForeign();
	}

	/**
	* Sets the cost foreign of this invest policy.
	*
	* @param costForeign the cost foreign of this invest policy
	*/
	@Override
	public void setCostForeign(double costForeign) {
		_investPolicy.setCostForeign(costForeign);
	}

	/**
	* Returns the cost foreign rate of this invest policy.
	*
	* @return the cost foreign rate of this invest policy
	*/
	@Override
	public double getCostForeignRate() {
		return _investPolicy.getCostForeignRate();
	}

	/**
	* Sets the cost foreign rate of this invest policy.
	*
	* @param costForeignRate the cost foreign rate of this invest policy
	*/
	@Override
	public void setCostForeignRate(double costForeignRate) {
		_investPolicy.setCostForeignRate(costForeignRate);
	}

	/**
	* Returns the cost tax of this invest policy.
	*
	* @return the cost tax of this invest policy
	*/
	@Override
	public double getCostTax() {
		return _investPolicy.getCostTax();
	}

	/**
	* Sets the cost tax of this invest policy.
	*
	* @param costTax the cost tax of this invest policy
	*/
	@Override
	public void setCostTax(double costTax) {
		_investPolicy.setCostTax(costTax);
	}

	/**
	* Returns the cost total value of this invest policy.
	*
	* @return the cost total value of this invest policy
	*/
	@Override
	public double getCostTotalValue() {
		return _investPolicy.getCostTotalValue();
	}

	/**
	* Sets the cost total value of this invest policy.
	*
	* @param costTotalValue the cost total value of this invest policy
	*/
	@Override
	public void setCostTotalValue(double costTotalValue) {
		_investPolicy.setCostTotalValue(costTotalValue);
	}

	/**
	* Returns the cost total value tax of this invest policy.
	*
	* @return the cost total value tax of this invest policy
	*/
	@Override
	public double getCostTotalValueTax() {
		return _investPolicy.getCostTotalValueTax();
	}

	/**
	* Sets the cost total value tax of this invest policy.
	*
	* @param costTotalValueTax the cost total value tax of this invest policy
	*/
	@Override
	public void setCostTotalValueTax(double costTotalValueTax) {
		_investPolicy.setCostTotalValueTax(costTotalValueTax);
	}

	/**
	* Returns the decide deliverer user ID of this invest policy.
	*
	* @return the decide deliverer user ID of this invest policy
	*/
	@Override
	public long getDecideDelivererUserId() {
		return _investPolicy.getDecideDelivererUserId();
	}

	/**
	* Sets the decide deliverer user ID of this invest policy.
	*
	* @param decideDelivererUserId the decide deliverer user ID of this invest policy
	*/
	@Override
	public void setDecideDelivererUserId(long decideDelivererUserId) {
		_investPolicy.setDecideDelivererUserId(decideDelivererUserId);
	}

	/**
	* Returns the decide deliverer user uuid of this invest policy.
	*
	* @return the decide deliverer user uuid of this invest policy
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getDecideDelivererUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicy.getDecideDelivererUserUuid();
	}

	/**
	* Sets the decide deliverer user uuid of this invest policy.
	*
	* @param decideDelivererUserUuid the decide deliverer user uuid of this invest policy
	*/
	@Override
	public void setDecideDelivererUserUuid(
		java.lang.String decideDelivererUserUuid) {
		_investPolicy.setDecideDelivererUserUuid(decideDelivererUserUuid);
	}

	/**
	* Returns the decide receive user ID of this invest policy.
	*
	* @return the decide receive user ID of this invest policy
	*/
	@Override
	public long getDecideReceiveUserId() {
		return _investPolicy.getDecideReceiveUserId();
	}

	/**
	* Sets the decide receive user ID of this invest policy.
	*
	* @param decideReceiveUserId the decide receive user ID of this invest policy
	*/
	@Override
	public void setDecideReceiveUserId(long decideReceiveUserId) {
		_investPolicy.setDecideReceiveUserId(decideReceiveUserId);
	}

	/**
	* Returns the decide receive user uuid of this invest policy.
	*
	* @return the decide receive user uuid of this invest policy
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getDecideReceiveUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicy.getDecideReceiveUserUuid();
	}

	/**
	* Sets the decide receive user uuid of this invest policy.
	*
	* @param decideReceiveUserUuid the decide receive user uuid of this invest policy
	*/
	@Override
	public void setDecideReceiveUserUuid(java.lang.String decideReceiveUserUuid) {
		_investPolicy.setDecideReceiveUserUuid(decideReceiveUserUuid);
	}

	/**
	* Returns the decide ask date of this invest policy.
	*
	* @return the decide ask date of this invest policy
	*/
	@Override
	public java.util.Date getDecideAskDate() {
		return _investPolicy.getDecideAskDate();
	}

	/**
	* Sets the decide ask date of this invest policy.
	*
	* @param decideAskDate the decide ask date of this invest policy
	*/
	@Override
	public void setDecideAskDate(java.util.Date decideAskDate) {
		_investPolicy.setDecideAskDate(decideAskDate);
	}

	/**
	* Returns the decide deadline of this invest policy.
	*
	* @return the decide deadline of this invest policy
	*/
	@Override
	public long getDecideDeadline() {
		return _investPolicy.getDecideDeadline();
	}

	/**
	* Sets the decide deadline of this invest policy.
	*
	* @param decideDeadline the decide deadline of this invest policy
	*/
	@Override
	public void setDecideDeadline(long decideDeadline) {
		_investPolicy.setDecideDeadline(decideDeadline);
	}

	/**
	* Returns the decide finish date of this invest policy.
	*
	* @return the decide finish date of this invest policy
	*/
	@Override
	public java.util.Date getDecideFinishDate() {
		return _investPolicy.getDecideFinishDate();
	}

	/**
	* Sets the decide finish date of this invest policy.
	*
	* @param decideFinishDate the decide finish date of this invest policy
	*/
	@Override
	public void setDecideFinishDate(java.util.Date decideFinishDate) {
		_investPolicy.setDecideFinishDate(decideFinishDate);
	}

	/**
	* Returns the decide description of this invest policy.
	*
	* @return the decide description of this invest policy
	*/
	@Override
	public java.lang.String getDecideDescription() {
		return _investPolicy.getDecideDescription();
	}

	/**
	* Sets the decide description of this invest policy.
	*
	* @param decideDescription the decide description of this invest policy
	*/
	@Override
	public void setDecideDescription(java.lang.String decideDescription) {
		_investPolicy.setDecideDescription(decideDescription);
	}

	/**
	* Returns the decide user ID of this invest policy.
	*
	* @return the decide user ID of this invest policy
	*/
	@Override
	public long getDecideUserId() {
		return _investPolicy.getDecideUserId();
	}

	/**
	* Sets the decide user ID of this invest policy.
	*
	* @param decideUserId the decide user ID of this invest policy
	*/
	@Override
	public void setDecideUserId(long decideUserId) {
		_investPolicy.setDecideUserId(decideUserId);
	}

	/**
	* Returns the decide user uuid of this invest policy.
	*
	* @return the decide user uuid of this invest policy
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getDecideUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicy.getDecideUserUuid();
	}

	/**
	* Sets the decide user uuid of this invest policy.
	*
	* @param decideUserUuid the decide user uuid of this invest policy
	*/
	@Override
	public void setDecideUserUuid(java.lang.String decideUserUuid) {
		_investPolicy.setDecideUserUuid(decideUserUuid);
	}

	/**
	* Returns the decide date of this invest policy.
	*
	* @return the decide date of this invest policy
	*/
	@Override
	public java.util.Date getDecideDate() {
		return _investPolicy.getDecideDate();
	}

	/**
	* Sets the decide date of this invest policy.
	*
	* @param decideDate the decide date of this invest policy
	*/
	@Override
	public void setDecideDate(java.util.Date decideDate) {
		_investPolicy.setDecideDate(decideDate);
	}

	/**
	* Returns the verify status of this invest policy.
	*
	* @return the verify status of this invest policy
	*/
	@Override
	public long getVerifyStatus() {
		return _investPolicy.getVerifyStatus();
	}

	/**
	* Sets the verify status of this invest policy.
	*
	* @param verifyStatus the verify status of this invest policy
	*/
	@Override
	public void setVerifyStatus(long verifyStatus) {
		_investPolicy.setVerifyStatus(verifyStatus);
	}

	/**
	* Returns the verify doc num of this invest policy.
	*
	* @return the verify doc num of this invest policy
	*/
	@Override
	public java.lang.String getVerifyDocNum() {
		return _investPolicy.getVerifyDocNum();
	}

	/**
	* Sets the verify doc num of this invest policy.
	*
	* @param verifyDocNum the verify doc num of this invest policy
	*/
	@Override
	public void setVerifyDocNum(java.lang.String verifyDocNum) {
		_investPolicy.setVerifyDocNum(verifyDocNum);
	}

	/**
	* Returns the verify date of this invest policy.
	*
	* @return the verify date of this invest policy
	*/
	@Override
	public java.util.Date getVerifyDate() {
		return _investPolicy.getVerifyDate();
	}

	/**
	* Sets the verify date of this invest policy.
	*
	* @param verifyDate the verify date of this invest policy
	*/
	@Override
	public void setVerifyDate(java.util.Date verifyDate) {
		_investPolicy.setVerifyDate(verifyDate);
	}

	/**
	* Returns the verify user ID of this invest policy.
	*
	* @return the verify user ID of this invest policy
	*/
	@Override
	public long getVerifyUserId() {
		return _investPolicy.getVerifyUserId();
	}

	/**
	* Sets the verify user ID of this invest policy.
	*
	* @param verifyUserId the verify user ID of this invest policy
	*/
	@Override
	public void setVerifyUserId(long verifyUserId) {
		_investPolicy.setVerifyUserId(verifyUserId);
	}

	/**
	* Returns the verify user uuid of this invest policy.
	*
	* @return the verify user uuid of this invest policy
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getVerifyUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicy.getVerifyUserUuid();
	}

	/**
	* Sets the verify user uuid of this invest policy.
	*
	* @param verifyUserUuid the verify user uuid of this invest policy
	*/
	@Override
	public void setVerifyUserUuid(java.lang.String verifyUserUuid) {
		_investPolicy.setVerifyUserUuid(verifyUserUuid);
	}

	/**
	* Returns the verify description of this invest policy.
	*
	* @return the verify description of this invest policy
	*/
	@Override
	public java.lang.String getVerifyDescription() {
		return _investPolicy.getVerifyDescription();
	}

	/**
	* Sets the verify description of this invest policy.
	*
	* @param verifyDescription the verify description of this invest policy
	*/
	@Override
	public void setVerifyDescription(java.lang.String verifyDescription) {
		_investPolicy.setVerifyDescription(verifyDescription);
	}

	/**
	* Returns the is active of this invest policy.
	*
	* @return the is active of this invest policy
	*/
	@Override
	public long getIsActive() {
		return _investPolicy.getIsActive();
	}

	/**
	* Sets the is active of this invest policy.
	*
	* @param isActive the is active of this invest policy
	*/
	@Override
	public void setIsActive(long isActive) {
		_investPolicy.setIsActive(isActive);
	}

	/**
	* Returns the status of this invest policy.
	*
	* @return the status of this invest policy
	*/
	@Override
	public long getStatus() {
		return _investPolicy.getStatus();
	}

	/**
	* Sets the status of this invest policy.
	*
	* @param status the status of this invest policy
	*/
	@Override
	public void setStatus(long status) {
		_investPolicy.setStatus(status);
	}

	/**
	* Returns the created ID of this invest policy.
	*
	* @return the created ID of this invest policy
	*/
	@Override
	public long getCreatedId() {
		return _investPolicy.getCreatedId();
	}

	/**
	* Sets the created ID of this invest policy.
	*
	* @param createdId the created ID of this invest policy
	*/
	@Override
	public void setCreatedId(long createdId) {
		_investPolicy.setCreatedId(createdId);
	}

	/**
	* Returns the created date of this invest policy.
	*
	* @return the created date of this invest policy
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _investPolicy.getCreatedDate();
	}

	/**
	* Sets the created date of this invest policy.
	*
	* @param createdDate the created date of this invest policy
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_investPolicy.setCreatedDate(createdDate);
	}

	/**
	* Returns the modifield ID of this invest policy.
	*
	* @return the modifield ID of this invest policy
	*/
	@Override
	public long getModifieldId() {
		return _investPolicy.getModifieldId();
	}

	/**
	* Sets the modifield ID of this invest policy.
	*
	* @param modifieldId the modifield ID of this invest policy
	*/
	@Override
	public void setModifieldId(long modifieldId) {
		_investPolicy.setModifieldId(modifieldId);
	}

	/**
	* Returns the modifield date of this invest policy.
	*
	* @return the modifield date of this invest policy
	*/
	@Override
	public java.util.Date getModifieldDate() {
		return _investPolicy.getModifieldDate();
	}

	/**
	* Sets the modifield date of this invest policy.
	*
	* @param modifieldDate the modifield date of this invest policy
	*/
	@Override
	public void setModifieldDate(java.util.Date modifieldDate) {
		_investPolicy.setModifieldDate(modifieldDate);
	}

	@Override
	public boolean isNew() {
		return _investPolicy.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_investPolicy.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _investPolicy.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_investPolicy.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _investPolicy.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _investPolicy.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_investPolicy.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _investPolicy.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_investPolicy.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_investPolicy.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_investPolicy.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InvestPolicyWrapper((InvestPolicy)_investPolicy.clone());
	}

	@Override
	public int compareTo(com.viettel.ims.core.model.InvestPolicy investPolicy) {
		return _investPolicy.compareTo(investPolicy);
	}

	@Override
	public int hashCode() {
		return _investPolicy.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.viettel.ims.core.model.InvestPolicy> toCacheModel() {
		return _investPolicy.toCacheModel();
	}

	@Override
	public com.viettel.ims.core.model.InvestPolicy toEscapedModel() {
		return new InvestPolicyWrapper(_investPolicy.toEscapedModel());
	}

	@Override
	public com.viettel.ims.core.model.InvestPolicy toUnescapedModel() {
		return new InvestPolicyWrapper(_investPolicy.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _investPolicy.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _investPolicy.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_investPolicy.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InvestPolicyWrapper)) {
			return false;
		}

		InvestPolicyWrapper investPolicyWrapper = (InvestPolicyWrapper)obj;

		if (Validator.equals(_investPolicy, investPolicyWrapper._investPolicy)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public InvestPolicy getWrappedInvestPolicy() {
		return _investPolicy;
	}

	@Override
	public InvestPolicy getWrappedModel() {
		return _investPolicy;
	}

	@Override
	public void resetOriginalValues() {
		_investPolicy.resetOriginalValues();
	}

	private InvestPolicy _investPolicy;
}
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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.viettel.ims.core.service.ClpSerializer;
import com.viettel.ims.core.service.InvestPolicyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MrNet
 */
public class InvestPolicyClp extends BaseModelImpl<InvestPolicy>
	implements InvestPolicy {
	public InvestPolicyClp() {
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
	public long getPrimaryKey() {
		return _investPolicyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setInvestPolicyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _investPolicyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getInvestPolicyId() {
		return _investPolicyId;
	}

	@Override
	public void setInvestPolicyId(long investPolicyId) {
		_investPolicyId = investPolicyId;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInvestPolicyId", long.class);

				method.invoke(_investPolicyRemoteModel, investPolicyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInfoPolicyType() {
		return _infoPolicyType;
	}

	@Override
	public void setInfoPolicyType(long infoPolicyType) {
		_infoPolicyType = infoPolicyType;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoPolicyType", long.class);

				method.invoke(_investPolicyRemoteModel, infoPolicyType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInfoPolicyName() {
		return _infoPolicyName;
	}

	@Override
	public void setInfoPolicyName(String infoPolicyName) {
		_infoPolicyName = infoPolicyName;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoPolicyName",
						String.class);

				method.invoke(_investPolicyRemoteModel, infoPolicyName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInfoPolicyCode() {
		return _infoPolicyCode;
	}

	@Override
	public void setInfoPolicyCode(String infoPolicyCode) {
		_infoPolicyCode = infoPolicyCode;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoPolicyCode",
						String.class);

				method.invoke(_investPolicyRemoteModel, infoPolicyCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInfoProposeGroupId() {
		return _infoProposeGroupId;
	}

	@Override
	public void setInfoProposeGroupId(long infoProposeGroupId) {
		_infoProposeGroupId = infoProposeGroupId;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoProposeGroupId",
						long.class);

				method.invoke(_investPolicyRemoteModel, infoProposeGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInfoVerifyGroupId() {
		return _infoVerifyGroupId;
	}

	@Override
	public void setInfoVerifyGroupId(long infoVerifyGroupId) {
		_infoVerifyGroupId = infoVerifyGroupId;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoVerifyGroupId",
						long.class);

				method.invoke(_investPolicyRemoteModel, infoVerifyGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInfoPolicyDate() {
		return _infoPolicyDate;
	}

	@Override
	public void setInfoPolicyDate(Date infoPolicyDate) {
		_infoPolicyDate = infoPolicyDate;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoPolicyDate", Date.class);

				method.invoke(_investPolicyRemoteModel, infoPolicyDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInfoPolicyDeployDate() {
		return _infoPolicyDeployDate;
	}

	@Override
	public void setInfoPolicyDeployDate(Date infoPolicyDeployDate) {
		_infoPolicyDeployDate = infoPolicyDeployDate;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoPolicyDeployDate",
						Date.class);

				method.invoke(_investPolicyRemoteModel, infoPolicyDeployDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInfoResponsibleUserId() {
		return _infoResponsibleUserId;
	}

	@Override
	public void setInfoResponsibleUserId(long infoResponsibleUserId) {
		_infoResponsibleUserId = infoResponsibleUserId;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoResponsibleUserId",
						long.class);

				method.invoke(_investPolicyRemoteModel, infoResponsibleUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInfoResponsibleUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getInfoResponsibleUserId(), "uuid",
			_infoResponsibleUserUuid);
	}

	@Override
	public void setInfoResponsibleUserUuid(String infoResponsibleUserUuid) {
		_infoResponsibleUserUuid = infoResponsibleUserUuid;
	}

	@Override
	public String getInfoService() {
		return _infoService;
	}

	@Override
	public void setInfoService(String infoService) {
		_infoService = infoService;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoService", String.class);

				method.invoke(_investPolicyRemoteModel, infoService);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInfoInvestTarget() {
		return _infoInvestTarget;
	}

	@Override
	public void setInfoInvestTarget(String infoInvestTarget) {
		_infoInvestTarget = infoInvestTarget;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoInvestTarget",
						String.class);

				method.invoke(_investPolicyRemoteModel, infoInvestTarget);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInfoInvestLocation() {
		return _infoInvestLocation;
	}

	@Override
	public void setInfoInvestLocation(String infoInvestLocation) {
		_infoInvestLocation = infoInvestLocation;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoInvestLocation",
						String.class);

				method.invoke(_investPolicyRemoteModel, infoInvestLocation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInfoTechnique() {
		return _infoTechnique;
	}

	@Override
	public void setInfoTechnique(String infoTechnique) {
		_infoTechnique = infoTechnique;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoTechnique", String.class);

				method.invoke(_investPolicyRemoteModel, infoTechnique);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInfoInvestName() {
		return _infoInvestName;
	}

	@Override
	public void setInfoInvestName(String infoInvestName) {
		_infoInvestName = infoInvestName;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoInvestName",
						String.class);

				method.invoke(_investPolicyRemoteModel, infoInvestName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInfoInvestDeadline() {
		return _infoInvestDeadline;
	}

	@Override
	public void setInfoInvestDeadline(long infoInvestDeadline) {
		_infoInvestDeadline = infoInvestDeadline;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoInvestDeadline",
						long.class);

				method.invoke(_investPolicyRemoteModel, infoInvestDeadline);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInfoInvestCreateGroupId() {
		return _infoInvestCreateGroupId;
	}

	@Override
	public void setInfoInvestCreateGroupId(long infoInvestCreateGroupId) {
		_infoInvestCreateGroupId = infoInvestCreateGroupId;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoInvestCreateGroupId",
						long.class);

				method.invoke(_investPolicyRemoteModel, infoInvestCreateGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInfoInvestDeployGroupId() {
		return _infoInvestDeployGroupId;
	}

	@Override
	public void setInfoInvestDeployGroupId(long infoInvestDeployGroupId) {
		_infoInvestDeployGroupId = infoInvestDeployGroupId;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setInfoInvestDeployGroupId",
						long.class);

				method.invoke(_investPolicyRemoteModel, infoInvestDeployGroupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCostCapital() {
		return _costCapital;
	}

	@Override
	public void setCostCapital(long costCapital) {
		_costCapital = costCapital;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostCapital", long.class);

				method.invoke(_investPolicyRemoteModel, costCapital);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostCompensate() {
		return _costCompensate;
	}

	@Override
	public void setCostCompensate(double costCompensate) {
		_costCompensate = costCompensate;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostCompensate",
						double.class);

				method.invoke(_investPolicyRemoteModel, costCompensate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostCompensateForeign() {
		return _costCompensateForeign;
	}

	@Override
	public void setCostCompensateForeign(double costCompensateForeign) {
		_costCompensateForeign = costCompensateForeign;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostCompensateForeign",
						double.class);

				method.invoke(_investPolicyRemoteModel, costCompensateForeign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostEquiment() {
		return _costEquiment;
	}

	@Override
	public void setCostEquiment(double costEquiment) {
		_costEquiment = costEquiment;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostEquiment", double.class);

				method.invoke(_investPolicyRemoteModel, costEquiment);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostEquimentForeign() {
		return _costEquimentForeign;
	}

	@Override
	public void setCostEquimentForeign(double costEquimentForeign) {
		_costEquimentForeign = costEquimentForeign;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostEquimentForeign",
						double.class);

				method.invoke(_investPolicyRemoteModel, costEquimentForeign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostContruction() {
		return _costContruction;
	}

	@Override
	public void setCostContruction(double costContruction) {
		_costContruction = costContruction;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostContruction",
						double.class);

				method.invoke(_investPolicyRemoteModel, costContruction);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostContructionForeign() {
		return _costContructionForeign;
	}

	@Override
	public void setCostContructionForeign(double costContructionForeign) {
		_costContructionForeign = costContructionForeign;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostContructionForeign",
						double.class);

				method.invoke(_investPolicyRemoteModel, costContructionForeign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostAdvisory() {
		return _costAdvisory;
	}

	@Override
	public void setCostAdvisory(double costAdvisory) {
		_costAdvisory = costAdvisory;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostAdvisory", double.class);

				method.invoke(_investPolicyRemoteModel, costAdvisory);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostAdvisoryForeign() {
		return _costAdvisoryForeign;
	}

	@Override
	public void setCostAdvisoryForeign(double costAdvisoryForeign) {
		_costAdvisoryForeign = costAdvisoryForeign;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostAdvisoryForeign",
						double.class);

				method.invoke(_investPolicyRemoteModel, costAdvisoryForeign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostManager() {
		return _costManager;
	}

	@Override
	public void setCostManager(double costManager) {
		_costManager = costManager;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostManager", double.class);

				method.invoke(_investPolicyRemoteModel, costManager);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostManagerForeign() {
		return _costManagerForeign;
	}

	@Override
	public void setCostManagerForeign(double costManagerForeign) {
		_costManagerForeign = costManagerForeign;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostManagerForeign",
						double.class);

				method.invoke(_investPolicyRemoteModel, costManagerForeign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostOther() {
		return _costOther;
	}

	@Override
	public void setCostOther(double costOther) {
		_costOther = costOther;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostOther", double.class);

				method.invoke(_investPolicyRemoteModel, costOther);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostOtherForeign() {
		return _costOtherForeign;
	}

	@Override
	public void setCostOtherForeign(double costOtherForeign) {
		_costOtherForeign = costOtherForeign;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostOtherForeign",
						double.class);

				method.invoke(_investPolicyRemoteModel, costOtherForeign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostProvide() {
		return _costProvide;
	}

	@Override
	public void setCostProvide(double costProvide) {
		_costProvide = costProvide;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostProvide", double.class);

				method.invoke(_investPolicyRemoteModel, costProvide);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostProvideForeign() {
		return _costProvideForeign;
	}

	@Override
	public void setCostProvideForeign(double costProvideForeign) {
		_costProvideForeign = costProvideForeign;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostProvideForeign",
						double.class);

				method.invoke(_investPolicyRemoteModel, costProvideForeign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostLocal() {
		return _costLocal;
	}

	@Override
	public void setCostLocal(double costLocal) {
		_costLocal = costLocal;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostLocal", double.class);

				method.invoke(_investPolicyRemoteModel, costLocal);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostForeign() {
		return _costForeign;
	}

	@Override
	public void setCostForeign(double costForeign) {
		_costForeign = costForeign;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostForeign", double.class);

				method.invoke(_investPolicyRemoteModel, costForeign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostForeignRate() {
		return _costForeignRate;
	}

	@Override
	public void setCostForeignRate(double costForeignRate) {
		_costForeignRate = costForeignRate;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostForeignRate",
						double.class);

				method.invoke(_investPolicyRemoteModel, costForeignRate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostTax() {
		return _costTax;
	}

	@Override
	public void setCostTax(double costTax) {
		_costTax = costTax;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostTax", double.class);

				method.invoke(_investPolicyRemoteModel, costTax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostTotalValue() {
		return _costTotalValue;
	}

	@Override
	public void setCostTotalValue(double costTotalValue) {
		_costTotalValue = costTotalValue;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostTotalValue",
						double.class);

				method.invoke(_investPolicyRemoteModel, costTotalValue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCostTotalValueTax() {
		return _costTotalValueTax;
	}

	@Override
	public void setCostTotalValueTax(double costTotalValueTax) {
		_costTotalValueTax = costTotalValueTax;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCostTotalValueTax",
						double.class);

				method.invoke(_investPolicyRemoteModel, costTotalValueTax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDecideDelivererUserId() {
		return _decideDelivererUserId;
	}

	@Override
	public void setDecideDelivererUserId(long decideDelivererUserId) {
		_decideDelivererUserId = decideDelivererUserId;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setDecideDelivererUserId",
						long.class);

				method.invoke(_investPolicyRemoteModel, decideDelivererUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDecideDelivererUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getDecideDelivererUserId(), "uuid",
			_decideDelivererUserUuid);
	}

	@Override
	public void setDecideDelivererUserUuid(String decideDelivererUserUuid) {
		_decideDelivererUserUuid = decideDelivererUserUuid;
	}

	@Override
	public long getDecideReceiveUserId() {
		return _decideReceiveUserId;
	}

	@Override
	public void setDecideReceiveUserId(long decideReceiveUserId) {
		_decideReceiveUserId = decideReceiveUserId;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setDecideReceiveUserId",
						long.class);

				method.invoke(_investPolicyRemoteModel, decideReceiveUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDecideReceiveUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getDecideReceiveUserId(), "uuid",
			_decideReceiveUserUuid);
	}

	@Override
	public void setDecideReceiveUserUuid(String decideReceiveUserUuid) {
		_decideReceiveUserUuid = decideReceiveUserUuid;
	}

	@Override
	public Date getDecideAskDate() {
		return _decideAskDate;
	}

	@Override
	public void setDecideAskDate(Date decideAskDate) {
		_decideAskDate = decideAskDate;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setDecideAskDate", Date.class);

				method.invoke(_investPolicyRemoteModel, decideAskDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDecideDeadline() {
		return _decideDeadline;
	}

	@Override
	public void setDecideDeadline(long decideDeadline) {
		_decideDeadline = decideDeadline;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setDecideDeadline", long.class);

				method.invoke(_investPolicyRemoteModel, decideDeadline);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDecideFinishDate() {
		return _decideFinishDate;
	}

	@Override
	public void setDecideFinishDate(Date decideFinishDate) {
		_decideFinishDate = decideFinishDate;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setDecideFinishDate",
						Date.class);

				method.invoke(_investPolicyRemoteModel, decideFinishDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDecideDescription() {
		return _decideDescription;
	}

	@Override
	public void setDecideDescription(String decideDescription) {
		_decideDescription = decideDescription;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setDecideDescription",
						String.class);

				method.invoke(_investPolicyRemoteModel, decideDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDecideUserId() {
		return _decideUserId;
	}

	@Override
	public void setDecideUserId(long decideUserId) {
		_decideUserId = decideUserId;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setDecideUserId", long.class);

				method.invoke(_investPolicyRemoteModel, decideUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDecideUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getDecideUserId(), "uuid",
			_decideUserUuid);
	}

	@Override
	public void setDecideUserUuid(String decideUserUuid) {
		_decideUserUuid = decideUserUuid;
	}

	@Override
	public Date getDecideDate() {
		return _decideDate;
	}

	@Override
	public void setDecideDate(Date decideDate) {
		_decideDate = decideDate;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setDecideDate", Date.class);

				method.invoke(_investPolicyRemoteModel, decideDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVerifyStatus() {
		return _verifyStatus;
	}

	@Override
	public void setVerifyStatus(long verifyStatus) {
		_verifyStatus = verifyStatus;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setVerifyStatus", long.class);

				method.invoke(_investPolicyRemoteModel, verifyStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVerifyDocNum() {
		return _verifyDocNum;
	}

	@Override
	public void setVerifyDocNum(String verifyDocNum) {
		_verifyDocNum = verifyDocNum;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setVerifyDocNum", String.class);

				method.invoke(_investPolicyRemoteModel, verifyDocNum);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getVerifyDate() {
		return _verifyDate;
	}

	@Override
	public void setVerifyDate(Date verifyDate) {
		_verifyDate = verifyDate;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setVerifyDate", Date.class);

				method.invoke(_investPolicyRemoteModel, verifyDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVerifyUserId() {
		return _verifyUserId;
	}

	@Override
	public void setVerifyUserId(long verifyUserId) {
		_verifyUserId = verifyUserId;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setVerifyUserId", long.class);

				method.invoke(_investPolicyRemoteModel, verifyUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVerifyUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getVerifyUserId(), "uuid",
			_verifyUserUuid);
	}

	@Override
	public void setVerifyUserUuid(String verifyUserUuid) {
		_verifyUserUuid = verifyUserUuid;
	}

	@Override
	public String getVerifyDescription() {
		return _verifyDescription;
	}

	@Override
	public void setVerifyDescription(String verifyDescription) {
		_verifyDescription = verifyDescription;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setVerifyDescription",
						String.class);

				method.invoke(_investPolicyRemoteModel, verifyDescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIsActive() {
		return _isActive;
	}

	@Override
	public void setIsActive(long isActive) {
		_isActive = isActive;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", long.class);

				method.invoke(_investPolicyRemoteModel, isActive);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStatus() {
		return _status;
	}

	@Override
	public void setStatus(long status) {
		_status = status;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", long.class);

				method.invoke(_investPolicyRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreatedId() {
		return _createdId;
	}

	@Override
	public void setCreatedId(long createdId) {
		_createdId = createdId;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedId", long.class);

				method.invoke(_investPolicyRemoteModel, createdId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_investPolicyRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getModifieldId() {
		return _modifieldId;
	}

	@Override
	public void setModifieldId(long modifieldId) {
		_modifieldId = modifieldId;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setModifieldId", long.class);

				method.invoke(_investPolicyRemoteModel, modifieldId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifieldDate() {
		return _modifieldDate;
	}

	@Override
	public void setModifieldDate(Date modifieldDate) {
		_modifieldDate = modifieldDate;

		if (_investPolicyRemoteModel != null) {
			try {
				Class<?> clazz = _investPolicyRemoteModel.getClass();

				Method method = clazz.getMethod("setModifieldDate", Date.class);

				method.invoke(_investPolicyRemoteModel, modifieldDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getInvestPolicyRemoteModel() {
		return _investPolicyRemoteModel;
	}

	public void setInvestPolicyRemoteModel(BaseModel<?> investPolicyRemoteModel) {
		_investPolicyRemoteModel = investPolicyRemoteModel;
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

		Class<?> remoteModelClass = _investPolicyRemoteModel.getClass();

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

		Object returnValue = method.invoke(_investPolicyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			InvestPolicyLocalServiceUtil.addInvestPolicy(this);
		}
		else {
			InvestPolicyLocalServiceUtil.updateInvestPolicy(this);
		}
	}

	@Override
	public InvestPolicy toEscapedModel() {
		return (InvestPolicy)ProxyUtil.newProxyInstance(InvestPolicy.class.getClassLoader(),
			new Class[] { InvestPolicy.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		InvestPolicyClp clone = new InvestPolicyClp();

		clone.setInvestPolicyId(getInvestPolicyId());
		clone.setInfoPolicyType(getInfoPolicyType());
		clone.setInfoPolicyName(getInfoPolicyName());
		clone.setInfoPolicyCode(getInfoPolicyCode());
		clone.setInfoProposeGroupId(getInfoProposeGroupId());
		clone.setInfoVerifyGroupId(getInfoVerifyGroupId());
		clone.setInfoPolicyDate(getInfoPolicyDate());
		clone.setInfoPolicyDeployDate(getInfoPolicyDeployDate());
		clone.setInfoResponsibleUserId(getInfoResponsibleUserId());
		clone.setInfoService(getInfoService());
		clone.setInfoInvestTarget(getInfoInvestTarget());
		clone.setInfoInvestLocation(getInfoInvestLocation());
		clone.setInfoTechnique(getInfoTechnique());
		clone.setInfoInvestName(getInfoInvestName());
		clone.setInfoInvestDeadline(getInfoInvestDeadline());
		clone.setInfoInvestCreateGroupId(getInfoInvestCreateGroupId());
		clone.setInfoInvestDeployGroupId(getInfoInvestDeployGroupId());
		clone.setCostCapital(getCostCapital());
		clone.setCostCompensate(getCostCompensate());
		clone.setCostCompensateForeign(getCostCompensateForeign());
		clone.setCostEquiment(getCostEquiment());
		clone.setCostEquimentForeign(getCostEquimentForeign());
		clone.setCostContruction(getCostContruction());
		clone.setCostContructionForeign(getCostContructionForeign());
		clone.setCostAdvisory(getCostAdvisory());
		clone.setCostAdvisoryForeign(getCostAdvisoryForeign());
		clone.setCostManager(getCostManager());
		clone.setCostManagerForeign(getCostManagerForeign());
		clone.setCostOther(getCostOther());
		clone.setCostOtherForeign(getCostOtherForeign());
		clone.setCostProvide(getCostProvide());
		clone.setCostProvideForeign(getCostProvideForeign());
		clone.setCostLocal(getCostLocal());
		clone.setCostForeign(getCostForeign());
		clone.setCostForeignRate(getCostForeignRate());
		clone.setCostTax(getCostTax());
		clone.setCostTotalValue(getCostTotalValue());
		clone.setCostTotalValueTax(getCostTotalValueTax());
		clone.setDecideDelivererUserId(getDecideDelivererUserId());
		clone.setDecideReceiveUserId(getDecideReceiveUserId());
		clone.setDecideAskDate(getDecideAskDate());
		clone.setDecideDeadline(getDecideDeadline());
		clone.setDecideFinishDate(getDecideFinishDate());
		clone.setDecideDescription(getDecideDescription());
		clone.setDecideUserId(getDecideUserId());
		clone.setDecideDate(getDecideDate());
		clone.setVerifyStatus(getVerifyStatus());
		clone.setVerifyDocNum(getVerifyDocNum());
		clone.setVerifyDate(getVerifyDate());
		clone.setVerifyUserId(getVerifyUserId());
		clone.setVerifyDescription(getVerifyDescription());
		clone.setIsActive(getIsActive());
		clone.setStatus(getStatus());
		clone.setCreatedId(getCreatedId());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifieldId(getModifieldId());
		clone.setModifieldDate(getModifieldDate());

		return clone;
	}

	@Override
	public int compareTo(InvestPolicy investPolicy) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(),
				investPolicy.getCreatedDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InvestPolicyClp)) {
			return false;
		}

		InvestPolicyClp investPolicy = (InvestPolicyClp)obj;

		long primaryKey = investPolicy.getPrimaryKey();

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
		StringBundler sb = new StringBundler(115);

		sb.append("{investPolicyId=");
		sb.append(getInvestPolicyId());
		sb.append(", infoPolicyType=");
		sb.append(getInfoPolicyType());
		sb.append(", infoPolicyName=");
		sb.append(getInfoPolicyName());
		sb.append(", infoPolicyCode=");
		sb.append(getInfoPolicyCode());
		sb.append(", infoProposeGroupId=");
		sb.append(getInfoProposeGroupId());
		sb.append(", infoVerifyGroupId=");
		sb.append(getInfoVerifyGroupId());
		sb.append(", infoPolicyDate=");
		sb.append(getInfoPolicyDate());
		sb.append(", infoPolicyDeployDate=");
		sb.append(getInfoPolicyDeployDate());
		sb.append(", infoResponsibleUserId=");
		sb.append(getInfoResponsibleUserId());
		sb.append(", infoService=");
		sb.append(getInfoService());
		sb.append(", infoInvestTarget=");
		sb.append(getInfoInvestTarget());
		sb.append(", infoInvestLocation=");
		sb.append(getInfoInvestLocation());
		sb.append(", infoTechnique=");
		sb.append(getInfoTechnique());
		sb.append(", infoInvestName=");
		sb.append(getInfoInvestName());
		sb.append(", infoInvestDeadline=");
		sb.append(getInfoInvestDeadline());
		sb.append(", infoInvestCreateGroupId=");
		sb.append(getInfoInvestCreateGroupId());
		sb.append(", infoInvestDeployGroupId=");
		sb.append(getInfoInvestDeployGroupId());
		sb.append(", costCapital=");
		sb.append(getCostCapital());
		sb.append(", costCompensate=");
		sb.append(getCostCompensate());
		sb.append(", costCompensateForeign=");
		sb.append(getCostCompensateForeign());
		sb.append(", costEquiment=");
		sb.append(getCostEquiment());
		sb.append(", costEquimentForeign=");
		sb.append(getCostEquimentForeign());
		sb.append(", costContruction=");
		sb.append(getCostContruction());
		sb.append(", costContructionForeign=");
		sb.append(getCostContructionForeign());
		sb.append(", costAdvisory=");
		sb.append(getCostAdvisory());
		sb.append(", costAdvisoryForeign=");
		sb.append(getCostAdvisoryForeign());
		sb.append(", costManager=");
		sb.append(getCostManager());
		sb.append(", costManagerForeign=");
		sb.append(getCostManagerForeign());
		sb.append(", costOther=");
		sb.append(getCostOther());
		sb.append(", costOtherForeign=");
		sb.append(getCostOtherForeign());
		sb.append(", costProvide=");
		sb.append(getCostProvide());
		sb.append(", costProvideForeign=");
		sb.append(getCostProvideForeign());
		sb.append(", costLocal=");
		sb.append(getCostLocal());
		sb.append(", costForeign=");
		sb.append(getCostForeign());
		sb.append(", costForeignRate=");
		sb.append(getCostForeignRate());
		sb.append(", costTax=");
		sb.append(getCostTax());
		sb.append(", costTotalValue=");
		sb.append(getCostTotalValue());
		sb.append(", costTotalValueTax=");
		sb.append(getCostTotalValueTax());
		sb.append(", decideDelivererUserId=");
		sb.append(getDecideDelivererUserId());
		sb.append(", decideReceiveUserId=");
		sb.append(getDecideReceiveUserId());
		sb.append(", decideAskDate=");
		sb.append(getDecideAskDate());
		sb.append(", decideDeadline=");
		sb.append(getDecideDeadline());
		sb.append(", decideFinishDate=");
		sb.append(getDecideFinishDate());
		sb.append(", decideDescription=");
		sb.append(getDecideDescription());
		sb.append(", decideUserId=");
		sb.append(getDecideUserId());
		sb.append(", decideDate=");
		sb.append(getDecideDate());
		sb.append(", verifyStatus=");
		sb.append(getVerifyStatus());
		sb.append(", verifyDocNum=");
		sb.append(getVerifyDocNum());
		sb.append(", verifyDate=");
		sb.append(getVerifyDate());
		sb.append(", verifyUserId=");
		sb.append(getVerifyUserId());
		sb.append(", verifyDescription=");
		sb.append(getVerifyDescription());
		sb.append(", isActive=");
		sb.append(getIsActive());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", createdId=");
		sb.append(getCreatedId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", modifieldId=");
		sb.append(getModifieldId());
		sb.append(", modifieldDate=");
		sb.append(getModifieldDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(175);

		sb.append("<model><model-name>");
		sb.append("com.viettel.ims.core.model.InvestPolicy");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>investPolicyId</column-name><column-value><![CDATA[");
		sb.append(getInvestPolicyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoPolicyType</column-name><column-value><![CDATA[");
		sb.append(getInfoPolicyType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoPolicyName</column-name><column-value><![CDATA[");
		sb.append(getInfoPolicyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoPolicyCode</column-name><column-value><![CDATA[");
		sb.append(getInfoPolicyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoProposeGroupId</column-name><column-value><![CDATA[");
		sb.append(getInfoProposeGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoVerifyGroupId</column-name><column-value><![CDATA[");
		sb.append(getInfoVerifyGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoPolicyDate</column-name><column-value><![CDATA[");
		sb.append(getInfoPolicyDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoPolicyDeployDate</column-name><column-value><![CDATA[");
		sb.append(getInfoPolicyDeployDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoResponsibleUserId</column-name><column-value><![CDATA[");
		sb.append(getInfoResponsibleUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoService</column-name><column-value><![CDATA[");
		sb.append(getInfoService());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoInvestTarget</column-name><column-value><![CDATA[");
		sb.append(getInfoInvestTarget());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoInvestLocation</column-name><column-value><![CDATA[");
		sb.append(getInfoInvestLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoTechnique</column-name><column-value><![CDATA[");
		sb.append(getInfoTechnique());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoInvestName</column-name><column-value><![CDATA[");
		sb.append(getInfoInvestName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoInvestDeadline</column-name><column-value><![CDATA[");
		sb.append(getInfoInvestDeadline());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoInvestCreateGroupId</column-name><column-value><![CDATA[");
		sb.append(getInfoInvestCreateGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoInvestDeployGroupId</column-name><column-value><![CDATA[");
		sb.append(getInfoInvestDeployGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costCapital</column-name><column-value><![CDATA[");
		sb.append(getCostCapital());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costCompensate</column-name><column-value><![CDATA[");
		sb.append(getCostCompensate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costCompensateForeign</column-name><column-value><![CDATA[");
		sb.append(getCostCompensateForeign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costEquiment</column-name><column-value><![CDATA[");
		sb.append(getCostEquiment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costEquimentForeign</column-name><column-value><![CDATA[");
		sb.append(getCostEquimentForeign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costContruction</column-name><column-value><![CDATA[");
		sb.append(getCostContruction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costContructionForeign</column-name><column-value><![CDATA[");
		sb.append(getCostContructionForeign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costAdvisory</column-name><column-value><![CDATA[");
		sb.append(getCostAdvisory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costAdvisoryForeign</column-name><column-value><![CDATA[");
		sb.append(getCostAdvisoryForeign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costManager</column-name><column-value><![CDATA[");
		sb.append(getCostManager());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costManagerForeign</column-name><column-value><![CDATA[");
		sb.append(getCostManagerForeign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costOther</column-name><column-value><![CDATA[");
		sb.append(getCostOther());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costOtherForeign</column-name><column-value><![CDATA[");
		sb.append(getCostOtherForeign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costProvide</column-name><column-value><![CDATA[");
		sb.append(getCostProvide());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costProvideForeign</column-name><column-value><![CDATA[");
		sb.append(getCostProvideForeign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costLocal</column-name><column-value><![CDATA[");
		sb.append(getCostLocal());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costForeign</column-name><column-value><![CDATA[");
		sb.append(getCostForeign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costForeignRate</column-name><column-value><![CDATA[");
		sb.append(getCostForeignRate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costTax</column-name><column-value><![CDATA[");
		sb.append(getCostTax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costTotalValue</column-name><column-value><![CDATA[");
		sb.append(getCostTotalValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costTotalValueTax</column-name><column-value><![CDATA[");
		sb.append(getCostTotalValueTax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>decideDelivererUserId</column-name><column-value><![CDATA[");
		sb.append(getDecideDelivererUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>decideReceiveUserId</column-name><column-value><![CDATA[");
		sb.append(getDecideReceiveUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>decideAskDate</column-name><column-value><![CDATA[");
		sb.append(getDecideAskDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>decideDeadline</column-name><column-value><![CDATA[");
		sb.append(getDecideDeadline());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>decideFinishDate</column-name><column-value><![CDATA[");
		sb.append(getDecideFinishDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>decideDescription</column-name><column-value><![CDATA[");
		sb.append(getDecideDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>decideUserId</column-name><column-value><![CDATA[");
		sb.append(getDecideUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>decideDate</column-name><column-value><![CDATA[");
		sb.append(getDecideDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>verifyStatus</column-name><column-value><![CDATA[");
		sb.append(getVerifyStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>verifyDocNum</column-name><column-value><![CDATA[");
		sb.append(getVerifyDocNum());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>verifyDate</column-name><column-value><![CDATA[");
		sb.append(getVerifyDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>verifyUserId</column-name><column-value><![CDATA[");
		sb.append(getVerifyUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>verifyDescription</column-name><column-value><![CDATA[");
		sb.append(getVerifyDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdId</column-name><column-value><![CDATA[");
		sb.append(getCreatedId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifieldId</column-name><column-value><![CDATA[");
		sb.append(getModifieldId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifieldDate</column-name><column-value><![CDATA[");
		sb.append(getModifieldDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private String _infoResponsibleUserUuid;
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
	private String _decideDelivererUserUuid;
	private long _decideReceiveUserId;
	private String _decideReceiveUserUuid;
	private Date _decideAskDate;
	private long _decideDeadline;
	private Date _decideFinishDate;
	private String _decideDescription;
	private long _decideUserId;
	private String _decideUserUuid;
	private Date _decideDate;
	private long _verifyStatus;
	private String _verifyDocNum;
	private Date _verifyDate;
	private long _verifyUserId;
	private String _verifyUserUuid;
	private String _verifyDescription;
	private long _isActive;
	private long _status;
	private long _createdId;
	private Date _createdDate;
	private long _modifieldId;
	private Date _modifieldDate;
	private BaseModel<?> _investPolicyRemoteModel;
	private Class<?> _clpSerializerClass = com.viettel.ims.core.service.ClpSerializer.class;
}
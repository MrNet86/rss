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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the InvestPolicyExt service. Represents a row in the &quot;VTIMS_InvestPolicyExt&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.viettel.ims.core.model.impl.InvestPolicyExtModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.viettel.ims.core.model.impl.InvestPolicyExtImpl}.
 * </p>
 *
 * @author MrNet
 * @see InvestPolicyExt
 * @see com.viettel.ims.core.model.impl.InvestPolicyExtImpl
 * @see com.viettel.ims.core.model.impl.InvestPolicyExtModelImpl
 * @generated
 */
public interface InvestPolicyExtModel extends BaseModel<InvestPolicyExt> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a invest policy ext model instance should use the {@link InvestPolicyExt} interface instead.
	 */

	/**
	 * Returns the primary key of this invest policy ext.
	 *
	 * @return the primary key of this invest policy ext
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this invest policy ext.
	 *
	 * @param primaryKey the primary key of this invest policy ext
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the invest policy ID of this invest policy ext.
	 *
	 * @return the invest policy ID of this invest policy ext
	 */
	public long getInvestPolicyId();

	/**
	 * Sets the invest policy ID of this invest policy ext.
	 *
	 * @param investPolicyId the invest policy ID of this invest policy ext
	 */
	public void setInvestPolicyId(long investPolicyId);

	/**
	 * Returns the info policy type of this invest policy ext.
	 *
	 * @return the info policy type of this invest policy ext
	 */
	public long getInfoPolicyType();

	/**
	 * Sets the info policy type of this invest policy ext.
	 *
	 * @param infoPolicyType the info policy type of this invest policy ext
	 */
	public void setInfoPolicyType(long infoPolicyType);

	/**
	 * Returns the info policy name of this invest policy ext.
	 *
	 * @return the info policy name of this invest policy ext
	 */
	@AutoEscape
	public String getInfoPolicyName();

	/**
	 * Sets the info policy name of this invest policy ext.
	 *
	 * @param infoPolicyName the info policy name of this invest policy ext
	 */
	public void setInfoPolicyName(String infoPolicyName);

	/**
	 * Returns the info policy code of this invest policy ext.
	 *
	 * @return the info policy code of this invest policy ext
	 */
	@AutoEscape
	public String getInfoPolicyCode();

	/**
	 * Sets the info policy code of this invest policy ext.
	 *
	 * @param infoPolicyCode the info policy code of this invest policy ext
	 */
	public void setInfoPolicyCode(String infoPolicyCode);

	/**
	 * Returns the info propose group ID of this invest policy ext.
	 *
	 * @return the info propose group ID of this invest policy ext
	 */
	public long getInfoProposeGroupId();

	/**
	 * Sets the info propose group ID of this invest policy ext.
	 *
	 * @param infoProposeGroupId the info propose group ID of this invest policy ext
	 */
	public void setInfoProposeGroupId(long infoProposeGroupId);

	/**
	 * Returns the info verify group ID of this invest policy ext.
	 *
	 * @return the info verify group ID of this invest policy ext
	 */
	public long getInfoVerifyGroupId();

	/**
	 * Sets the info verify group ID of this invest policy ext.
	 *
	 * @param infoVerifyGroupId the info verify group ID of this invest policy ext
	 */
	public void setInfoVerifyGroupId(long infoVerifyGroupId);

	/**
	 * Returns the info policy date of this invest policy ext.
	 *
	 * @return the info policy date of this invest policy ext
	 */
	public Date getInfoPolicyDate();

	/**
	 * Sets the info policy date of this invest policy ext.
	 *
	 * @param infoPolicyDate the info policy date of this invest policy ext
	 */
	public void setInfoPolicyDate(Date infoPolicyDate);

	/**
	 * Returns the info policy deploy date of this invest policy ext.
	 *
	 * @return the info policy deploy date of this invest policy ext
	 */
	public Date getInfoPolicyDeployDate();

	/**
	 * Sets the info policy deploy date of this invest policy ext.
	 *
	 * @param infoPolicyDeployDate the info policy deploy date of this invest policy ext
	 */
	public void setInfoPolicyDeployDate(Date infoPolicyDeployDate);

	/**
	 * Returns the info responsible user ID of this invest policy ext.
	 *
	 * @return the info responsible user ID of this invest policy ext
	 */
	public long getInfoResponsibleUserId();

	/**
	 * Sets the info responsible user ID of this invest policy ext.
	 *
	 * @param infoResponsibleUserId the info responsible user ID of this invest policy ext
	 */
	public void setInfoResponsibleUserId(long infoResponsibleUserId);

	/**
	 * Returns the info responsible user uuid of this invest policy ext.
	 *
	 * @return the info responsible user uuid of this invest policy ext
	 * @throws SystemException if a system exception occurred
	 */
	public String getInfoResponsibleUserUuid() throws SystemException;

	/**
	 * Sets the info responsible user uuid of this invest policy ext.
	 *
	 * @param infoResponsibleUserUuid the info responsible user uuid of this invest policy ext
	 */
	public void setInfoResponsibleUserUuid(String infoResponsibleUserUuid);

	/**
	 * Returns the info service of this invest policy ext.
	 *
	 * @return the info service of this invest policy ext
	 */
	@AutoEscape
	public String getInfoService();

	/**
	 * Sets the info service of this invest policy ext.
	 *
	 * @param infoService the info service of this invest policy ext
	 */
	public void setInfoService(String infoService);

	/**
	 * Returns the info invest target of this invest policy ext.
	 *
	 * @return the info invest target of this invest policy ext
	 */
	@AutoEscape
	public String getInfoInvestTarget();

	/**
	 * Sets the info invest target of this invest policy ext.
	 *
	 * @param infoInvestTarget the info invest target of this invest policy ext
	 */
	public void setInfoInvestTarget(String infoInvestTarget);

	/**
	 * Returns the info invest location of this invest policy ext.
	 *
	 * @return the info invest location of this invest policy ext
	 */
	@AutoEscape
	public String getInfoInvestLocation();

	/**
	 * Sets the info invest location of this invest policy ext.
	 *
	 * @param infoInvestLocation the info invest location of this invest policy ext
	 */
	public void setInfoInvestLocation(String infoInvestLocation);

	/**
	 * Returns the info technique of this invest policy ext.
	 *
	 * @return the info technique of this invest policy ext
	 */
	@AutoEscape
	public String getInfoTechnique();

	/**
	 * Sets the info technique of this invest policy ext.
	 *
	 * @param infoTechnique the info technique of this invest policy ext
	 */
	public void setInfoTechnique(String infoTechnique);

	/**
	 * Returns the info invest name of this invest policy ext.
	 *
	 * @return the info invest name of this invest policy ext
	 */
	@AutoEscape
	public String getInfoInvestName();

	/**
	 * Sets the info invest name of this invest policy ext.
	 *
	 * @param infoInvestName the info invest name of this invest policy ext
	 */
	public void setInfoInvestName(String infoInvestName);

	/**
	 * Returns the info invest deadline of this invest policy ext.
	 *
	 * @return the info invest deadline of this invest policy ext
	 */
	public long getInfoInvestDeadline();

	/**
	 * Sets the info invest deadline of this invest policy ext.
	 *
	 * @param infoInvestDeadline the info invest deadline of this invest policy ext
	 */
	public void setInfoInvestDeadline(long infoInvestDeadline);

	/**
	 * Returns the info invest create group ID of this invest policy ext.
	 *
	 * @return the info invest create group ID of this invest policy ext
	 */
	public long getInfoInvestCreateGroupId();

	/**
	 * Sets the info invest create group ID of this invest policy ext.
	 *
	 * @param infoInvestCreateGroupId the info invest create group ID of this invest policy ext
	 */
	public void setInfoInvestCreateGroupId(long infoInvestCreateGroupId);

	/**
	 * Returns the info invest deploy group ID of this invest policy ext.
	 *
	 * @return the info invest deploy group ID of this invest policy ext
	 */
	public long getInfoInvestDeployGroupId();

	/**
	 * Sets the info invest deploy group ID of this invest policy ext.
	 *
	 * @param infoInvestDeployGroupId the info invest deploy group ID of this invest policy ext
	 */
	public void setInfoInvestDeployGroupId(long infoInvestDeployGroupId);

	/**
	 * Returns the cost capital of this invest policy ext.
	 *
	 * @return the cost capital of this invest policy ext
	 */
	public long getCostCapital();

	/**
	 * Sets the cost capital of this invest policy ext.
	 *
	 * @param costCapital the cost capital of this invest policy ext
	 */
	public void setCostCapital(long costCapital);

	/**
	 * Returns the cost compensate of this invest policy ext.
	 *
	 * @return the cost compensate of this invest policy ext
	 */
	public double getCostCompensate();

	/**
	 * Sets the cost compensate of this invest policy ext.
	 *
	 * @param costCompensate the cost compensate of this invest policy ext
	 */
	public void setCostCompensate(double costCompensate);

	/**
	 * Returns the cost compensate foreign of this invest policy ext.
	 *
	 * @return the cost compensate foreign of this invest policy ext
	 */
	public double getCostCompensateForeign();

	/**
	 * Sets the cost compensate foreign of this invest policy ext.
	 *
	 * @param costCompensateForeign the cost compensate foreign of this invest policy ext
	 */
	public void setCostCompensateForeign(double costCompensateForeign);

	/**
	 * Returns the cost equiment of this invest policy ext.
	 *
	 * @return the cost equiment of this invest policy ext
	 */
	public double getCostEquiment();

	/**
	 * Sets the cost equiment of this invest policy ext.
	 *
	 * @param costEquiment the cost equiment of this invest policy ext
	 */
	public void setCostEquiment(double costEquiment);

	/**
	 * Returns the cost equiment foreign of this invest policy ext.
	 *
	 * @return the cost equiment foreign of this invest policy ext
	 */
	public double getCostEquimentForeign();

	/**
	 * Sets the cost equiment foreign of this invest policy ext.
	 *
	 * @param costEquimentForeign the cost equiment foreign of this invest policy ext
	 */
	public void setCostEquimentForeign(double costEquimentForeign);

	/**
	 * Returns the cost contruction of this invest policy ext.
	 *
	 * @return the cost contruction of this invest policy ext
	 */
	public double getCostContruction();

	/**
	 * Sets the cost contruction of this invest policy ext.
	 *
	 * @param costContruction the cost contruction of this invest policy ext
	 */
	public void setCostContruction(double costContruction);

	/**
	 * Returns the cost contruction foreign of this invest policy ext.
	 *
	 * @return the cost contruction foreign of this invest policy ext
	 */
	public double getCostContructionForeign();

	/**
	 * Sets the cost contruction foreign of this invest policy ext.
	 *
	 * @param costContructionForeign the cost contruction foreign of this invest policy ext
	 */
	public void setCostContructionForeign(double costContructionForeign);

	/**
	 * Returns the cost advisory of this invest policy ext.
	 *
	 * @return the cost advisory of this invest policy ext
	 */
	public double getCostAdvisory();

	/**
	 * Sets the cost advisory of this invest policy ext.
	 *
	 * @param costAdvisory the cost advisory of this invest policy ext
	 */
	public void setCostAdvisory(double costAdvisory);

	/**
	 * Returns the cost advisory foreign of this invest policy ext.
	 *
	 * @return the cost advisory foreign of this invest policy ext
	 */
	public double getCostAdvisoryForeign();

	/**
	 * Sets the cost advisory foreign of this invest policy ext.
	 *
	 * @param costAdvisoryForeign the cost advisory foreign of this invest policy ext
	 */
	public void setCostAdvisoryForeign(double costAdvisoryForeign);

	/**
	 * Returns the cost manager of this invest policy ext.
	 *
	 * @return the cost manager of this invest policy ext
	 */
	public double getCostManager();

	/**
	 * Sets the cost manager of this invest policy ext.
	 *
	 * @param costManager the cost manager of this invest policy ext
	 */
	public void setCostManager(double costManager);

	/**
	 * Returns the cost manager foreign of this invest policy ext.
	 *
	 * @return the cost manager foreign of this invest policy ext
	 */
	public double getCostManagerForeign();

	/**
	 * Sets the cost manager foreign of this invest policy ext.
	 *
	 * @param costManagerForeign the cost manager foreign of this invest policy ext
	 */
	public void setCostManagerForeign(double costManagerForeign);

	/**
	 * Returns the cost other of this invest policy ext.
	 *
	 * @return the cost other of this invest policy ext
	 */
	public double getCostOther();

	/**
	 * Sets the cost other of this invest policy ext.
	 *
	 * @param costOther the cost other of this invest policy ext
	 */
	public void setCostOther(double costOther);

	/**
	 * Returns the cost other foreign of this invest policy ext.
	 *
	 * @return the cost other foreign of this invest policy ext
	 */
	public double getCostOtherForeign();

	/**
	 * Sets the cost other foreign of this invest policy ext.
	 *
	 * @param costOtherForeign the cost other foreign of this invest policy ext
	 */
	public void setCostOtherForeign(double costOtherForeign);

	/**
	 * Returns the cost provide of this invest policy ext.
	 *
	 * @return the cost provide of this invest policy ext
	 */
	public double getCostProvide();

	/**
	 * Sets the cost provide of this invest policy ext.
	 *
	 * @param costProvide the cost provide of this invest policy ext
	 */
	public void setCostProvide(double costProvide);

	/**
	 * Returns the cost provide foreign of this invest policy ext.
	 *
	 * @return the cost provide foreign of this invest policy ext
	 */
	public double getCostProvideForeign();

	/**
	 * Sets the cost provide foreign of this invest policy ext.
	 *
	 * @param costProvideForeign the cost provide foreign of this invest policy ext
	 */
	public void setCostProvideForeign(double costProvideForeign);

	/**
	 * Returns the cost local of this invest policy ext.
	 *
	 * @return the cost local of this invest policy ext
	 */
	public double getCostLocal();

	/**
	 * Sets the cost local of this invest policy ext.
	 *
	 * @param costLocal the cost local of this invest policy ext
	 */
	public void setCostLocal(double costLocal);

	/**
	 * Returns the cost foreign of this invest policy ext.
	 *
	 * @return the cost foreign of this invest policy ext
	 */
	public double getCostForeign();

	/**
	 * Sets the cost foreign of this invest policy ext.
	 *
	 * @param costForeign the cost foreign of this invest policy ext
	 */
	public void setCostForeign(double costForeign);

	/**
	 * Returns the cost foreign rate of this invest policy ext.
	 *
	 * @return the cost foreign rate of this invest policy ext
	 */
	public double getCostForeignRate();

	/**
	 * Sets the cost foreign rate of this invest policy ext.
	 *
	 * @param costForeignRate the cost foreign rate of this invest policy ext
	 */
	public void setCostForeignRate(double costForeignRate);

	/**
	 * Returns the cost tax of this invest policy ext.
	 *
	 * @return the cost tax of this invest policy ext
	 */
	public double getCostTax();

	/**
	 * Sets the cost tax of this invest policy ext.
	 *
	 * @param costTax the cost tax of this invest policy ext
	 */
	public void setCostTax(double costTax);

	/**
	 * Returns the cost total value of this invest policy ext.
	 *
	 * @return the cost total value of this invest policy ext
	 */
	public double getCostTotalValue();

	/**
	 * Sets the cost total value of this invest policy ext.
	 *
	 * @param costTotalValue the cost total value of this invest policy ext
	 */
	public void setCostTotalValue(double costTotalValue);

	/**
	 * Returns the cost total value tax of this invest policy ext.
	 *
	 * @return the cost total value tax of this invest policy ext
	 */
	public double getCostTotalValueTax();

	/**
	 * Sets the cost total value tax of this invest policy ext.
	 *
	 * @param costTotalValueTax the cost total value tax of this invest policy ext
	 */
	public void setCostTotalValueTax(double costTotalValueTax);

	/**
	 * Returns the decide deliverer user ID of this invest policy ext.
	 *
	 * @return the decide deliverer user ID of this invest policy ext
	 */
	public long getDecideDelivererUserId();

	/**
	 * Sets the decide deliverer user ID of this invest policy ext.
	 *
	 * @param decideDelivererUserId the decide deliverer user ID of this invest policy ext
	 */
	public void setDecideDelivererUserId(long decideDelivererUserId);

	/**
	 * Returns the decide deliverer user uuid of this invest policy ext.
	 *
	 * @return the decide deliverer user uuid of this invest policy ext
	 * @throws SystemException if a system exception occurred
	 */
	public String getDecideDelivererUserUuid() throws SystemException;

	/**
	 * Sets the decide deliverer user uuid of this invest policy ext.
	 *
	 * @param decideDelivererUserUuid the decide deliverer user uuid of this invest policy ext
	 */
	public void setDecideDelivererUserUuid(String decideDelivererUserUuid);

	/**
	 * Returns the decide receive user ID of this invest policy ext.
	 *
	 * @return the decide receive user ID of this invest policy ext
	 */
	public long getDecideReceiveUserId();

	/**
	 * Sets the decide receive user ID of this invest policy ext.
	 *
	 * @param decideReceiveUserId the decide receive user ID of this invest policy ext
	 */
	public void setDecideReceiveUserId(long decideReceiveUserId);

	/**
	 * Returns the decide receive user uuid of this invest policy ext.
	 *
	 * @return the decide receive user uuid of this invest policy ext
	 * @throws SystemException if a system exception occurred
	 */
	public String getDecideReceiveUserUuid() throws SystemException;

	/**
	 * Sets the decide receive user uuid of this invest policy ext.
	 *
	 * @param decideReceiveUserUuid the decide receive user uuid of this invest policy ext
	 */
	public void setDecideReceiveUserUuid(String decideReceiveUserUuid);

	/**
	 * Returns the decide ask date of this invest policy ext.
	 *
	 * @return the decide ask date of this invest policy ext
	 */
	public Date getDecideAskDate();

	/**
	 * Sets the decide ask date of this invest policy ext.
	 *
	 * @param decideAskDate the decide ask date of this invest policy ext
	 */
	public void setDecideAskDate(Date decideAskDate);

	/**
	 * Returns the decide deadline of this invest policy ext.
	 *
	 * @return the decide deadline of this invest policy ext
	 */
	public long getDecideDeadline();

	/**
	 * Sets the decide deadline of this invest policy ext.
	 *
	 * @param decideDeadline the decide deadline of this invest policy ext
	 */
	public void setDecideDeadline(long decideDeadline);

	/**
	 * Returns the decide finish date of this invest policy ext.
	 *
	 * @return the decide finish date of this invest policy ext
	 */
	public Date getDecideFinishDate();

	/**
	 * Sets the decide finish date of this invest policy ext.
	 *
	 * @param decideFinishDate the decide finish date of this invest policy ext
	 */
	public void setDecideFinishDate(Date decideFinishDate);

	/**
	 * Returns the decide description of this invest policy ext.
	 *
	 * @return the decide description of this invest policy ext
	 */
	@AutoEscape
	public String getDecideDescription();

	/**
	 * Sets the decide description of this invest policy ext.
	 *
	 * @param decideDescription the decide description of this invest policy ext
	 */
	public void setDecideDescription(String decideDescription);

	/**
	 * Returns the decide user ID of this invest policy ext.
	 *
	 * @return the decide user ID of this invest policy ext
	 */
	public long getDecideUserId();

	/**
	 * Sets the decide user ID of this invest policy ext.
	 *
	 * @param decideUserId the decide user ID of this invest policy ext
	 */
	public void setDecideUserId(long decideUserId);

	/**
	 * Returns the decide user uuid of this invest policy ext.
	 *
	 * @return the decide user uuid of this invest policy ext
	 * @throws SystemException if a system exception occurred
	 */
	public String getDecideUserUuid() throws SystemException;

	/**
	 * Sets the decide user uuid of this invest policy ext.
	 *
	 * @param decideUserUuid the decide user uuid of this invest policy ext
	 */
	public void setDecideUserUuid(String decideUserUuid);

	/**
	 * Returns the decide date of this invest policy ext.
	 *
	 * @return the decide date of this invest policy ext
	 */
	public Date getDecideDate();

	/**
	 * Sets the decide date of this invest policy ext.
	 *
	 * @param decideDate the decide date of this invest policy ext
	 */
	public void setDecideDate(Date decideDate);

	/**
	 * Returns the verify status of this invest policy ext.
	 *
	 * @return the verify status of this invest policy ext
	 */
	public long getVerifyStatus();

	/**
	 * Sets the verify status of this invest policy ext.
	 *
	 * @param verifyStatus the verify status of this invest policy ext
	 */
	public void setVerifyStatus(long verifyStatus);

	/**
	 * Returns the verify doc num of this invest policy ext.
	 *
	 * @return the verify doc num of this invest policy ext
	 */
	@AutoEscape
	public String getVerifyDocNum();

	/**
	 * Sets the verify doc num of this invest policy ext.
	 *
	 * @param verifyDocNum the verify doc num of this invest policy ext
	 */
	public void setVerifyDocNum(String verifyDocNum);

	/**
	 * Returns the verify date of this invest policy ext.
	 *
	 * @return the verify date of this invest policy ext
	 */
	public Date getVerifyDate();

	/**
	 * Sets the verify date of this invest policy ext.
	 *
	 * @param verifyDate the verify date of this invest policy ext
	 */
	public void setVerifyDate(Date verifyDate);

	/**
	 * Returns the verify user ID of this invest policy ext.
	 *
	 * @return the verify user ID of this invest policy ext
	 */
	public long getVerifyUserId();

	/**
	 * Sets the verify user ID of this invest policy ext.
	 *
	 * @param verifyUserId the verify user ID of this invest policy ext
	 */
	public void setVerifyUserId(long verifyUserId);

	/**
	 * Returns the verify user uuid of this invest policy ext.
	 *
	 * @return the verify user uuid of this invest policy ext
	 * @throws SystemException if a system exception occurred
	 */
	public String getVerifyUserUuid() throws SystemException;

	/**
	 * Sets the verify user uuid of this invest policy ext.
	 *
	 * @param verifyUserUuid the verify user uuid of this invest policy ext
	 */
	public void setVerifyUserUuid(String verifyUserUuid);

	/**
	 * Returns the verify description of this invest policy ext.
	 *
	 * @return the verify description of this invest policy ext
	 */
	@AutoEscape
	public String getVerifyDescription();

	/**
	 * Sets the verify description of this invest policy ext.
	 *
	 * @param verifyDescription the verify description of this invest policy ext
	 */
	public void setVerifyDescription(String verifyDescription);

	/**
	 * Returns the is active of this invest policy ext.
	 *
	 * @return the is active of this invest policy ext
	 */
	public long getIsActive();

	/**
	 * Sets the is active of this invest policy ext.
	 *
	 * @param isActive the is active of this invest policy ext
	 */
	public void setIsActive(long isActive);

	/**
	 * Returns the status of this invest policy ext.
	 *
	 * @return the status of this invest policy ext
	 */
	public long getStatus();

	/**
	 * Sets the status of this invest policy ext.
	 *
	 * @param status the status of this invest policy ext
	 */
	public void setStatus(long status);

	/**
	 * Returns the created ID of this invest policy ext.
	 *
	 * @return the created ID of this invest policy ext
	 */
	public long getCreatedId();

	/**
	 * Sets the created ID of this invest policy ext.
	 *
	 * @param createdId the created ID of this invest policy ext
	 */
	public void setCreatedId(long createdId);

	/**
	 * Returns the created date of this invest policy ext.
	 *
	 * @return the created date of this invest policy ext
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this invest policy ext.
	 *
	 * @param createdDate the created date of this invest policy ext
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the modifield ID of this invest policy ext.
	 *
	 * @return the modifield ID of this invest policy ext
	 */
	public long getModifieldId();

	/**
	 * Sets the modifield ID of this invest policy ext.
	 *
	 * @param modifieldId the modifield ID of this invest policy ext
	 */
	public void setModifieldId(long modifieldId);

	/**
	 * Returns the modifield date of this invest policy ext.
	 *
	 * @return the modifield date of this invest policy ext
	 */
	public Date getModifieldDate();

	/**
	 * Sets the modifield date of this invest policy ext.
	 *
	 * @param modifieldDate the modifield date of this invest policy ext
	 */
	public void setModifieldDate(Date modifieldDate);

	/**
	 * Returns the info policy type name of this invest policy ext.
	 *
	 * @return the info policy type name of this invest policy ext
	 */
	@AutoEscape
	public String getInfoPolicyTypeName();

	/**
	 * Sets the info policy type name of this invest policy ext.
	 *
	 * @param infoPolicyTypeName the info policy type name of this invest policy ext
	 */
	public void setInfoPolicyTypeName(String infoPolicyTypeName);

	/**
	 * Returns the info propose group name of this invest policy ext.
	 *
	 * @return the info propose group name of this invest policy ext
	 */
	@AutoEscape
	public String getInfoProposeGroupName();

	/**
	 * Sets the info propose group name of this invest policy ext.
	 *
	 * @param infoProposeGroupName the info propose group name of this invest policy ext
	 */
	public void setInfoProposeGroupName(String infoProposeGroupName);

	/**
	 * Returns the info verify group name of this invest policy ext.
	 *
	 * @return the info verify group name of this invest policy ext
	 */
	@AutoEscape
	public String getInfoVerifyGroupName();

	/**
	 * Sets the info verify group name of this invest policy ext.
	 *
	 * @param infoVerifyGroupName the info verify group name of this invest policy ext
	 */
	public void setInfoVerifyGroupName(String infoVerifyGroupName);

	/**
	 * Returns the info responsible user name of this invest policy ext.
	 *
	 * @return the info responsible user name of this invest policy ext
	 */
	@AutoEscape
	public String getInfoResponsibleUserName();

	/**
	 * Sets the info responsible user name of this invest policy ext.
	 *
	 * @param infoResponsibleUserName the info responsible user name of this invest policy ext
	 */
	public void setInfoResponsibleUserName(String infoResponsibleUserName);

	/**
	 * Returns the info invest create group name of this invest policy ext.
	 *
	 * @return the info invest create group name of this invest policy ext
	 */
	@AutoEscape
	public String getInfoInvestCreateGroupName();

	/**
	 * Sets the info invest create group name of this invest policy ext.
	 *
	 * @param infoInvestCreateGroupName the info invest create group name of this invest policy ext
	 */
	public void setInfoInvestCreateGroupName(String infoInvestCreateGroupName);

	/**
	 * Returns the info invest deploy group name of this invest policy ext.
	 *
	 * @return the info invest deploy group name of this invest policy ext
	 */
	@AutoEscape
	public String getInfoInvestDeployGroupName();

	/**
	 * Sets the info invest deploy group name of this invest policy ext.
	 *
	 * @param infoInvestDeployGroupName the info invest deploy group name of this invest policy ext
	 */
	public void setInfoInvestDeployGroupName(String infoInvestDeployGroupName);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.viettel.ims.core.model.InvestPolicyExt investPolicyExt);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.viettel.ims.core.model.InvestPolicyExt> toCacheModel();

	@Override
	public com.viettel.ims.core.model.InvestPolicyExt toEscapedModel();

	@Override
	public com.viettel.ims.core.model.InvestPolicyExt toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
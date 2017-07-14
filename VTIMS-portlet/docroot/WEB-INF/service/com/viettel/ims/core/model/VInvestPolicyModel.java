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
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the VInvestPolicy service. Represents a row in the &quot;V_INVEST_POLICY&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.viettel.ims.core.model.impl.VInvestPolicyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.viettel.ims.core.model.impl.VInvestPolicyImpl}.
 * </p>
 *
 * @author MrNet
 * @see VInvestPolicy
 * @see com.viettel.ims.core.model.impl.VInvestPolicyImpl
 * @see com.viettel.ims.core.model.impl.VInvestPolicyModelImpl
 * @generated
 */
public interface VInvestPolicyModel extends BaseModel<VInvestPolicy> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a v invest policy model instance should use the {@link VInvestPolicy} interface instead.
	 */

	/**
	 * Returns the primary key of this v invest policy.
	 *
	 * @return the primary key of this v invest policy
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this v invest policy.
	 *
	 * @param primaryKey the primary key of this v invest policy
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the invest policy ID of this v invest policy.
	 *
	 * @return the invest policy ID of this v invest policy
	 */
	public long getInvestPolicyId();

	/**
	 * Sets the invest policy ID of this v invest policy.
	 *
	 * @param investPolicyId the invest policy ID of this v invest policy
	 */
	public void setInvestPolicyId(long investPolicyId);

	/**
	 * Returns the info policy type name of this v invest policy.
	 *
	 * @return the info policy type name of this v invest policy
	 */
	@AutoEscape
	public String getInfoPolicyTypeName();

	/**
	 * Sets the info policy type name of this v invest policy.
	 *
	 * @param infoPolicyTypeName the info policy type name of this v invest policy
	 */
	public void setInfoPolicyTypeName(String infoPolicyTypeName);

	/**
	 * Returns the info policy name of this v invest policy.
	 *
	 * @return the info policy name of this v invest policy
	 */
	@AutoEscape
	public String getInfoPolicyName();

	/**
	 * Sets the info policy name of this v invest policy.
	 *
	 * @param infoPolicyName the info policy name of this v invest policy
	 */
	public void setInfoPolicyName(String infoPolicyName);

	/**
	 * Returns the info propose group name of this v invest policy.
	 *
	 * @return the info propose group name of this v invest policy
	 */
	@AutoEscape
	public String getInfoProposeGroupName();

	/**
	 * Sets the info propose group name of this v invest policy.
	 *
	 * @param infoProposeGroupName the info propose group name of this v invest policy
	 */
	public void setInfoProposeGroupName(String infoProposeGroupName);

	/**
	 * Returns the info verify group name of this v invest policy.
	 *
	 * @return the info verify group name of this v invest policy
	 */
	@AutoEscape
	public String getInfoVerifyGroupName();

	/**
	 * Sets the info verify group name of this v invest policy.
	 *
	 * @param infoVerifyGroupName the info verify group name of this v invest policy
	 */
	public void setInfoVerifyGroupName(String infoVerifyGroupName);

	/**
	 * Returns the info policy date of this v invest policy.
	 *
	 * @return the info policy date of this v invest policy
	 */
	public Date getInfoPolicyDate();

	/**
	 * Sets the info policy date of this v invest policy.
	 *
	 * @param infoPolicyDate the info policy date of this v invest policy
	 */
	public void setInfoPolicyDate(Date infoPolicyDate);

	/**
	 * Returns the info policy deploy date of this v invest policy.
	 *
	 * @return the info policy deploy date of this v invest policy
	 */
	public Date getInfoPolicyDeployDate();

	/**
	 * Sets the info policy deploy date of this v invest policy.
	 *
	 * @param infoPolicyDeployDate the info policy deploy date of this v invest policy
	 */
	public void setInfoPolicyDeployDate(Date infoPolicyDeployDate);

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
	public int compareTo(com.viettel.ims.core.model.VInvestPolicy vInvestPolicy);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.viettel.ims.core.model.VInvestPolicy> toCacheModel();

	@Override
	public com.viettel.ims.core.model.VInvestPolicy toEscapedModel();

	@Override
	public com.viettel.ims.core.model.VInvestPolicy toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
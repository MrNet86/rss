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
 * This class is a wrapper for {@link VInvestPolicy}.
 * </p>
 *
 * @author MrNet
 * @see VInvestPolicy
 * @generated
 */
public class VInvestPolicyWrapper implements VInvestPolicy,
	ModelWrapper<VInvestPolicy> {
	public VInvestPolicyWrapper(VInvestPolicy vInvestPolicy) {
		_vInvestPolicy = vInvestPolicy;
	}

	@Override
	public Class<?> getModelClass() {
		return VInvestPolicy.class;
	}

	@Override
	public String getModelClassName() {
		return VInvestPolicy.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("investPolicyId", getInvestPolicyId());
		attributes.put("infoPolicyTypeName", getInfoPolicyTypeName());
		attributes.put("infoPolicyName", getInfoPolicyName());
		attributes.put("infoProposeGroupName", getInfoProposeGroupName());
		attributes.put("infoVerifyGroupName", getInfoVerifyGroupName());
		attributes.put("infoPolicyDate", getInfoPolicyDate());
		attributes.put("infoPolicyDeployDate", getInfoPolicyDeployDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long investPolicyId = (Long)attributes.get("investPolicyId");

		if (investPolicyId != null) {
			setInvestPolicyId(investPolicyId);
		}

		String infoPolicyTypeName = (String)attributes.get("infoPolicyTypeName");

		if (infoPolicyTypeName != null) {
			setInfoPolicyTypeName(infoPolicyTypeName);
		}

		String infoPolicyName = (String)attributes.get("infoPolicyName");

		if (infoPolicyName != null) {
			setInfoPolicyName(infoPolicyName);
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

		Date infoPolicyDate = (Date)attributes.get("infoPolicyDate");

		if (infoPolicyDate != null) {
			setInfoPolicyDate(infoPolicyDate);
		}

		Date infoPolicyDeployDate = (Date)attributes.get("infoPolicyDeployDate");

		if (infoPolicyDeployDate != null) {
			setInfoPolicyDeployDate(infoPolicyDeployDate);
		}
	}

	/**
	* Returns the primary key of this v invest policy.
	*
	* @return the primary key of this v invest policy
	*/
	@Override
	public long getPrimaryKey() {
		return _vInvestPolicy.getPrimaryKey();
	}

	/**
	* Sets the primary key of this v invest policy.
	*
	* @param primaryKey the primary key of this v invest policy
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vInvestPolicy.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the invest policy ID of this v invest policy.
	*
	* @return the invest policy ID of this v invest policy
	*/
	@Override
	public long getInvestPolicyId() {
		return _vInvestPolicy.getInvestPolicyId();
	}

	/**
	* Sets the invest policy ID of this v invest policy.
	*
	* @param investPolicyId the invest policy ID of this v invest policy
	*/
	@Override
	public void setInvestPolicyId(long investPolicyId) {
		_vInvestPolicy.setInvestPolicyId(investPolicyId);
	}

	/**
	* Returns the info policy type name of this v invest policy.
	*
	* @return the info policy type name of this v invest policy
	*/
	@Override
	public java.lang.String getInfoPolicyTypeName() {
		return _vInvestPolicy.getInfoPolicyTypeName();
	}

	/**
	* Sets the info policy type name of this v invest policy.
	*
	* @param infoPolicyTypeName the info policy type name of this v invest policy
	*/
	@Override
	public void setInfoPolicyTypeName(java.lang.String infoPolicyTypeName) {
		_vInvestPolicy.setInfoPolicyTypeName(infoPolicyTypeName);
	}

	/**
	* Returns the info policy name of this v invest policy.
	*
	* @return the info policy name of this v invest policy
	*/
	@Override
	public java.lang.String getInfoPolicyName() {
		return _vInvestPolicy.getInfoPolicyName();
	}

	/**
	* Sets the info policy name of this v invest policy.
	*
	* @param infoPolicyName the info policy name of this v invest policy
	*/
	@Override
	public void setInfoPolicyName(java.lang.String infoPolicyName) {
		_vInvestPolicy.setInfoPolicyName(infoPolicyName);
	}

	/**
	* Returns the info propose group name of this v invest policy.
	*
	* @return the info propose group name of this v invest policy
	*/
	@Override
	public java.lang.String getInfoProposeGroupName() {
		return _vInvestPolicy.getInfoProposeGroupName();
	}

	/**
	* Sets the info propose group name of this v invest policy.
	*
	* @param infoProposeGroupName the info propose group name of this v invest policy
	*/
	@Override
	public void setInfoProposeGroupName(java.lang.String infoProposeGroupName) {
		_vInvestPolicy.setInfoProposeGroupName(infoProposeGroupName);
	}

	/**
	* Returns the info verify group name of this v invest policy.
	*
	* @return the info verify group name of this v invest policy
	*/
	@Override
	public java.lang.String getInfoVerifyGroupName() {
		return _vInvestPolicy.getInfoVerifyGroupName();
	}

	/**
	* Sets the info verify group name of this v invest policy.
	*
	* @param infoVerifyGroupName the info verify group name of this v invest policy
	*/
	@Override
	public void setInfoVerifyGroupName(java.lang.String infoVerifyGroupName) {
		_vInvestPolicy.setInfoVerifyGroupName(infoVerifyGroupName);
	}

	/**
	* Returns the info policy date of this v invest policy.
	*
	* @return the info policy date of this v invest policy
	*/
	@Override
	public java.util.Date getInfoPolicyDate() {
		return _vInvestPolicy.getInfoPolicyDate();
	}

	/**
	* Sets the info policy date of this v invest policy.
	*
	* @param infoPolicyDate the info policy date of this v invest policy
	*/
	@Override
	public void setInfoPolicyDate(java.util.Date infoPolicyDate) {
		_vInvestPolicy.setInfoPolicyDate(infoPolicyDate);
	}

	/**
	* Returns the info policy deploy date of this v invest policy.
	*
	* @return the info policy deploy date of this v invest policy
	*/
	@Override
	public java.util.Date getInfoPolicyDeployDate() {
		return _vInvestPolicy.getInfoPolicyDeployDate();
	}

	/**
	* Sets the info policy deploy date of this v invest policy.
	*
	* @param infoPolicyDeployDate the info policy deploy date of this v invest policy
	*/
	@Override
	public void setInfoPolicyDeployDate(java.util.Date infoPolicyDeployDate) {
		_vInvestPolicy.setInfoPolicyDeployDate(infoPolicyDeployDate);
	}

	@Override
	public boolean isNew() {
		return _vInvestPolicy.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vInvestPolicy.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vInvestPolicy.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vInvestPolicy.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vInvestPolicy.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vInvestPolicy.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vInvestPolicy.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vInvestPolicy.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vInvestPolicy.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vInvestPolicy.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vInvestPolicy.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VInvestPolicyWrapper((VInvestPolicy)_vInvestPolicy.clone());
	}

	@Override
	public int compareTo(com.viettel.ims.core.model.VInvestPolicy vInvestPolicy) {
		return _vInvestPolicy.compareTo(vInvestPolicy);
	}

	@Override
	public int hashCode() {
		return _vInvestPolicy.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.viettel.ims.core.model.VInvestPolicy> toCacheModel() {
		return _vInvestPolicy.toCacheModel();
	}

	@Override
	public com.viettel.ims.core.model.VInvestPolicy toEscapedModel() {
		return new VInvestPolicyWrapper(_vInvestPolicy.toEscapedModel());
	}

	@Override
	public com.viettel.ims.core.model.VInvestPolicy toUnescapedModel() {
		return new VInvestPolicyWrapper(_vInvestPolicy.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vInvestPolicy.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vInvestPolicy.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vInvestPolicy.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VInvestPolicyWrapper)) {
			return false;
		}

		VInvestPolicyWrapper vInvestPolicyWrapper = (VInvestPolicyWrapper)obj;

		if (Validator.equals(_vInvestPolicy, vInvestPolicyWrapper._vInvestPolicy)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public VInvestPolicy getWrappedVInvestPolicy() {
		return _vInvestPolicy;
	}

	@Override
	public VInvestPolicy getWrappedModel() {
		return _vInvestPolicy;
	}

	@Override
	public void resetOriginalValues() {
		_vInvestPolicy.resetOriginalValues();
	}

	private VInvestPolicy _vInvestPolicy;
}
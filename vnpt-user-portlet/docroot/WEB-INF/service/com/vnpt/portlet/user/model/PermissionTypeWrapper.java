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

package com.vnpt.portlet.user.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PermissionType}.
 * </p>
 *
 * @author ToanNQ86
 * @see PermissionType
 * @generated
 */
public class PermissionTypeWrapper implements PermissionType,
	ModelWrapper<PermissionType> {
	public PermissionTypeWrapper(PermissionType permissionType) {
		_permissionType = permissionType;
	}

	@Override
	public Class<?> getModelClass() {
		return PermissionType.class;
	}

	@Override
	public String getModelClassName() {
		return PermissionType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("permissionTypeId", getPermissionTypeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("typeName", getTypeName());
		attributes.put("typeCode", getTypeCode());
		attributes.put("isActive", getIsActive());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long permissionTypeId = (Long)attributes.get("permissionTypeId");

		if (permissionTypeId != null) {
			setPermissionTypeId(permissionTypeId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String typeName = (String)attributes.get("typeName");

		if (typeName != null) {
			setTypeName(typeName);
		}

		String typeCode = (String)attributes.get("typeCode");

		if (typeCode != null) {
			setTypeCode(typeCode);
		}

		Integer isActive = (Integer)attributes.get("isActive");

		if (isActive != null) {
			setIsActive(isActive);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this permission type.
	*
	* @return the primary key of this permission type
	*/
	@Override
	public long getPrimaryKey() {
		return _permissionType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this permission type.
	*
	* @param primaryKey the primary key of this permission type
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_permissionType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the permission type ID of this permission type.
	*
	* @return the permission type ID of this permission type
	*/
	@Override
	public long getPermissionTypeId() {
		return _permissionType.getPermissionTypeId();
	}

	/**
	* Sets the permission type ID of this permission type.
	*
	* @param permissionTypeId the permission type ID of this permission type
	*/
	@Override
	public void setPermissionTypeId(long permissionTypeId) {
		_permissionType.setPermissionTypeId(permissionTypeId);
	}

	/**
	* Returns the group ID of this permission type.
	*
	* @return the group ID of this permission type
	*/
	@Override
	public long getGroupId() {
		return _permissionType.getGroupId();
	}

	/**
	* Sets the group ID of this permission type.
	*
	* @param groupId the group ID of this permission type
	*/
	@Override
	public void setGroupId(long groupId) {
		_permissionType.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this permission type.
	*
	* @return the company ID of this permission type
	*/
	@Override
	public long getCompanyId() {
		return _permissionType.getCompanyId();
	}

	/**
	* Sets the company ID of this permission type.
	*
	* @param companyId the company ID of this permission type
	*/
	@Override
	public void setCompanyId(long companyId) {
		_permissionType.setCompanyId(companyId);
	}

	/**
	* Returns the type name of this permission type.
	*
	* @return the type name of this permission type
	*/
	@Override
	public java.lang.String getTypeName() {
		return _permissionType.getTypeName();
	}

	/**
	* Sets the type name of this permission type.
	*
	* @param typeName the type name of this permission type
	*/
	@Override
	public void setTypeName(java.lang.String typeName) {
		_permissionType.setTypeName(typeName);
	}

	/**
	* Returns the type code of this permission type.
	*
	* @return the type code of this permission type
	*/
	@Override
	public java.lang.String getTypeCode() {
		return _permissionType.getTypeCode();
	}

	/**
	* Sets the type code of this permission type.
	*
	* @param typeCode the type code of this permission type
	*/
	@Override
	public void setTypeCode(java.lang.String typeCode) {
		_permissionType.setTypeCode(typeCode);
	}

	/**
	* Returns the is active of this permission type.
	*
	* @return the is active of this permission type
	*/
	@Override
	public int getIsActive() {
		return _permissionType.getIsActive();
	}

	/**
	* Sets the is active of this permission type.
	*
	* @param isActive the is active of this permission type
	*/
	@Override
	public void setIsActive(int isActive) {
		_permissionType.setIsActive(isActive);
	}

	/**
	* Returns the description of this permission type.
	*
	* @return the description of this permission type
	*/
	@Override
	public java.lang.String getDescription() {
		return _permissionType.getDescription();
	}

	/**
	* Sets the description of this permission type.
	*
	* @param description the description of this permission type
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_permissionType.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _permissionType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_permissionType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _permissionType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_permissionType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _permissionType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _permissionType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_permissionType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _permissionType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_permissionType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_permissionType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_permissionType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PermissionTypeWrapper((PermissionType)_permissionType.clone());
	}

	@Override
	public int compareTo(
		com.vnpt.portlet.user.model.PermissionType permissionType) {
		return _permissionType.compareTo(permissionType);
	}

	@Override
	public int hashCode() {
		return _permissionType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vnpt.portlet.user.model.PermissionType> toCacheModel() {
		return _permissionType.toCacheModel();
	}

	@Override
	public com.vnpt.portlet.user.model.PermissionType toEscapedModel() {
		return new PermissionTypeWrapper(_permissionType.toEscapedModel());
	}

	@Override
	public com.vnpt.portlet.user.model.PermissionType toUnescapedModel() {
		return new PermissionTypeWrapper(_permissionType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _permissionType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _permissionType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_permissionType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PermissionTypeWrapper)) {
			return false;
		}

		PermissionTypeWrapper permissionTypeWrapper = (PermissionTypeWrapper)obj;

		if (Validator.equals(_permissionType,
					permissionTypeWrapper._permissionType)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PermissionType getWrappedPermissionType() {
		return _permissionType;
	}

	@Override
	public PermissionType getWrappedModel() {
		return _permissionType;
	}

	@Override
	public void resetOriginalValues() {
		_permissionType.resetOriginalValues();
	}

	private PermissionType _permissionType;
}
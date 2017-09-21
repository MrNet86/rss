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
 * This class is a wrapper for {@link PermissionGroup}.
 * </p>
 *
 * @author ToanNQ86
 * @see PermissionGroup
 * @generated
 */
public class PermissionGroupWrapper implements PermissionGroup,
	ModelWrapper<PermissionGroup> {
	public PermissionGroupWrapper(PermissionGroup permissionGroup) {
		_permissionGroup = permissionGroup;
	}

	@Override
	public Class<?> getModelClass() {
		return PermissionGroup.class;
	}

	@Override
	public String getModelClassName() {
		return PermissionGroup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("permissionGroupId", getPermissionGroupId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupName", getGroupName());
		attributes.put("groupCode", getGroupCode());
		attributes.put("isActive", getIsActive());
		attributes.put("description", getDescription());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long permissionGroupId = (Long)attributes.get("permissionGroupId");

		if (permissionGroupId != null) {
			setPermissionGroupId(permissionGroupId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String groupName = (String)attributes.get("groupName");

		if (groupName != null) {
			setGroupName(groupName);
		}

		String groupCode = (String)attributes.get("groupCode");

		if (groupCode != null) {
			setGroupCode(groupCode);
		}

		Integer isActive = (Integer)attributes.get("isActive");

		if (isActive != null) {
			setIsActive(isActive);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	/**
	* Returns the primary key of this permission group.
	*
	* @return the primary key of this permission group
	*/
	@Override
	public long getPrimaryKey() {
		return _permissionGroup.getPrimaryKey();
	}

	/**
	* Sets the primary key of this permission group.
	*
	* @param primaryKey the primary key of this permission group
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_permissionGroup.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the permission group ID of this permission group.
	*
	* @return the permission group ID of this permission group
	*/
	@Override
	public long getPermissionGroupId() {
		return _permissionGroup.getPermissionGroupId();
	}

	/**
	* Sets the permission group ID of this permission group.
	*
	* @param permissionGroupId the permission group ID of this permission group
	*/
	@Override
	public void setPermissionGroupId(long permissionGroupId) {
		_permissionGroup.setPermissionGroupId(permissionGroupId);
	}

	/**
	* Returns the group ID of this permission group.
	*
	* @return the group ID of this permission group
	*/
	@Override
	public long getGroupId() {
		return _permissionGroup.getGroupId();
	}

	/**
	* Sets the group ID of this permission group.
	*
	* @param groupId the group ID of this permission group
	*/
	@Override
	public void setGroupId(long groupId) {
		_permissionGroup.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this permission group.
	*
	* @return the company ID of this permission group
	*/
	@Override
	public long getCompanyId() {
		return _permissionGroup.getCompanyId();
	}

	/**
	* Sets the company ID of this permission group.
	*
	* @param companyId the company ID of this permission group
	*/
	@Override
	public void setCompanyId(long companyId) {
		_permissionGroup.setCompanyId(companyId);
	}

	/**
	* Returns the group name of this permission group.
	*
	* @return the group name of this permission group
	*/
	@Override
	public java.lang.String getGroupName() {
		return _permissionGroup.getGroupName();
	}

	/**
	* Sets the group name of this permission group.
	*
	* @param groupName the group name of this permission group
	*/
	@Override
	public void setGroupName(java.lang.String groupName) {
		_permissionGroup.setGroupName(groupName);
	}

	/**
	* Returns the group code of this permission group.
	*
	* @return the group code of this permission group
	*/
	@Override
	public java.lang.String getGroupCode() {
		return _permissionGroup.getGroupCode();
	}

	/**
	* Sets the group code of this permission group.
	*
	* @param groupCode the group code of this permission group
	*/
	@Override
	public void setGroupCode(java.lang.String groupCode) {
		_permissionGroup.setGroupCode(groupCode);
	}

	/**
	* Returns the is active of this permission group.
	*
	* @return the is active of this permission group
	*/
	@Override
	public int getIsActive() {
		return _permissionGroup.getIsActive();
	}

	/**
	* Sets the is active of this permission group.
	*
	* @param isActive the is active of this permission group
	*/
	@Override
	public void setIsActive(int isActive) {
		_permissionGroup.setIsActive(isActive);
	}

	/**
	* Returns the description of this permission group.
	*
	* @return the description of this permission group
	*/
	@Override
	public java.lang.String getDescription() {
		return _permissionGroup.getDescription();
	}

	/**
	* Sets the description of this permission group.
	*
	* @param description the description of this permission group
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_permissionGroup.setDescription(description);
	}

	/**
	* Returns the role ID of this permission group.
	*
	* @return the role ID of this permission group
	*/
	@Override
	public long getRoleId() {
		return _permissionGroup.getRoleId();
	}

	/**
	* Sets the role ID of this permission group.
	*
	* @param roleId the role ID of this permission group
	*/
	@Override
	public void setRoleId(long roleId) {
		_permissionGroup.setRoleId(roleId);
	}

	@Override
	public boolean isNew() {
		return _permissionGroup.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_permissionGroup.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _permissionGroup.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_permissionGroup.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _permissionGroup.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _permissionGroup.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_permissionGroup.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _permissionGroup.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_permissionGroup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_permissionGroup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_permissionGroup.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PermissionGroupWrapper((PermissionGroup)_permissionGroup.clone());
	}

	@Override
	public int compareTo(
		com.vnpt.portlet.user.model.PermissionGroup permissionGroup) {
		return _permissionGroup.compareTo(permissionGroup);
	}

	@Override
	public int hashCode() {
		return _permissionGroup.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vnpt.portlet.user.model.PermissionGroup> toCacheModel() {
		return _permissionGroup.toCacheModel();
	}

	@Override
	public com.vnpt.portlet.user.model.PermissionGroup toEscapedModel() {
		return new PermissionGroupWrapper(_permissionGroup.toEscapedModel());
	}

	@Override
	public com.vnpt.portlet.user.model.PermissionGroup toUnescapedModel() {
		return new PermissionGroupWrapper(_permissionGroup.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _permissionGroup.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _permissionGroup.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_permissionGroup.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PermissionGroupWrapper)) {
			return false;
		}

		PermissionGroupWrapper permissionGroupWrapper = (PermissionGroupWrapper)obj;

		if (Validator.equals(_permissionGroup,
					permissionGroupWrapper._permissionGroup)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PermissionGroup getWrappedPermissionGroup() {
		return _permissionGroup;
	}

	@Override
	public PermissionGroup getWrappedModel() {
		return _permissionGroup;
	}

	@Override
	public void resetOriginalValues() {
		_permissionGroup.resetOriginalValues();
	}

	private PermissionGroup _permissionGroup;
}
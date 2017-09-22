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
 * This class is a wrapper for {@link GroupRoles}.
 * </p>
 *
 * @author ToanNQ86
 * @see GroupRoles
 * @generated
 */
public class GroupRolesWrapper implements GroupRoles, ModelWrapper<GroupRoles> {
	public GroupRolesWrapper(GroupRoles groupRoles) {
		_groupRoles = groupRoles;
	}

	@Override
	public Class<?> getModelClass() {
		return GroupRoles.class;
	}

	@Override
	public String getModelClassName() {
		return GroupRoles.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("permissionGroupId", getPermissionGroupId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long permissionGroupId = (Long)attributes.get("permissionGroupId");

		if (permissionGroupId != null) {
			setPermissionGroupId(permissionGroupId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	/**
	* Returns the primary key of this group roles.
	*
	* @return the primary key of this group roles
	*/
	@Override
	public com.vnpt.portlet.user.service.persistence.GroupRolesPK getPrimaryKey() {
		return _groupRoles.getPrimaryKey();
	}

	/**
	* Sets the primary key of this group roles.
	*
	* @param primaryKey the primary key of this group roles
	*/
	@Override
	public void setPrimaryKey(
		com.vnpt.portlet.user.service.persistence.GroupRolesPK primaryKey) {
		_groupRoles.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the permission group ID of this group roles.
	*
	* @return the permission group ID of this group roles
	*/
	@Override
	public long getPermissionGroupId() {
		return _groupRoles.getPermissionGroupId();
	}

	/**
	* Sets the permission group ID of this group roles.
	*
	* @param permissionGroupId the permission group ID of this group roles
	*/
	@Override
	public void setPermissionGroupId(long permissionGroupId) {
		_groupRoles.setPermissionGroupId(permissionGroupId);
	}

	/**
	* Returns the role ID of this group roles.
	*
	* @return the role ID of this group roles
	*/
	@Override
	public long getRoleId() {
		return _groupRoles.getRoleId();
	}

	/**
	* Sets the role ID of this group roles.
	*
	* @param roleId the role ID of this group roles
	*/
	@Override
	public void setRoleId(long roleId) {
		_groupRoles.setRoleId(roleId);
	}

	@Override
	public boolean isNew() {
		return _groupRoles.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_groupRoles.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _groupRoles.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_groupRoles.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _groupRoles.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _groupRoles.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_groupRoles.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _groupRoles.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_groupRoles.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_groupRoles.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_groupRoles.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new GroupRolesWrapper((GroupRoles)_groupRoles.clone());
	}

	@Override
	public int compareTo(com.vnpt.portlet.user.model.GroupRoles groupRoles) {
		return _groupRoles.compareTo(groupRoles);
	}

	@Override
	public int hashCode() {
		return _groupRoles.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vnpt.portlet.user.model.GroupRoles> toCacheModel() {
		return _groupRoles.toCacheModel();
	}

	@Override
	public com.vnpt.portlet.user.model.GroupRoles toEscapedModel() {
		return new GroupRolesWrapper(_groupRoles.toEscapedModel());
	}

	@Override
	public com.vnpt.portlet.user.model.GroupRoles toUnescapedModel() {
		return new GroupRolesWrapper(_groupRoles.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _groupRoles.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _groupRoles.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_groupRoles.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof GroupRolesWrapper)) {
			return false;
		}

		GroupRolesWrapper groupRolesWrapper = (GroupRolesWrapper)obj;

		if (Validator.equals(_groupRoles, groupRolesWrapper._groupRoles)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public GroupRoles getWrappedGroupRoles() {
		return _groupRoles;
	}

	@Override
	public GroupRoles getWrappedModel() {
		return _groupRoles;
	}

	@Override
	public void resetOriginalValues() {
		_groupRoles.resetOriginalValues();
	}

	private GroupRoles _groupRoles;
}
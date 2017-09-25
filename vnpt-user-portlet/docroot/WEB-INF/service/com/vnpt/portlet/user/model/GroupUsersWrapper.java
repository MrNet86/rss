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
 * This class is a wrapper for {@link GroupUsers}.
 * </p>
 *
 * @author ToanNQ86
 * @see GroupUsers
 * @generated
 */
public class GroupUsersWrapper implements GroupUsers, ModelWrapper<GroupUsers> {
	public GroupUsersWrapper(GroupUsers groupUsers) {
		_groupUsers = groupUsers;
	}

	@Override
	public Class<?> getModelClass() {
		return GroupUsers.class;
	}

	@Override
	public String getModelClassName() {
		return GroupUsers.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("permissionGroupId", getPermissionGroupId());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long permissionGroupId = (Long)attributes.get("permissionGroupId");

		if (permissionGroupId != null) {
			setPermissionGroupId(permissionGroupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	/**
	* Returns the primary key of this group users.
	*
	* @return the primary key of this group users
	*/
	@Override
	public com.vnpt.portlet.user.service.persistence.GroupUsersPK getPrimaryKey() {
		return _groupUsers.getPrimaryKey();
	}

	/**
	* Sets the primary key of this group users.
	*
	* @param primaryKey the primary key of this group users
	*/
	@Override
	public void setPrimaryKey(
		com.vnpt.portlet.user.service.persistence.GroupUsersPK primaryKey) {
		_groupUsers.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the permission group ID of this group users.
	*
	* @return the permission group ID of this group users
	*/
	@Override
	public long getPermissionGroupId() {
		return _groupUsers.getPermissionGroupId();
	}

	/**
	* Sets the permission group ID of this group users.
	*
	* @param permissionGroupId the permission group ID of this group users
	*/
	@Override
	public void setPermissionGroupId(long permissionGroupId) {
		_groupUsers.setPermissionGroupId(permissionGroupId);
	}

	/**
	* Returns the user ID of this group users.
	*
	* @return the user ID of this group users
	*/
	@Override
	public long getUserId() {
		return _groupUsers.getUserId();
	}

	/**
	* Sets the user ID of this group users.
	*
	* @param userId the user ID of this group users
	*/
	@Override
	public void setUserId(long userId) {
		_groupUsers.setUserId(userId);
	}

	/**
	* Returns the user uuid of this group users.
	*
	* @return the user uuid of this group users
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _groupUsers.getUserUuid();
	}

	/**
	* Sets the user uuid of this group users.
	*
	* @param userUuid the user uuid of this group users
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_groupUsers.setUserUuid(userUuid);
	}

	@Override
	public boolean isNew() {
		return _groupUsers.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_groupUsers.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _groupUsers.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_groupUsers.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _groupUsers.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _groupUsers.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_groupUsers.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _groupUsers.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_groupUsers.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_groupUsers.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_groupUsers.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new GroupUsersWrapper((GroupUsers)_groupUsers.clone());
	}

	@Override
	public int compareTo(com.vnpt.portlet.user.model.GroupUsers groupUsers) {
		return _groupUsers.compareTo(groupUsers);
	}

	@Override
	public int hashCode() {
		return _groupUsers.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vnpt.portlet.user.model.GroupUsers> toCacheModel() {
		return _groupUsers.toCacheModel();
	}

	@Override
	public com.vnpt.portlet.user.model.GroupUsers toEscapedModel() {
		return new GroupUsersWrapper(_groupUsers.toEscapedModel());
	}

	@Override
	public com.vnpt.portlet.user.model.GroupUsers toUnescapedModel() {
		return new GroupUsersWrapper(_groupUsers.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _groupUsers.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _groupUsers.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_groupUsers.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof GroupUsersWrapper)) {
			return false;
		}

		GroupUsersWrapper groupUsersWrapper = (GroupUsersWrapper)obj;

		if (Validator.equals(_groupUsers, groupUsersWrapper._groupUsers)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public GroupUsers getWrappedGroupUsers() {
		return _groupUsers;
	}

	@Override
	public GroupUsers getWrappedModel() {
		return _groupUsers;
	}

	@Override
	public void resetOriginalValues() {
		_groupUsers.resetOriginalValues();
	}

	private GroupUsers _groupUsers;
}
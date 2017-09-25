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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import com.vnpt.portlet.user.service.persistence.GroupUsersPK;

import java.io.Serializable;

/**
 * The base model interface for the GroupUsers service. Represents a row in the &quot;eportal_group_users&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vnpt.portlet.user.model.impl.GroupUsersModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vnpt.portlet.user.model.impl.GroupUsersImpl}.
 * </p>
 *
 * @author ToanNQ86
 * @see GroupUsers
 * @see com.vnpt.portlet.user.model.impl.GroupUsersImpl
 * @see com.vnpt.portlet.user.model.impl.GroupUsersModelImpl
 * @generated
 */
public interface GroupUsersModel extends BaseModel<GroupUsers> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a group users model instance should use the {@link GroupUsers} interface instead.
	 */

	/**
	 * Returns the primary key of this group users.
	 *
	 * @return the primary key of this group users
	 */
	public GroupUsersPK getPrimaryKey();

	/**
	 * Sets the primary key of this group users.
	 *
	 * @param primaryKey the primary key of this group users
	 */
	public void setPrimaryKey(GroupUsersPK primaryKey);

	/**
	 * Returns the permission group ID of this group users.
	 *
	 * @return the permission group ID of this group users
	 */
	public long getPermissionGroupId();

	/**
	 * Sets the permission group ID of this group users.
	 *
	 * @param permissionGroupId the permission group ID of this group users
	 */
	public void setPermissionGroupId(long permissionGroupId);

	/**
	 * Returns the user ID of this group users.
	 *
	 * @return the user ID of this group users
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this group users.
	 *
	 * @param userId the user ID of this group users
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this group users.
	 *
	 * @return the user uuid of this group users
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this group users.
	 *
	 * @param userUuid the user uuid of this group users
	 */
	public void setUserUuid(String userUuid);

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
	public int compareTo(com.vnpt.portlet.user.model.GroupUsers groupUsers);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.vnpt.portlet.user.model.GroupUsers> toCacheModel();

	@Override
	public com.vnpt.portlet.user.model.GroupUsers toEscapedModel();

	@Override
	public com.vnpt.portlet.user.model.GroupUsers toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
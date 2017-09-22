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
 * This class is a wrapper for {@link ActIdMembership}.
 * </p>
 *
 * @author ToanNQ86
 * @see ActIdMembership
 * @generated
 */
public class ActIdMembershipWrapper implements ActIdMembership,
	ModelWrapper<ActIdMembership> {
	public ActIdMembershipWrapper(ActIdMembership actIdMembership) {
		_actIdMembership = actIdMembership;
	}

	@Override
	public Class<?> getModelClass() {
		return ActIdMembership.class;
	}

	@Override
	public String getModelClassName() {
		return ActIdMembership.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}
	}

	/**
	* Returns the primary key of this act ID membership.
	*
	* @return the primary key of this act ID membership
	*/
	@Override
	public com.vnpt.portlet.user.service.persistence.ActIdMembershipPK getPrimaryKey() {
		return _actIdMembership.getPrimaryKey();
	}

	/**
	* Sets the primary key of this act ID membership.
	*
	* @param primaryKey the primary key of this act ID membership
	*/
	@Override
	public void setPrimaryKey(
		com.vnpt.portlet.user.service.persistence.ActIdMembershipPK primaryKey) {
		_actIdMembership.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user ID of this act ID membership.
	*
	* @return the user ID of this act ID membership
	*/
	@Override
	public long getUserId() {
		return _actIdMembership.getUserId();
	}

	/**
	* Sets the user ID of this act ID membership.
	*
	* @param userId the user ID of this act ID membership
	*/
	@Override
	public void setUserId(long userId) {
		_actIdMembership.setUserId(userId);
	}

	/**
	* Returns the user uuid of this act ID membership.
	*
	* @return the user uuid of this act ID membership
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdMembership.getUserUuid();
	}

	/**
	* Sets the user uuid of this act ID membership.
	*
	* @param userUuid the user uuid of this act ID membership
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_actIdMembership.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this act ID membership.
	*
	* @return the group ID of this act ID membership
	*/
	@Override
	public long getGroupId() {
		return _actIdMembership.getGroupId();
	}

	/**
	* Sets the group ID of this act ID membership.
	*
	* @param groupId the group ID of this act ID membership
	*/
	@Override
	public void setGroupId(long groupId) {
		_actIdMembership.setGroupId(groupId);
	}

	@Override
	public boolean isNew() {
		return _actIdMembership.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_actIdMembership.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _actIdMembership.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_actIdMembership.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _actIdMembership.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _actIdMembership.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_actIdMembership.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _actIdMembership.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_actIdMembership.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_actIdMembership.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_actIdMembership.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ActIdMembershipWrapper((ActIdMembership)_actIdMembership.clone());
	}

	@Override
	public int compareTo(
		com.vnpt.portlet.user.model.ActIdMembership actIdMembership) {
		return _actIdMembership.compareTo(actIdMembership);
	}

	@Override
	public int hashCode() {
		return _actIdMembership.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vnpt.portlet.user.model.ActIdMembership> toCacheModel() {
		return _actIdMembership.toCacheModel();
	}

	@Override
	public com.vnpt.portlet.user.model.ActIdMembership toEscapedModel() {
		return new ActIdMembershipWrapper(_actIdMembership.toEscapedModel());
	}

	@Override
	public com.vnpt.portlet.user.model.ActIdMembership toUnescapedModel() {
		return new ActIdMembershipWrapper(_actIdMembership.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _actIdMembership.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _actIdMembership.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_actIdMembership.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActIdMembershipWrapper)) {
			return false;
		}

		ActIdMembershipWrapper actIdMembershipWrapper = (ActIdMembershipWrapper)obj;

		if (Validator.equals(_actIdMembership,
					actIdMembershipWrapper._actIdMembership)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ActIdMembership getWrappedActIdMembership() {
		return _actIdMembership;
	}

	@Override
	public ActIdMembership getWrappedModel() {
		return _actIdMembership;
	}

	@Override
	public void resetOriginalValues() {
		_actIdMembership.resetOriginalValues();
	}

	private ActIdMembership _actIdMembership;
}
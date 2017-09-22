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
 * This class is a wrapper for {@link ActIdGroup}.
 * </p>
 *
 * @author ToanNQ86
 * @see ActIdGroup
 * @generated
 */
public class ActIdGroupWrapper implements ActIdGroup, ModelWrapper<ActIdGroup> {
	public ActIdGroupWrapper(ActIdGroup actIdGroup) {
		_actIdGroup = actIdGroup;
	}

	@Override
	public Class<?> getModelClass() {
		return ActIdGroup.class;
	}

	@Override
	public String getModelClassName() {
		return ActIdGroup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("rev", getRev());
		attributes.put("name", getName());
		attributes.put("type", getType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String id = (String)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long rev = (Long)attributes.get("rev");

		if (rev != null) {
			setRev(rev);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}
	}

	/**
	* Returns the primary key of this act ID group.
	*
	* @return the primary key of this act ID group
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _actIdGroup.getPrimaryKey();
	}

	/**
	* Sets the primary key of this act ID group.
	*
	* @param primaryKey the primary key of this act ID group
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_actIdGroup.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this act ID group.
	*
	* @return the ID of this act ID group
	*/
	@Override
	public java.lang.String getId() {
		return _actIdGroup.getId();
	}

	/**
	* Sets the ID of this act ID group.
	*
	* @param id the ID of this act ID group
	*/
	@Override
	public void setId(java.lang.String id) {
		_actIdGroup.setId(id);
	}

	/**
	* Returns the rev of this act ID group.
	*
	* @return the rev of this act ID group
	*/
	@Override
	public long getRev() {
		return _actIdGroup.getRev();
	}

	/**
	* Sets the rev of this act ID group.
	*
	* @param rev the rev of this act ID group
	*/
	@Override
	public void setRev(long rev) {
		_actIdGroup.setRev(rev);
	}

	/**
	* Returns the name of this act ID group.
	*
	* @return the name of this act ID group
	*/
	@Override
	public java.lang.String getName() {
		return _actIdGroup.getName();
	}

	/**
	* Sets the name of this act ID group.
	*
	* @param name the name of this act ID group
	*/
	@Override
	public void setName(java.lang.String name) {
		_actIdGroup.setName(name);
	}

	/**
	* Returns the type of this act ID group.
	*
	* @return the type of this act ID group
	*/
	@Override
	public java.lang.String getType() {
		return _actIdGroup.getType();
	}

	/**
	* Sets the type of this act ID group.
	*
	* @param type the type of this act ID group
	*/
	@Override
	public void setType(java.lang.String type) {
		_actIdGroup.setType(type);
	}

	@Override
	public boolean isNew() {
		return _actIdGroup.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_actIdGroup.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _actIdGroup.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_actIdGroup.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _actIdGroup.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _actIdGroup.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_actIdGroup.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _actIdGroup.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_actIdGroup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_actIdGroup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_actIdGroup.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ActIdGroupWrapper((ActIdGroup)_actIdGroup.clone());
	}

	@Override
	public int compareTo(com.vnpt.portlet.user.model.ActIdGroup actIdGroup) {
		return _actIdGroup.compareTo(actIdGroup);
	}

	@Override
	public int hashCode() {
		return _actIdGroup.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vnpt.portlet.user.model.ActIdGroup> toCacheModel() {
		return _actIdGroup.toCacheModel();
	}

	@Override
	public com.vnpt.portlet.user.model.ActIdGroup toEscapedModel() {
		return new ActIdGroupWrapper(_actIdGroup.toEscapedModel());
	}

	@Override
	public com.vnpt.portlet.user.model.ActIdGroup toUnescapedModel() {
		return new ActIdGroupWrapper(_actIdGroup.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _actIdGroup.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _actIdGroup.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_actIdGroup.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActIdGroupWrapper)) {
			return false;
		}

		ActIdGroupWrapper actIdGroupWrapper = (ActIdGroupWrapper)obj;

		if (Validator.equals(_actIdGroup, actIdGroupWrapper._actIdGroup)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ActIdGroup getWrappedActIdGroup() {
		return _actIdGroup;
	}

	@Override
	public ActIdGroup getWrappedModel() {
		return _actIdGroup;
	}

	@Override
	public void resetOriginalValues() {
		_actIdGroup.resetOriginalValues();
	}

	private ActIdGroup _actIdGroup;
}
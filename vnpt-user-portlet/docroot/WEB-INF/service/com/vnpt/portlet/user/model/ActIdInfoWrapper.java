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
 * This class is a wrapper for {@link ActIdInfo}.
 * </p>
 *
 * @author ToanNQ86
 * @see ActIdInfo
 * @generated
 */
public class ActIdInfoWrapper implements ActIdInfo, ModelWrapper<ActIdInfo> {
	public ActIdInfoWrapper(ActIdInfo actIdInfo) {
		_actIdInfo = actIdInfo;
	}

	@Override
	public Class<?> getModelClass() {
		return ActIdInfo.class;
	}

	@Override
	public String getModelClassName() {
		return ActIdInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("rev", getRev());
		attributes.put("userId", getUserId());
		attributes.put("type", getType());
		attributes.put("key", getKey());
		attributes.put("value", getValue());
		attributes.put("password", getPassword());
		attributes.put("parent_id_", getParent_id_());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long rev = (Long)attributes.get("rev");

		if (rev != null) {
			setRev(rev);
		}

		String userId = (String)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String key = (String)attributes.get("key");

		if (key != null) {
			setKey(key);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		String parent_id_ = (String)attributes.get("parent_id_");

		if (parent_id_ != null) {
			setParent_id_(parent_id_);
		}
	}

	/**
	* Returns the primary key of this act ID info.
	*
	* @return the primary key of this act ID info
	*/
	@Override
	public long getPrimaryKey() {
		return _actIdInfo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this act ID info.
	*
	* @param primaryKey the primary key of this act ID info
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_actIdInfo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this act ID info.
	*
	* @return the ID of this act ID info
	*/
	@Override
	public long getId() {
		return _actIdInfo.getId();
	}

	/**
	* Sets the ID of this act ID info.
	*
	* @param id the ID of this act ID info
	*/
	@Override
	public void setId(long id) {
		_actIdInfo.setId(id);
	}

	/**
	* Returns the rev of this act ID info.
	*
	* @return the rev of this act ID info
	*/
	@Override
	public long getRev() {
		return _actIdInfo.getRev();
	}

	/**
	* Sets the rev of this act ID info.
	*
	* @param rev the rev of this act ID info
	*/
	@Override
	public void setRev(long rev) {
		_actIdInfo.setRev(rev);
	}

	/**
	* Returns the user ID of this act ID info.
	*
	* @return the user ID of this act ID info
	*/
	@Override
	public java.lang.String getUserId() {
		return _actIdInfo.getUserId();
	}

	/**
	* Sets the user ID of this act ID info.
	*
	* @param userId the user ID of this act ID info
	*/
	@Override
	public void setUserId(java.lang.String userId) {
		_actIdInfo.setUserId(userId);
	}

	/**
	* Returns the type of this act ID info.
	*
	* @return the type of this act ID info
	*/
	@Override
	public java.lang.String getType() {
		return _actIdInfo.getType();
	}

	/**
	* Sets the type of this act ID info.
	*
	* @param type the type of this act ID info
	*/
	@Override
	public void setType(java.lang.String type) {
		_actIdInfo.setType(type);
	}

	/**
	* Returns the key of this act ID info.
	*
	* @return the key of this act ID info
	*/
	@Override
	public java.lang.String getKey() {
		return _actIdInfo.getKey();
	}

	/**
	* Sets the key of this act ID info.
	*
	* @param key the key of this act ID info
	*/
	@Override
	public void setKey(java.lang.String key) {
		_actIdInfo.setKey(key);
	}

	/**
	* Returns the value of this act ID info.
	*
	* @return the value of this act ID info
	*/
	@Override
	public java.lang.String getValue() {
		return _actIdInfo.getValue();
	}

	/**
	* Sets the value of this act ID info.
	*
	* @param value the value of this act ID info
	*/
	@Override
	public void setValue(java.lang.String value) {
		_actIdInfo.setValue(value);
	}

	/**
	* Returns the password of this act ID info.
	*
	* @return the password of this act ID info
	*/
	@Override
	public java.lang.String getPassword() {
		return _actIdInfo.getPassword();
	}

	/**
	* Sets the password of this act ID info.
	*
	* @param password the password of this act ID info
	*/
	@Override
	public void setPassword(java.lang.String password) {
		_actIdInfo.setPassword(password);
	}

	/**
	* Returns the parent_id_ of this act ID info.
	*
	* @return the parent_id_ of this act ID info
	*/
	@Override
	public java.lang.String getParent_id_() {
		return _actIdInfo.getParent_id_();
	}

	/**
	* Sets the parent_id_ of this act ID info.
	*
	* @param parent_id_ the parent_id_ of this act ID info
	*/
	@Override
	public void setParent_id_(java.lang.String parent_id_) {
		_actIdInfo.setParent_id_(parent_id_);
	}

	@Override
	public boolean isNew() {
		return _actIdInfo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_actIdInfo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _actIdInfo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_actIdInfo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _actIdInfo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _actIdInfo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_actIdInfo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _actIdInfo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_actIdInfo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_actIdInfo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_actIdInfo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ActIdInfoWrapper((ActIdInfo)_actIdInfo.clone());
	}

	@Override
	public int compareTo(com.vnpt.portlet.user.model.ActIdInfo actIdInfo) {
		return _actIdInfo.compareTo(actIdInfo);
	}

	@Override
	public int hashCode() {
		return _actIdInfo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vnpt.portlet.user.model.ActIdInfo> toCacheModel() {
		return _actIdInfo.toCacheModel();
	}

	@Override
	public com.vnpt.portlet.user.model.ActIdInfo toEscapedModel() {
		return new ActIdInfoWrapper(_actIdInfo.toEscapedModel());
	}

	@Override
	public com.vnpt.portlet.user.model.ActIdInfo toUnescapedModel() {
		return new ActIdInfoWrapper(_actIdInfo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _actIdInfo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _actIdInfo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_actIdInfo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActIdInfoWrapper)) {
			return false;
		}

		ActIdInfoWrapper actIdInfoWrapper = (ActIdInfoWrapper)obj;

		if (Validator.equals(_actIdInfo, actIdInfoWrapper._actIdInfo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ActIdInfo getWrappedActIdInfo() {
		return _actIdInfo;
	}

	@Override
	public ActIdInfo getWrappedModel() {
		return _actIdInfo;
	}

	@Override
	public void resetOriginalValues() {
		_actIdInfo.resetOriginalValues();
	}

	private ActIdInfo _actIdInfo;
}
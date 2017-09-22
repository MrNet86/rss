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
 * This class is a wrapper for {@link ActIdUser}.
 * </p>
 *
 * @author ToanNQ86
 * @see ActIdUser
 * @generated
 */
public class ActIdUserWrapper implements ActIdUser, ModelWrapper<ActIdUser> {
	public ActIdUserWrapper(ActIdUser actIdUser) {
		_actIdUser = actIdUser;
	}

	@Override
	public Class<?> getModelClass() {
		return ActIdUser.class;
	}

	@Override
	public String getModelClassName() {
		return ActIdUser.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("rev", getRev());
		attributes.put("first", getFirst());
		attributes.put("last", getLast());
		attributes.put("email", getEmail());
		attributes.put("pwd", getPwd());
		attributes.put("pictureId", getPictureId());

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

		String first = (String)attributes.get("first");

		if (first != null) {
			setFirst(first);
		}

		String last = (String)attributes.get("last");

		if (last != null) {
			setLast(last);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String pwd = (String)attributes.get("pwd");

		if (pwd != null) {
			setPwd(pwd);
		}

		String pictureId = (String)attributes.get("pictureId");

		if (pictureId != null) {
			setPictureId(pictureId);
		}
	}

	/**
	* Returns the primary key of this act ID user.
	*
	* @return the primary key of this act ID user
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _actIdUser.getPrimaryKey();
	}

	/**
	* Sets the primary key of this act ID user.
	*
	* @param primaryKey the primary key of this act ID user
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_actIdUser.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this act ID user.
	*
	* @return the ID of this act ID user
	*/
	@Override
	public java.lang.String getId() {
		return _actIdUser.getId();
	}

	/**
	* Sets the ID of this act ID user.
	*
	* @param id the ID of this act ID user
	*/
	@Override
	public void setId(java.lang.String id) {
		_actIdUser.setId(id);
	}

	/**
	* Returns the rev of this act ID user.
	*
	* @return the rev of this act ID user
	*/
	@Override
	public long getRev() {
		return _actIdUser.getRev();
	}

	/**
	* Sets the rev of this act ID user.
	*
	* @param rev the rev of this act ID user
	*/
	@Override
	public void setRev(long rev) {
		_actIdUser.setRev(rev);
	}

	/**
	* Returns the first of this act ID user.
	*
	* @return the first of this act ID user
	*/
	@Override
	public java.lang.String getFirst() {
		return _actIdUser.getFirst();
	}

	/**
	* Sets the first of this act ID user.
	*
	* @param first the first of this act ID user
	*/
	@Override
	public void setFirst(java.lang.String first) {
		_actIdUser.setFirst(first);
	}

	/**
	* Returns the last of this act ID user.
	*
	* @return the last of this act ID user
	*/
	@Override
	public java.lang.String getLast() {
		return _actIdUser.getLast();
	}

	/**
	* Sets the last of this act ID user.
	*
	* @param last the last of this act ID user
	*/
	@Override
	public void setLast(java.lang.String last) {
		_actIdUser.setLast(last);
	}

	/**
	* Returns the email of this act ID user.
	*
	* @return the email of this act ID user
	*/
	@Override
	public java.lang.String getEmail() {
		return _actIdUser.getEmail();
	}

	/**
	* Sets the email of this act ID user.
	*
	* @param email the email of this act ID user
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_actIdUser.setEmail(email);
	}

	/**
	* Returns the pwd of this act ID user.
	*
	* @return the pwd of this act ID user
	*/
	@Override
	public java.lang.String getPwd() {
		return _actIdUser.getPwd();
	}

	/**
	* Sets the pwd of this act ID user.
	*
	* @param pwd the pwd of this act ID user
	*/
	@Override
	public void setPwd(java.lang.String pwd) {
		_actIdUser.setPwd(pwd);
	}

	/**
	* Returns the picture ID of this act ID user.
	*
	* @return the picture ID of this act ID user
	*/
	@Override
	public java.lang.String getPictureId() {
		return _actIdUser.getPictureId();
	}

	/**
	* Sets the picture ID of this act ID user.
	*
	* @param pictureId the picture ID of this act ID user
	*/
	@Override
	public void setPictureId(java.lang.String pictureId) {
		_actIdUser.setPictureId(pictureId);
	}

	@Override
	public boolean isNew() {
		return _actIdUser.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_actIdUser.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _actIdUser.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_actIdUser.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _actIdUser.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _actIdUser.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_actIdUser.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _actIdUser.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_actIdUser.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_actIdUser.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_actIdUser.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ActIdUserWrapper((ActIdUser)_actIdUser.clone());
	}

	@Override
	public int compareTo(com.vnpt.portlet.user.model.ActIdUser actIdUser) {
		return _actIdUser.compareTo(actIdUser);
	}

	@Override
	public int hashCode() {
		return _actIdUser.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vnpt.portlet.user.model.ActIdUser> toCacheModel() {
		return _actIdUser.toCacheModel();
	}

	@Override
	public com.vnpt.portlet.user.model.ActIdUser toEscapedModel() {
		return new ActIdUserWrapper(_actIdUser.toEscapedModel());
	}

	@Override
	public com.vnpt.portlet.user.model.ActIdUser toUnescapedModel() {
		return new ActIdUserWrapper(_actIdUser.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _actIdUser.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _actIdUser.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_actIdUser.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActIdUserWrapper)) {
			return false;
		}

		ActIdUserWrapper actIdUserWrapper = (ActIdUserWrapper)obj;

		if (Validator.equals(_actIdUser, actIdUserWrapper._actIdUser)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ActIdUser getWrappedActIdUser() {
		return _actIdUser;
	}

	@Override
	public ActIdUser getWrappedModel() {
		return _actIdUser;
	}

	@Override
	public void resetOriginalValues() {
		_actIdUser.resetOriginalValues();
	}

	private ActIdUser _actIdUser;
}
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
 * This class is a wrapper for {@link LiferayDatabase}.
 * </p>
 *
 * @author ToanNQ86
 * @see LiferayDatabase
 * @generated
 */
public class LiferayDatabaseWrapper implements LiferayDatabase,
	ModelWrapper<LiferayDatabase> {
	public LiferayDatabaseWrapper(LiferayDatabase liferayDatabase) {
		_liferayDatabase = liferayDatabase;
	}

	@Override
	public Class<?> getModelClass() {
		return LiferayDatabase.class;
	}

	@Override
	public String getModelClassName() {
		return LiferayDatabase.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemFieldId", getItemFieldId());
		attributes.put("itemId", getItemId());
		attributes.put("name", getName());
		attributes.put("values", getValues());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemFieldId = (Long)attributes.get("itemFieldId");

		if (itemFieldId != null) {
			setItemFieldId(itemFieldId);
		}

		Long itemId = (Long)attributes.get("itemId");

		if (itemId != null) {
			setItemId(itemId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String values = (String)attributes.get("values");

		if (values != null) {
			setValues(values);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this liferay database.
	*
	* @return the primary key of this liferay database
	*/
	@Override
	public long getPrimaryKey() {
		return _liferayDatabase.getPrimaryKey();
	}

	/**
	* Sets the primary key of this liferay database.
	*
	* @param primaryKey the primary key of this liferay database
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_liferayDatabase.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the item field ID of this liferay database.
	*
	* @return the item field ID of this liferay database
	*/
	@Override
	public long getItemFieldId() {
		return _liferayDatabase.getItemFieldId();
	}

	/**
	* Sets the item field ID of this liferay database.
	*
	* @param itemFieldId the item field ID of this liferay database
	*/
	@Override
	public void setItemFieldId(long itemFieldId) {
		_liferayDatabase.setItemFieldId(itemFieldId);
	}

	/**
	* Returns the item ID of this liferay database.
	*
	* @return the item ID of this liferay database
	*/
	@Override
	public long getItemId() {
		return _liferayDatabase.getItemId();
	}

	/**
	* Sets the item ID of this liferay database.
	*
	* @param itemId the item ID of this liferay database
	*/
	@Override
	public void setItemId(long itemId) {
		_liferayDatabase.setItemId(itemId);
	}

	/**
	* Returns the name of this liferay database.
	*
	* @return the name of this liferay database
	*/
	@Override
	public java.lang.String getName() {
		return _liferayDatabase.getName();
	}

	/**
	* Sets the name of this liferay database.
	*
	* @param name the name of this liferay database
	*/
	@Override
	public void setName(java.lang.String name) {
		_liferayDatabase.setName(name);
	}

	/**
	* Returns the values of this liferay database.
	*
	* @return the values of this liferay database
	*/
	@Override
	public java.lang.String getValues() {
		return _liferayDatabase.getValues();
	}

	/**
	* Sets the values of this liferay database.
	*
	* @param values the values of this liferay database
	*/
	@Override
	public void setValues(java.lang.String values) {
		_liferayDatabase.setValues(values);
	}

	/**
	* Returns the description of this liferay database.
	*
	* @return the description of this liferay database
	*/
	@Override
	public java.lang.String getDescription() {
		return _liferayDatabase.getDescription();
	}

	/**
	* Sets the description of this liferay database.
	*
	* @param description the description of this liferay database
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_liferayDatabase.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _liferayDatabase.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_liferayDatabase.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _liferayDatabase.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_liferayDatabase.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _liferayDatabase.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _liferayDatabase.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_liferayDatabase.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _liferayDatabase.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_liferayDatabase.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_liferayDatabase.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_liferayDatabase.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LiferayDatabaseWrapper((LiferayDatabase)_liferayDatabase.clone());
	}

	@Override
	public int compareTo(
		com.vnpt.portlet.user.model.LiferayDatabase liferayDatabase) {
		return _liferayDatabase.compareTo(liferayDatabase);
	}

	@Override
	public int hashCode() {
		return _liferayDatabase.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vnpt.portlet.user.model.LiferayDatabase> toCacheModel() {
		return _liferayDatabase.toCacheModel();
	}

	@Override
	public com.vnpt.portlet.user.model.LiferayDatabase toEscapedModel() {
		return new LiferayDatabaseWrapper(_liferayDatabase.toEscapedModel());
	}

	@Override
	public com.vnpt.portlet.user.model.LiferayDatabase toUnescapedModel() {
		return new LiferayDatabaseWrapper(_liferayDatabase.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _liferayDatabase.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _liferayDatabase.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_liferayDatabase.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LiferayDatabaseWrapper)) {
			return false;
		}

		LiferayDatabaseWrapper liferayDatabaseWrapper = (LiferayDatabaseWrapper)obj;

		if (Validator.equals(_liferayDatabase,
					liferayDatabaseWrapper._liferayDatabase)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LiferayDatabase getWrappedLiferayDatabase() {
		return _liferayDatabase;
	}

	@Override
	public LiferayDatabase getWrappedModel() {
		return _liferayDatabase;
	}

	@Override
	public void resetOriginalValues() {
		_liferayDatabase.resetOriginalValues();
	}

	private LiferayDatabase _liferayDatabase;
}
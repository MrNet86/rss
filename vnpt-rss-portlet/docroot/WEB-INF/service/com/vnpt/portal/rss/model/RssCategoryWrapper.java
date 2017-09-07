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

package com.vnpt.portal.rss.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RssCategory}.
 * </p>
 *
 * @author MrNet
 * @see RssCategory
 * @generated
 */
public class RssCategoryWrapper implements RssCategory,
	ModelWrapper<RssCategory> {
	public RssCategoryWrapper(RssCategory rssCategory) {
		_rssCategory = rssCategory;
	}

	@Override
	public Class<?> getModelClass() {
		return RssCategory.class;
	}

	@Override
	public String getModelClassName() {
		return RssCategory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("rssCategoryId", getRssCategoryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("status", getStatus());
		attributes.put("createdId", getCreatedId());
		attributes.put("createdDate", getCreatedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long rssCategoryId = (Long)attributes.get("rssCategoryId");

		if (rssCategoryId != null) {
			setRssCategoryId(rssCategoryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long createdId = (Long)attributes.get("createdId");

		if (createdId != null) {
			setCreatedId(createdId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}
	}

	/**
	* Returns the primary key of this rss category.
	*
	* @return the primary key of this rss category
	*/
	@Override
	public long getPrimaryKey() {
		return _rssCategory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this rss category.
	*
	* @param primaryKey the primary key of this rss category
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_rssCategory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the rss category ID of this rss category.
	*
	* @return the rss category ID of this rss category
	*/
	@Override
	public long getRssCategoryId() {
		return _rssCategory.getRssCategoryId();
	}

	/**
	* Sets the rss category ID of this rss category.
	*
	* @param rssCategoryId the rss category ID of this rss category
	*/
	@Override
	public void setRssCategoryId(long rssCategoryId) {
		_rssCategory.setRssCategoryId(rssCategoryId);
	}

	/**
	* Returns the group ID of this rss category.
	*
	* @return the group ID of this rss category
	*/
	@Override
	public long getGroupId() {
		return _rssCategory.getGroupId();
	}

	/**
	* Sets the group ID of this rss category.
	*
	* @param groupId the group ID of this rss category
	*/
	@Override
	public void setGroupId(long groupId) {
		_rssCategory.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this rss category.
	*
	* @return the company ID of this rss category
	*/
	@Override
	public long getCompanyId() {
		return _rssCategory.getCompanyId();
	}

	/**
	* Sets the company ID of this rss category.
	*
	* @param companyId the company ID of this rss category
	*/
	@Override
	public void setCompanyId(long companyId) {
		_rssCategory.setCompanyId(companyId);
	}

	/**
	* Returns the name of this rss category.
	*
	* @return the name of this rss category
	*/
	@Override
	public java.lang.String getName() {
		return _rssCategory.getName();
	}

	/**
	* Sets the name of this rss category.
	*
	* @param name the name of this rss category
	*/
	@Override
	public void setName(java.lang.String name) {
		_rssCategory.setName(name);
	}

	/**
	* Returns the description of this rss category.
	*
	* @return the description of this rss category
	*/
	@Override
	public java.lang.String getDescription() {
		return _rssCategory.getDescription();
	}

	/**
	* Sets the description of this rss category.
	*
	* @param description the description of this rss category
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_rssCategory.setDescription(description);
	}

	/**
	* Returns the status of this rss category.
	*
	* @return the status of this rss category
	*/
	@Override
	public int getStatus() {
		return _rssCategory.getStatus();
	}

	/**
	* Sets the status of this rss category.
	*
	* @param status the status of this rss category
	*/
	@Override
	public void setStatus(int status) {
		_rssCategory.setStatus(status);
	}

	/**
	* Returns the created ID of this rss category.
	*
	* @return the created ID of this rss category
	*/
	@Override
	public long getCreatedId() {
		return _rssCategory.getCreatedId();
	}

	/**
	* Sets the created ID of this rss category.
	*
	* @param createdId the created ID of this rss category
	*/
	@Override
	public void setCreatedId(long createdId) {
		_rssCategory.setCreatedId(createdId);
	}

	/**
	* Returns the created date of this rss category.
	*
	* @return the created date of this rss category
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _rssCategory.getCreatedDate();
	}

	/**
	* Sets the created date of this rss category.
	*
	* @param createdDate the created date of this rss category
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_rssCategory.setCreatedDate(createdDate);
	}

	@Override
	public boolean isNew() {
		return _rssCategory.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_rssCategory.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _rssCategory.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_rssCategory.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _rssCategory.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _rssCategory.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_rssCategory.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _rssCategory.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_rssCategory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_rssCategory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_rssCategory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RssCategoryWrapper((RssCategory)_rssCategory.clone());
	}

	@Override
	public int compareTo(com.vnpt.portal.rss.model.RssCategory rssCategory) {
		return _rssCategory.compareTo(rssCategory);
	}

	@Override
	public int hashCode() {
		return _rssCategory.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vnpt.portal.rss.model.RssCategory> toCacheModel() {
		return _rssCategory.toCacheModel();
	}

	@Override
	public com.vnpt.portal.rss.model.RssCategory toEscapedModel() {
		return new RssCategoryWrapper(_rssCategory.toEscapedModel());
	}

	@Override
	public com.vnpt.portal.rss.model.RssCategory toUnescapedModel() {
		return new RssCategoryWrapper(_rssCategory.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _rssCategory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _rssCategory.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_rssCategory.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RssCategoryWrapper)) {
			return false;
		}

		RssCategoryWrapper rssCategoryWrapper = (RssCategoryWrapper)obj;

		if (Validator.equals(_rssCategory, rssCategoryWrapper._rssCategory)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public RssCategory getWrappedRssCategory() {
		return _rssCategory;
	}

	@Override
	public RssCategory getWrappedModel() {
		return _rssCategory;
	}

	@Override
	public void resetOriginalValues() {
		_rssCategory.resetOriginalValues();
	}

	private RssCategory _rssCategory;
}
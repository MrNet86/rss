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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RssConfig}.
 * </p>
 *
 * @author MrNet
 * @see RssConfig
 * @generated
 */
public class RssConfigWrapper implements RssConfig, ModelWrapper<RssConfig> {
	public RssConfigWrapper(RssConfig rssConfig) {
		_rssConfig = rssConfig;
	}

	@Override
	public Class<?> getModelClass() {
		return RssConfig.class;
	}

	@Override
	public String getModelClassName() {
		return RssConfig.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("rssConfigId", getRssConfigId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("title", getTitle());
		attributes.put("url", getUrl());
		attributes.put("totalFeed", getTotalFeed());
		attributes.put("rssCategoryId", getRssCategoryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long rssConfigId = (Long)attributes.get("rssConfigId");

		if (rssConfigId != null) {
			setRssConfigId(rssConfigId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		Integer totalFeed = (Integer)attributes.get("totalFeed");

		if (totalFeed != null) {
			setTotalFeed(totalFeed);
		}

		Long rssCategoryId = (Long)attributes.get("rssCategoryId");

		if (rssCategoryId != null) {
			setRssCategoryId(rssCategoryId);
		}
	}

	/**
	* Returns the primary key of this rss config.
	*
	* @return the primary key of this rss config
	*/
	@Override
	public long getPrimaryKey() {
		return _rssConfig.getPrimaryKey();
	}

	/**
	* Sets the primary key of this rss config.
	*
	* @param primaryKey the primary key of this rss config
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_rssConfig.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the rss config ID of this rss config.
	*
	* @return the rss config ID of this rss config
	*/
	@Override
	public long getRssConfigId() {
		return _rssConfig.getRssConfigId();
	}

	/**
	* Sets the rss config ID of this rss config.
	*
	* @param rssConfigId the rss config ID of this rss config
	*/
	@Override
	public void setRssConfigId(long rssConfigId) {
		_rssConfig.setRssConfigId(rssConfigId);
	}

	/**
	* Returns the group ID of this rss config.
	*
	* @return the group ID of this rss config
	*/
	@Override
	public long getGroupId() {
		return _rssConfig.getGroupId();
	}

	/**
	* Sets the group ID of this rss config.
	*
	* @param groupId the group ID of this rss config
	*/
	@Override
	public void setGroupId(long groupId) {
		_rssConfig.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this rss config.
	*
	* @return the company ID of this rss config
	*/
	@Override
	public long getCompanyId() {
		return _rssConfig.getCompanyId();
	}

	/**
	* Sets the company ID of this rss config.
	*
	* @param companyId the company ID of this rss config
	*/
	@Override
	public void setCompanyId(long companyId) {
		_rssConfig.setCompanyId(companyId);
	}

	/**
	* Returns the title of this rss config.
	*
	* @return the title of this rss config
	*/
	@Override
	public java.lang.String getTitle() {
		return _rssConfig.getTitle();
	}

	/**
	* Sets the title of this rss config.
	*
	* @param title the title of this rss config
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_rssConfig.setTitle(title);
	}

	/**
	* Returns the url of this rss config.
	*
	* @return the url of this rss config
	*/
	@Override
	public java.lang.String getUrl() {
		return _rssConfig.getUrl();
	}

	/**
	* Sets the url of this rss config.
	*
	* @param url the url of this rss config
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_rssConfig.setUrl(url);
	}

	/**
	* Returns the total feed of this rss config.
	*
	* @return the total feed of this rss config
	*/
	@Override
	public int getTotalFeed() {
		return _rssConfig.getTotalFeed();
	}

	/**
	* Sets the total feed of this rss config.
	*
	* @param totalFeed the total feed of this rss config
	*/
	@Override
	public void setTotalFeed(int totalFeed) {
		_rssConfig.setTotalFeed(totalFeed);
	}

	/**
	* Returns the rss category ID of this rss config.
	*
	* @return the rss category ID of this rss config
	*/
	@Override
	public long getRssCategoryId() {
		return _rssConfig.getRssCategoryId();
	}

	/**
	* Sets the rss category ID of this rss config.
	*
	* @param rssCategoryId the rss category ID of this rss config
	*/
	@Override
	public void setRssCategoryId(long rssCategoryId) {
		_rssConfig.setRssCategoryId(rssCategoryId);
	}

	@Override
	public boolean isNew() {
		return _rssConfig.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_rssConfig.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _rssConfig.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_rssConfig.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _rssConfig.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _rssConfig.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_rssConfig.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _rssConfig.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_rssConfig.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_rssConfig.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_rssConfig.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RssConfigWrapper((RssConfig)_rssConfig.clone());
	}

	@Override
	public int compareTo(com.vnpt.portal.rss.model.RssConfig rssConfig) {
		return _rssConfig.compareTo(rssConfig);
	}

	@Override
	public int hashCode() {
		return _rssConfig.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vnpt.portal.rss.model.RssConfig> toCacheModel() {
		return _rssConfig.toCacheModel();
	}

	@Override
	public com.vnpt.portal.rss.model.RssConfig toEscapedModel() {
		return new RssConfigWrapper(_rssConfig.toEscapedModel());
	}

	@Override
	public com.vnpt.portal.rss.model.RssConfig toUnescapedModel() {
		return new RssConfigWrapper(_rssConfig.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _rssConfig.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _rssConfig.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_rssConfig.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RssConfigWrapper)) {
			return false;
		}

		RssConfigWrapper rssConfigWrapper = (RssConfigWrapper)obj;

		if (Validator.equals(_rssConfig, rssConfigWrapper._rssConfig)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public RssConfig getWrappedRssConfig() {
		return _rssConfig;
	}

	@Override
	public RssConfig getWrappedModel() {
		return _rssConfig;
	}

	@Override
	public void resetOriginalValues() {
		_rssConfig.resetOriginalValues();
	}

	private RssConfig _rssConfig;
}
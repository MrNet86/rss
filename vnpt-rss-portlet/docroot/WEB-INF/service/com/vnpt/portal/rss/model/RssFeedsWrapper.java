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
 * This class is a wrapper for {@link RssFeeds}.
 * </p>
 *
 * @author MrNet
 * @see RssFeeds
 * @generated
 */
public class RssFeedsWrapper implements RssFeeds, ModelWrapper<RssFeeds> {
	public RssFeedsWrapper(RssFeeds rssFeeds) {
		_rssFeeds = rssFeeds;
	}

	@Override
	public Class<?> getModelClass() {
		return RssFeeds.class;
	}

	@Override
	public String getModelClassName() {
		return RssFeeds.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("rssFeedsId", getRssFeedsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("title", getTitle());
		attributes.put("url", getUrl());
		attributes.put("description", getDescription());
		attributes.put("content", getContent());
		attributes.put("author", getAuthor());
		attributes.put("publishedDate", getPublishedDate());
		attributes.put("status", getStatus());
		attributes.put("createdId", getCreatedId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("approvedId", getApprovedId());
		attributes.put("approvedDate", getApprovedDate());
		attributes.put("rssCategoryId", getRssCategoryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long rssFeedsId = (Long)attributes.get("rssFeedsId");

		if (rssFeedsId != null) {
			setRssFeedsId(rssFeedsId);
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

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}

		Date publishedDate = (Date)attributes.get("publishedDate");

		if (publishedDate != null) {
			setPublishedDate(publishedDate);
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

		Long approvedId = (Long)attributes.get("approvedId");

		if (approvedId != null) {
			setApprovedId(approvedId);
		}

		Date approvedDate = (Date)attributes.get("approvedDate");

		if (approvedDate != null) {
			setApprovedDate(approvedDate);
		}

		Long rssCategoryId = (Long)attributes.get("rssCategoryId");

		if (rssCategoryId != null) {
			setRssCategoryId(rssCategoryId);
		}
	}

	/**
	* Returns the primary key of this rss feeds.
	*
	* @return the primary key of this rss feeds
	*/
	@Override
	public long getPrimaryKey() {
		return _rssFeeds.getPrimaryKey();
	}

	/**
	* Sets the primary key of this rss feeds.
	*
	* @param primaryKey the primary key of this rss feeds
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_rssFeeds.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the rss feeds ID of this rss feeds.
	*
	* @return the rss feeds ID of this rss feeds
	*/
	@Override
	public long getRssFeedsId() {
		return _rssFeeds.getRssFeedsId();
	}

	/**
	* Sets the rss feeds ID of this rss feeds.
	*
	* @param rssFeedsId the rss feeds ID of this rss feeds
	*/
	@Override
	public void setRssFeedsId(long rssFeedsId) {
		_rssFeeds.setRssFeedsId(rssFeedsId);
	}

	/**
	* Returns the group ID of this rss feeds.
	*
	* @return the group ID of this rss feeds
	*/
	@Override
	public long getGroupId() {
		return _rssFeeds.getGroupId();
	}

	/**
	* Sets the group ID of this rss feeds.
	*
	* @param groupId the group ID of this rss feeds
	*/
	@Override
	public void setGroupId(long groupId) {
		_rssFeeds.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this rss feeds.
	*
	* @return the company ID of this rss feeds
	*/
	@Override
	public long getCompanyId() {
		return _rssFeeds.getCompanyId();
	}

	/**
	* Sets the company ID of this rss feeds.
	*
	* @param companyId the company ID of this rss feeds
	*/
	@Override
	public void setCompanyId(long companyId) {
		_rssFeeds.setCompanyId(companyId);
	}

	/**
	* Returns the title of this rss feeds.
	*
	* @return the title of this rss feeds
	*/
	@Override
	public java.lang.String getTitle() {
		return _rssFeeds.getTitle();
	}

	/**
	* Sets the title of this rss feeds.
	*
	* @param title the title of this rss feeds
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_rssFeeds.setTitle(title);
	}

	/**
	* Returns the url of this rss feeds.
	*
	* @return the url of this rss feeds
	*/
	@Override
	public java.lang.String getUrl() {
		return _rssFeeds.getUrl();
	}

	/**
	* Sets the url of this rss feeds.
	*
	* @param url the url of this rss feeds
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_rssFeeds.setUrl(url);
	}

	/**
	* Returns the description of this rss feeds.
	*
	* @return the description of this rss feeds
	*/
	@Override
	public java.lang.String getDescription() {
		return _rssFeeds.getDescription();
	}

	/**
	* Sets the description of this rss feeds.
	*
	* @param description the description of this rss feeds
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_rssFeeds.setDescription(description);
	}

	/**
	* Returns the content of this rss feeds.
	*
	* @return the content of this rss feeds
	*/
	@Override
	public java.lang.String getContent() {
		return _rssFeeds.getContent();
	}

	/**
	* Sets the content of this rss feeds.
	*
	* @param content the content of this rss feeds
	*/
	@Override
	public void setContent(java.lang.String content) {
		_rssFeeds.setContent(content);
	}

	/**
	* Returns the author of this rss feeds.
	*
	* @return the author of this rss feeds
	*/
	@Override
	public java.lang.String getAuthor() {
		return _rssFeeds.getAuthor();
	}

	/**
	* Sets the author of this rss feeds.
	*
	* @param author the author of this rss feeds
	*/
	@Override
	public void setAuthor(java.lang.String author) {
		_rssFeeds.setAuthor(author);
	}

	/**
	* Returns the published date of this rss feeds.
	*
	* @return the published date of this rss feeds
	*/
	@Override
	public java.util.Date getPublishedDate() {
		return _rssFeeds.getPublishedDate();
	}

	/**
	* Sets the published date of this rss feeds.
	*
	* @param publishedDate the published date of this rss feeds
	*/
	@Override
	public void setPublishedDate(java.util.Date publishedDate) {
		_rssFeeds.setPublishedDate(publishedDate);
	}

	/**
	* Returns the status of this rss feeds.
	*
	* @return the status of this rss feeds
	*/
	@Override
	public int getStatus() {
		return _rssFeeds.getStatus();
	}

	/**
	* Sets the status of this rss feeds.
	*
	* @param status the status of this rss feeds
	*/
	@Override
	public void setStatus(int status) {
		_rssFeeds.setStatus(status);
	}

	/**
	* Returns the created ID of this rss feeds.
	*
	* @return the created ID of this rss feeds
	*/
	@Override
	public long getCreatedId() {
		return _rssFeeds.getCreatedId();
	}

	/**
	* Sets the created ID of this rss feeds.
	*
	* @param createdId the created ID of this rss feeds
	*/
	@Override
	public void setCreatedId(long createdId) {
		_rssFeeds.setCreatedId(createdId);
	}

	/**
	* Returns the created date of this rss feeds.
	*
	* @return the created date of this rss feeds
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _rssFeeds.getCreatedDate();
	}

	/**
	* Sets the created date of this rss feeds.
	*
	* @param createdDate the created date of this rss feeds
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_rssFeeds.setCreatedDate(createdDate);
	}

	/**
	* Returns the approved ID of this rss feeds.
	*
	* @return the approved ID of this rss feeds
	*/
	@Override
	public long getApprovedId() {
		return _rssFeeds.getApprovedId();
	}

	/**
	* Sets the approved ID of this rss feeds.
	*
	* @param approvedId the approved ID of this rss feeds
	*/
	@Override
	public void setApprovedId(long approvedId) {
		_rssFeeds.setApprovedId(approvedId);
	}

	/**
	* Returns the approved date of this rss feeds.
	*
	* @return the approved date of this rss feeds
	*/
	@Override
	public java.util.Date getApprovedDate() {
		return _rssFeeds.getApprovedDate();
	}

	/**
	* Sets the approved date of this rss feeds.
	*
	* @param approvedDate the approved date of this rss feeds
	*/
	@Override
	public void setApprovedDate(java.util.Date approvedDate) {
		_rssFeeds.setApprovedDate(approvedDate);
	}

	/**
	* Returns the rss category ID of this rss feeds.
	*
	* @return the rss category ID of this rss feeds
	*/
	@Override
	public long getRssCategoryId() {
		return _rssFeeds.getRssCategoryId();
	}

	/**
	* Sets the rss category ID of this rss feeds.
	*
	* @param rssCategoryId the rss category ID of this rss feeds
	*/
	@Override
	public void setRssCategoryId(long rssCategoryId) {
		_rssFeeds.setRssCategoryId(rssCategoryId);
	}

	@Override
	public boolean isNew() {
		return _rssFeeds.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_rssFeeds.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _rssFeeds.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_rssFeeds.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _rssFeeds.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _rssFeeds.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_rssFeeds.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _rssFeeds.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_rssFeeds.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_rssFeeds.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_rssFeeds.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RssFeedsWrapper((RssFeeds)_rssFeeds.clone());
	}

	@Override
	public int compareTo(com.vnpt.portal.rss.model.RssFeeds rssFeeds) {
		return _rssFeeds.compareTo(rssFeeds);
	}

	@Override
	public int hashCode() {
		return _rssFeeds.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vnpt.portal.rss.model.RssFeeds> toCacheModel() {
		return _rssFeeds.toCacheModel();
	}

	@Override
	public com.vnpt.portal.rss.model.RssFeeds toEscapedModel() {
		return new RssFeedsWrapper(_rssFeeds.toEscapedModel());
	}

	@Override
	public com.vnpt.portal.rss.model.RssFeeds toUnescapedModel() {
		return new RssFeedsWrapper(_rssFeeds.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _rssFeeds.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _rssFeeds.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_rssFeeds.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RssFeedsWrapper)) {
			return false;
		}

		RssFeedsWrapper rssFeedsWrapper = (RssFeedsWrapper)obj;

		if (Validator.equals(_rssFeeds, rssFeedsWrapper._rssFeeds)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public RssFeeds getWrappedRssFeeds() {
		return _rssFeeds;
	}

	@Override
	public RssFeeds getWrappedModel() {
		return _rssFeeds;
	}

	@Override
	public void resetOriginalValues() {
		_rssFeeds.resetOriginalValues();
	}

	private RssFeeds _rssFeeds;
}
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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the RssFeeds service. Represents a row in the &quot;eportal_rss_feeds&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vnpt.portal.rss.model.impl.RssFeedsImpl}.
 * </p>
 *
 * @author MrNet
 * @see RssFeeds
 * @see com.vnpt.portal.rss.model.impl.RssFeedsImpl
 * @see com.vnpt.portal.rss.model.impl.RssFeedsModelImpl
 * @generated
 */
public interface RssFeedsModel extends BaseModel<RssFeeds> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a rss feeds model instance should use the {@link RssFeeds} interface instead.
	 */

	/**
	 * Returns the primary key of this rss feeds.
	 *
	 * @return the primary key of this rss feeds
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this rss feeds.
	 *
	 * @param primaryKey the primary key of this rss feeds
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the rss feeds ID of this rss feeds.
	 *
	 * @return the rss feeds ID of this rss feeds
	 */
	public long getRssFeedsId();

	/**
	 * Sets the rss feeds ID of this rss feeds.
	 *
	 * @param rssFeedsId the rss feeds ID of this rss feeds
	 */
	public void setRssFeedsId(long rssFeedsId);

	/**
	 * Returns the group ID of this rss feeds.
	 *
	 * @return the group ID of this rss feeds
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this rss feeds.
	 *
	 * @param groupId the group ID of this rss feeds
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this rss feeds.
	 *
	 * @return the company ID of this rss feeds
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this rss feeds.
	 *
	 * @param companyId the company ID of this rss feeds
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the title of this rss feeds.
	 *
	 * @return the title of this rss feeds
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this rss feeds.
	 *
	 * @param title the title of this rss feeds
	 */
	public void setTitle(String title);

	/**
	 * Returns the url of this rss feeds.
	 *
	 * @return the url of this rss feeds
	 */
	@AutoEscape
	public String getUrl();

	/**
	 * Sets the url of this rss feeds.
	 *
	 * @param url the url of this rss feeds
	 */
	public void setUrl(String url);

	/**
	 * Returns the description of this rss feeds.
	 *
	 * @return the description of this rss feeds
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this rss feeds.
	 *
	 * @param description the description of this rss feeds
	 */
	public void setDescription(String description);

	/**
	 * Returns the content of this rss feeds.
	 *
	 * @return the content of this rss feeds
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this rss feeds.
	 *
	 * @param content the content of this rss feeds
	 */
	public void setContent(String content);

	/**
	 * Returns the author of this rss feeds.
	 *
	 * @return the author of this rss feeds
	 */
	@AutoEscape
	public String getAuthor();

	/**
	 * Sets the author of this rss feeds.
	 *
	 * @param author the author of this rss feeds
	 */
	public void setAuthor(String author);

	/**
	 * Returns the published date of this rss feeds.
	 *
	 * @return the published date of this rss feeds
	 */
	public Date getPublishedDate();

	/**
	 * Sets the published date of this rss feeds.
	 *
	 * @param publishedDate the published date of this rss feeds
	 */
	public void setPublishedDate(Date publishedDate);

	/**
	 * Returns the status of this rss feeds.
	 *
	 * @return the status of this rss feeds
	 */
	public int getStatus();

	/**
	 * Sets the status of this rss feeds.
	 *
	 * @param status the status of this rss feeds
	 */
	public void setStatus(int status);

	/**
	 * Returns the created ID of this rss feeds.
	 *
	 * @return the created ID of this rss feeds
	 */
	public long getCreatedId();

	/**
	 * Sets the created ID of this rss feeds.
	 *
	 * @param createdId the created ID of this rss feeds
	 */
	public void setCreatedId(long createdId);

	/**
	 * Returns the created date of this rss feeds.
	 *
	 * @return the created date of this rss feeds
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this rss feeds.
	 *
	 * @param createdDate the created date of this rss feeds
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the approved ID of this rss feeds.
	 *
	 * @return the approved ID of this rss feeds
	 */
	public long getApprovedId();

	/**
	 * Sets the approved ID of this rss feeds.
	 *
	 * @param approvedId the approved ID of this rss feeds
	 */
	public void setApprovedId(long approvedId);

	/**
	 * Returns the approved date of this rss feeds.
	 *
	 * @return the approved date of this rss feeds
	 */
	public Date getApprovedDate();

	/**
	 * Sets the approved date of this rss feeds.
	 *
	 * @param approvedDate the approved date of this rss feeds
	 */
	public void setApprovedDate(Date approvedDate);

	/**
	 * Returns the rss category ID of this rss feeds.
	 *
	 * @return the rss category ID of this rss feeds
	 */
	public long getRssCategoryId();

	/**
	 * Sets the rss category ID of this rss feeds.
	 *
	 * @param rssCategoryId the rss category ID of this rss feeds
	 */
	public void setRssCategoryId(long rssCategoryId);

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
	public int compareTo(com.vnpt.portal.rss.model.RssFeeds rssFeeds);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.vnpt.portal.rss.model.RssFeeds> toCacheModel();

	@Override
	public com.vnpt.portal.rss.model.RssFeeds toEscapedModel();

	@Override
	public com.vnpt.portal.rss.model.RssFeeds toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
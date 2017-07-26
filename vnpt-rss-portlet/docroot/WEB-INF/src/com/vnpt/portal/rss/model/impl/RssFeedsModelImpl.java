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

package com.vnpt.portal.rss.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.vnpt.portal.rss.model.RssFeeds;
import com.vnpt.portal.rss.model.RssFeedsModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the RssFeeds service. Represents a row in the &quot;eportal_rss_feeds&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vnpt.portal.rss.model.RssFeedsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RssFeedsImpl}.
 * </p>
 *
 * @author MrNet
 * @see RssFeedsImpl
 * @see com.vnpt.portal.rss.model.RssFeeds
 * @see com.vnpt.portal.rss.model.RssFeedsModel
 * @generated
 */
public class RssFeedsModelImpl extends BaseModelImpl<RssFeeds>
	implements RssFeedsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a rss feeds model instance should use the {@link com.vnpt.portal.rss.model.RssFeeds} interface instead.
	 */
	public static final String TABLE_NAME = "eportal_rss_feeds";
	public static final Object[][] TABLE_COLUMNS = {
			{ "rssFeedsId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "title", Types.VARCHAR },
			{ "url", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "content", Types.VARCHAR },
			{ "author", Types.VARCHAR },
			{ "publishedDate", Types.TIMESTAMP },
			{ "status", Types.INTEGER },
			{ "createdId", Types.BIGINT },
			{ "createdDate", Types.TIMESTAMP },
			{ "approvedId", Types.BIGINT },
			{ "approvedDate", Types.TIMESTAMP },
			{ "rssCategoryId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table eportal_rss_feeds (rssFeedsId LONG not null primary key,groupId LONG,companyId LONG,title VARCHAR(75) null,url VARCHAR(75) null,description VARCHAR(75) null,content VARCHAR(75) null,author VARCHAR(75) null,publishedDate DATE null,status INTEGER,createdId LONG,createdDate DATE null,approvedId LONG,approvedDate DATE null,rssCategoryId LONG)";
	public static final String TABLE_SQL_DROP = "drop table eportal_rss_feeds";
	public static final String ORDER_BY_JPQL = " ORDER BY rssFeeds.groupId ASC, rssFeeds.title ASC";
	public static final String ORDER_BY_SQL = " ORDER BY eportal_rss_feeds.groupId ASC, eportal_rss_feeds.title ASC";
	public static final String DATA_SOURCE = "eGovDataSource";
	public static final String SESSION_FACTORY = "eGovSessionFactory";
	public static final String TX_MANAGER = "eGovTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vnpt.portal.rss.model.RssFeeds"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vnpt.portal.rss.model.RssFeeds"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.vnpt.portal.rss.model.RssFeeds"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long URL_COLUMN_BITMASK = 4L;
	public static long TITLE_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vnpt.portal.rss.model.RssFeeds"));

	public RssFeedsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _rssFeedsId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRssFeedsId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _rssFeedsId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getRssFeedsId() {
		return _rssFeedsId;
	}

	@Override
	public void setRssFeedsId(long rssFeedsId) {
		_rssFeedsId = rssFeedsId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask = -1L;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_columnBitmask = -1L;

		_title = title;
	}

	@Override
	public String getUrl() {
		if (_url == null) {
			return StringPool.BLANK;
		}
		else {
			return _url;
		}
	}

	@Override
	public void setUrl(String url) {
		_columnBitmask |= URL_COLUMN_BITMASK;

		if (_originalUrl == null) {
			_originalUrl = _url;
		}

		_url = url;
	}

	public String getOriginalUrl() {
		return GetterUtil.getString(_originalUrl);
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public String getContent() {
		if (_content == null) {
			return StringPool.BLANK;
		}
		else {
			return _content;
		}
	}

	@Override
	public void setContent(String content) {
		_content = content;
	}

	@Override
	public String getAuthor() {
		if (_author == null) {
			return StringPool.BLANK;
		}
		else {
			return _author;
		}
	}

	@Override
	public void setAuthor(String author) {
		_author = author;
	}

	@Override
	public Date getPublishedDate() {
		return _publishedDate;
	}

	@Override
	public void setPublishedDate(Date publishedDate) {
		_publishedDate = publishedDate;
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;
	}

	@Override
	public long getCreatedId() {
		return _createdId;
	}

	@Override
	public void setCreatedId(long createdId) {
		_createdId = createdId;
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	@Override
	public long getApprovedId() {
		return _approvedId;
	}

	@Override
	public void setApprovedId(long approvedId) {
		_approvedId = approvedId;
	}

	@Override
	public Date getApprovedDate() {
		return _approvedDate;
	}

	@Override
	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;
	}

	@Override
	public long getRssCategoryId() {
		return _rssCategoryId;
	}

	@Override
	public void setRssCategoryId(long rssCategoryId) {
		_rssCategoryId = rssCategoryId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			RssFeeds.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public RssFeeds toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (RssFeeds)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		RssFeedsImpl rssFeedsImpl = new RssFeedsImpl();

		rssFeedsImpl.setRssFeedsId(getRssFeedsId());
		rssFeedsImpl.setGroupId(getGroupId());
		rssFeedsImpl.setCompanyId(getCompanyId());
		rssFeedsImpl.setTitle(getTitle());
		rssFeedsImpl.setUrl(getUrl());
		rssFeedsImpl.setDescription(getDescription());
		rssFeedsImpl.setContent(getContent());
		rssFeedsImpl.setAuthor(getAuthor());
		rssFeedsImpl.setPublishedDate(getPublishedDate());
		rssFeedsImpl.setStatus(getStatus());
		rssFeedsImpl.setCreatedId(getCreatedId());
		rssFeedsImpl.setCreatedDate(getCreatedDate());
		rssFeedsImpl.setApprovedId(getApprovedId());
		rssFeedsImpl.setApprovedDate(getApprovedDate());
		rssFeedsImpl.setRssCategoryId(getRssCategoryId());

		rssFeedsImpl.resetOriginalValues();

		return rssFeedsImpl;
	}

	@Override
	public int compareTo(RssFeeds rssFeeds) {
		int value = 0;

		if (getGroupId() < rssFeeds.getGroupId()) {
			value = -1;
		}
		else if (getGroupId() > rssFeeds.getGroupId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = getTitle().compareTo(rssFeeds.getTitle());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RssFeeds)) {
			return false;
		}

		RssFeeds rssFeeds = (RssFeeds)obj;

		long primaryKey = rssFeeds.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		RssFeedsModelImpl rssFeedsModelImpl = this;

		rssFeedsModelImpl._originalGroupId = rssFeedsModelImpl._groupId;

		rssFeedsModelImpl._setOriginalGroupId = false;

		rssFeedsModelImpl._originalCompanyId = rssFeedsModelImpl._companyId;

		rssFeedsModelImpl._setOriginalCompanyId = false;

		rssFeedsModelImpl._originalUrl = rssFeedsModelImpl._url;

		rssFeedsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<RssFeeds> toCacheModel() {
		RssFeedsCacheModel rssFeedsCacheModel = new RssFeedsCacheModel();

		rssFeedsCacheModel.rssFeedsId = getRssFeedsId();

		rssFeedsCacheModel.groupId = getGroupId();

		rssFeedsCacheModel.companyId = getCompanyId();

		rssFeedsCacheModel.title = getTitle();

		String title = rssFeedsCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			rssFeedsCacheModel.title = null;
		}

		rssFeedsCacheModel.url = getUrl();

		String url = rssFeedsCacheModel.url;

		if ((url != null) && (url.length() == 0)) {
			rssFeedsCacheModel.url = null;
		}

		rssFeedsCacheModel.description = getDescription();

		String description = rssFeedsCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			rssFeedsCacheModel.description = null;
		}

		rssFeedsCacheModel.content = getContent();

		String content = rssFeedsCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			rssFeedsCacheModel.content = null;
		}

		rssFeedsCacheModel.author = getAuthor();

		String author = rssFeedsCacheModel.author;

		if ((author != null) && (author.length() == 0)) {
			rssFeedsCacheModel.author = null;
		}

		Date publishedDate = getPublishedDate();

		if (publishedDate != null) {
			rssFeedsCacheModel.publishedDate = publishedDate.getTime();
		}
		else {
			rssFeedsCacheModel.publishedDate = Long.MIN_VALUE;
		}

		rssFeedsCacheModel.status = getStatus();

		rssFeedsCacheModel.createdId = getCreatedId();

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			rssFeedsCacheModel.createdDate = createdDate.getTime();
		}
		else {
			rssFeedsCacheModel.createdDate = Long.MIN_VALUE;
		}

		rssFeedsCacheModel.approvedId = getApprovedId();

		Date approvedDate = getApprovedDate();

		if (approvedDate != null) {
			rssFeedsCacheModel.approvedDate = approvedDate.getTime();
		}
		else {
			rssFeedsCacheModel.approvedDate = Long.MIN_VALUE;
		}

		rssFeedsCacheModel.rssCategoryId = getRssCategoryId();

		return rssFeedsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{rssFeedsId=");
		sb.append(getRssFeedsId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", author=");
		sb.append(getAuthor());
		sb.append(", publishedDate=");
		sb.append(getPublishedDate());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", createdId=");
		sb.append(getCreatedId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", approvedId=");
		sb.append(getApprovedId());
		sb.append(", approvedDate=");
		sb.append(getApprovedDate());
		sb.append(", rssCategoryId=");
		sb.append(getRssCategoryId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.vnpt.portal.rss.model.RssFeeds");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>rssFeedsId</column-name><column-value><![CDATA[");
		sb.append(getRssFeedsId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>author</column-name><column-value><![CDATA[");
		sb.append(getAuthor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>publishedDate</column-name><column-value><![CDATA[");
		sb.append(getPublishedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdId</column-name><column-value><![CDATA[");
		sb.append(getCreatedId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvedId</column-name><column-value><![CDATA[");
		sb.append(getApprovedId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvedDate</column-name><column-value><![CDATA[");
		sb.append(getApprovedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rssCategoryId</column-name><column-value><![CDATA[");
		sb.append(getRssCategoryId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = RssFeeds.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			RssFeeds.class
		};
	private long _rssFeedsId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private String _title;
	private String _url;
	private String _originalUrl;
	private String _description;
	private String _content;
	private String _author;
	private Date _publishedDate;
	private int _status;
	private long _createdId;
	private Date _createdDate;
	private long _approvedId;
	private Date _approvedDate;
	private long _rssCategoryId;
	private long _columnBitmask;
	private RssFeeds _escapedModel;
}
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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.vnpt.portal.rss.service.ClpSerializer;
import com.vnpt.portal.rss.service.RssFeedsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MrNet
 */
public class RssFeedsClp extends BaseModelImpl<RssFeeds> implements RssFeeds {
	public RssFeedsClp() {
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

		if (_rssFeedsRemoteModel != null) {
			try {
				Class<?> clazz = _rssFeedsRemoteModel.getClass();

				Method method = clazz.getMethod("setRssFeedsId", long.class);

				method.invoke(_rssFeedsRemoteModel, rssFeedsId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_rssFeedsRemoteModel != null) {
			try {
				Class<?> clazz = _rssFeedsRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_rssFeedsRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_rssFeedsRemoteModel != null) {
			try {
				Class<?> clazz = _rssFeedsRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_rssFeedsRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTitle() {
		return _title;
	}

	@Override
	public void setTitle(String title) {
		_title = title;

		if (_rssFeedsRemoteModel != null) {
			try {
				Class<?> clazz = _rssFeedsRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_rssFeedsRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUrl() {
		return _url;
	}

	@Override
	public void setUrl(String url) {
		_url = url;

		if (_rssFeedsRemoteModel != null) {
			try {
				Class<?> clazz = _rssFeedsRemoteModel.getClass();

				Method method = clazz.getMethod("setUrl", String.class);

				method.invoke(_rssFeedsRemoteModel, url);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_rssFeedsRemoteModel != null) {
			try {
				Class<?> clazz = _rssFeedsRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_rssFeedsRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContent() {
		return _content;
	}

	@Override
	public void setContent(String content) {
		_content = content;

		if (_rssFeedsRemoteModel != null) {
			try {
				Class<?> clazz = _rssFeedsRemoteModel.getClass();

				Method method = clazz.getMethod("setContent", String.class);

				method.invoke(_rssFeedsRemoteModel, content);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAuthor() {
		return _author;
	}

	@Override
	public void setAuthor(String author) {
		_author = author;

		if (_rssFeedsRemoteModel != null) {
			try {
				Class<?> clazz = _rssFeedsRemoteModel.getClass();

				Method method = clazz.getMethod("setAuthor", String.class);

				method.invoke(_rssFeedsRemoteModel, author);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPublishedDate() {
		return _publishedDate;
	}

	@Override
	public void setPublishedDate(Date publishedDate) {
		_publishedDate = publishedDate;

		if (_rssFeedsRemoteModel != null) {
			try {
				Class<?> clazz = _rssFeedsRemoteModel.getClass();

				Method method = clazz.getMethod("setPublishedDate", Date.class);

				method.invoke(_rssFeedsRemoteModel, publishedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;

		if (_rssFeedsRemoteModel != null) {
			try {
				Class<?> clazz = _rssFeedsRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_rssFeedsRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreatedId() {
		return _createdId;
	}

	@Override
	public void setCreatedId(long createdId) {
		_createdId = createdId;

		if (_rssFeedsRemoteModel != null) {
			try {
				Class<?> clazz = _rssFeedsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedId", long.class);

				method.invoke(_rssFeedsRemoteModel, createdId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;

		if (_rssFeedsRemoteModel != null) {
			try {
				Class<?> clazz = _rssFeedsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_rssFeedsRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getApprovedId() {
		return _approvedId;
	}

	@Override
	public void setApprovedId(long approvedId) {
		_approvedId = approvedId;

		if (_rssFeedsRemoteModel != null) {
			try {
				Class<?> clazz = _rssFeedsRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovedId", long.class);

				method.invoke(_rssFeedsRemoteModel, approvedId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getApprovedDate() {
		return _approvedDate;
	}

	@Override
	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;

		if (_rssFeedsRemoteModel != null) {
			try {
				Class<?> clazz = _rssFeedsRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovedDate", Date.class);

				method.invoke(_rssFeedsRemoteModel, approvedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRssCategoryId() {
		return _rssCategoryId;
	}

	@Override
	public void setRssCategoryId(long rssCategoryId) {
		_rssCategoryId = rssCategoryId;

		if (_rssFeedsRemoteModel != null) {
			try {
				Class<?> clazz = _rssFeedsRemoteModel.getClass();

				Method method = clazz.getMethod("setRssCategoryId", long.class);

				method.invoke(_rssFeedsRemoteModel, rssCategoryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRssFeedsRemoteModel() {
		return _rssFeedsRemoteModel;
	}

	public void setRssFeedsRemoteModel(BaseModel<?> rssFeedsRemoteModel) {
		_rssFeedsRemoteModel = rssFeedsRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _rssFeedsRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_rssFeedsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RssFeedsLocalServiceUtil.addRssFeeds(this);
		}
		else {
			RssFeedsLocalServiceUtil.updateRssFeeds(this);
		}
	}

	@Override
	public RssFeeds toEscapedModel() {
		return (RssFeeds)ProxyUtil.newProxyInstance(RssFeeds.class.getClassLoader(),
			new Class[] { RssFeeds.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RssFeedsClp clone = new RssFeedsClp();

		clone.setRssFeedsId(getRssFeedsId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setTitle(getTitle());
		clone.setUrl(getUrl());
		clone.setDescription(getDescription());
		clone.setContent(getContent());
		clone.setAuthor(getAuthor());
		clone.setPublishedDate(getPublishedDate());
		clone.setStatus(getStatus());
		clone.setCreatedId(getCreatedId());
		clone.setCreatedDate(getCreatedDate());
		clone.setApprovedId(getApprovedId());
		clone.setApprovedDate(getApprovedDate());
		clone.setRssCategoryId(getRssCategoryId());

		return clone;
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

		if (!(obj instanceof RssFeedsClp)) {
			return false;
		}

		RssFeedsClp rssFeeds = (RssFeedsClp)obj;

		long primaryKey = rssFeeds.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
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

	private long _rssFeedsId;
	private long _groupId;
	private long _companyId;
	private String _title;
	private String _url;
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
	private BaseModel<?> _rssFeedsRemoteModel;
	private Class<?> _clpSerializerClass = com.vnpt.portal.rss.service.ClpSerializer.class;
}
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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author MrNet
 * @generated
 */
public class RssFeedsSoap implements Serializable {
	public static RssFeedsSoap toSoapModel(RssFeeds model) {
		RssFeedsSoap soapModel = new RssFeedsSoap();

		soapModel.setRssFeedsId(model.getRssFeedsId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setTitle(model.getTitle());
		soapModel.setUrl(model.getUrl());
		soapModel.setDescription(model.getDescription());
		soapModel.setContent(model.getContent());
		soapModel.setAuthor(model.getAuthor());
		soapModel.setPublishedDate(model.getPublishedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setCreatedId(model.getCreatedId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setApprovedId(model.getApprovedId());
		soapModel.setApprovedDate(model.getApprovedDate());
		soapModel.setRssCategoryId(model.getRssCategoryId());

		return soapModel;
	}

	public static RssFeedsSoap[] toSoapModels(RssFeeds[] models) {
		RssFeedsSoap[] soapModels = new RssFeedsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RssFeedsSoap[][] toSoapModels(RssFeeds[][] models) {
		RssFeedsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RssFeedsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RssFeedsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RssFeedsSoap[] toSoapModels(List<RssFeeds> models) {
		List<RssFeedsSoap> soapModels = new ArrayList<RssFeedsSoap>(models.size());

		for (RssFeeds model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RssFeedsSoap[soapModels.size()]);
	}

	public RssFeedsSoap() {
	}

	public long getPrimaryKey() {
		return _rssFeedsId;
	}

	public void setPrimaryKey(long pk) {
		setRssFeedsId(pk);
	}

	public long getRssFeedsId() {
		return _rssFeedsId;
	}

	public void setRssFeedsId(long rssFeedsId) {
		_rssFeedsId = rssFeedsId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public String getAuthor() {
		return _author;
	}

	public void setAuthor(String author) {
		_author = author;
	}

	public Date getPublishedDate() {
		return _publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		_publishedDate = publishedDate;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getCreatedId() {
		return _createdId;
	}

	public void setCreatedId(long createdId) {
		_createdId = createdId;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public long getApprovedId() {
		return _approvedId;
	}

	public void setApprovedId(long approvedId) {
		_approvedId = approvedId;
	}

	public Date getApprovedDate() {
		return _approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;
	}

	public long getRssCategoryId() {
		return _rssCategoryId;
	}

	public void setRssCategoryId(long rssCategoryId) {
		_rssCategoryId = rssCategoryId;
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
}
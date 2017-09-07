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
public class RssCategorySoap implements Serializable {
	public static RssCategorySoap toSoapModel(RssCategory model) {
		RssCategorySoap soapModel = new RssCategorySoap();

		soapModel.setRssCategoryId(model.getRssCategoryId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setStatus(model.getStatus());
		soapModel.setCreatedId(model.getCreatedId());
		soapModel.setCreatedDate(model.getCreatedDate());

		return soapModel;
	}

	public static RssCategorySoap[] toSoapModels(RssCategory[] models) {
		RssCategorySoap[] soapModels = new RssCategorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RssCategorySoap[][] toSoapModels(RssCategory[][] models) {
		RssCategorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RssCategorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new RssCategorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RssCategorySoap[] toSoapModels(List<RssCategory> models) {
		List<RssCategorySoap> soapModels = new ArrayList<RssCategorySoap>(models.size());

		for (RssCategory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RssCategorySoap[soapModels.size()]);
	}

	public RssCategorySoap() {
	}

	public long getPrimaryKey() {
		return _rssCategoryId;
	}

	public void setPrimaryKey(long pk) {
		setRssCategoryId(pk);
	}

	public long getRssCategoryId() {
		return _rssCategoryId;
	}

	public void setRssCategoryId(long rssCategoryId) {
		_rssCategoryId = rssCategoryId;
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
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

	private long _rssCategoryId;
	private long _groupId;
	private long _companyId;
	private String _name;
	private String _description;
	private int _status;
	private long _createdId;
	private Date _createdDate;
}
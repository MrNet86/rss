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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author MrNet
 * @generated
 */
public class RssConfigSoap implements Serializable {
	public static RssConfigSoap toSoapModel(RssConfig model) {
		RssConfigSoap soapModel = new RssConfigSoap();

		soapModel.setRssConfigId(model.getRssConfigId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setTitle(model.getTitle());
		soapModel.setUrl(model.getUrl());

		return soapModel;
	}

	public static RssConfigSoap[] toSoapModels(RssConfig[] models) {
		RssConfigSoap[] soapModels = new RssConfigSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RssConfigSoap[][] toSoapModels(RssConfig[][] models) {
		RssConfigSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RssConfigSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RssConfigSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RssConfigSoap[] toSoapModels(List<RssConfig> models) {
		List<RssConfigSoap> soapModels = new ArrayList<RssConfigSoap>(models.size());

		for (RssConfig model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RssConfigSoap[soapModels.size()]);
	}

	public RssConfigSoap() {
	}

	public long getPrimaryKey() {
		return _rssConfigId;
	}

	public void setPrimaryKey(long pk) {
		setRssConfigId(pk);
	}

	public long getRssConfigId() {
		return _rssConfigId;
	}

	public void setRssConfigId(long rssConfigId) {
		_rssConfigId = rssConfigId;
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

	private long _rssConfigId;
	private long _groupId;
	private long _companyId;
	private String _title;
	private String _url;
}
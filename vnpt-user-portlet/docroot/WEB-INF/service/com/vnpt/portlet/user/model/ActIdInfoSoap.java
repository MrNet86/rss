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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author ToanNQ86
 * @generated
 */
public class ActIdInfoSoap implements Serializable {
	public static ActIdInfoSoap toSoapModel(ActIdInfo model) {
		ActIdInfoSoap soapModel = new ActIdInfoSoap();

		soapModel.setId(model.getId());
		soapModel.setRev(model.getRev());
		soapModel.setUserId(model.getUserId());
		soapModel.setType(model.getType());
		soapModel.setKey(model.getKey());
		soapModel.setValue(model.getValue());
		soapModel.setPassword(model.getPassword());
		soapModel.setParent_id_(model.getParent_id_());

		return soapModel;
	}

	public static ActIdInfoSoap[] toSoapModels(ActIdInfo[] models) {
		ActIdInfoSoap[] soapModels = new ActIdInfoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ActIdInfoSoap[][] toSoapModels(ActIdInfo[][] models) {
		ActIdInfoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ActIdInfoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ActIdInfoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ActIdInfoSoap[] toSoapModels(List<ActIdInfo> models) {
		List<ActIdInfoSoap> soapModels = new ArrayList<ActIdInfoSoap>(models.size());

		for (ActIdInfo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ActIdInfoSoap[soapModels.size()]);
	}

	public ActIdInfoSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getRev() {
		return _rev;
	}

	public void setRev(long rev) {
		_rev = rev;
	}

	public String getUserId() {
		return _userId;
	}

	public void setUserId(String userId) {
		_userId = userId;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public String getKey() {
		return _key;
	}

	public void setKey(String key) {
		_key = key;
	}

	public String getValue() {
		return _value;
	}

	public void setValue(String value) {
		_value = value;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public String getParent_id_() {
		return _parent_id_;
	}

	public void setParent_id_(String parent_id_) {
		_parent_id_ = parent_id_;
	}

	private long _id;
	private long _rev;
	private String _userId;
	private String _type;
	private String _key;
	private String _value;
	private String _password;
	private String _parent_id_;
}
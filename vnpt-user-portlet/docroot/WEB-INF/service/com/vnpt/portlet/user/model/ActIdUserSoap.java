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
public class ActIdUserSoap implements Serializable {
	public static ActIdUserSoap toSoapModel(ActIdUser model) {
		ActIdUserSoap soapModel = new ActIdUserSoap();

		soapModel.setId(model.getId());
		soapModel.setRev(model.getRev());
		soapModel.setFirst(model.getFirst());
		soapModel.setLast(model.getLast());
		soapModel.setEmail(model.getEmail());
		soapModel.setPwd(model.getPwd());
		soapModel.setPictureId(model.getPictureId());

		return soapModel;
	}

	public static ActIdUserSoap[] toSoapModels(ActIdUser[] models) {
		ActIdUserSoap[] soapModels = new ActIdUserSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ActIdUserSoap[][] toSoapModels(ActIdUser[][] models) {
		ActIdUserSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ActIdUserSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ActIdUserSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ActIdUserSoap[] toSoapModels(List<ActIdUser> models) {
		List<ActIdUserSoap> soapModels = new ArrayList<ActIdUserSoap>(models.size());

		for (ActIdUser model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ActIdUserSoap[soapModels.size()]);
	}

	public ActIdUserSoap() {
	}

	public String getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(String pk) {
		setId(pk);
	}

	public String getId() {
		return _id;
	}

	public void setId(String id) {
		_id = id;
	}

	public long getRev() {
		return _rev;
	}

	public void setRev(long rev) {
		_rev = rev;
	}

	public String getFirst() {
		return _first;
	}

	public void setFirst(String first) {
		_first = first;
	}

	public String getLast() {
		return _last;
	}

	public void setLast(String last) {
		_last = last;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getPwd() {
		return _pwd;
	}

	public void setPwd(String pwd) {
		_pwd = pwd;
	}

	public String getPictureId() {
		return _pictureId;
	}

	public void setPictureId(String pictureId) {
		_pictureId = pictureId;
	}

	private String _id;
	private long _rev;
	private String _first;
	private String _last;
	private String _email;
	private String _pwd;
	private String _pictureId;
}
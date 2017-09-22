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
public class ActIdGroupSoap implements Serializable {
	public static ActIdGroupSoap toSoapModel(ActIdGroup model) {
		ActIdGroupSoap soapModel = new ActIdGroupSoap();

		soapModel.setId(model.getId());
		soapModel.setRev(model.getRev());
		soapModel.setName(model.getName());
		soapModel.setType(model.getType());

		return soapModel;
	}

	public static ActIdGroupSoap[] toSoapModels(ActIdGroup[] models) {
		ActIdGroupSoap[] soapModels = new ActIdGroupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ActIdGroupSoap[][] toSoapModels(ActIdGroup[][] models) {
		ActIdGroupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ActIdGroupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ActIdGroupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ActIdGroupSoap[] toSoapModels(List<ActIdGroup> models) {
		List<ActIdGroupSoap> soapModels = new ArrayList<ActIdGroupSoap>(models.size());

		for (ActIdGroup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ActIdGroupSoap[soapModels.size()]);
	}

	public ActIdGroupSoap() {
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	private String _id;
	private long _rev;
	private String _name;
	private String _type;
}
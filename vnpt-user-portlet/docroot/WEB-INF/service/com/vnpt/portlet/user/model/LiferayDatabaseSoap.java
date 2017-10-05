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
public class LiferayDatabaseSoap implements Serializable {
	public static LiferayDatabaseSoap toSoapModel(LiferayDatabase model) {
		LiferayDatabaseSoap soapModel = new LiferayDatabaseSoap();

		soapModel.setItemFieldId(model.getItemFieldId());
		soapModel.setItemId(model.getItemId());
		soapModel.setName(model.getName());
		soapModel.setValues(model.getValues());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static LiferayDatabaseSoap[] toSoapModels(LiferayDatabase[] models) {
		LiferayDatabaseSoap[] soapModels = new LiferayDatabaseSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LiferayDatabaseSoap[][] toSoapModels(
		LiferayDatabase[][] models) {
		LiferayDatabaseSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LiferayDatabaseSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LiferayDatabaseSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LiferayDatabaseSoap[] toSoapModels(
		List<LiferayDatabase> models) {
		List<LiferayDatabaseSoap> soapModels = new ArrayList<LiferayDatabaseSoap>(models.size());

		for (LiferayDatabase model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LiferayDatabaseSoap[soapModels.size()]);
	}

	public LiferayDatabaseSoap() {
	}

	public long getPrimaryKey() {
		return _itemFieldId;
	}

	public void setPrimaryKey(long pk) {
		setItemFieldId(pk);
	}

	public long getItemFieldId() {
		return _itemFieldId;
	}

	public void setItemFieldId(long itemFieldId) {
		_itemFieldId = itemFieldId;
	}

	public long getItemId() {
		return _itemId;
	}

	public void setItemId(long itemId) {
		_itemId = itemId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getValues() {
		return _values;
	}

	public void setValues(String values) {
		_values = values;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _itemFieldId;
	private long _itemId;
	private String _name;
	private String _values;
	private String _description;
}
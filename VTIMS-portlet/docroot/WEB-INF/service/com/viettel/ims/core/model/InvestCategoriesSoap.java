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

package com.viettel.ims.core.model;

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
public class InvestCategoriesSoap implements Serializable {
	public static InvestCategoriesSoap toSoapModel(InvestCategories model) {
		InvestCategoriesSoap soapModel = new InvestCategoriesSoap();

		soapModel.setInvestCategoriesId(model.getInvestCategoriesId());
		soapModel.setObjId(model.getObjId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setUnitId(model.getUnitId());
		soapModel.setCostType(model.getCostType());
		soapModel.setQuantity(model.getQuantity());
		soapModel.setUsedQuantity(model.getUsedQuantity());
		soapModel.setUnitPrice(model.getUnitPrice());
		soapModel.setCatCurrencyId(model.getCatCurrencyId());
		soapModel.setType(model.getType());
		soapModel.setVat(model.getVat());
		soapModel.setIsActive(model.getIsActive());
		soapModel.setCreatedId(model.getCreatedId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifieldId(model.getModifieldId());
		soapModel.setModifieldDate(model.getModifieldDate());

		return soapModel;
	}

	public static InvestCategoriesSoap[] toSoapModels(InvestCategories[] models) {
		InvestCategoriesSoap[] soapModels = new InvestCategoriesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InvestCategoriesSoap[][] toSoapModels(
		InvestCategories[][] models) {
		InvestCategoriesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InvestCategoriesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InvestCategoriesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InvestCategoriesSoap[] toSoapModels(
		List<InvestCategories> models) {
		List<InvestCategoriesSoap> soapModels = new ArrayList<InvestCategoriesSoap>(models.size());

		for (InvestCategories model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InvestCategoriesSoap[soapModels.size()]);
	}

	public InvestCategoriesSoap() {
	}

	public long getPrimaryKey() {
		return _investCategoriesId;
	}

	public void setPrimaryKey(long pk) {
		setInvestCategoriesId(pk);
	}

	public long getInvestCategoriesId() {
		return _investCategoriesId;
	}

	public void setInvestCategoriesId(long investCategoriesId) {
		_investCategoriesId = investCategoriesId;
	}

	public long getObjId() {
		return _objId;
	}

	public void setObjId(long objId) {
		_objId = objId;
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

	public long getUnitId() {
		return _unitId;
	}

	public void setUnitId(long unitId) {
		_unitId = unitId;
	}

	public long getCostType() {
		return _costType;
	}

	public void setCostType(long costType) {
		_costType = costType;
	}

	public double getQuantity() {
		return _quantity;
	}

	public void setQuantity(double quantity) {
		_quantity = quantity;
	}

	public double getUsedQuantity() {
		return _usedQuantity;
	}

	public void setUsedQuantity(double usedQuantity) {
		_usedQuantity = usedQuantity;
	}

	public double getUnitPrice() {
		return _unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		_unitPrice = unitPrice;
	}

	public long getCatCurrencyId() {
		return _catCurrencyId;
	}

	public void setCatCurrencyId(long catCurrencyId) {
		_catCurrencyId = catCurrencyId;
	}

	public long getType() {
		return _type;
	}

	public void setType(long type) {
		_type = type;
	}

	public double getVat() {
		return _vat;
	}

	public void setVat(double vat) {
		_vat = vat;
	}

	public long getIsActive() {
		return _isActive;
	}

	public void setIsActive(long isActive) {
		_isActive = isActive;
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

	public long getModifieldId() {
		return _modifieldId;
	}

	public void setModifieldId(long modifieldId) {
		_modifieldId = modifieldId;
	}

	public Date getModifieldDate() {
		return _modifieldDate;
	}

	public void setModifieldDate(Date modifieldDate) {
		_modifieldDate = modifieldDate;
	}

	private long _investCategoriesId;
	private long _objId;
	private String _name;
	private String _description;
	private long _unitId;
	private long _costType;
	private double _quantity;
	private double _usedQuantity;
	private double _unitPrice;
	private long _catCurrencyId;
	private long _type;
	private double _vat;
	private long _isActive;
	private long _createdId;
	private Date _createdDate;
	private long _modifieldId;
	private Date _modifieldDate;
}
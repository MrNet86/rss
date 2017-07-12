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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link InvestCategories}.
 * </p>
 *
 * @author MrNet
 * @see InvestCategories
 * @generated
 */
public class InvestCategoriesWrapper implements InvestCategories,
	ModelWrapper<InvestCategories> {
	public InvestCategoriesWrapper(InvestCategories investCategories) {
		_investCategories = investCategories;
	}

	@Override
	public Class<?> getModelClass() {
		return InvestCategories.class;
	}

	@Override
	public String getModelClassName() {
		return InvestCategories.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("investCategoriesId", getInvestCategoriesId());
		attributes.put("objId", getObjId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("unitId", getUnitId());
		attributes.put("costType", getCostType());
		attributes.put("quantity", getQuantity());
		attributes.put("usedQuantity", getUsedQuantity());
		attributes.put("unitPrice", getUnitPrice());
		attributes.put("catCurrencyId", getCatCurrencyId());
		attributes.put("type", getType());
		attributes.put("vat", getVat());
		attributes.put("isActive", getIsActive());
		attributes.put("createdId", getCreatedId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifieldId", getModifieldId());
		attributes.put("modifieldDate", getModifieldDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long investCategoriesId = (Long)attributes.get("investCategoriesId");

		if (investCategoriesId != null) {
			setInvestCategoriesId(investCategoriesId);
		}

		Long objId = (Long)attributes.get("objId");

		if (objId != null) {
			setObjId(objId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long unitId = (Long)attributes.get("unitId");

		if (unitId != null) {
			setUnitId(unitId);
		}

		Long costType = (Long)attributes.get("costType");

		if (costType != null) {
			setCostType(costType);
		}

		Double quantity = (Double)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		Double usedQuantity = (Double)attributes.get("usedQuantity");

		if (usedQuantity != null) {
			setUsedQuantity(usedQuantity);
		}

		Double unitPrice = (Double)attributes.get("unitPrice");

		if (unitPrice != null) {
			setUnitPrice(unitPrice);
		}

		Long catCurrencyId = (Long)attributes.get("catCurrencyId");

		if (catCurrencyId != null) {
			setCatCurrencyId(catCurrencyId);
		}

		Long type = (Long)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Double vat = (Double)attributes.get("vat");

		if (vat != null) {
			setVat(vat);
		}

		Long isActive = (Long)attributes.get("isActive");

		if (isActive != null) {
			setIsActive(isActive);
		}

		Long createdId = (Long)attributes.get("createdId");

		if (createdId != null) {
			setCreatedId(createdId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long modifieldId = (Long)attributes.get("modifieldId");

		if (modifieldId != null) {
			setModifieldId(modifieldId);
		}

		Date modifieldDate = (Date)attributes.get("modifieldDate");

		if (modifieldDate != null) {
			setModifieldDate(modifieldDate);
		}
	}

	/**
	* Returns the primary key of this invest categories.
	*
	* @return the primary key of this invest categories
	*/
	@Override
	public long getPrimaryKey() {
		return _investCategories.getPrimaryKey();
	}

	/**
	* Sets the primary key of this invest categories.
	*
	* @param primaryKey the primary key of this invest categories
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_investCategories.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the invest categories ID of this invest categories.
	*
	* @return the invest categories ID of this invest categories
	*/
	@Override
	public long getInvestCategoriesId() {
		return _investCategories.getInvestCategoriesId();
	}

	/**
	* Sets the invest categories ID of this invest categories.
	*
	* @param investCategoriesId the invest categories ID of this invest categories
	*/
	@Override
	public void setInvestCategoriesId(long investCategoriesId) {
		_investCategories.setInvestCategoriesId(investCategoriesId);
	}

	/**
	* Returns the obj ID of this invest categories.
	*
	* @return the obj ID of this invest categories
	*/
	@Override
	public long getObjId() {
		return _investCategories.getObjId();
	}

	/**
	* Sets the obj ID of this invest categories.
	*
	* @param objId the obj ID of this invest categories
	*/
	@Override
	public void setObjId(long objId) {
		_investCategories.setObjId(objId);
	}

	/**
	* Returns the name of this invest categories.
	*
	* @return the name of this invest categories
	*/
	@Override
	public java.lang.String getName() {
		return _investCategories.getName();
	}

	/**
	* Sets the name of this invest categories.
	*
	* @param name the name of this invest categories
	*/
	@Override
	public void setName(java.lang.String name) {
		_investCategories.setName(name);
	}

	/**
	* Returns the description of this invest categories.
	*
	* @return the description of this invest categories
	*/
	@Override
	public java.lang.String getDescription() {
		return _investCategories.getDescription();
	}

	/**
	* Sets the description of this invest categories.
	*
	* @param description the description of this invest categories
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_investCategories.setDescription(description);
	}

	/**
	* Returns the unit ID of this invest categories.
	*
	* @return the unit ID of this invest categories
	*/
	@Override
	public long getUnitId() {
		return _investCategories.getUnitId();
	}

	/**
	* Sets the unit ID of this invest categories.
	*
	* @param unitId the unit ID of this invest categories
	*/
	@Override
	public void setUnitId(long unitId) {
		_investCategories.setUnitId(unitId);
	}

	/**
	* Returns the cost type of this invest categories.
	*
	* @return the cost type of this invest categories
	*/
	@Override
	public long getCostType() {
		return _investCategories.getCostType();
	}

	/**
	* Sets the cost type of this invest categories.
	*
	* @param costType the cost type of this invest categories
	*/
	@Override
	public void setCostType(long costType) {
		_investCategories.setCostType(costType);
	}

	/**
	* Returns the quantity of this invest categories.
	*
	* @return the quantity of this invest categories
	*/
	@Override
	public double getQuantity() {
		return _investCategories.getQuantity();
	}

	/**
	* Sets the quantity of this invest categories.
	*
	* @param quantity the quantity of this invest categories
	*/
	@Override
	public void setQuantity(double quantity) {
		_investCategories.setQuantity(quantity);
	}

	/**
	* Returns the used quantity of this invest categories.
	*
	* @return the used quantity of this invest categories
	*/
	@Override
	public double getUsedQuantity() {
		return _investCategories.getUsedQuantity();
	}

	/**
	* Sets the used quantity of this invest categories.
	*
	* @param usedQuantity the used quantity of this invest categories
	*/
	@Override
	public void setUsedQuantity(double usedQuantity) {
		_investCategories.setUsedQuantity(usedQuantity);
	}

	/**
	* Returns the unit price of this invest categories.
	*
	* @return the unit price of this invest categories
	*/
	@Override
	public double getUnitPrice() {
		return _investCategories.getUnitPrice();
	}

	/**
	* Sets the unit price of this invest categories.
	*
	* @param unitPrice the unit price of this invest categories
	*/
	@Override
	public void setUnitPrice(double unitPrice) {
		_investCategories.setUnitPrice(unitPrice);
	}

	/**
	* Returns the cat currency ID of this invest categories.
	*
	* @return the cat currency ID of this invest categories
	*/
	@Override
	public long getCatCurrencyId() {
		return _investCategories.getCatCurrencyId();
	}

	/**
	* Sets the cat currency ID of this invest categories.
	*
	* @param catCurrencyId the cat currency ID of this invest categories
	*/
	@Override
	public void setCatCurrencyId(long catCurrencyId) {
		_investCategories.setCatCurrencyId(catCurrencyId);
	}

	/**
	* Returns the type of this invest categories.
	*
	* @return the type of this invest categories
	*/
	@Override
	public long getType() {
		return _investCategories.getType();
	}

	/**
	* Sets the type of this invest categories.
	*
	* @param type the type of this invest categories
	*/
	@Override
	public void setType(long type) {
		_investCategories.setType(type);
	}

	/**
	* Returns the vat of this invest categories.
	*
	* @return the vat of this invest categories
	*/
	@Override
	public double getVat() {
		return _investCategories.getVat();
	}

	/**
	* Sets the vat of this invest categories.
	*
	* @param vat the vat of this invest categories
	*/
	@Override
	public void setVat(double vat) {
		_investCategories.setVat(vat);
	}

	/**
	* Returns the is active of this invest categories.
	*
	* @return the is active of this invest categories
	*/
	@Override
	public long getIsActive() {
		return _investCategories.getIsActive();
	}

	/**
	* Sets the is active of this invest categories.
	*
	* @param isActive the is active of this invest categories
	*/
	@Override
	public void setIsActive(long isActive) {
		_investCategories.setIsActive(isActive);
	}

	/**
	* Returns the created ID of this invest categories.
	*
	* @return the created ID of this invest categories
	*/
	@Override
	public long getCreatedId() {
		return _investCategories.getCreatedId();
	}

	/**
	* Sets the created ID of this invest categories.
	*
	* @param createdId the created ID of this invest categories
	*/
	@Override
	public void setCreatedId(long createdId) {
		_investCategories.setCreatedId(createdId);
	}

	/**
	* Returns the created date of this invest categories.
	*
	* @return the created date of this invest categories
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _investCategories.getCreatedDate();
	}

	/**
	* Sets the created date of this invest categories.
	*
	* @param createdDate the created date of this invest categories
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_investCategories.setCreatedDate(createdDate);
	}

	/**
	* Returns the modifield ID of this invest categories.
	*
	* @return the modifield ID of this invest categories
	*/
	@Override
	public long getModifieldId() {
		return _investCategories.getModifieldId();
	}

	/**
	* Sets the modifield ID of this invest categories.
	*
	* @param modifieldId the modifield ID of this invest categories
	*/
	@Override
	public void setModifieldId(long modifieldId) {
		_investCategories.setModifieldId(modifieldId);
	}

	/**
	* Returns the modifield date of this invest categories.
	*
	* @return the modifield date of this invest categories
	*/
	@Override
	public java.util.Date getModifieldDate() {
		return _investCategories.getModifieldDate();
	}

	/**
	* Sets the modifield date of this invest categories.
	*
	* @param modifieldDate the modifield date of this invest categories
	*/
	@Override
	public void setModifieldDate(java.util.Date modifieldDate) {
		_investCategories.setModifieldDate(modifieldDate);
	}

	@Override
	public boolean isNew() {
		return _investCategories.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_investCategories.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _investCategories.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_investCategories.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _investCategories.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _investCategories.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_investCategories.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _investCategories.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_investCategories.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_investCategories.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_investCategories.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InvestCategoriesWrapper((InvestCategories)_investCategories.clone());
	}

	@Override
	public int compareTo(
		com.viettel.ims.core.model.InvestCategories investCategories) {
		return _investCategories.compareTo(investCategories);
	}

	@Override
	public int hashCode() {
		return _investCategories.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.viettel.ims.core.model.InvestCategories> toCacheModel() {
		return _investCategories.toCacheModel();
	}

	@Override
	public com.viettel.ims.core.model.InvestCategories toEscapedModel() {
		return new InvestCategoriesWrapper(_investCategories.toEscapedModel());
	}

	@Override
	public com.viettel.ims.core.model.InvestCategories toUnescapedModel() {
		return new InvestCategoriesWrapper(_investCategories.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _investCategories.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _investCategories.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_investCategories.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InvestCategoriesWrapper)) {
			return false;
		}

		InvestCategoriesWrapper investCategoriesWrapper = (InvestCategoriesWrapper)obj;

		if (Validator.equals(_investCategories,
					investCategoriesWrapper._investCategories)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public InvestCategories getWrappedInvestCategories() {
		return _investCategories;
	}

	@Override
	public InvestCategories getWrappedModel() {
		return _investCategories;
	}

	@Override
	public void resetOriginalValues() {
		_investCategories.resetOriginalValues();
	}

	private InvestCategories _investCategories;
}
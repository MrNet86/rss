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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.viettel.ims.core.service.ClpSerializer;
import com.viettel.ims.core.service.InvestCategoriesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MrNet
 */
public class InvestCategoriesClp extends BaseModelImpl<InvestCategories>
	implements InvestCategories {
	public InvestCategoriesClp() {
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
	public long getPrimaryKey() {
		return _investCategoriesId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setInvestCategoriesId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _investCategoriesId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getInvestCategoriesId() {
		return _investCategoriesId;
	}

	@Override
	public void setInvestCategoriesId(long investCategoriesId) {
		_investCategoriesId = investCategoriesId;

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setInvestCategoriesId",
						long.class);

				method.invoke(_investCategoriesRemoteModel, investCategoriesId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getObjId() {
		return _objId;
	}

	@Override
	public void setObjId(long objId) {
		_objId = objId;

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setObjId", long.class);

				method.invoke(_investCategoriesRemoteModel, objId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_investCategoriesRemoteModel, name);
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

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_investCategoriesRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUnitId() {
		return _unitId;
	}

	@Override
	public void setUnitId(long unitId) {
		_unitId = unitId;

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitId", long.class);

				method.invoke(_investCategoriesRemoteModel, unitId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCostType() {
		return _costType;
	}

	@Override
	public void setCostType(long costType) {
		_costType = costType;

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setCostType", long.class);

				method.invoke(_investCategoriesRemoteModel, costType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getQuantity() {
		return _quantity;
	}

	@Override
	public void setQuantity(double quantity) {
		_quantity = quantity;

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setQuantity", double.class);

				method.invoke(_investCategoriesRemoteModel, quantity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getUsedQuantity() {
		return _usedQuantity;
	}

	@Override
	public void setUsedQuantity(double usedQuantity) {
		_usedQuantity = usedQuantity;

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setUsedQuantity", double.class);

				method.invoke(_investCategoriesRemoteModel, usedQuantity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getUnitPrice() {
		return _unitPrice;
	}

	@Override
	public void setUnitPrice(double unitPrice) {
		_unitPrice = unitPrice;

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitPrice", double.class);

				method.invoke(_investCategoriesRemoteModel, unitPrice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCatCurrencyId() {
		return _catCurrencyId;
	}

	@Override
	public void setCatCurrencyId(long catCurrencyId) {
		_catCurrencyId = catCurrencyId;

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setCatCurrencyId", long.class);

				method.invoke(_investCategoriesRemoteModel, catCurrencyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getType() {
		return _type;
	}

	@Override
	public void setType(long type) {
		_type = type;

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setType", long.class);

				method.invoke(_investCategoriesRemoteModel, type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getVat() {
		return _vat;
	}

	@Override
	public void setVat(double vat) {
		_vat = vat;

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setVat", double.class);

				method.invoke(_investCategoriesRemoteModel, vat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIsActive() {
		return _isActive;
	}

	@Override
	public void setIsActive(long isActive) {
		_isActive = isActive;

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setIsActive", long.class);

				method.invoke(_investCategoriesRemoteModel, isActive);
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

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedId", long.class);

				method.invoke(_investCategoriesRemoteModel, createdId);
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

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_investCategoriesRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getModifieldId() {
		return _modifieldId;
	}

	@Override
	public void setModifieldId(long modifieldId) {
		_modifieldId = modifieldId;

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setModifieldId", long.class);

				method.invoke(_investCategoriesRemoteModel, modifieldId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifieldDate() {
		return _modifieldDate;
	}

	@Override
	public void setModifieldDate(Date modifieldDate) {
		_modifieldDate = modifieldDate;

		if (_investCategoriesRemoteModel != null) {
			try {
				Class<?> clazz = _investCategoriesRemoteModel.getClass();

				Method method = clazz.getMethod("setModifieldDate", Date.class);

				method.invoke(_investCategoriesRemoteModel, modifieldDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getInvestCategoriesRemoteModel() {
		return _investCategoriesRemoteModel;
	}

	public void setInvestCategoriesRemoteModel(
		BaseModel<?> investCategoriesRemoteModel) {
		_investCategoriesRemoteModel = investCategoriesRemoteModel;
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

		Class<?> remoteModelClass = _investCategoriesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_investCategoriesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			InvestCategoriesLocalServiceUtil.addInvestCategories(this);
		}
		else {
			InvestCategoriesLocalServiceUtil.updateInvestCategories(this);
		}
	}

	@Override
	public InvestCategories toEscapedModel() {
		return (InvestCategories)ProxyUtil.newProxyInstance(InvestCategories.class.getClassLoader(),
			new Class[] { InvestCategories.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		InvestCategoriesClp clone = new InvestCategoriesClp();

		clone.setInvestCategoriesId(getInvestCategoriesId());
		clone.setObjId(getObjId());
		clone.setName(getName());
		clone.setDescription(getDescription());
		clone.setUnitId(getUnitId());
		clone.setCostType(getCostType());
		clone.setQuantity(getQuantity());
		clone.setUsedQuantity(getUsedQuantity());
		clone.setUnitPrice(getUnitPrice());
		clone.setCatCurrencyId(getCatCurrencyId());
		clone.setType(getType());
		clone.setVat(getVat());
		clone.setIsActive(getIsActive());
		clone.setCreatedId(getCreatedId());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifieldId(getModifieldId());
		clone.setModifieldDate(getModifieldDate());

		return clone;
	}

	@Override
	public int compareTo(InvestCategories investCategories) {
		int value = 0;

		value = getName().compareTo(investCategories.getName());

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

		if (!(obj instanceof InvestCategoriesClp)) {
			return false;
		}

		InvestCategoriesClp investCategories = (InvestCategoriesClp)obj;

		long primaryKey = investCategories.getPrimaryKey();

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
		StringBundler sb = new StringBundler(35);

		sb.append("{investCategoriesId=");
		sb.append(getInvestCategoriesId());
		sb.append(", objId=");
		sb.append(getObjId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", unitId=");
		sb.append(getUnitId());
		sb.append(", costType=");
		sb.append(getCostType());
		sb.append(", quantity=");
		sb.append(getQuantity());
		sb.append(", usedQuantity=");
		sb.append(getUsedQuantity());
		sb.append(", unitPrice=");
		sb.append(getUnitPrice());
		sb.append(", catCurrencyId=");
		sb.append(getCatCurrencyId());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", vat=");
		sb.append(getVat());
		sb.append(", isActive=");
		sb.append(getIsActive());
		sb.append(", createdId=");
		sb.append(getCreatedId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", modifieldId=");
		sb.append(getModifieldId());
		sb.append(", modifieldDate=");
		sb.append(getModifieldDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.viettel.ims.core.model.InvestCategories");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>investCategoriesId</column-name><column-value><![CDATA[");
		sb.append(getInvestCategoriesId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>objId</column-name><column-value><![CDATA[");
		sb.append(getObjId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitId</column-name><column-value><![CDATA[");
		sb.append(getUnitId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>costType</column-name><column-value><![CDATA[");
		sb.append(getCostType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantity</column-name><column-value><![CDATA[");
		sb.append(getQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usedQuantity</column-name><column-value><![CDATA[");
		sb.append(getUsedQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitPrice</column-name><column-value><![CDATA[");
		sb.append(getUnitPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>catCurrencyId</column-name><column-value><![CDATA[");
		sb.append(getCatCurrencyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vat</column-name><column-value><![CDATA[");
		sb.append(getVat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isActive</column-name><column-value><![CDATA[");
		sb.append(getIsActive());
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
			"<column><column-name>modifieldId</column-name><column-value><![CDATA[");
		sb.append(getModifieldId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifieldDate</column-name><column-value><![CDATA[");
		sb.append(getModifieldDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _investCategoriesRemoteModel;
	private Class<?> _clpSerializerClass = com.viettel.ims.core.service.ClpSerializer.class;
}
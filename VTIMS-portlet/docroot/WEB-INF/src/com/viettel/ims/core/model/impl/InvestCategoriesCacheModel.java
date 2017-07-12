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

package com.viettel.ims.core.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.viettel.ims.core.model.InvestCategories;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing InvestCategories in entity cache.
 *
 * @author MrNet
 * @see InvestCategories
 * @generated
 */
public class InvestCategoriesCacheModel implements CacheModel<InvestCategories>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{investCategoriesId=");
		sb.append(investCategoriesId);
		sb.append(", objId=");
		sb.append(objId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", unitId=");
		sb.append(unitId);
		sb.append(", costType=");
		sb.append(costType);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", usedQuantity=");
		sb.append(usedQuantity);
		sb.append(", unitPrice=");
		sb.append(unitPrice);
		sb.append(", catCurrencyId=");
		sb.append(catCurrencyId);
		sb.append(", type=");
		sb.append(type);
		sb.append(", vat=");
		sb.append(vat);
		sb.append(", isActive=");
		sb.append(isActive);
		sb.append(", createdId=");
		sb.append(createdId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", modifieldId=");
		sb.append(modifieldId);
		sb.append(", modifieldDate=");
		sb.append(modifieldDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public InvestCategories toEntityModel() {
		InvestCategoriesImpl investCategoriesImpl = new InvestCategoriesImpl();

		investCategoriesImpl.setInvestCategoriesId(investCategoriesId);
		investCategoriesImpl.setObjId(objId);

		if (name == null) {
			investCategoriesImpl.setName(StringPool.BLANK);
		}
		else {
			investCategoriesImpl.setName(name);
		}

		if (description == null) {
			investCategoriesImpl.setDescription(StringPool.BLANK);
		}
		else {
			investCategoriesImpl.setDescription(description);
		}

		investCategoriesImpl.setUnitId(unitId);
		investCategoriesImpl.setCostType(costType);
		investCategoriesImpl.setQuantity(quantity);
		investCategoriesImpl.setUsedQuantity(usedQuantity);
		investCategoriesImpl.setUnitPrice(unitPrice);
		investCategoriesImpl.setCatCurrencyId(catCurrencyId);
		investCategoriesImpl.setType(type);
		investCategoriesImpl.setVat(vat);
		investCategoriesImpl.setIsActive(isActive);
		investCategoriesImpl.setCreatedId(createdId);

		if (createdDate == Long.MIN_VALUE) {
			investCategoriesImpl.setCreatedDate(null);
		}
		else {
			investCategoriesImpl.setCreatedDate(new Date(createdDate));
		}

		investCategoriesImpl.setModifieldId(modifieldId);

		if (modifieldDate == Long.MIN_VALUE) {
			investCategoriesImpl.setModifieldDate(null);
		}
		else {
			investCategoriesImpl.setModifieldDate(new Date(modifieldDate));
		}

		investCategoriesImpl.resetOriginalValues();

		return investCategoriesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		investCategoriesId = objectInput.readLong();
		objId = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		unitId = objectInput.readLong();
		costType = objectInput.readLong();
		quantity = objectInput.readDouble();
		usedQuantity = objectInput.readDouble();
		unitPrice = objectInput.readDouble();
		catCurrencyId = objectInput.readLong();
		type = objectInput.readLong();
		vat = objectInput.readDouble();
		isActive = objectInput.readLong();
		createdId = objectInput.readLong();
		createdDate = objectInput.readLong();
		modifieldId = objectInput.readLong();
		modifieldDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(investCategoriesId);
		objectOutput.writeLong(objId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(unitId);
		objectOutput.writeLong(costType);
		objectOutput.writeDouble(quantity);
		objectOutput.writeDouble(usedQuantity);
		objectOutput.writeDouble(unitPrice);
		objectOutput.writeLong(catCurrencyId);
		objectOutput.writeLong(type);
		objectOutput.writeDouble(vat);
		objectOutput.writeLong(isActive);
		objectOutput.writeLong(createdId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(modifieldId);
		objectOutput.writeLong(modifieldDate);
	}

	public long investCategoriesId;
	public long objId;
	public String name;
	public String description;
	public long unitId;
	public long costType;
	public double quantity;
	public double usedQuantity;
	public double unitPrice;
	public long catCurrencyId;
	public long type;
	public double vat;
	public long isActive;
	public long createdId;
	public long createdDate;
	public long modifieldId;
	public long modifieldDate;
}
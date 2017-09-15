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

package com.vt.portlet.camera.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Customer service. Represents a row in the &quot;vt_Customer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vt.portlet.camera.model.impl.CustomerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vt.portlet.camera.model.impl.CustomerImpl}.
 * </p>
 *
 * @author MrNet
 * @see Customer
 * @see com.vt.portlet.camera.model.impl.CustomerImpl
 * @see com.vt.portlet.camera.model.impl.CustomerModelImpl
 * @generated
 */
public interface CustomerModel extends BaseModel<Customer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a customer model instance should use the {@link Customer} interface instead.
	 */

	/**
	 * Returns the primary key of this customer.
	 *
	 * @return the primary key of this customer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this customer.
	 *
	 * @param primaryKey the primary key of this customer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the customer ID of this customer.
	 *
	 * @return the customer ID of this customer
	 */
	public long getCustomerId();

	/**
	 * Sets the customer ID of this customer.
	 *
	 * @param customerId the customer ID of this customer
	 */
	public void setCustomerId(long customerId);

	/**
	 * Returns the customer group of this customer.
	 *
	 * @return the customer group of this customer
	 */
	public long getCustomerGroup();

	/**
	 * Sets the customer group of this customer.
	 *
	 * @param customerGroup the customer group of this customer
	 */
	public void setCustomerGroup(long customerGroup);

	/**
	 * Returns the customer type of this customer.
	 *
	 * @return the customer type of this customer
	 */
	public long getCustomerType();

	/**
	 * Sets the customer type of this customer.
	 *
	 * @param customerType the customer type of this customer
	 */
	public void setCustomerType(long customerType);

	/**
	 * Returns the full name of this customer.
	 *
	 * @return the full name of this customer
	 */
	@AutoEscape
	public String getFullName();

	/**
	 * Sets the full name of this customer.
	 *
	 * @param fullName the full name of this customer
	 */
	public void setFullName(String fullName);

	/**
	 * Returns the birthday of this customer.
	 *
	 * @return the birthday of this customer
	 */
	public Date getBirthday();

	/**
	 * Sets the birthday of this customer.
	 *
	 * @param birthday the birthday of this customer
	 */
	public void setBirthday(Date birthday);

	/**
	 * Returns the sex of this customer.
	 *
	 * @return the sex of this customer
	 */
	public long getSex();

	/**
	 * Sets the sex of this customer.
	 *
	 * @param sex the sex of this customer
	 */
	public void setSex(long sex);

	/**
	 * Returns the national ID of this customer.
	 *
	 * @return the national ID of this customer
	 */
	public long getNationalId();

	/**
	 * Sets the national ID of this customer.
	 *
	 * @param nationalId the national ID of this customer
	 */
	public void setNationalId(long nationalId);

	/**
	 * Returns the address of this customer.
	 *
	 * @return the address of this customer
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this customer.
	 *
	 * @param address the address of this customer
	 */
	public void setAddress(String address);

	/**
	 * Returns the description of this customer.
	 *
	 * @return the description of this customer
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this customer.
	 *
	 * @param description the description of this customer
	 */
	public void setDescription(String description);

	/**
	 * Returns the identify no of this customer.
	 *
	 * @return the identify no of this customer
	 */
	@AutoEscape
	public String getIdentifyNo();

	/**
	 * Sets the identify no of this customer.
	 *
	 * @param identifyNo the identify no of this customer
	 */
	public void setIdentifyNo(String identifyNo);

	/**
	 * Returns the issue date of this customer.
	 *
	 * @return the issue date of this customer
	 */
	public Date getIssueDate();

	/**
	 * Sets the issue date of this customer.
	 *
	 * @param issueDate the issue date of this customer
	 */
	public void setIssueDate(Date issueDate);

	/**
	 * Returns the issue place of this customer.
	 *
	 * @return the issue place of this customer
	 */
	@AutoEscape
	public String getIssuePlace();

	/**
	 * Sets the issue place of this customer.
	 *
	 * @param issuePlace the issue place of this customer
	 */
	public void setIssuePlace(String issuePlace);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.vt.portlet.camera.model.Customer customer);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.vt.portlet.camera.model.Customer> toCacheModel();

	@Override
	public com.vt.portlet.camera.model.Customer toEscapedModel();

	@Override
	public com.vt.portlet.camera.model.Customer toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
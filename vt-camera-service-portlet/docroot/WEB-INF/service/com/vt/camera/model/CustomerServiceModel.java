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

package com.vt.camera.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CustomerService service. Represents a row in the &quot;vt_Customer_service&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vt.camera.model.impl.CustomerServiceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vt.camera.model.impl.CustomerServiceImpl}.
 * </p>
 *
 * @author MrNet
 * @see CustomerService
 * @see com.vt.camera.model.impl.CustomerServiceImpl
 * @see com.vt.camera.model.impl.CustomerServiceModelImpl
 * @generated
 */
public interface CustomerServiceModel extends BaseModel<CustomerService> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a customer service model instance should use the {@link CustomerService} interface instead.
	 */

	/**
	 * Returns the primary key of this customer service.
	 *
	 * @return the primary key of this customer service
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this customer service.
	 *
	 * @param primaryKey the primary key of this customer service
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the customer service ID of this customer service.
	 *
	 * @return the customer service ID of this customer service
	 */
	public long getCustomerServiceId();

	/**
	 * Sets the customer service ID of this customer service.
	 *
	 * @param customerServiceId the customer service ID of this customer service
	 */
	public void setCustomerServiceId(long customerServiceId);

	/**
	 * Returns the customer ID of this customer service.
	 *
	 * @return the customer ID of this customer service
	 */
	public long getCustomerId();

	/**
	 * Sets the customer ID of this customer service.
	 *
	 * @param customerId the customer ID of this customer service
	 */
	public void setCustomerId(long customerId);

	/**
	 * Returns the deploy name of this customer service.
	 *
	 * @return the deploy name of this customer service
	 */
	@AutoEscape
	public String getDeployName();

	/**
	 * Sets the deploy name of this customer service.
	 *
	 * @param deployName the deploy name of this customer service
	 */
	public void setDeployName(String deployName);

	/**
	 * Returns the appoint date of this customer service.
	 *
	 * @return the appoint date of this customer service
	 */
	public Date getAppointDate();

	/**
	 * Sets the appoint date of this customer service.
	 *
	 * @param appointDate the appoint date of this customer service
	 */
	public void setAppointDate(Date appointDate);

	/**
	 * Returns the service type of this customer service.
	 *
	 * @return the service type of this customer service
	 */
	public long getServiceType();

	/**
	 * Sets the service type of this customer service.
	 *
	 * @param serviceType the service type of this customer service
	 */
	public void setServiceType(long serviceType);

	/**
	 * Returns the address of this customer service.
	 *
	 * @return the address of this customer service
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this customer service.
	 *
	 * @param address the address of this customer service
	 */
	public void setAddress(String address);

	/**
	 * Returns the line of this customer service.
	 *
	 * @return the line of this customer service
	 */
	@AutoEscape
	public String getLine();

	/**
	 * Sets the line of this customer service.
	 *
	 * @param line the line of this customer service
	 */
	public void setLine(String line);

	/**
	 * Returns the deploy type of this customer service.
	 *
	 * @return the deploy type of this customer service
	 */
	public long getDeployType();

	/**
	 * Sets the deploy type of this customer service.
	 *
	 * @param deployType the deploy type of this customer service
	 */
	public void setDeployType(long deployType);

	/**
	 * Returns the package type of this customer service.
	 *
	 * @return the package type of this customer service
	 */
	@AutoEscape
	public String getPackageType();

	/**
	 * Sets the package type of this customer service.
	 *
	 * @param packageType the package type of this customer service
	 */
	public void setPackageType(String packageType);

	/**
	 * Returns the isdn no of this customer service.
	 *
	 * @return the isdn no of this customer service
	 */
	@AutoEscape
	public String getIsdnNo();

	/**
	 * Sets the isdn no of this customer service.
	 *
	 * @param isdnNo the isdn no of this customer service
	 */
	public void setIsdnNo(String isdnNo);

	/**
	 * Returns the account type of this customer service.
	 *
	 * @return the account type of this customer service
	 */
	public long getAccountType();

	/**
	 * Sets the account type of this customer service.
	 *
	 * @param accountType the account type of this customer service
	 */
	public void setAccountType(long accountType);

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
	public int compareTo(com.vt.camera.model.CustomerService customerService);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.vt.camera.model.CustomerService> toCacheModel();

	@Override
	public com.vt.camera.model.CustomerService toEscapedModel();

	@Override
	public com.vt.camera.model.CustomerService toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
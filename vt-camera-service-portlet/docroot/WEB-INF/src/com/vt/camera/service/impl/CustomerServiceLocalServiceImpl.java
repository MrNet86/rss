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

package com.vt.camera.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.vt.camera.model.CustomerService;
import com.vt.camera.service.base.CustomerServiceLocalServiceBaseImpl;
import com.vt.camera.service.persistence.CustomerServiceUtil;

/**
 * The implementation of the customer service local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vt.camera.service.CustomerServiceLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author MrNet
 * @see com.vt.camera.service.base.CustomerServiceLocalServiceBaseImpl
 * @see com.vt.camera.service.CustomerServiceLocalServiceUtil
 */
public class CustomerServiceLocalServiceImpl
	extends CustomerServiceLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.vt.camera.service.CustomerServiceLocalServiceUtil} to access the customer service local service.
	 */

	public List<CustomerService> findBycustomerId(long customerId) throws SystemException {

		return CustomerServiceUtil.findBycustomerId(customerId);
	}

}
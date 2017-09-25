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

package com.vnpt.portlet.user.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.vnpt.portlet.user.model.PermissionGroup;
import com.vnpt.portlet.user.service.base.PermissionGroupLocalServiceBaseImpl;
import com.vnpt.portlet.user.service.persistence.PermissionGroupUtil;

/**
 * The implementation of the permission group local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vnpt.portlet.user.service.PermissionGroupLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ToanNQ86
 * @see com.vnpt.portlet.user.service.base.PermissionGroupLocalServiceBaseImpl
 * @see com.vnpt.portlet.user.service.PermissionGroupLocalServiceUtil
 */
public class PermissionGroupLocalServiceImpl
	extends PermissionGroupLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.vnpt.portlet.user.service.PermissionGroupLocalServiceUtil} to access the permission group local service.
	 */
	
	/**
	 * 
	 * @param groupId
	 * @param status
	 * @param start
	 * @param end
	 * @return
	 * @throws SystemException
	 */
	public List<PermissionGroup> findByActiveGroupId (long groupId, int status, int start, int end) throws SystemException {
		return PermissionGroupUtil.findByActiveGroupId(groupId, status, start, end);
	}
	
	/**
	 * write custom sql to get count
	 * @param groupId
	 * @param status
	 * @return
	 * @throws SystemException
	 */
	public int countByfindByActiveGroupId (long groupId, int status) throws SystemException {
		List lst = new ArrayList();
		lst = PermissionGroupUtil.findByActiveGroupId(groupId, status);
		return lst.size();
	}
	
}
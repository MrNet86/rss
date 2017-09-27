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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Role;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.vnpt.portlet.user.model.GroupRoles;
import com.vnpt.portlet.user.service.base.GroupRolesLocalServiceBaseImpl;
import com.vnpt.portlet.user.service.persistence.GroupRolesUtil;

/**
 * The implementation of the group roles local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vnpt.portlet.user.service.GroupRolesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ToanNQ86
 * @see com.vnpt.portlet.user.service.base.GroupRolesLocalServiceBaseImpl
 * @see com.vnpt.portlet.user.service.GroupRolesLocalServiceUtil
 */
public class GroupRolesLocalServiceImpl extends GroupRolesLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.vnpt.portlet.user.service.GroupRolesLocalServiceUtil} to access the group roles local service.
	 */
	
	public List<Role> getRolesByPerGroupId (long permissionGroupId) throws SystemException, PortalException {
		List<Role> lstResult = new ArrayList<Role>();
		List<GroupRoles> lst = GroupRolesUtil.findByPermissionGroupId(permissionGroupId);
		for (GroupRoles obj : lst) {
			Role role = RoleLocalServiceUtil.getRole(obj.getRoleId());
			lstResult.add(role);
		}
		return lstResult;
	}
	
	
	public List<Long> getRolesIdByPerGroupId (long permissionGroupId) throws SystemException, PortalException {

		List<Long> lstResult = new ArrayList<Long>();
		List<GroupRoles> lst = GroupRolesUtil.findByPermissionGroupId(permissionGroupId);
		for (GroupRoles obj : lst) {
			lstResult.add(obj.getRoleId());
		}
		
		return lstResult;
	}
	
	
}
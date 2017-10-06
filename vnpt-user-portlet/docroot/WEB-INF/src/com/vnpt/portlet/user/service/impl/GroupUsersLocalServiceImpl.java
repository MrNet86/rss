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
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.vnpt.portlet.user.model.GroupRoles;
import com.vnpt.portlet.user.model.GroupUsers;
import com.vnpt.portlet.user.service.base.GroupUsersLocalServiceBaseImpl;
import com.vnpt.portlet.user.service.persistence.GroupUsersFinderUtil;
import com.vnpt.portlet.user.service.persistence.GroupUsersUtil;

/**
 * The implementation of the group users local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vnpt.portlet.user.service.GroupUsersLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ToanNQ86
 * @see com.vnpt.portlet.user.service.base.GroupUsersLocalServiceBaseImpl
 * @see com.vnpt.portlet.user.service.GroupUsersLocalServiceUtil
 */
public class GroupUsersLocalServiceImpl extends GroupUsersLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.vnpt.portlet.user.service.GroupUsersLocalServiceUtil} to access the group users local service.
	 */
	
	public List<User> getUserByPermissionGroupId (long permissionGroupId) throws SystemException, PortalException {
		
		List<User> lstUser = new ArrayList<User>();
		List<GroupUsers> lstGroupUsers = GroupUsersUtil.findByPermissionGroupId(permissionGroupId);
		for (GroupUsers gp : lstGroupUsers) {
			long userId = gp.getUserId();
			User u = UserLocalServiceUtil.getUser(userId);
			lstUser.add(u);
		}
		
		return lstUser;
	}
}
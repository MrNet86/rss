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

import com.liferay.portal.model.User;
import com.vnpt.portlet.user.service.base.LiferayDatabaseLocalServiceBaseImpl;
import com.vnpt.portlet.user.service.persistence.LiferayDatabaseFinderUtil;

/**
 * The implementation of the liferay database local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vnpt.portlet.user.service.LiferayDatabaseLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ToanNQ86
 * @see com.vnpt.portlet.user.service.base.LiferayDatabaseLocalServiceBaseImpl
 * @see com.vnpt.portlet.user.service.LiferayDatabaseLocalServiceUtil
 */
public class LiferayDatabaseLocalServiceImpl
	extends LiferayDatabaseLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.vnpt.portlet.user.service.LiferayDatabaseLocalServiceUtil} to access the liferay database local service.
	 */
	
	public List<User> findAllUserByGroupAndChild(long groupId, int start, int end) {
		
		List<User> lstResult = LiferayDatabaseFinderUtil.findAllUserByGroupAndChild(groupId, start, end);
		if(lstResult == null) {			
			return new ArrayList<User>();
		} else {
			return lstResult;
		}
	}

	public int countAllUserByGroupAndChild(long groupId) {
		
		List lst = LiferayDatabaseFinderUtil.countAllUserByGroupAndChild(groupId);
		if(lst != null){
			return ((Integer)lst.get(0)).intValue();
		}
		
		return 0;
	}
	
}
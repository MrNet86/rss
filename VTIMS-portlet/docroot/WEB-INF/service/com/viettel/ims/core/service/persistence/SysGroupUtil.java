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

package com.viettel.ims.core.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.viettel.ims.core.model.SysGroup;

import java.util.List;

/**
 * The persistence utility for the sys group service. This utility wraps {@link SysGroupPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see SysGroupPersistence
 * @see SysGroupPersistenceImpl
 * @generated
 */
public class SysGroupUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(SysGroup sysGroup) {
		getPersistence().clearCache(sysGroup);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SysGroup> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SysGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SysGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static SysGroup update(SysGroup sysGroup) throws SystemException {
		return getPersistence().update(sysGroup);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static SysGroup update(SysGroup sysGroup,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(sysGroup, serviceContext);
	}

	/**
	* Returns all the sys groups where name = &#63; and status = &#63;.
	*
	* @param name the name
	* @param status the status
	* @return the matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.SysGroup> findByname(
		java.lang.String name, long status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByname(name, status);
	}

	/**
	* Returns a range of all the sys groups where name = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.SysGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param status the status
	* @param start the lower bound of the range of sys groups
	* @param end the upper bound of the range of sys groups (not inclusive)
	* @return the range of matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.SysGroup> findByname(
		java.lang.String name, long status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByname(name, status, start, end);
	}

	/**
	* Returns an ordered range of all the sys groups where name = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.SysGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param status the status
	* @param start the lower bound of the range of sys groups
	* @param end the upper bound of the range of sys groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.SysGroup> findByname(
		java.lang.String name, long status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByname(name, status, start, end, orderByComparator);
	}

	/**
	* Returns the first sys group in the ordered set where name = &#63; and status = &#63;.
	*
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sys group
	* @throws com.viettel.ims.core.NoSuchSysGroupException if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup findByname_First(
		java.lang.String name, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException {
		return getPersistence().findByname_First(name, status, orderByComparator);
	}

	/**
	* Returns the first sys group in the ordered set where name = &#63; and status = &#63;.
	*
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sys group, or <code>null</code> if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup fetchByname_First(
		java.lang.String name, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByname_First(name, status, orderByComparator);
	}

	/**
	* Returns the last sys group in the ordered set where name = &#63; and status = &#63;.
	*
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sys group
	* @throws com.viettel.ims.core.NoSuchSysGroupException if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup findByname_Last(
		java.lang.String name, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException {
		return getPersistence().findByname_Last(name, status, orderByComparator);
	}

	/**
	* Returns the last sys group in the ordered set where name = &#63; and status = &#63;.
	*
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sys group, or <code>null</code> if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup fetchByname_Last(
		java.lang.String name, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByname_Last(name, status, orderByComparator);
	}

	/**
	* Returns the sys groups before and after the current sys group in the ordered set where name = &#63; and status = &#63;.
	*
	* @param groupId the primary key of the current sys group
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sys group
	* @throws com.viettel.ims.core.NoSuchSysGroupException if a sys group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup[] findByname_PrevAndNext(
		long groupId, java.lang.String name, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException {
		return getPersistence()
				   .findByname_PrevAndNext(groupId, name, status,
			orderByComparator);
	}

	/**
	* Removes all the sys groups where name = &#63; and status = &#63; from the database.
	*
	* @param name the name
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByname(java.lang.String name, long status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByname(name, status);
	}

	/**
	* Returns the number of sys groups where name = &#63; and status = &#63;.
	*
	* @param name the name
	* @param status the status
	* @return the number of matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByname(java.lang.String name, long status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByname(name, status);
	}

	/**
	* Returns all the sys groups where groupCode = &#63; and status = &#63;.
	*
	* @param groupCode the group code
	* @param status the status
	* @return the matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.SysGroup> findBygroupCode(
		java.lang.String groupCode, long status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupCode(groupCode, status);
	}

	/**
	* Returns a range of all the sys groups where groupCode = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.SysGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupCode the group code
	* @param status the status
	* @param start the lower bound of the range of sys groups
	* @param end the upper bound of the range of sys groups (not inclusive)
	* @return the range of matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.SysGroup> findBygroupCode(
		java.lang.String groupCode, long status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupCode(groupCode, status, start, end);
	}

	/**
	* Returns an ordered range of all the sys groups where groupCode = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.SysGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupCode the group code
	* @param status the status
	* @param start the lower bound of the range of sys groups
	* @param end the upper bound of the range of sys groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.SysGroup> findBygroupCode(
		java.lang.String groupCode, long status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBygroupCode(groupCode, status, start, end,
			orderByComparator);
	}

	/**
	* Returns the first sys group in the ordered set where groupCode = &#63; and status = &#63;.
	*
	* @param groupCode the group code
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sys group
	* @throws com.viettel.ims.core.NoSuchSysGroupException if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup findBygroupCode_First(
		java.lang.String groupCode, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException {
		return getPersistence()
				   .findBygroupCode_First(groupCode, status, orderByComparator);
	}

	/**
	* Returns the first sys group in the ordered set where groupCode = &#63; and status = &#63;.
	*
	* @param groupCode the group code
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sys group, or <code>null</code> if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup fetchBygroupCode_First(
		java.lang.String groupCode, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBygroupCode_First(groupCode, status, orderByComparator);
	}

	/**
	* Returns the last sys group in the ordered set where groupCode = &#63; and status = &#63;.
	*
	* @param groupCode the group code
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sys group
	* @throws com.viettel.ims.core.NoSuchSysGroupException if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup findBygroupCode_Last(
		java.lang.String groupCode, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException {
		return getPersistence()
				   .findBygroupCode_Last(groupCode, status, orderByComparator);
	}

	/**
	* Returns the last sys group in the ordered set where groupCode = &#63; and status = &#63;.
	*
	* @param groupCode the group code
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sys group, or <code>null</code> if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup fetchBygroupCode_Last(
		java.lang.String groupCode, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBygroupCode_Last(groupCode, status, orderByComparator);
	}

	/**
	* Returns the sys groups before and after the current sys group in the ordered set where groupCode = &#63; and status = &#63;.
	*
	* @param groupId the primary key of the current sys group
	* @param groupCode the group code
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sys group
	* @throws com.viettel.ims.core.NoSuchSysGroupException if a sys group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup[] findBygroupCode_PrevAndNext(
		long groupId, java.lang.String groupCode, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException {
		return getPersistence()
				   .findBygroupCode_PrevAndNext(groupId, groupCode, status,
			orderByComparator);
	}

	/**
	* Removes all the sys groups where groupCode = &#63; and status = &#63; from the database.
	*
	* @param groupCode the group code
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBygroupCode(java.lang.String groupCode, long status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBygroupCode(groupCode, status);
	}

	/**
	* Returns the number of sys groups where groupCode = &#63; and status = &#63;.
	*
	* @param groupCode the group code
	* @param status the status
	* @return the number of matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countBygroupCode(java.lang.String groupCode, long status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBygroupCode(groupCode, status);
	}

	/**
	* Returns all the sys groups where path = &#63; and status = &#63;.
	*
	* @param path the path
	* @param status the status
	* @return the matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.SysGroup> findBypath(
		java.lang.String path, long status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBypath(path, status);
	}

	/**
	* Returns a range of all the sys groups where path = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.SysGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param path the path
	* @param status the status
	* @param start the lower bound of the range of sys groups
	* @param end the upper bound of the range of sys groups (not inclusive)
	* @return the range of matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.SysGroup> findBypath(
		java.lang.String path, long status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBypath(path, status, start, end);
	}

	/**
	* Returns an ordered range of all the sys groups where path = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.SysGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param path the path
	* @param status the status
	* @param start the lower bound of the range of sys groups
	* @param end the upper bound of the range of sys groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.SysGroup> findBypath(
		java.lang.String path, long status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBypath(path, status, start, end, orderByComparator);
	}

	/**
	* Returns the first sys group in the ordered set where path = &#63; and status = &#63;.
	*
	* @param path the path
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sys group
	* @throws com.viettel.ims.core.NoSuchSysGroupException if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup findBypath_First(
		java.lang.String path, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException {
		return getPersistence().findBypath_First(path, status, orderByComparator);
	}

	/**
	* Returns the first sys group in the ordered set where path = &#63; and status = &#63;.
	*
	* @param path the path
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sys group, or <code>null</code> if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup fetchBypath_First(
		java.lang.String path, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBypath_First(path, status, orderByComparator);
	}

	/**
	* Returns the last sys group in the ordered set where path = &#63; and status = &#63;.
	*
	* @param path the path
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sys group
	* @throws com.viettel.ims.core.NoSuchSysGroupException if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup findBypath_Last(
		java.lang.String path, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException {
		return getPersistence().findBypath_Last(path, status, orderByComparator);
	}

	/**
	* Returns the last sys group in the ordered set where path = &#63; and status = &#63;.
	*
	* @param path the path
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sys group, or <code>null</code> if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup fetchBypath_Last(
		java.lang.String path, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBypath_Last(path, status, orderByComparator);
	}

	/**
	* Returns the sys groups before and after the current sys group in the ordered set where path = &#63; and status = &#63;.
	*
	* @param groupId the primary key of the current sys group
	* @param path the path
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sys group
	* @throws com.viettel.ims.core.NoSuchSysGroupException if a sys group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup[] findBypath_PrevAndNext(
		long groupId, java.lang.String path, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException {
		return getPersistence()
				   .findBypath_PrevAndNext(groupId, path, status,
			orderByComparator);
	}

	/**
	* Removes all the sys groups where path = &#63; and status = &#63; from the database.
	*
	* @param path the path
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBypath(java.lang.String path, long status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBypath(path, status);
	}

	/**
	* Returns the number of sys groups where path = &#63; and status = &#63;.
	*
	* @param path the path
	* @param status the status
	* @return the number of matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countBypath(java.lang.String path, long status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBypath(path, status);
	}

	/**
	* Caches the sys group in the entity cache if it is enabled.
	*
	* @param sysGroup the sys group
	*/
	public static void cacheResult(com.viettel.ims.core.model.SysGroup sysGroup) {
		getPersistence().cacheResult(sysGroup);
	}

	/**
	* Caches the sys groups in the entity cache if it is enabled.
	*
	* @param sysGroups the sys groups
	*/
	public static void cacheResult(
		java.util.List<com.viettel.ims.core.model.SysGroup> sysGroups) {
		getPersistence().cacheResult(sysGroups);
	}

	/**
	* Creates a new sys group with the primary key. Does not add the sys group to the database.
	*
	* @param groupId the primary key for the new sys group
	* @return the new sys group
	*/
	public static com.viettel.ims.core.model.SysGroup create(long groupId) {
		return getPersistence().create(groupId);
	}

	/**
	* Removes the sys group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param groupId the primary key of the sys group
	* @return the sys group that was removed
	* @throws com.viettel.ims.core.NoSuchSysGroupException if a sys group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup remove(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException {
		return getPersistence().remove(groupId);
	}

	public static com.viettel.ims.core.model.SysGroup updateImpl(
		com.viettel.ims.core.model.SysGroup sysGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(sysGroup);
	}

	/**
	* Returns the sys group with the primary key or throws a {@link com.viettel.ims.core.NoSuchSysGroupException} if it could not be found.
	*
	* @param groupId the primary key of the sys group
	* @return the sys group
	* @throws com.viettel.ims.core.NoSuchSysGroupException if a sys group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup findByPrimaryKey(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException {
		return getPersistence().findByPrimaryKey(groupId);
	}

	/**
	* Returns the sys group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param groupId the primary key of the sys group
	* @return the sys group, or <code>null</code> if a sys group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.SysGroup fetchByPrimaryKey(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(groupId);
	}

	/**
	* Returns all the sys groups.
	*
	* @return the sys groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.SysGroup> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the sys groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.SysGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sys groups
	* @param end the upper bound of the range of sys groups (not inclusive)
	* @return the range of sys groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.SysGroup> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the sys groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.SysGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sys groups
	* @param end the upper bound of the range of sys groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sys groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.SysGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the sys groups from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of sys groups.
	*
	* @return the number of sys groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SysGroupPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SysGroupPersistence)PortletBeanLocatorUtil.locate(com.viettel.ims.core.service.ClpSerializer.getServletContextName(),
					SysGroupPersistence.class.getName());

			ReferenceRegistry.registerReference(SysGroupUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(SysGroupPersistence persistence) {
	}

	private static SysGroupPersistence _persistence;
}
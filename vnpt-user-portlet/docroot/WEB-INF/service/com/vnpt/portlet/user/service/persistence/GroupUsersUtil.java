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

package com.vnpt.portlet.user.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.vnpt.portlet.user.model.GroupUsers;

import java.util.List;

/**
 * The persistence utility for the group users service. This utility wraps {@link GroupUsersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see GroupUsersPersistence
 * @see GroupUsersPersistenceImpl
 * @generated
 */
public class GroupUsersUtil {
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
	public static void clearCache(GroupUsers groupUsers) {
		getPersistence().clearCache(groupUsers);
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
	public static List<GroupUsers> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<GroupUsers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<GroupUsers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static GroupUsers update(GroupUsers groupUsers)
		throws SystemException {
		return getPersistence().update(groupUsers);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static GroupUsers update(GroupUsers groupUsers,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(groupUsers, serviceContext);
	}

	/**
	* Returns all the group userses where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @return the matching group userses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupUsers> findByPermissionGroupId(
		long permissionGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPermissionGroupId(permissionGroupId);
	}

	/**
	* Returns a range of all the group userses where permissionGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupUsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param permissionGroupId the permission group ID
	* @param start the lower bound of the range of group userses
	* @param end the upper bound of the range of group userses (not inclusive)
	* @return the range of matching group userses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupUsers> findByPermissionGroupId(
		long permissionGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPermissionGroupId(permissionGroupId, start, end);
	}

	/**
	* Returns an ordered range of all the group userses where permissionGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupUsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param permissionGroupId the permission group ID
	* @param start the lower bound of the range of group userses
	* @param end the upper bound of the range of group userses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching group userses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupUsers> findByPermissionGroupId(
		long permissionGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPermissionGroupId(permissionGroupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first group users in the ordered set where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching group users
	* @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a matching group users could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupUsers findByPermissionGroupId_First(
		long permissionGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupUsersException {
		return getPersistence()
				   .findByPermissionGroupId_First(permissionGroupId,
			orderByComparator);
	}

	/**
	* Returns the first group users in the ordered set where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching group users, or <code>null</code> if a matching group users could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupUsers fetchByPermissionGroupId_First(
		long permissionGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPermissionGroupId_First(permissionGroupId,
			orderByComparator);
	}

	/**
	* Returns the last group users in the ordered set where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching group users
	* @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a matching group users could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupUsers findByPermissionGroupId_Last(
		long permissionGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupUsersException {
		return getPersistence()
				   .findByPermissionGroupId_Last(permissionGroupId,
			orderByComparator);
	}

	/**
	* Returns the last group users in the ordered set where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching group users, or <code>null</code> if a matching group users could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupUsers fetchByPermissionGroupId_Last(
		long permissionGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPermissionGroupId_Last(permissionGroupId,
			orderByComparator);
	}

	/**
	* Returns the group userses before and after the current group users in the ordered set where permissionGroupId = &#63;.
	*
	* @param groupUsersPK the primary key of the current group users
	* @param permissionGroupId the permission group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next group users
	* @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a group users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupUsers[] findByPermissionGroupId_PrevAndNext(
		GroupUsersPK groupUsersPK, long permissionGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupUsersException {
		return getPersistence()
				   .findByPermissionGroupId_PrevAndNext(groupUsersPK,
			permissionGroupId, orderByComparator);
	}

	/**
	* Removes all the group userses where permissionGroupId = &#63; from the database.
	*
	* @param permissionGroupId the permission group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPermissionGroupId(long permissionGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPermissionGroupId(permissionGroupId);
	}

	/**
	* Returns the number of group userses where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @return the number of matching group userses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPermissionGroupId(long permissionGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPermissionGroupId(permissionGroupId);
	}

	/**
	* Returns all the group userses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching group userses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupUsers> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the group userses where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupUsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of group userses
	* @param end the upper bound of the range of group userses (not inclusive)
	* @return the range of matching group userses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupUsers> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the group userses where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupUsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of group userses
	* @param end the upper bound of the range of group userses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching group userses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupUsers> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first group users in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching group users
	* @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a matching group users could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupUsers findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupUsersException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first group users in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching group users, or <code>null</code> if a matching group users could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupUsers fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last group users in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching group users
	* @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a matching group users could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupUsers findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupUsersException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last group users in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching group users, or <code>null</code> if a matching group users could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupUsers fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the group userses before and after the current group users in the ordered set where userId = &#63;.
	*
	* @param groupUsersPK the primary key of the current group users
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next group users
	* @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a group users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupUsers[] findByUserId_PrevAndNext(
		GroupUsersPK groupUsersPK, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupUsersException {
		return getPersistence()
				   .findByUserId_PrevAndNext(groupUsersPK, userId,
			orderByComparator);
	}

	/**
	* Removes all the group userses where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of group userses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching group userses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Caches the group users in the entity cache if it is enabled.
	*
	* @param groupUsers the group users
	*/
	public static void cacheResult(
		com.vnpt.portlet.user.model.GroupUsers groupUsers) {
		getPersistence().cacheResult(groupUsers);
	}

	/**
	* Caches the group userses in the entity cache if it is enabled.
	*
	* @param groupUserses the group userses
	*/
	public static void cacheResult(
		java.util.List<com.vnpt.portlet.user.model.GroupUsers> groupUserses) {
		getPersistence().cacheResult(groupUserses);
	}

	/**
	* Creates a new group users with the primary key. Does not add the group users to the database.
	*
	* @param groupUsersPK the primary key for the new group users
	* @return the new group users
	*/
	public static com.vnpt.portlet.user.model.GroupUsers create(
		GroupUsersPK groupUsersPK) {
		return getPersistence().create(groupUsersPK);
	}

	/**
	* Removes the group users with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param groupUsersPK the primary key of the group users
	* @return the group users that was removed
	* @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a group users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupUsers remove(
		GroupUsersPK groupUsersPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupUsersException {
		return getPersistence().remove(groupUsersPK);
	}

	public static com.vnpt.portlet.user.model.GroupUsers updateImpl(
		com.vnpt.portlet.user.model.GroupUsers groupUsers)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(groupUsers);
	}

	/**
	* Returns the group users with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchGroupUsersException} if it could not be found.
	*
	* @param groupUsersPK the primary key of the group users
	* @return the group users
	* @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a group users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupUsers findByPrimaryKey(
		GroupUsersPK groupUsersPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupUsersException {
		return getPersistence().findByPrimaryKey(groupUsersPK);
	}

	/**
	* Returns the group users with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param groupUsersPK the primary key of the group users
	* @return the group users, or <code>null</code> if a group users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupUsers fetchByPrimaryKey(
		GroupUsersPK groupUsersPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(groupUsersPK);
	}

	/**
	* Returns all the group userses.
	*
	* @return the group userses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupUsers> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the group userses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupUsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of group userses
	* @param end the upper bound of the range of group userses (not inclusive)
	* @return the range of group userses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupUsers> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the group userses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupUsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of group userses
	* @param end the upper bound of the range of group userses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of group userses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupUsers> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the group userses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of group userses.
	*
	* @return the number of group userses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static GroupUsersPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (GroupUsersPersistence)PortletBeanLocatorUtil.locate(com.vnpt.portlet.user.service.ClpSerializer.getServletContextName(),
					GroupUsersPersistence.class.getName());

			ReferenceRegistry.registerReference(GroupUsersUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(GroupUsersPersistence persistence) {
	}

	private static GroupUsersPersistence _persistence;
}
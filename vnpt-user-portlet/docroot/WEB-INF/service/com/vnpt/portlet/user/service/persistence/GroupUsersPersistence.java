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

import com.liferay.portal.service.persistence.BasePersistence;

import com.vnpt.portlet.user.model.GroupUsers;

/**
 * The persistence interface for the group users service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see GroupUsersPersistenceImpl
 * @see GroupUsersUtil
 * @generated
 */
public interface GroupUsersPersistence extends BasePersistence<GroupUsers> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GroupUsersUtil} to access the group users persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the group userses where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @return the matching group userses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vnpt.portlet.user.model.GroupUsers> findByPermissionGroupId(
		long permissionGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vnpt.portlet.user.model.GroupUsers> findByPermissionGroupId(
		long permissionGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vnpt.portlet.user.model.GroupUsers> findByPermissionGroupId(
		long permissionGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first group users in the ordered set where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching group users
	* @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a matching group users could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.GroupUsers findByPermissionGroupId_First(
		long permissionGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupUsersException;

	/**
	* Returns the first group users in the ordered set where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching group users, or <code>null</code> if a matching group users could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.GroupUsers fetchByPermissionGroupId_First(
		long permissionGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last group users in the ordered set where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching group users
	* @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a matching group users could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.GroupUsers findByPermissionGroupId_Last(
		long permissionGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupUsersException;

	/**
	* Returns the last group users in the ordered set where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching group users, or <code>null</code> if a matching group users could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.GroupUsers fetchByPermissionGroupId_Last(
		long permissionGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vnpt.portlet.user.model.GroupUsers[] findByPermissionGroupId_PrevAndNext(
		GroupUsersPK groupUsersPK, long permissionGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupUsersException;

	/**
	* Removes all the group userses where permissionGroupId = &#63; from the database.
	*
	* @param permissionGroupId the permission group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPermissionGroupId(long permissionGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of group userses where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @return the number of matching group userses
	* @throws SystemException if a system exception occurred
	*/
	public int countByPermissionGroupId(long permissionGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the group userses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching group userses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vnpt.portlet.user.model.GroupUsers> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vnpt.portlet.user.model.GroupUsers> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vnpt.portlet.user.model.GroupUsers> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first group users in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching group users
	* @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a matching group users could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.GroupUsers findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupUsersException;

	/**
	* Returns the first group users in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching group users, or <code>null</code> if a matching group users could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.GroupUsers fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last group users in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching group users
	* @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a matching group users could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.GroupUsers findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupUsersException;

	/**
	* Returns the last group users in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching group users, or <code>null</code> if a matching group users could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.GroupUsers fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vnpt.portlet.user.model.GroupUsers[] findByUserId_PrevAndNext(
		GroupUsersPK groupUsersPK, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupUsersException;

	/**
	* Removes all the group userses where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of group userses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching group userses
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the group users in the entity cache if it is enabled.
	*
	* @param groupUsers the group users
	*/
	public void cacheResult(com.vnpt.portlet.user.model.GroupUsers groupUsers);

	/**
	* Caches the group userses in the entity cache if it is enabled.
	*
	* @param groupUserses the group userses
	*/
	public void cacheResult(
		java.util.List<com.vnpt.portlet.user.model.GroupUsers> groupUserses);

	/**
	* Creates a new group users with the primary key. Does not add the group users to the database.
	*
	* @param groupUsersPK the primary key for the new group users
	* @return the new group users
	*/
	public com.vnpt.portlet.user.model.GroupUsers create(
		GroupUsersPK groupUsersPK);

	/**
	* Removes the group users with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param groupUsersPK the primary key of the group users
	* @return the group users that was removed
	* @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a group users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.GroupUsers remove(
		GroupUsersPK groupUsersPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupUsersException;

	public com.vnpt.portlet.user.model.GroupUsers updateImpl(
		com.vnpt.portlet.user.model.GroupUsers groupUsers)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the group users with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchGroupUsersException} if it could not be found.
	*
	* @param groupUsersPK the primary key of the group users
	* @return the group users
	* @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a group users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.GroupUsers findByPrimaryKey(
		GroupUsersPK groupUsersPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupUsersException;

	/**
	* Returns the group users with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param groupUsersPK the primary key of the group users
	* @return the group users, or <code>null</code> if a group users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.GroupUsers fetchByPrimaryKey(
		GroupUsersPK groupUsersPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the group userses.
	*
	* @return the group userses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vnpt.portlet.user.model.GroupUsers> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vnpt.portlet.user.model.GroupUsers> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vnpt.portlet.user.model.GroupUsers> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the group userses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of group userses.
	*
	* @return the number of group userses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
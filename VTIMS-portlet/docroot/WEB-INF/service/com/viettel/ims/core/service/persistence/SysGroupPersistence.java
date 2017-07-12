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

import com.liferay.portal.service.persistence.BasePersistence;

import com.viettel.ims.core.model.SysGroup;

/**
 * The persistence interface for the sys group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see SysGroupPersistenceImpl
 * @see SysGroupUtil
 * @generated
 */
public interface SysGroupPersistence extends BasePersistence<SysGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SysGroupUtil} to access the sys group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the sys groups where name = &#63; and status = &#63;.
	*
	* @param name the name
	* @param status the status
	* @return the matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.SysGroup> findByname(
		java.lang.String name, long status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.viettel.ims.core.model.SysGroup> findByname(
		java.lang.String name, long status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.viettel.ims.core.model.SysGroup> findByname(
		java.lang.String name, long status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.viettel.ims.core.model.SysGroup findByname_First(
		java.lang.String name, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException;

	/**
	* Returns the first sys group in the ordered set where name = &#63; and status = &#63;.
	*
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sys group, or <code>null</code> if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.SysGroup fetchByname_First(
		java.lang.String name, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.viettel.ims.core.model.SysGroup findByname_Last(
		java.lang.String name, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException;

	/**
	* Returns the last sys group in the ordered set where name = &#63; and status = &#63;.
	*
	* @param name the name
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sys group, or <code>null</code> if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.SysGroup fetchByname_Last(
		java.lang.String name, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.viettel.ims.core.model.SysGroup[] findByname_PrevAndNext(
		long groupId, java.lang.String name, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException;

	/**
	* Removes all the sys groups where name = &#63; and status = &#63; from the database.
	*
	* @param name the name
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByname(java.lang.String name, long status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sys groups where name = &#63; and status = &#63;.
	*
	* @param name the name
	* @param status the status
	* @return the number of matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public int countByname(java.lang.String name, long status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sys groups where groupCode = &#63; and status = &#63;.
	*
	* @param groupCode the group code
	* @param status the status
	* @return the matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.SysGroup> findBygroupCode(
		java.lang.String groupCode, long status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.viettel.ims.core.model.SysGroup> findBygroupCode(
		java.lang.String groupCode, long status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.viettel.ims.core.model.SysGroup> findBygroupCode(
		java.lang.String groupCode, long status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.viettel.ims.core.model.SysGroup findBygroupCode_First(
		java.lang.String groupCode, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException;

	/**
	* Returns the first sys group in the ordered set where groupCode = &#63; and status = &#63;.
	*
	* @param groupCode the group code
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sys group, or <code>null</code> if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.SysGroup fetchBygroupCode_First(
		java.lang.String groupCode, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.viettel.ims.core.model.SysGroup findBygroupCode_Last(
		java.lang.String groupCode, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException;

	/**
	* Returns the last sys group in the ordered set where groupCode = &#63; and status = &#63;.
	*
	* @param groupCode the group code
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sys group, or <code>null</code> if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.SysGroup fetchBygroupCode_Last(
		java.lang.String groupCode, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.viettel.ims.core.model.SysGroup[] findBygroupCode_PrevAndNext(
		long groupId, java.lang.String groupCode, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException;

	/**
	* Removes all the sys groups where groupCode = &#63; and status = &#63; from the database.
	*
	* @param groupCode the group code
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeBygroupCode(java.lang.String groupCode, long status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sys groups where groupCode = &#63; and status = &#63;.
	*
	* @param groupCode the group code
	* @param status the status
	* @return the number of matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public int countBygroupCode(java.lang.String groupCode, long status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sys groups where path = &#63; and status = &#63;.
	*
	* @param path the path
	* @param status the status
	* @return the matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.SysGroup> findBypath(
		java.lang.String path, long status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.viettel.ims.core.model.SysGroup> findBypath(
		java.lang.String path, long status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.viettel.ims.core.model.SysGroup> findBypath(
		java.lang.String path, long status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.viettel.ims.core.model.SysGroup findBypath_First(
		java.lang.String path, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException;

	/**
	* Returns the first sys group in the ordered set where path = &#63; and status = &#63;.
	*
	* @param path the path
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sys group, or <code>null</code> if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.SysGroup fetchBypath_First(
		java.lang.String path, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.viettel.ims.core.model.SysGroup findBypath_Last(
		java.lang.String path, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException;

	/**
	* Returns the last sys group in the ordered set where path = &#63; and status = &#63;.
	*
	* @param path the path
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sys group, or <code>null</code> if a matching sys group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.SysGroup fetchBypath_Last(
		java.lang.String path, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.viettel.ims.core.model.SysGroup[] findBypath_PrevAndNext(
		long groupId, java.lang.String path, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException;

	/**
	* Removes all the sys groups where path = &#63; and status = &#63; from the database.
	*
	* @param path the path
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeBypath(java.lang.String path, long status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sys groups where path = &#63; and status = &#63;.
	*
	* @param path the path
	* @param status the status
	* @return the number of matching sys groups
	* @throws SystemException if a system exception occurred
	*/
	public int countBypath(java.lang.String path, long status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the sys group in the entity cache if it is enabled.
	*
	* @param sysGroup the sys group
	*/
	public void cacheResult(com.viettel.ims.core.model.SysGroup sysGroup);

	/**
	* Caches the sys groups in the entity cache if it is enabled.
	*
	* @param sysGroups the sys groups
	*/
	public void cacheResult(
		java.util.List<com.viettel.ims.core.model.SysGroup> sysGroups);

	/**
	* Creates a new sys group with the primary key. Does not add the sys group to the database.
	*
	* @param groupId the primary key for the new sys group
	* @return the new sys group
	*/
	public com.viettel.ims.core.model.SysGroup create(long groupId);

	/**
	* Removes the sys group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param groupId the primary key of the sys group
	* @return the sys group that was removed
	* @throws com.viettel.ims.core.NoSuchSysGroupException if a sys group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.SysGroup remove(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException;

	public com.viettel.ims.core.model.SysGroup updateImpl(
		com.viettel.ims.core.model.SysGroup sysGroup)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sys group with the primary key or throws a {@link com.viettel.ims.core.NoSuchSysGroupException} if it could not be found.
	*
	* @param groupId the primary key of the sys group
	* @return the sys group
	* @throws com.viettel.ims.core.NoSuchSysGroupException if a sys group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.SysGroup findByPrimaryKey(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchSysGroupException;

	/**
	* Returns the sys group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param groupId the primary key of the sys group
	* @return the sys group, or <code>null</code> if a sys group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.SysGroup fetchByPrimaryKey(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sys groups.
	*
	* @return the sys groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.SysGroup> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.viettel.ims.core.model.SysGroup> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.viettel.ims.core.model.SysGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the sys groups from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sys groups.
	*
	* @return the number of sys groups
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
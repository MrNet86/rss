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

import com.vnpt.portlet.user.model.GroupRoles;

import java.util.List;

/**
 * The persistence utility for the group roles service. This utility wraps {@link GroupRolesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see GroupRolesPersistence
 * @see GroupRolesPersistenceImpl
 * @generated
 */
public class GroupRolesUtil {
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
	public static void clearCache(GroupRoles groupRoles) {
		getPersistence().clearCache(groupRoles);
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
	public static List<GroupRoles> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<GroupRoles> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<GroupRoles> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static GroupRoles update(GroupRoles groupRoles)
		throws SystemException {
		return getPersistence().update(groupRoles);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static GroupRoles update(GroupRoles groupRoles,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(groupRoles, serviceContext);
	}

	/**
	* Returns all the group roleses where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @return the matching group roleses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupRoles> findByPermissionGroupId(
		long permissionGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPermissionGroupId(permissionGroupId);
	}

	/**
	* Returns a range of all the group roleses where permissionGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupRolesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param permissionGroupId the permission group ID
	* @param start the lower bound of the range of group roleses
	* @param end the upper bound of the range of group roleses (not inclusive)
	* @return the range of matching group roleses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupRoles> findByPermissionGroupId(
		long permissionGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPermissionGroupId(permissionGroupId, start, end);
	}

	/**
	* Returns an ordered range of all the group roleses where permissionGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupRolesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param permissionGroupId the permission group ID
	* @param start the lower bound of the range of group roleses
	* @param end the upper bound of the range of group roleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching group roleses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupRoles> findByPermissionGroupId(
		long permissionGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPermissionGroupId(permissionGroupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first group roles in the ordered set where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching group roles
	* @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a matching group roles could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupRoles findByPermissionGroupId_First(
		long permissionGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupRolesException {
		return getPersistence()
				   .findByPermissionGroupId_First(permissionGroupId,
			orderByComparator);
	}

	/**
	* Returns the first group roles in the ordered set where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching group roles, or <code>null</code> if a matching group roles could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupRoles fetchByPermissionGroupId_First(
		long permissionGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPermissionGroupId_First(permissionGroupId,
			orderByComparator);
	}

	/**
	* Returns the last group roles in the ordered set where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching group roles
	* @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a matching group roles could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupRoles findByPermissionGroupId_Last(
		long permissionGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupRolesException {
		return getPersistence()
				   .findByPermissionGroupId_Last(permissionGroupId,
			orderByComparator);
	}

	/**
	* Returns the last group roles in the ordered set where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching group roles, or <code>null</code> if a matching group roles could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupRoles fetchByPermissionGroupId_Last(
		long permissionGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPermissionGroupId_Last(permissionGroupId,
			orderByComparator);
	}

	/**
	* Returns the group roleses before and after the current group roles in the ordered set where permissionGroupId = &#63;.
	*
	* @param groupRolesPK the primary key of the current group roles
	* @param permissionGroupId the permission group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next group roles
	* @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a group roles with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupRoles[] findByPermissionGroupId_PrevAndNext(
		com.vnpt.portlet.user.service.persistence.GroupRolesPK groupRolesPK,
		long permissionGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupRolesException {
		return getPersistence()
				   .findByPermissionGroupId_PrevAndNext(groupRolesPK,
			permissionGroupId, orderByComparator);
	}

	/**
	* Removes all the group roleses where permissionGroupId = &#63; from the database.
	*
	* @param permissionGroupId the permission group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPermissionGroupId(long permissionGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPermissionGroupId(permissionGroupId);
	}

	/**
	* Returns the number of group roleses where permissionGroupId = &#63;.
	*
	* @param permissionGroupId the permission group ID
	* @return the number of matching group roleses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPermissionGroupId(long permissionGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPermissionGroupId(permissionGroupId);
	}

	/**
	* Returns all the group roleses where roleId = &#63;.
	*
	* @param roleId the role ID
	* @return the matching group roleses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupRoles> findByRoleId(
		long roleId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRoleId(roleId);
	}

	/**
	* Returns a range of all the group roleses where roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupRolesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param roleId the role ID
	* @param start the lower bound of the range of group roleses
	* @param end the upper bound of the range of group roleses (not inclusive)
	* @return the range of matching group roleses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupRoles> findByRoleId(
		long roleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRoleId(roleId, start, end);
	}

	/**
	* Returns an ordered range of all the group roleses where roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupRolesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param roleId the role ID
	* @param start the lower bound of the range of group roleses
	* @param end the upper bound of the range of group roleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching group roleses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupRoles> findByRoleId(
		long roleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRoleId(roleId, start, end, orderByComparator);
	}

	/**
	* Returns the first group roles in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching group roles
	* @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a matching group roles could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupRoles findByRoleId_First(
		long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupRolesException {
		return getPersistence().findByRoleId_First(roleId, orderByComparator);
	}

	/**
	* Returns the first group roles in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching group roles, or <code>null</code> if a matching group roles could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupRoles fetchByRoleId_First(
		long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRoleId_First(roleId, orderByComparator);
	}

	/**
	* Returns the last group roles in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching group roles
	* @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a matching group roles could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupRoles findByRoleId_Last(
		long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupRolesException {
		return getPersistence().findByRoleId_Last(roleId, orderByComparator);
	}

	/**
	* Returns the last group roles in the ordered set where roleId = &#63;.
	*
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching group roles, or <code>null</code> if a matching group roles could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupRoles fetchByRoleId_Last(
		long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRoleId_Last(roleId, orderByComparator);
	}

	/**
	* Returns the group roleses before and after the current group roles in the ordered set where roleId = &#63;.
	*
	* @param groupRolesPK the primary key of the current group roles
	* @param roleId the role ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next group roles
	* @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a group roles with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupRoles[] findByRoleId_PrevAndNext(
		com.vnpt.portlet.user.service.persistence.GroupRolesPK groupRolesPK,
		long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupRolesException {
		return getPersistence()
				   .findByRoleId_PrevAndNext(groupRolesPK, roleId,
			orderByComparator);
	}

	/**
	* Removes all the group roleses where roleId = &#63; from the database.
	*
	* @param roleId the role ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRoleId(long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRoleId(roleId);
	}

	/**
	* Returns the number of group roleses where roleId = &#63;.
	*
	* @param roleId the role ID
	* @return the number of matching group roleses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRoleId(long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRoleId(roleId);
	}

	/**
	* Caches the group roles in the entity cache if it is enabled.
	*
	* @param groupRoles the group roles
	*/
	public static void cacheResult(
		com.vnpt.portlet.user.model.GroupRoles groupRoles) {
		getPersistence().cacheResult(groupRoles);
	}

	/**
	* Caches the group roleses in the entity cache if it is enabled.
	*
	* @param groupRoleses the group roleses
	*/
	public static void cacheResult(
		java.util.List<com.vnpt.portlet.user.model.GroupRoles> groupRoleses) {
		getPersistence().cacheResult(groupRoleses);
	}

	/**
	* Creates a new group roles with the primary key. Does not add the group roles to the database.
	*
	* @param groupRolesPK the primary key for the new group roles
	* @return the new group roles
	*/
	public static com.vnpt.portlet.user.model.GroupRoles create(
		com.vnpt.portlet.user.service.persistence.GroupRolesPK groupRolesPK) {
		return getPersistence().create(groupRolesPK);
	}

	/**
	* Removes the group roles with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param groupRolesPK the primary key of the group roles
	* @return the group roles that was removed
	* @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a group roles with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupRoles remove(
		com.vnpt.portlet.user.service.persistence.GroupRolesPK groupRolesPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupRolesException {
		return getPersistence().remove(groupRolesPK);
	}

	public static com.vnpt.portlet.user.model.GroupRoles updateImpl(
		com.vnpt.portlet.user.model.GroupRoles groupRoles)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(groupRoles);
	}

	/**
	* Returns the group roles with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchGroupRolesException} if it could not be found.
	*
	* @param groupRolesPK the primary key of the group roles
	* @return the group roles
	* @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a group roles with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupRoles findByPrimaryKey(
		com.vnpt.portlet.user.service.persistence.GroupRolesPK groupRolesPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchGroupRolesException {
		return getPersistence().findByPrimaryKey(groupRolesPK);
	}

	/**
	* Returns the group roles with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param groupRolesPK the primary key of the group roles
	* @return the group roles, or <code>null</code> if a group roles with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.GroupRoles fetchByPrimaryKey(
		com.vnpt.portlet.user.service.persistence.GroupRolesPK groupRolesPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(groupRolesPK);
	}

	/**
	* Returns all the group roleses.
	*
	* @return the group roleses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupRoles> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the group roleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupRolesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of group roleses
	* @param end the upper bound of the range of group roleses (not inclusive)
	* @return the range of group roleses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupRoles> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the group roleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupRolesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of group roleses
	* @param end the upper bound of the range of group roleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of group roleses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.GroupRoles> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the group roleses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of group roleses.
	*
	* @return the number of group roleses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static GroupRolesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (GroupRolesPersistence)PortletBeanLocatorUtil.locate(com.vnpt.portlet.user.service.ClpSerializer.getServletContextName(),
					GroupRolesPersistence.class.getName());

			ReferenceRegistry.registerReference(GroupRolesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(GroupRolesPersistence persistence) {
	}

	private static GroupRolesPersistence _persistence;
}
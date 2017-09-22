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

import com.vnpt.portlet.user.model.PermissionGroup;

import java.util.List;

/**
 * The persistence utility for the permission group service. This utility wraps {@link PermissionGroupPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see PermissionGroupPersistence
 * @see PermissionGroupPersistenceImpl
 * @generated
 */
public class PermissionGroupUtil {
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
	public static void clearCache(PermissionGroup permissionGroup) {
		getPersistence().clearCache(permissionGroup);
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
	public static List<PermissionGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PermissionGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PermissionGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PermissionGroup update(PermissionGroup permissionGroup)
		throws SystemException {
		return getPersistence().update(permissionGroup);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PermissionGroup update(PermissionGroup permissionGroup,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(permissionGroup, serviceContext);
	}

	/**
	* Returns all the permission groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching permission groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.PermissionGroup> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the permission groups where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of permission groups
	* @param end the upper bound of the range of permission groups (not inclusive)
	* @return the range of matching permission groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.PermissionGroup> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the permission groups where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of permission groups
	* @param end the upper bound of the range of permission groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching permission groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.PermissionGroup> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first permission group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching permission group
	* @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a matching permission group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.PermissionGroup findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchPermissionGroupException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first permission group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching permission group, or <code>null</code> if a matching permission group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.PermissionGroup fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last permission group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching permission group
	* @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a matching permission group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.PermissionGroup findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchPermissionGroupException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last permission group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching permission group, or <code>null</code> if a matching permission group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.PermissionGroup fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the permission groups before and after the current permission group in the ordered set where groupId = &#63;.
	*
	* @param permissionGroupId the primary key of the current permission group
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next permission group
	* @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a permission group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.PermissionGroup[] findByGroupId_PrevAndNext(
		long permissionGroupId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchPermissionGroupException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(permissionGroupId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the permission groups where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of permission groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching permission groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the permission groups where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching permission groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.PermissionGroup> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the permission groups where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of permission groups
	* @param end the upper bound of the range of permission groups (not inclusive)
	* @return the range of matching permission groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.PermissionGroup> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the permission groups where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of permission groups
	* @param end the upper bound of the range of permission groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching permission groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.PermissionGroup> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first permission group in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching permission group
	* @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a matching permission group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.PermissionGroup findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchPermissionGroupException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first permission group in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching permission group, or <code>null</code> if a matching permission group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.PermissionGroup fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last permission group in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching permission group
	* @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a matching permission group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.PermissionGroup findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchPermissionGroupException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last permission group in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching permission group, or <code>null</code> if a matching permission group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.PermissionGroup fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the permission groups before and after the current permission group in the ordered set where companyId = &#63;.
	*
	* @param permissionGroupId the primary key of the current permission group
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next permission group
	* @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a permission group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.PermissionGroup[] findByCompanyId_PrevAndNext(
		long permissionGroupId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchPermissionGroupException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(permissionGroupId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the permission groups where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of permission groups where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching permission groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Caches the permission group in the entity cache if it is enabled.
	*
	* @param permissionGroup the permission group
	*/
	public static void cacheResult(
		com.vnpt.portlet.user.model.PermissionGroup permissionGroup) {
		getPersistence().cacheResult(permissionGroup);
	}

	/**
	* Caches the permission groups in the entity cache if it is enabled.
	*
	* @param permissionGroups the permission groups
	*/
	public static void cacheResult(
		java.util.List<com.vnpt.portlet.user.model.PermissionGroup> permissionGroups) {
		getPersistence().cacheResult(permissionGroups);
	}

	/**
	* Creates a new permission group with the primary key. Does not add the permission group to the database.
	*
	* @param permissionGroupId the primary key for the new permission group
	* @return the new permission group
	*/
	public static com.vnpt.portlet.user.model.PermissionGroup create(
		long permissionGroupId) {
		return getPersistence().create(permissionGroupId);
	}

	/**
	* Removes the permission group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param permissionGroupId the primary key of the permission group
	* @return the permission group that was removed
	* @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a permission group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.PermissionGroup remove(
		long permissionGroupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchPermissionGroupException {
		return getPersistence().remove(permissionGroupId);
	}

	public static com.vnpt.portlet.user.model.PermissionGroup updateImpl(
		com.vnpt.portlet.user.model.PermissionGroup permissionGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(permissionGroup);
	}

	/**
	* Returns the permission group with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchPermissionGroupException} if it could not be found.
	*
	* @param permissionGroupId the primary key of the permission group
	* @return the permission group
	* @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a permission group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.PermissionGroup findByPrimaryKey(
		long permissionGroupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchPermissionGroupException {
		return getPersistence().findByPrimaryKey(permissionGroupId);
	}

	/**
	* Returns the permission group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param permissionGroupId the primary key of the permission group
	* @return the permission group, or <code>null</code> if a permission group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.PermissionGroup fetchByPrimaryKey(
		long permissionGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(permissionGroupId);
	}

	/**
	* Returns all the permission groups.
	*
	* @return the permission groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.PermissionGroup> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the permission groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of permission groups
	* @param end the upper bound of the range of permission groups (not inclusive)
	* @return the range of permission groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.PermissionGroup> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the permission groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of permission groups
	* @param end the upper bound of the range of permission groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of permission groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.PermissionGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the permission groups from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of permission groups.
	*
	* @return the number of permission groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PermissionGroupPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PermissionGroupPersistence)PortletBeanLocatorUtil.locate(com.vnpt.portlet.user.service.ClpSerializer.getServletContextName(),
					PermissionGroupPersistence.class.getName());

			ReferenceRegistry.registerReference(PermissionGroupUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PermissionGroupPersistence persistence) {
	}

	private static PermissionGroupPersistence _persistence;
}
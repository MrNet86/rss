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

import com.vnpt.portlet.user.model.LiferayDatabase;

import java.util.List;

/**
 * The persistence utility for the liferay database service. This utility wraps {@link LiferayDatabasePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see LiferayDatabasePersistence
 * @see LiferayDatabasePersistenceImpl
 * @generated
 */
public class LiferayDatabaseUtil {
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
	public static void clearCache(LiferayDatabase liferayDatabase) {
		getPersistence().clearCache(liferayDatabase);
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
	public static List<LiferayDatabase> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LiferayDatabase> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LiferayDatabase> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LiferayDatabase update(LiferayDatabase liferayDatabase)
		throws SystemException {
		return getPersistence().update(liferayDatabase);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LiferayDatabase update(LiferayDatabase liferayDatabase,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(liferayDatabase, serviceContext);
	}

	/**
	* Returns all the liferay databases where itemId = &#63;.
	*
	* @param itemId the item ID
	* @return the matching liferay databases
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.LiferayDatabase> findByItemId(
		long itemId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByItemId(itemId);
	}

	/**
	* Returns a range of all the liferay databases where itemId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.LiferayDatabaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param itemId the item ID
	* @param start the lower bound of the range of liferay databases
	* @param end the upper bound of the range of liferay databases (not inclusive)
	* @return the range of matching liferay databases
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.LiferayDatabase> findByItemId(
		long itemId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByItemId(itemId, start, end);
	}

	/**
	* Returns an ordered range of all the liferay databases where itemId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.LiferayDatabaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param itemId the item ID
	* @param start the lower bound of the range of liferay databases
	* @param end the upper bound of the range of liferay databases (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching liferay databases
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.LiferayDatabase> findByItemId(
		long itemId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByItemId(itemId, start, end, orderByComparator);
	}

	/**
	* Returns the first liferay database in the ordered set where itemId = &#63;.
	*
	* @param itemId the item ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching liferay database
	* @throws com.vnpt.portlet.user.NoSuchLiferayDatabaseException if a matching liferay database could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.LiferayDatabase findByItemId_First(
		long itemId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchLiferayDatabaseException {
		return getPersistence().findByItemId_First(itemId, orderByComparator);
	}

	/**
	* Returns the first liferay database in the ordered set where itemId = &#63;.
	*
	* @param itemId the item ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching liferay database, or <code>null</code> if a matching liferay database could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.LiferayDatabase fetchByItemId_First(
		long itemId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByItemId_First(itemId, orderByComparator);
	}

	/**
	* Returns the last liferay database in the ordered set where itemId = &#63;.
	*
	* @param itemId the item ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching liferay database
	* @throws com.vnpt.portlet.user.NoSuchLiferayDatabaseException if a matching liferay database could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.LiferayDatabase findByItemId_Last(
		long itemId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchLiferayDatabaseException {
		return getPersistence().findByItemId_Last(itemId, orderByComparator);
	}

	/**
	* Returns the last liferay database in the ordered set where itemId = &#63;.
	*
	* @param itemId the item ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching liferay database, or <code>null</code> if a matching liferay database could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.LiferayDatabase fetchByItemId_Last(
		long itemId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByItemId_Last(itemId, orderByComparator);
	}

	/**
	* Returns the liferay databases before and after the current liferay database in the ordered set where itemId = &#63;.
	*
	* @param itemFieldId the primary key of the current liferay database
	* @param itemId the item ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next liferay database
	* @throws com.vnpt.portlet.user.NoSuchLiferayDatabaseException if a liferay database with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.LiferayDatabase[] findByItemId_PrevAndNext(
		long itemFieldId, long itemId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchLiferayDatabaseException {
		return getPersistence()
				   .findByItemId_PrevAndNext(itemFieldId, itemId,
			orderByComparator);
	}

	/**
	* Removes all the liferay databases where itemId = &#63; from the database.
	*
	* @param itemId the item ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByItemId(long itemId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByItemId(itemId);
	}

	/**
	* Returns the number of liferay databases where itemId = &#63;.
	*
	* @param itemId the item ID
	* @return the number of matching liferay databases
	* @throws SystemException if a system exception occurred
	*/
	public static int countByItemId(long itemId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByItemId(itemId);
	}

	/**
	* Caches the liferay database in the entity cache if it is enabled.
	*
	* @param liferayDatabase the liferay database
	*/
	public static void cacheResult(
		com.vnpt.portlet.user.model.LiferayDatabase liferayDatabase) {
		getPersistence().cacheResult(liferayDatabase);
	}

	/**
	* Caches the liferay databases in the entity cache if it is enabled.
	*
	* @param liferayDatabases the liferay databases
	*/
	public static void cacheResult(
		java.util.List<com.vnpt.portlet.user.model.LiferayDatabase> liferayDatabases) {
		getPersistence().cacheResult(liferayDatabases);
	}

	/**
	* Creates a new liferay database with the primary key. Does not add the liferay database to the database.
	*
	* @param itemFieldId the primary key for the new liferay database
	* @return the new liferay database
	*/
	public static com.vnpt.portlet.user.model.LiferayDatabase create(
		long itemFieldId) {
		return getPersistence().create(itemFieldId);
	}

	/**
	* Removes the liferay database with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemFieldId the primary key of the liferay database
	* @return the liferay database that was removed
	* @throws com.vnpt.portlet.user.NoSuchLiferayDatabaseException if a liferay database with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.LiferayDatabase remove(
		long itemFieldId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchLiferayDatabaseException {
		return getPersistence().remove(itemFieldId);
	}

	public static com.vnpt.portlet.user.model.LiferayDatabase updateImpl(
		com.vnpt.portlet.user.model.LiferayDatabase liferayDatabase)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(liferayDatabase);
	}

	/**
	* Returns the liferay database with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchLiferayDatabaseException} if it could not be found.
	*
	* @param itemFieldId the primary key of the liferay database
	* @return the liferay database
	* @throws com.vnpt.portlet.user.NoSuchLiferayDatabaseException if a liferay database with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.LiferayDatabase findByPrimaryKey(
		long itemFieldId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchLiferayDatabaseException {
		return getPersistence().findByPrimaryKey(itemFieldId);
	}

	/**
	* Returns the liferay database with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param itemFieldId the primary key of the liferay database
	* @return the liferay database, or <code>null</code> if a liferay database with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.LiferayDatabase fetchByPrimaryKey(
		long itemFieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(itemFieldId);
	}

	/**
	* Returns all the liferay databases.
	*
	* @return the liferay databases
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.LiferayDatabase> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the liferay databases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.LiferayDatabaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of liferay databases
	* @param end the upper bound of the range of liferay databases (not inclusive)
	* @return the range of liferay databases
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.LiferayDatabase> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the liferay databases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.LiferayDatabaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of liferay databases
	* @param end the upper bound of the range of liferay databases (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of liferay databases
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.LiferayDatabase> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the liferay databases from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of liferay databases.
	*
	* @return the number of liferay databases
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LiferayDatabasePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LiferayDatabasePersistence)PortletBeanLocatorUtil.locate(com.vnpt.portlet.user.service.ClpSerializer.getServletContextName(),
					LiferayDatabasePersistence.class.getName());

			ReferenceRegistry.registerReference(LiferayDatabaseUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LiferayDatabasePersistence persistence) {
	}

	private static LiferayDatabasePersistence _persistence;
}
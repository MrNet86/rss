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

import com.vnpt.portlet.user.model.ActIdUser;

import java.util.List;

/**
 * The persistence utility for the act ID user service. This utility wraps {@link ActIdUserPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see ActIdUserPersistence
 * @see ActIdUserPersistenceImpl
 * @generated
 */
public class ActIdUserUtil {
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
	public static void clearCache(ActIdUser actIdUser) {
		getPersistence().clearCache(actIdUser);
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
	public static List<ActIdUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ActIdUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ActIdUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ActIdUser update(ActIdUser actIdUser)
		throws SystemException {
		return getPersistence().update(actIdUser);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ActIdUser update(ActIdUser actIdUser,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(actIdUser, serviceContext);
	}

	/**
	* Caches the act ID user in the entity cache if it is enabled.
	*
	* @param actIdUser the act ID user
	*/
	public static void cacheResult(
		com.vnpt.portlet.user.model.ActIdUser actIdUser) {
		getPersistence().cacheResult(actIdUser);
	}

	/**
	* Caches the act ID users in the entity cache if it is enabled.
	*
	* @param actIdUsers the act ID users
	*/
	public static void cacheResult(
		java.util.List<com.vnpt.portlet.user.model.ActIdUser> actIdUsers) {
		getPersistence().cacheResult(actIdUsers);
	}

	/**
	* Creates a new act ID user with the primary key. Does not add the act ID user to the database.
	*
	* @param id the primary key for the new act ID user
	* @return the new act ID user
	*/
	public static com.vnpt.portlet.user.model.ActIdUser create(
		java.lang.String id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the act ID user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the act ID user
	* @return the act ID user that was removed
	* @throws com.vnpt.portlet.user.NoSuchActIdUserException if a act ID user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.ActIdUser remove(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchActIdUserException {
		return getPersistence().remove(id);
	}

	public static com.vnpt.portlet.user.model.ActIdUser updateImpl(
		com.vnpt.portlet.user.model.ActIdUser actIdUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(actIdUser);
	}

	/**
	* Returns the act ID user with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchActIdUserException} if it could not be found.
	*
	* @param id the primary key of the act ID user
	* @return the act ID user
	* @throws com.vnpt.portlet.user.NoSuchActIdUserException if a act ID user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.ActIdUser findByPrimaryKey(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchActIdUserException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the act ID user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the act ID user
	* @return the act ID user, or <code>null</code> if a act ID user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.ActIdUser fetchByPrimaryKey(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the act ID users.
	*
	* @return the act ID users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.ActIdUser> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the act ID users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of act ID users
	* @param end the upper bound of the range of act ID users (not inclusive)
	* @return the range of act ID users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.ActIdUser> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the act ID users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of act ID users
	* @param end the upper bound of the range of act ID users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of act ID users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.ActIdUser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the act ID users from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of act ID users.
	*
	* @return the number of act ID users
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ActIdUserPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ActIdUserPersistence)PortletBeanLocatorUtil.locate(com.vnpt.portlet.user.service.ClpSerializer.getServletContextName(),
					ActIdUserPersistence.class.getName());

			ReferenceRegistry.registerReference(ActIdUserUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ActIdUserPersistence persistence) {
	}

	private static ActIdUserPersistence _persistence;
}
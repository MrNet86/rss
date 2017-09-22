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

import com.vnpt.portlet.user.model.ActIdMembership;

import java.util.List;

/**
 * The persistence utility for the act ID membership service. This utility wraps {@link ActIdMembershipPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see ActIdMembershipPersistence
 * @see ActIdMembershipPersistenceImpl
 * @generated
 */
public class ActIdMembershipUtil {
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
	public static void clearCache(ActIdMembership actIdMembership) {
		getPersistence().clearCache(actIdMembership);
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
	public static List<ActIdMembership> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ActIdMembership> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ActIdMembership> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ActIdMembership update(ActIdMembership actIdMembership)
		throws SystemException {
		return getPersistence().update(actIdMembership);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ActIdMembership update(ActIdMembership actIdMembership,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(actIdMembership, serviceContext);
	}

	/**
	* Caches the act ID membership in the entity cache if it is enabled.
	*
	* @param actIdMembership the act ID membership
	*/
	public static void cacheResult(
		com.vnpt.portlet.user.model.ActIdMembership actIdMembership) {
		getPersistence().cacheResult(actIdMembership);
	}

	/**
	* Caches the act ID memberships in the entity cache if it is enabled.
	*
	* @param actIdMemberships the act ID memberships
	*/
	public static void cacheResult(
		java.util.List<com.vnpt.portlet.user.model.ActIdMembership> actIdMemberships) {
		getPersistence().cacheResult(actIdMemberships);
	}

	/**
	* Creates a new act ID membership with the primary key. Does not add the act ID membership to the database.
	*
	* @param actIdMembershipPK the primary key for the new act ID membership
	* @return the new act ID membership
	*/
	public static com.vnpt.portlet.user.model.ActIdMembership create(
		com.vnpt.portlet.user.service.persistence.ActIdMembershipPK actIdMembershipPK) {
		return getPersistence().create(actIdMembershipPK);
	}

	/**
	* Removes the act ID membership with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param actIdMembershipPK the primary key of the act ID membership
	* @return the act ID membership that was removed
	* @throws com.vnpt.portlet.user.NoSuchActIdMembershipException if a act ID membership with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.ActIdMembership remove(
		com.vnpt.portlet.user.service.persistence.ActIdMembershipPK actIdMembershipPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchActIdMembershipException {
		return getPersistence().remove(actIdMembershipPK);
	}

	public static com.vnpt.portlet.user.model.ActIdMembership updateImpl(
		com.vnpt.portlet.user.model.ActIdMembership actIdMembership)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(actIdMembership);
	}

	/**
	* Returns the act ID membership with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchActIdMembershipException} if it could not be found.
	*
	* @param actIdMembershipPK the primary key of the act ID membership
	* @return the act ID membership
	* @throws com.vnpt.portlet.user.NoSuchActIdMembershipException if a act ID membership with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.ActIdMembership findByPrimaryKey(
		com.vnpt.portlet.user.service.persistence.ActIdMembershipPK actIdMembershipPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchActIdMembershipException {
		return getPersistence().findByPrimaryKey(actIdMembershipPK);
	}

	/**
	* Returns the act ID membership with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param actIdMembershipPK the primary key of the act ID membership
	* @return the act ID membership, or <code>null</code> if a act ID membership with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portlet.user.model.ActIdMembership fetchByPrimaryKey(
		com.vnpt.portlet.user.service.persistence.ActIdMembershipPK actIdMembershipPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(actIdMembershipPK);
	}

	/**
	* Returns all the act ID memberships.
	*
	* @return the act ID memberships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.ActIdMembership> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the act ID memberships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdMembershipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of act ID memberships
	* @param end the upper bound of the range of act ID memberships (not inclusive)
	* @return the range of act ID memberships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.ActIdMembership> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the act ID memberships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdMembershipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of act ID memberships
	* @param end the upper bound of the range of act ID memberships (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of act ID memberships
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portlet.user.model.ActIdMembership> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the act ID memberships from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of act ID memberships.
	*
	* @return the number of act ID memberships
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ActIdMembershipPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ActIdMembershipPersistence)PortletBeanLocatorUtil.locate(com.vnpt.portlet.user.service.ClpSerializer.getServletContextName(),
					ActIdMembershipPersistence.class.getName());

			ReferenceRegistry.registerReference(ActIdMembershipUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ActIdMembershipPersistence persistence) {
	}

	private static ActIdMembershipPersistence _persistence;
}
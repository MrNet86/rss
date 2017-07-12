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

import com.viettel.ims.core.model.InvestCategories;

import java.util.List;

/**
 * The persistence utility for the invest categories service. This utility wraps {@link InvestCategoriesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see InvestCategoriesPersistence
 * @see InvestCategoriesPersistenceImpl
 * @generated
 */
public class InvestCategoriesUtil {
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
	public static void clearCache(InvestCategories investCategories) {
		getPersistence().clearCache(investCategories);
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
	public static List<InvestCategories> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<InvestCategories> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<InvestCategories> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static InvestCategories update(InvestCategories investCategories)
		throws SystemException {
		return getPersistence().update(investCategories);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static InvestCategories update(InvestCategories investCategories,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(investCategories, serviceContext);
	}

	/**
	* Returns all the invest categorieses where objId = &#63; and isActive = &#63;.
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @return the matching invest categorieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.InvestCategories> findByObjId(
		long objId, long isActive)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByObjId(objId, isActive);
	}

	/**
	* Returns a range of all the invest categorieses where objId = &#63; and isActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestCategoriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @param start the lower bound of the range of invest categorieses
	* @param end the upper bound of the range of invest categorieses (not inclusive)
	* @return the range of matching invest categorieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.InvestCategories> findByObjId(
		long objId, long isActive, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByObjId(objId, isActive, start, end);
	}

	/**
	* Returns an ordered range of all the invest categorieses where objId = &#63; and isActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestCategoriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @param start the lower bound of the range of invest categorieses
	* @param end the upper bound of the range of invest categorieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching invest categorieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.InvestCategories> findByObjId(
		long objId, long isActive, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByObjId(objId, isActive, start, end, orderByComparator);
	}

	/**
	* Returns the first invest categories in the ordered set where objId = &#63; and isActive = &#63;.
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching invest categories
	* @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a matching invest categories could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestCategories findByObjId_First(
		long objId, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestCategoriesException {
		return getPersistence()
				   .findByObjId_First(objId, isActive, orderByComparator);
	}

	/**
	* Returns the first invest categories in the ordered set where objId = &#63; and isActive = &#63;.
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching invest categories, or <code>null</code> if a matching invest categories could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestCategories fetchByObjId_First(
		long objId, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByObjId_First(objId, isActive, orderByComparator);
	}

	/**
	* Returns the last invest categories in the ordered set where objId = &#63; and isActive = &#63;.
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching invest categories
	* @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a matching invest categories could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestCategories findByObjId_Last(
		long objId, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestCategoriesException {
		return getPersistence()
				   .findByObjId_Last(objId, isActive, orderByComparator);
	}

	/**
	* Returns the last invest categories in the ordered set where objId = &#63; and isActive = &#63;.
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching invest categories, or <code>null</code> if a matching invest categories could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestCategories fetchByObjId_Last(
		long objId, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByObjId_Last(objId, isActive, orderByComparator);
	}

	/**
	* Returns the invest categorieses before and after the current invest categories in the ordered set where objId = &#63; and isActive = &#63;.
	*
	* @param investCategoriesId the primary key of the current invest categories
	* @param objId the obj ID
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next invest categories
	* @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a invest categories with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestCategories[] findByObjId_PrevAndNext(
		long investCategoriesId, long objId, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestCategoriesException {
		return getPersistence()
				   .findByObjId_PrevAndNext(investCategoriesId, objId,
			isActive, orderByComparator);
	}

	/**
	* Removes all the invest categorieses where objId = &#63; and isActive = &#63; from the database.
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByObjId(long objId, long isActive)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByObjId(objId, isActive);
	}

	/**
	* Returns the number of invest categorieses where objId = &#63; and isActive = &#63;.
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @return the number of matching invest categorieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByObjId(long objId, long isActive)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByObjId(objId, isActive);
	}

	/**
	* Caches the invest categories in the entity cache if it is enabled.
	*
	* @param investCategories the invest categories
	*/
	public static void cacheResult(
		com.viettel.ims.core.model.InvestCategories investCategories) {
		getPersistence().cacheResult(investCategories);
	}

	/**
	* Caches the invest categorieses in the entity cache if it is enabled.
	*
	* @param investCategorieses the invest categorieses
	*/
	public static void cacheResult(
		java.util.List<com.viettel.ims.core.model.InvestCategories> investCategorieses) {
		getPersistence().cacheResult(investCategorieses);
	}

	/**
	* Creates a new invest categories with the primary key. Does not add the invest categories to the database.
	*
	* @param investCategoriesId the primary key for the new invest categories
	* @return the new invest categories
	*/
	public static com.viettel.ims.core.model.InvestCategories create(
		long investCategoriesId) {
		return getPersistence().create(investCategoriesId);
	}

	/**
	* Removes the invest categories with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param investCategoriesId the primary key of the invest categories
	* @return the invest categories that was removed
	* @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a invest categories with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestCategories remove(
		long investCategoriesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestCategoriesException {
		return getPersistence().remove(investCategoriesId);
	}

	public static com.viettel.ims.core.model.InvestCategories updateImpl(
		com.viettel.ims.core.model.InvestCategories investCategories)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(investCategories);
	}

	/**
	* Returns the invest categories with the primary key or throws a {@link com.viettel.ims.core.NoSuchInvestCategoriesException} if it could not be found.
	*
	* @param investCategoriesId the primary key of the invest categories
	* @return the invest categories
	* @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a invest categories with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestCategories findByPrimaryKey(
		long investCategoriesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestCategoriesException {
		return getPersistence().findByPrimaryKey(investCategoriesId);
	}

	/**
	* Returns the invest categories with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param investCategoriesId the primary key of the invest categories
	* @return the invest categories, or <code>null</code> if a invest categories with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestCategories fetchByPrimaryKey(
		long investCategoriesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(investCategoriesId);
	}

	/**
	* Returns all the invest categorieses.
	*
	* @return the invest categorieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.InvestCategories> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the invest categorieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestCategoriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of invest categorieses
	* @param end the upper bound of the range of invest categorieses (not inclusive)
	* @return the range of invest categorieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.InvestCategories> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the invest categorieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestCategoriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of invest categorieses
	* @param end the upper bound of the range of invest categorieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of invest categorieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.InvestCategories> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the invest categorieses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of invest categorieses.
	*
	* @return the number of invest categorieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static InvestCategoriesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (InvestCategoriesPersistence)PortletBeanLocatorUtil.locate(com.viettel.ims.core.service.ClpSerializer.getServletContextName(),
					InvestCategoriesPersistence.class.getName());

			ReferenceRegistry.registerReference(InvestCategoriesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(InvestCategoriesPersistence persistence) {
	}

	private static InvestCategoriesPersistence _persistence;
}
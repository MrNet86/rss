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

package com.viettel.ams.core.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.viettel.ams.core.model.MerEntity;

import java.util.List;

/**
 * The persistence utility for the mer entity service. This utility wraps {@link MerEntityPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see MerEntityPersistence
 * @see MerEntityPersistenceImpl
 * @generated
 */
public class MerEntityUtil {
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
	public static void clearCache(MerEntity merEntity) {
		getPersistence().clearCache(merEntity);
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
	public static List<MerEntity> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MerEntity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MerEntity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MerEntity update(MerEntity merEntity)
		throws SystemException {
		return getPersistence().update(merEntity);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MerEntity update(MerEntity merEntity,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(merEntity, serviceContext);
	}

	/**
	* Returns all the mer entities where merEntityId = &#63;.
	*
	* @param merEntityId the mer entity ID
	* @return the matching mer entities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.MerEntity> findBymerEntityId(
		long merEntityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBymerEntityId(merEntityId);
	}

	/**
	* Returns a range of all the mer entities where merEntityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.MerEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param merEntityId the mer entity ID
	* @param start the lower bound of the range of mer entities
	* @param end the upper bound of the range of mer entities (not inclusive)
	* @return the range of matching mer entities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.MerEntity> findBymerEntityId(
		long merEntityId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBymerEntityId(merEntityId, start, end);
	}

	/**
	* Returns an ordered range of all the mer entities where merEntityId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.MerEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param merEntityId the mer entity ID
	* @param start the lower bound of the range of mer entities
	* @param end the upper bound of the range of mer entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mer entities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.MerEntity> findBymerEntityId(
		long merEntityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBymerEntityId(merEntityId, start, end, orderByComparator);
	}

	/**
	* Returns the first mer entity in the ordered set where merEntityId = &#63;.
	*
	* @param merEntityId the mer entity ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mer entity
	* @throws com.viettel.ams.core.NoSuchMerEntityException if a matching mer entity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.MerEntity findBymerEntityId_First(
		long merEntityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchMerEntityException {
		return getPersistence()
				   .findBymerEntityId_First(merEntityId, orderByComparator);
	}

	/**
	* Returns the first mer entity in the ordered set where merEntityId = &#63;.
	*
	* @param merEntityId the mer entity ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mer entity, or <code>null</code> if a matching mer entity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.MerEntity fetchBymerEntityId_First(
		long merEntityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBymerEntityId_First(merEntityId, orderByComparator);
	}

	/**
	* Returns the last mer entity in the ordered set where merEntityId = &#63;.
	*
	* @param merEntityId the mer entity ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mer entity
	* @throws com.viettel.ams.core.NoSuchMerEntityException if a matching mer entity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.MerEntity findBymerEntityId_Last(
		long merEntityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchMerEntityException {
		return getPersistence()
				   .findBymerEntityId_Last(merEntityId, orderByComparator);
	}

	/**
	* Returns the last mer entity in the ordered set where merEntityId = &#63;.
	*
	* @param merEntityId the mer entity ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mer entity, or <code>null</code> if a matching mer entity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.MerEntity fetchBymerEntityId_Last(
		long merEntityId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBymerEntityId_Last(merEntityId, orderByComparator);
	}

	/**
	* Removes all the mer entities where merEntityId = &#63; from the database.
	*
	* @param merEntityId the mer entity ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBymerEntityId(long merEntityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBymerEntityId(merEntityId);
	}

	/**
	* Returns the number of mer entities where merEntityId = &#63;.
	*
	* @param merEntityId the mer entity ID
	* @return the number of matching mer entities
	* @throws SystemException if a system exception occurred
	*/
	public static int countBymerEntityId(long merEntityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBymerEntityId(merEntityId);
	}

	/**
	* Caches the mer entity in the entity cache if it is enabled.
	*
	* @param merEntity the mer entity
	*/
	public static void cacheResult(
		com.viettel.ams.core.model.MerEntity merEntity) {
		getPersistence().cacheResult(merEntity);
	}

	/**
	* Caches the mer entities in the entity cache if it is enabled.
	*
	* @param merEntities the mer entities
	*/
	public static void cacheResult(
		java.util.List<com.viettel.ams.core.model.MerEntity> merEntities) {
		getPersistence().cacheResult(merEntities);
	}

	/**
	* Creates a new mer entity with the primary key. Does not add the mer entity to the database.
	*
	* @param merEntityId the primary key for the new mer entity
	* @return the new mer entity
	*/
	public static com.viettel.ams.core.model.MerEntity create(long merEntityId) {
		return getPersistence().create(merEntityId);
	}

	/**
	* Removes the mer entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param merEntityId the primary key of the mer entity
	* @return the mer entity that was removed
	* @throws com.viettel.ams.core.NoSuchMerEntityException if a mer entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.MerEntity remove(long merEntityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchMerEntityException {
		return getPersistence().remove(merEntityId);
	}

	public static com.viettel.ams.core.model.MerEntity updateImpl(
		com.viettel.ams.core.model.MerEntity merEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(merEntity);
	}

	/**
	* Returns the mer entity with the primary key or throws a {@link com.viettel.ams.core.NoSuchMerEntityException} if it could not be found.
	*
	* @param merEntityId the primary key of the mer entity
	* @return the mer entity
	* @throws com.viettel.ams.core.NoSuchMerEntityException if a mer entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.MerEntity findByPrimaryKey(
		long merEntityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchMerEntityException {
		return getPersistence().findByPrimaryKey(merEntityId);
	}

	/**
	* Returns the mer entity with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param merEntityId the primary key of the mer entity
	* @return the mer entity, or <code>null</code> if a mer entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.MerEntity fetchByPrimaryKey(
		long merEntityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(merEntityId);
	}

	/**
	* Returns all the mer entities.
	*
	* @return the mer entities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.MerEntity> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the mer entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.MerEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mer entities
	* @param end the upper bound of the range of mer entities (not inclusive)
	* @return the range of mer entities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.MerEntity> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the mer entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.MerEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mer entities
	* @param end the upper bound of the range of mer entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mer entities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.MerEntity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the mer entities from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mer entities.
	*
	* @return the number of mer entities
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MerEntityPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MerEntityPersistence)PortletBeanLocatorUtil.locate(com.viettel.ams.core.service.ClpSerializer.getServletContextName(),
					MerEntityPersistence.class.getName());

			ReferenceRegistry.registerReference(MerEntityUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MerEntityPersistence persistence) {
	}

	private static MerEntityPersistence _persistence;
}
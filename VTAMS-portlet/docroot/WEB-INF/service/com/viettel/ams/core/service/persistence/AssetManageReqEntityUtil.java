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

import com.viettel.ams.core.model.AssetManageReqEntity;

import java.util.List;

/**
 * The persistence utility for the asset manage req entity service. This utility wraps {@link AssetManageReqEntityPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see AssetManageReqEntityPersistence
 * @see AssetManageReqEntityPersistenceImpl
 * @generated
 */
public class AssetManageReqEntityUtil {
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
	public static void clearCache(AssetManageReqEntity assetManageReqEntity) {
		getPersistence().clearCache(assetManageReqEntity);
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
	public static List<AssetManageReqEntity> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssetManageReqEntity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssetManageReqEntity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AssetManageReqEntity update(
		AssetManageReqEntity assetManageReqEntity) throws SystemException {
		return getPersistence().update(assetManageReqEntity);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AssetManageReqEntity update(
		AssetManageReqEntity assetManageReqEntity, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(assetManageReqEntity, serviceContext);
	}

	/**
	* Returns all the asset manage req entities where reqId = &#63;.
	*
	* @param reqId the req ID
	* @return the matching asset manage req entities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.AssetManageReqEntity> findByAssetManageReq(
		java.lang.Long reqId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssetManageReq(reqId);
	}

	/**
	* Returns a range of all the asset manage req entities where reqId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param reqId the req ID
	* @param start the lower bound of the range of asset manage req entities
	* @param end the upper bound of the range of asset manage req entities (not inclusive)
	* @return the range of matching asset manage req entities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.AssetManageReqEntity> findByAssetManageReq(
		java.lang.Long reqId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssetManageReq(reqId, start, end);
	}

	/**
	* Returns an ordered range of all the asset manage req entities where reqId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param reqId the req ID
	* @param start the lower bound of the range of asset manage req entities
	* @param end the upper bound of the range of asset manage req entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching asset manage req entities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.AssetManageReqEntity> findByAssetManageReq(
		java.lang.Long reqId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssetManageReq(reqId, start, end, orderByComparator);
	}

	/**
	* Returns the first asset manage req entity in the ordered set where reqId = &#63;.
	*
	* @param reqId the req ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset manage req entity
	* @throws com.viettel.ams.core.NoSuchAssetManageReqEntityException if a matching asset manage req entity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.AssetManageReqEntity findByAssetManageReq_First(
		java.lang.Long reqId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqEntityException {
		return getPersistence()
				   .findByAssetManageReq_First(reqId, orderByComparator);
	}

	/**
	* Returns the first asset manage req entity in the ordered set where reqId = &#63;.
	*
	* @param reqId the req ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset manage req entity, or <code>null</code> if a matching asset manage req entity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.AssetManageReqEntity fetchByAssetManageReq_First(
		java.lang.Long reqId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssetManageReq_First(reqId, orderByComparator);
	}

	/**
	* Returns the last asset manage req entity in the ordered set where reqId = &#63;.
	*
	* @param reqId the req ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset manage req entity
	* @throws com.viettel.ams.core.NoSuchAssetManageReqEntityException if a matching asset manage req entity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.AssetManageReqEntity findByAssetManageReq_Last(
		java.lang.Long reqId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqEntityException {
		return getPersistence()
				   .findByAssetManageReq_Last(reqId, orderByComparator);
	}

	/**
	* Returns the last asset manage req entity in the ordered set where reqId = &#63;.
	*
	* @param reqId the req ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset manage req entity, or <code>null</code> if a matching asset manage req entity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.AssetManageReqEntity fetchByAssetManageReq_Last(
		java.lang.Long reqId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssetManageReq_Last(reqId, orderByComparator);
	}

	/**
	* Returns the asset manage req entities before and after the current asset manage req entity in the ordered set where reqId = &#63;.
	*
	* @param id the primary key of the current asset manage req entity
	* @param reqId the req ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next asset manage req entity
	* @throws com.viettel.ams.core.NoSuchAssetManageReqEntityException if a asset manage req entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.AssetManageReqEntity[] findByAssetManageReq_PrevAndNext(
		long id, java.lang.Long reqId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqEntityException {
		return getPersistence()
				   .findByAssetManageReq_PrevAndNext(id, reqId,
			orderByComparator);
	}

	/**
	* Removes all the asset manage req entities where reqId = &#63; from the database.
	*
	* @param reqId the req ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAssetManageReq(java.lang.Long reqId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAssetManageReq(reqId);
	}

	/**
	* Returns the number of asset manage req entities where reqId = &#63;.
	*
	* @param reqId the req ID
	* @return the number of matching asset manage req entities
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAssetManageReq(java.lang.Long reqId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAssetManageReq(reqId);
	}

	/**
	* Caches the asset manage req entity in the entity cache if it is enabled.
	*
	* @param assetManageReqEntity the asset manage req entity
	*/
	public static void cacheResult(
		com.viettel.ams.core.model.AssetManageReqEntity assetManageReqEntity) {
		getPersistence().cacheResult(assetManageReqEntity);
	}

	/**
	* Caches the asset manage req entities in the entity cache if it is enabled.
	*
	* @param assetManageReqEntities the asset manage req entities
	*/
	public static void cacheResult(
		java.util.List<com.viettel.ams.core.model.AssetManageReqEntity> assetManageReqEntities) {
		getPersistence().cacheResult(assetManageReqEntities);
	}

	/**
	* Creates a new asset manage req entity with the primary key. Does not add the asset manage req entity to the database.
	*
	* @param id the primary key for the new asset manage req entity
	* @return the new asset manage req entity
	*/
	public static com.viettel.ams.core.model.AssetManageReqEntity create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the asset manage req entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the asset manage req entity
	* @return the asset manage req entity that was removed
	* @throws com.viettel.ams.core.NoSuchAssetManageReqEntityException if a asset manage req entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.AssetManageReqEntity remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqEntityException {
		return getPersistence().remove(id);
	}

	public static com.viettel.ams.core.model.AssetManageReqEntity updateImpl(
		com.viettel.ams.core.model.AssetManageReqEntity assetManageReqEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assetManageReqEntity);
	}

	/**
	* Returns the asset manage req entity with the primary key or throws a {@link com.viettel.ams.core.NoSuchAssetManageReqEntityException} if it could not be found.
	*
	* @param id the primary key of the asset manage req entity
	* @return the asset manage req entity
	* @throws com.viettel.ams.core.NoSuchAssetManageReqEntityException if a asset manage req entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.AssetManageReqEntity findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqEntityException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the asset manage req entity with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the asset manage req entity
	* @return the asset manage req entity, or <code>null</code> if a asset manage req entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.AssetManageReqEntity fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the asset manage req entities.
	*
	* @return the asset manage req entities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.AssetManageReqEntity> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the asset manage req entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset manage req entities
	* @param end the upper bound of the range of asset manage req entities (not inclusive)
	* @return the range of asset manage req entities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.AssetManageReqEntity> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the asset manage req entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset manage req entities
	* @param end the upper bound of the range of asset manage req entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of asset manage req entities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.AssetManageReqEntity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the asset manage req entities from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of asset manage req entities.
	*
	* @return the number of asset manage req entities
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AssetManageReqEntityPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AssetManageReqEntityPersistence)PortletBeanLocatorUtil.locate(com.viettel.ams.core.service.ClpSerializer.getServletContextName(),
					AssetManageReqEntityPersistence.class.getName());

			ReferenceRegistry.registerReference(AssetManageReqEntityUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AssetManageReqEntityPersistence persistence) {
	}

	private static AssetManageReqEntityPersistence _persistence;
}
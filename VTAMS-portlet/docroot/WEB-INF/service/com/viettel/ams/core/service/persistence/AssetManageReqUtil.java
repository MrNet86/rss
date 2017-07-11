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

import com.viettel.ams.core.model.AssetManageReq;

import java.util.List;

/**
 * The persistence utility for the asset manage req service. This utility wraps {@link AssetManageReqPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see AssetManageReqPersistence
 * @see AssetManageReqPersistenceImpl
 * @generated
 */
public class AssetManageReqUtil {
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
	public static void clearCache(AssetManageReq assetManageReq) {
		getPersistence().clearCache(assetManageReq);
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
	public static List<AssetManageReq> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssetManageReq> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssetManageReq> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AssetManageReq update(AssetManageReq assetManageReq)
		throws SystemException {
		return getPersistence().update(assetManageReq);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AssetManageReq update(AssetManageReq assetManageReq,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(assetManageReq, serviceContext);
	}

	/**
	* Caches the asset manage req in the entity cache if it is enabled.
	*
	* @param assetManageReq the asset manage req
	*/
	public static void cacheResult(
		com.viettel.ams.core.model.AssetManageReq assetManageReq) {
		getPersistence().cacheResult(assetManageReq);
	}

	/**
	* Caches the asset manage reqs in the entity cache if it is enabled.
	*
	* @param assetManageReqs the asset manage reqs
	*/
	public static void cacheResult(
		java.util.List<com.viettel.ams.core.model.AssetManageReq> assetManageReqs) {
		getPersistence().cacheResult(assetManageReqs);
	}

	/**
	* Creates a new asset manage req with the primary key. Does not add the asset manage req to the database.
	*
	* @param manageReqId the primary key for the new asset manage req
	* @return the new asset manage req
	*/
	public static com.viettel.ams.core.model.AssetManageReq create(
		long manageReqId) {
		return getPersistence().create(manageReqId);
	}

	/**
	* Removes the asset manage req with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param manageReqId the primary key of the asset manage req
	* @return the asset manage req that was removed
	* @throws com.viettel.ams.core.NoSuchAssetManageReqException if a asset manage req with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.AssetManageReq remove(
		long manageReqId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqException {
		return getPersistence().remove(manageReqId);
	}

	public static com.viettel.ams.core.model.AssetManageReq updateImpl(
		com.viettel.ams.core.model.AssetManageReq assetManageReq)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assetManageReq);
	}

	/**
	* Returns the asset manage req with the primary key or throws a {@link com.viettel.ams.core.NoSuchAssetManageReqException} if it could not be found.
	*
	* @param manageReqId the primary key of the asset manage req
	* @return the asset manage req
	* @throws com.viettel.ams.core.NoSuchAssetManageReqException if a asset manage req with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.AssetManageReq findByPrimaryKey(
		long manageReqId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqException {
		return getPersistence().findByPrimaryKey(manageReqId);
	}

	/**
	* Returns the asset manage req with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param manageReqId the primary key of the asset manage req
	* @return the asset manage req, or <code>null</code> if a asset manage req with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.AssetManageReq fetchByPrimaryKey(
		long manageReqId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(manageReqId);
	}

	/**
	* Returns all the asset manage reqs.
	*
	* @return the asset manage reqs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.AssetManageReq> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the asset manage reqs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset manage reqs
	* @param end the upper bound of the range of asset manage reqs (not inclusive)
	* @return the range of asset manage reqs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.AssetManageReq> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the asset manage reqs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset manage reqs
	* @param end the upper bound of the range of asset manage reqs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of asset manage reqs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.AssetManageReq> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the asset manage reqs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of asset manage reqs.
	*
	* @return the number of asset manage reqs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AssetManageReqPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AssetManageReqPersistence)PortletBeanLocatorUtil.locate(com.viettel.ams.core.service.ClpSerializer.getServletContextName(),
					AssetManageReqPersistence.class.getName());

			ReferenceRegistry.registerReference(AssetManageReqUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AssetManageReqPersistence persistence) {
	}

	private static AssetManageReqPersistence _persistence;
}
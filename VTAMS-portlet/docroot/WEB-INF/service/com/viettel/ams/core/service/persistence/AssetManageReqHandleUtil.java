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

import com.viettel.ams.core.model.AssetManageReqHandle;

import java.util.List;

/**
 * The persistence utility for the asset manage req handle service. This utility wraps {@link AssetManageReqHandlePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see AssetManageReqHandlePersistence
 * @see AssetManageReqHandlePersistenceImpl
 * @generated
 */
public class AssetManageReqHandleUtil {
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
	public static void clearCache(AssetManageReqHandle assetManageReqHandle) {
		getPersistence().clearCache(assetManageReqHandle);
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
	public static List<AssetManageReqHandle> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssetManageReqHandle> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssetManageReqHandle> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AssetManageReqHandle update(
		AssetManageReqHandle assetManageReqHandle) throws SystemException {
		return getPersistence().update(assetManageReqHandle);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AssetManageReqHandle update(
		AssetManageReqHandle assetManageReqHandle, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(assetManageReqHandle, serviceContext);
	}

	/**
	* Caches the asset manage req handle in the entity cache if it is enabled.
	*
	* @param assetManageReqHandle the asset manage req handle
	*/
	public static void cacheResult(
		com.viettel.ams.core.model.AssetManageReqHandle assetManageReqHandle) {
		getPersistence().cacheResult(assetManageReqHandle);
	}

	/**
	* Caches the asset manage req handles in the entity cache if it is enabled.
	*
	* @param assetManageReqHandles the asset manage req handles
	*/
	public static void cacheResult(
		java.util.List<com.viettel.ams.core.model.AssetManageReqHandle> assetManageReqHandles) {
		getPersistence().cacheResult(assetManageReqHandles);
	}

	/**
	* Creates a new asset manage req handle with the primary key. Does not add the asset manage req handle to the database.
	*
	* @param handleId the primary key for the new asset manage req handle
	* @return the new asset manage req handle
	*/
	public static com.viettel.ams.core.model.AssetManageReqHandle create(
		long handleId) {
		return getPersistence().create(handleId);
	}

	/**
	* Removes the asset manage req handle with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param handleId the primary key of the asset manage req handle
	* @return the asset manage req handle that was removed
	* @throws com.viettel.ams.core.NoSuchAssetManageReqHandleException if a asset manage req handle with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.AssetManageReqHandle remove(
		long handleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqHandleException {
		return getPersistence().remove(handleId);
	}

	public static com.viettel.ams.core.model.AssetManageReqHandle updateImpl(
		com.viettel.ams.core.model.AssetManageReqHandle assetManageReqHandle)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assetManageReqHandle);
	}

	/**
	* Returns the asset manage req handle with the primary key or throws a {@link com.viettel.ams.core.NoSuchAssetManageReqHandleException} if it could not be found.
	*
	* @param handleId the primary key of the asset manage req handle
	* @return the asset manage req handle
	* @throws com.viettel.ams.core.NoSuchAssetManageReqHandleException if a asset manage req handle with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.AssetManageReqHandle findByPrimaryKey(
		long handleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqHandleException {
		return getPersistence().findByPrimaryKey(handleId);
	}

	/**
	* Returns the asset manage req handle with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param handleId the primary key of the asset manage req handle
	* @return the asset manage req handle, or <code>null</code> if a asset manage req handle with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ams.core.model.AssetManageReqHandle fetchByPrimaryKey(
		long handleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(handleId);
	}

	/**
	* Returns all the asset manage req handles.
	*
	* @return the asset manage req handles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.AssetManageReqHandle> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the asset manage req handles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqHandleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset manage req handles
	* @param end the upper bound of the range of asset manage req handles (not inclusive)
	* @return the range of asset manage req handles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.AssetManageReqHandle> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the asset manage req handles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqHandleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset manage req handles
	* @param end the upper bound of the range of asset manage req handles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of asset manage req handles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ams.core.model.AssetManageReqHandle> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the asset manage req handles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of asset manage req handles.
	*
	* @return the number of asset manage req handles
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AssetManageReqHandlePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AssetManageReqHandlePersistence)PortletBeanLocatorUtil.locate(com.viettel.ams.core.service.ClpSerializer.getServletContextName(),
					AssetManageReqHandlePersistence.class.getName());

			ReferenceRegistry.registerReference(AssetManageReqHandleUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AssetManageReqHandlePersistence persistence) {
	}

	private static AssetManageReqHandlePersistence _persistence;
}
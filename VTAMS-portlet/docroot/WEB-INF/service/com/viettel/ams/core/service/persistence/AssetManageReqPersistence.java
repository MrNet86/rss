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

import com.liferay.portal.service.persistence.BasePersistence;

import com.viettel.ams.core.model.AssetManageReq;

/**
 * The persistence interface for the asset manage req service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see AssetManageReqPersistenceImpl
 * @see AssetManageReqUtil
 * @generated
 */
public interface AssetManageReqPersistence extends BasePersistence<AssetManageReq> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssetManageReqUtil} to access the asset manage req persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the asset manage req in the entity cache if it is enabled.
	*
	* @param assetManageReq the asset manage req
	*/
	public void cacheResult(
		com.viettel.ams.core.model.AssetManageReq assetManageReq);

	/**
	* Caches the asset manage reqs in the entity cache if it is enabled.
	*
	* @param assetManageReqs the asset manage reqs
	*/
	public void cacheResult(
		java.util.List<com.viettel.ams.core.model.AssetManageReq> assetManageReqs);

	/**
	* Creates a new asset manage req with the primary key. Does not add the asset manage req to the database.
	*
	* @param manageReqId the primary key for the new asset manage req
	* @return the new asset manage req
	*/
	public com.viettel.ams.core.model.AssetManageReq create(long manageReqId);

	/**
	* Removes the asset manage req with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param manageReqId the primary key of the asset manage req
	* @return the asset manage req that was removed
	* @throws com.viettel.ams.core.NoSuchAssetManageReqException if a asset manage req with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ams.core.model.AssetManageReq remove(long manageReqId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqException;

	public com.viettel.ams.core.model.AssetManageReq updateImpl(
		com.viettel.ams.core.model.AssetManageReq assetManageReq)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset manage req with the primary key or throws a {@link com.viettel.ams.core.NoSuchAssetManageReqException} if it could not be found.
	*
	* @param manageReqId the primary key of the asset manage req
	* @return the asset manage req
	* @throws com.viettel.ams.core.NoSuchAssetManageReqException if a asset manage req with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ams.core.model.AssetManageReq findByPrimaryKey(
		long manageReqId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqException;

	/**
	* Returns the asset manage req with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param manageReqId the primary key of the asset manage req
	* @return the asset manage req, or <code>null</code> if a asset manage req with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ams.core.model.AssetManageReq fetchByPrimaryKey(
		long manageReqId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the asset manage reqs.
	*
	* @return the asset manage reqs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ams.core.model.AssetManageReq> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.viettel.ams.core.model.AssetManageReq> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.viettel.ams.core.model.AssetManageReq> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the asset manage reqs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of asset manage reqs.
	*
	* @return the number of asset manage reqs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
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

import com.viettel.ams.core.model.AssetManageReqHandleEntity;

/**
 * The persistence interface for the asset manage req handle entity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see AssetManageReqHandleEntityPersistenceImpl
 * @see AssetManageReqHandleEntityUtil
 * @generated
 */
public interface AssetManageReqHandleEntityPersistence extends BasePersistence<AssetManageReqHandleEntity> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssetManageReqHandleEntityUtil} to access the asset manage req handle entity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the asset manage req handle entity in the entity cache if it is enabled.
	*
	* @param assetManageReqHandleEntity the asset manage req handle entity
	*/
	public void cacheResult(
		com.viettel.ams.core.model.AssetManageReqHandleEntity assetManageReqHandleEntity);

	/**
	* Caches the asset manage req handle entities in the entity cache if it is enabled.
	*
	* @param assetManageReqHandleEntities the asset manage req handle entities
	*/
	public void cacheResult(
		java.util.List<com.viettel.ams.core.model.AssetManageReqHandleEntity> assetManageReqHandleEntities);

	/**
	* Creates a new asset manage req handle entity with the primary key. Does not add the asset manage req handle entity to the database.
	*
	* @param id the primary key for the new asset manage req handle entity
	* @return the new asset manage req handle entity
	*/
	public com.viettel.ams.core.model.AssetManageReqHandleEntity create(long id);

	/**
	* Removes the asset manage req handle entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the asset manage req handle entity
	* @return the asset manage req handle entity that was removed
	* @throws com.viettel.ams.core.NoSuchAssetManageReqHandleEntityException if a asset manage req handle entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ams.core.model.AssetManageReqHandleEntity remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqHandleEntityException;

	public com.viettel.ams.core.model.AssetManageReqHandleEntity updateImpl(
		com.viettel.ams.core.model.AssetManageReqHandleEntity assetManageReqHandleEntity)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset manage req handle entity with the primary key or throws a {@link com.viettel.ams.core.NoSuchAssetManageReqHandleEntityException} if it could not be found.
	*
	* @param id the primary key of the asset manage req handle entity
	* @return the asset manage req handle entity
	* @throws com.viettel.ams.core.NoSuchAssetManageReqHandleEntityException if a asset manage req handle entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ams.core.model.AssetManageReqHandleEntity findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqHandleEntityException;

	/**
	* Returns the asset manage req handle entity with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the asset manage req handle entity
	* @return the asset manage req handle entity, or <code>null</code> if a asset manage req handle entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ams.core.model.AssetManageReqHandleEntity fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the asset manage req handle entities.
	*
	* @return the asset manage req handle entities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ams.core.model.AssetManageReqHandleEntity> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the asset manage req handle entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqHandleEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset manage req handle entities
	* @param end the upper bound of the range of asset manage req handle entities (not inclusive)
	* @return the range of asset manage req handle entities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ams.core.model.AssetManageReqHandleEntity> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the asset manage req handle entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqHandleEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset manage req handle entities
	* @param end the upper bound of the range of asset manage req handle entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of asset manage req handle entities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ams.core.model.AssetManageReqHandleEntity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the asset manage req handle entities from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of asset manage req handle entities.
	*
	* @return the number of asset manage req handle entities
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
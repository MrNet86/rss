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

import com.viettel.ams.core.model.AssetManageReqEntity;

/**
 * The persistence interface for the asset manage req entity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see AssetManageReqEntityPersistenceImpl
 * @see AssetManageReqEntityUtil
 * @generated
 */
public interface AssetManageReqEntityPersistence extends BasePersistence<AssetManageReqEntity> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssetManageReqEntityUtil} to access the asset manage req entity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the asset manage req entities where reqId = &#63;.
	*
	* @param reqId the req ID
	* @return the matching asset manage req entities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ams.core.model.AssetManageReqEntity> findByAssetManageReq(
		java.lang.Long reqId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.viettel.ams.core.model.AssetManageReqEntity> findByAssetManageReq(
		java.lang.Long reqId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.viettel.ams.core.model.AssetManageReqEntity> findByAssetManageReq(
		java.lang.Long reqId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first asset manage req entity in the ordered set where reqId = &#63;.
	*
	* @param reqId the req ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset manage req entity
	* @throws com.viettel.ams.core.NoSuchAssetManageReqEntityException if a matching asset manage req entity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ams.core.model.AssetManageReqEntity findByAssetManageReq_First(
		java.lang.Long reqId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqEntityException;

	/**
	* Returns the first asset manage req entity in the ordered set where reqId = &#63;.
	*
	* @param reqId the req ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching asset manage req entity, or <code>null</code> if a matching asset manage req entity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ams.core.model.AssetManageReqEntity fetchByAssetManageReq_First(
		java.lang.Long reqId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last asset manage req entity in the ordered set where reqId = &#63;.
	*
	* @param reqId the req ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset manage req entity
	* @throws com.viettel.ams.core.NoSuchAssetManageReqEntityException if a matching asset manage req entity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ams.core.model.AssetManageReqEntity findByAssetManageReq_Last(
		java.lang.Long reqId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqEntityException;

	/**
	* Returns the last asset manage req entity in the ordered set where reqId = &#63;.
	*
	* @param reqId the req ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching asset manage req entity, or <code>null</code> if a matching asset manage req entity could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ams.core.model.AssetManageReqEntity fetchByAssetManageReq_Last(
		java.lang.Long reqId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.viettel.ams.core.model.AssetManageReqEntity[] findByAssetManageReq_PrevAndNext(
		long id, java.lang.Long reqId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqEntityException;

	/**
	* Removes all the asset manage req entities where reqId = &#63; from the database.
	*
	* @param reqId the req ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAssetManageReq(java.lang.Long reqId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of asset manage req entities where reqId = &#63;.
	*
	* @param reqId the req ID
	* @return the number of matching asset manage req entities
	* @throws SystemException if a system exception occurred
	*/
	public int countByAssetManageReq(java.lang.Long reqId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the asset manage req entity in the entity cache if it is enabled.
	*
	* @param assetManageReqEntity the asset manage req entity
	*/
	public void cacheResult(
		com.viettel.ams.core.model.AssetManageReqEntity assetManageReqEntity);

	/**
	* Caches the asset manage req entities in the entity cache if it is enabled.
	*
	* @param assetManageReqEntities the asset manage req entities
	*/
	public void cacheResult(
		java.util.List<com.viettel.ams.core.model.AssetManageReqEntity> assetManageReqEntities);

	/**
	* Creates a new asset manage req entity with the primary key. Does not add the asset manage req entity to the database.
	*
	* @param id the primary key for the new asset manage req entity
	* @return the new asset manage req entity
	*/
	public com.viettel.ams.core.model.AssetManageReqEntity create(long id);

	/**
	* Removes the asset manage req entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the asset manage req entity
	* @return the asset manage req entity that was removed
	* @throws com.viettel.ams.core.NoSuchAssetManageReqEntityException if a asset manage req entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ams.core.model.AssetManageReqEntity remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqEntityException;

	public com.viettel.ams.core.model.AssetManageReqEntity updateImpl(
		com.viettel.ams.core.model.AssetManageReqEntity assetManageReqEntity)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset manage req entity with the primary key or throws a {@link com.viettel.ams.core.NoSuchAssetManageReqEntityException} if it could not be found.
	*
	* @param id the primary key of the asset manage req entity
	* @return the asset manage req entity
	* @throws com.viettel.ams.core.NoSuchAssetManageReqEntityException if a asset manage req entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ams.core.model.AssetManageReqEntity findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ams.core.NoSuchAssetManageReqEntityException;

	/**
	* Returns the asset manage req entity with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the asset manage req entity
	* @return the asset manage req entity, or <code>null</code> if a asset manage req entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ams.core.model.AssetManageReqEntity fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the asset manage req entities.
	*
	* @return the asset manage req entities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ams.core.model.AssetManageReqEntity> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.viettel.ams.core.model.AssetManageReqEntity> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.viettel.ams.core.model.AssetManageReqEntity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the asset manage req entities from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of asset manage req entities.
	*
	* @return the number of asset manage req entities
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
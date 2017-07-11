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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.viettel.ams.core.NoSuchAssetManageReqHandleEntityException;
import com.viettel.ams.core.model.AssetManageReqHandleEntity;
import com.viettel.ams.core.model.impl.AssetManageReqHandleEntityImpl;
import com.viettel.ams.core.model.impl.AssetManageReqHandleEntityModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the asset manage req handle entity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see AssetManageReqHandleEntityPersistence
 * @see AssetManageReqHandleEntityUtil
 * @generated
 */
public class AssetManageReqHandleEntityPersistenceImpl
	extends BasePersistenceImpl<AssetManageReqHandleEntity>
	implements AssetManageReqHandleEntityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AssetManageReqHandleEntityUtil} to access the asset manage req handle entity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AssetManageReqHandleEntityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AssetManageReqHandleEntityModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqHandleEntityModelImpl.FINDER_CACHE_ENABLED,
			AssetManageReqHandleEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AssetManageReqHandleEntityModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqHandleEntityModelImpl.FINDER_CACHE_ENABLED,
			AssetManageReqHandleEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AssetManageReqHandleEntityModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqHandleEntityModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public AssetManageReqHandleEntityPersistenceImpl() {
		setModelClass(AssetManageReqHandleEntity.class);
	}

	/**
	 * Caches the asset manage req handle entity in the entity cache if it is enabled.
	 *
	 * @param assetManageReqHandleEntity the asset manage req handle entity
	 */
	@Override
	public void cacheResult(
		AssetManageReqHandleEntity assetManageReqHandleEntity) {
		EntityCacheUtil.putResult(AssetManageReqHandleEntityModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqHandleEntityImpl.class,
			assetManageReqHandleEntity.getPrimaryKey(),
			assetManageReqHandleEntity);

		assetManageReqHandleEntity.resetOriginalValues();
	}

	/**
	 * Caches the asset manage req handle entities in the entity cache if it is enabled.
	 *
	 * @param assetManageReqHandleEntities the asset manage req handle entities
	 */
	@Override
	public void cacheResult(
		List<AssetManageReqHandleEntity> assetManageReqHandleEntities) {
		for (AssetManageReqHandleEntity assetManageReqHandleEntity : assetManageReqHandleEntities) {
			if (EntityCacheUtil.getResult(
						AssetManageReqHandleEntityModelImpl.ENTITY_CACHE_ENABLED,
						AssetManageReqHandleEntityImpl.class,
						assetManageReqHandleEntity.getPrimaryKey()) == null) {
				cacheResult(assetManageReqHandleEntity);
			}
			else {
				assetManageReqHandleEntity.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all asset manage req handle entities.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AssetManageReqHandleEntityImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AssetManageReqHandleEntityImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the asset manage req handle entity.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AssetManageReqHandleEntity assetManageReqHandleEntity) {
		EntityCacheUtil.removeResult(AssetManageReqHandleEntityModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqHandleEntityImpl.class,
			assetManageReqHandleEntity.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<AssetManageReqHandleEntity> assetManageReqHandleEntities) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AssetManageReqHandleEntity assetManageReqHandleEntity : assetManageReqHandleEntities) {
			EntityCacheUtil.removeResult(AssetManageReqHandleEntityModelImpl.ENTITY_CACHE_ENABLED,
				AssetManageReqHandleEntityImpl.class,
				assetManageReqHandleEntity.getPrimaryKey());
		}
	}

	/**
	 * Creates a new asset manage req handle entity with the primary key. Does not add the asset manage req handle entity to the database.
	 *
	 * @param id the primary key for the new asset manage req handle entity
	 * @return the new asset manage req handle entity
	 */
	@Override
	public AssetManageReqHandleEntity create(long id) {
		AssetManageReqHandleEntity assetManageReqHandleEntity = new AssetManageReqHandleEntityImpl();

		assetManageReqHandleEntity.setNew(true);
		assetManageReqHandleEntity.setPrimaryKey(id);

		return assetManageReqHandleEntity;
	}

	/**
	 * Removes the asset manage req handle entity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the asset manage req handle entity
	 * @return the asset manage req handle entity that was removed
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqHandleEntityException if a asset manage req handle entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqHandleEntity remove(long id)
		throws NoSuchAssetManageReqHandleEntityException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the asset manage req handle entity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the asset manage req handle entity
	 * @return the asset manage req handle entity that was removed
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqHandleEntityException if a asset manage req handle entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqHandleEntity remove(Serializable primaryKey)
		throws NoSuchAssetManageReqHandleEntityException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AssetManageReqHandleEntity assetManageReqHandleEntity = (AssetManageReqHandleEntity)session.get(AssetManageReqHandleEntityImpl.class,
					primaryKey);

			if (assetManageReqHandleEntity == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssetManageReqHandleEntityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assetManageReqHandleEntity);
		}
		catch (NoSuchAssetManageReqHandleEntityException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected AssetManageReqHandleEntity removeImpl(
		AssetManageReqHandleEntity assetManageReqHandleEntity)
		throws SystemException {
		assetManageReqHandleEntity = toUnwrappedModel(assetManageReqHandleEntity);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assetManageReqHandleEntity)) {
				assetManageReqHandleEntity = (AssetManageReqHandleEntity)session.get(AssetManageReqHandleEntityImpl.class,
						assetManageReqHandleEntity.getPrimaryKeyObj());
			}

			if (assetManageReqHandleEntity != null) {
				session.delete(assetManageReqHandleEntity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (assetManageReqHandleEntity != null) {
			clearCache(assetManageReqHandleEntity);
		}

		return assetManageReqHandleEntity;
	}

	@Override
	public AssetManageReqHandleEntity updateImpl(
		com.viettel.ams.core.model.AssetManageReqHandleEntity assetManageReqHandleEntity)
		throws SystemException {
		assetManageReqHandleEntity = toUnwrappedModel(assetManageReqHandleEntity);

		boolean isNew = assetManageReqHandleEntity.isNew();

		Session session = null;

		try {
			session = openSession();

			if (assetManageReqHandleEntity.isNew()) {
				session.save(assetManageReqHandleEntity);

				assetManageReqHandleEntity.setNew(false);
			}
			else {
				session.merge(assetManageReqHandleEntity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(AssetManageReqHandleEntityModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqHandleEntityImpl.class,
			assetManageReqHandleEntity.getPrimaryKey(),
			assetManageReqHandleEntity);

		return assetManageReqHandleEntity;
	}

	protected AssetManageReqHandleEntity toUnwrappedModel(
		AssetManageReqHandleEntity assetManageReqHandleEntity) {
		if (assetManageReqHandleEntity instanceof AssetManageReqHandleEntityImpl) {
			return assetManageReqHandleEntity;
		}

		AssetManageReqHandleEntityImpl assetManageReqHandleEntityImpl = new AssetManageReqHandleEntityImpl();

		assetManageReqHandleEntityImpl.setNew(assetManageReqHandleEntity.isNew());
		assetManageReqHandleEntityImpl.setPrimaryKey(assetManageReqHandleEntity.getPrimaryKey());

		assetManageReqHandleEntityImpl.setId(assetManageReqHandleEntity.getId());
		assetManageReqHandleEntityImpl.setHandleId(assetManageReqHandleEntity.getHandleId());
		assetManageReqHandleEntityImpl.setMerEntityId(assetManageReqHandleEntity.getMerEntityId());
		assetManageReqHandleEntityImpl.setStatus(assetManageReqHandleEntity.getStatus());
		assetManageReqHandleEntityImpl.setStationId(assetManageReqHandleEntity.getStationId());
		assetManageReqHandleEntityImpl.setFailDate(assetManageReqHandleEntity.getFailDate());
		assetManageReqHandleEntityImpl.setFailReason(assetManageReqHandleEntity.getFailReason());
		assetManageReqHandleEntityImpl.setUsedDate(assetManageReqHandleEntity.getUsedDate());
		assetManageReqHandleEntityImpl.setHandOverId(assetManageReqHandleEntity.getHandOverId());
		assetManageReqHandleEntityImpl.setQuantity(assetManageReqHandleEntity.getQuantity());
		assetManageReqHandleEntityImpl.setUnitPrice(assetManageReqHandleEntity.getUnitPrice());
		assetManageReqHandleEntityImpl.setDescription(assetManageReqHandleEntity.getDescription());
		assetManageReqHandleEntityImpl.setUpgradeParentId(assetManageReqHandleEntity.getUpgradeParentId());
		assetManageReqHandleEntityImpl.setParentId(assetManageReqHandleEntity.getParentId());
		assetManageReqHandleEntityImpl.setGroupId(assetManageReqHandleEntity.getGroupId());
		assetManageReqHandleEntityImpl.setTimeRetrieve(assetManageReqHandleEntity.getTimeRetrieve());
		assetManageReqHandleEntityImpl.setStatusId(assetManageReqHandleEntity.getStatusId());
		assetManageReqHandleEntityImpl.setMark(assetManageReqHandleEntity.getMark());
		assetManageReqHandleEntityImpl.setOldStatusId(assetManageReqHandleEntity.getOldStatusId());
		assetManageReqHandleEntityImpl.setPreCatEmployeeId(assetManageReqHandleEntity.getPreCatEmployeeId());
		assetManageReqHandleEntityImpl.setPercentQuality(assetManageReqHandleEntity.getPercentQuality());
		assetManageReqHandleEntityImpl.setWithdrawPrice(assetManageReqHandleEntity.getWithdrawPrice());
		assetManageReqHandleEntityImpl.setDeliveryNoteId(assetManageReqHandleEntity.getDeliveryNoteId());

		return assetManageReqHandleEntityImpl;
	}

	/**
	 * Returns the asset manage req handle entity with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the asset manage req handle entity
	 * @return the asset manage req handle entity
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqHandleEntityException if a asset manage req handle entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqHandleEntity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssetManageReqHandleEntityException, SystemException {
		AssetManageReqHandleEntity assetManageReqHandleEntity = fetchByPrimaryKey(primaryKey);

		if (assetManageReqHandleEntity == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssetManageReqHandleEntityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return assetManageReqHandleEntity;
	}

	/**
	 * Returns the asset manage req handle entity with the primary key or throws a {@link com.viettel.ams.core.NoSuchAssetManageReqHandleEntityException} if it could not be found.
	 *
	 * @param id the primary key of the asset manage req handle entity
	 * @return the asset manage req handle entity
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqHandleEntityException if a asset manage req handle entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqHandleEntity findByPrimaryKey(long id)
		throws NoSuchAssetManageReqHandleEntityException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the asset manage req handle entity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the asset manage req handle entity
	 * @return the asset manage req handle entity, or <code>null</code> if a asset manage req handle entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqHandleEntity fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AssetManageReqHandleEntity assetManageReqHandleEntity = (AssetManageReqHandleEntity)EntityCacheUtil.getResult(AssetManageReqHandleEntityModelImpl.ENTITY_CACHE_ENABLED,
				AssetManageReqHandleEntityImpl.class, primaryKey);

		if (assetManageReqHandleEntity == _nullAssetManageReqHandleEntity) {
			return null;
		}

		if (assetManageReqHandleEntity == null) {
			Session session = null;

			try {
				session = openSession();

				assetManageReqHandleEntity = (AssetManageReqHandleEntity)session.get(AssetManageReqHandleEntityImpl.class,
						primaryKey);

				if (assetManageReqHandleEntity != null) {
					cacheResult(assetManageReqHandleEntity);
				}
				else {
					EntityCacheUtil.putResult(AssetManageReqHandleEntityModelImpl.ENTITY_CACHE_ENABLED,
						AssetManageReqHandleEntityImpl.class, primaryKey,
						_nullAssetManageReqHandleEntity);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AssetManageReqHandleEntityModelImpl.ENTITY_CACHE_ENABLED,
					AssetManageReqHandleEntityImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return assetManageReqHandleEntity;
	}

	/**
	 * Returns the asset manage req handle entity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the asset manage req handle entity
	 * @return the asset manage req handle entity, or <code>null</code> if a asset manage req handle entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqHandleEntity fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the asset manage req handle entities.
	 *
	 * @return the asset manage req handle entities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssetManageReqHandleEntity> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<AssetManageReqHandleEntity> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<AssetManageReqHandleEntity> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<AssetManageReqHandleEntity> list = (List<AssetManageReqHandleEntity>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSETMANAGEREQHANDLEENTITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSETMANAGEREQHANDLEENTITY;

				if (pagination) {
					sql = sql.concat(AssetManageReqHandleEntityModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AssetManageReqHandleEntity>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssetManageReqHandleEntity>(list);
				}
				else {
					list = (List<AssetManageReqHandleEntity>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the asset manage req handle entities from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AssetManageReqHandleEntity assetManageReqHandleEntity : findAll()) {
			remove(assetManageReqHandleEntity);
		}
	}

	/**
	 * Returns the number of asset manage req handle entities.
	 *
	 * @return the number of asset manage req handle entities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ASSETMANAGEREQHANDLEENTITY);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the asset manage req handle entity persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.viettel.ams.core.model.AssetManageReqHandleEntity")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AssetManageReqHandleEntity>> listenersList = new ArrayList<ModelListener<AssetManageReqHandleEntity>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AssetManageReqHandleEntity>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(AssetManageReqHandleEntityImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASSETMANAGEREQHANDLEENTITY = "SELECT assetManageReqHandleEntity FROM AssetManageReqHandleEntity assetManageReqHandleEntity";
	private static final String _SQL_COUNT_ASSETMANAGEREQHANDLEENTITY = "SELECT COUNT(assetManageReqHandleEntity) FROM AssetManageReqHandleEntity assetManageReqHandleEntity";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assetManageReqHandleEntity.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AssetManageReqHandleEntity exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AssetManageReqHandleEntityPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "handleId", "merEntityId", "status", "stationId",
				"failDate", "failReason", "usedDate", "handOverId", "quantity",
				"unitPrice", "description", "upgradeParentId", "parentId",
				"groupId", "timeRetrieve", "statusId", "mark", "oldStatusId",
				"preCatEmployeeId", "percentQuality", "withdrawPrice",
				"deliveryNoteId"
			});
	private static AssetManageReqHandleEntity _nullAssetManageReqHandleEntity = new AssetManageReqHandleEntityImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AssetManageReqHandleEntity> toCacheModel() {
				return _nullAssetManageReqHandleEntityCacheModel;
			}
		};

	private static CacheModel<AssetManageReqHandleEntity> _nullAssetManageReqHandleEntityCacheModel =
		new CacheModel<AssetManageReqHandleEntity>() {
			@Override
			public AssetManageReqHandleEntity toEntityModel() {
				return _nullAssetManageReqHandleEntity;
			}
		};
}
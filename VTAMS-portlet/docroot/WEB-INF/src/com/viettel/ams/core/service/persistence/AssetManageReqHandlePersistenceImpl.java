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

import com.viettel.ams.core.NoSuchAssetManageReqHandleException;
import com.viettel.ams.core.model.AssetManageReqHandle;
import com.viettel.ams.core.model.impl.AssetManageReqHandleImpl;
import com.viettel.ams.core.model.impl.AssetManageReqHandleModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the asset manage req handle service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see AssetManageReqHandlePersistence
 * @see AssetManageReqHandleUtil
 * @generated
 */
public class AssetManageReqHandlePersistenceImpl extends BasePersistenceImpl<AssetManageReqHandle>
	implements AssetManageReqHandlePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AssetManageReqHandleUtil} to access the asset manage req handle persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AssetManageReqHandleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AssetManageReqHandleModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqHandleModelImpl.FINDER_CACHE_ENABLED,
			AssetManageReqHandleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AssetManageReqHandleModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqHandleModelImpl.FINDER_CACHE_ENABLED,
			AssetManageReqHandleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AssetManageReqHandleModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqHandleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AssetManageReqHandlePersistenceImpl() {
		setModelClass(AssetManageReqHandle.class);
	}

	/**
	 * Caches the asset manage req handle in the entity cache if it is enabled.
	 *
	 * @param assetManageReqHandle the asset manage req handle
	 */
	@Override
	public void cacheResult(AssetManageReqHandle assetManageReqHandle) {
		EntityCacheUtil.putResult(AssetManageReqHandleModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqHandleImpl.class,
			assetManageReqHandle.getPrimaryKey(), assetManageReqHandle);

		assetManageReqHandle.resetOriginalValues();
	}

	/**
	 * Caches the asset manage req handles in the entity cache if it is enabled.
	 *
	 * @param assetManageReqHandles the asset manage req handles
	 */
	@Override
	public void cacheResult(List<AssetManageReqHandle> assetManageReqHandles) {
		for (AssetManageReqHandle assetManageReqHandle : assetManageReqHandles) {
			if (EntityCacheUtil.getResult(
						AssetManageReqHandleModelImpl.ENTITY_CACHE_ENABLED,
						AssetManageReqHandleImpl.class,
						assetManageReqHandle.getPrimaryKey()) == null) {
				cacheResult(assetManageReqHandle);
			}
			else {
				assetManageReqHandle.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all asset manage req handles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AssetManageReqHandleImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AssetManageReqHandleImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the asset manage req handle.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AssetManageReqHandle assetManageReqHandle) {
		EntityCacheUtil.removeResult(AssetManageReqHandleModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqHandleImpl.class, assetManageReqHandle.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AssetManageReqHandle> assetManageReqHandles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AssetManageReqHandle assetManageReqHandle : assetManageReqHandles) {
			EntityCacheUtil.removeResult(AssetManageReqHandleModelImpl.ENTITY_CACHE_ENABLED,
				AssetManageReqHandleImpl.class,
				assetManageReqHandle.getPrimaryKey());
		}
	}

	/**
	 * Creates a new asset manage req handle with the primary key. Does not add the asset manage req handle to the database.
	 *
	 * @param handleId the primary key for the new asset manage req handle
	 * @return the new asset manage req handle
	 */
	@Override
	public AssetManageReqHandle create(long handleId) {
		AssetManageReqHandle assetManageReqHandle = new AssetManageReqHandleImpl();

		assetManageReqHandle.setNew(true);
		assetManageReqHandle.setPrimaryKey(handleId);

		return assetManageReqHandle;
	}

	/**
	 * Removes the asset manage req handle with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param handleId the primary key of the asset manage req handle
	 * @return the asset manage req handle that was removed
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqHandleException if a asset manage req handle with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqHandle remove(long handleId)
		throws NoSuchAssetManageReqHandleException, SystemException {
		return remove((Serializable)handleId);
	}

	/**
	 * Removes the asset manage req handle with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the asset manage req handle
	 * @return the asset manage req handle that was removed
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqHandleException if a asset manage req handle with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqHandle remove(Serializable primaryKey)
		throws NoSuchAssetManageReqHandleException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AssetManageReqHandle assetManageReqHandle = (AssetManageReqHandle)session.get(AssetManageReqHandleImpl.class,
					primaryKey);

			if (assetManageReqHandle == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssetManageReqHandleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assetManageReqHandle);
		}
		catch (NoSuchAssetManageReqHandleException nsee) {
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
	protected AssetManageReqHandle removeImpl(
		AssetManageReqHandle assetManageReqHandle) throws SystemException {
		assetManageReqHandle = toUnwrappedModel(assetManageReqHandle);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assetManageReqHandle)) {
				assetManageReqHandle = (AssetManageReqHandle)session.get(AssetManageReqHandleImpl.class,
						assetManageReqHandle.getPrimaryKeyObj());
			}

			if (assetManageReqHandle != null) {
				session.delete(assetManageReqHandle);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (assetManageReqHandle != null) {
			clearCache(assetManageReqHandle);
		}

		return assetManageReqHandle;
	}

	@Override
	public AssetManageReqHandle updateImpl(
		com.viettel.ams.core.model.AssetManageReqHandle assetManageReqHandle)
		throws SystemException {
		assetManageReqHandle = toUnwrappedModel(assetManageReqHandle);

		boolean isNew = assetManageReqHandle.isNew();

		Session session = null;

		try {
			session = openSession();

			if (assetManageReqHandle.isNew()) {
				session.save(assetManageReqHandle);

				assetManageReqHandle.setNew(false);
			}
			else {
				session.merge(assetManageReqHandle);
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

		EntityCacheUtil.putResult(AssetManageReqHandleModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqHandleImpl.class,
			assetManageReqHandle.getPrimaryKey(), assetManageReqHandle);

		return assetManageReqHandle;
	}

	protected AssetManageReqHandle toUnwrappedModel(
		AssetManageReqHandle assetManageReqHandle) {
		if (assetManageReqHandle instanceof AssetManageReqHandleImpl) {
			return assetManageReqHandle;
		}

		AssetManageReqHandleImpl assetManageReqHandleImpl = new AssetManageReqHandleImpl();

		assetManageReqHandleImpl.setNew(assetManageReqHandle.isNew());
		assetManageReqHandleImpl.setPrimaryKey(assetManageReqHandle.getPrimaryKey());

		assetManageReqHandleImpl.setHandleId(assetManageReqHandle.getHandleId());
		assetManageReqHandleImpl.setManageReqId(assetManageReqHandle.getManageReqId());
		assetManageReqHandleImpl.setDescription(assetManageReqHandle.getDescription());
		assetManageReqHandleImpl.setUpdatorId(assetManageReqHandle.getUpdatorId());
		assetManageReqHandleImpl.setUpdateDate(assetManageReqHandle.getUpdateDate());
		assetManageReqHandleImpl.setStatus(assetManageReqHandle.getStatus());
		assetManageReqHandleImpl.setCode(assetManageReqHandle.getCode());
		assetManageReqHandleImpl.setCreateGroupId(assetManageReqHandle.getCreateGroupId());
		assetManageReqHandleImpl.setImpReqId(assetManageReqHandle.getImpReqId());
		assetManageReqHandleImpl.setReqDelegator(assetManageReqHandle.getReqDelegator());
		assetManageReqHandleImpl.setReqDelegatorPosition(assetManageReqHandle.getReqDelegatorPosition());
		assetManageReqHandleImpl.setDocument(assetManageReqHandle.getDocument());
		assetManageReqHandleImpl.setBeginDate(assetManageReqHandle.getBeginDate());
		assetManageReqHandleImpl.setEndDate(assetManageReqHandle.getEndDate());
		assetManageReqHandleImpl.setKcsCode(assetManageReqHandle.getKcsCode());
		assetManageReqHandleImpl.setHandOverId(assetManageReqHandle.getHandOverId());
		assetManageReqHandleImpl.setImpReqCode(assetManageReqHandle.getImpReqCode());
		assetManageReqHandleImpl.setBaseKcsCode(assetManageReqHandle.getBaseKcsCode());
		assetManageReqHandleImpl.setCreatorKcs(assetManageReqHandle.getCreatorKcs());
		assetManageReqHandleImpl.setAssetType(assetManageReqHandle.getAssetType());
		assetManageReqHandleImpl.setIsNotModify(assetManageReqHandle.getIsNotModify());
		assetManageReqHandleImpl.setHandleDelegator(assetManageReqHandle.getHandleDelegator());
		assetManageReqHandleImpl.setHandleDelegatorPosition(assetManageReqHandle.getHandleDelegatorPosition());
		assetManageReqHandleImpl.setContractId(assetManageReqHandle.getContractId());
		assetManageReqHandleImpl.setStatusCa(assetManageReqHandle.getStatusCa());
		assetManageReqHandleImpl.setCommentCa(assetManageReqHandle.getCommentCa());
		assetManageReqHandleImpl.setDocumentCaId(assetManageReqHandle.getDocumentCaId());

		return assetManageReqHandleImpl;
	}

	/**
	 * Returns the asset manage req handle with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the asset manage req handle
	 * @return the asset manage req handle
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqHandleException if a asset manage req handle with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqHandle findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssetManageReqHandleException, SystemException {
		AssetManageReqHandle assetManageReqHandle = fetchByPrimaryKey(primaryKey);

		if (assetManageReqHandle == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssetManageReqHandleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return assetManageReqHandle;
	}

	/**
	 * Returns the asset manage req handle with the primary key or throws a {@link com.viettel.ams.core.NoSuchAssetManageReqHandleException} if it could not be found.
	 *
	 * @param handleId the primary key of the asset manage req handle
	 * @return the asset manage req handle
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqHandleException if a asset manage req handle with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqHandle findByPrimaryKey(long handleId)
		throws NoSuchAssetManageReqHandleException, SystemException {
		return findByPrimaryKey((Serializable)handleId);
	}

	/**
	 * Returns the asset manage req handle with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the asset manage req handle
	 * @return the asset manage req handle, or <code>null</code> if a asset manage req handle with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqHandle fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AssetManageReqHandle assetManageReqHandle = (AssetManageReqHandle)EntityCacheUtil.getResult(AssetManageReqHandleModelImpl.ENTITY_CACHE_ENABLED,
				AssetManageReqHandleImpl.class, primaryKey);

		if (assetManageReqHandle == _nullAssetManageReqHandle) {
			return null;
		}

		if (assetManageReqHandle == null) {
			Session session = null;

			try {
				session = openSession();

				assetManageReqHandle = (AssetManageReqHandle)session.get(AssetManageReqHandleImpl.class,
						primaryKey);

				if (assetManageReqHandle != null) {
					cacheResult(assetManageReqHandle);
				}
				else {
					EntityCacheUtil.putResult(AssetManageReqHandleModelImpl.ENTITY_CACHE_ENABLED,
						AssetManageReqHandleImpl.class, primaryKey,
						_nullAssetManageReqHandle);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AssetManageReqHandleModelImpl.ENTITY_CACHE_ENABLED,
					AssetManageReqHandleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return assetManageReqHandle;
	}

	/**
	 * Returns the asset manage req handle with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param handleId the primary key of the asset manage req handle
	 * @return the asset manage req handle, or <code>null</code> if a asset manage req handle with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqHandle fetchByPrimaryKey(long handleId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)handleId);
	}

	/**
	 * Returns all the asset manage req handles.
	 *
	 * @return the asset manage req handles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssetManageReqHandle> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<AssetManageReqHandle> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<AssetManageReqHandle> findAll(int start, int end,
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

		List<AssetManageReqHandle> list = (List<AssetManageReqHandle>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSETMANAGEREQHANDLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSETMANAGEREQHANDLE;

				if (pagination) {
					sql = sql.concat(AssetManageReqHandleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AssetManageReqHandle>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssetManageReqHandle>(list);
				}
				else {
					list = (List<AssetManageReqHandle>)QueryUtil.list(q,
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
	 * Removes all the asset manage req handles from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AssetManageReqHandle assetManageReqHandle : findAll()) {
			remove(assetManageReqHandle);
		}
	}

	/**
	 * Returns the number of asset manage req handles.
	 *
	 * @return the number of asset manage req handles
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

				Query q = session.createQuery(_SQL_COUNT_ASSETMANAGEREQHANDLE);

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
	 * Initializes the asset manage req handle persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.viettel.ams.core.model.AssetManageReqHandle")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AssetManageReqHandle>> listenersList = new ArrayList<ModelListener<AssetManageReqHandle>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AssetManageReqHandle>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AssetManageReqHandleImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASSETMANAGEREQHANDLE = "SELECT assetManageReqHandle FROM AssetManageReqHandle assetManageReqHandle";
	private static final String _SQL_COUNT_ASSETMANAGEREQHANDLE = "SELECT COUNT(assetManageReqHandle) FROM AssetManageReqHandle assetManageReqHandle";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assetManageReqHandle.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AssetManageReqHandle exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AssetManageReqHandlePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"handleId", "manageReqId", "description", "updatorId",
				"updateDate", "status", "code", "createGroupId", "impReqId",
				"reqDelegator", "reqDelegatorPosition", "document", "beginDate",
				"endDate", "kcsCode", "handOverId", "impReqCode", "baseKcsCode",
				"creatorKcs", "assetType", "isNotModify", "handleDelegator",
				"handleDelegatorPosition", "contractId", "statusCa", "commentCa",
				"documentCaId"
			});
	private static AssetManageReqHandle _nullAssetManageReqHandle = new AssetManageReqHandleImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AssetManageReqHandle> toCacheModel() {
				return _nullAssetManageReqHandleCacheModel;
			}
		};

	private static CacheModel<AssetManageReqHandle> _nullAssetManageReqHandleCacheModel =
		new CacheModel<AssetManageReqHandle>() {
			@Override
			public AssetManageReqHandle toEntityModel() {
				return _nullAssetManageReqHandle;
			}
		};
}
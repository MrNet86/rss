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

import com.viettel.ams.core.NoSuchAssetManageReqException;
import com.viettel.ams.core.model.AssetManageReq;
import com.viettel.ams.core.model.impl.AssetManageReqImpl;
import com.viettel.ams.core.model.impl.AssetManageReqModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the asset manage req service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see AssetManageReqPersistence
 * @see AssetManageReqUtil
 * @generated
 */
public class AssetManageReqPersistenceImpl extends BasePersistenceImpl<AssetManageReq>
	implements AssetManageReqPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AssetManageReqUtil} to access the asset manage req persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AssetManageReqImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AssetManageReqModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqModelImpl.FINDER_CACHE_ENABLED,
			AssetManageReqImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AssetManageReqModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqModelImpl.FINDER_CACHE_ENABLED,
			AssetManageReqImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AssetManageReqModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AssetManageReqPersistenceImpl() {
		setModelClass(AssetManageReq.class);
	}

	/**
	 * Caches the asset manage req in the entity cache if it is enabled.
	 *
	 * @param assetManageReq the asset manage req
	 */
	@Override
	public void cacheResult(AssetManageReq assetManageReq) {
		EntityCacheUtil.putResult(AssetManageReqModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqImpl.class, assetManageReq.getPrimaryKey(),
			assetManageReq);

		assetManageReq.resetOriginalValues();
	}

	/**
	 * Caches the asset manage reqs in the entity cache if it is enabled.
	 *
	 * @param assetManageReqs the asset manage reqs
	 */
	@Override
	public void cacheResult(List<AssetManageReq> assetManageReqs) {
		for (AssetManageReq assetManageReq : assetManageReqs) {
			if (EntityCacheUtil.getResult(
						AssetManageReqModelImpl.ENTITY_CACHE_ENABLED,
						AssetManageReqImpl.class, assetManageReq.getPrimaryKey()) == null) {
				cacheResult(assetManageReq);
			}
			else {
				assetManageReq.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all asset manage reqs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AssetManageReqImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AssetManageReqImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the asset manage req.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AssetManageReq assetManageReq) {
		EntityCacheUtil.removeResult(AssetManageReqModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqImpl.class, assetManageReq.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AssetManageReq> assetManageReqs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AssetManageReq assetManageReq : assetManageReqs) {
			EntityCacheUtil.removeResult(AssetManageReqModelImpl.ENTITY_CACHE_ENABLED,
				AssetManageReqImpl.class, assetManageReq.getPrimaryKey());
		}
	}

	/**
	 * Creates a new asset manage req with the primary key. Does not add the asset manage req to the database.
	 *
	 * @param manageReqId the primary key for the new asset manage req
	 * @return the new asset manage req
	 */
	@Override
	public AssetManageReq create(long manageReqId) {
		AssetManageReq assetManageReq = new AssetManageReqImpl();

		assetManageReq.setNew(true);
		assetManageReq.setPrimaryKey(manageReqId);

		return assetManageReq;
	}

	/**
	 * Removes the asset manage req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manageReqId the primary key of the asset manage req
	 * @return the asset manage req that was removed
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqException if a asset manage req with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReq remove(long manageReqId)
		throws NoSuchAssetManageReqException, SystemException {
		return remove((Serializable)manageReqId);
	}

	/**
	 * Removes the asset manage req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the asset manage req
	 * @return the asset manage req that was removed
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqException if a asset manage req with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReq remove(Serializable primaryKey)
		throws NoSuchAssetManageReqException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AssetManageReq assetManageReq = (AssetManageReq)session.get(AssetManageReqImpl.class,
					primaryKey);

			if (assetManageReq == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssetManageReqException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assetManageReq);
		}
		catch (NoSuchAssetManageReqException nsee) {
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
	protected AssetManageReq removeImpl(AssetManageReq assetManageReq)
		throws SystemException {
		assetManageReq = toUnwrappedModel(assetManageReq);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assetManageReq)) {
				assetManageReq = (AssetManageReq)session.get(AssetManageReqImpl.class,
						assetManageReq.getPrimaryKeyObj());
			}

			if (assetManageReq != null) {
				session.delete(assetManageReq);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (assetManageReq != null) {
			clearCache(assetManageReq);
		}

		return assetManageReq;
	}

	@Override
	public AssetManageReq updateImpl(
		com.viettel.ams.core.model.AssetManageReq assetManageReq)
		throws SystemException {
		assetManageReq = toUnwrappedModel(assetManageReq);

		boolean isNew = assetManageReq.isNew();

		Session session = null;

		try {
			session = openSession();

			if (assetManageReq.isNew()) {
				session.save(assetManageReq);

				assetManageReq.setNew(false);
			}
			else {
				session.merge(assetManageReq);
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

		EntityCacheUtil.putResult(AssetManageReqModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqImpl.class, assetManageReq.getPrimaryKey(),
			assetManageReq);

		return assetManageReq;
	}

	protected AssetManageReq toUnwrappedModel(AssetManageReq assetManageReq) {
		if (assetManageReq instanceof AssetManageReqImpl) {
			return assetManageReq;
		}

		AssetManageReqImpl assetManageReqImpl = new AssetManageReqImpl();

		assetManageReqImpl.setNew(assetManageReq.isNew());
		assetManageReqImpl.setPrimaryKey(assetManageReq.getPrimaryKey());

		assetManageReqImpl.setManageReqId(assetManageReq.getManageReqId());
		assetManageReqImpl.setReqGroupId(assetManageReq.getReqGroupId());
		assetManageReqImpl.setUserId(assetManageReq.getUserId());
		assetManageReqImpl.setRecvGroupId(assetManageReq.getRecvGroupId());
		assetManageReqImpl.setCause(assetManageReq.getCause());
		assetManageReqImpl.setCreatorId(assetManageReq.getCreatorId());
		assetManageReqImpl.setCreatedDate(assetManageReq.getCreatedDate());
		assetManageReqImpl.setStatus(assetManageReq.getStatus());
		assetManageReqImpl.setType(assetManageReq.getType());
		assetManageReqImpl.setUsedGroupId(assetManageReq.getUsedGroupId());
		assetManageReqImpl.setCode(assetManageReq.getCode());
		assetManageReqImpl.setAcceptorId(assetManageReq.getAcceptorId());
		assetManageReqImpl.setAcceptComment(assetManageReq.getAcceptComment());
		assetManageReqImpl.setRetrieveCauseId(assetManageReq.getRetrieveCauseId());
		assetManageReqImpl.setConstructId(assetManageReq.getConstructId());
		assetManageReqImpl.setDelegator(assetManageReq.getDelegator());
		assetManageReqImpl.setIsFull(assetManageReq.getIsFull());
		assetManageReqImpl.setTitleDelegator(assetManageReq.getTitleDelegator());
		assetManageReqImpl.setMobileNumber(assetManageReq.getMobileNumber());
		assetManageReqImpl.setDocument(assetManageReq.getDocument());
		assetManageReqImpl.setFailCheckId(assetManageReq.getFailCheckId());
		assetManageReqImpl.setDeliveryNoteId(assetManageReq.getDeliveryNoteId());
		assetManageReqImpl.setIsMaintain(assetManageReq.getIsMaintain());
		assetManageReqImpl.setCauseReject(assetManageReq.getCauseReject());
		assetManageReqImpl.setAssetType(assetManageReq.getAssetType());
		assetManageReqImpl.setRetrieveType(assetManageReq.getRetrieveType());
		assetManageReqImpl.setRetrieveCmdId(assetManageReq.getRetrieveCmdId());
		assetManageReqImpl.setPlanSwapId(assetManageReq.getPlanSwapId());
		assetManageReqImpl.setCertificateRegistrationId(assetManageReq.getCertificateRegistrationId());
		assetManageReqImpl.setContractid(assetManageReq.getContractid());
		assetManageReqImpl.setPartnerId(assetManageReq.getPartnerId());
		assetManageReqImpl.setStatusCa(assetManageReq.getStatusCa());
		assetManageReqImpl.setCommentCa(assetManageReq.getCommentCa());
		assetManageReqImpl.setDocumentCaId(assetManageReq.getDocumentCaId());

		return assetManageReqImpl;
	}

	/**
	 * Returns the asset manage req with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the asset manage req
	 * @return the asset manage req
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqException if a asset manage req with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReq findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssetManageReqException, SystemException {
		AssetManageReq assetManageReq = fetchByPrimaryKey(primaryKey);

		if (assetManageReq == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssetManageReqException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return assetManageReq;
	}

	/**
	 * Returns the asset manage req with the primary key or throws a {@link com.viettel.ams.core.NoSuchAssetManageReqException} if it could not be found.
	 *
	 * @param manageReqId the primary key of the asset manage req
	 * @return the asset manage req
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqException if a asset manage req with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReq findByPrimaryKey(long manageReqId)
		throws NoSuchAssetManageReqException, SystemException {
		return findByPrimaryKey((Serializable)manageReqId);
	}

	/**
	 * Returns the asset manage req with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the asset manage req
	 * @return the asset manage req, or <code>null</code> if a asset manage req with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReq fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AssetManageReq assetManageReq = (AssetManageReq)EntityCacheUtil.getResult(AssetManageReqModelImpl.ENTITY_CACHE_ENABLED,
				AssetManageReqImpl.class, primaryKey);

		if (assetManageReq == _nullAssetManageReq) {
			return null;
		}

		if (assetManageReq == null) {
			Session session = null;

			try {
				session = openSession();

				assetManageReq = (AssetManageReq)session.get(AssetManageReqImpl.class,
						primaryKey);

				if (assetManageReq != null) {
					cacheResult(assetManageReq);
				}
				else {
					EntityCacheUtil.putResult(AssetManageReqModelImpl.ENTITY_CACHE_ENABLED,
						AssetManageReqImpl.class, primaryKey,
						_nullAssetManageReq);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AssetManageReqModelImpl.ENTITY_CACHE_ENABLED,
					AssetManageReqImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return assetManageReq;
	}

	/**
	 * Returns the asset manage req with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manageReqId the primary key of the asset manage req
	 * @return the asset manage req, or <code>null</code> if a asset manage req with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReq fetchByPrimaryKey(long manageReqId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)manageReqId);
	}

	/**
	 * Returns all the asset manage reqs.
	 *
	 * @return the asset manage reqs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssetManageReq> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<AssetManageReq> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<AssetManageReq> findAll(int start, int end,
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

		List<AssetManageReq> list = (List<AssetManageReq>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSETMANAGEREQ);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSETMANAGEREQ;

				if (pagination) {
					sql = sql.concat(AssetManageReqModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AssetManageReq>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssetManageReq>(list);
				}
				else {
					list = (List<AssetManageReq>)QueryUtil.list(q,
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
	 * Removes all the asset manage reqs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AssetManageReq assetManageReq : findAll()) {
			remove(assetManageReq);
		}
	}

	/**
	 * Returns the number of asset manage reqs.
	 *
	 * @return the number of asset manage reqs
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

				Query q = session.createQuery(_SQL_COUNT_ASSETMANAGEREQ);

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
	 * Initializes the asset manage req persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.viettel.ams.core.model.AssetManageReq")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AssetManageReq>> listenersList = new ArrayList<ModelListener<AssetManageReq>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AssetManageReq>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AssetManageReqImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASSETMANAGEREQ = "SELECT assetManageReq FROM AssetManageReq assetManageReq";
	private static final String _SQL_COUNT_ASSETMANAGEREQ = "SELECT COUNT(assetManageReq) FROM AssetManageReq assetManageReq";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assetManageReq.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AssetManageReq exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AssetManageReqPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"manageReqId", "reqGroupId", "userId", "recvGroupId",
				"creatorId", "createdDate", "status", "type", "usedGroupId",
				"code", "acceptorId", "acceptComment", "retrieveCauseId",
				"constructId", "delegator", "isFull", "titleDelegator",
				"mobileNumber", "document", "failCheckId", "deliveryNoteId",
				"isMaintain", "causeReject", "assetType", "retrieveType",
				"retrieveCmdId", "planSwapId", "certificateRegistrationId",
				"contractid", "partnerId", "statusCa", "commentCa",
				"documentCaId"
			});
	private static AssetManageReq _nullAssetManageReq = new AssetManageReqImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AssetManageReq> toCacheModel() {
				return _nullAssetManageReqCacheModel;
			}
		};

	private static CacheModel<AssetManageReq> _nullAssetManageReqCacheModel = new CacheModel<AssetManageReq>() {
			@Override
			public AssetManageReq toEntityModel() {
				return _nullAssetManageReq;
			}
		};
}
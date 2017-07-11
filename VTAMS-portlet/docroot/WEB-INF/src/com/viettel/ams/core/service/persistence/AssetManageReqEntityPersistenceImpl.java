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
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.viettel.ams.core.NoSuchAssetManageReqEntityException;
import com.viettel.ams.core.model.AssetManageReqEntity;
import com.viettel.ams.core.model.impl.AssetManageReqEntityImpl;
import com.viettel.ams.core.model.impl.AssetManageReqEntityModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the asset manage req entity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see AssetManageReqEntityPersistence
 * @see AssetManageReqEntityUtil
 * @generated
 */
public class AssetManageReqEntityPersistenceImpl extends BasePersistenceImpl<AssetManageReqEntity>
	implements AssetManageReqEntityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AssetManageReqEntityUtil} to access the asset manage req entity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AssetManageReqEntityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AssetManageReqEntityModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqEntityModelImpl.FINDER_CACHE_ENABLED,
			AssetManageReqEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AssetManageReqEntityModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqEntityModelImpl.FINDER_CACHE_ENABLED,
			AssetManageReqEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AssetManageReqEntityModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqEntityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSETMANAGEREQ =
		new FinderPath(AssetManageReqEntityModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqEntityModelImpl.FINDER_CACHE_ENABLED,
			AssetManageReqEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAssetManageReq",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETMANAGEREQ =
		new FinderPath(AssetManageReqEntityModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqEntityModelImpl.FINDER_CACHE_ENABLED,
			AssetManageReqEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAssetManageReq",
			new String[] { Long.class.getName() },
			AssetManageReqEntityModelImpl.REQID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSETMANAGEREQ = new FinderPath(AssetManageReqEntityModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqEntityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAssetManageReq",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the asset manage req entities where reqId = &#63;.
	 *
	 * @param reqId the req ID
	 * @return the matching asset manage req entities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssetManageReqEntity> findByAssetManageReq(Long reqId)
		throws SystemException {
		return findByAssetManageReq(reqId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<AssetManageReqEntity> findByAssetManageReq(Long reqId,
		int start, int end) throws SystemException {
		return findByAssetManageReq(reqId, start, end, null);
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
	@Override
	public List<AssetManageReqEntity> findByAssetManageReq(Long reqId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETMANAGEREQ;
			finderArgs = new Object[] { reqId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSETMANAGEREQ;
			finderArgs = new Object[] { reqId, start, end, orderByComparator };
		}

		List<AssetManageReqEntity> list = (List<AssetManageReqEntity>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssetManageReqEntity assetManageReqEntity : list) {
				if (!Validator.equals(reqId, assetManageReqEntity.getReqId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ASSETMANAGEREQENTITY_WHERE);

			query.append(_FINDER_COLUMN_ASSETMANAGEREQ_REQID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssetManageReqEntityModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(reqId.longValue());

				if (!pagination) {
					list = (List<AssetManageReqEntity>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssetManageReqEntity>(list);
				}
				else {
					list = (List<AssetManageReqEntity>)QueryUtil.list(q,
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
	 * Returns the first asset manage req entity in the ordered set where reqId = &#63;.
	 *
	 * @param reqId the req ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset manage req entity
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqEntityException if a matching asset manage req entity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqEntity findByAssetManageReq_First(Long reqId,
		OrderByComparator orderByComparator)
		throws NoSuchAssetManageReqEntityException, SystemException {
		AssetManageReqEntity assetManageReqEntity = fetchByAssetManageReq_First(reqId,
				orderByComparator);

		if (assetManageReqEntity != null) {
			return assetManageReqEntity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("reqId=");
		msg.append(reqId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetManageReqEntityException(msg.toString());
	}

	/**
	 * Returns the first asset manage req entity in the ordered set where reqId = &#63;.
	 *
	 * @param reqId the req ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset manage req entity, or <code>null</code> if a matching asset manage req entity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqEntity fetchByAssetManageReq_First(Long reqId,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssetManageReqEntity> list = findByAssetManageReq(reqId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public AssetManageReqEntity findByAssetManageReq_Last(Long reqId,
		OrderByComparator orderByComparator)
		throws NoSuchAssetManageReqEntityException, SystemException {
		AssetManageReqEntity assetManageReqEntity = fetchByAssetManageReq_Last(reqId,
				orderByComparator);

		if (assetManageReqEntity != null) {
			return assetManageReqEntity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("reqId=");
		msg.append(reqId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssetManageReqEntityException(msg.toString());
	}

	/**
	 * Returns the last asset manage req entity in the ordered set where reqId = &#63;.
	 *
	 * @param reqId the req ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset manage req entity, or <code>null</code> if a matching asset manage req entity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqEntity fetchByAssetManageReq_Last(Long reqId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAssetManageReq(reqId);

		if (count == 0) {
			return null;
		}

		List<AssetManageReqEntity> list = findByAssetManageReq(reqId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public AssetManageReqEntity[] findByAssetManageReq_PrevAndNext(long id,
		Long reqId, OrderByComparator orderByComparator)
		throws NoSuchAssetManageReqEntityException, SystemException {
		AssetManageReqEntity assetManageReqEntity = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssetManageReqEntity[] array = new AssetManageReqEntityImpl[3];

			array[0] = getByAssetManageReq_PrevAndNext(session,
					assetManageReqEntity, reqId, orderByComparator, true);

			array[1] = assetManageReqEntity;

			array[2] = getByAssetManageReq_PrevAndNext(session,
					assetManageReqEntity, reqId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AssetManageReqEntity getByAssetManageReq_PrevAndNext(
		Session session, AssetManageReqEntity assetManageReqEntity, Long reqId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSETMANAGEREQENTITY_WHERE);

		query.append(_FINDER_COLUMN_ASSETMANAGEREQ_REQID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(AssetManageReqEntityModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(reqId.longValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assetManageReqEntity);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssetManageReqEntity> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the asset manage req entities where reqId = &#63; from the database.
	 *
	 * @param reqId the req ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByAssetManageReq(Long reqId) throws SystemException {
		for (AssetManageReqEntity assetManageReqEntity : findByAssetManageReq(
				reqId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assetManageReqEntity);
		}
	}

	/**
	 * Returns the number of asset manage req entities where reqId = &#63;.
	 *
	 * @param reqId the req ID
	 * @return the number of matching asset manage req entities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAssetManageReq(Long reqId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ASSETMANAGEREQ;

		Object[] finderArgs = new Object[] { reqId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ASSETMANAGEREQENTITY_WHERE);

			query.append(_FINDER_COLUMN_ASSETMANAGEREQ_REQID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(reqId.longValue());

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ASSETMANAGEREQ_REQID_2 = "assetManageReqEntity.reqId = ?";

	public AssetManageReqEntityPersistenceImpl() {
		setModelClass(AssetManageReqEntity.class);
	}

	/**
	 * Caches the asset manage req entity in the entity cache if it is enabled.
	 *
	 * @param assetManageReqEntity the asset manage req entity
	 */
	@Override
	public void cacheResult(AssetManageReqEntity assetManageReqEntity) {
		EntityCacheUtil.putResult(AssetManageReqEntityModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqEntityImpl.class,
			assetManageReqEntity.getPrimaryKey(), assetManageReqEntity);

		assetManageReqEntity.resetOriginalValues();
	}

	/**
	 * Caches the asset manage req entities in the entity cache if it is enabled.
	 *
	 * @param assetManageReqEntities the asset manage req entities
	 */
	@Override
	public void cacheResult(List<AssetManageReqEntity> assetManageReqEntities) {
		for (AssetManageReqEntity assetManageReqEntity : assetManageReqEntities) {
			if (EntityCacheUtil.getResult(
						AssetManageReqEntityModelImpl.ENTITY_CACHE_ENABLED,
						AssetManageReqEntityImpl.class,
						assetManageReqEntity.getPrimaryKey()) == null) {
				cacheResult(assetManageReqEntity);
			}
			else {
				assetManageReqEntity.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all asset manage req entities.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AssetManageReqEntityImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AssetManageReqEntityImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the asset manage req entity.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AssetManageReqEntity assetManageReqEntity) {
		EntityCacheUtil.removeResult(AssetManageReqEntityModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqEntityImpl.class, assetManageReqEntity.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AssetManageReqEntity> assetManageReqEntities) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AssetManageReqEntity assetManageReqEntity : assetManageReqEntities) {
			EntityCacheUtil.removeResult(AssetManageReqEntityModelImpl.ENTITY_CACHE_ENABLED,
				AssetManageReqEntityImpl.class,
				assetManageReqEntity.getPrimaryKey());
		}
	}

	/**
	 * Creates a new asset manage req entity with the primary key. Does not add the asset manage req entity to the database.
	 *
	 * @param id the primary key for the new asset manage req entity
	 * @return the new asset manage req entity
	 */
	@Override
	public AssetManageReqEntity create(long id) {
		AssetManageReqEntity assetManageReqEntity = new AssetManageReqEntityImpl();

		assetManageReqEntity.setNew(true);
		assetManageReqEntity.setPrimaryKey(id);

		return assetManageReqEntity;
	}

	/**
	 * Removes the asset manage req entity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the asset manage req entity
	 * @return the asset manage req entity that was removed
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqEntityException if a asset manage req entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqEntity remove(long id)
		throws NoSuchAssetManageReqEntityException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the asset manage req entity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the asset manage req entity
	 * @return the asset manage req entity that was removed
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqEntityException if a asset manage req entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqEntity remove(Serializable primaryKey)
		throws NoSuchAssetManageReqEntityException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AssetManageReqEntity assetManageReqEntity = (AssetManageReqEntity)session.get(AssetManageReqEntityImpl.class,
					primaryKey);

			if (assetManageReqEntity == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssetManageReqEntityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assetManageReqEntity);
		}
		catch (NoSuchAssetManageReqEntityException nsee) {
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
	protected AssetManageReqEntity removeImpl(
		AssetManageReqEntity assetManageReqEntity) throws SystemException {
		assetManageReqEntity = toUnwrappedModel(assetManageReqEntity);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assetManageReqEntity)) {
				assetManageReqEntity = (AssetManageReqEntity)session.get(AssetManageReqEntityImpl.class,
						assetManageReqEntity.getPrimaryKeyObj());
			}

			if (assetManageReqEntity != null) {
				session.delete(assetManageReqEntity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (assetManageReqEntity != null) {
			clearCache(assetManageReqEntity);
		}

		return assetManageReqEntity;
	}

	@Override
	public AssetManageReqEntity updateImpl(
		com.viettel.ams.core.model.AssetManageReqEntity assetManageReqEntity)
		throws SystemException {
		assetManageReqEntity = toUnwrappedModel(assetManageReqEntity);

		boolean isNew = assetManageReqEntity.isNew();

		AssetManageReqEntityModelImpl assetManageReqEntityModelImpl = (AssetManageReqEntityModelImpl)assetManageReqEntity;

		Session session = null;

		try {
			session = openSession();

			if (assetManageReqEntity.isNew()) {
				session.save(assetManageReqEntity);

				assetManageReqEntity.setNew(false);
			}
			else {
				session.merge(assetManageReqEntity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AssetManageReqEntityModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((assetManageReqEntityModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETMANAGEREQ.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assetManageReqEntityModelImpl.getOriginalReqId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSETMANAGEREQ,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETMANAGEREQ,
					args);

				args = new Object[] { assetManageReqEntityModelImpl.getReqId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSETMANAGEREQ,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETMANAGEREQ,
					args);
			}
		}

		EntityCacheUtil.putResult(AssetManageReqEntityModelImpl.ENTITY_CACHE_ENABLED,
			AssetManageReqEntityImpl.class,
			assetManageReqEntity.getPrimaryKey(), assetManageReqEntity);

		return assetManageReqEntity;
	}

	protected AssetManageReqEntity toUnwrappedModel(
		AssetManageReqEntity assetManageReqEntity) {
		if (assetManageReqEntity instanceof AssetManageReqEntityImpl) {
			return assetManageReqEntity;
		}

		AssetManageReqEntityImpl assetManageReqEntityImpl = new AssetManageReqEntityImpl();

		assetManageReqEntityImpl.setNew(assetManageReqEntity.isNew());
		assetManageReqEntityImpl.setPrimaryKey(assetManageReqEntity.getPrimaryKey());

		assetManageReqEntityImpl.setId(assetManageReqEntity.getId());
		assetManageReqEntityImpl.setReqId(assetManageReqEntity.getReqId());
		assetManageReqEntityImpl.setMerEntityId(assetManageReqEntity.getMerEntityId());
		assetManageReqEntityImpl.setStationId(assetManageReqEntity.getStationId());
		assetManageReqEntityImpl.setFailDate(assetManageReqEntity.getFailDate());
		assetManageReqEntityImpl.setFailReason(assetManageReqEntity.getFailReason());
		assetManageReqEntityImpl.setUsedDate(assetManageReqEntity.getUsedDate());
		assetManageReqEntityImpl.setPreStatusId(assetManageReqEntity.getPreStatusId());
		assetManageReqEntityImpl.setGroupId(assetManageReqEntity.getGroupId());
		assetManageReqEntityImpl.setQuantity(assetManageReqEntity.getQuantity());
		assetManageReqEntityImpl.setDescription(assetManageReqEntity.getDescription());
		assetManageReqEntityImpl.setUnitPrice(assetManageReqEntity.getUnitPrice());
		assetManageReqEntityImpl.setTimeRetrieve(assetManageReqEntity.getTimeRetrieve());
		assetManageReqEntityImpl.setConstructionId(assetManageReqEntity.getConstructionId());
		assetManageReqEntityImpl.setConditionerId(assetManageReqEntity.getConditionerId());
		assetManageReqEntityImpl.setCatGroupMerId(assetManageReqEntity.getCatGroupMerId());
		assetManageReqEntityImpl.setUpgradeParentId(assetManageReqEntity.getUpgradeParentId());
		assetManageReqEntityImpl.setPartnerId(assetManageReqEntity.getPartnerId());
		assetManageReqEntityImpl.setDeliveryNoteId(assetManageReqEntity.getDeliveryNoteId());

		return assetManageReqEntityImpl;
	}

	/**
	 * Returns the asset manage req entity with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the asset manage req entity
	 * @return the asset manage req entity
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqEntityException if a asset manage req entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqEntity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssetManageReqEntityException, SystemException {
		AssetManageReqEntity assetManageReqEntity = fetchByPrimaryKey(primaryKey);

		if (assetManageReqEntity == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssetManageReqEntityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return assetManageReqEntity;
	}

	/**
	 * Returns the asset manage req entity with the primary key or throws a {@link com.viettel.ams.core.NoSuchAssetManageReqEntityException} if it could not be found.
	 *
	 * @param id the primary key of the asset manage req entity
	 * @return the asset manage req entity
	 * @throws com.viettel.ams.core.NoSuchAssetManageReqEntityException if a asset manage req entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqEntity findByPrimaryKey(long id)
		throws NoSuchAssetManageReqEntityException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the asset manage req entity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the asset manage req entity
	 * @return the asset manage req entity, or <code>null</code> if a asset manage req entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqEntity fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AssetManageReqEntity assetManageReqEntity = (AssetManageReqEntity)EntityCacheUtil.getResult(AssetManageReqEntityModelImpl.ENTITY_CACHE_ENABLED,
				AssetManageReqEntityImpl.class, primaryKey);

		if (assetManageReqEntity == _nullAssetManageReqEntity) {
			return null;
		}

		if (assetManageReqEntity == null) {
			Session session = null;

			try {
				session = openSession();

				assetManageReqEntity = (AssetManageReqEntity)session.get(AssetManageReqEntityImpl.class,
						primaryKey);

				if (assetManageReqEntity != null) {
					cacheResult(assetManageReqEntity);
				}
				else {
					EntityCacheUtil.putResult(AssetManageReqEntityModelImpl.ENTITY_CACHE_ENABLED,
						AssetManageReqEntityImpl.class, primaryKey,
						_nullAssetManageReqEntity);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AssetManageReqEntityModelImpl.ENTITY_CACHE_ENABLED,
					AssetManageReqEntityImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return assetManageReqEntity;
	}

	/**
	 * Returns the asset manage req entity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the asset manage req entity
	 * @return the asset manage req entity, or <code>null</code> if a asset manage req entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssetManageReqEntity fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the asset manage req entities.
	 *
	 * @return the asset manage req entities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssetManageReqEntity> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<AssetManageReqEntity> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<AssetManageReqEntity> findAll(int start, int end,
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

		List<AssetManageReqEntity> list = (List<AssetManageReqEntity>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSETMANAGEREQENTITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSETMANAGEREQENTITY;

				if (pagination) {
					sql = sql.concat(AssetManageReqEntityModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AssetManageReqEntity>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssetManageReqEntity>(list);
				}
				else {
					list = (List<AssetManageReqEntity>)QueryUtil.list(q,
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
	 * Removes all the asset manage req entities from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AssetManageReqEntity assetManageReqEntity : findAll()) {
			remove(assetManageReqEntity);
		}
	}

	/**
	 * Returns the number of asset manage req entities.
	 *
	 * @return the number of asset manage req entities
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

				Query q = session.createQuery(_SQL_COUNT_ASSETMANAGEREQENTITY);

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
	 * Initializes the asset manage req entity persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.viettel.ams.core.model.AssetManageReqEntity")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AssetManageReqEntity>> listenersList = new ArrayList<ModelListener<AssetManageReqEntity>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AssetManageReqEntity>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AssetManageReqEntityImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASSETMANAGEREQENTITY = "SELECT assetManageReqEntity FROM AssetManageReqEntity assetManageReqEntity";
	private static final String _SQL_SELECT_ASSETMANAGEREQENTITY_WHERE = "SELECT assetManageReqEntity FROM AssetManageReqEntity assetManageReqEntity WHERE ";
	private static final String _SQL_COUNT_ASSETMANAGEREQENTITY = "SELECT COUNT(assetManageReqEntity) FROM AssetManageReqEntity assetManageReqEntity";
	private static final String _SQL_COUNT_ASSETMANAGEREQENTITY_WHERE = "SELECT COUNT(assetManageReqEntity) FROM AssetManageReqEntity assetManageReqEntity WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assetManageReqEntity.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AssetManageReqEntity exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AssetManageReqEntity exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AssetManageReqEntityPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "reqId", "merEntityId", "stationId", "failDate",
				"failReason", "usedDate", "preStatusId", "groupId", "quantity",
				"description", "unitPrice", "timeRetrieve", "constructionId",
				"conditionerId", "catGroupMerId", "upgradeParentId", "partnerId",
				"deliveryNoteId"
			});
	private static AssetManageReqEntity _nullAssetManageReqEntity = new AssetManageReqEntityImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AssetManageReqEntity> toCacheModel() {
				return _nullAssetManageReqEntityCacheModel;
			}
		};

	private static CacheModel<AssetManageReqEntity> _nullAssetManageReqEntityCacheModel =
		new CacheModel<AssetManageReqEntity>() {
			@Override
			public AssetManageReqEntity toEntityModel() {
				return _nullAssetManageReqEntity;
			}
		};
}
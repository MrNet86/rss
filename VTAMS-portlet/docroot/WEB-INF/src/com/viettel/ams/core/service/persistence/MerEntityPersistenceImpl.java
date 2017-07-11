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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.viettel.ams.core.NoSuchMerEntityException;
import com.viettel.ams.core.model.MerEntity;
import com.viettel.ams.core.model.impl.MerEntityImpl;
import com.viettel.ams.core.model.impl.MerEntityModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mer entity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see MerEntityPersistence
 * @see MerEntityUtil
 * @generated
 */
public class MerEntityPersistenceImpl extends BasePersistenceImpl<MerEntity>
	implements MerEntityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MerEntityUtil} to access the mer entity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MerEntityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MerEntityModelImpl.ENTITY_CACHE_ENABLED,
			MerEntityModelImpl.FINDER_CACHE_ENABLED, MerEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MerEntityModelImpl.ENTITY_CACHE_ENABLED,
			MerEntityModelImpl.FINDER_CACHE_ENABLED, MerEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MerEntityModelImpl.ENTITY_CACHE_ENABLED,
			MerEntityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MERENTITYID =
		new FinderPath(MerEntityModelImpl.ENTITY_CACHE_ENABLED,
			MerEntityModelImpl.FINDER_CACHE_ENABLED, MerEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBymerEntityId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MERENTITYID =
		new FinderPath(MerEntityModelImpl.ENTITY_CACHE_ENABLED,
			MerEntityModelImpl.FINDER_CACHE_ENABLED, MerEntityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBymerEntityId",
			new String[] { Long.class.getName() },
			MerEntityModelImpl.MERENTITYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MERENTITYID = new FinderPath(MerEntityModelImpl.ENTITY_CACHE_ENABLED,
			MerEntityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBymerEntityId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the mer entities where merEntityId = &#63;.
	 *
	 * @param merEntityId the mer entity ID
	 * @return the matching mer entities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MerEntity> findBymerEntityId(long merEntityId)
		throws SystemException {
		return findBymerEntityId(merEntityId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mer entities where merEntityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.MerEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param merEntityId the mer entity ID
	 * @param start the lower bound of the range of mer entities
	 * @param end the upper bound of the range of mer entities (not inclusive)
	 * @return the range of matching mer entities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MerEntity> findBymerEntityId(long merEntityId, int start,
		int end) throws SystemException {
		return findBymerEntityId(merEntityId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mer entities where merEntityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.MerEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param merEntityId the mer entity ID
	 * @param start the lower bound of the range of mer entities
	 * @param end the upper bound of the range of mer entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mer entities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MerEntity> findBymerEntityId(long merEntityId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MERENTITYID;
			finderArgs = new Object[] { merEntityId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MERENTITYID;
			finderArgs = new Object[] { merEntityId, start, end, orderByComparator };
		}

		List<MerEntity> list = (List<MerEntity>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MerEntity merEntity : list) {
				if ((merEntityId != merEntity.getMerEntityId())) {
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

			query.append(_SQL_SELECT_MERENTITY_WHERE);

			query.append(_FINDER_COLUMN_MERENTITYID_MERENTITYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MerEntityModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(merEntityId);

				if (!pagination) {
					list = (List<MerEntity>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MerEntity>(list);
				}
				else {
					list = (List<MerEntity>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first mer entity in the ordered set where merEntityId = &#63;.
	 *
	 * @param merEntityId the mer entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mer entity
	 * @throws com.viettel.ams.core.NoSuchMerEntityException if a matching mer entity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MerEntity findBymerEntityId_First(long merEntityId,
		OrderByComparator orderByComparator)
		throws NoSuchMerEntityException, SystemException {
		MerEntity merEntity = fetchBymerEntityId_First(merEntityId,
				orderByComparator);

		if (merEntity != null) {
			return merEntity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("merEntityId=");
		msg.append(merEntityId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMerEntityException(msg.toString());
	}

	/**
	 * Returns the first mer entity in the ordered set where merEntityId = &#63;.
	 *
	 * @param merEntityId the mer entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mer entity, or <code>null</code> if a matching mer entity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MerEntity fetchBymerEntityId_First(long merEntityId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MerEntity> list = findBymerEntityId(merEntityId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mer entity in the ordered set where merEntityId = &#63;.
	 *
	 * @param merEntityId the mer entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mer entity
	 * @throws com.viettel.ams.core.NoSuchMerEntityException if a matching mer entity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MerEntity findBymerEntityId_Last(long merEntityId,
		OrderByComparator orderByComparator)
		throws NoSuchMerEntityException, SystemException {
		MerEntity merEntity = fetchBymerEntityId_Last(merEntityId,
				orderByComparator);

		if (merEntity != null) {
			return merEntity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("merEntityId=");
		msg.append(merEntityId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMerEntityException(msg.toString());
	}

	/**
	 * Returns the last mer entity in the ordered set where merEntityId = &#63;.
	 *
	 * @param merEntityId the mer entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mer entity, or <code>null</code> if a matching mer entity could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MerEntity fetchBymerEntityId_Last(long merEntityId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBymerEntityId(merEntityId);

		if (count == 0) {
			return null;
		}

		List<MerEntity> list = findBymerEntityId(merEntityId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the mer entities where merEntityId = &#63; from the database.
	 *
	 * @param merEntityId the mer entity ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBymerEntityId(long merEntityId) throws SystemException {
		for (MerEntity merEntity : findBymerEntityId(merEntityId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(merEntity);
		}
	}

	/**
	 * Returns the number of mer entities where merEntityId = &#63;.
	 *
	 * @param merEntityId the mer entity ID
	 * @return the number of matching mer entities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBymerEntityId(long merEntityId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MERENTITYID;

		Object[] finderArgs = new Object[] { merEntityId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MERENTITY_WHERE);

			query.append(_FINDER_COLUMN_MERENTITYID_MERENTITYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(merEntityId);

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

	private static final String _FINDER_COLUMN_MERENTITYID_MERENTITYID_2 = "merEntity.merEntityId = ?";

	public MerEntityPersistenceImpl() {
		setModelClass(MerEntity.class);
	}

	/**
	 * Caches the mer entity in the entity cache if it is enabled.
	 *
	 * @param merEntity the mer entity
	 */
	@Override
	public void cacheResult(MerEntity merEntity) {
		EntityCacheUtil.putResult(MerEntityModelImpl.ENTITY_CACHE_ENABLED,
			MerEntityImpl.class, merEntity.getPrimaryKey(), merEntity);

		merEntity.resetOriginalValues();
	}

	/**
	 * Caches the mer entities in the entity cache if it is enabled.
	 *
	 * @param merEntities the mer entities
	 */
	@Override
	public void cacheResult(List<MerEntity> merEntities) {
		for (MerEntity merEntity : merEntities) {
			if (EntityCacheUtil.getResult(
						MerEntityModelImpl.ENTITY_CACHE_ENABLED,
						MerEntityImpl.class, merEntity.getPrimaryKey()) == null) {
				cacheResult(merEntity);
			}
			else {
				merEntity.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mer entities.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MerEntityImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MerEntityImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mer entity.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MerEntity merEntity) {
		EntityCacheUtil.removeResult(MerEntityModelImpl.ENTITY_CACHE_ENABLED,
			MerEntityImpl.class, merEntity.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MerEntity> merEntities) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MerEntity merEntity : merEntities) {
			EntityCacheUtil.removeResult(MerEntityModelImpl.ENTITY_CACHE_ENABLED,
				MerEntityImpl.class, merEntity.getPrimaryKey());
		}
	}

	/**
	 * Creates a new mer entity with the primary key. Does not add the mer entity to the database.
	 *
	 * @param merEntityId the primary key for the new mer entity
	 * @return the new mer entity
	 */
	@Override
	public MerEntity create(long merEntityId) {
		MerEntity merEntity = new MerEntityImpl();

		merEntity.setNew(true);
		merEntity.setPrimaryKey(merEntityId);

		return merEntity;
	}

	/**
	 * Removes the mer entity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param merEntityId the primary key of the mer entity
	 * @return the mer entity that was removed
	 * @throws com.viettel.ams.core.NoSuchMerEntityException if a mer entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MerEntity remove(long merEntityId)
		throws NoSuchMerEntityException, SystemException {
		return remove((Serializable)merEntityId);
	}

	/**
	 * Removes the mer entity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mer entity
	 * @return the mer entity that was removed
	 * @throws com.viettel.ams.core.NoSuchMerEntityException if a mer entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MerEntity remove(Serializable primaryKey)
		throws NoSuchMerEntityException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MerEntity merEntity = (MerEntity)session.get(MerEntityImpl.class,
					primaryKey);

			if (merEntity == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMerEntityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(merEntity);
		}
		catch (NoSuchMerEntityException nsee) {
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
	protected MerEntity removeImpl(MerEntity merEntity)
		throws SystemException {
		merEntity = toUnwrappedModel(merEntity);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(merEntity)) {
				merEntity = (MerEntity)session.get(MerEntityImpl.class,
						merEntity.getPrimaryKeyObj());
			}

			if (merEntity != null) {
				session.delete(merEntity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (merEntity != null) {
			clearCache(merEntity);
		}

		return merEntity;
	}

	@Override
	public MerEntity updateImpl(com.viettel.ams.core.model.MerEntity merEntity)
		throws SystemException {
		merEntity = toUnwrappedModel(merEntity);

		boolean isNew = merEntity.isNew();

		MerEntityModelImpl merEntityModelImpl = (MerEntityModelImpl)merEntity;

		Session session = null;

		try {
			session = openSession();

			if (merEntity.isNew()) {
				session.save(merEntity);

				merEntity.setNew(false);
			}
			else {
				session.merge(merEntity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MerEntityModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((merEntityModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MERENTITYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						merEntityModelImpl.getOriginalMerEntityId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MERENTITYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MERENTITYID,
					args);

				args = new Object[] { merEntityModelImpl.getMerEntityId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MERENTITYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MERENTITYID,
					args);
			}
		}

		EntityCacheUtil.putResult(MerEntityModelImpl.ENTITY_CACHE_ENABLED,
			MerEntityImpl.class, merEntity.getPrimaryKey(), merEntity);

		return merEntity;
	}

	protected MerEntity toUnwrappedModel(MerEntity merEntity) {
		if (merEntity instanceof MerEntityImpl) {
			return merEntity;
		}

		MerEntityImpl merEntityImpl = new MerEntityImpl();

		merEntityImpl.setNew(merEntity.isNew());
		merEntityImpl.setPrimaryKey(merEntity.getPrimaryKey());

		merEntityImpl.setMerEntityId(merEntity.getMerEntityId());
		merEntityImpl.setSerialNumber(merEntity.getSerialNumber());
		merEntityImpl.setUnitPrice(merEntity.getUnitPrice());
		merEntityImpl.setMerId(merEntity.getMerId());
		merEntityImpl.setContractid(merEntity.getContractid());
		merEntityImpl.setGroupId(merEntity.getGroupId());
		merEntityImpl.setWarehouseId(merEntity.getWarehouseId());
		merEntityImpl.setConstructionId(merEntity.getConstructionId());
		merEntityImpl.setIsMerchandise(merEntity.getIsMerchandise());
		merEntityImpl.setStatusId(merEntity.getStatusId());
		merEntityImpl.setParentId(merEntity.getParentId());
		merEntityImpl.setUserId(merEntity.getUserId());
		merEntityImpl.setUpgradeParentId(merEntity.getUpgradeParentId());
		merEntityImpl.setPartNumber(merEntity.getPartNumber());
		merEntityImpl.setCount(merEntity.getCount());
		merEntityImpl.setIsTemp(merEntity.getIsTemp());
		merEntityImpl.setPath(merEntity.getPath());
		merEntityImpl.setOriginalPrice(merEntity.getOriginalPrice());
		merEntityImpl.setManagerName(merEntity.getManagerName());
		merEntityImpl.setIsExpense(merEntity.getIsExpense());
		merEntityImpl.setUseGroupId(merEntity.getUseGroupId());
		merEntityImpl.setKeySearch(merEntity.getKeySearch());
		merEntityImpl.setContractCode(merEntity.getContractCode());
		merEntityImpl.setDescription(merEntity.getDescription());
		merEntityImpl.setStationId(merEntity.getStationId());
		merEntityImpl.setIsInventory(merEntity.getIsInventory());
		merEntityImpl.setEntityType(merEntity.getEntityType());
		merEntityImpl.setQuality(merEntity.getQuality());
		merEntityImpl.setCatEmployeeId(merEntity.getCatEmployeeId());
		merEntityImpl.setCreatedDate(merEntity.getCreatedDate());
		merEntityImpl.setIsLock(merEntity.getIsLock());

		return merEntityImpl;
	}

	/**
	 * Returns the mer entity with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mer entity
	 * @return the mer entity
	 * @throws com.viettel.ams.core.NoSuchMerEntityException if a mer entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MerEntity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMerEntityException, SystemException {
		MerEntity merEntity = fetchByPrimaryKey(primaryKey);

		if (merEntity == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMerEntityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return merEntity;
	}

	/**
	 * Returns the mer entity with the primary key or throws a {@link com.viettel.ams.core.NoSuchMerEntityException} if it could not be found.
	 *
	 * @param merEntityId the primary key of the mer entity
	 * @return the mer entity
	 * @throws com.viettel.ams.core.NoSuchMerEntityException if a mer entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MerEntity findByPrimaryKey(long merEntityId)
		throws NoSuchMerEntityException, SystemException {
		return findByPrimaryKey((Serializable)merEntityId);
	}

	/**
	 * Returns the mer entity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mer entity
	 * @return the mer entity, or <code>null</code> if a mer entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MerEntity fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MerEntity merEntity = (MerEntity)EntityCacheUtil.getResult(MerEntityModelImpl.ENTITY_CACHE_ENABLED,
				MerEntityImpl.class, primaryKey);

		if (merEntity == _nullMerEntity) {
			return null;
		}

		if (merEntity == null) {
			Session session = null;

			try {
				session = openSession();

				merEntity = (MerEntity)session.get(MerEntityImpl.class,
						primaryKey);

				if (merEntity != null) {
					cacheResult(merEntity);
				}
				else {
					EntityCacheUtil.putResult(MerEntityModelImpl.ENTITY_CACHE_ENABLED,
						MerEntityImpl.class, primaryKey, _nullMerEntity);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MerEntityModelImpl.ENTITY_CACHE_ENABLED,
					MerEntityImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return merEntity;
	}

	/**
	 * Returns the mer entity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param merEntityId the primary key of the mer entity
	 * @return the mer entity, or <code>null</code> if a mer entity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MerEntity fetchByPrimaryKey(long merEntityId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)merEntityId);
	}

	/**
	 * Returns all the mer entities.
	 *
	 * @return the mer entities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MerEntity> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mer entities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.MerEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mer entities
	 * @param end the upper bound of the range of mer entities (not inclusive)
	 * @return the range of mer entities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MerEntity> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mer entities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.MerEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mer entities
	 * @param end the upper bound of the range of mer entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mer entities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MerEntity> findAll(int start, int end,
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

		List<MerEntity> list = (List<MerEntity>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MERENTITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MERENTITY;

				if (pagination) {
					sql = sql.concat(MerEntityModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MerEntity>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MerEntity>(list);
				}
				else {
					list = (List<MerEntity>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the mer entities from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MerEntity merEntity : findAll()) {
			remove(merEntity);
		}
	}

	/**
	 * Returns the number of mer entities.
	 *
	 * @return the number of mer entities
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

				Query q = session.createQuery(_SQL_COUNT_MERENTITY);

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
	 * Initializes the mer entity persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.viettel.ams.core.model.MerEntity")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MerEntity>> listenersList = new ArrayList<ModelListener<MerEntity>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MerEntity>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MerEntityImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MERENTITY = "SELECT merEntity FROM MerEntity merEntity";
	private static final String _SQL_SELECT_MERENTITY_WHERE = "SELECT merEntity FROM MerEntity merEntity WHERE ";
	private static final String _SQL_COUNT_MERENTITY = "SELECT COUNT(merEntity) FROM MerEntity merEntity";
	private static final String _SQL_COUNT_MERENTITY_WHERE = "SELECT COUNT(merEntity) FROM MerEntity merEntity WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "merEntity.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MerEntity exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MerEntity exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MerEntityPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"merEntityId", "serialNumber", "unitPrice", "merId",
				"contractid", "groupId", "warehouseId", "constructionId",
				"isMerchandise", "statusId", "parentId", "userId",
				"upgradeParentId", "partNumber", "count", "isTemp", "path",
				"originalPrice", "managerName", "isExpense", "useGroupId",
				"keySearch", "contractCode", "description", "stationId",
				"isInventory", "entityType", "quality", "catEmployeeId",
				"createdDate", "isLock"
			});
	private static MerEntity _nullMerEntity = new MerEntityImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MerEntity> toCacheModel() {
				return _nullMerEntityCacheModel;
			}
		};

	private static CacheModel<MerEntity> _nullMerEntityCacheModel = new CacheModel<MerEntity>() {
			@Override
			public MerEntity toEntityModel() {
				return _nullMerEntity;
			}
		};
}
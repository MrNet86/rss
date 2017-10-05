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

package com.vnpt.portlet.user.service.persistence;

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

import com.vnpt.portlet.user.NoSuchLiferayDatabaseException;
import com.vnpt.portlet.user.model.LiferayDatabase;
import com.vnpt.portlet.user.model.impl.LiferayDatabaseImpl;
import com.vnpt.portlet.user.model.impl.LiferayDatabaseModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the liferay database service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see LiferayDatabasePersistence
 * @see LiferayDatabaseUtil
 * @generated
 */
public class LiferayDatabasePersistenceImpl extends BasePersistenceImpl<LiferayDatabase>
	implements LiferayDatabasePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LiferayDatabaseUtil} to access the liferay database persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LiferayDatabaseImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LiferayDatabaseModelImpl.ENTITY_CACHE_ENABLED,
			LiferayDatabaseModelImpl.FINDER_CACHE_ENABLED,
			LiferayDatabaseImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LiferayDatabaseModelImpl.ENTITY_CACHE_ENABLED,
			LiferayDatabaseModelImpl.FINDER_CACHE_ENABLED,
			LiferayDatabaseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LiferayDatabaseModelImpl.ENTITY_CACHE_ENABLED,
			LiferayDatabaseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ITEMID = new FinderPath(LiferayDatabaseModelImpl.ENTITY_CACHE_ENABLED,
			LiferayDatabaseModelImpl.FINDER_CACHE_ENABLED,
			LiferayDatabaseImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByItemId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMID =
		new FinderPath(LiferayDatabaseModelImpl.ENTITY_CACHE_ENABLED,
			LiferayDatabaseModelImpl.FINDER_CACHE_ENABLED,
			LiferayDatabaseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByItemId",
			new String[] { Long.class.getName() },
			LiferayDatabaseModelImpl.ITEMID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ITEMID = new FinderPath(LiferayDatabaseModelImpl.ENTITY_CACHE_ENABLED,
			LiferayDatabaseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByItemId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the liferay databases where itemId = &#63;.
	 *
	 * @param itemId the item ID
	 * @return the matching liferay databases
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LiferayDatabase> findByItemId(long itemId)
		throws SystemException {
		return findByItemId(itemId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the liferay databases where itemId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.LiferayDatabaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param itemId the item ID
	 * @param start the lower bound of the range of liferay databases
	 * @param end the upper bound of the range of liferay databases (not inclusive)
	 * @return the range of matching liferay databases
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LiferayDatabase> findByItemId(long itemId, int start, int end)
		throws SystemException {
		return findByItemId(itemId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the liferay databases where itemId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.LiferayDatabaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param itemId the item ID
	 * @param start the lower bound of the range of liferay databases
	 * @param end the upper bound of the range of liferay databases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching liferay databases
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LiferayDatabase> findByItemId(long itemId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMID;
			finderArgs = new Object[] { itemId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ITEMID;
			finderArgs = new Object[] { itemId, start, end, orderByComparator };
		}

		List<LiferayDatabase> list = (List<LiferayDatabase>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (LiferayDatabase liferayDatabase : list) {
				if ((itemId != liferayDatabase.getItemId())) {
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

			query.append(_SQL_SELECT_LIFERAYDATABASE_WHERE);

			query.append(_FINDER_COLUMN_ITEMID_ITEMID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(LiferayDatabaseModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(itemId);

				if (!pagination) {
					list = (List<LiferayDatabase>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LiferayDatabase>(list);
				}
				else {
					list = (List<LiferayDatabase>)QueryUtil.list(q,
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
	 * Returns the first liferay database in the ordered set where itemId = &#63;.
	 *
	 * @param itemId the item ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay database
	 * @throws com.vnpt.portlet.user.NoSuchLiferayDatabaseException if a matching liferay database could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayDatabase findByItemId_First(long itemId,
		OrderByComparator orderByComparator)
		throws NoSuchLiferayDatabaseException, SystemException {
		LiferayDatabase liferayDatabase = fetchByItemId_First(itemId,
				orderByComparator);

		if (liferayDatabase != null) {
			return liferayDatabase;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("itemId=");
		msg.append(itemId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLiferayDatabaseException(msg.toString());
	}

	/**
	 * Returns the first liferay database in the ordered set where itemId = &#63;.
	 *
	 * @param itemId the item ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay database, or <code>null</code> if a matching liferay database could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayDatabase fetchByItemId_First(long itemId,
		OrderByComparator orderByComparator) throws SystemException {
		List<LiferayDatabase> list = findByItemId(itemId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last liferay database in the ordered set where itemId = &#63;.
	 *
	 * @param itemId the item ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay database
	 * @throws com.vnpt.portlet.user.NoSuchLiferayDatabaseException if a matching liferay database could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayDatabase findByItemId_Last(long itemId,
		OrderByComparator orderByComparator)
		throws NoSuchLiferayDatabaseException, SystemException {
		LiferayDatabase liferayDatabase = fetchByItemId_Last(itemId,
				orderByComparator);

		if (liferayDatabase != null) {
			return liferayDatabase;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("itemId=");
		msg.append(itemId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchLiferayDatabaseException(msg.toString());
	}

	/**
	 * Returns the last liferay database in the ordered set where itemId = &#63;.
	 *
	 * @param itemId the item ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay database, or <code>null</code> if a matching liferay database could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayDatabase fetchByItemId_Last(long itemId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByItemId(itemId);

		if (count == 0) {
			return null;
		}

		List<LiferayDatabase> list = findByItemId(itemId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the liferay databases before and after the current liferay database in the ordered set where itemId = &#63;.
	 *
	 * @param itemFieldId the primary key of the current liferay database
	 * @param itemId the item ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next liferay database
	 * @throws com.vnpt.portlet.user.NoSuchLiferayDatabaseException if a liferay database with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayDatabase[] findByItemId_PrevAndNext(long itemFieldId,
		long itemId, OrderByComparator orderByComparator)
		throws NoSuchLiferayDatabaseException, SystemException {
		LiferayDatabase liferayDatabase = findByPrimaryKey(itemFieldId);

		Session session = null;

		try {
			session = openSession();

			LiferayDatabase[] array = new LiferayDatabaseImpl[3];

			array[0] = getByItemId_PrevAndNext(session, liferayDatabase,
					itemId, orderByComparator, true);

			array[1] = liferayDatabase;

			array[2] = getByItemId_PrevAndNext(session, liferayDatabase,
					itemId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LiferayDatabase getByItemId_PrevAndNext(Session session,
		LiferayDatabase liferayDatabase, long itemId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LIFERAYDATABASE_WHERE);

		query.append(_FINDER_COLUMN_ITEMID_ITEMID_2);

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
			query.append(LiferayDatabaseModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(itemId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(liferayDatabase);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LiferayDatabase> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the liferay databases where itemId = &#63; from the database.
	 *
	 * @param itemId the item ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByItemId(long itemId) throws SystemException {
		for (LiferayDatabase liferayDatabase : findByItemId(itemId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(liferayDatabase);
		}
	}

	/**
	 * Returns the number of liferay databases where itemId = &#63;.
	 *
	 * @param itemId the item ID
	 * @return the number of matching liferay databases
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByItemId(long itemId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ITEMID;

		Object[] finderArgs = new Object[] { itemId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LIFERAYDATABASE_WHERE);

			query.append(_FINDER_COLUMN_ITEMID_ITEMID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(itemId);

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

	private static final String _FINDER_COLUMN_ITEMID_ITEMID_2 = "liferayDatabase.itemId = ?";

	public LiferayDatabasePersistenceImpl() {
		setModelClass(LiferayDatabase.class);
	}

	/**
	 * Caches the liferay database in the entity cache if it is enabled.
	 *
	 * @param liferayDatabase the liferay database
	 */
	@Override
	public void cacheResult(LiferayDatabase liferayDatabase) {
		EntityCacheUtil.putResult(LiferayDatabaseModelImpl.ENTITY_CACHE_ENABLED,
			LiferayDatabaseImpl.class, liferayDatabase.getPrimaryKey(),
			liferayDatabase);

		liferayDatabase.resetOriginalValues();
	}

	/**
	 * Caches the liferay databases in the entity cache if it is enabled.
	 *
	 * @param liferayDatabases the liferay databases
	 */
	@Override
	public void cacheResult(List<LiferayDatabase> liferayDatabases) {
		for (LiferayDatabase liferayDatabase : liferayDatabases) {
			if (EntityCacheUtil.getResult(
						LiferayDatabaseModelImpl.ENTITY_CACHE_ENABLED,
						LiferayDatabaseImpl.class,
						liferayDatabase.getPrimaryKey()) == null) {
				cacheResult(liferayDatabase);
			}
			else {
				liferayDatabase.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all liferay databases.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LiferayDatabaseImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LiferayDatabaseImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the liferay database.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LiferayDatabase liferayDatabase) {
		EntityCacheUtil.removeResult(LiferayDatabaseModelImpl.ENTITY_CACHE_ENABLED,
			LiferayDatabaseImpl.class, liferayDatabase.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LiferayDatabase> liferayDatabases) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LiferayDatabase liferayDatabase : liferayDatabases) {
			EntityCacheUtil.removeResult(LiferayDatabaseModelImpl.ENTITY_CACHE_ENABLED,
				LiferayDatabaseImpl.class, liferayDatabase.getPrimaryKey());
		}
	}

	/**
	 * Creates a new liferay database with the primary key. Does not add the liferay database to the database.
	 *
	 * @param itemFieldId the primary key for the new liferay database
	 * @return the new liferay database
	 */
	@Override
	public LiferayDatabase create(long itemFieldId) {
		LiferayDatabase liferayDatabase = new LiferayDatabaseImpl();

		liferayDatabase.setNew(true);
		liferayDatabase.setPrimaryKey(itemFieldId);

		return liferayDatabase;
	}

	/**
	 * Removes the liferay database with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemFieldId the primary key of the liferay database
	 * @return the liferay database that was removed
	 * @throws com.vnpt.portlet.user.NoSuchLiferayDatabaseException if a liferay database with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayDatabase remove(long itemFieldId)
		throws NoSuchLiferayDatabaseException, SystemException {
		return remove((Serializable)itemFieldId);
	}

	/**
	 * Removes the liferay database with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the liferay database
	 * @return the liferay database that was removed
	 * @throws com.vnpt.portlet.user.NoSuchLiferayDatabaseException if a liferay database with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayDatabase remove(Serializable primaryKey)
		throws NoSuchLiferayDatabaseException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LiferayDatabase liferayDatabase = (LiferayDatabase)session.get(LiferayDatabaseImpl.class,
					primaryKey);

			if (liferayDatabase == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLiferayDatabaseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(liferayDatabase);
		}
		catch (NoSuchLiferayDatabaseException nsee) {
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
	protected LiferayDatabase removeImpl(LiferayDatabase liferayDatabase)
		throws SystemException {
		liferayDatabase = toUnwrappedModel(liferayDatabase);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(liferayDatabase)) {
				liferayDatabase = (LiferayDatabase)session.get(LiferayDatabaseImpl.class,
						liferayDatabase.getPrimaryKeyObj());
			}

			if (liferayDatabase != null) {
				session.delete(liferayDatabase);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (liferayDatabase != null) {
			clearCache(liferayDatabase);
		}

		return liferayDatabase;
	}

	@Override
	public LiferayDatabase updateImpl(
		com.vnpt.portlet.user.model.LiferayDatabase liferayDatabase)
		throws SystemException {
		liferayDatabase = toUnwrappedModel(liferayDatabase);

		boolean isNew = liferayDatabase.isNew();

		LiferayDatabaseModelImpl liferayDatabaseModelImpl = (LiferayDatabaseModelImpl)liferayDatabase;

		Session session = null;

		try {
			session = openSession();

			if (liferayDatabase.isNew()) {
				session.save(liferayDatabase);

				liferayDatabase.setNew(false);
			}
			else {
				session.merge(liferayDatabase);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !LiferayDatabaseModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((liferayDatabaseModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						liferayDatabaseModelImpl.getOriginalItemId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ITEMID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMID,
					args);

				args = new Object[] { liferayDatabaseModelImpl.getItemId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ITEMID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMID,
					args);
			}
		}

		EntityCacheUtil.putResult(LiferayDatabaseModelImpl.ENTITY_CACHE_ENABLED,
			LiferayDatabaseImpl.class, liferayDatabase.getPrimaryKey(),
			liferayDatabase);

		return liferayDatabase;
	}

	protected LiferayDatabase toUnwrappedModel(LiferayDatabase liferayDatabase) {
		if (liferayDatabase instanceof LiferayDatabaseImpl) {
			return liferayDatabase;
		}

		LiferayDatabaseImpl liferayDatabaseImpl = new LiferayDatabaseImpl();

		liferayDatabaseImpl.setNew(liferayDatabase.isNew());
		liferayDatabaseImpl.setPrimaryKey(liferayDatabase.getPrimaryKey());

		liferayDatabaseImpl.setItemFieldId(liferayDatabase.getItemFieldId());
		liferayDatabaseImpl.setItemId(liferayDatabase.getItemId());
		liferayDatabaseImpl.setName(liferayDatabase.getName());
		liferayDatabaseImpl.setValues(liferayDatabase.getValues());
		liferayDatabaseImpl.setDescription(liferayDatabase.getDescription());

		return liferayDatabaseImpl;
	}

	/**
	 * Returns the liferay database with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the liferay database
	 * @return the liferay database
	 * @throws com.vnpt.portlet.user.NoSuchLiferayDatabaseException if a liferay database with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayDatabase findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLiferayDatabaseException, SystemException {
		LiferayDatabase liferayDatabase = fetchByPrimaryKey(primaryKey);

		if (liferayDatabase == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLiferayDatabaseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return liferayDatabase;
	}

	/**
	 * Returns the liferay database with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchLiferayDatabaseException} if it could not be found.
	 *
	 * @param itemFieldId the primary key of the liferay database
	 * @return the liferay database
	 * @throws com.vnpt.portlet.user.NoSuchLiferayDatabaseException if a liferay database with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayDatabase findByPrimaryKey(long itemFieldId)
		throws NoSuchLiferayDatabaseException, SystemException {
		return findByPrimaryKey((Serializable)itemFieldId);
	}

	/**
	 * Returns the liferay database with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the liferay database
	 * @return the liferay database, or <code>null</code> if a liferay database with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayDatabase fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LiferayDatabase liferayDatabase = (LiferayDatabase)EntityCacheUtil.getResult(LiferayDatabaseModelImpl.ENTITY_CACHE_ENABLED,
				LiferayDatabaseImpl.class, primaryKey);

		if (liferayDatabase == _nullLiferayDatabase) {
			return null;
		}

		if (liferayDatabase == null) {
			Session session = null;

			try {
				session = openSession();

				liferayDatabase = (LiferayDatabase)session.get(LiferayDatabaseImpl.class,
						primaryKey);

				if (liferayDatabase != null) {
					cacheResult(liferayDatabase);
				}
				else {
					EntityCacheUtil.putResult(LiferayDatabaseModelImpl.ENTITY_CACHE_ENABLED,
						LiferayDatabaseImpl.class, primaryKey,
						_nullLiferayDatabase);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LiferayDatabaseModelImpl.ENTITY_CACHE_ENABLED,
					LiferayDatabaseImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return liferayDatabase;
	}

	/**
	 * Returns the liferay database with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemFieldId the primary key of the liferay database
	 * @return the liferay database, or <code>null</code> if a liferay database with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LiferayDatabase fetchByPrimaryKey(long itemFieldId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)itemFieldId);
	}

	/**
	 * Returns all the liferay databases.
	 *
	 * @return the liferay databases
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LiferayDatabase> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the liferay databases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.LiferayDatabaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of liferay databases
	 * @param end the upper bound of the range of liferay databases (not inclusive)
	 * @return the range of liferay databases
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LiferayDatabase> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the liferay databases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.LiferayDatabaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of liferay databases
	 * @param end the upper bound of the range of liferay databases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of liferay databases
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LiferayDatabase> findAll(int start, int end,
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

		List<LiferayDatabase> list = (List<LiferayDatabase>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LIFERAYDATABASE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LIFERAYDATABASE;

				if (pagination) {
					sql = sql.concat(LiferayDatabaseModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LiferayDatabase>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LiferayDatabase>(list);
				}
				else {
					list = (List<LiferayDatabase>)QueryUtil.list(q,
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
	 * Removes all the liferay databases from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LiferayDatabase liferayDatabase : findAll()) {
			remove(liferayDatabase);
		}
	}

	/**
	 * Returns the number of liferay databases.
	 *
	 * @return the number of liferay databases
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

				Query q = session.createQuery(_SQL_COUNT_LIFERAYDATABASE);

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
	 * Initializes the liferay database persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vnpt.portlet.user.model.LiferayDatabase")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LiferayDatabase>> listenersList = new ArrayList<ModelListener<LiferayDatabase>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LiferayDatabase>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LiferayDatabaseImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LIFERAYDATABASE = "SELECT liferayDatabase FROM LiferayDatabase liferayDatabase";
	private static final String _SQL_SELECT_LIFERAYDATABASE_WHERE = "SELECT liferayDatabase FROM LiferayDatabase liferayDatabase WHERE ";
	private static final String _SQL_COUNT_LIFERAYDATABASE = "SELECT COUNT(liferayDatabase) FROM LiferayDatabase liferayDatabase";
	private static final String _SQL_COUNT_LIFERAYDATABASE_WHERE = "SELECT COUNT(liferayDatabase) FROM LiferayDatabase liferayDatabase WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "liferayDatabase.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LiferayDatabase exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LiferayDatabase exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LiferayDatabasePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"values"
			});
	private static LiferayDatabase _nullLiferayDatabase = new LiferayDatabaseImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LiferayDatabase> toCacheModel() {
				return _nullLiferayDatabaseCacheModel;
			}
		};

	private static CacheModel<LiferayDatabase> _nullLiferayDatabaseCacheModel = new CacheModel<LiferayDatabase>() {
			@Override
			public LiferayDatabase toEntityModel() {
				return _nullLiferayDatabase;
			}
		};
}
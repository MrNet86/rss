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

package com.viettel.ims.core.service.persistence;

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

import com.viettel.ims.core.NoSuchInvestCategoriesException;
import com.viettel.ims.core.model.InvestCategories;
import com.viettel.ims.core.model.impl.InvestCategoriesImpl;
import com.viettel.ims.core.model.impl.InvestCategoriesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the invest categories service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see InvestCategoriesPersistence
 * @see InvestCategoriesUtil
 * @generated
 */
public class InvestCategoriesPersistenceImpl extends BasePersistenceImpl<InvestCategories>
	implements InvestCategoriesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InvestCategoriesUtil} to access the invest categories persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InvestCategoriesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InvestCategoriesModelImpl.ENTITY_CACHE_ENABLED,
			InvestCategoriesModelImpl.FINDER_CACHE_ENABLED,
			InvestCategoriesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InvestCategoriesModelImpl.ENTITY_CACHE_ENABLED,
			InvestCategoriesModelImpl.FINDER_CACHE_ENABLED,
			InvestCategoriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InvestCategoriesModelImpl.ENTITY_CACHE_ENABLED,
			InvestCategoriesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_OBJID = new FinderPath(InvestCategoriesModelImpl.ENTITY_CACHE_ENABLED,
			InvestCategoriesModelImpl.FINDER_CACHE_ENABLED,
			InvestCategoriesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByObjId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OBJID = new FinderPath(InvestCategoriesModelImpl.ENTITY_CACHE_ENABLED,
			InvestCategoriesModelImpl.FINDER_CACHE_ENABLED,
			InvestCategoriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByObjId",
			new String[] { Long.class.getName(), Long.class.getName() },
			InvestCategoriesModelImpl.OBJID_COLUMN_BITMASK |
			InvestCategoriesModelImpl.ISACTIVE_COLUMN_BITMASK |
			InvestCategoriesModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OBJID = new FinderPath(InvestCategoriesModelImpl.ENTITY_CACHE_ENABLED,
			InvestCategoriesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByObjId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the invest categorieses where objId = &#63; and isActive = &#63;.
	 *
	 * @param objId the obj ID
	 * @param isActive the is active
	 * @return the matching invest categorieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestCategories> findByObjId(long objId, long isActive)
		throws SystemException {
		return findByObjId(objId, isActive, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the invest categorieses where objId = &#63; and isActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestCategoriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param objId the obj ID
	 * @param isActive the is active
	 * @param start the lower bound of the range of invest categorieses
	 * @param end the upper bound of the range of invest categorieses (not inclusive)
	 * @return the range of matching invest categorieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestCategories> findByObjId(long objId, long isActive,
		int start, int end) throws SystemException {
		return findByObjId(objId, isActive, start, end, null);
	}

	/**
	 * Returns an ordered range of all the invest categorieses where objId = &#63; and isActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestCategoriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param objId the obj ID
	 * @param isActive the is active
	 * @param start the lower bound of the range of invest categorieses
	 * @param end the upper bound of the range of invest categorieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching invest categorieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestCategories> findByObjId(long objId, long isActive,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OBJID;
			finderArgs = new Object[] { objId, isActive };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_OBJID;
			finderArgs = new Object[] {
					objId, isActive,
					
					start, end, orderByComparator
				};
		}

		List<InvestCategories> list = (List<InvestCategories>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (InvestCategories investCategories : list) {
				if ((objId != investCategories.getObjId()) ||
						(isActive != investCategories.getIsActive())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_INVESTCATEGORIES_WHERE);

			query.append(_FINDER_COLUMN_OBJID_OBJID_2);

			query.append(_FINDER_COLUMN_OBJID_ISACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(InvestCategoriesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(objId);

				qPos.add(isActive);

				if (!pagination) {
					list = (List<InvestCategories>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InvestCategories>(list);
				}
				else {
					list = (List<InvestCategories>)QueryUtil.list(q,
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
	 * Returns the first invest categories in the ordered set where objId = &#63; and isActive = &#63;.
	 *
	 * @param objId the obj ID
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching invest categories
	 * @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a matching invest categories could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestCategories findByObjId_First(long objId, long isActive,
		OrderByComparator orderByComparator)
		throws NoSuchInvestCategoriesException, SystemException {
		InvestCategories investCategories = fetchByObjId_First(objId, isActive,
				orderByComparator);

		if (investCategories != null) {
			return investCategories;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("objId=");
		msg.append(objId);

		msg.append(", isActive=");
		msg.append(isActive);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInvestCategoriesException(msg.toString());
	}

	/**
	 * Returns the first invest categories in the ordered set where objId = &#63; and isActive = &#63;.
	 *
	 * @param objId the obj ID
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching invest categories, or <code>null</code> if a matching invest categories could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestCategories fetchByObjId_First(long objId, long isActive,
		OrderByComparator orderByComparator) throws SystemException {
		List<InvestCategories> list = findByObjId(objId, isActive, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last invest categories in the ordered set where objId = &#63; and isActive = &#63;.
	 *
	 * @param objId the obj ID
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching invest categories
	 * @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a matching invest categories could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestCategories findByObjId_Last(long objId, long isActive,
		OrderByComparator orderByComparator)
		throws NoSuchInvestCategoriesException, SystemException {
		InvestCategories investCategories = fetchByObjId_Last(objId, isActive,
				orderByComparator);

		if (investCategories != null) {
			return investCategories;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("objId=");
		msg.append(objId);

		msg.append(", isActive=");
		msg.append(isActive);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInvestCategoriesException(msg.toString());
	}

	/**
	 * Returns the last invest categories in the ordered set where objId = &#63; and isActive = &#63;.
	 *
	 * @param objId the obj ID
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching invest categories, or <code>null</code> if a matching invest categories could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestCategories fetchByObjId_Last(long objId, long isActive,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByObjId(objId, isActive);

		if (count == 0) {
			return null;
		}

		List<InvestCategories> list = findByObjId(objId, isActive, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the invest categorieses before and after the current invest categories in the ordered set where objId = &#63; and isActive = &#63;.
	 *
	 * @param investCategoriesId the primary key of the current invest categories
	 * @param objId the obj ID
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next invest categories
	 * @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a invest categories with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestCategories[] findByObjId_PrevAndNext(long investCategoriesId,
		long objId, long isActive, OrderByComparator orderByComparator)
		throws NoSuchInvestCategoriesException, SystemException {
		InvestCategories investCategories = findByPrimaryKey(investCategoriesId);

		Session session = null;

		try {
			session = openSession();

			InvestCategories[] array = new InvestCategoriesImpl[3];

			array[0] = getByObjId_PrevAndNext(session, investCategories, objId,
					isActive, orderByComparator, true);

			array[1] = investCategories;

			array[2] = getByObjId_PrevAndNext(session, investCategories, objId,
					isActive, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected InvestCategories getByObjId_PrevAndNext(Session session,
		InvestCategories investCategories, long objId, long isActive,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_INVESTCATEGORIES_WHERE);

		query.append(_FINDER_COLUMN_OBJID_OBJID_2);

		query.append(_FINDER_COLUMN_OBJID_ISACTIVE_2);

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
			query.append(InvestCategoriesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(objId);

		qPos.add(isActive);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(investCategories);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<InvestCategories> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the invest categorieses where objId = &#63; and isActive = &#63; from the database.
	 *
	 * @param objId the obj ID
	 * @param isActive the is active
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByObjId(long objId, long isActive)
		throws SystemException {
		for (InvestCategories investCategories : findByObjId(objId, isActive,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(investCategories);
		}
	}

	/**
	 * Returns the number of invest categorieses where objId = &#63; and isActive = &#63;.
	 *
	 * @param objId the obj ID
	 * @param isActive the is active
	 * @return the number of matching invest categorieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByObjId(long objId, long isActive)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_OBJID;

		Object[] finderArgs = new Object[] { objId, isActive };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_INVESTCATEGORIES_WHERE);

			query.append(_FINDER_COLUMN_OBJID_OBJID_2);

			query.append(_FINDER_COLUMN_OBJID_ISACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(objId);

				qPos.add(isActive);

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

	private static final String _FINDER_COLUMN_OBJID_OBJID_2 = "investCategories.objId = ? AND ";
	private static final String _FINDER_COLUMN_OBJID_ISACTIVE_2 = "investCategories.isActive = ?";

	public InvestCategoriesPersistenceImpl() {
		setModelClass(InvestCategories.class);
	}

	/**
	 * Caches the invest categories in the entity cache if it is enabled.
	 *
	 * @param investCategories the invest categories
	 */
	@Override
	public void cacheResult(InvestCategories investCategories) {
		EntityCacheUtil.putResult(InvestCategoriesModelImpl.ENTITY_CACHE_ENABLED,
			InvestCategoriesImpl.class, investCategories.getPrimaryKey(),
			investCategories);

		investCategories.resetOriginalValues();
	}

	/**
	 * Caches the invest categorieses in the entity cache if it is enabled.
	 *
	 * @param investCategorieses the invest categorieses
	 */
	@Override
	public void cacheResult(List<InvestCategories> investCategorieses) {
		for (InvestCategories investCategories : investCategorieses) {
			if (EntityCacheUtil.getResult(
						InvestCategoriesModelImpl.ENTITY_CACHE_ENABLED,
						InvestCategoriesImpl.class,
						investCategories.getPrimaryKey()) == null) {
				cacheResult(investCategories);
			}
			else {
				investCategories.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all invest categorieses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(InvestCategoriesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(InvestCategoriesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the invest categories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(InvestCategories investCategories) {
		EntityCacheUtil.removeResult(InvestCategoriesModelImpl.ENTITY_CACHE_ENABLED,
			InvestCategoriesImpl.class, investCategories.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<InvestCategories> investCategorieses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (InvestCategories investCategories : investCategorieses) {
			EntityCacheUtil.removeResult(InvestCategoriesModelImpl.ENTITY_CACHE_ENABLED,
				InvestCategoriesImpl.class, investCategories.getPrimaryKey());
		}
	}

	/**
	 * Creates a new invest categories with the primary key. Does not add the invest categories to the database.
	 *
	 * @param investCategoriesId the primary key for the new invest categories
	 * @return the new invest categories
	 */
	@Override
	public InvestCategories create(long investCategoriesId) {
		InvestCategories investCategories = new InvestCategoriesImpl();

		investCategories.setNew(true);
		investCategories.setPrimaryKey(investCategoriesId);

		return investCategories;
	}

	/**
	 * Removes the invest categories with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param investCategoriesId the primary key of the invest categories
	 * @return the invest categories that was removed
	 * @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a invest categories with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestCategories remove(long investCategoriesId)
		throws NoSuchInvestCategoriesException, SystemException {
		return remove((Serializable)investCategoriesId);
	}

	/**
	 * Removes the invest categories with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the invest categories
	 * @return the invest categories that was removed
	 * @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a invest categories with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestCategories remove(Serializable primaryKey)
		throws NoSuchInvestCategoriesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			InvestCategories investCategories = (InvestCategories)session.get(InvestCategoriesImpl.class,
					primaryKey);

			if (investCategories == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInvestCategoriesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(investCategories);
		}
		catch (NoSuchInvestCategoriesException nsee) {
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
	protected InvestCategories removeImpl(InvestCategories investCategories)
		throws SystemException {
		investCategories = toUnwrappedModel(investCategories);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(investCategories)) {
				investCategories = (InvestCategories)session.get(InvestCategoriesImpl.class,
						investCategories.getPrimaryKeyObj());
			}

			if (investCategories != null) {
				session.delete(investCategories);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (investCategories != null) {
			clearCache(investCategories);
		}

		return investCategories;
	}

	@Override
	public InvestCategories updateImpl(
		com.viettel.ims.core.model.InvestCategories investCategories)
		throws SystemException {
		investCategories = toUnwrappedModel(investCategories);

		boolean isNew = investCategories.isNew();

		InvestCategoriesModelImpl investCategoriesModelImpl = (InvestCategoriesModelImpl)investCategories;

		Session session = null;

		try {
			session = openSession();

			if (investCategories.isNew()) {
				session.save(investCategories);

				investCategories.setNew(false);
			}
			else {
				session.merge(investCategories);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !InvestCategoriesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((investCategoriesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OBJID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						investCategoriesModelImpl.getOriginalObjId(),
						investCategoriesModelImpl.getOriginalIsActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OBJID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OBJID,
					args);

				args = new Object[] {
						investCategoriesModelImpl.getObjId(),
						investCategoriesModelImpl.getIsActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OBJID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OBJID,
					args);
			}
		}

		EntityCacheUtil.putResult(InvestCategoriesModelImpl.ENTITY_CACHE_ENABLED,
			InvestCategoriesImpl.class, investCategories.getPrimaryKey(),
			investCategories);

		return investCategories;
	}

	protected InvestCategories toUnwrappedModel(
		InvestCategories investCategories) {
		if (investCategories instanceof InvestCategoriesImpl) {
			return investCategories;
		}

		InvestCategoriesImpl investCategoriesImpl = new InvestCategoriesImpl();

		investCategoriesImpl.setNew(investCategories.isNew());
		investCategoriesImpl.setPrimaryKey(investCategories.getPrimaryKey());

		investCategoriesImpl.setInvestCategoriesId(investCategories.getInvestCategoriesId());
		investCategoriesImpl.setObjId(investCategories.getObjId());
		investCategoriesImpl.setName(investCategories.getName());
		investCategoriesImpl.setDescription(investCategories.getDescription());
		investCategoriesImpl.setUnitId(investCategories.getUnitId());
		investCategoriesImpl.setCostType(investCategories.getCostType());
		investCategoriesImpl.setQuantity(investCategories.getQuantity());
		investCategoriesImpl.setUsedQuantity(investCategories.getUsedQuantity());
		investCategoriesImpl.setUnitPrice(investCategories.getUnitPrice());
		investCategoriesImpl.setCatCurrencyId(investCategories.getCatCurrencyId());
		investCategoriesImpl.setType(investCategories.getType());
		investCategoriesImpl.setVat(investCategories.getVat());
		investCategoriesImpl.setIsActive(investCategories.getIsActive());
		investCategoriesImpl.setCreatedId(investCategories.getCreatedId());
		investCategoriesImpl.setCreatedDate(investCategories.getCreatedDate());
		investCategoriesImpl.setModifieldId(investCategories.getModifieldId());
		investCategoriesImpl.setModifieldDate(investCategories.getModifieldDate());

		return investCategoriesImpl;
	}

	/**
	 * Returns the invest categories with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the invest categories
	 * @return the invest categories
	 * @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a invest categories with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestCategories findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInvestCategoriesException, SystemException {
		InvestCategories investCategories = fetchByPrimaryKey(primaryKey);

		if (investCategories == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInvestCategoriesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return investCategories;
	}

	/**
	 * Returns the invest categories with the primary key or throws a {@link com.viettel.ims.core.NoSuchInvestCategoriesException} if it could not be found.
	 *
	 * @param investCategoriesId the primary key of the invest categories
	 * @return the invest categories
	 * @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a invest categories with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestCategories findByPrimaryKey(long investCategoriesId)
		throws NoSuchInvestCategoriesException, SystemException {
		return findByPrimaryKey((Serializable)investCategoriesId);
	}

	/**
	 * Returns the invest categories with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the invest categories
	 * @return the invest categories, or <code>null</code> if a invest categories with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestCategories fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		InvestCategories investCategories = (InvestCategories)EntityCacheUtil.getResult(InvestCategoriesModelImpl.ENTITY_CACHE_ENABLED,
				InvestCategoriesImpl.class, primaryKey);

		if (investCategories == _nullInvestCategories) {
			return null;
		}

		if (investCategories == null) {
			Session session = null;

			try {
				session = openSession();

				investCategories = (InvestCategories)session.get(InvestCategoriesImpl.class,
						primaryKey);

				if (investCategories != null) {
					cacheResult(investCategories);
				}
				else {
					EntityCacheUtil.putResult(InvestCategoriesModelImpl.ENTITY_CACHE_ENABLED,
						InvestCategoriesImpl.class, primaryKey,
						_nullInvestCategories);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(InvestCategoriesModelImpl.ENTITY_CACHE_ENABLED,
					InvestCategoriesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return investCategories;
	}

	/**
	 * Returns the invest categories with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param investCategoriesId the primary key of the invest categories
	 * @return the invest categories, or <code>null</code> if a invest categories with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestCategories fetchByPrimaryKey(long investCategoriesId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)investCategoriesId);
	}

	/**
	 * Returns all the invest categorieses.
	 *
	 * @return the invest categorieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestCategories> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the invest categorieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestCategoriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of invest categorieses
	 * @param end the upper bound of the range of invest categorieses (not inclusive)
	 * @return the range of invest categorieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestCategories> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the invest categorieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestCategoriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of invest categorieses
	 * @param end the upper bound of the range of invest categorieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of invest categorieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestCategories> findAll(int start, int end,
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

		List<InvestCategories> list = (List<InvestCategories>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_INVESTCATEGORIES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INVESTCATEGORIES;

				if (pagination) {
					sql = sql.concat(InvestCategoriesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<InvestCategories>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InvestCategories>(list);
				}
				else {
					list = (List<InvestCategories>)QueryUtil.list(q,
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
	 * Removes all the invest categorieses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (InvestCategories investCategories : findAll()) {
			remove(investCategories);
		}
	}

	/**
	 * Returns the number of invest categorieses.
	 *
	 * @return the number of invest categorieses
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

				Query q = session.createQuery(_SQL_COUNT_INVESTCATEGORIES);

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
	 * Initializes the invest categories persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.viettel.ims.core.model.InvestCategories")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<InvestCategories>> listenersList = new ArrayList<ModelListener<InvestCategories>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<InvestCategories>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(InvestCategoriesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_INVESTCATEGORIES = "SELECT investCategories FROM InvestCategories investCategories";
	private static final String _SQL_SELECT_INVESTCATEGORIES_WHERE = "SELECT investCategories FROM InvestCategories investCategories WHERE ";
	private static final String _SQL_COUNT_INVESTCATEGORIES = "SELECT COUNT(investCategories) FROM InvestCategories investCategories";
	private static final String _SQL_COUNT_INVESTCATEGORIES_WHERE = "SELECT COUNT(investCategories) FROM InvestCategories investCategories WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "investCategories.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InvestCategories exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No InvestCategories exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(InvestCategoriesPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"investCategoriesId", "objId", "unitId", "costType",
				"usedQuantity", "unitPrice", "catCurrencyId", "isActive",
				"createdId", "createdDate", "modifieldId", "modifieldDate"
			});
	private static InvestCategories _nullInvestCategories = new InvestCategoriesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<InvestCategories> toCacheModel() {
				return _nullInvestCategoriesCacheModel;
			}
		};

	private static CacheModel<InvestCategories> _nullInvestCategoriesCacheModel = new CacheModel<InvestCategories>() {
			@Override
			public InvestCategories toEntityModel() {
				return _nullInvestCategories;
			}
		};
}
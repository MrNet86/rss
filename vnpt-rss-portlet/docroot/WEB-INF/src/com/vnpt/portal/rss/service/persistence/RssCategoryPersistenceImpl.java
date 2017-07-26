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

package com.vnpt.portal.rss.service.persistence;

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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vnpt.portal.rss.NoSuchRssCategoryException;
import com.vnpt.portal.rss.model.RssCategory;
import com.vnpt.portal.rss.model.impl.RssCategoryImpl;
import com.vnpt.portal.rss.model.impl.RssCategoryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the rss category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see RssCategoryPersistence
 * @see RssCategoryUtil
 * @generated
 */
public class RssCategoryPersistenceImpl extends BasePersistenceImpl<RssCategory>
	implements RssCategoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RssCategoryUtil} to access the rss category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RssCategoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
			RssCategoryModelImpl.FINDER_CACHE_ENABLED, RssCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
			RssCategoryModelImpl.FINDER_CACHE_ENABLED, RssCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
			RssCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
			RssCategoryModelImpl.FINDER_CACHE_ENABLED, RssCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
			RssCategoryModelImpl.FINDER_CACHE_ENABLED, RssCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			RssCategoryModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
			RssCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the rss categories where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching rss categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssCategory> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rss categories where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of rss categories
	 * @param end the upper bound of the range of rss categories (not inclusive)
	 * @return the range of matching rss categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssCategory> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the rss categories where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of rss categories
	 * @param end the upper bound of the range of rss categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rss categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssCategory> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<RssCategory> list = (List<RssCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (RssCategory rssCategory : list) {
				if ((groupId != rssCategory.getGroupId())) {
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

			query.append(_SQL_SELECT_RSSCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RssCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<RssCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RssCategory>(list);
				}
				else {
					list = (List<RssCategory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first rss category in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rss category
	 * @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a matching rss category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssCategory findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchRssCategoryException, SystemException {
		RssCategory rssCategory = fetchByGroupId_First(groupId,
				orderByComparator);

		if (rssCategory != null) {
			return rssCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRssCategoryException(msg.toString());
	}

	/**
	 * Returns the first rss category in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rss category, or <code>null</code> if a matching rss category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssCategory fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<RssCategory> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last rss category in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rss category
	 * @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a matching rss category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssCategory findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchRssCategoryException, SystemException {
		RssCategory rssCategory = fetchByGroupId_Last(groupId, orderByComparator);

		if (rssCategory != null) {
			return rssCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRssCategoryException(msg.toString());
	}

	/**
	 * Returns the last rss category in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rss category, or <code>null</code> if a matching rss category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssCategory fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<RssCategory> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the rss categories before and after the current rss category in the ordered set where groupId = &#63;.
	 *
	 * @param rssCategoryId the primary key of the current rss category
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next rss category
	 * @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a rss category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssCategory[] findByGroupId_PrevAndNext(long rssCategoryId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchRssCategoryException, SystemException {
		RssCategory rssCategory = findByPrimaryKey(rssCategoryId);

		Session session = null;

		try {
			session = openSession();

			RssCategory[] array = new RssCategoryImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, rssCategory, groupId,
					orderByComparator, true);

			array[1] = rssCategory;

			array[2] = getByGroupId_PrevAndNext(session, rssCategory, groupId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected RssCategory getByGroupId_PrevAndNext(Session session,
		RssCategory rssCategory, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RSSCATEGORY_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
			query.append(RssCategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(rssCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RssCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the rss categories where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (RssCategory rssCategory : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(rssCategory);
		}
	}

	/**
	 * Returns the number of rss categories where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching rss categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupId(long groupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RSSCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "rssCategory.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
			RssCategoryModelImpl.FINDER_CACHE_ENABLED, RssCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
			RssCategoryModelImpl.FINDER_CACHE_ENABLED, RssCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			RssCategoryModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
			RssCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the rss categories where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching rss categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssCategory> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the rss categories where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of rss categories
	 * @param end the upper bound of the range of rss categories (not inclusive)
	 * @return the range of matching rss categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssCategory> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the rss categories where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of rss categories
	 * @param end the upper bound of the range of rss categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rss categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssCategory> findByCompanyId(long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<RssCategory> list = (List<RssCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (RssCategory rssCategory : list) {
				if ((companyId != rssCategory.getCompanyId())) {
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

			query.append(_SQL_SELECT_RSSCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RssCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<RssCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RssCategory>(list);
				}
				else {
					list = (List<RssCategory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first rss category in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rss category
	 * @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a matching rss category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssCategory findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchRssCategoryException, SystemException {
		RssCategory rssCategory = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (rssCategory != null) {
			return rssCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRssCategoryException(msg.toString());
	}

	/**
	 * Returns the first rss category in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rss category, or <code>null</code> if a matching rss category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssCategory fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<RssCategory> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last rss category in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rss category
	 * @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a matching rss category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssCategory findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchRssCategoryException, SystemException {
		RssCategory rssCategory = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (rssCategory != null) {
			return rssCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRssCategoryException(msg.toString());
	}

	/**
	 * Returns the last rss category in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rss category, or <code>null</code> if a matching rss category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssCategory fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<RssCategory> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the rss categories before and after the current rss category in the ordered set where companyId = &#63;.
	 *
	 * @param rssCategoryId the primary key of the current rss category
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next rss category
	 * @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a rss category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssCategory[] findByCompanyId_PrevAndNext(long rssCategoryId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchRssCategoryException, SystemException {
		RssCategory rssCategory = findByPrimaryKey(rssCategoryId);

		Session session = null;

		try {
			session = openSession();

			RssCategory[] array = new RssCategoryImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, rssCategory,
					companyId, orderByComparator, true);

			array[1] = rssCategory;

			array[2] = getByCompanyId_PrevAndNext(session, rssCategory,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected RssCategory getByCompanyId_PrevAndNext(Session session,
		RssCategory rssCategory, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RSSCATEGORY_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

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
			query.append(RssCategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(rssCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RssCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the rss categories where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (RssCategory rssCategory : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(rssCategory);
		}
	}

	/**
	 * Returns the number of rss categories where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching rss categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCompanyId(long companyId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RSSCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "rssCategory.companyId = ?";

	public RssCategoryPersistenceImpl() {
		setModelClass(RssCategory.class);
	}

	/**
	 * Caches the rss category in the entity cache if it is enabled.
	 *
	 * @param rssCategory the rss category
	 */
	@Override
	public void cacheResult(RssCategory rssCategory) {
		EntityCacheUtil.putResult(RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
			RssCategoryImpl.class, rssCategory.getPrimaryKey(), rssCategory);

		rssCategory.resetOriginalValues();
	}

	/**
	 * Caches the rss categories in the entity cache if it is enabled.
	 *
	 * @param rssCategories the rss categories
	 */
	@Override
	public void cacheResult(List<RssCategory> rssCategories) {
		for (RssCategory rssCategory : rssCategories) {
			if (EntityCacheUtil.getResult(
						RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
						RssCategoryImpl.class, rssCategory.getPrimaryKey()) == null) {
				cacheResult(rssCategory);
			}
			else {
				rssCategory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all rss categories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RssCategoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RssCategoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the rss category.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RssCategory rssCategory) {
		EntityCacheUtil.removeResult(RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
			RssCategoryImpl.class, rssCategory.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RssCategory> rssCategories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RssCategory rssCategory : rssCategories) {
			EntityCacheUtil.removeResult(RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
				RssCategoryImpl.class, rssCategory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new rss category with the primary key. Does not add the rss category to the database.
	 *
	 * @param rssCategoryId the primary key for the new rss category
	 * @return the new rss category
	 */
	@Override
	public RssCategory create(long rssCategoryId) {
		RssCategory rssCategory = new RssCategoryImpl();

		rssCategory.setNew(true);
		rssCategory.setPrimaryKey(rssCategoryId);

		return rssCategory;
	}

	/**
	 * Removes the rss category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param rssCategoryId the primary key of the rss category
	 * @return the rss category that was removed
	 * @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a rss category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssCategory remove(long rssCategoryId)
		throws NoSuchRssCategoryException, SystemException {
		return remove((Serializable)rssCategoryId);
	}

	/**
	 * Removes the rss category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rss category
	 * @return the rss category that was removed
	 * @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a rss category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssCategory remove(Serializable primaryKey)
		throws NoSuchRssCategoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			RssCategory rssCategory = (RssCategory)session.get(RssCategoryImpl.class,
					primaryKey);

			if (rssCategory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRssCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(rssCategory);
		}
		catch (NoSuchRssCategoryException nsee) {
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
	protected RssCategory removeImpl(RssCategory rssCategory)
		throws SystemException {
		rssCategory = toUnwrappedModel(rssCategory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rssCategory)) {
				rssCategory = (RssCategory)session.get(RssCategoryImpl.class,
						rssCategory.getPrimaryKeyObj());
			}

			if (rssCategory != null) {
				session.delete(rssCategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (rssCategory != null) {
			clearCache(rssCategory);
		}

		return rssCategory;
	}

	@Override
	public RssCategory updateImpl(
		com.vnpt.portal.rss.model.RssCategory rssCategory)
		throws SystemException {
		rssCategory = toUnwrappedModel(rssCategory);

		boolean isNew = rssCategory.isNew();

		RssCategoryModelImpl rssCategoryModelImpl = (RssCategoryModelImpl)rssCategory;

		Session session = null;

		try {
			session = openSession();

			if (rssCategory.isNew()) {
				session.save(rssCategory);

				rssCategory.setNew(false);
			}
			else {
				session.merge(rssCategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !RssCategoryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((rssCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						rssCategoryModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { rssCategoryModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((rssCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						rssCategoryModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { rssCategoryModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}
		}

		EntityCacheUtil.putResult(RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
			RssCategoryImpl.class, rssCategory.getPrimaryKey(), rssCategory);

		return rssCategory;
	}

	protected RssCategory toUnwrappedModel(RssCategory rssCategory) {
		if (rssCategory instanceof RssCategoryImpl) {
			return rssCategory;
		}

		RssCategoryImpl rssCategoryImpl = new RssCategoryImpl();

		rssCategoryImpl.setNew(rssCategory.isNew());
		rssCategoryImpl.setPrimaryKey(rssCategory.getPrimaryKey());

		rssCategoryImpl.setRssCategoryId(rssCategory.getRssCategoryId());
		rssCategoryImpl.setGroupId(rssCategory.getGroupId());
		rssCategoryImpl.setCompanyId(rssCategory.getCompanyId());
		rssCategoryImpl.setName(rssCategory.getName());
		rssCategoryImpl.setDescription(rssCategory.getDescription());
		rssCategoryImpl.setStatus(rssCategory.getStatus());
		rssCategoryImpl.setCreatedId(rssCategory.getCreatedId());
		rssCategoryImpl.setCreatedDate(rssCategory.getCreatedDate());

		return rssCategoryImpl;
	}

	/**
	 * Returns the rss category with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the rss category
	 * @return the rss category
	 * @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a rss category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssCategory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRssCategoryException, SystemException {
		RssCategory rssCategory = fetchByPrimaryKey(primaryKey);

		if (rssCategory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRssCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return rssCategory;
	}

	/**
	 * Returns the rss category with the primary key or throws a {@link com.vnpt.portal.rss.NoSuchRssCategoryException} if it could not be found.
	 *
	 * @param rssCategoryId the primary key of the rss category
	 * @return the rss category
	 * @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a rss category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssCategory findByPrimaryKey(long rssCategoryId)
		throws NoSuchRssCategoryException, SystemException {
		return findByPrimaryKey((Serializable)rssCategoryId);
	}

	/**
	 * Returns the rss category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rss category
	 * @return the rss category, or <code>null</code> if a rss category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssCategory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		RssCategory rssCategory = (RssCategory)EntityCacheUtil.getResult(RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
				RssCategoryImpl.class, primaryKey);

		if (rssCategory == _nullRssCategory) {
			return null;
		}

		if (rssCategory == null) {
			Session session = null;

			try {
				session = openSession();

				rssCategory = (RssCategory)session.get(RssCategoryImpl.class,
						primaryKey);

				if (rssCategory != null) {
					cacheResult(rssCategory);
				}
				else {
					EntityCacheUtil.putResult(RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
						RssCategoryImpl.class, primaryKey, _nullRssCategory);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(RssCategoryModelImpl.ENTITY_CACHE_ENABLED,
					RssCategoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return rssCategory;
	}

	/**
	 * Returns the rss category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param rssCategoryId the primary key of the rss category
	 * @return the rss category, or <code>null</code> if a rss category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssCategory fetchByPrimaryKey(long rssCategoryId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)rssCategoryId);
	}

	/**
	 * Returns all the rss categories.
	 *
	 * @return the rss categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssCategory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rss categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rss categories
	 * @param end the upper bound of the range of rss categories (not inclusive)
	 * @return the range of rss categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssCategory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rss categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rss categories
	 * @param end the upper bound of the range of rss categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rss categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssCategory> findAll(int start, int end,
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

		List<RssCategory> list = (List<RssCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RSSCATEGORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RSSCATEGORY;

				if (pagination) {
					sql = sql.concat(RssCategoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RssCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RssCategory>(list);
				}
				else {
					list = (List<RssCategory>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the rss categories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (RssCategory rssCategory : findAll()) {
			remove(rssCategory);
		}
	}

	/**
	 * Returns the number of rss categories.
	 *
	 * @return the number of rss categories
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

				Query q = session.createQuery(_SQL_COUNT_RSSCATEGORY);

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

	/**
	 * Initializes the rss category persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vnpt.portal.rss.model.RssCategory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<RssCategory>> listenersList = new ArrayList<ModelListener<RssCategory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<RssCategory>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RssCategoryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_RSSCATEGORY = "SELECT rssCategory FROM RssCategory rssCategory";
	private static final String _SQL_SELECT_RSSCATEGORY_WHERE = "SELECT rssCategory FROM RssCategory rssCategory WHERE ";
	private static final String _SQL_COUNT_RSSCATEGORY = "SELECT COUNT(rssCategory) FROM RssCategory rssCategory";
	private static final String _SQL_COUNT_RSSCATEGORY_WHERE = "SELECT COUNT(rssCategory) FROM RssCategory rssCategory WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "rssCategory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RssCategory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RssCategory exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RssCategoryPersistenceImpl.class);
	private static RssCategory _nullRssCategory = new RssCategoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<RssCategory> toCacheModel() {
				return _nullRssCategoryCacheModel;
			}
		};

	private static CacheModel<RssCategory> _nullRssCategoryCacheModel = new CacheModel<RssCategory>() {
			@Override
			public RssCategory toEntityModel() {
				return _nullRssCategory;
			}
		};
}
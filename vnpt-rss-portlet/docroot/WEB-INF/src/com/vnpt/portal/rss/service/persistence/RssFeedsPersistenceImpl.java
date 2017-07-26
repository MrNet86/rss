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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vnpt.portal.rss.NoSuchRssFeedsException;
import com.vnpt.portal.rss.model.RssFeeds;
import com.vnpt.portal.rss.model.impl.RssFeedsImpl;
import com.vnpt.portal.rss.model.impl.RssFeedsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the rss feeds service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see RssFeedsPersistence
 * @see RssFeedsUtil
 * @generated
 */
public class RssFeedsPersistenceImpl extends BasePersistenceImpl<RssFeeds>
	implements RssFeedsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RssFeedsUtil} to access the rss feeds persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RssFeedsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
			RssFeedsModelImpl.FINDER_CACHE_ENABLED, RssFeedsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
			RssFeedsModelImpl.FINDER_CACHE_ENABLED, RssFeedsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
			RssFeedsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
			RssFeedsModelImpl.FINDER_CACHE_ENABLED, RssFeedsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
			RssFeedsModelImpl.FINDER_CACHE_ENABLED, RssFeedsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			RssFeedsModelImpl.GROUPID_COLUMN_BITMASK |
			RssFeedsModelImpl.TITLE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
			RssFeedsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the rss feedses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching rss feedses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssFeeds> findByGroupId(long groupId) throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rss feedses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of rss feedses
	 * @param end the upper bound of the range of rss feedses (not inclusive)
	 * @return the range of matching rss feedses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssFeeds> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the rss feedses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of rss feedses
	 * @param end the upper bound of the range of rss feedses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rss feedses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssFeeds> findByGroupId(long groupId, int start, int end,
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

		List<RssFeeds> list = (List<RssFeeds>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (RssFeeds rssFeeds : list) {
				if ((groupId != rssFeeds.getGroupId())) {
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

			query.append(_SQL_SELECT_RSSFEEDS_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RssFeedsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<RssFeeds>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RssFeeds>(list);
				}
				else {
					list = (List<RssFeeds>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first rss feeds in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rss feeds
	 * @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a matching rss feeds could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchRssFeedsException, SystemException {
		RssFeeds rssFeeds = fetchByGroupId_First(groupId, orderByComparator);

		if (rssFeeds != null) {
			return rssFeeds;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRssFeedsException(msg.toString());
	}

	/**
	 * Returns the first rss feeds in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<RssFeeds> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last rss feeds in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rss feeds
	 * @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a matching rss feeds could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchRssFeedsException, SystemException {
		RssFeeds rssFeeds = fetchByGroupId_Last(groupId, orderByComparator);

		if (rssFeeds != null) {
			return rssFeeds;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRssFeedsException(msg.toString());
	}

	/**
	 * Returns the last rss feeds in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<RssFeeds> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the rss feedses before and after the current rss feeds in the ordered set where groupId = &#63;.
	 *
	 * @param rssFeedsId the primary key of the current rss feeds
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next rss feeds
	 * @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a rss feeds with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds[] findByGroupId_PrevAndNext(long rssFeedsId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchRssFeedsException, SystemException {
		RssFeeds rssFeeds = findByPrimaryKey(rssFeedsId);

		Session session = null;

		try {
			session = openSession();

			RssFeeds[] array = new RssFeedsImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, rssFeeds, groupId,
					orderByComparator, true);

			array[1] = rssFeeds;

			array[2] = getByGroupId_PrevAndNext(session, rssFeeds, groupId,
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

	protected RssFeeds getByGroupId_PrevAndNext(Session session,
		RssFeeds rssFeeds, long groupId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RSSFEEDS_WHERE);

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
			query.append(RssFeedsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(rssFeeds);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RssFeeds> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the rss feedses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (RssFeeds rssFeeds : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(rssFeeds);
		}
	}

	/**
	 * Returns the number of rss feedses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching rss feedses
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

			query.append(_SQL_COUNT_RSSFEEDS_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "rssFeeds.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
			RssFeedsModelImpl.FINDER_CACHE_ENABLED, RssFeedsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
			RssFeedsModelImpl.FINDER_CACHE_ENABLED, RssFeedsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			RssFeedsModelImpl.COMPANYID_COLUMN_BITMASK |
			RssFeedsModelImpl.GROUPID_COLUMN_BITMASK |
			RssFeedsModelImpl.TITLE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
			RssFeedsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the rss feedses where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching rss feedses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssFeeds> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the rss feedses where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of rss feedses
	 * @param end the upper bound of the range of rss feedses (not inclusive)
	 * @return the range of matching rss feedses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssFeeds> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the rss feedses where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of rss feedses
	 * @param end the upper bound of the range of rss feedses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rss feedses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssFeeds> findByCompanyId(long companyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
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

		List<RssFeeds> list = (List<RssFeeds>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (RssFeeds rssFeeds : list) {
				if ((companyId != rssFeeds.getCompanyId())) {
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

			query.append(_SQL_SELECT_RSSFEEDS_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RssFeedsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<RssFeeds>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RssFeeds>(list);
				}
				else {
					list = (List<RssFeeds>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first rss feeds in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rss feeds
	 * @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a matching rss feeds could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchRssFeedsException, SystemException {
		RssFeeds rssFeeds = fetchByCompanyId_First(companyId, orderByComparator);

		if (rssFeeds != null) {
			return rssFeeds;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRssFeedsException(msg.toString());
	}

	/**
	 * Returns the first rss feeds in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<RssFeeds> list = findByCompanyId(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last rss feeds in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rss feeds
	 * @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a matching rss feeds could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchRssFeedsException, SystemException {
		RssFeeds rssFeeds = fetchByCompanyId_Last(companyId, orderByComparator);

		if (rssFeeds != null) {
			return rssFeeds;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRssFeedsException(msg.toString());
	}

	/**
	 * Returns the last rss feeds in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<RssFeeds> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the rss feedses before and after the current rss feeds in the ordered set where companyId = &#63;.
	 *
	 * @param rssFeedsId the primary key of the current rss feeds
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next rss feeds
	 * @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a rss feeds with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds[] findByCompanyId_PrevAndNext(long rssFeedsId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchRssFeedsException, SystemException {
		RssFeeds rssFeeds = findByPrimaryKey(rssFeedsId);

		Session session = null;

		try {
			session = openSession();

			RssFeeds[] array = new RssFeedsImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, rssFeeds, companyId,
					orderByComparator, true);

			array[1] = rssFeeds;

			array[2] = getByCompanyId_PrevAndNext(session, rssFeeds, companyId,
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

	protected RssFeeds getByCompanyId_PrevAndNext(Session session,
		RssFeeds rssFeeds, long companyId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RSSFEEDS_WHERE);

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
			query.append(RssFeedsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(rssFeeds);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RssFeeds> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the rss feedses where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (RssFeeds rssFeeds : findByCompanyId(companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(rssFeeds);
		}
	}

	/**
	 * Returns the number of rss feedses where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching rss feedses
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

			query.append(_SQL_COUNT_RSSFEEDS_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "rssFeeds.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_URL = new FinderPath(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
			RssFeedsModelImpl.FINDER_CACHE_ENABLED, RssFeedsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUrl",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_URL = new FinderPath(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
			RssFeedsModelImpl.FINDER_CACHE_ENABLED, RssFeedsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUrl",
			new String[] { Long.class.getName(), String.class.getName() },
			RssFeedsModelImpl.GROUPID_COLUMN_BITMASK |
			RssFeedsModelImpl.URL_COLUMN_BITMASK |
			RssFeedsModelImpl.TITLE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_URL = new FinderPath(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
			RssFeedsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUrl",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the rss feedses where groupId = &#63; and url = &#63;.
	 *
	 * @param groupId the group ID
	 * @param url the url
	 * @return the matching rss feedses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssFeeds> findByUrl(long groupId, String url)
		throws SystemException {
		return findByUrl(groupId, url, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the rss feedses where groupId = &#63; and url = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param url the url
	 * @param start the lower bound of the range of rss feedses
	 * @param end the upper bound of the range of rss feedses (not inclusive)
	 * @return the range of matching rss feedses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssFeeds> findByUrl(long groupId, String url, int start, int end)
		throws SystemException {
		return findByUrl(groupId, url, start, end, null);
	}

	/**
	 * Returns an ordered range of all the rss feedses where groupId = &#63; and url = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param url the url
	 * @param start the lower bound of the range of rss feedses
	 * @param end the upper bound of the range of rss feedses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rss feedses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssFeeds> findByUrl(long groupId, String url, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_URL;
			finderArgs = new Object[] { groupId, url };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_URL;
			finderArgs = new Object[] {
					groupId, url,
					
					start, end, orderByComparator
				};
		}

		List<RssFeeds> list = (List<RssFeeds>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (RssFeeds rssFeeds : list) {
				if ((groupId != rssFeeds.getGroupId()) ||
						!Validator.equals(url, rssFeeds.getUrl())) {
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

			query.append(_SQL_SELECT_RSSFEEDS_WHERE);

			query.append(_FINDER_COLUMN_URL_GROUPID_2);

			boolean bindUrl = false;

			if (url == null) {
				query.append(_FINDER_COLUMN_URL_URL_1);
			}
			else if (url.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_URL_URL_3);
			}
			else {
				bindUrl = true;

				query.append(_FINDER_COLUMN_URL_URL_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RssFeedsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindUrl) {
					qPos.add(url);
				}

				if (!pagination) {
					list = (List<RssFeeds>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RssFeeds>(list);
				}
				else {
					list = (List<RssFeeds>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first rss feeds in the ordered set where groupId = &#63; and url = &#63;.
	 *
	 * @param groupId the group ID
	 * @param url the url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rss feeds
	 * @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a matching rss feeds could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds findByUrl_First(long groupId, String url,
		OrderByComparator orderByComparator)
		throws NoSuchRssFeedsException, SystemException {
		RssFeeds rssFeeds = fetchByUrl_First(groupId, url, orderByComparator);

		if (rssFeeds != null) {
			return rssFeeds;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", url=");
		msg.append(url);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRssFeedsException(msg.toString());
	}

	/**
	 * Returns the first rss feeds in the ordered set where groupId = &#63; and url = &#63;.
	 *
	 * @param groupId the group ID
	 * @param url the url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds fetchByUrl_First(long groupId, String url,
		OrderByComparator orderByComparator) throws SystemException {
		List<RssFeeds> list = findByUrl(groupId, url, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last rss feeds in the ordered set where groupId = &#63; and url = &#63;.
	 *
	 * @param groupId the group ID
	 * @param url the url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rss feeds
	 * @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a matching rss feeds could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds findByUrl_Last(long groupId, String url,
		OrderByComparator orderByComparator)
		throws NoSuchRssFeedsException, SystemException {
		RssFeeds rssFeeds = fetchByUrl_Last(groupId, url, orderByComparator);

		if (rssFeeds != null) {
			return rssFeeds;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", url=");
		msg.append(url);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRssFeedsException(msg.toString());
	}

	/**
	 * Returns the last rss feeds in the ordered set where groupId = &#63; and url = &#63;.
	 *
	 * @param groupId the group ID
	 * @param url the url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds fetchByUrl_Last(long groupId, String url,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUrl(groupId, url);

		if (count == 0) {
			return null;
		}

		List<RssFeeds> list = findByUrl(groupId, url, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the rss feedses before and after the current rss feeds in the ordered set where groupId = &#63; and url = &#63;.
	 *
	 * @param rssFeedsId the primary key of the current rss feeds
	 * @param groupId the group ID
	 * @param url the url
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next rss feeds
	 * @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a rss feeds with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds[] findByUrl_PrevAndNext(long rssFeedsId, long groupId,
		String url, OrderByComparator orderByComparator)
		throws NoSuchRssFeedsException, SystemException {
		RssFeeds rssFeeds = findByPrimaryKey(rssFeedsId);

		Session session = null;

		try {
			session = openSession();

			RssFeeds[] array = new RssFeedsImpl[3];

			array[0] = getByUrl_PrevAndNext(session, rssFeeds, groupId, url,
					orderByComparator, true);

			array[1] = rssFeeds;

			array[2] = getByUrl_PrevAndNext(session, rssFeeds, groupId, url,
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

	protected RssFeeds getByUrl_PrevAndNext(Session session, RssFeeds rssFeeds,
		long groupId, String url, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RSSFEEDS_WHERE);

		query.append(_FINDER_COLUMN_URL_GROUPID_2);

		boolean bindUrl = false;

		if (url == null) {
			query.append(_FINDER_COLUMN_URL_URL_1);
		}
		else if (url.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_URL_URL_3);
		}
		else {
			bindUrl = true;

			query.append(_FINDER_COLUMN_URL_URL_2);
		}

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
			query.append(RssFeedsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindUrl) {
			qPos.add(url);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(rssFeeds);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RssFeeds> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the rss feedses where groupId = &#63; and url = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param url the url
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUrl(long groupId, String url) throws SystemException {
		for (RssFeeds rssFeeds : findByUrl(groupId, url, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(rssFeeds);
		}
	}

	/**
	 * Returns the number of rss feedses where groupId = &#63; and url = &#63;.
	 *
	 * @param groupId the group ID
	 * @param url the url
	 * @return the number of matching rss feedses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUrl(long groupId, String url) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_URL;

		Object[] finderArgs = new Object[] { groupId, url };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_RSSFEEDS_WHERE);

			query.append(_FINDER_COLUMN_URL_GROUPID_2);

			boolean bindUrl = false;

			if (url == null) {
				query.append(_FINDER_COLUMN_URL_URL_1);
			}
			else if (url.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_URL_URL_3);
			}
			else {
				bindUrl = true;

				query.append(_FINDER_COLUMN_URL_URL_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindUrl) {
					qPos.add(url);
				}

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

	private static final String _FINDER_COLUMN_URL_GROUPID_2 = "rssFeeds.groupId = ? AND ";
	private static final String _FINDER_COLUMN_URL_URL_1 = "rssFeeds.url IS NULL";
	private static final String _FINDER_COLUMN_URL_URL_2 = "rssFeeds.url = ?";
	private static final String _FINDER_COLUMN_URL_URL_3 = "(rssFeeds.url IS NULL OR rssFeeds.url = '')";

	public RssFeedsPersistenceImpl() {
		setModelClass(RssFeeds.class);
	}

	/**
	 * Caches the rss feeds in the entity cache if it is enabled.
	 *
	 * @param rssFeeds the rss feeds
	 */
	@Override
	public void cacheResult(RssFeeds rssFeeds) {
		EntityCacheUtil.putResult(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
			RssFeedsImpl.class, rssFeeds.getPrimaryKey(), rssFeeds);

		rssFeeds.resetOriginalValues();
	}

	/**
	 * Caches the rss feedses in the entity cache if it is enabled.
	 *
	 * @param rssFeedses the rss feedses
	 */
	@Override
	public void cacheResult(List<RssFeeds> rssFeedses) {
		for (RssFeeds rssFeeds : rssFeedses) {
			if (EntityCacheUtil.getResult(
						RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
						RssFeedsImpl.class, rssFeeds.getPrimaryKey()) == null) {
				cacheResult(rssFeeds);
			}
			else {
				rssFeeds.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all rss feedses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RssFeedsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RssFeedsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the rss feeds.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RssFeeds rssFeeds) {
		EntityCacheUtil.removeResult(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
			RssFeedsImpl.class, rssFeeds.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RssFeeds> rssFeedses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RssFeeds rssFeeds : rssFeedses) {
			EntityCacheUtil.removeResult(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
				RssFeedsImpl.class, rssFeeds.getPrimaryKey());
		}
	}

	/**
	 * Creates a new rss feeds with the primary key. Does not add the rss feeds to the database.
	 *
	 * @param rssFeedsId the primary key for the new rss feeds
	 * @return the new rss feeds
	 */
	@Override
	public RssFeeds create(long rssFeedsId) {
		RssFeeds rssFeeds = new RssFeedsImpl();

		rssFeeds.setNew(true);
		rssFeeds.setPrimaryKey(rssFeedsId);

		return rssFeeds;
	}

	/**
	 * Removes the rss feeds with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param rssFeedsId the primary key of the rss feeds
	 * @return the rss feeds that was removed
	 * @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a rss feeds with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds remove(long rssFeedsId)
		throws NoSuchRssFeedsException, SystemException {
		return remove((Serializable)rssFeedsId);
	}

	/**
	 * Removes the rss feeds with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rss feeds
	 * @return the rss feeds that was removed
	 * @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a rss feeds with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds remove(Serializable primaryKey)
		throws NoSuchRssFeedsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			RssFeeds rssFeeds = (RssFeeds)session.get(RssFeedsImpl.class,
					primaryKey);

			if (rssFeeds == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRssFeedsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(rssFeeds);
		}
		catch (NoSuchRssFeedsException nsee) {
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
	protected RssFeeds removeImpl(RssFeeds rssFeeds) throws SystemException {
		rssFeeds = toUnwrappedModel(rssFeeds);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rssFeeds)) {
				rssFeeds = (RssFeeds)session.get(RssFeedsImpl.class,
						rssFeeds.getPrimaryKeyObj());
			}

			if (rssFeeds != null) {
				session.delete(rssFeeds);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (rssFeeds != null) {
			clearCache(rssFeeds);
		}

		return rssFeeds;
	}

	@Override
	public RssFeeds updateImpl(com.vnpt.portal.rss.model.RssFeeds rssFeeds)
		throws SystemException {
		rssFeeds = toUnwrappedModel(rssFeeds);

		boolean isNew = rssFeeds.isNew();

		RssFeedsModelImpl rssFeedsModelImpl = (RssFeedsModelImpl)rssFeeds;

		Session session = null;

		try {
			session = openSession();

			if (rssFeeds.isNew()) {
				session.save(rssFeeds);

				rssFeeds.setNew(false);
			}
			else {
				session.merge(rssFeeds);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !RssFeedsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((rssFeedsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						rssFeedsModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { rssFeedsModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((rssFeedsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						rssFeedsModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { rssFeedsModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((rssFeedsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_URL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						rssFeedsModelImpl.getOriginalGroupId(),
						rssFeedsModelImpl.getOriginalUrl()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_URL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_URL,
					args);

				args = new Object[] {
						rssFeedsModelImpl.getGroupId(),
						rssFeedsModelImpl.getUrl()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_URL, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_URL,
					args);
			}
		}

		EntityCacheUtil.putResult(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
			RssFeedsImpl.class, rssFeeds.getPrimaryKey(), rssFeeds);

		return rssFeeds;
	}

	protected RssFeeds toUnwrappedModel(RssFeeds rssFeeds) {
		if (rssFeeds instanceof RssFeedsImpl) {
			return rssFeeds;
		}

		RssFeedsImpl rssFeedsImpl = new RssFeedsImpl();

		rssFeedsImpl.setNew(rssFeeds.isNew());
		rssFeedsImpl.setPrimaryKey(rssFeeds.getPrimaryKey());

		rssFeedsImpl.setRssFeedsId(rssFeeds.getRssFeedsId());
		rssFeedsImpl.setGroupId(rssFeeds.getGroupId());
		rssFeedsImpl.setCompanyId(rssFeeds.getCompanyId());
		rssFeedsImpl.setTitle(rssFeeds.getTitle());
		rssFeedsImpl.setUrl(rssFeeds.getUrl());
		rssFeedsImpl.setDescription(rssFeeds.getDescription());
		rssFeedsImpl.setContent(rssFeeds.getContent());
		rssFeedsImpl.setAuthor(rssFeeds.getAuthor());
		rssFeedsImpl.setPublishedDate(rssFeeds.getPublishedDate());
		rssFeedsImpl.setStatus(rssFeeds.getStatus());
		rssFeedsImpl.setCreatedId(rssFeeds.getCreatedId());
		rssFeedsImpl.setCreatedDate(rssFeeds.getCreatedDate());
		rssFeedsImpl.setApprovedId(rssFeeds.getApprovedId());
		rssFeedsImpl.setApprovedDate(rssFeeds.getApprovedDate());
		rssFeedsImpl.setRssCategoryId(rssFeeds.getRssCategoryId());

		return rssFeedsImpl;
	}

	/**
	 * Returns the rss feeds with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the rss feeds
	 * @return the rss feeds
	 * @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a rss feeds with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRssFeedsException, SystemException {
		RssFeeds rssFeeds = fetchByPrimaryKey(primaryKey);

		if (rssFeeds == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRssFeedsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return rssFeeds;
	}

	/**
	 * Returns the rss feeds with the primary key or throws a {@link com.vnpt.portal.rss.NoSuchRssFeedsException} if it could not be found.
	 *
	 * @param rssFeedsId the primary key of the rss feeds
	 * @return the rss feeds
	 * @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a rss feeds with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds findByPrimaryKey(long rssFeedsId)
		throws NoSuchRssFeedsException, SystemException {
		return findByPrimaryKey((Serializable)rssFeedsId);
	}

	/**
	 * Returns the rss feeds with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rss feeds
	 * @return the rss feeds, or <code>null</code> if a rss feeds with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		RssFeeds rssFeeds = (RssFeeds)EntityCacheUtil.getResult(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
				RssFeedsImpl.class, primaryKey);

		if (rssFeeds == _nullRssFeeds) {
			return null;
		}

		if (rssFeeds == null) {
			Session session = null;

			try {
				session = openSession();

				rssFeeds = (RssFeeds)session.get(RssFeedsImpl.class, primaryKey);

				if (rssFeeds != null) {
					cacheResult(rssFeeds);
				}
				else {
					EntityCacheUtil.putResult(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
						RssFeedsImpl.class, primaryKey, _nullRssFeeds);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(RssFeedsModelImpl.ENTITY_CACHE_ENABLED,
					RssFeedsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return rssFeeds;
	}

	/**
	 * Returns the rss feeds with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param rssFeedsId the primary key of the rss feeds
	 * @return the rss feeds, or <code>null</code> if a rss feeds with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds fetchByPrimaryKey(long rssFeedsId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)rssFeedsId);
	}

	/**
	 * Returns all the rss feedses.
	 *
	 * @return the rss feedses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssFeeds> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rss feedses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rss feedses
	 * @param end the upper bound of the range of rss feedses (not inclusive)
	 * @return the range of rss feedses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssFeeds> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rss feedses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rss feedses
	 * @param end the upper bound of the range of rss feedses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rss feedses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssFeeds> findAll(int start, int end,
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

		List<RssFeeds> list = (List<RssFeeds>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RSSFEEDS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RSSFEEDS;

				if (pagination) {
					sql = sql.concat(RssFeedsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RssFeeds>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RssFeeds>(list);
				}
				else {
					list = (List<RssFeeds>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the rss feedses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (RssFeeds rssFeeds : findAll()) {
			remove(rssFeeds);
		}
	}

	/**
	 * Returns the number of rss feedses.
	 *
	 * @return the number of rss feedses
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

				Query q = session.createQuery(_SQL_COUNT_RSSFEEDS);

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
	 * Initializes the rss feeds persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vnpt.portal.rss.model.RssFeeds")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<RssFeeds>> listenersList = new ArrayList<ModelListener<RssFeeds>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<RssFeeds>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RssFeedsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_RSSFEEDS = "SELECT rssFeeds FROM RssFeeds rssFeeds";
	private static final String _SQL_SELECT_RSSFEEDS_WHERE = "SELECT rssFeeds FROM RssFeeds rssFeeds WHERE ";
	private static final String _SQL_COUNT_RSSFEEDS = "SELECT COUNT(rssFeeds) FROM RssFeeds rssFeeds";
	private static final String _SQL_COUNT_RSSFEEDS_WHERE = "SELECT COUNT(rssFeeds) FROM RssFeeds rssFeeds WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "rssFeeds.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RssFeeds exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RssFeeds exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RssFeedsPersistenceImpl.class);
	private static RssFeeds _nullRssFeeds = new RssFeedsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<RssFeeds> toCacheModel() {
				return _nullRssFeedsCacheModel;
			}
		};

	private static CacheModel<RssFeeds> _nullRssFeedsCacheModel = new CacheModel<RssFeeds>() {
			@Override
			public RssFeeds toEntityModel() {
				return _nullRssFeeds;
			}
		};
}
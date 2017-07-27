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

import com.vnpt.portal.rss.NoSuchRssConfigException;
import com.vnpt.portal.rss.model.RssConfig;
import com.vnpt.portal.rss.model.impl.RssConfigImpl;
import com.vnpt.portal.rss.model.impl.RssConfigModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the rss config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see RssConfigPersistence
 * @see RssConfigUtil
 * @generated
 */
public class RssConfigPersistenceImpl extends BasePersistenceImpl<RssConfig>
	implements RssConfigPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RssConfigUtil} to access the rss config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RssConfigImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RssConfigModelImpl.ENTITY_CACHE_ENABLED,
			RssConfigModelImpl.FINDER_CACHE_ENABLED, RssConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RssConfigModelImpl.ENTITY_CACHE_ENABLED,
			RssConfigModelImpl.FINDER_CACHE_ENABLED, RssConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RssConfigModelImpl.ENTITY_CACHE_ENABLED,
			RssConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(RssConfigModelImpl.ENTITY_CACHE_ENABLED,
			RssConfigModelImpl.FINDER_CACHE_ENABLED, RssConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(RssConfigModelImpl.ENTITY_CACHE_ENABLED,
			RssConfigModelImpl.FINDER_CACHE_ENABLED, RssConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			RssConfigModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(RssConfigModelImpl.ENTITY_CACHE_ENABLED,
			RssConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the rss configs where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching rss configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssConfig> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rss configs where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of rss configs
	 * @param end the upper bound of the range of rss configs (not inclusive)
	 * @return the range of matching rss configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssConfig> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the rss configs where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of rss configs
	 * @param end the upper bound of the range of rss configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rss configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssConfig> findByGroupId(long groupId, int start, int end,
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

		List<RssConfig> list = (List<RssConfig>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (RssConfig rssConfig : list) {
				if ((groupId != rssConfig.getGroupId())) {
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

			query.append(_SQL_SELECT_RSSCONFIG_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RssConfigModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<RssConfig>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RssConfig>(list);
				}
				else {
					list = (List<RssConfig>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first rss config in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rss config
	 * @throws com.vnpt.portal.rss.NoSuchRssConfigException if a matching rss config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssConfig findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchRssConfigException, SystemException {
		RssConfig rssConfig = fetchByGroupId_First(groupId, orderByComparator);

		if (rssConfig != null) {
			return rssConfig;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRssConfigException(msg.toString());
	}

	/**
	 * Returns the first rss config in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rss config, or <code>null</code> if a matching rss config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssConfig fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<RssConfig> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last rss config in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rss config
	 * @throws com.vnpt.portal.rss.NoSuchRssConfigException if a matching rss config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssConfig findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchRssConfigException, SystemException {
		RssConfig rssConfig = fetchByGroupId_Last(groupId, orderByComparator);

		if (rssConfig != null) {
			return rssConfig;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRssConfigException(msg.toString());
	}

	/**
	 * Returns the last rss config in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rss config, or <code>null</code> if a matching rss config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssConfig fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<RssConfig> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the rss configs before and after the current rss config in the ordered set where groupId = &#63;.
	 *
	 * @param rssConfigId the primary key of the current rss config
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next rss config
	 * @throws com.vnpt.portal.rss.NoSuchRssConfigException if a rss config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssConfig[] findByGroupId_PrevAndNext(long rssConfigId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchRssConfigException, SystemException {
		RssConfig rssConfig = findByPrimaryKey(rssConfigId);

		Session session = null;

		try {
			session = openSession();

			RssConfig[] array = new RssConfigImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, rssConfig, groupId,
					orderByComparator, true);

			array[1] = rssConfig;

			array[2] = getByGroupId_PrevAndNext(session, rssConfig, groupId,
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

	protected RssConfig getByGroupId_PrevAndNext(Session session,
		RssConfig rssConfig, long groupId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RSSCONFIG_WHERE);

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
			query.append(RssConfigModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(rssConfig);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RssConfig> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the rss configs where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (RssConfig rssConfig : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(rssConfig);
		}
	}

	/**
	 * Returns the number of rss configs where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching rss configs
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

			query.append(_SQL_COUNT_RSSCONFIG_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "rssConfig.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(RssConfigModelImpl.ENTITY_CACHE_ENABLED,
			RssConfigModelImpl.FINDER_CACHE_ENABLED, RssConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(RssConfigModelImpl.ENTITY_CACHE_ENABLED,
			RssConfigModelImpl.FINDER_CACHE_ENABLED, RssConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			RssConfigModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(RssConfigModelImpl.ENTITY_CACHE_ENABLED,
			RssConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the rss configs where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching rss configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssConfig> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the rss configs where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of rss configs
	 * @param end the upper bound of the range of rss configs (not inclusive)
	 * @return the range of matching rss configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssConfig> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the rss configs where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of rss configs
	 * @param end the upper bound of the range of rss configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rss configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssConfig> findByCompanyId(long companyId, int start, int end,
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

		List<RssConfig> list = (List<RssConfig>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (RssConfig rssConfig : list) {
				if ((companyId != rssConfig.getCompanyId())) {
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

			query.append(_SQL_SELECT_RSSCONFIG_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RssConfigModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<RssConfig>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RssConfig>(list);
				}
				else {
					list = (List<RssConfig>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first rss config in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rss config
	 * @throws com.vnpt.portal.rss.NoSuchRssConfigException if a matching rss config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssConfig findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchRssConfigException, SystemException {
		RssConfig rssConfig = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (rssConfig != null) {
			return rssConfig;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRssConfigException(msg.toString());
	}

	/**
	 * Returns the first rss config in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rss config, or <code>null</code> if a matching rss config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssConfig fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<RssConfig> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last rss config in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rss config
	 * @throws com.vnpt.portal.rss.NoSuchRssConfigException if a matching rss config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssConfig findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchRssConfigException, SystemException {
		RssConfig rssConfig = fetchByCompanyId_Last(companyId, orderByComparator);

		if (rssConfig != null) {
			return rssConfig;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRssConfigException(msg.toString());
	}

	/**
	 * Returns the last rss config in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rss config, or <code>null</code> if a matching rss config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssConfig fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<RssConfig> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the rss configs before and after the current rss config in the ordered set where companyId = &#63;.
	 *
	 * @param rssConfigId the primary key of the current rss config
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next rss config
	 * @throws com.vnpt.portal.rss.NoSuchRssConfigException if a rss config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssConfig[] findByCompanyId_PrevAndNext(long rssConfigId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchRssConfigException, SystemException {
		RssConfig rssConfig = findByPrimaryKey(rssConfigId);

		Session session = null;

		try {
			session = openSession();

			RssConfig[] array = new RssConfigImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, rssConfig,
					companyId, orderByComparator, true);

			array[1] = rssConfig;

			array[2] = getByCompanyId_PrevAndNext(session, rssConfig,
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

	protected RssConfig getByCompanyId_PrevAndNext(Session session,
		RssConfig rssConfig, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RSSCONFIG_WHERE);

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
			query.append(RssConfigModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(rssConfig);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RssConfig> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the rss configs where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (RssConfig rssConfig : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(rssConfig);
		}
	}

	/**
	 * Returns the number of rss configs where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching rss configs
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

			query.append(_SQL_COUNT_RSSCONFIG_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "rssConfig.companyId = ?";

	public RssConfigPersistenceImpl() {
		setModelClass(RssConfig.class);
	}

	/**
	 * Caches the rss config in the entity cache if it is enabled.
	 *
	 * @param rssConfig the rss config
	 */
	@Override
	public void cacheResult(RssConfig rssConfig) {
		EntityCacheUtil.putResult(RssConfigModelImpl.ENTITY_CACHE_ENABLED,
			RssConfigImpl.class, rssConfig.getPrimaryKey(), rssConfig);

		rssConfig.resetOriginalValues();
	}

	/**
	 * Caches the rss configs in the entity cache if it is enabled.
	 *
	 * @param rssConfigs the rss configs
	 */
	@Override
	public void cacheResult(List<RssConfig> rssConfigs) {
		for (RssConfig rssConfig : rssConfigs) {
			if (EntityCacheUtil.getResult(
						RssConfigModelImpl.ENTITY_CACHE_ENABLED,
						RssConfigImpl.class, rssConfig.getPrimaryKey()) == null) {
				cacheResult(rssConfig);
			}
			else {
				rssConfig.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all rss configs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RssConfigImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RssConfigImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the rss config.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RssConfig rssConfig) {
		EntityCacheUtil.removeResult(RssConfigModelImpl.ENTITY_CACHE_ENABLED,
			RssConfigImpl.class, rssConfig.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RssConfig> rssConfigs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RssConfig rssConfig : rssConfigs) {
			EntityCacheUtil.removeResult(RssConfigModelImpl.ENTITY_CACHE_ENABLED,
				RssConfigImpl.class, rssConfig.getPrimaryKey());
		}
	}

	/**
	 * Creates a new rss config with the primary key. Does not add the rss config to the database.
	 *
	 * @param rssConfigId the primary key for the new rss config
	 * @return the new rss config
	 */
	@Override
	public RssConfig create(long rssConfigId) {
		RssConfig rssConfig = new RssConfigImpl();

		rssConfig.setNew(true);
		rssConfig.setPrimaryKey(rssConfigId);

		return rssConfig;
	}

	/**
	 * Removes the rss config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param rssConfigId the primary key of the rss config
	 * @return the rss config that was removed
	 * @throws com.vnpt.portal.rss.NoSuchRssConfigException if a rss config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssConfig remove(long rssConfigId)
		throws NoSuchRssConfigException, SystemException {
		return remove((Serializable)rssConfigId);
	}

	/**
	 * Removes the rss config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rss config
	 * @return the rss config that was removed
	 * @throws com.vnpt.portal.rss.NoSuchRssConfigException if a rss config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssConfig remove(Serializable primaryKey)
		throws NoSuchRssConfigException, SystemException {
		Session session = null;

		try {
			session = openSession();

			RssConfig rssConfig = (RssConfig)session.get(RssConfigImpl.class,
					primaryKey);

			if (rssConfig == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRssConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(rssConfig);
		}
		catch (NoSuchRssConfigException nsee) {
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
	protected RssConfig removeImpl(RssConfig rssConfig)
		throws SystemException {
		rssConfig = toUnwrappedModel(rssConfig);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rssConfig)) {
				rssConfig = (RssConfig)session.get(RssConfigImpl.class,
						rssConfig.getPrimaryKeyObj());
			}

			if (rssConfig != null) {
				session.delete(rssConfig);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (rssConfig != null) {
			clearCache(rssConfig);
		}

		return rssConfig;
	}

	@Override
	public RssConfig updateImpl(com.vnpt.portal.rss.model.RssConfig rssConfig)
		throws SystemException {
		rssConfig = toUnwrappedModel(rssConfig);

		boolean isNew = rssConfig.isNew();

		RssConfigModelImpl rssConfigModelImpl = (RssConfigModelImpl)rssConfig;

		Session session = null;

		try {
			session = openSession();

			if (rssConfig.isNew()) {
				session.save(rssConfig);

				rssConfig.setNew(false);
			}
			else {
				session.merge(rssConfig);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !RssConfigModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((rssConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						rssConfigModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { rssConfigModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((rssConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						rssConfigModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { rssConfigModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}
		}

		EntityCacheUtil.putResult(RssConfigModelImpl.ENTITY_CACHE_ENABLED,
			RssConfigImpl.class, rssConfig.getPrimaryKey(), rssConfig);

		return rssConfig;
	}

	protected RssConfig toUnwrappedModel(RssConfig rssConfig) {
		if (rssConfig instanceof RssConfigImpl) {
			return rssConfig;
		}

		RssConfigImpl rssConfigImpl = new RssConfigImpl();

		rssConfigImpl.setNew(rssConfig.isNew());
		rssConfigImpl.setPrimaryKey(rssConfig.getPrimaryKey());

		rssConfigImpl.setRssConfigId(rssConfig.getRssConfigId());
		rssConfigImpl.setGroupId(rssConfig.getGroupId());
		rssConfigImpl.setCompanyId(rssConfig.getCompanyId());
		rssConfigImpl.setTitle(rssConfig.getTitle());
		rssConfigImpl.setUrl(rssConfig.getUrl());
		rssConfigImpl.setTotalFeed(rssConfig.getTotalFeed());
		rssConfigImpl.setRssCategoryId(rssConfig.getRssCategoryId());

		return rssConfigImpl;
	}

	/**
	 * Returns the rss config with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the rss config
	 * @return the rss config
	 * @throws com.vnpt.portal.rss.NoSuchRssConfigException if a rss config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssConfig findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRssConfigException, SystemException {
		RssConfig rssConfig = fetchByPrimaryKey(primaryKey);

		if (rssConfig == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRssConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return rssConfig;
	}

	/**
	 * Returns the rss config with the primary key or throws a {@link com.vnpt.portal.rss.NoSuchRssConfigException} if it could not be found.
	 *
	 * @param rssConfigId the primary key of the rss config
	 * @return the rss config
	 * @throws com.vnpt.portal.rss.NoSuchRssConfigException if a rss config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssConfig findByPrimaryKey(long rssConfigId)
		throws NoSuchRssConfigException, SystemException {
		return findByPrimaryKey((Serializable)rssConfigId);
	}

	/**
	 * Returns the rss config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rss config
	 * @return the rss config, or <code>null</code> if a rss config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssConfig fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		RssConfig rssConfig = (RssConfig)EntityCacheUtil.getResult(RssConfigModelImpl.ENTITY_CACHE_ENABLED,
				RssConfigImpl.class, primaryKey);

		if (rssConfig == _nullRssConfig) {
			return null;
		}

		if (rssConfig == null) {
			Session session = null;

			try {
				session = openSession();

				rssConfig = (RssConfig)session.get(RssConfigImpl.class,
						primaryKey);

				if (rssConfig != null) {
					cacheResult(rssConfig);
				}
				else {
					EntityCacheUtil.putResult(RssConfigModelImpl.ENTITY_CACHE_ENABLED,
						RssConfigImpl.class, primaryKey, _nullRssConfig);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(RssConfigModelImpl.ENTITY_CACHE_ENABLED,
					RssConfigImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return rssConfig;
	}

	/**
	 * Returns the rss config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param rssConfigId the primary key of the rss config
	 * @return the rss config, or <code>null</code> if a rss config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssConfig fetchByPrimaryKey(long rssConfigId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)rssConfigId);
	}

	/**
	 * Returns all the rss configs.
	 *
	 * @return the rss configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssConfig> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rss configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rss configs
	 * @param end the upper bound of the range of rss configs (not inclusive)
	 * @return the range of rss configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssConfig> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rss configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rss configs
	 * @param end the upper bound of the range of rss configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rss configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssConfig> findAll(int start, int end,
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

		List<RssConfig> list = (List<RssConfig>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RSSCONFIG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RSSCONFIG;

				if (pagination) {
					sql = sql.concat(RssConfigModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RssConfig>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RssConfig>(list);
				}
				else {
					list = (List<RssConfig>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the rss configs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (RssConfig rssConfig : findAll()) {
			remove(rssConfig);
		}
	}

	/**
	 * Returns the number of rss configs.
	 *
	 * @return the number of rss configs
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

				Query q = session.createQuery(_SQL_COUNT_RSSCONFIG);

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
	 * Initializes the rss config persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vnpt.portal.rss.model.RssConfig")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<RssConfig>> listenersList = new ArrayList<ModelListener<RssConfig>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<RssConfig>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RssConfigImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_RSSCONFIG = "SELECT rssConfig FROM RssConfig rssConfig";
	private static final String _SQL_SELECT_RSSCONFIG_WHERE = "SELECT rssConfig FROM RssConfig rssConfig WHERE ";
	private static final String _SQL_COUNT_RSSCONFIG = "SELECT COUNT(rssConfig) FROM RssConfig rssConfig";
	private static final String _SQL_COUNT_RSSCONFIG_WHERE = "SELECT COUNT(rssConfig) FROM RssConfig rssConfig WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "rssConfig.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RssConfig exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RssConfig exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RssConfigPersistenceImpl.class);
	private static RssConfig _nullRssConfig = new RssConfigImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<RssConfig> toCacheModel() {
				return _nullRssConfigCacheModel;
			}
		};

	private static CacheModel<RssConfig> _nullRssConfigCacheModel = new CacheModel<RssConfig>() {
			@Override
			public RssConfig toEntityModel() {
				return _nullRssConfig;
			}
		};
}
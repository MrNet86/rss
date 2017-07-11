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

import com.viettel.ams.core.NoSuchSysGroupException;
import com.viettel.ams.core.model.SysGroup;
import com.viettel.ams.core.model.impl.SysGroupImpl;
import com.viettel.ams.core.model.impl.SysGroupModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the sys group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see SysGroupPersistence
 * @see SysGroupUtil
 * @generated
 */
public class SysGroupPersistenceImpl extends BasePersistenceImpl<SysGroup>
	implements SysGroupPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SysGroupUtil} to access the sys group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SysGroupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
			SysGroupModelImpl.FINDER_CACHE_ENABLED, SysGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
			SysGroupModelImpl.FINDER_CACHE_ENABLED, SysGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
			SysGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME = new FinderPath(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
			SysGroupModelImpl.FINDER_CACHE_ENABLED, SysGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByname",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME = new FinderPath(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
			SysGroupModelImpl.FINDER_CACHE_ENABLED, SysGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByname",
			new String[] { String.class.getName(), Long.class.getName() },
			SysGroupModelImpl.NAME_COLUMN_BITMASK |
			SysGroupModelImpl.STATUS_COLUMN_BITMASK |
			SysGroupModelImpl.GROUPCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NAME = new FinderPath(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
			SysGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByname",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the sys groups where name = &#63; and status = &#63;.
	 *
	 * @param name the name
	 * @param status the status
	 * @return the matching sys groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SysGroup> findByname(String name, Long status)
		throws SystemException {
		return findByname(name, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the sys groups where name = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.SysGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param status the status
	 * @param start the lower bound of the range of sys groups
	 * @param end the upper bound of the range of sys groups (not inclusive)
	 * @return the range of matching sys groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SysGroup> findByname(String name, Long status, int start,
		int end) throws SystemException {
		return findByname(name, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sys groups where name = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.SysGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param status the status
	 * @param start the lower bound of the range of sys groups
	 * @param end the upper bound of the range of sys groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sys groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SysGroup> findByname(String name, Long status, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME;
			finderArgs = new Object[] { name, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME;
			finderArgs = new Object[] {
					name, status,
					
					start, end, orderByComparator
				};
		}

		List<SysGroup> list = (List<SysGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SysGroup sysGroup : list) {
				if (!Validator.equals(name, sysGroup.getName()) ||
						!Validator.equals(status, sysGroup.getStatus())) {
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

			query.append(_SQL_SELECT_SYSGROUP_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			query.append(_FINDER_COLUMN_NAME_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SysGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				qPos.add(status.longValue());

				if (!pagination) {
					list = (List<SysGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SysGroup>(list);
				}
				else {
					list = (List<SysGroup>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first sys group in the ordered set where name = &#63; and status = &#63;.
	 *
	 * @param name the name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sys group
	 * @throws com.viettel.ams.core.NoSuchSysGroupException if a matching sys group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup findByname_First(String name, Long status,
		OrderByComparator orderByComparator)
		throws NoSuchSysGroupException, SystemException {
		SysGroup sysGroup = fetchByname_First(name, status, orderByComparator);

		if (sysGroup != null) {
			return sysGroup;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSysGroupException(msg.toString());
	}

	/**
	 * Returns the first sys group in the ordered set where name = &#63; and status = &#63;.
	 *
	 * @param name the name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sys group, or <code>null</code> if a matching sys group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup fetchByname_First(String name, Long status,
		OrderByComparator orderByComparator) throws SystemException {
		List<SysGroup> list = findByname(name, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sys group in the ordered set where name = &#63; and status = &#63;.
	 *
	 * @param name the name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sys group
	 * @throws com.viettel.ams.core.NoSuchSysGroupException if a matching sys group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup findByname_Last(String name, Long status,
		OrderByComparator orderByComparator)
		throws NoSuchSysGroupException, SystemException {
		SysGroup sysGroup = fetchByname_Last(name, status, orderByComparator);

		if (sysGroup != null) {
			return sysGroup;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSysGroupException(msg.toString());
	}

	/**
	 * Returns the last sys group in the ordered set where name = &#63; and status = &#63;.
	 *
	 * @param name the name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sys group, or <code>null</code> if a matching sys group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup fetchByname_Last(String name, Long status,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByname(name, status);

		if (count == 0) {
			return null;
		}

		List<SysGroup> list = findByname(name, status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sys groups before and after the current sys group in the ordered set where name = &#63; and status = &#63;.
	 *
	 * @param groupId the primary key of the current sys group
	 * @param name the name
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sys group
	 * @throws com.viettel.ams.core.NoSuchSysGroupException if a sys group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup[] findByname_PrevAndNext(long groupId, String name,
		Long status, OrderByComparator orderByComparator)
		throws NoSuchSysGroupException, SystemException {
		SysGroup sysGroup = findByPrimaryKey(groupId);

		Session session = null;

		try {
			session = openSession();

			SysGroup[] array = new SysGroupImpl[3];

			array[0] = getByname_PrevAndNext(session, sysGroup, name, status,
					orderByComparator, true);

			array[1] = sysGroup;

			array[2] = getByname_PrevAndNext(session, sysGroup, name, status,
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

	protected SysGroup getByname_PrevAndNext(Session session,
		SysGroup sysGroup, String name, Long status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SYSGROUP_WHERE);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_NAME_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NAME_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_NAME_NAME_2);
		}

		query.append(_FINDER_COLUMN_NAME_STATUS_2);

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
			query.append(SysGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindName) {
			qPos.add(name);
		}

		qPos.add(status.longValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(sysGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SysGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sys groups where name = &#63; and status = &#63; from the database.
	 *
	 * @param name the name
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByname(String name, Long status)
		throws SystemException {
		for (SysGroup sysGroup : findByname(name, status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(sysGroup);
		}
	}

	/**
	 * Returns the number of sys groups where name = &#63; and status = &#63;.
	 *
	 * @param name the name
	 * @param status the status
	 * @return the number of matching sys groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByname(String name, Long status) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NAME;

		Object[] finderArgs = new Object[] { name, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SYSGROUP_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			query.append(_FINDER_COLUMN_NAME_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				qPos.add(status.longValue());

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

	private static final String _FINDER_COLUMN_NAME_NAME_1 = "sysGroup.name IS NULL AND ";
	private static final String _FINDER_COLUMN_NAME_NAME_2 = "sysGroup.name = ? AND ";
	private static final String _FINDER_COLUMN_NAME_NAME_3 = "(sysGroup.name IS NULL OR sysGroup.name = '') AND ";
	private static final String _FINDER_COLUMN_NAME_STATUS_2 = "sysGroup.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPCODE =
		new FinderPath(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
			SysGroupModelImpl.FINDER_CACHE_ENABLED, SysGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygroupCode",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPCODE =
		new FinderPath(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
			SysGroupModelImpl.FINDER_CACHE_ENABLED, SysGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygroupCode",
			new String[] { String.class.getName(), Long.class.getName() },
			SysGroupModelImpl.GROUPCODE_COLUMN_BITMASK |
			SysGroupModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPCODE = new FinderPath(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
			SysGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygroupCode",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the sys groups where groupCode = &#63; and status = &#63;.
	 *
	 * @param groupCode the group code
	 * @param status the status
	 * @return the matching sys groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SysGroup> findBygroupCode(String groupCode, Long status)
		throws SystemException {
		return findBygroupCode(groupCode, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sys groups where groupCode = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.SysGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupCode the group code
	 * @param status the status
	 * @param start the lower bound of the range of sys groups
	 * @param end the upper bound of the range of sys groups (not inclusive)
	 * @return the range of matching sys groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SysGroup> findBygroupCode(String groupCode, Long status,
		int start, int end) throws SystemException {
		return findBygroupCode(groupCode, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sys groups where groupCode = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.SysGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupCode the group code
	 * @param status the status
	 * @param start the lower bound of the range of sys groups
	 * @param end the upper bound of the range of sys groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sys groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SysGroup> findBygroupCode(String groupCode, Long status,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPCODE;
			finderArgs = new Object[] { groupCode, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPCODE;
			finderArgs = new Object[] {
					groupCode, status,
					
					start, end, orderByComparator
				};
		}

		List<SysGroup> list = (List<SysGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SysGroup sysGroup : list) {
				if (!Validator.equals(groupCode, sysGroup.getGroupCode()) ||
						!Validator.equals(status, sysGroup.getStatus())) {
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

			query.append(_SQL_SELECT_SYSGROUP_WHERE);

			boolean bindGroupCode = false;

			if (groupCode == null) {
				query.append(_FINDER_COLUMN_GROUPCODE_GROUPCODE_1);
			}
			else if (groupCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GROUPCODE_GROUPCODE_3);
			}
			else {
				bindGroupCode = true;

				query.append(_FINDER_COLUMN_GROUPCODE_GROUPCODE_2);
			}

			query.append(_FINDER_COLUMN_GROUPCODE_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SysGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGroupCode) {
					qPos.add(groupCode);
				}

				qPos.add(status.longValue());

				if (!pagination) {
					list = (List<SysGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SysGroup>(list);
				}
				else {
					list = (List<SysGroup>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first sys group in the ordered set where groupCode = &#63; and status = &#63;.
	 *
	 * @param groupCode the group code
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sys group
	 * @throws com.viettel.ams.core.NoSuchSysGroupException if a matching sys group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup findBygroupCode_First(String groupCode, Long status,
		OrderByComparator orderByComparator)
		throws NoSuchSysGroupException, SystemException {
		SysGroup sysGroup = fetchBygroupCode_First(groupCode, status,
				orderByComparator);

		if (sysGroup != null) {
			return sysGroup;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupCode=");
		msg.append(groupCode);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSysGroupException(msg.toString());
	}

	/**
	 * Returns the first sys group in the ordered set where groupCode = &#63; and status = &#63;.
	 *
	 * @param groupCode the group code
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sys group, or <code>null</code> if a matching sys group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup fetchBygroupCode_First(String groupCode, Long status,
		OrderByComparator orderByComparator) throws SystemException {
		List<SysGroup> list = findBygroupCode(groupCode, status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sys group in the ordered set where groupCode = &#63; and status = &#63;.
	 *
	 * @param groupCode the group code
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sys group
	 * @throws com.viettel.ams.core.NoSuchSysGroupException if a matching sys group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup findBygroupCode_Last(String groupCode, Long status,
		OrderByComparator orderByComparator)
		throws NoSuchSysGroupException, SystemException {
		SysGroup sysGroup = fetchBygroupCode_Last(groupCode, status,
				orderByComparator);

		if (sysGroup != null) {
			return sysGroup;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupCode=");
		msg.append(groupCode);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSysGroupException(msg.toString());
	}

	/**
	 * Returns the last sys group in the ordered set where groupCode = &#63; and status = &#63;.
	 *
	 * @param groupCode the group code
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sys group, or <code>null</code> if a matching sys group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup fetchBygroupCode_Last(String groupCode, Long status,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBygroupCode(groupCode, status);

		if (count == 0) {
			return null;
		}

		List<SysGroup> list = findBygroupCode(groupCode, status, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sys groups before and after the current sys group in the ordered set where groupCode = &#63; and status = &#63;.
	 *
	 * @param groupId the primary key of the current sys group
	 * @param groupCode the group code
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sys group
	 * @throws com.viettel.ams.core.NoSuchSysGroupException if a sys group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup[] findBygroupCode_PrevAndNext(long groupId,
		String groupCode, Long status, OrderByComparator orderByComparator)
		throws NoSuchSysGroupException, SystemException {
		SysGroup sysGroup = findByPrimaryKey(groupId);

		Session session = null;

		try {
			session = openSession();

			SysGroup[] array = new SysGroupImpl[3];

			array[0] = getBygroupCode_PrevAndNext(session, sysGroup, groupCode,
					status, orderByComparator, true);

			array[1] = sysGroup;

			array[2] = getBygroupCode_PrevAndNext(session, sysGroup, groupCode,
					status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected SysGroup getBygroupCode_PrevAndNext(Session session,
		SysGroup sysGroup, String groupCode, Long status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SYSGROUP_WHERE);

		boolean bindGroupCode = false;

		if (groupCode == null) {
			query.append(_FINDER_COLUMN_GROUPCODE_GROUPCODE_1);
		}
		else if (groupCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_GROUPCODE_GROUPCODE_3);
		}
		else {
			bindGroupCode = true;

			query.append(_FINDER_COLUMN_GROUPCODE_GROUPCODE_2);
		}

		query.append(_FINDER_COLUMN_GROUPCODE_STATUS_2);

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
			query.append(SysGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindGroupCode) {
			qPos.add(groupCode);
		}

		qPos.add(status.longValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(sysGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SysGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sys groups where groupCode = &#63; and status = &#63; from the database.
	 *
	 * @param groupCode the group code
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBygroupCode(String groupCode, Long status)
		throws SystemException {
		for (SysGroup sysGroup : findBygroupCode(groupCode, status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(sysGroup);
		}
	}

	/**
	 * Returns the number of sys groups where groupCode = &#63; and status = &#63;.
	 *
	 * @param groupCode the group code
	 * @param status the status
	 * @return the number of matching sys groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBygroupCode(String groupCode, Long status)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPCODE;

		Object[] finderArgs = new Object[] { groupCode, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SYSGROUP_WHERE);

			boolean bindGroupCode = false;

			if (groupCode == null) {
				query.append(_FINDER_COLUMN_GROUPCODE_GROUPCODE_1);
			}
			else if (groupCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GROUPCODE_GROUPCODE_3);
			}
			else {
				bindGroupCode = true;

				query.append(_FINDER_COLUMN_GROUPCODE_GROUPCODE_2);
			}

			query.append(_FINDER_COLUMN_GROUPCODE_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindGroupCode) {
					qPos.add(groupCode);
				}

				qPos.add(status.longValue());

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

	private static final String _FINDER_COLUMN_GROUPCODE_GROUPCODE_1 = "sysGroup.groupCode IS NULL AND ";
	private static final String _FINDER_COLUMN_GROUPCODE_GROUPCODE_2 = "sysGroup.groupCode = ? AND ";
	private static final String _FINDER_COLUMN_GROUPCODE_GROUPCODE_3 = "(sysGroup.groupCode IS NULL OR sysGroup.groupCode = '') AND ";
	private static final String _FINDER_COLUMN_GROUPCODE_STATUS_2 = "sysGroup.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PATH = new FinderPath(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
			SysGroupModelImpl.FINDER_CACHE_ENABLED, SysGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBypath",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PATH = new FinderPath(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
			SysGroupModelImpl.FINDER_CACHE_ENABLED, SysGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBypath",
			new String[] { String.class.getName(), Long.class.getName() },
			SysGroupModelImpl.PATH_COLUMN_BITMASK |
			SysGroupModelImpl.STATUS_COLUMN_BITMASK |
			SysGroupModelImpl.GROUPCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PATH = new FinderPath(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
			SysGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBypath",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the sys groups where path = &#63; and status = &#63;.
	 *
	 * @param path the path
	 * @param status the status
	 * @return the matching sys groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SysGroup> findBypath(String path, Long status)
		throws SystemException {
		return findBypath(path, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the sys groups where path = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.SysGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param path the path
	 * @param status the status
	 * @param start the lower bound of the range of sys groups
	 * @param end the upper bound of the range of sys groups (not inclusive)
	 * @return the range of matching sys groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SysGroup> findBypath(String path, Long status, int start,
		int end) throws SystemException {
		return findBypath(path, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sys groups where path = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.SysGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param path the path
	 * @param status the status
	 * @param start the lower bound of the range of sys groups
	 * @param end the upper bound of the range of sys groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sys groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SysGroup> findBypath(String path, Long status, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PATH;
			finderArgs = new Object[] { path, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PATH;
			finderArgs = new Object[] {
					path, status,
					
					start, end, orderByComparator
				};
		}

		List<SysGroup> list = (List<SysGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (SysGroup sysGroup : list) {
				if (!Validator.equals(path, sysGroup.getPath()) ||
						!Validator.equals(status, sysGroup.getStatus())) {
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

			query.append(_SQL_SELECT_SYSGROUP_WHERE);

			boolean bindPath = false;

			if (path == null) {
				query.append(_FINDER_COLUMN_PATH_PATH_1);
			}
			else if (path.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PATH_PATH_3);
			}
			else {
				bindPath = true;

				query.append(_FINDER_COLUMN_PATH_PATH_2);
			}

			query.append(_FINDER_COLUMN_PATH_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SysGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPath) {
					qPos.add(path);
				}

				qPos.add(status.longValue());

				if (!pagination) {
					list = (List<SysGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SysGroup>(list);
				}
				else {
					list = (List<SysGroup>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first sys group in the ordered set where path = &#63; and status = &#63;.
	 *
	 * @param path the path
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sys group
	 * @throws com.viettel.ams.core.NoSuchSysGroupException if a matching sys group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup findBypath_First(String path, Long status,
		OrderByComparator orderByComparator)
		throws NoSuchSysGroupException, SystemException {
		SysGroup sysGroup = fetchBypath_First(path, status, orderByComparator);

		if (sysGroup != null) {
			return sysGroup;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("path=");
		msg.append(path);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSysGroupException(msg.toString());
	}

	/**
	 * Returns the first sys group in the ordered set where path = &#63; and status = &#63;.
	 *
	 * @param path the path
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sys group, or <code>null</code> if a matching sys group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup fetchBypath_First(String path, Long status,
		OrderByComparator orderByComparator) throws SystemException {
		List<SysGroup> list = findBypath(path, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sys group in the ordered set where path = &#63; and status = &#63;.
	 *
	 * @param path the path
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sys group
	 * @throws com.viettel.ams.core.NoSuchSysGroupException if a matching sys group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup findBypath_Last(String path, Long status,
		OrderByComparator orderByComparator)
		throws NoSuchSysGroupException, SystemException {
		SysGroup sysGroup = fetchBypath_Last(path, status, orderByComparator);

		if (sysGroup != null) {
			return sysGroup;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("path=");
		msg.append(path);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchSysGroupException(msg.toString());
	}

	/**
	 * Returns the last sys group in the ordered set where path = &#63; and status = &#63;.
	 *
	 * @param path the path
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sys group, or <code>null</code> if a matching sys group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup fetchBypath_Last(String path, Long status,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBypath(path, status);

		if (count == 0) {
			return null;
		}

		List<SysGroup> list = findBypath(path, status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sys groups before and after the current sys group in the ordered set where path = &#63; and status = &#63;.
	 *
	 * @param groupId the primary key of the current sys group
	 * @param path the path
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sys group
	 * @throws com.viettel.ams.core.NoSuchSysGroupException if a sys group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup[] findBypath_PrevAndNext(long groupId, String path,
		Long status, OrderByComparator orderByComparator)
		throws NoSuchSysGroupException, SystemException {
		SysGroup sysGroup = findByPrimaryKey(groupId);

		Session session = null;

		try {
			session = openSession();

			SysGroup[] array = new SysGroupImpl[3];

			array[0] = getBypath_PrevAndNext(session, sysGroup, path, status,
					orderByComparator, true);

			array[1] = sysGroup;

			array[2] = getBypath_PrevAndNext(session, sysGroup, path, status,
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

	protected SysGroup getBypath_PrevAndNext(Session session,
		SysGroup sysGroup, String path, Long status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SYSGROUP_WHERE);

		boolean bindPath = false;

		if (path == null) {
			query.append(_FINDER_COLUMN_PATH_PATH_1);
		}
		else if (path.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PATH_PATH_3);
		}
		else {
			bindPath = true;

			query.append(_FINDER_COLUMN_PATH_PATH_2);
		}

		query.append(_FINDER_COLUMN_PATH_STATUS_2);

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
			query.append(SysGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPath) {
			qPos.add(path);
		}

		qPos.add(status.longValue());

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(sysGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<SysGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sys groups where path = &#63; and status = &#63; from the database.
	 *
	 * @param path the path
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBypath(String path, Long status)
		throws SystemException {
		for (SysGroup sysGroup : findBypath(path, status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(sysGroup);
		}
	}

	/**
	 * Returns the number of sys groups where path = &#63; and status = &#63;.
	 *
	 * @param path the path
	 * @param status the status
	 * @return the number of matching sys groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBypath(String path, Long status) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PATH;

		Object[] finderArgs = new Object[] { path, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SYSGROUP_WHERE);

			boolean bindPath = false;

			if (path == null) {
				query.append(_FINDER_COLUMN_PATH_PATH_1);
			}
			else if (path.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PATH_PATH_3);
			}
			else {
				bindPath = true;

				query.append(_FINDER_COLUMN_PATH_PATH_2);
			}

			query.append(_FINDER_COLUMN_PATH_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPath) {
					qPos.add(path);
				}

				qPos.add(status.longValue());

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

	private static final String _FINDER_COLUMN_PATH_PATH_1 = "sysGroup.path IS NULL AND ";
	private static final String _FINDER_COLUMN_PATH_PATH_2 = "sysGroup.path = ? AND ";
	private static final String _FINDER_COLUMN_PATH_PATH_3 = "(sysGroup.path IS NULL OR sysGroup.path = '') AND ";
	private static final String _FINDER_COLUMN_PATH_STATUS_2 = "sysGroup.status = ?";

	public SysGroupPersistenceImpl() {
		setModelClass(SysGroup.class);
	}

	/**
	 * Caches the sys group in the entity cache if it is enabled.
	 *
	 * @param sysGroup the sys group
	 */
	@Override
	public void cacheResult(SysGroup sysGroup) {
		EntityCacheUtil.putResult(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
			SysGroupImpl.class, sysGroup.getPrimaryKey(), sysGroup);

		sysGroup.resetOriginalValues();
	}

	/**
	 * Caches the sys groups in the entity cache if it is enabled.
	 *
	 * @param sysGroups the sys groups
	 */
	@Override
	public void cacheResult(List<SysGroup> sysGroups) {
		for (SysGroup sysGroup : sysGroups) {
			if (EntityCacheUtil.getResult(
						SysGroupModelImpl.ENTITY_CACHE_ENABLED,
						SysGroupImpl.class, sysGroup.getPrimaryKey()) == null) {
				cacheResult(sysGroup);
			}
			else {
				sysGroup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all sys groups.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SysGroupImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SysGroupImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sys group.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SysGroup sysGroup) {
		EntityCacheUtil.removeResult(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
			SysGroupImpl.class, sysGroup.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SysGroup> sysGroups) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SysGroup sysGroup : sysGroups) {
			EntityCacheUtil.removeResult(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
				SysGroupImpl.class, sysGroup.getPrimaryKey());
		}
	}

	/**
	 * Creates a new sys group with the primary key. Does not add the sys group to the database.
	 *
	 * @param groupId the primary key for the new sys group
	 * @return the new sys group
	 */
	@Override
	public SysGroup create(long groupId) {
		SysGroup sysGroup = new SysGroupImpl();

		sysGroup.setNew(true);
		sysGroup.setPrimaryKey(groupId);

		return sysGroup;
	}

	/**
	 * Removes the sys group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param groupId the primary key of the sys group
	 * @return the sys group that was removed
	 * @throws com.viettel.ams.core.NoSuchSysGroupException if a sys group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup remove(long groupId)
		throws NoSuchSysGroupException, SystemException {
		return remove((Serializable)groupId);
	}

	/**
	 * Removes the sys group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sys group
	 * @return the sys group that was removed
	 * @throws com.viettel.ams.core.NoSuchSysGroupException if a sys group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup remove(Serializable primaryKey)
		throws NoSuchSysGroupException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SysGroup sysGroup = (SysGroup)session.get(SysGroupImpl.class,
					primaryKey);

			if (sysGroup == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSysGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(sysGroup);
		}
		catch (NoSuchSysGroupException nsee) {
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
	protected SysGroup removeImpl(SysGroup sysGroup) throws SystemException {
		sysGroup = toUnwrappedModel(sysGroup);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sysGroup)) {
				sysGroup = (SysGroup)session.get(SysGroupImpl.class,
						sysGroup.getPrimaryKeyObj());
			}

			if (sysGroup != null) {
				session.delete(sysGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (sysGroup != null) {
			clearCache(sysGroup);
		}

		return sysGroup;
	}

	@Override
	public SysGroup updateImpl(com.viettel.ams.core.model.SysGroup sysGroup)
		throws SystemException {
		sysGroup = toUnwrappedModel(sysGroup);

		boolean isNew = sysGroup.isNew();

		SysGroupModelImpl sysGroupModelImpl = (SysGroupModelImpl)sysGroup;

		Session session = null;

		try {
			session = openSession();

			if (sysGroup.isNew()) {
				session.save(sysGroup);

				sysGroup.setNew(false);
			}
			else {
				session.merge(sysGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !SysGroupModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((sysGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						sysGroupModelImpl.getOriginalName(),
						sysGroupModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
					args);

				args = new Object[] {
						sysGroupModelImpl.getName(),
						sysGroupModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
					args);
			}

			if ((sysGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						sysGroupModelImpl.getOriginalGroupCode(),
						sysGroupModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPCODE,
					args);

				args = new Object[] {
						sysGroupModelImpl.getGroupCode(),
						sysGroupModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPCODE,
					args);
			}

			if ((sysGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PATH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						sysGroupModelImpl.getOriginalPath(),
						sysGroupModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PATH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PATH,
					args);

				args = new Object[] {
						sysGroupModelImpl.getPath(),
						sysGroupModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PATH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PATH,
					args);
			}
		}

		EntityCacheUtil.putResult(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
			SysGroupImpl.class, sysGroup.getPrimaryKey(), sysGroup);

		return sysGroup;
	}

	protected SysGroup toUnwrappedModel(SysGroup sysGroup) {
		if (sysGroup instanceof SysGroupImpl) {
			return sysGroup;
		}

		SysGroupImpl sysGroupImpl = new SysGroupImpl();

		sysGroupImpl.setNew(sysGroup.isNew());
		sysGroupImpl.setPrimaryKey(sysGroup.getPrimaryKey());

		sysGroupImpl.setGroupId(sysGroup.getGroupId());
		sysGroupImpl.setName(sysGroup.getName());
		sysGroupImpl.setGroupCode(sysGroup.getGroupCode());
		sysGroupImpl.setFullName(sysGroup.getFullName());
		sysGroupImpl.setDescription(sysGroup.getDescription());
		sysGroupImpl.setProvinceId(sysGroup.getProvinceId());
		sysGroupImpl.setAddress(sysGroup.getAddress());
		sysGroupImpl.setParentId(sysGroup.getParentId());
		sysGroupImpl.setPath(sysGroup.getPath());
		sysGroupImpl.setStatus(sysGroup.getStatus());
		sysGroupImpl.setTitleName(sysGroup.getTitleName());
		sysGroupImpl.setIsOff(sysGroup.getIsOff());
		sysGroupImpl.setLockStatus(sysGroup.getLockStatus());

		return sysGroupImpl;
	}

	/**
	 * Returns the sys group with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the sys group
	 * @return the sys group
	 * @throws com.viettel.ams.core.NoSuchSysGroupException if a sys group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSysGroupException, SystemException {
		SysGroup sysGroup = fetchByPrimaryKey(primaryKey);

		if (sysGroup == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSysGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return sysGroup;
	}

	/**
	 * Returns the sys group with the primary key or throws a {@link com.viettel.ams.core.NoSuchSysGroupException} if it could not be found.
	 *
	 * @param groupId the primary key of the sys group
	 * @return the sys group
	 * @throws com.viettel.ams.core.NoSuchSysGroupException if a sys group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup findByPrimaryKey(long groupId)
		throws NoSuchSysGroupException, SystemException {
		return findByPrimaryKey((Serializable)groupId);
	}

	/**
	 * Returns the sys group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sys group
	 * @return the sys group, or <code>null</code> if a sys group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		SysGroup sysGroup = (SysGroup)EntityCacheUtil.getResult(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
				SysGroupImpl.class, primaryKey);

		if (sysGroup == _nullSysGroup) {
			return null;
		}

		if (sysGroup == null) {
			Session session = null;

			try {
				session = openSession();

				sysGroup = (SysGroup)session.get(SysGroupImpl.class, primaryKey);

				if (sysGroup != null) {
					cacheResult(sysGroup);
				}
				else {
					EntityCacheUtil.putResult(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
						SysGroupImpl.class, primaryKey, _nullSysGroup);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SysGroupModelImpl.ENTITY_CACHE_ENABLED,
					SysGroupImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return sysGroup;
	}

	/**
	 * Returns the sys group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param groupId the primary key of the sys group
	 * @return the sys group, or <code>null</code> if a sys group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SysGroup fetchByPrimaryKey(long groupId) throws SystemException {
		return fetchByPrimaryKey((Serializable)groupId);
	}

	/**
	 * Returns all the sys groups.
	 *
	 * @return the sys groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SysGroup> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sys groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.SysGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sys groups
	 * @param end the upper bound of the range of sys groups (not inclusive)
	 * @return the range of sys groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SysGroup> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sys groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.SysGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sys groups
	 * @param end the upper bound of the range of sys groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sys groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<SysGroup> findAll(int start, int end,
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

		List<SysGroup> list = (List<SysGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SYSGROUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SYSGROUP;

				if (pagination) {
					sql = sql.concat(SysGroupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SysGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<SysGroup>(list);
				}
				else {
					list = (List<SysGroup>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the sys groups from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (SysGroup sysGroup : findAll()) {
			remove(sysGroup);
		}
	}

	/**
	 * Returns the number of sys groups.
	 *
	 * @return the number of sys groups
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

				Query q = session.createQuery(_SQL_COUNT_SYSGROUP);

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
	 * Initializes the sys group persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.viettel.ams.core.model.SysGroup")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SysGroup>> listenersList = new ArrayList<ModelListener<SysGroup>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SysGroup>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SysGroupImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SYSGROUP = "SELECT sysGroup FROM SysGroup sysGroup";
	private static final String _SQL_SELECT_SYSGROUP_WHERE = "SELECT sysGroup FROM SysGroup sysGroup WHERE ";
	private static final String _SQL_COUNT_SYSGROUP = "SELECT COUNT(sysGroup) FROM SysGroup sysGroup";
	private static final String _SQL_COUNT_SYSGROUP_WHERE = "SELECT COUNT(sysGroup) FROM SysGroup sysGroup WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "sysGroup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SysGroup exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No SysGroup exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SysGroupPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"groupId", "name", "groupCode", "fullName", "description",
				"provinceId", "parentId", "status", "titleName", "isOff",
				"lockStatus"
			});
	private static SysGroup _nullSysGroup = new SysGroupImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SysGroup> toCacheModel() {
				return _nullSysGroupCacheModel;
			}
		};

	private static CacheModel<SysGroup> _nullSysGroupCacheModel = new CacheModel<SysGroup>() {
			@Override
			public SysGroup toEntityModel() {
				return _nullSysGroup;
			}
		};
}
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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vnpt.portlet.user.NoSuchGroupUsersException;
import com.vnpt.portlet.user.model.GroupUsers;
import com.vnpt.portlet.user.model.impl.GroupUsersImpl;
import com.vnpt.portlet.user.model.impl.GroupUsersModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the group users service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see GroupUsersPersistence
 * @see GroupUsersUtil
 * @generated
 */
public class GroupUsersPersistenceImpl extends BasePersistenceImpl<GroupUsers>
	implements GroupUsersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link GroupUsersUtil} to access the group users persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = GroupUsersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
			GroupUsersModelImpl.FINDER_CACHE_ENABLED, GroupUsersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
			GroupUsersModelImpl.FINDER_CACHE_ENABLED, GroupUsersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
			GroupUsersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PERMISSIONGROUPID =
		new FinderPath(GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
			GroupUsersModelImpl.FINDER_CACHE_ENABLED, GroupUsersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPermissionGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PERMISSIONGROUPID =
		new FinderPath(GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
			GroupUsersModelImpl.FINDER_CACHE_ENABLED, GroupUsersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPermissionGroupId", new String[] { Long.class.getName() },
			GroupUsersModelImpl.PERMISSIONGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PERMISSIONGROUPID = new FinderPath(GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
			GroupUsersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPermissionGroupId", new String[] { Long.class.getName() });

	/**
	 * Returns all the group userses where permissionGroupId = &#63;.
	 *
	 * @param permissionGroupId the permission group ID
	 * @return the matching group userses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupUsers> findByPermissionGroupId(long permissionGroupId)
		throws SystemException {
		return findByPermissionGroupId(permissionGroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the group userses where permissionGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupUsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param permissionGroupId the permission group ID
	 * @param start the lower bound of the range of group userses
	 * @param end the upper bound of the range of group userses (not inclusive)
	 * @return the range of matching group userses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupUsers> findByPermissionGroupId(long permissionGroupId,
		int start, int end) throws SystemException {
		return findByPermissionGroupId(permissionGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the group userses where permissionGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupUsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param permissionGroupId the permission group ID
	 * @param start the lower bound of the range of group userses
	 * @param end the upper bound of the range of group userses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching group userses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupUsers> findByPermissionGroupId(long permissionGroupId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PERMISSIONGROUPID;
			finderArgs = new Object[] { permissionGroupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PERMISSIONGROUPID;
			finderArgs = new Object[] {
					permissionGroupId,
					
					start, end, orderByComparator
				};
		}

		List<GroupUsers> list = (List<GroupUsers>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (GroupUsers groupUsers : list) {
				if ((permissionGroupId != groupUsers.getPermissionGroupId())) {
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

			query.append(_SQL_SELECT_GROUPUSERS_WHERE);

			query.append(_FINDER_COLUMN_PERMISSIONGROUPID_PERMISSIONGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(GroupUsersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(permissionGroupId);

				if (!pagination) {
					list = (List<GroupUsers>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<GroupUsers>(list);
				}
				else {
					list = (List<GroupUsers>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first group users in the ordered set where permissionGroupId = &#63;.
	 *
	 * @param permissionGroupId the permission group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching group users
	 * @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a matching group users could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupUsers findByPermissionGroupId_First(long permissionGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchGroupUsersException, SystemException {
		GroupUsers groupUsers = fetchByPermissionGroupId_First(permissionGroupId,
				orderByComparator);

		if (groupUsers != null) {
			return groupUsers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("permissionGroupId=");
		msg.append(permissionGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchGroupUsersException(msg.toString());
	}

	/**
	 * Returns the first group users in the ordered set where permissionGroupId = &#63;.
	 *
	 * @param permissionGroupId the permission group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching group users, or <code>null</code> if a matching group users could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupUsers fetchByPermissionGroupId_First(long permissionGroupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<GroupUsers> list = findByPermissionGroupId(permissionGroupId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last group users in the ordered set where permissionGroupId = &#63;.
	 *
	 * @param permissionGroupId the permission group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching group users
	 * @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a matching group users could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupUsers findByPermissionGroupId_Last(long permissionGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchGroupUsersException, SystemException {
		GroupUsers groupUsers = fetchByPermissionGroupId_Last(permissionGroupId,
				orderByComparator);

		if (groupUsers != null) {
			return groupUsers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("permissionGroupId=");
		msg.append(permissionGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchGroupUsersException(msg.toString());
	}

	/**
	 * Returns the last group users in the ordered set where permissionGroupId = &#63;.
	 *
	 * @param permissionGroupId the permission group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching group users, or <code>null</code> if a matching group users could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupUsers fetchByPermissionGroupId_Last(long permissionGroupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPermissionGroupId(permissionGroupId);

		if (count == 0) {
			return null;
		}

		List<GroupUsers> list = findByPermissionGroupId(permissionGroupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the group userses before and after the current group users in the ordered set where permissionGroupId = &#63;.
	 *
	 * @param groupUsersPK the primary key of the current group users
	 * @param permissionGroupId the permission group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next group users
	 * @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a group users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupUsers[] findByPermissionGroupId_PrevAndNext(
		GroupUsersPK groupUsersPK, long permissionGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchGroupUsersException, SystemException {
		GroupUsers groupUsers = findByPrimaryKey(groupUsersPK);

		Session session = null;

		try {
			session = openSession();

			GroupUsers[] array = new GroupUsersImpl[3];

			array[0] = getByPermissionGroupId_PrevAndNext(session, groupUsers,
					permissionGroupId, orderByComparator, true);

			array[1] = groupUsers;

			array[2] = getByPermissionGroupId_PrevAndNext(session, groupUsers,
					permissionGroupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected GroupUsers getByPermissionGroupId_PrevAndNext(Session session,
		GroupUsers groupUsers, long permissionGroupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_GROUPUSERS_WHERE);

		query.append(_FINDER_COLUMN_PERMISSIONGROUPID_PERMISSIONGROUPID_2);

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
			query.append(GroupUsersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(permissionGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(groupUsers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<GroupUsers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the group userses where permissionGroupId = &#63; from the database.
	 *
	 * @param permissionGroupId the permission group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPermissionGroupId(long permissionGroupId)
		throws SystemException {
		for (GroupUsers groupUsers : findByPermissionGroupId(
				permissionGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(groupUsers);
		}
	}

	/**
	 * Returns the number of group userses where permissionGroupId = &#63;.
	 *
	 * @param permissionGroupId the permission group ID
	 * @return the number of matching group userses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPermissionGroupId(long permissionGroupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PERMISSIONGROUPID;

		Object[] finderArgs = new Object[] { permissionGroupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_GROUPUSERS_WHERE);

			query.append(_FINDER_COLUMN_PERMISSIONGROUPID_PERMISSIONGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(permissionGroupId);

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

	private static final String _FINDER_COLUMN_PERMISSIONGROUPID_PERMISSIONGROUPID_2 =
		"groupUsers.id.permissionGroupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
			GroupUsersModelImpl.FINDER_CACHE_ENABLED, GroupUsersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
			GroupUsersModelImpl.FINDER_CACHE_ENABLED, GroupUsersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			GroupUsersModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
			GroupUsersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the group userses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching group userses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupUsers> findByUserId(long userId) throws SystemException {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the group userses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupUsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of group userses
	 * @param end the upper bound of the range of group userses (not inclusive)
	 * @return the range of matching group userses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupUsers> findByUserId(long userId, int start, int end)
		throws SystemException {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the group userses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupUsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of group userses
	 * @param end the upper bound of the range of group userses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching group userses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupUsers> findByUserId(long userId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<GroupUsers> list = (List<GroupUsers>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (GroupUsers groupUsers : list) {
				if ((userId != groupUsers.getUserId())) {
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

			query.append(_SQL_SELECT_GROUPUSERS_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(GroupUsersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<GroupUsers>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<GroupUsers>(list);
				}
				else {
					list = (List<GroupUsers>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first group users in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching group users
	 * @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a matching group users could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupUsers findByUserId_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchGroupUsersException, SystemException {
		GroupUsers groupUsers = fetchByUserId_First(userId, orderByComparator);

		if (groupUsers != null) {
			return groupUsers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchGroupUsersException(msg.toString());
	}

	/**
	 * Returns the first group users in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching group users, or <code>null</code> if a matching group users could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupUsers fetchByUserId_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<GroupUsers> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last group users in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching group users
	 * @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a matching group users could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupUsers findByUserId_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchGroupUsersException, SystemException {
		GroupUsers groupUsers = fetchByUserId_Last(userId, orderByComparator);

		if (groupUsers != null) {
			return groupUsers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchGroupUsersException(msg.toString());
	}

	/**
	 * Returns the last group users in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching group users, or <code>null</code> if a matching group users could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupUsers fetchByUserId_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<GroupUsers> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the group userses before and after the current group users in the ordered set where userId = &#63;.
	 *
	 * @param groupUsersPK the primary key of the current group users
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next group users
	 * @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a group users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupUsers[] findByUserId_PrevAndNext(GroupUsersPK groupUsersPK,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchGroupUsersException, SystemException {
		GroupUsers groupUsers = findByPrimaryKey(groupUsersPK);

		Session session = null;

		try {
			session = openSession();

			GroupUsers[] array = new GroupUsersImpl[3];

			array[0] = getByUserId_PrevAndNext(session, groupUsers, userId,
					orderByComparator, true);

			array[1] = groupUsers;

			array[2] = getByUserId_PrevAndNext(session, groupUsers, userId,
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

	protected GroupUsers getByUserId_PrevAndNext(Session session,
		GroupUsers groupUsers, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_GROUPUSERS_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

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
			query.append(GroupUsersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(groupUsers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<GroupUsers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the group userses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUserId(long userId) throws SystemException {
		for (GroupUsers groupUsers : findByUserId(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(groupUsers);
		}
	}

	/**
	 * Returns the number of group userses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching group userses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUserId(long userId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_GROUPUSERS_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "groupUsers.id.userId = ?";

	public GroupUsersPersistenceImpl() {
		setModelClass(GroupUsers.class);
	}

	/**
	 * Caches the group users in the entity cache if it is enabled.
	 *
	 * @param groupUsers the group users
	 */
	@Override
	public void cacheResult(GroupUsers groupUsers) {
		EntityCacheUtil.putResult(GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
			GroupUsersImpl.class, groupUsers.getPrimaryKey(), groupUsers);

		groupUsers.resetOriginalValues();
	}

	/**
	 * Caches the group userses in the entity cache if it is enabled.
	 *
	 * @param groupUserses the group userses
	 */
	@Override
	public void cacheResult(List<GroupUsers> groupUserses) {
		for (GroupUsers groupUsers : groupUserses) {
			if (EntityCacheUtil.getResult(
						GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
						GroupUsersImpl.class, groupUsers.getPrimaryKey()) == null) {
				cacheResult(groupUsers);
			}
			else {
				groupUsers.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all group userses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(GroupUsersImpl.class.getName());
		}

		EntityCacheUtil.clearCache(GroupUsersImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the group users.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(GroupUsers groupUsers) {
		EntityCacheUtil.removeResult(GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
			GroupUsersImpl.class, groupUsers.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<GroupUsers> groupUserses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (GroupUsers groupUsers : groupUserses) {
			EntityCacheUtil.removeResult(GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
				GroupUsersImpl.class, groupUsers.getPrimaryKey());
		}
	}

	/**
	 * Creates a new group users with the primary key. Does not add the group users to the database.
	 *
	 * @param groupUsersPK the primary key for the new group users
	 * @return the new group users
	 */
	@Override
	public GroupUsers create(GroupUsersPK groupUsersPK) {
		GroupUsers groupUsers = new GroupUsersImpl();

		groupUsers.setNew(true);
		groupUsers.setPrimaryKey(groupUsersPK);

		return groupUsers;
	}

	/**
	 * Removes the group users with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param groupUsersPK the primary key of the group users
	 * @return the group users that was removed
	 * @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a group users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupUsers remove(GroupUsersPK groupUsersPK)
		throws NoSuchGroupUsersException, SystemException {
		return remove((Serializable)groupUsersPK);
	}

	/**
	 * Removes the group users with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the group users
	 * @return the group users that was removed
	 * @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a group users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupUsers remove(Serializable primaryKey)
		throws NoSuchGroupUsersException, SystemException {
		Session session = null;

		try {
			session = openSession();

			GroupUsers groupUsers = (GroupUsers)session.get(GroupUsersImpl.class,
					primaryKey);

			if (groupUsers == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchGroupUsersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(groupUsers);
		}
		catch (NoSuchGroupUsersException nsee) {
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
	protected GroupUsers removeImpl(GroupUsers groupUsers)
		throws SystemException {
		groupUsers = toUnwrappedModel(groupUsers);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(groupUsers)) {
				groupUsers = (GroupUsers)session.get(GroupUsersImpl.class,
						groupUsers.getPrimaryKeyObj());
			}

			if (groupUsers != null) {
				session.delete(groupUsers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (groupUsers != null) {
			clearCache(groupUsers);
		}

		return groupUsers;
	}

	@Override
	public GroupUsers updateImpl(
		com.vnpt.portlet.user.model.GroupUsers groupUsers)
		throws SystemException {
		groupUsers = toUnwrappedModel(groupUsers);

		boolean isNew = groupUsers.isNew();

		GroupUsersModelImpl groupUsersModelImpl = (GroupUsersModelImpl)groupUsers;

		Session session = null;

		try {
			session = openSession();

			if (groupUsers.isNew()) {
				session.save(groupUsers);

				groupUsers.setNew(false);
			}
			else {
				session.merge(groupUsers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !GroupUsersModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((groupUsersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PERMISSIONGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						groupUsersModelImpl.getOriginalPermissionGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PERMISSIONGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PERMISSIONGROUPID,
					args);

				args = new Object[] { groupUsersModelImpl.getPermissionGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PERMISSIONGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PERMISSIONGROUPID,
					args);
			}

			if ((groupUsersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						groupUsersModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { groupUsersModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		EntityCacheUtil.putResult(GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
			GroupUsersImpl.class, groupUsers.getPrimaryKey(), groupUsers);

		return groupUsers;
	}

	protected GroupUsers toUnwrappedModel(GroupUsers groupUsers) {
		if (groupUsers instanceof GroupUsersImpl) {
			return groupUsers;
		}

		GroupUsersImpl groupUsersImpl = new GroupUsersImpl();

		groupUsersImpl.setNew(groupUsers.isNew());
		groupUsersImpl.setPrimaryKey(groupUsers.getPrimaryKey());

		groupUsersImpl.setPermissionGroupId(groupUsers.getPermissionGroupId());
		groupUsersImpl.setUserId(groupUsers.getUserId());

		return groupUsersImpl;
	}

	/**
	 * Returns the group users with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the group users
	 * @return the group users
	 * @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a group users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupUsers findByPrimaryKey(Serializable primaryKey)
		throws NoSuchGroupUsersException, SystemException {
		GroupUsers groupUsers = fetchByPrimaryKey(primaryKey);

		if (groupUsers == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchGroupUsersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return groupUsers;
	}

	/**
	 * Returns the group users with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchGroupUsersException} if it could not be found.
	 *
	 * @param groupUsersPK the primary key of the group users
	 * @return the group users
	 * @throws com.vnpt.portlet.user.NoSuchGroupUsersException if a group users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupUsers findByPrimaryKey(GroupUsersPK groupUsersPK)
		throws NoSuchGroupUsersException, SystemException {
		return findByPrimaryKey((Serializable)groupUsersPK);
	}

	/**
	 * Returns the group users with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the group users
	 * @return the group users, or <code>null</code> if a group users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupUsers fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		GroupUsers groupUsers = (GroupUsers)EntityCacheUtil.getResult(GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
				GroupUsersImpl.class, primaryKey);

		if (groupUsers == _nullGroupUsers) {
			return null;
		}

		if (groupUsers == null) {
			Session session = null;

			try {
				session = openSession();

				groupUsers = (GroupUsers)session.get(GroupUsersImpl.class,
						primaryKey);

				if (groupUsers != null) {
					cacheResult(groupUsers);
				}
				else {
					EntityCacheUtil.putResult(GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
						GroupUsersImpl.class, primaryKey, _nullGroupUsers);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(GroupUsersModelImpl.ENTITY_CACHE_ENABLED,
					GroupUsersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return groupUsers;
	}

	/**
	 * Returns the group users with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param groupUsersPK the primary key of the group users
	 * @return the group users, or <code>null</code> if a group users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupUsers fetchByPrimaryKey(GroupUsersPK groupUsersPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)groupUsersPK);
	}

	/**
	 * Returns all the group userses.
	 *
	 * @return the group userses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupUsers> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the group userses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupUsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of group userses
	 * @param end the upper bound of the range of group userses (not inclusive)
	 * @return the range of group userses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupUsers> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the group userses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupUsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of group userses
	 * @param end the upper bound of the range of group userses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of group userses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupUsers> findAll(int start, int end,
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

		List<GroupUsers> list = (List<GroupUsers>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_GROUPUSERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_GROUPUSERS;

				if (pagination) {
					sql = sql.concat(GroupUsersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<GroupUsers>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<GroupUsers>(list);
				}
				else {
					list = (List<GroupUsers>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the group userses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (GroupUsers groupUsers : findAll()) {
			remove(groupUsers);
		}
	}

	/**
	 * Returns the number of group userses.
	 *
	 * @return the number of group userses
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

				Query q = session.createQuery(_SQL_COUNT_GROUPUSERS);

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
	 * Initializes the group users persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vnpt.portlet.user.model.GroupUsers")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<GroupUsers>> listenersList = new ArrayList<ModelListener<GroupUsers>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<GroupUsers>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(GroupUsersImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_GROUPUSERS = "SELECT groupUsers FROM GroupUsers groupUsers";
	private static final String _SQL_SELECT_GROUPUSERS_WHERE = "SELECT groupUsers FROM GroupUsers groupUsers WHERE ";
	private static final String _SQL_COUNT_GROUPUSERS = "SELECT COUNT(groupUsers) FROM GroupUsers groupUsers";
	private static final String _SQL_COUNT_GROUPUSERS_WHERE = "SELECT COUNT(groupUsers) FROM GroupUsers groupUsers WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "groupUsers.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No GroupUsers exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No GroupUsers exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(GroupUsersPersistenceImpl.class);
	private static GroupUsers _nullGroupUsers = new GroupUsersImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<GroupUsers> toCacheModel() {
				return _nullGroupUsersCacheModel;
			}
		};

	private static CacheModel<GroupUsers> _nullGroupUsersCacheModel = new CacheModel<GroupUsers>() {
			@Override
			public GroupUsers toEntityModel() {
				return _nullGroupUsers;
			}
		};
}
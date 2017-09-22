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

import com.vnpt.portlet.user.NoSuchGroupRolesException;
import com.vnpt.portlet.user.model.GroupRoles;
import com.vnpt.portlet.user.model.impl.GroupRolesImpl;
import com.vnpt.portlet.user.model.impl.GroupRolesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the group roles service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see GroupRolesPersistence
 * @see GroupRolesUtil
 * @generated
 */
public class GroupRolesPersistenceImpl extends BasePersistenceImpl<GroupRoles>
	implements GroupRolesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link GroupRolesUtil} to access the group roles persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = GroupRolesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
			GroupRolesModelImpl.FINDER_CACHE_ENABLED, GroupRolesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
			GroupRolesModelImpl.FINDER_CACHE_ENABLED, GroupRolesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
			GroupRolesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PERMISSIONGROUPID =
		new FinderPath(GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
			GroupRolesModelImpl.FINDER_CACHE_ENABLED, GroupRolesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPermissionGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PERMISSIONGROUPID =
		new FinderPath(GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
			GroupRolesModelImpl.FINDER_CACHE_ENABLED, GroupRolesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPermissionGroupId", new String[] { Long.class.getName() },
			GroupRolesModelImpl.PERMISSIONGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PERMISSIONGROUPID = new FinderPath(GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
			GroupRolesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPermissionGroupId", new String[] { Long.class.getName() });

	/**
	 * Returns all the group roleses where permissionGroupId = &#63;.
	 *
	 * @param permissionGroupId the permission group ID
	 * @return the matching group roleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupRoles> findByPermissionGroupId(long permissionGroupId)
		throws SystemException {
		return findByPermissionGroupId(permissionGroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the group roleses where permissionGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupRolesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param permissionGroupId the permission group ID
	 * @param start the lower bound of the range of group roleses
	 * @param end the upper bound of the range of group roleses (not inclusive)
	 * @return the range of matching group roleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupRoles> findByPermissionGroupId(long permissionGroupId,
		int start, int end) throws SystemException {
		return findByPermissionGroupId(permissionGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the group roleses where permissionGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupRolesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param permissionGroupId the permission group ID
	 * @param start the lower bound of the range of group roleses
	 * @param end the upper bound of the range of group roleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching group roleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupRoles> findByPermissionGroupId(long permissionGroupId,
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

		List<GroupRoles> list = (List<GroupRoles>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (GroupRoles groupRoles : list) {
				if ((permissionGroupId != groupRoles.getPermissionGroupId())) {
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

			query.append(_SQL_SELECT_GROUPROLES_WHERE);

			query.append(_FINDER_COLUMN_PERMISSIONGROUPID_PERMISSIONGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(GroupRolesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(permissionGroupId);

				if (!pagination) {
					list = (List<GroupRoles>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<GroupRoles>(list);
				}
				else {
					list = (List<GroupRoles>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first group roles in the ordered set where permissionGroupId = &#63;.
	 *
	 * @param permissionGroupId the permission group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching group roles
	 * @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a matching group roles could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles findByPermissionGroupId_First(long permissionGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchGroupRolesException, SystemException {
		GroupRoles groupRoles = fetchByPermissionGroupId_First(permissionGroupId,
				orderByComparator);

		if (groupRoles != null) {
			return groupRoles;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("permissionGroupId=");
		msg.append(permissionGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchGroupRolesException(msg.toString());
	}

	/**
	 * Returns the first group roles in the ordered set where permissionGroupId = &#63;.
	 *
	 * @param permissionGroupId the permission group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching group roles, or <code>null</code> if a matching group roles could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles fetchByPermissionGroupId_First(long permissionGroupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<GroupRoles> list = findByPermissionGroupId(permissionGroupId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last group roles in the ordered set where permissionGroupId = &#63;.
	 *
	 * @param permissionGroupId the permission group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching group roles
	 * @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a matching group roles could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles findByPermissionGroupId_Last(long permissionGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchGroupRolesException, SystemException {
		GroupRoles groupRoles = fetchByPermissionGroupId_Last(permissionGroupId,
				orderByComparator);

		if (groupRoles != null) {
			return groupRoles;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("permissionGroupId=");
		msg.append(permissionGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchGroupRolesException(msg.toString());
	}

	/**
	 * Returns the last group roles in the ordered set where permissionGroupId = &#63;.
	 *
	 * @param permissionGroupId the permission group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching group roles, or <code>null</code> if a matching group roles could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles fetchByPermissionGroupId_Last(long permissionGroupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPermissionGroupId(permissionGroupId);

		if (count == 0) {
			return null;
		}

		List<GroupRoles> list = findByPermissionGroupId(permissionGroupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the group roleses before and after the current group roles in the ordered set where permissionGroupId = &#63;.
	 *
	 * @param groupRolesPK the primary key of the current group roles
	 * @param permissionGroupId the permission group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next group roles
	 * @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a group roles with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles[] findByPermissionGroupId_PrevAndNext(
		GroupRolesPK groupRolesPK, long permissionGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchGroupRolesException, SystemException {
		GroupRoles groupRoles = findByPrimaryKey(groupRolesPK);

		Session session = null;

		try {
			session = openSession();

			GroupRoles[] array = new GroupRolesImpl[3];

			array[0] = getByPermissionGroupId_PrevAndNext(session, groupRoles,
					permissionGroupId, orderByComparator, true);

			array[1] = groupRoles;

			array[2] = getByPermissionGroupId_PrevAndNext(session, groupRoles,
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

	protected GroupRoles getByPermissionGroupId_PrevAndNext(Session session,
		GroupRoles groupRoles, long permissionGroupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_GROUPROLES_WHERE);

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
			query.append(GroupRolesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(permissionGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(groupRoles);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<GroupRoles> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the group roleses where permissionGroupId = &#63; from the database.
	 *
	 * @param permissionGroupId the permission group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPermissionGroupId(long permissionGroupId)
		throws SystemException {
		for (GroupRoles groupRoles : findByPermissionGroupId(
				permissionGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(groupRoles);
		}
	}

	/**
	 * Returns the number of group roleses where permissionGroupId = &#63;.
	 *
	 * @param permissionGroupId the permission group ID
	 * @return the number of matching group roleses
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

			query.append(_SQL_COUNT_GROUPROLES_WHERE);

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
		"groupRoles.id.permissionGroupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ROLEID = new FinderPath(GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
			GroupRolesModelImpl.FINDER_CACHE_ENABLED, GroupRolesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRoleId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROLEID =
		new FinderPath(GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
			GroupRolesModelImpl.FINDER_CACHE_ENABLED, GroupRolesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRoleId",
			new String[] { Long.class.getName() },
			GroupRolesModelImpl.ROLEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ROLEID = new FinderPath(GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
			GroupRolesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRoleId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the group roleses where roleId = &#63;.
	 *
	 * @param roleId the role ID
	 * @return the matching group roleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupRoles> findByRoleId(long roleId) throws SystemException {
		return findByRoleId(roleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the group roleses where roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupRolesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param roleId the role ID
	 * @param start the lower bound of the range of group roleses
	 * @param end the upper bound of the range of group roleses (not inclusive)
	 * @return the range of matching group roleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupRoles> findByRoleId(long roleId, int start, int end)
		throws SystemException {
		return findByRoleId(roleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the group roleses where roleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupRolesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param roleId the role ID
	 * @param start the lower bound of the range of group roleses
	 * @param end the upper bound of the range of group roleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching group roleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupRoles> findByRoleId(long roleId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROLEID;
			finderArgs = new Object[] { roleId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ROLEID;
			finderArgs = new Object[] { roleId, start, end, orderByComparator };
		}

		List<GroupRoles> list = (List<GroupRoles>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (GroupRoles groupRoles : list) {
				if ((roleId != groupRoles.getRoleId())) {
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

			query.append(_SQL_SELECT_GROUPROLES_WHERE);

			query.append(_FINDER_COLUMN_ROLEID_ROLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(GroupRolesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(roleId);

				if (!pagination) {
					list = (List<GroupRoles>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<GroupRoles>(list);
				}
				else {
					list = (List<GroupRoles>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first group roles in the ordered set where roleId = &#63;.
	 *
	 * @param roleId the role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching group roles
	 * @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a matching group roles could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles findByRoleId_First(long roleId,
		OrderByComparator orderByComparator)
		throws NoSuchGroupRolesException, SystemException {
		GroupRoles groupRoles = fetchByRoleId_First(roleId, orderByComparator);

		if (groupRoles != null) {
			return groupRoles;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("roleId=");
		msg.append(roleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchGroupRolesException(msg.toString());
	}

	/**
	 * Returns the first group roles in the ordered set where roleId = &#63;.
	 *
	 * @param roleId the role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching group roles, or <code>null</code> if a matching group roles could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles fetchByRoleId_First(long roleId,
		OrderByComparator orderByComparator) throws SystemException {
		List<GroupRoles> list = findByRoleId(roleId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last group roles in the ordered set where roleId = &#63;.
	 *
	 * @param roleId the role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching group roles
	 * @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a matching group roles could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles findByRoleId_Last(long roleId,
		OrderByComparator orderByComparator)
		throws NoSuchGroupRolesException, SystemException {
		GroupRoles groupRoles = fetchByRoleId_Last(roleId, orderByComparator);

		if (groupRoles != null) {
			return groupRoles;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("roleId=");
		msg.append(roleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchGroupRolesException(msg.toString());
	}

	/**
	 * Returns the last group roles in the ordered set where roleId = &#63;.
	 *
	 * @param roleId the role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching group roles, or <code>null</code> if a matching group roles could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles fetchByRoleId_Last(long roleId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRoleId(roleId);

		if (count == 0) {
			return null;
		}

		List<GroupRoles> list = findByRoleId(roleId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the group roleses before and after the current group roles in the ordered set where roleId = &#63;.
	 *
	 * @param groupRolesPK the primary key of the current group roles
	 * @param roleId the role ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next group roles
	 * @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a group roles with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles[] findByRoleId_PrevAndNext(GroupRolesPK groupRolesPK,
		long roleId, OrderByComparator orderByComparator)
		throws NoSuchGroupRolesException, SystemException {
		GroupRoles groupRoles = findByPrimaryKey(groupRolesPK);

		Session session = null;

		try {
			session = openSession();

			GroupRoles[] array = new GroupRolesImpl[3];

			array[0] = getByRoleId_PrevAndNext(session, groupRoles, roleId,
					orderByComparator, true);

			array[1] = groupRoles;

			array[2] = getByRoleId_PrevAndNext(session, groupRoles, roleId,
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

	protected GroupRoles getByRoleId_PrevAndNext(Session session,
		GroupRoles groupRoles, long roleId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_GROUPROLES_WHERE);

		query.append(_FINDER_COLUMN_ROLEID_ROLEID_2);

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
			query.append(GroupRolesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(roleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(groupRoles);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<GroupRoles> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the group roleses where roleId = &#63; from the database.
	 *
	 * @param roleId the role ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRoleId(long roleId) throws SystemException {
		for (GroupRoles groupRoles : findByRoleId(roleId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(groupRoles);
		}
	}

	/**
	 * Returns the number of group roleses where roleId = &#63;.
	 *
	 * @param roleId the role ID
	 * @return the number of matching group roleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRoleId(long roleId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ROLEID;

		Object[] finderArgs = new Object[] { roleId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_GROUPROLES_WHERE);

			query.append(_FINDER_COLUMN_ROLEID_ROLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(roleId);

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

	private static final String _FINDER_COLUMN_ROLEID_ROLEID_2 = "groupRoles.id.roleId = ?";

	public GroupRolesPersistenceImpl() {
		setModelClass(GroupRoles.class);
	}

	/**
	 * Caches the group roles in the entity cache if it is enabled.
	 *
	 * @param groupRoles the group roles
	 */
	@Override
	public void cacheResult(GroupRoles groupRoles) {
		EntityCacheUtil.putResult(GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
			GroupRolesImpl.class, groupRoles.getPrimaryKey(), groupRoles);

		groupRoles.resetOriginalValues();
	}

	/**
	 * Caches the group roleses in the entity cache if it is enabled.
	 *
	 * @param groupRoleses the group roleses
	 */
	@Override
	public void cacheResult(List<GroupRoles> groupRoleses) {
		for (GroupRoles groupRoles : groupRoleses) {
			if (EntityCacheUtil.getResult(
						GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
						GroupRolesImpl.class, groupRoles.getPrimaryKey()) == null) {
				cacheResult(groupRoles);
			}
			else {
				groupRoles.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all group roleses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(GroupRolesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(GroupRolesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the group roles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(GroupRoles groupRoles) {
		EntityCacheUtil.removeResult(GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
			GroupRolesImpl.class, groupRoles.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<GroupRoles> groupRoleses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (GroupRoles groupRoles : groupRoleses) {
			EntityCacheUtil.removeResult(GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
				GroupRolesImpl.class, groupRoles.getPrimaryKey());
		}
	}

	/**
	 * Creates a new group roles with the primary key. Does not add the group roles to the database.
	 *
	 * @param groupRolesPK the primary key for the new group roles
	 * @return the new group roles
	 */
	@Override
	public GroupRoles create(GroupRolesPK groupRolesPK) {
		GroupRoles groupRoles = new GroupRolesImpl();

		groupRoles.setNew(true);
		groupRoles.setPrimaryKey(groupRolesPK);

		return groupRoles;
	}

	/**
	 * Removes the group roles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param groupRolesPK the primary key of the group roles
	 * @return the group roles that was removed
	 * @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a group roles with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles remove(GroupRolesPK groupRolesPK)
		throws NoSuchGroupRolesException, SystemException {
		return remove((Serializable)groupRolesPK);
	}

	/**
	 * Removes the group roles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the group roles
	 * @return the group roles that was removed
	 * @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a group roles with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles remove(Serializable primaryKey)
		throws NoSuchGroupRolesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			GroupRoles groupRoles = (GroupRoles)session.get(GroupRolesImpl.class,
					primaryKey);

			if (groupRoles == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchGroupRolesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(groupRoles);
		}
		catch (NoSuchGroupRolesException nsee) {
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
	protected GroupRoles removeImpl(GroupRoles groupRoles)
		throws SystemException {
		groupRoles = toUnwrappedModel(groupRoles);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(groupRoles)) {
				groupRoles = (GroupRoles)session.get(GroupRolesImpl.class,
						groupRoles.getPrimaryKeyObj());
			}

			if (groupRoles != null) {
				session.delete(groupRoles);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (groupRoles != null) {
			clearCache(groupRoles);
		}

		return groupRoles;
	}

	@Override
	public GroupRoles updateImpl(
		com.vnpt.portlet.user.model.GroupRoles groupRoles)
		throws SystemException {
		groupRoles = toUnwrappedModel(groupRoles);

		boolean isNew = groupRoles.isNew();

		GroupRolesModelImpl groupRolesModelImpl = (GroupRolesModelImpl)groupRoles;

		Session session = null;

		try {
			session = openSession();

			if (groupRoles.isNew()) {
				session.save(groupRoles);

				groupRoles.setNew(false);
			}
			else {
				session.merge(groupRoles);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !GroupRolesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((groupRolesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PERMISSIONGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						groupRolesModelImpl.getOriginalPermissionGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PERMISSIONGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PERMISSIONGROUPID,
					args);

				args = new Object[] { groupRolesModelImpl.getPermissionGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PERMISSIONGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PERMISSIONGROUPID,
					args);
			}

			if ((groupRolesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						groupRolesModelImpl.getOriginalRoleId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ROLEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROLEID,
					args);

				args = new Object[] { groupRolesModelImpl.getRoleId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ROLEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROLEID,
					args);
			}
		}

		EntityCacheUtil.putResult(GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
			GroupRolesImpl.class, groupRoles.getPrimaryKey(), groupRoles);

		return groupRoles;
	}

	protected GroupRoles toUnwrappedModel(GroupRoles groupRoles) {
		if (groupRoles instanceof GroupRolesImpl) {
			return groupRoles;
		}

		GroupRolesImpl groupRolesImpl = new GroupRolesImpl();

		groupRolesImpl.setNew(groupRoles.isNew());
		groupRolesImpl.setPrimaryKey(groupRoles.getPrimaryKey());

		groupRolesImpl.setPermissionGroupId(groupRoles.getPermissionGroupId());
		groupRolesImpl.setRoleId(groupRoles.getRoleId());

		return groupRolesImpl;
	}

	/**
	 * Returns the group roles with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the group roles
	 * @return the group roles
	 * @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a group roles with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles findByPrimaryKey(Serializable primaryKey)
		throws NoSuchGroupRolesException, SystemException {
		GroupRoles groupRoles = fetchByPrimaryKey(primaryKey);

		if (groupRoles == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchGroupRolesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return groupRoles;
	}

	/**
	 * Returns the group roles with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchGroupRolesException} if it could not be found.
	 *
	 * @param groupRolesPK the primary key of the group roles
	 * @return the group roles
	 * @throws com.vnpt.portlet.user.NoSuchGroupRolesException if a group roles with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles findByPrimaryKey(GroupRolesPK groupRolesPK)
		throws NoSuchGroupRolesException, SystemException {
		return findByPrimaryKey((Serializable)groupRolesPK);
	}

	/**
	 * Returns the group roles with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the group roles
	 * @return the group roles, or <code>null</code> if a group roles with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		GroupRoles groupRoles = (GroupRoles)EntityCacheUtil.getResult(GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
				GroupRolesImpl.class, primaryKey);

		if (groupRoles == _nullGroupRoles) {
			return null;
		}

		if (groupRoles == null) {
			Session session = null;

			try {
				session = openSession();

				groupRoles = (GroupRoles)session.get(GroupRolesImpl.class,
						primaryKey);

				if (groupRoles != null) {
					cacheResult(groupRoles);
				}
				else {
					EntityCacheUtil.putResult(GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
						GroupRolesImpl.class, primaryKey, _nullGroupRoles);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(GroupRolesModelImpl.ENTITY_CACHE_ENABLED,
					GroupRolesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return groupRoles;
	}

	/**
	 * Returns the group roles with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param groupRolesPK the primary key of the group roles
	 * @return the group roles, or <code>null</code> if a group roles with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles fetchByPrimaryKey(GroupRolesPK groupRolesPK)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)groupRolesPK);
	}

	/**
	 * Returns all the group roleses.
	 *
	 * @return the group roleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupRoles> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the group roleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupRolesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of group roleses
	 * @param end the upper bound of the range of group roleses (not inclusive)
	 * @return the range of group roleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupRoles> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the group roleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupRolesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of group roleses
	 * @param end the upper bound of the range of group roleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of group roleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupRoles> findAll(int start, int end,
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

		List<GroupRoles> list = (List<GroupRoles>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_GROUPROLES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_GROUPROLES;

				if (pagination) {
					sql = sql.concat(GroupRolesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<GroupRoles>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<GroupRoles>(list);
				}
				else {
					list = (List<GroupRoles>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the group roleses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (GroupRoles groupRoles : findAll()) {
			remove(groupRoles);
		}
	}

	/**
	 * Returns the number of group roleses.
	 *
	 * @return the number of group roleses
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

				Query q = session.createQuery(_SQL_COUNT_GROUPROLES);

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
	 * Initializes the group roles persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vnpt.portlet.user.model.GroupRoles")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<GroupRoles>> listenersList = new ArrayList<ModelListener<GroupRoles>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<GroupRoles>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(GroupRolesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_GROUPROLES = "SELECT groupRoles FROM GroupRoles groupRoles";
	private static final String _SQL_SELECT_GROUPROLES_WHERE = "SELECT groupRoles FROM GroupRoles groupRoles WHERE ";
	private static final String _SQL_COUNT_GROUPROLES = "SELECT COUNT(groupRoles) FROM GroupRoles groupRoles";
	private static final String _SQL_COUNT_GROUPROLES_WHERE = "SELECT COUNT(groupRoles) FROM GroupRoles groupRoles WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "groupRoles.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No GroupRoles exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No GroupRoles exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(GroupRolesPersistenceImpl.class);
	private static GroupRoles _nullGroupRoles = new GroupRolesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<GroupRoles> toCacheModel() {
				return _nullGroupRolesCacheModel;
			}
		};

	private static CacheModel<GroupRoles> _nullGroupRolesCacheModel = new CacheModel<GroupRoles>() {
			@Override
			public GroupRoles toEntityModel() {
				return _nullGroupRoles;
			}
		};
}
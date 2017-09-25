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

import com.vnpt.portlet.user.NoSuchPermissionGroupException;
import com.vnpt.portlet.user.model.PermissionGroup;
import com.vnpt.portlet.user.model.impl.PermissionGroupImpl;
import com.vnpt.portlet.user.model.impl.PermissionGroupModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the permission group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see PermissionGroupPersistence
 * @see PermissionGroupUtil
 * @generated
 */
public class PermissionGroupPersistenceImpl extends BasePersistenceImpl<PermissionGroup>
	implements PermissionGroupPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PermissionGroupUtil} to access the permission group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PermissionGroupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
			PermissionGroupModelImpl.FINDER_CACHE_ENABLED,
			PermissionGroupImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
			PermissionGroupModelImpl.FINDER_CACHE_ENABLED,
			PermissionGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
			PermissionGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVEGROUPID =
		new FinderPath(PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
			PermissionGroupModelImpl.FINDER_CACHE_ENABLED,
			PermissionGroupImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByActiveGroupId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVEGROUPID =
		new FinderPath(PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
			PermissionGroupModelImpl.FINDER_CACHE_ENABLED,
			PermissionGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByActiveGroupId",
			new String[] { Long.class.getName(), Integer.class.getName() },
			PermissionGroupModelImpl.GROUPID_COLUMN_BITMASK |
			PermissionGroupModelImpl.ISACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACTIVEGROUPID = new FinderPath(PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
			PermissionGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByActiveGroupId",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the permission groups where groupId = &#63; and isActive = &#63;.
	 *
	 * @param groupId the group ID
	 * @param isActive the is active
	 * @return the matching permission groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionGroup> findByActiveGroupId(long groupId, int isActive)
		throws SystemException {
		return findByActiveGroupId(groupId, isActive, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the permission groups where groupId = &#63; and isActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param isActive the is active
	 * @param start the lower bound of the range of permission groups
	 * @param end the upper bound of the range of permission groups (not inclusive)
	 * @return the range of matching permission groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionGroup> findByActiveGroupId(long groupId,
		int isActive, int start, int end) throws SystemException {
		return findByActiveGroupId(groupId, isActive, start, end, null);
	}

	/**
	 * Returns an ordered range of all the permission groups where groupId = &#63; and isActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param isActive the is active
	 * @param start the lower bound of the range of permission groups
	 * @param end the upper bound of the range of permission groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching permission groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionGroup> findByActiveGroupId(long groupId,
		int isActive, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVEGROUPID;
			finderArgs = new Object[] { groupId, isActive };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVEGROUPID;
			finderArgs = new Object[] {
					groupId, isActive,
					
					start, end, orderByComparator
				};
		}

		List<PermissionGroup> list = (List<PermissionGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PermissionGroup permissionGroup : list) {
				if ((groupId != permissionGroup.getGroupId()) ||
						(isActive != permissionGroup.getIsActive())) {
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

			query.append(_SQL_SELECT_PERMISSIONGROUP_WHERE);

			query.append(_FINDER_COLUMN_ACTIVEGROUPID_GROUPID_2);

			query.append(_FINDER_COLUMN_ACTIVEGROUPID_ISACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PermissionGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(isActive);

				if (!pagination) {
					list = (List<PermissionGroup>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PermissionGroup>(list);
				}
				else {
					list = (List<PermissionGroup>)QueryUtil.list(q,
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
	 * Returns the first permission group in the ordered set where groupId = &#63; and isActive = &#63;.
	 *
	 * @param groupId the group ID
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching permission group
	 * @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a matching permission group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionGroup findByActiveGroupId_First(long groupId,
		int isActive, OrderByComparator orderByComparator)
		throws NoSuchPermissionGroupException, SystemException {
		PermissionGroup permissionGroup = fetchByActiveGroupId_First(groupId,
				isActive, orderByComparator);

		if (permissionGroup != null) {
			return permissionGroup;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", isActive=");
		msg.append(isActive);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPermissionGroupException(msg.toString());
	}

	/**
	 * Returns the first permission group in the ordered set where groupId = &#63; and isActive = &#63;.
	 *
	 * @param groupId the group ID
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching permission group, or <code>null</code> if a matching permission group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionGroup fetchByActiveGroupId_First(long groupId,
		int isActive, OrderByComparator orderByComparator)
		throws SystemException {
		List<PermissionGroup> list = findByActiveGroupId(groupId, isActive, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last permission group in the ordered set where groupId = &#63; and isActive = &#63;.
	 *
	 * @param groupId the group ID
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching permission group
	 * @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a matching permission group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionGroup findByActiveGroupId_Last(long groupId, int isActive,
		OrderByComparator orderByComparator)
		throws NoSuchPermissionGroupException, SystemException {
		PermissionGroup permissionGroup = fetchByActiveGroupId_Last(groupId,
				isActive, orderByComparator);

		if (permissionGroup != null) {
			return permissionGroup;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", isActive=");
		msg.append(isActive);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPermissionGroupException(msg.toString());
	}

	/**
	 * Returns the last permission group in the ordered set where groupId = &#63; and isActive = &#63;.
	 *
	 * @param groupId the group ID
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching permission group, or <code>null</code> if a matching permission group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionGroup fetchByActiveGroupId_Last(long groupId,
		int isActive, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByActiveGroupId(groupId, isActive);

		if (count == 0) {
			return null;
		}

		List<PermissionGroup> list = findByActiveGroupId(groupId, isActive,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the permission groups before and after the current permission group in the ordered set where groupId = &#63; and isActive = &#63;.
	 *
	 * @param permissionGroupId the primary key of the current permission group
	 * @param groupId the group ID
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next permission group
	 * @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a permission group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionGroup[] findByActiveGroupId_PrevAndNext(
		long permissionGroupId, long groupId, int isActive,
		OrderByComparator orderByComparator)
		throws NoSuchPermissionGroupException, SystemException {
		PermissionGroup permissionGroup = findByPrimaryKey(permissionGroupId);

		Session session = null;

		try {
			session = openSession();

			PermissionGroup[] array = new PermissionGroupImpl[3];

			array[0] = getByActiveGroupId_PrevAndNext(session, permissionGroup,
					groupId, isActive, orderByComparator, true);

			array[1] = permissionGroup;

			array[2] = getByActiveGroupId_PrevAndNext(session, permissionGroup,
					groupId, isActive, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PermissionGroup getByActiveGroupId_PrevAndNext(Session session,
		PermissionGroup permissionGroup, long groupId, int isActive,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PERMISSIONGROUP_WHERE);

		query.append(_FINDER_COLUMN_ACTIVEGROUPID_GROUPID_2);

		query.append(_FINDER_COLUMN_ACTIVEGROUPID_ISACTIVE_2);

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
			query.append(PermissionGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(isActive);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(permissionGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PermissionGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the permission groups where groupId = &#63; and isActive = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param isActive the is active
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByActiveGroupId(long groupId, int isActive)
		throws SystemException {
		for (PermissionGroup permissionGroup : findByActiveGroupId(groupId,
				isActive, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(permissionGroup);
		}
	}

	/**
	 * Returns the number of permission groups where groupId = &#63; and isActive = &#63;.
	 *
	 * @param groupId the group ID
	 * @param isActive the is active
	 * @return the number of matching permission groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByActiveGroupId(long groupId, int isActive)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ACTIVEGROUPID;

		Object[] finderArgs = new Object[] { groupId, isActive };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PERMISSIONGROUP_WHERE);

			query.append(_FINDER_COLUMN_ACTIVEGROUPID_GROUPID_2);

			query.append(_FINDER_COLUMN_ACTIVEGROUPID_ISACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_ACTIVEGROUPID_GROUPID_2 = "permissionGroup.groupId = ? AND ";
	private static final String _FINDER_COLUMN_ACTIVEGROUPID_ISACTIVE_2 = "permissionGroup.isActive = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
			PermissionGroupModelImpl.FINDER_CACHE_ENABLED,
			PermissionGroupImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
			PermissionGroupModelImpl.FINDER_CACHE_ENABLED,
			PermissionGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			PermissionGroupModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
			PermissionGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the permission groups where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching permission groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionGroup> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the permission groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of permission groups
	 * @param end the upper bound of the range of permission groups (not inclusive)
	 * @return the range of matching permission groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionGroup> findByCompanyId(long companyId, int start,
		int end) throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the permission groups where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of permission groups
	 * @param end the upper bound of the range of permission groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching permission groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionGroup> findByCompanyId(long companyId, int start,
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

		List<PermissionGroup> list = (List<PermissionGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PermissionGroup permissionGroup : list) {
				if ((companyId != permissionGroup.getCompanyId())) {
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

			query.append(_SQL_SELECT_PERMISSIONGROUP_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PermissionGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<PermissionGroup>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PermissionGroup>(list);
				}
				else {
					list = (List<PermissionGroup>)QueryUtil.list(q,
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
	 * Returns the first permission group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching permission group
	 * @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a matching permission group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionGroup findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchPermissionGroupException, SystemException {
		PermissionGroup permissionGroup = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (permissionGroup != null) {
			return permissionGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPermissionGroupException(msg.toString());
	}

	/**
	 * Returns the first permission group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching permission group, or <code>null</code> if a matching permission group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionGroup fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<PermissionGroup> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last permission group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching permission group
	 * @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a matching permission group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionGroup findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchPermissionGroupException, SystemException {
		PermissionGroup permissionGroup = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (permissionGroup != null) {
			return permissionGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPermissionGroupException(msg.toString());
	}

	/**
	 * Returns the last permission group in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching permission group, or <code>null</code> if a matching permission group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionGroup fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<PermissionGroup> list = findByCompanyId(companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the permission groups before and after the current permission group in the ordered set where companyId = &#63;.
	 *
	 * @param permissionGroupId the primary key of the current permission group
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next permission group
	 * @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a permission group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionGroup[] findByCompanyId_PrevAndNext(
		long permissionGroupId, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchPermissionGroupException, SystemException {
		PermissionGroup permissionGroup = findByPrimaryKey(permissionGroupId);

		Session session = null;

		try {
			session = openSession();

			PermissionGroup[] array = new PermissionGroupImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, permissionGroup,
					companyId, orderByComparator, true);

			array[1] = permissionGroup;

			array[2] = getByCompanyId_PrevAndNext(session, permissionGroup,
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

	protected PermissionGroup getByCompanyId_PrevAndNext(Session session,
		PermissionGroup permissionGroup, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PERMISSIONGROUP_WHERE);

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
			query.append(PermissionGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(permissionGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PermissionGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the permission groups where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (PermissionGroup permissionGroup : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(permissionGroup);
		}
	}

	/**
	 * Returns the number of permission groups where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching permission groups
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

			query.append(_SQL_COUNT_PERMISSIONGROUP_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "permissionGroup.companyId = ?";

	public PermissionGroupPersistenceImpl() {
		setModelClass(PermissionGroup.class);
	}

	/**
	 * Caches the permission group in the entity cache if it is enabled.
	 *
	 * @param permissionGroup the permission group
	 */
	@Override
	public void cacheResult(PermissionGroup permissionGroup) {
		EntityCacheUtil.putResult(PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
			PermissionGroupImpl.class, permissionGroup.getPrimaryKey(),
			permissionGroup);

		permissionGroup.resetOriginalValues();
	}

	/**
	 * Caches the permission groups in the entity cache if it is enabled.
	 *
	 * @param permissionGroups the permission groups
	 */
	@Override
	public void cacheResult(List<PermissionGroup> permissionGroups) {
		for (PermissionGroup permissionGroup : permissionGroups) {
			if (EntityCacheUtil.getResult(
						PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
						PermissionGroupImpl.class,
						permissionGroup.getPrimaryKey()) == null) {
				cacheResult(permissionGroup);
			}
			else {
				permissionGroup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all permission groups.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PermissionGroupImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PermissionGroupImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the permission group.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PermissionGroup permissionGroup) {
		EntityCacheUtil.removeResult(PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
			PermissionGroupImpl.class, permissionGroup.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PermissionGroup> permissionGroups) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PermissionGroup permissionGroup : permissionGroups) {
			EntityCacheUtil.removeResult(PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
				PermissionGroupImpl.class, permissionGroup.getPrimaryKey());
		}
	}

	/**
	 * Creates a new permission group with the primary key. Does not add the permission group to the database.
	 *
	 * @param permissionGroupId the primary key for the new permission group
	 * @return the new permission group
	 */
	@Override
	public PermissionGroup create(long permissionGroupId) {
		PermissionGroup permissionGroup = new PermissionGroupImpl();

		permissionGroup.setNew(true);
		permissionGroup.setPrimaryKey(permissionGroupId);

		return permissionGroup;
	}

	/**
	 * Removes the permission group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param permissionGroupId the primary key of the permission group
	 * @return the permission group that was removed
	 * @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a permission group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionGroup remove(long permissionGroupId)
		throws NoSuchPermissionGroupException, SystemException {
		return remove((Serializable)permissionGroupId);
	}

	/**
	 * Removes the permission group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the permission group
	 * @return the permission group that was removed
	 * @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a permission group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionGroup remove(Serializable primaryKey)
		throws NoSuchPermissionGroupException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PermissionGroup permissionGroup = (PermissionGroup)session.get(PermissionGroupImpl.class,
					primaryKey);

			if (permissionGroup == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPermissionGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(permissionGroup);
		}
		catch (NoSuchPermissionGroupException nsee) {
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
	protected PermissionGroup removeImpl(PermissionGroup permissionGroup)
		throws SystemException {
		permissionGroup = toUnwrappedModel(permissionGroup);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(permissionGroup)) {
				permissionGroup = (PermissionGroup)session.get(PermissionGroupImpl.class,
						permissionGroup.getPrimaryKeyObj());
			}

			if (permissionGroup != null) {
				session.delete(permissionGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (permissionGroup != null) {
			clearCache(permissionGroup);
		}

		return permissionGroup;
	}

	@Override
	public PermissionGroup updateImpl(
		com.vnpt.portlet.user.model.PermissionGroup permissionGroup)
		throws SystemException {
		permissionGroup = toUnwrappedModel(permissionGroup);

		boolean isNew = permissionGroup.isNew();

		PermissionGroupModelImpl permissionGroupModelImpl = (PermissionGroupModelImpl)permissionGroup;

		Session session = null;

		try {
			session = openSession();

			if (permissionGroup.isNew()) {
				session.save(permissionGroup);

				permissionGroup.setNew(false);
			}
			else {
				session.merge(permissionGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PermissionGroupModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((permissionGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVEGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						permissionGroupModelImpl.getOriginalGroupId(),
						permissionGroupModelImpl.getOriginalIsActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVEGROUPID,
					args);

				args = new Object[] {
						permissionGroupModelImpl.getGroupId(),
						permissionGroupModelImpl.getIsActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVEGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVEGROUPID,
					args);
			}

			if ((permissionGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						permissionGroupModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { permissionGroupModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}
		}

		EntityCacheUtil.putResult(PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
			PermissionGroupImpl.class, permissionGroup.getPrimaryKey(),
			permissionGroup);

		return permissionGroup;
	}

	protected PermissionGroup toUnwrappedModel(PermissionGroup permissionGroup) {
		if (permissionGroup instanceof PermissionGroupImpl) {
			return permissionGroup;
		}

		PermissionGroupImpl permissionGroupImpl = new PermissionGroupImpl();

		permissionGroupImpl.setNew(permissionGroup.isNew());
		permissionGroupImpl.setPrimaryKey(permissionGroup.getPrimaryKey());

		permissionGroupImpl.setPermissionGroupId(permissionGroup.getPermissionGroupId());
		permissionGroupImpl.setGroupId(permissionGroup.getGroupId());
		permissionGroupImpl.setCompanyId(permissionGroup.getCompanyId());
		permissionGroupImpl.setGroupName(permissionGroup.getGroupName());
		permissionGroupImpl.setGroupCode(permissionGroup.getGroupCode());
		permissionGroupImpl.setIsActive(permissionGroup.getIsActive());
		permissionGroupImpl.setDescription(permissionGroup.getDescription());

		return permissionGroupImpl;
	}

	/**
	 * Returns the permission group with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the permission group
	 * @return the permission group
	 * @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a permission group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionGroup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPermissionGroupException, SystemException {
		PermissionGroup permissionGroup = fetchByPrimaryKey(primaryKey);

		if (permissionGroup == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPermissionGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return permissionGroup;
	}

	/**
	 * Returns the permission group with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchPermissionGroupException} if it could not be found.
	 *
	 * @param permissionGroupId the primary key of the permission group
	 * @return the permission group
	 * @throws com.vnpt.portlet.user.NoSuchPermissionGroupException if a permission group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionGroup findByPrimaryKey(long permissionGroupId)
		throws NoSuchPermissionGroupException, SystemException {
		return findByPrimaryKey((Serializable)permissionGroupId);
	}

	/**
	 * Returns the permission group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the permission group
	 * @return the permission group, or <code>null</code> if a permission group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionGroup fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PermissionGroup permissionGroup = (PermissionGroup)EntityCacheUtil.getResult(PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
				PermissionGroupImpl.class, primaryKey);

		if (permissionGroup == _nullPermissionGroup) {
			return null;
		}

		if (permissionGroup == null) {
			Session session = null;

			try {
				session = openSession();

				permissionGroup = (PermissionGroup)session.get(PermissionGroupImpl.class,
						primaryKey);

				if (permissionGroup != null) {
					cacheResult(permissionGroup);
				}
				else {
					EntityCacheUtil.putResult(PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
						PermissionGroupImpl.class, primaryKey,
						_nullPermissionGroup);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PermissionGroupModelImpl.ENTITY_CACHE_ENABLED,
					PermissionGroupImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return permissionGroup;
	}

	/**
	 * Returns the permission group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param permissionGroupId the primary key of the permission group
	 * @return the permission group, or <code>null</code> if a permission group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionGroup fetchByPrimaryKey(long permissionGroupId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)permissionGroupId);
	}

	/**
	 * Returns all the permission groups.
	 *
	 * @return the permission groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionGroup> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the permission groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of permission groups
	 * @param end the upper bound of the range of permission groups (not inclusive)
	 * @return the range of permission groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionGroup> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the permission groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of permission groups
	 * @param end the upper bound of the range of permission groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of permission groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionGroup> findAll(int start, int end,
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

		List<PermissionGroup> list = (List<PermissionGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PERMISSIONGROUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PERMISSIONGROUP;

				if (pagination) {
					sql = sql.concat(PermissionGroupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PermissionGroup>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PermissionGroup>(list);
				}
				else {
					list = (List<PermissionGroup>)QueryUtil.list(q,
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
	 * Removes all the permission groups from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PermissionGroup permissionGroup : findAll()) {
			remove(permissionGroup);
		}
	}

	/**
	 * Returns the number of permission groups.
	 *
	 * @return the number of permission groups
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

				Query q = session.createQuery(_SQL_COUNT_PERMISSIONGROUP);

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
	 * Initializes the permission group persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vnpt.portlet.user.model.PermissionGroup")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PermissionGroup>> listenersList = new ArrayList<ModelListener<PermissionGroup>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PermissionGroup>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PermissionGroupImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PERMISSIONGROUP = "SELECT permissionGroup FROM PermissionGroup permissionGroup";
	private static final String _SQL_SELECT_PERMISSIONGROUP_WHERE = "SELECT permissionGroup FROM PermissionGroup permissionGroup WHERE ";
	private static final String _SQL_COUNT_PERMISSIONGROUP = "SELECT COUNT(permissionGroup) FROM PermissionGroup permissionGroup";
	private static final String _SQL_COUNT_PERMISSIONGROUP_WHERE = "SELECT COUNT(permissionGroup) FROM PermissionGroup permissionGroup WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "permissionGroup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PermissionGroup exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PermissionGroup exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PermissionGroupPersistenceImpl.class);
	private static PermissionGroup _nullPermissionGroup = new PermissionGroupImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PermissionGroup> toCacheModel() {
				return _nullPermissionGroupCacheModel;
			}
		};

	private static CacheModel<PermissionGroup> _nullPermissionGroupCacheModel = new CacheModel<PermissionGroup>() {
			@Override
			public PermissionGroup toEntityModel() {
				return _nullPermissionGroup;
			}
		};
}
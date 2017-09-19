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

import com.vnpt.portlet.user.NoSuchPermissionTypeException;
import com.vnpt.portlet.user.model.PermissionType;
import com.vnpt.portlet.user.model.impl.PermissionTypeImpl;
import com.vnpt.portlet.user.model.impl.PermissionTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the permission type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see PermissionTypePersistence
 * @see PermissionTypeUtil
 * @generated
 */
public class PermissionTypePersistenceImpl extends BasePersistenceImpl<PermissionType>
	implements PermissionTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PermissionTypeUtil} to access the permission type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PermissionTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
			PermissionTypeModelImpl.FINDER_CACHE_ENABLED,
			PermissionTypeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
			PermissionTypeModelImpl.FINDER_CACHE_ENABLED,
			PermissionTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
			PermissionTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
			PermissionTypeModelImpl.FINDER_CACHE_ENABLED,
			PermissionTypeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
			PermissionTypeModelImpl.FINDER_CACHE_ENABLED,
			PermissionTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			PermissionTypeModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
			PermissionTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the permission types where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching permission types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionType> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the permission types where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of permission types
	 * @param end the upper bound of the range of permission types (not inclusive)
	 * @return the range of matching permission types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionType> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the permission types where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of permission types
	 * @param end the upper bound of the range of permission types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching permission types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionType> findByGroupId(long groupId, int start, int end,
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

		List<PermissionType> list = (List<PermissionType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PermissionType permissionType : list) {
				if ((groupId != permissionType.getGroupId())) {
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

			query.append(_SQL_SELECT_PERMISSIONTYPE_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PermissionTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<PermissionType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PermissionType>(list);
				}
				else {
					list = (List<PermissionType>)QueryUtil.list(q,
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
	 * Returns the first permission type in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching permission type
	 * @throws com.vnpt.portlet.user.NoSuchPermissionTypeException if a matching permission type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionType findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchPermissionTypeException, SystemException {
		PermissionType permissionType = fetchByGroupId_First(groupId,
				orderByComparator);

		if (permissionType != null) {
			return permissionType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPermissionTypeException(msg.toString());
	}

	/**
	 * Returns the first permission type in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching permission type, or <code>null</code> if a matching permission type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionType fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<PermissionType> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last permission type in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching permission type
	 * @throws com.vnpt.portlet.user.NoSuchPermissionTypeException if a matching permission type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionType findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchPermissionTypeException, SystemException {
		PermissionType permissionType = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (permissionType != null) {
			return permissionType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPermissionTypeException(msg.toString());
	}

	/**
	 * Returns the last permission type in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching permission type, or <code>null</code> if a matching permission type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionType fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<PermissionType> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the permission types before and after the current permission type in the ordered set where groupId = &#63;.
	 *
	 * @param permissionTypeId the primary key of the current permission type
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next permission type
	 * @throws com.vnpt.portlet.user.NoSuchPermissionTypeException if a permission type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionType[] findByGroupId_PrevAndNext(long permissionTypeId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchPermissionTypeException, SystemException {
		PermissionType permissionType = findByPrimaryKey(permissionTypeId);

		Session session = null;

		try {
			session = openSession();

			PermissionType[] array = new PermissionTypeImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, permissionType,
					groupId, orderByComparator, true);

			array[1] = permissionType;

			array[2] = getByGroupId_PrevAndNext(session, permissionType,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PermissionType getByGroupId_PrevAndNext(Session session,
		PermissionType permissionType, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PERMISSIONTYPE_WHERE);

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
			query.append(PermissionTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(permissionType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PermissionType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the permission types where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (PermissionType permissionType : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(permissionType);
		}
	}

	/**
	 * Returns the number of permission types where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching permission types
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

			query.append(_SQL_COUNT_PERMISSIONTYPE_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "permissionType.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
			PermissionTypeModelImpl.FINDER_CACHE_ENABLED,
			PermissionTypeImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
			PermissionTypeModelImpl.FINDER_CACHE_ENABLED,
			PermissionTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			PermissionTypeModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
			PermissionTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the permission types where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching permission types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionType> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the permission types where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of permission types
	 * @param end the upper bound of the range of permission types (not inclusive)
	 * @return the range of matching permission types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionType> findByCompanyId(long companyId, int start,
		int end) throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the permission types where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of permission types
	 * @param end the upper bound of the range of permission types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching permission types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionType> findByCompanyId(long companyId, int start,
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

		List<PermissionType> list = (List<PermissionType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PermissionType permissionType : list) {
				if ((companyId != permissionType.getCompanyId())) {
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

			query.append(_SQL_SELECT_PERMISSIONTYPE_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PermissionTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<PermissionType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PermissionType>(list);
				}
				else {
					list = (List<PermissionType>)QueryUtil.list(q,
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
	 * Returns the first permission type in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching permission type
	 * @throws com.vnpt.portlet.user.NoSuchPermissionTypeException if a matching permission type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionType findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchPermissionTypeException, SystemException {
		PermissionType permissionType = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (permissionType != null) {
			return permissionType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPermissionTypeException(msg.toString());
	}

	/**
	 * Returns the first permission type in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching permission type, or <code>null</code> if a matching permission type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionType fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<PermissionType> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last permission type in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching permission type
	 * @throws com.vnpt.portlet.user.NoSuchPermissionTypeException if a matching permission type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionType findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchPermissionTypeException, SystemException {
		PermissionType permissionType = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (permissionType != null) {
			return permissionType;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPermissionTypeException(msg.toString());
	}

	/**
	 * Returns the last permission type in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching permission type, or <code>null</code> if a matching permission type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionType fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<PermissionType> list = findByCompanyId(companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the permission types before and after the current permission type in the ordered set where companyId = &#63;.
	 *
	 * @param permissionTypeId the primary key of the current permission type
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next permission type
	 * @throws com.vnpt.portlet.user.NoSuchPermissionTypeException if a permission type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionType[] findByCompanyId_PrevAndNext(long permissionTypeId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchPermissionTypeException, SystemException {
		PermissionType permissionType = findByPrimaryKey(permissionTypeId);

		Session session = null;

		try {
			session = openSession();

			PermissionType[] array = new PermissionTypeImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, permissionType,
					companyId, orderByComparator, true);

			array[1] = permissionType;

			array[2] = getByCompanyId_PrevAndNext(session, permissionType,
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

	protected PermissionType getByCompanyId_PrevAndNext(Session session,
		PermissionType permissionType, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PERMISSIONTYPE_WHERE);

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
			query.append(PermissionTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(permissionType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PermissionType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the permission types where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (PermissionType permissionType : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(permissionType);
		}
	}

	/**
	 * Returns the number of permission types where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching permission types
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

			query.append(_SQL_COUNT_PERMISSIONTYPE_WHERE);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "permissionType.companyId = ?";

	public PermissionTypePersistenceImpl() {
		setModelClass(PermissionType.class);
	}

	/**
	 * Caches the permission type in the entity cache if it is enabled.
	 *
	 * @param permissionType the permission type
	 */
	@Override
	public void cacheResult(PermissionType permissionType) {
		EntityCacheUtil.putResult(PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
			PermissionTypeImpl.class, permissionType.getPrimaryKey(),
			permissionType);

		permissionType.resetOriginalValues();
	}

	/**
	 * Caches the permission types in the entity cache if it is enabled.
	 *
	 * @param permissionTypes the permission types
	 */
	@Override
	public void cacheResult(List<PermissionType> permissionTypes) {
		for (PermissionType permissionType : permissionTypes) {
			if (EntityCacheUtil.getResult(
						PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
						PermissionTypeImpl.class, permissionType.getPrimaryKey()) == null) {
				cacheResult(permissionType);
			}
			else {
				permissionType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all permission types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PermissionTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PermissionTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the permission type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PermissionType permissionType) {
		EntityCacheUtil.removeResult(PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
			PermissionTypeImpl.class, permissionType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PermissionType> permissionTypes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PermissionType permissionType : permissionTypes) {
			EntityCacheUtil.removeResult(PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
				PermissionTypeImpl.class, permissionType.getPrimaryKey());
		}
	}

	/**
	 * Creates a new permission type with the primary key. Does not add the permission type to the database.
	 *
	 * @param permissionTypeId the primary key for the new permission type
	 * @return the new permission type
	 */
	@Override
	public PermissionType create(long permissionTypeId) {
		PermissionType permissionType = new PermissionTypeImpl();

		permissionType.setNew(true);
		permissionType.setPrimaryKey(permissionTypeId);

		return permissionType;
	}

	/**
	 * Removes the permission type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param permissionTypeId the primary key of the permission type
	 * @return the permission type that was removed
	 * @throws com.vnpt.portlet.user.NoSuchPermissionTypeException if a permission type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionType remove(long permissionTypeId)
		throws NoSuchPermissionTypeException, SystemException {
		return remove((Serializable)permissionTypeId);
	}

	/**
	 * Removes the permission type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the permission type
	 * @return the permission type that was removed
	 * @throws com.vnpt.portlet.user.NoSuchPermissionTypeException if a permission type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionType remove(Serializable primaryKey)
		throws NoSuchPermissionTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PermissionType permissionType = (PermissionType)session.get(PermissionTypeImpl.class,
					primaryKey);

			if (permissionType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPermissionTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(permissionType);
		}
		catch (NoSuchPermissionTypeException nsee) {
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
	protected PermissionType removeImpl(PermissionType permissionType)
		throws SystemException {
		permissionType = toUnwrappedModel(permissionType);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(permissionType)) {
				permissionType = (PermissionType)session.get(PermissionTypeImpl.class,
						permissionType.getPrimaryKeyObj());
			}

			if (permissionType != null) {
				session.delete(permissionType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (permissionType != null) {
			clearCache(permissionType);
		}

		return permissionType;
	}

	@Override
	public PermissionType updateImpl(
		com.vnpt.portlet.user.model.PermissionType permissionType)
		throws SystemException {
		permissionType = toUnwrappedModel(permissionType);

		boolean isNew = permissionType.isNew();

		PermissionTypeModelImpl permissionTypeModelImpl = (PermissionTypeModelImpl)permissionType;

		Session session = null;

		try {
			session = openSession();

			if (permissionType.isNew()) {
				session.save(permissionType);

				permissionType.setNew(false);
			}
			else {
				session.merge(permissionType);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PermissionTypeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((permissionTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						permissionTypeModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { permissionTypeModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((permissionTypeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						permissionTypeModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { permissionTypeModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}
		}

		EntityCacheUtil.putResult(PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
			PermissionTypeImpl.class, permissionType.getPrimaryKey(),
			permissionType);

		return permissionType;
	}

	protected PermissionType toUnwrappedModel(PermissionType permissionType) {
		if (permissionType instanceof PermissionTypeImpl) {
			return permissionType;
		}

		PermissionTypeImpl permissionTypeImpl = new PermissionTypeImpl();

		permissionTypeImpl.setNew(permissionType.isNew());
		permissionTypeImpl.setPrimaryKey(permissionType.getPrimaryKey());

		permissionTypeImpl.setPermissionTypeId(permissionType.getPermissionTypeId());
		permissionTypeImpl.setGroupId(permissionType.getGroupId());
		permissionTypeImpl.setCompanyId(permissionType.getCompanyId());
		permissionTypeImpl.setTypeName(permissionType.getTypeName());
		permissionTypeImpl.setTypeCode(permissionType.getTypeCode());
		permissionTypeImpl.setIsActive(permissionType.getIsActive());
		permissionTypeImpl.setDescription(permissionType.getDescription());

		return permissionTypeImpl;
	}

	/**
	 * Returns the permission type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the permission type
	 * @return the permission type
	 * @throws com.vnpt.portlet.user.NoSuchPermissionTypeException if a permission type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPermissionTypeException, SystemException {
		PermissionType permissionType = fetchByPrimaryKey(primaryKey);

		if (permissionType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPermissionTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return permissionType;
	}

	/**
	 * Returns the permission type with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchPermissionTypeException} if it could not be found.
	 *
	 * @param permissionTypeId the primary key of the permission type
	 * @return the permission type
	 * @throws com.vnpt.portlet.user.NoSuchPermissionTypeException if a permission type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionType findByPrimaryKey(long permissionTypeId)
		throws NoSuchPermissionTypeException, SystemException {
		return findByPrimaryKey((Serializable)permissionTypeId);
	}

	/**
	 * Returns the permission type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the permission type
	 * @return the permission type, or <code>null</code> if a permission type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PermissionType permissionType = (PermissionType)EntityCacheUtil.getResult(PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
				PermissionTypeImpl.class, primaryKey);

		if (permissionType == _nullPermissionType) {
			return null;
		}

		if (permissionType == null) {
			Session session = null;

			try {
				session = openSession();

				permissionType = (PermissionType)session.get(PermissionTypeImpl.class,
						primaryKey);

				if (permissionType != null) {
					cacheResult(permissionType);
				}
				else {
					EntityCacheUtil.putResult(PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
						PermissionTypeImpl.class, primaryKey,
						_nullPermissionType);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PermissionTypeModelImpl.ENTITY_CACHE_ENABLED,
					PermissionTypeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return permissionType;
	}

	/**
	 * Returns the permission type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param permissionTypeId the primary key of the permission type
	 * @return the permission type, or <code>null</code> if a permission type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PermissionType fetchByPrimaryKey(long permissionTypeId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)permissionTypeId);
	}

	/**
	 * Returns all the permission types.
	 *
	 * @return the permission types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the permission types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of permission types
	 * @param end the upper bound of the range of permission types (not inclusive)
	 * @return the range of permission types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the permission types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of permission types
	 * @param end the upper bound of the range of permission types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of permission types
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PermissionType> findAll(int start, int end,
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

		List<PermissionType> list = (List<PermissionType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PERMISSIONTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PERMISSIONTYPE;

				if (pagination) {
					sql = sql.concat(PermissionTypeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PermissionType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PermissionType>(list);
				}
				else {
					list = (List<PermissionType>)QueryUtil.list(q,
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
	 * Removes all the permission types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PermissionType permissionType : findAll()) {
			remove(permissionType);
		}
	}

	/**
	 * Returns the number of permission types.
	 *
	 * @return the number of permission types
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

				Query q = session.createQuery(_SQL_COUNT_PERMISSIONTYPE);

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
	 * Initializes the permission type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vnpt.portlet.user.model.PermissionType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PermissionType>> listenersList = new ArrayList<ModelListener<PermissionType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PermissionType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PermissionTypeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PERMISSIONTYPE = "SELECT permissionType FROM PermissionType permissionType";
	private static final String _SQL_SELECT_PERMISSIONTYPE_WHERE = "SELECT permissionType FROM PermissionType permissionType WHERE ";
	private static final String _SQL_COUNT_PERMISSIONTYPE = "SELECT COUNT(permissionType) FROM PermissionType permissionType";
	private static final String _SQL_COUNT_PERMISSIONTYPE_WHERE = "SELECT COUNT(permissionType) FROM PermissionType permissionType WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "permissionType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PermissionType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PermissionType exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PermissionTypePersistenceImpl.class);
	private static PermissionType _nullPermissionType = new PermissionTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PermissionType> toCacheModel() {
				return _nullPermissionTypeCacheModel;
			}
		};

	private static CacheModel<PermissionType> _nullPermissionTypeCacheModel = new CacheModel<PermissionType>() {
			@Override
			public PermissionType toEntityModel() {
				return _nullPermissionType;
			}
		};
}
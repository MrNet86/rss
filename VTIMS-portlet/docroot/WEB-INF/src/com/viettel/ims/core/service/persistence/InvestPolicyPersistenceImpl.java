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
import com.liferay.portal.kernel.dao.orm.SQLQuery;
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
import com.liferay.portal.security.permission.InlineSQLHelperUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.viettel.ims.core.NoSuchInvestPolicyException;
import com.viettel.ims.core.model.InvestPolicy;
import com.viettel.ims.core.model.impl.InvestPolicyImpl;
import com.viettel.ims.core.model.impl.InvestPolicyModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the invest policy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see InvestPolicyPersistence
 * @see InvestPolicyUtil
 * @generated
 */
public class InvestPolicyPersistenceImpl extends BasePersistenceImpl<InvestPolicy>
	implements InvestPolicyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InvestPolicyUtil} to access the invest policy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InvestPolicyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyModelImpl.FINDER_CACHE_ENABLED, InvestPolicyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyModelImpl.FINDER_CACHE_ENABLED, InvestPolicyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INFOPOLICYNAME =
		new FinderPath(InvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyModelImpl.FINDER_CACHE_ENABLED, InvestPolicyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInfoPolicyName",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INFOPOLICYNAME =
		new FinderPath(InvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyModelImpl.FINDER_CACHE_ENABLED, InvestPolicyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInfoPolicyName",
			new String[] { String.class.getName(), Long.class.getName() },
			InvestPolicyModelImpl.INFOPOLICYNAME_COLUMN_BITMASK |
			InvestPolicyModelImpl.ISACTIVE_COLUMN_BITMASK |
			InvestPolicyModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INFOPOLICYNAME = new FinderPath(InvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInfoPolicyName",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the invest policies where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @return the matching invest policies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestPolicy> findByInfoPolicyName(String infoPolicyName,
		long isActive) throws SystemException {
		return findByInfoPolicyName(infoPolicyName, isActive,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the invest policies where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param start the lower bound of the range of invest policies
	 * @param end the upper bound of the range of invest policies (not inclusive)
	 * @return the range of matching invest policies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestPolicy> findByInfoPolicyName(String infoPolicyName,
		long isActive, int start, int end) throws SystemException {
		return findByInfoPolicyName(infoPolicyName, isActive, start, end, null);
	}

	/**
	 * Returns an ordered range of all the invest policies where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param start the lower bound of the range of invest policies
	 * @param end the upper bound of the range of invest policies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching invest policies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestPolicy> findByInfoPolicyName(String infoPolicyName,
		long isActive, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INFOPOLICYNAME;
			finderArgs = new Object[] { infoPolicyName, isActive };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INFOPOLICYNAME;
			finderArgs = new Object[] {
					infoPolicyName, isActive,
					
					start, end, orderByComparator
				};
		}

		List<InvestPolicy> list = (List<InvestPolicy>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (InvestPolicy investPolicy : list) {
				if (!Validator.equals(infoPolicyName,
							investPolicy.getInfoPolicyName()) ||
						(isActive != investPolicy.getIsActive())) {
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

			query.append(_SQL_SELECT_INVESTPOLICY_WHERE);

			boolean bindInfoPolicyName = false;

			if (infoPolicyName == null) {
				query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_1);
			}
			else if (infoPolicyName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_3);
			}
			else {
				bindInfoPolicyName = true;

				query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_2);
			}

			query.append(_FINDER_COLUMN_INFOPOLICYNAME_ISACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(InvestPolicyModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInfoPolicyName) {
					qPos.add(infoPolicyName);
				}

				qPos.add(isActive);

				if (!pagination) {
					list = (List<InvestPolicy>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InvestPolicy>(list);
				}
				else {
					list = (List<InvestPolicy>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first invest policy in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching invest policy
	 * @throws com.viettel.ims.core.NoSuchInvestPolicyException if a matching invest policy could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicy findByInfoPolicyName_First(String infoPolicyName,
		long isActive, OrderByComparator orderByComparator)
		throws NoSuchInvestPolicyException, SystemException {
		InvestPolicy investPolicy = fetchByInfoPolicyName_First(infoPolicyName,
				isActive, orderByComparator);

		if (investPolicy != null) {
			return investPolicy;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("infoPolicyName=");
		msg.append(infoPolicyName);

		msg.append(", isActive=");
		msg.append(isActive);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInvestPolicyException(msg.toString());
	}

	/**
	 * Returns the first invest policy in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching invest policy, or <code>null</code> if a matching invest policy could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicy fetchByInfoPolicyName_First(String infoPolicyName,
		long isActive, OrderByComparator orderByComparator)
		throws SystemException {
		List<InvestPolicy> list = findByInfoPolicyName(infoPolicyName,
				isActive, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last invest policy in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching invest policy
	 * @throws com.viettel.ims.core.NoSuchInvestPolicyException if a matching invest policy could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicy findByInfoPolicyName_Last(String infoPolicyName,
		long isActive, OrderByComparator orderByComparator)
		throws NoSuchInvestPolicyException, SystemException {
		InvestPolicy investPolicy = fetchByInfoPolicyName_Last(infoPolicyName,
				isActive, orderByComparator);

		if (investPolicy != null) {
			return investPolicy;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("infoPolicyName=");
		msg.append(infoPolicyName);

		msg.append(", isActive=");
		msg.append(isActive);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInvestPolicyException(msg.toString());
	}

	/**
	 * Returns the last invest policy in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching invest policy, or <code>null</code> if a matching invest policy could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicy fetchByInfoPolicyName_Last(String infoPolicyName,
		long isActive, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByInfoPolicyName(infoPolicyName, isActive);

		if (count == 0) {
			return null;
		}

		List<InvestPolicy> list = findByInfoPolicyName(infoPolicyName,
				isActive, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the invest policies before and after the current invest policy in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param investPolicyId the primary key of the current invest policy
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next invest policy
	 * @throws com.viettel.ims.core.NoSuchInvestPolicyException if a invest policy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicy[] findByInfoPolicyName_PrevAndNext(
		long investPolicyId, String infoPolicyName, long isActive,
		OrderByComparator orderByComparator)
		throws NoSuchInvestPolicyException, SystemException {
		InvestPolicy investPolicy = findByPrimaryKey(investPolicyId);

		Session session = null;

		try {
			session = openSession();

			InvestPolicy[] array = new InvestPolicyImpl[3];

			array[0] = getByInfoPolicyName_PrevAndNext(session, investPolicy,
					infoPolicyName, isActive, orderByComparator, true);

			array[1] = investPolicy;

			array[2] = getByInfoPolicyName_PrevAndNext(session, investPolicy,
					infoPolicyName, isActive, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected InvestPolicy getByInfoPolicyName_PrevAndNext(Session session,
		InvestPolicy investPolicy, String infoPolicyName, long isActive,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_INVESTPOLICY_WHERE);

		boolean bindInfoPolicyName = false;

		if (infoPolicyName == null) {
			query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_1);
		}
		else if (infoPolicyName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_3);
		}
		else {
			bindInfoPolicyName = true;

			query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_2);
		}

		query.append(_FINDER_COLUMN_INFOPOLICYNAME_ISACTIVE_2);

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
			query.append(InvestPolicyModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindInfoPolicyName) {
			qPos.add(infoPolicyName);
		}

		qPos.add(isActive);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(investPolicy);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<InvestPolicy> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the invest policies that the user has permission to view where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @return the matching invest policies that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestPolicy> filterFindByInfoPolicyName(
		String infoPolicyName, long isActive) throws SystemException {
		return filterFindByInfoPolicyName(infoPolicyName, isActive,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the invest policies that the user has permission to view where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param start the lower bound of the range of invest policies
	 * @param end the upper bound of the range of invest policies (not inclusive)
	 * @return the range of matching invest policies that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestPolicy> filterFindByInfoPolicyName(
		String infoPolicyName, long isActive, int start, int end)
		throws SystemException {
		return filterFindByInfoPolicyName(infoPolicyName, isActive, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the invest policies that the user has permissions to view where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param start the lower bound of the range of invest policies
	 * @param end the upper bound of the range of invest policies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching invest policies that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestPolicy> filterFindByInfoPolicyName(
		String infoPolicyName, long isActive, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByInfoPolicyName(infoPolicyName, isActive, start, end,
				orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_INVESTPOLICY_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_INVESTPOLICY_NO_INLINE_DISTINCT_WHERE_1);
		}

		boolean bindInfoPolicyName = false;

		if (infoPolicyName == null) {
			query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_1_SQL);
		}
		else if (infoPolicyName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_3_SQL);
		}
		else {
			bindInfoPolicyName = true;

			query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_2_SQL);
		}

		query.append(_FINDER_COLUMN_INFOPOLICYNAME_ISACTIVE_2_SQL);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_INVESTPOLICY_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator, true);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(InvestPolicyModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(InvestPolicyModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				InvestPolicy.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, InvestPolicyImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, InvestPolicyImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			if (bindInfoPolicyName) {
				qPos.add(infoPolicyName);
			}

			qPos.add(isActive);

			return (List<InvestPolicy>)QueryUtil.list(q, getDialect(), start,
				end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Returns the invest policies before and after the current invest policy in the ordered set of invest policies that the user has permission to view where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param investPolicyId the primary key of the current invest policy
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next invest policy
	 * @throws com.viettel.ims.core.NoSuchInvestPolicyException if a invest policy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicy[] filterFindByInfoPolicyName_PrevAndNext(
		long investPolicyId, String infoPolicyName, long isActive,
		OrderByComparator orderByComparator)
		throws NoSuchInvestPolicyException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return findByInfoPolicyName_PrevAndNext(investPolicyId,
				infoPolicyName, isActive, orderByComparator);
		}

		InvestPolicy investPolicy = findByPrimaryKey(investPolicyId);

		Session session = null;

		try {
			session = openSession();

			InvestPolicy[] array = new InvestPolicyImpl[3];

			array[0] = filterGetByInfoPolicyName_PrevAndNext(session,
					investPolicy, infoPolicyName, isActive, orderByComparator,
					true);

			array[1] = investPolicy;

			array[2] = filterGetByInfoPolicyName_PrevAndNext(session,
					investPolicy, infoPolicyName, isActive, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected InvestPolicy filterGetByInfoPolicyName_PrevAndNext(
		Session session, InvestPolicy investPolicy, String infoPolicyName,
		long isActive, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_INVESTPOLICY_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_INVESTPOLICY_NO_INLINE_DISTINCT_WHERE_1);
		}

		boolean bindInfoPolicyName = false;

		if (infoPolicyName == null) {
			query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_1_SQL);
		}
		else if (infoPolicyName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_3_SQL);
		}
		else {
			bindInfoPolicyName = true;

			query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_2_SQL);
		}

		query.append(_FINDER_COLUMN_INFOPOLICYNAME_ISACTIVE_2_SQL);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_INVESTPOLICY_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(InvestPolicyModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(InvestPolicyModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				InvestPolicy.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, InvestPolicyImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, InvestPolicyImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindInfoPolicyName) {
			qPos.add(infoPolicyName);
		}

		qPos.add(isActive);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(investPolicy);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<InvestPolicy> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the invest policies where infoPolicyName = &#63; and isActive = &#63; from the database.
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInfoPolicyName(String infoPolicyName, long isActive)
		throws SystemException {
		for (InvestPolicy investPolicy : findByInfoPolicyName(infoPolicyName,
				isActive, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(investPolicy);
		}
	}

	/**
	 * Returns the number of invest policies where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @return the number of matching invest policies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInfoPolicyName(String infoPolicyName, long isActive)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INFOPOLICYNAME;

		Object[] finderArgs = new Object[] { infoPolicyName, isActive };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_INVESTPOLICY_WHERE);

			boolean bindInfoPolicyName = false;

			if (infoPolicyName == null) {
				query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_1);
			}
			else if (infoPolicyName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_3);
			}
			else {
				bindInfoPolicyName = true;

				query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_2);
			}

			query.append(_FINDER_COLUMN_INFOPOLICYNAME_ISACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInfoPolicyName) {
					qPos.add(infoPolicyName);
				}

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

	/**
	 * Returns the number of invest policies that the user has permission to view where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @return the number of matching invest policies that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByInfoPolicyName(String infoPolicyName, long isActive)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled()) {
			return countByInfoPolicyName(infoPolicyName, isActive);
		}

		StringBundler query = new StringBundler(3);

		query.append(_FILTER_SQL_COUNT_INVESTPOLICY_WHERE);

		boolean bindInfoPolicyName = false;

		if (infoPolicyName == null) {
			query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_1_SQL);
		}
		else if (infoPolicyName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_3_SQL);
		}
		else {
			bindInfoPolicyName = true;

			query.append(_FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_2_SQL);
		}

		query.append(_FINDER_COLUMN_INFOPOLICYNAME_ISACTIVE_2_SQL);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				InvestPolicy.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			if (bindInfoPolicyName) {
				qPos.add(infoPolicyName);
			}

			qPos.add(isActive);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_1 = "investPolicy.infoPolicyName IS NULL AND ";
	private static final String _FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_2 = "investPolicy.infoPolicyName = ? AND ";
	private static final String _FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_3 = "(investPolicy.infoPolicyName IS NULL OR investPolicy.infoPolicyName = '') AND ";
	private static final String _FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_1_SQL =
		"investPolicy.info_policy_name IS NULL AND ";
	private static final String _FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_2_SQL =
		"investPolicy.info_policy_name = ? AND ";
	private static final String _FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_3_SQL =
		"(investPolicy.info_policy_name IS NULL OR investPolicy.info_policy_name = '') AND ";
	private static final String _FINDER_COLUMN_INFOPOLICYNAME_ISACTIVE_2 = "investPolicy.isActive = ?";
	private static final String _FINDER_COLUMN_INFOPOLICYNAME_ISACTIVE_2_SQL = "investPolicy.is_Active = ?";

	public InvestPolicyPersistenceImpl() {
		setModelClass(InvestPolicy.class);
	}

	/**
	 * Caches the invest policy in the entity cache if it is enabled.
	 *
	 * @param investPolicy the invest policy
	 */
	@Override
	public void cacheResult(InvestPolicy investPolicy) {
		EntityCacheUtil.putResult(InvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyImpl.class, investPolicy.getPrimaryKey(), investPolicy);

		investPolicy.resetOriginalValues();
	}

	/**
	 * Caches the invest policies in the entity cache if it is enabled.
	 *
	 * @param investPolicies the invest policies
	 */
	@Override
	public void cacheResult(List<InvestPolicy> investPolicies) {
		for (InvestPolicy investPolicy : investPolicies) {
			if (EntityCacheUtil.getResult(
						InvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
						InvestPolicyImpl.class, investPolicy.getPrimaryKey()) == null) {
				cacheResult(investPolicy);
			}
			else {
				investPolicy.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all invest policies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(InvestPolicyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(InvestPolicyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the invest policy.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(InvestPolicy investPolicy) {
		EntityCacheUtil.removeResult(InvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyImpl.class, investPolicy.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<InvestPolicy> investPolicies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (InvestPolicy investPolicy : investPolicies) {
			EntityCacheUtil.removeResult(InvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
				InvestPolicyImpl.class, investPolicy.getPrimaryKey());
		}
	}

	/**
	 * Creates a new invest policy with the primary key. Does not add the invest policy to the database.
	 *
	 * @param investPolicyId the primary key for the new invest policy
	 * @return the new invest policy
	 */
	@Override
	public InvestPolicy create(long investPolicyId) {
		InvestPolicy investPolicy = new InvestPolicyImpl();

		investPolicy.setNew(true);
		investPolicy.setPrimaryKey(investPolicyId);

		return investPolicy;
	}

	/**
	 * Removes the invest policy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param investPolicyId the primary key of the invest policy
	 * @return the invest policy that was removed
	 * @throws com.viettel.ims.core.NoSuchInvestPolicyException if a invest policy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicy remove(long investPolicyId)
		throws NoSuchInvestPolicyException, SystemException {
		return remove((Serializable)investPolicyId);
	}

	/**
	 * Removes the invest policy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the invest policy
	 * @return the invest policy that was removed
	 * @throws com.viettel.ims.core.NoSuchInvestPolicyException if a invest policy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicy remove(Serializable primaryKey)
		throws NoSuchInvestPolicyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			InvestPolicy investPolicy = (InvestPolicy)session.get(InvestPolicyImpl.class,
					primaryKey);

			if (investPolicy == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInvestPolicyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(investPolicy);
		}
		catch (NoSuchInvestPolicyException nsee) {
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
	protected InvestPolicy removeImpl(InvestPolicy investPolicy)
		throws SystemException {
		investPolicy = toUnwrappedModel(investPolicy);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(investPolicy)) {
				investPolicy = (InvestPolicy)session.get(InvestPolicyImpl.class,
						investPolicy.getPrimaryKeyObj());
			}

			if (investPolicy != null) {
				session.delete(investPolicy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (investPolicy != null) {
			clearCache(investPolicy);
		}

		return investPolicy;
	}

	@Override
	public InvestPolicy updateImpl(
		com.viettel.ims.core.model.InvestPolicy investPolicy)
		throws SystemException {
		investPolicy = toUnwrappedModel(investPolicy);

		boolean isNew = investPolicy.isNew();

		InvestPolicyModelImpl investPolicyModelImpl = (InvestPolicyModelImpl)investPolicy;

		Session session = null;

		try {
			session = openSession();

			if (investPolicy.isNew()) {
				session.save(investPolicy);

				investPolicy.setNew(false);
			}
			else {
				session.merge(investPolicy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !InvestPolicyModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((investPolicyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INFOPOLICYNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						investPolicyModelImpl.getOriginalInfoPolicyName(),
						investPolicyModelImpl.getOriginalIsActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INFOPOLICYNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INFOPOLICYNAME,
					args);

				args = new Object[] {
						investPolicyModelImpl.getInfoPolicyName(),
						investPolicyModelImpl.getIsActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INFOPOLICYNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INFOPOLICYNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(InvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyImpl.class, investPolicy.getPrimaryKey(), investPolicy);

		return investPolicy;
	}

	protected InvestPolicy toUnwrappedModel(InvestPolicy investPolicy) {
		if (investPolicy instanceof InvestPolicyImpl) {
			return investPolicy;
		}

		InvestPolicyImpl investPolicyImpl = new InvestPolicyImpl();

		investPolicyImpl.setNew(investPolicy.isNew());
		investPolicyImpl.setPrimaryKey(investPolicy.getPrimaryKey());

		investPolicyImpl.setInvestPolicyId(investPolicy.getInvestPolicyId());
		investPolicyImpl.setInfoPolicyType(investPolicy.getInfoPolicyType());
		investPolicyImpl.setInfoPolicyName(investPolicy.getInfoPolicyName());
		investPolicyImpl.setInfoPolicyCode(investPolicy.getInfoPolicyCode());
		investPolicyImpl.setInfoProposeGroupId(investPolicy.getInfoProposeGroupId());
		investPolicyImpl.setInfoVerifyGroupId(investPolicy.getInfoVerifyGroupId());
		investPolicyImpl.setInfoPolicyDate(investPolicy.getInfoPolicyDate());
		investPolicyImpl.setInfoPolicyDeployDate(investPolicy.getInfoPolicyDeployDate());
		investPolicyImpl.setInfoResponsibleUserId(investPolicy.getInfoResponsibleUserId());
		investPolicyImpl.setInfoService(investPolicy.getInfoService());
		investPolicyImpl.setInfoInvestTarget(investPolicy.getInfoInvestTarget());
		investPolicyImpl.setInfoInvestLocation(investPolicy.getInfoInvestLocation());
		investPolicyImpl.setInfoTechnique(investPolicy.getInfoTechnique());
		investPolicyImpl.setInfoInvestName(investPolicy.getInfoInvestName());
		investPolicyImpl.setInfoInvestDeadline(investPolicy.getInfoInvestDeadline());
		investPolicyImpl.setInfoInvestCreateGroupId(investPolicy.getInfoInvestCreateGroupId());
		investPolicyImpl.setInfoInvestDeployGroupId(investPolicy.getInfoInvestDeployGroupId());
		investPolicyImpl.setCostCapital(investPolicy.getCostCapital());
		investPolicyImpl.setCostCompensate(investPolicy.getCostCompensate());
		investPolicyImpl.setCostCompensateForeign(investPolicy.getCostCompensateForeign());
		investPolicyImpl.setCostEquiment(investPolicy.getCostEquiment());
		investPolicyImpl.setCostEquimentForeign(investPolicy.getCostEquimentForeign());
		investPolicyImpl.setCostContruction(investPolicy.getCostContruction());
		investPolicyImpl.setCostContructionForeign(investPolicy.getCostContructionForeign());
		investPolicyImpl.setCostAdvisory(investPolicy.getCostAdvisory());
		investPolicyImpl.setCostAdvisoryForeign(investPolicy.getCostAdvisoryForeign());
		investPolicyImpl.setCostManager(investPolicy.getCostManager());
		investPolicyImpl.setCostManagerForeign(investPolicy.getCostManagerForeign());
		investPolicyImpl.setCostOther(investPolicy.getCostOther());
		investPolicyImpl.setCostOtherForeign(investPolicy.getCostOtherForeign());
		investPolicyImpl.setCostProvide(investPolicy.getCostProvide());
		investPolicyImpl.setCostProvideForeign(investPolicy.getCostProvideForeign());
		investPolicyImpl.setCostLocal(investPolicy.getCostLocal());
		investPolicyImpl.setCostForeign(investPolicy.getCostForeign());
		investPolicyImpl.setCostForeignRate(investPolicy.getCostForeignRate());
		investPolicyImpl.setCostTax(investPolicy.getCostTax());
		investPolicyImpl.setCostTotalValue(investPolicy.getCostTotalValue());
		investPolicyImpl.setCostTotalValueTax(investPolicy.getCostTotalValueTax());
		investPolicyImpl.setDecideDelivererUserId(investPolicy.getDecideDelivererUserId());
		investPolicyImpl.setDecideReceiveUserId(investPolicy.getDecideReceiveUserId());
		investPolicyImpl.setDecideAskDate(investPolicy.getDecideAskDate());
		investPolicyImpl.setDecideDeadline(investPolicy.getDecideDeadline());
		investPolicyImpl.setDecideFinishDate(investPolicy.getDecideFinishDate());
		investPolicyImpl.setDecideDescription(investPolicy.getDecideDescription());
		investPolicyImpl.setDecideUserId(investPolicy.getDecideUserId());
		investPolicyImpl.setDecideDate(investPolicy.getDecideDate());
		investPolicyImpl.setVerifyStatus(investPolicy.getVerifyStatus());
		investPolicyImpl.setVerifyDocNum(investPolicy.getVerifyDocNum());
		investPolicyImpl.setVerifyDate(investPolicy.getVerifyDate());
		investPolicyImpl.setVerifyUserId(investPolicy.getVerifyUserId());
		investPolicyImpl.setVerifyDescription(investPolicy.getVerifyDescription());
		investPolicyImpl.setIsActive(investPolicy.getIsActive());
		investPolicyImpl.setStatus(investPolicy.getStatus());
		investPolicyImpl.setCreatedId(investPolicy.getCreatedId());
		investPolicyImpl.setCreatedDate(investPolicy.getCreatedDate());
		investPolicyImpl.setModifieldId(investPolicy.getModifieldId());
		investPolicyImpl.setModifieldDate(investPolicy.getModifieldDate());

		return investPolicyImpl;
	}

	/**
	 * Returns the invest policy with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the invest policy
	 * @return the invest policy
	 * @throws com.viettel.ims.core.NoSuchInvestPolicyException if a invest policy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicy findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInvestPolicyException, SystemException {
		InvestPolicy investPolicy = fetchByPrimaryKey(primaryKey);

		if (investPolicy == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInvestPolicyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return investPolicy;
	}

	/**
	 * Returns the invest policy with the primary key or throws a {@link com.viettel.ims.core.NoSuchInvestPolicyException} if it could not be found.
	 *
	 * @param investPolicyId the primary key of the invest policy
	 * @return the invest policy
	 * @throws com.viettel.ims.core.NoSuchInvestPolicyException if a invest policy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicy findByPrimaryKey(long investPolicyId)
		throws NoSuchInvestPolicyException, SystemException {
		return findByPrimaryKey((Serializable)investPolicyId);
	}

	/**
	 * Returns the invest policy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the invest policy
	 * @return the invest policy, or <code>null</code> if a invest policy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicy fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		InvestPolicy investPolicy = (InvestPolicy)EntityCacheUtil.getResult(InvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
				InvestPolicyImpl.class, primaryKey);

		if (investPolicy == _nullInvestPolicy) {
			return null;
		}

		if (investPolicy == null) {
			Session session = null;

			try {
				session = openSession();

				investPolicy = (InvestPolicy)session.get(InvestPolicyImpl.class,
						primaryKey);

				if (investPolicy != null) {
					cacheResult(investPolicy);
				}
				else {
					EntityCacheUtil.putResult(InvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
						InvestPolicyImpl.class, primaryKey, _nullInvestPolicy);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(InvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
					InvestPolicyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return investPolicy;
	}

	/**
	 * Returns the invest policy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param investPolicyId the primary key of the invest policy
	 * @return the invest policy, or <code>null</code> if a invest policy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicy fetchByPrimaryKey(long investPolicyId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)investPolicyId);
	}

	/**
	 * Returns all the invest policies.
	 *
	 * @return the invest policies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestPolicy> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the invest policies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of invest policies
	 * @param end the upper bound of the range of invest policies (not inclusive)
	 * @return the range of invest policies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestPolicy> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the invest policies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of invest policies
	 * @param end the upper bound of the range of invest policies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of invest policies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestPolicy> findAll(int start, int end,
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

		List<InvestPolicy> list = (List<InvestPolicy>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_INVESTPOLICY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INVESTPOLICY;

				if (pagination) {
					sql = sql.concat(InvestPolicyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<InvestPolicy>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InvestPolicy>(list);
				}
				else {
					list = (List<InvestPolicy>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the invest policies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (InvestPolicy investPolicy : findAll()) {
			remove(investPolicy);
		}
	}

	/**
	 * Returns the number of invest policies.
	 *
	 * @return the number of invest policies
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

				Query q = session.createQuery(_SQL_COUNT_INVESTPOLICY);

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
	 * Initializes the invest policy persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.viettel.ims.core.model.InvestPolicy")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<InvestPolicy>> listenersList = new ArrayList<ModelListener<InvestPolicy>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<InvestPolicy>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(InvestPolicyImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_INVESTPOLICY = "SELECT investPolicy FROM InvestPolicy investPolicy";
	private static final String _SQL_SELECT_INVESTPOLICY_WHERE = "SELECT investPolicy FROM InvestPolicy investPolicy WHERE ";
	private static final String _SQL_COUNT_INVESTPOLICY = "SELECT COUNT(investPolicy) FROM InvestPolicy investPolicy";
	private static final String _SQL_COUNT_INVESTPOLICY_WHERE = "SELECT COUNT(investPolicy) FROM InvestPolicy investPolicy WHERE ";
	private static final String _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN = "investPolicy.invest_policy_id";
	private static final String _FILTER_SQL_SELECT_INVESTPOLICY_WHERE = "SELECT DISTINCT {investPolicy.*} FROM Invest_Policy investPolicy WHERE ";
	private static final String _FILTER_SQL_SELECT_INVESTPOLICY_NO_INLINE_DISTINCT_WHERE_1 =
		"SELECT {Invest_Policy.*} FROM (SELECT DISTINCT investPolicy.invest_policy_id FROM Invest_Policy investPolicy WHERE ";
	private static final String _FILTER_SQL_SELECT_INVESTPOLICY_NO_INLINE_DISTINCT_WHERE_2 =
		") TEMP_TABLE INNER JOIN Invest_Policy ON TEMP_TABLE.invest_policy_id = Invest_Policy.invest_policy_id";
	private static final String _FILTER_SQL_COUNT_INVESTPOLICY_WHERE = "SELECT COUNT(DISTINCT investPolicy.invest_policy_id) AS COUNT_VALUE FROM Invest_Policy investPolicy WHERE ";
	private static final String _FILTER_ENTITY_ALIAS = "investPolicy";
	private static final String _FILTER_ENTITY_TABLE = "Invest_Policy";
	private static final String _ORDER_BY_ENTITY_ALIAS = "investPolicy.";
	private static final String _ORDER_BY_ENTITY_TABLE = "Invest_Policy.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InvestPolicy exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No InvestPolicy exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(InvestPolicyPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"investPolicyId", "infoPolicyType", "infoPolicyName",
				"infoPolicyCode", "infoProposeGroupId", "infoVerifyGroupId",
				"infoPolicyDate", "infoPolicyDeployDate",
				"infoResponsibleUserId", "infoService", "infoInvestTarget",
				"infoInvestLocation", "infoTechnique", "infoInvestName",
				"infoInvestDeadline", "infoInvestCreateGroupId",
				"infoInvestDeployGroupId", "costCapital", "costCompensate",
				"costCompensateForeign", "costEquiment", "costEquimentForeign",
				"costContruction", "costContructionForeign", "costAdvisory",
				"costAdvisoryForeign", "costManager", "costManagerForeign",
				"costOther", "costOtherForeign", "costProvide",
				"costProvideForeign", "costLocal", "costForeign",
				"costForeignRate", "costTax", "costTotalValue",
				"costTotalValueTax", "decideDelivererUserId",
				"decideReceiveUserId", "decideAskDate", "decideDeadline",
				"decideFinishDate", "decideDescription", "decideUserId",
				"decideDate", "verifyStatus", "verifyDocNum", "verifyDate",
				"verifyUserId", "verifyDescription", "isActive", "createdId",
				"createdDate", "modifieldId", "modifieldDate"
			});
	private static InvestPolicy _nullInvestPolicy = new InvestPolicyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<InvestPolicy> toCacheModel() {
				return _nullInvestPolicyCacheModel;
			}
		};

	private static CacheModel<InvestPolicy> _nullInvestPolicyCacheModel = new CacheModel<InvestPolicy>() {
			@Override
			public InvestPolicy toEntityModel() {
				return _nullInvestPolicy;
			}
		};
}
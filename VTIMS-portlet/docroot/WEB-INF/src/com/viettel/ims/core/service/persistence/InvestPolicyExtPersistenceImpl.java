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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.viettel.ims.core.NoSuchInvestPolicyExtException;
import com.viettel.ims.core.model.InvestPolicyExt;
import com.viettel.ims.core.model.impl.InvestPolicyExtImpl;
import com.viettel.ims.core.model.impl.InvestPolicyExtModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the invest policy ext service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see InvestPolicyExtPersistence
 * @see InvestPolicyExtUtil
 * @generated
 */
public class InvestPolicyExtPersistenceImpl extends BasePersistenceImpl<InvestPolicyExt>
	implements InvestPolicyExtPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InvestPolicyExtUtil} to access the invest policy ext persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InvestPolicyExtImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InvestPolicyExtModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyExtModelImpl.FINDER_CACHE_ENABLED,
			InvestPolicyExtImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InvestPolicyExtModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyExtModelImpl.FINDER_CACHE_ENABLED,
			InvestPolicyExtImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InvestPolicyExtModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyExtModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INFOPOLICYNAME =
		new FinderPath(InvestPolicyExtModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyExtModelImpl.FINDER_CACHE_ENABLED,
			InvestPolicyExtImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInfoPolicyName",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INFOPOLICYNAME =
		new FinderPath(InvestPolicyExtModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyExtModelImpl.FINDER_CACHE_ENABLED,
			InvestPolicyExtImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInfoPolicyName",
			new String[] { String.class.getName(), Long.class.getName() },
			InvestPolicyExtModelImpl.INFOPOLICYNAME_COLUMN_BITMASK |
			InvestPolicyExtModelImpl.ISACTIVE_COLUMN_BITMASK |
			InvestPolicyExtModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INFOPOLICYNAME = new FinderPath(InvestPolicyExtModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyExtModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInfoPolicyName",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the invest policy exts where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @return the matching invest policy exts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestPolicyExt> findByInfoPolicyName(String infoPolicyName,
		long isActive) throws SystemException {
		return findByInfoPolicyName(infoPolicyName, isActive,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the invest policy exts where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param start the lower bound of the range of invest policy exts
	 * @param end the upper bound of the range of invest policy exts (not inclusive)
	 * @return the range of matching invest policy exts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestPolicyExt> findByInfoPolicyName(String infoPolicyName,
		long isActive, int start, int end) throws SystemException {
		return findByInfoPolicyName(infoPolicyName, isActive, start, end, null);
	}

	/**
	 * Returns an ordered range of all the invest policy exts where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param start the lower bound of the range of invest policy exts
	 * @param end the upper bound of the range of invest policy exts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching invest policy exts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestPolicyExt> findByInfoPolicyName(String infoPolicyName,
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

		List<InvestPolicyExt> list = (List<InvestPolicyExt>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (InvestPolicyExt investPolicyExt : list) {
				if (!Validator.equals(infoPolicyName,
							investPolicyExt.getInfoPolicyName()) ||
						(isActive != investPolicyExt.getIsActive())) {
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

			query.append(_SQL_SELECT_INVESTPOLICYEXT_WHERE);

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
				query.append(InvestPolicyExtModelImpl.ORDER_BY_JPQL);
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
					list = (List<InvestPolicyExt>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InvestPolicyExt>(list);
				}
				else {
					list = (List<InvestPolicyExt>)QueryUtil.list(q,
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
	 * Returns the first invest policy ext in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching invest policy ext
	 * @throws com.viettel.ims.core.NoSuchInvestPolicyExtException if a matching invest policy ext could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicyExt findByInfoPolicyName_First(String infoPolicyName,
		long isActive, OrderByComparator orderByComparator)
		throws NoSuchInvestPolicyExtException, SystemException {
		InvestPolicyExt investPolicyExt = fetchByInfoPolicyName_First(infoPolicyName,
				isActive, orderByComparator);

		if (investPolicyExt != null) {
			return investPolicyExt;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("infoPolicyName=");
		msg.append(infoPolicyName);

		msg.append(", isActive=");
		msg.append(isActive);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInvestPolicyExtException(msg.toString());
	}

	/**
	 * Returns the first invest policy ext in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching invest policy ext, or <code>null</code> if a matching invest policy ext could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicyExt fetchByInfoPolicyName_First(String infoPolicyName,
		long isActive, OrderByComparator orderByComparator)
		throws SystemException {
		List<InvestPolicyExt> list = findByInfoPolicyName(infoPolicyName,
				isActive, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last invest policy ext in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching invest policy ext
	 * @throws com.viettel.ims.core.NoSuchInvestPolicyExtException if a matching invest policy ext could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicyExt findByInfoPolicyName_Last(String infoPolicyName,
		long isActive, OrderByComparator orderByComparator)
		throws NoSuchInvestPolicyExtException, SystemException {
		InvestPolicyExt investPolicyExt = fetchByInfoPolicyName_Last(infoPolicyName,
				isActive, orderByComparator);

		if (investPolicyExt != null) {
			return investPolicyExt;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("infoPolicyName=");
		msg.append(infoPolicyName);

		msg.append(", isActive=");
		msg.append(isActive);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInvestPolicyExtException(msg.toString());
	}

	/**
	 * Returns the last invest policy ext in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching invest policy ext, or <code>null</code> if a matching invest policy ext could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicyExt fetchByInfoPolicyName_Last(String infoPolicyName,
		long isActive, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByInfoPolicyName(infoPolicyName, isActive);

		if (count == 0) {
			return null;
		}

		List<InvestPolicyExt> list = findByInfoPolicyName(infoPolicyName,
				isActive, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the invest policy exts before and after the current invest policy ext in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param investPolicyId the primary key of the current invest policy ext
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next invest policy ext
	 * @throws com.viettel.ims.core.NoSuchInvestPolicyExtException if a invest policy ext with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicyExt[] findByInfoPolicyName_PrevAndNext(
		long investPolicyId, String infoPolicyName, long isActive,
		OrderByComparator orderByComparator)
		throws NoSuchInvestPolicyExtException, SystemException {
		InvestPolicyExt investPolicyExt = findByPrimaryKey(investPolicyId);

		Session session = null;

		try {
			session = openSession();

			InvestPolicyExt[] array = new InvestPolicyExtImpl[3];

			array[0] = getByInfoPolicyName_PrevAndNext(session,
					investPolicyExt, infoPolicyName, isActive,
					orderByComparator, true);

			array[1] = investPolicyExt;

			array[2] = getByInfoPolicyName_PrevAndNext(session,
					investPolicyExt, infoPolicyName, isActive,
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

	protected InvestPolicyExt getByInfoPolicyName_PrevAndNext(Session session,
		InvestPolicyExt investPolicyExt, String infoPolicyName, long isActive,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_INVESTPOLICYEXT_WHERE);

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
			query.append(InvestPolicyExtModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(investPolicyExt);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<InvestPolicyExt> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the invest policy exts where infoPolicyName = &#63; and isActive = &#63; from the database.
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInfoPolicyName(String infoPolicyName, long isActive)
		throws SystemException {
		for (InvestPolicyExt investPolicyExt : findByInfoPolicyName(
				infoPolicyName, isActive, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(investPolicyExt);
		}
	}

	/**
	 * Returns the number of invest policy exts where infoPolicyName = &#63; and isActive = &#63;.
	 *
	 * @param infoPolicyName the info policy name
	 * @param isActive the is active
	 * @return the number of matching invest policy exts
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

			query.append(_SQL_COUNT_INVESTPOLICYEXT_WHERE);

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

	private static final String _FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_1 = "investPolicyExt.infoPolicyName IS NULL AND ";
	private static final String _FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_2 = "investPolicyExt.infoPolicyName = ? AND ";
	private static final String _FINDER_COLUMN_INFOPOLICYNAME_INFOPOLICYNAME_3 = "(investPolicyExt.infoPolicyName IS NULL OR investPolicyExt.infoPolicyName = '') AND ";
	private static final String _FINDER_COLUMN_INFOPOLICYNAME_ISACTIVE_2 = "investPolicyExt.isActive = ?";

	public InvestPolicyExtPersistenceImpl() {
		setModelClass(InvestPolicyExt.class);
	}

	/**
	 * Caches the invest policy ext in the entity cache if it is enabled.
	 *
	 * @param investPolicyExt the invest policy ext
	 */
	@Override
	public void cacheResult(InvestPolicyExt investPolicyExt) {
		EntityCacheUtil.putResult(InvestPolicyExtModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyExtImpl.class, investPolicyExt.getPrimaryKey(),
			investPolicyExt);

		investPolicyExt.resetOriginalValues();
	}

	/**
	 * Caches the invest policy exts in the entity cache if it is enabled.
	 *
	 * @param investPolicyExts the invest policy exts
	 */
	@Override
	public void cacheResult(List<InvestPolicyExt> investPolicyExts) {
		for (InvestPolicyExt investPolicyExt : investPolicyExts) {
			if (EntityCacheUtil.getResult(
						InvestPolicyExtModelImpl.ENTITY_CACHE_ENABLED,
						InvestPolicyExtImpl.class,
						investPolicyExt.getPrimaryKey()) == null) {
				cacheResult(investPolicyExt);
			}
			else {
				investPolicyExt.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all invest policy exts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(InvestPolicyExtImpl.class.getName());
		}

		EntityCacheUtil.clearCache(InvestPolicyExtImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the invest policy ext.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(InvestPolicyExt investPolicyExt) {
		EntityCacheUtil.removeResult(InvestPolicyExtModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyExtImpl.class, investPolicyExt.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<InvestPolicyExt> investPolicyExts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (InvestPolicyExt investPolicyExt : investPolicyExts) {
			EntityCacheUtil.removeResult(InvestPolicyExtModelImpl.ENTITY_CACHE_ENABLED,
				InvestPolicyExtImpl.class, investPolicyExt.getPrimaryKey());
		}
	}

	/**
	 * Creates a new invest policy ext with the primary key. Does not add the invest policy ext to the database.
	 *
	 * @param investPolicyId the primary key for the new invest policy ext
	 * @return the new invest policy ext
	 */
	@Override
	public InvestPolicyExt create(long investPolicyId) {
		InvestPolicyExt investPolicyExt = new InvestPolicyExtImpl();

		investPolicyExt.setNew(true);
		investPolicyExt.setPrimaryKey(investPolicyId);

		return investPolicyExt;
	}

	/**
	 * Removes the invest policy ext with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param investPolicyId the primary key of the invest policy ext
	 * @return the invest policy ext that was removed
	 * @throws com.viettel.ims.core.NoSuchInvestPolicyExtException if a invest policy ext with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicyExt remove(long investPolicyId)
		throws NoSuchInvestPolicyExtException, SystemException {
		return remove((Serializable)investPolicyId);
	}

	/**
	 * Removes the invest policy ext with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the invest policy ext
	 * @return the invest policy ext that was removed
	 * @throws com.viettel.ims.core.NoSuchInvestPolicyExtException if a invest policy ext with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicyExt remove(Serializable primaryKey)
		throws NoSuchInvestPolicyExtException, SystemException {
		Session session = null;

		try {
			session = openSession();

			InvestPolicyExt investPolicyExt = (InvestPolicyExt)session.get(InvestPolicyExtImpl.class,
					primaryKey);

			if (investPolicyExt == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInvestPolicyExtException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(investPolicyExt);
		}
		catch (NoSuchInvestPolicyExtException nsee) {
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
	protected InvestPolicyExt removeImpl(InvestPolicyExt investPolicyExt)
		throws SystemException {
		investPolicyExt = toUnwrappedModel(investPolicyExt);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(investPolicyExt)) {
				investPolicyExt = (InvestPolicyExt)session.get(InvestPolicyExtImpl.class,
						investPolicyExt.getPrimaryKeyObj());
			}

			if (investPolicyExt != null) {
				session.delete(investPolicyExt);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (investPolicyExt != null) {
			clearCache(investPolicyExt);
		}

		return investPolicyExt;
	}

	@Override
	public InvestPolicyExt updateImpl(
		com.viettel.ims.core.model.InvestPolicyExt investPolicyExt)
		throws SystemException {
		investPolicyExt = toUnwrappedModel(investPolicyExt);

		boolean isNew = investPolicyExt.isNew();

		InvestPolicyExtModelImpl investPolicyExtModelImpl = (InvestPolicyExtModelImpl)investPolicyExt;

		Session session = null;

		try {
			session = openSession();

			if (investPolicyExt.isNew()) {
				session.save(investPolicyExt);

				investPolicyExt.setNew(false);
			}
			else {
				session.merge(investPolicyExt);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !InvestPolicyExtModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((investPolicyExtModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INFOPOLICYNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						investPolicyExtModelImpl.getOriginalInfoPolicyName(),
						investPolicyExtModelImpl.getOriginalIsActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INFOPOLICYNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INFOPOLICYNAME,
					args);

				args = new Object[] {
						investPolicyExtModelImpl.getInfoPolicyName(),
						investPolicyExtModelImpl.getIsActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INFOPOLICYNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INFOPOLICYNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(InvestPolicyExtModelImpl.ENTITY_CACHE_ENABLED,
			InvestPolicyExtImpl.class, investPolicyExt.getPrimaryKey(),
			investPolicyExt);

		return investPolicyExt;
	}

	protected InvestPolicyExt toUnwrappedModel(InvestPolicyExt investPolicyExt) {
		if (investPolicyExt instanceof InvestPolicyExtImpl) {
			return investPolicyExt;
		}

		InvestPolicyExtImpl investPolicyExtImpl = new InvestPolicyExtImpl();

		investPolicyExtImpl.setNew(investPolicyExt.isNew());
		investPolicyExtImpl.setPrimaryKey(investPolicyExt.getPrimaryKey());

		investPolicyExtImpl.setInvestPolicyId(investPolicyExt.getInvestPolicyId());
		investPolicyExtImpl.setInfoPolicyType(investPolicyExt.getInfoPolicyType());
		investPolicyExtImpl.setInfoPolicyName(investPolicyExt.getInfoPolicyName());
		investPolicyExtImpl.setInfoPolicyCode(investPolicyExt.getInfoPolicyCode());
		investPolicyExtImpl.setInfoProposeGroupId(investPolicyExt.getInfoProposeGroupId());
		investPolicyExtImpl.setInfoVerifyGroupId(investPolicyExt.getInfoVerifyGroupId());
		investPolicyExtImpl.setInfoPolicyDate(investPolicyExt.getInfoPolicyDate());
		investPolicyExtImpl.setInfoPolicyDeployDate(investPolicyExt.getInfoPolicyDeployDate());
		investPolicyExtImpl.setInfoResponsibleUserId(investPolicyExt.getInfoResponsibleUserId());
		investPolicyExtImpl.setInfoService(investPolicyExt.getInfoService());
		investPolicyExtImpl.setInfoInvestTarget(investPolicyExt.getInfoInvestTarget());
		investPolicyExtImpl.setInfoInvestLocation(investPolicyExt.getInfoInvestLocation());
		investPolicyExtImpl.setInfoTechnique(investPolicyExt.getInfoTechnique());
		investPolicyExtImpl.setInfoInvestName(investPolicyExt.getInfoInvestName());
		investPolicyExtImpl.setInfoInvestDeadline(investPolicyExt.getInfoInvestDeadline());
		investPolicyExtImpl.setInfoInvestCreateGroupId(investPolicyExt.getInfoInvestCreateGroupId());
		investPolicyExtImpl.setInfoInvestDeployGroupId(investPolicyExt.getInfoInvestDeployGroupId());
		investPolicyExtImpl.setCostCapital(investPolicyExt.getCostCapital());
		investPolicyExtImpl.setCostCompensate(investPolicyExt.getCostCompensate());
		investPolicyExtImpl.setCostCompensateForeign(investPolicyExt.getCostCompensateForeign());
		investPolicyExtImpl.setCostEquiment(investPolicyExt.getCostEquiment());
		investPolicyExtImpl.setCostEquimentForeign(investPolicyExt.getCostEquimentForeign());
		investPolicyExtImpl.setCostContruction(investPolicyExt.getCostContruction());
		investPolicyExtImpl.setCostContructionForeign(investPolicyExt.getCostContructionForeign());
		investPolicyExtImpl.setCostAdvisory(investPolicyExt.getCostAdvisory());
		investPolicyExtImpl.setCostAdvisoryForeign(investPolicyExt.getCostAdvisoryForeign());
		investPolicyExtImpl.setCostManager(investPolicyExt.getCostManager());
		investPolicyExtImpl.setCostManagerForeign(investPolicyExt.getCostManagerForeign());
		investPolicyExtImpl.setCostOther(investPolicyExt.getCostOther());
		investPolicyExtImpl.setCostOtherForeign(investPolicyExt.getCostOtherForeign());
		investPolicyExtImpl.setCostProvide(investPolicyExt.getCostProvide());
		investPolicyExtImpl.setCostProvideForeign(investPolicyExt.getCostProvideForeign());
		investPolicyExtImpl.setCostLocal(investPolicyExt.getCostLocal());
		investPolicyExtImpl.setCostForeign(investPolicyExt.getCostForeign());
		investPolicyExtImpl.setCostForeignRate(investPolicyExt.getCostForeignRate());
		investPolicyExtImpl.setCostTax(investPolicyExt.getCostTax());
		investPolicyExtImpl.setCostTotalValue(investPolicyExt.getCostTotalValue());
		investPolicyExtImpl.setCostTotalValueTax(investPolicyExt.getCostTotalValueTax());
		investPolicyExtImpl.setDecideDelivererUserId(investPolicyExt.getDecideDelivererUserId());
		investPolicyExtImpl.setDecideReceiveUserId(investPolicyExt.getDecideReceiveUserId());
		investPolicyExtImpl.setDecideAskDate(investPolicyExt.getDecideAskDate());
		investPolicyExtImpl.setDecideDeadline(investPolicyExt.getDecideDeadline());
		investPolicyExtImpl.setDecideFinishDate(investPolicyExt.getDecideFinishDate());
		investPolicyExtImpl.setDecideDescription(investPolicyExt.getDecideDescription());
		investPolicyExtImpl.setDecideUserId(investPolicyExt.getDecideUserId());
		investPolicyExtImpl.setDecideDate(investPolicyExt.getDecideDate());
		investPolicyExtImpl.setVerifyStatus(investPolicyExt.getVerifyStatus());
		investPolicyExtImpl.setVerifyDocNum(investPolicyExt.getVerifyDocNum());
		investPolicyExtImpl.setVerifyDate(investPolicyExt.getVerifyDate());
		investPolicyExtImpl.setVerifyUserId(investPolicyExt.getVerifyUserId());
		investPolicyExtImpl.setVerifyDescription(investPolicyExt.getVerifyDescription());
		investPolicyExtImpl.setIsActive(investPolicyExt.getIsActive());
		investPolicyExtImpl.setStatus(investPolicyExt.getStatus());
		investPolicyExtImpl.setCreatedId(investPolicyExt.getCreatedId());
		investPolicyExtImpl.setCreatedDate(investPolicyExt.getCreatedDate());
		investPolicyExtImpl.setModifieldId(investPolicyExt.getModifieldId());
		investPolicyExtImpl.setModifieldDate(investPolicyExt.getModifieldDate());
		investPolicyExtImpl.setInfoPolicyTypeName(investPolicyExt.getInfoPolicyTypeName());
		investPolicyExtImpl.setInfoProposeGroupName(investPolicyExt.getInfoProposeGroupName());
		investPolicyExtImpl.setInfoVerifyGroupName(investPolicyExt.getInfoVerifyGroupName());
		investPolicyExtImpl.setInfoResponsibleUserName(investPolicyExt.getInfoResponsibleUserName());
		investPolicyExtImpl.setInfoInvestCreateGroupName(investPolicyExt.getInfoInvestCreateGroupName());
		investPolicyExtImpl.setInfoInvestDeployGroupName(investPolicyExt.getInfoInvestDeployGroupName());

		return investPolicyExtImpl;
	}

	/**
	 * Returns the invest policy ext with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the invest policy ext
	 * @return the invest policy ext
	 * @throws com.viettel.ims.core.NoSuchInvestPolicyExtException if a invest policy ext with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicyExt findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInvestPolicyExtException, SystemException {
		InvestPolicyExt investPolicyExt = fetchByPrimaryKey(primaryKey);

		if (investPolicyExt == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInvestPolicyExtException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return investPolicyExt;
	}

	/**
	 * Returns the invest policy ext with the primary key or throws a {@link com.viettel.ims.core.NoSuchInvestPolicyExtException} if it could not be found.
	 *
	 * @param investPolicyId the primary key of the invest policy ext
	 * @return the invest policy ext
	 * @throws com.viettel.ims.core.NoSuchInvestPolicyExtException if a invest policy ext with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicyExt findByPrimaryKey(long investPolicyId)
		throws NoSuchInvestPolicyExtException, SystemException {
		return findByPrimaryKey((Serializable)investPolicyId);
	}

	/**
	 * Returns the invest policy ext with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the invest policy ext
	 * @return the invest policy ext, or <code>null</code> if a invest policy ext with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicyExt fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		InvestPolicyExt investPolicyExt = (InvestPolicyExt)EntityCacheUtil.getResult(InvestPolicyExtModelImpl.ENTITY_CACHE_ENABLED,
				InvestPolicyExtImpl.class, primaryKey);

		if (investPolicyExt == _nullInvestPolicyExt) {
			return null;
		}

		if (investPolicyExt == null) {
			Session session = null;

			try {
				session = openSession();

				investPolicyExt = (InvestPolicyExt)session.get(InvestPolicyExtImpl.class,
						primaryKey);

				if (investPolicyExt != null) {
					cacheResult(investPolicyExt);
				}
				else {
					EntityCacheUtil.putResult(InvestPolicyExtModelImpl.ENTITY_CACHE_ENABLED,
						InvestPolicyExtImpl.class, primaryKey,
						_nullInvestPolicyExt);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(InvestPolicyExtModelImpl.ENTITY_CACHE_ENABLED,
					InvestPolicyExtImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return investPolicyExt;
	}

	/**
	 * Returns the invest policy ext with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param investPolicyId the primary key of the invest policy ext
	 * @return the invest policy ext, or <code>null</code> if a invest policy ext with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InvestPolicyExt fetchByPrimaryKey(long investPolicyId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)investPolicyId);
	}

	/**
	 * Returns all the invest policy exts.
	 *
	 * @return the invest policy exts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestPolicyExt> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the invest policy exts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of invest policy exts
	 * @param end the upper bound of the range of invest policy exts (not inclusive)
	 * @return the range of invest policy exts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestPolicyExt> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the invest policy exts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of invest policy exts
	 * @param end the upper bound of the range of invest policy exts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of invest policy exts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InvestPolicyExt> findAll(int start, int end,
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

		List<InvestPolicyExt> list = (List<InvestPolicyExt>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_INVESTPOLICYEXT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INVESTPOLICYEXT;

				if (pagination) {
					sql = sql.concat(InvestPolicyExtModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<InvestPolicyExt>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InvestPolicyExt>(list);
				}
				else {
					list = (List<InvestPolicyExt>)QueryUtil.list(q,
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
	 * Removes all the invest policy exts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (InvestPolicyExt investPolicyExt : findAll()) {
			remove(investPolicyExt);
		}
	}

	/**
	 * Returns the number of invest policy exts.
	 *
	 * @return the number of invest policy exts
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

				Query q = session.createQuery(_SQL_COUNT_INVESTPOLICYEXT);

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
	 * Initializes the invest policy ext persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.viettel.ims.core.model.InvestPolicyExt")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<InvestPolicyExt>> listenersList = new ArrayList<ModelListener<InvestPolicyExt>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<InvestPolicyExt>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(InvestPolicyExtImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_INVESTPOLICYEXT = "SELECT investPolicyExt FROM InvestPolicyExt investPolicyExt";
	private static final String _SQL_SELECT_INVESTPOLICYEXT_WHERE = "SELECT investPolicyExt FROM InvestPolicyExt investPolicyExt WHERE ";
	private static final String _SQL_COUNT_INVESTPOLICYEXT = "SELECT COUNT(investPolicyExt) FROM InvestPolicyExt investPolicyExt";
	private static final String _SQL_COUNT_INVESTPOLICYEXT_WHERE = "SELECT COUNT(investPolicyExt) FROM InvestPolicyExt investPolicyExt WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "investPolicyExt.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InvestPolicyExt exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No InvestPolicyExt exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(InvestPolicyExtPersistenceImpl.class);
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
	private static InvestPolicyExt _nullInvestPolicyExt = new InvestPolicyExtImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<InvestPolicyExt> toCacheModel() {
				return _nullInvestPolicyExtCacheModel;
			}
		};

	private static CacheModel<InvestPolicyExt> _nullInvestPolicyExtCacheModel = new CacheModel<InvestPolicyExt>() {
			@Override
			public InvestPolicyExt toEntityModel() {
				return _nullInvestPolicyExt;
			}
		};
}
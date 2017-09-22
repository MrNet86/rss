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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vnpt.portlet.user.NoSuchActIdMembershipException;
import com.vnpt.portlet.user.model.ActIdMembership;
import com.vnpt.portlet.user.model.impl.ActIdMembershipImpl;
import com.vnpt.portlet.user.model.impl.ActIdMembershipModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the act ID membership service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see ActIdMembershipPersistence
 * @see ActIdMembershipUtil
 * @generated
 */
public class ActIdMembershipPersistenceImpl extends BasePersistenceImpl<ActIdMembership>
	implements ActIdMembershipPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ActIdMembershipUtil} to access the act ID membership persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ActIdMembershipImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ActIdMembershipModelImpl.ENTITY_CACHE_ENABLED,
			ActIdMembershipModelImpl.FINDER_CACHE_ENABLED,
			ActIdMembershipImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ActIdMembershipModelImpl.ENTITY_CACHE_ENABLED,
			ActIdMembershipModelImpl.FINDER_CACHE_ENABLED,
			ActIdMembershipImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ActIdMembershipModelImpl.ENTITY_CACHE_ENABLED,
			ActIdMembershipModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ActIdMembershipPersistenceImpl() {
		setModelClass(ActIdMembership.class);
	}

	/**
	 * Caches the act ID membership in the entity cache if it is enabled.
	 *
	 * @param actIdMembership the act ID membership
	 */
	@Override
	public void cacheResult(ActIdMembership actIdMembership) {
		EntityCacheUtil.putResult(ActIdMembershipModelImpl.ENTITY_CACHE_ENABLED,
			ActIdMembershipImpl.class, actIdMembership.getPrimaryKey(),
			actIdMembership);

		actIdMembership.resetOriginalValues();
	}

	/**
	 * Caches the act ID memberships in the entity cache if it is enabled.
	 *
	 * @param actIdMemberships the act ID memberships
	 */
	@Override
	public void cacheResult(List<ActIdMembership> actIdMemberships) {
		for (ActIdMembership actIdMembership : actIdMemberships) {
			if (EntityCacheUtil.getResult(
						ActIdMembershipModelImpl.ENTITY_CACHE_ENABLED,
						ActIdMembershipImpl.class,
						actIdMembership.getPrimaryKey()) == null) {
				cacheResult(actIdMembership);
			}
			else {
				actIdMembership.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all act ID memberships.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ActIdMembershipImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ActIdMembershipImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the act ID membership.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ActIdMembership actIdMembership) {
		EntityCacheUtil.removeResult(ActIdMembershipModelImpl.ENTITY_CACHE_ENABLED,
			ActIdMembershipImpl.class, actIdMembership.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ActIdMembership> actIdMemberships) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ActIdMembership actIdMembership : actIdMemberships) {
			EntityCacheUtil.removeResult(ActIdMembershipModelImpl.ENTITY_CACHE_ENABLED,
				ActIdMembershipImpl.class, actIdMembership.getPrimaryKey());
		}
	}

	/**
	 * Creates a new act ID membership with the primary key. Does not add the act ID membership to the database.
	 *
	 * @param actIdMembershipPK the primary key for the new act ID membership
	 * @return the new act ID membership
	 */
	@Override
	public ActIdMembership create(ActIdMembershipPK actIdMembershipPK) {
		ActIdMembership actIdMembership = new ActIdMembershipImpl();

		actIdMembership.setNew(true);
		actIdMembership.setPrimaryKey(actIdMembershipPK);

		return actIdMembership;
	}

	/**
	 * Removes the act ID membership with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param actIdMembershipPK the primary key of the act ID membership
	 * @return the act ID membership that was removed
	 * @throws com.vnpt.portlet.user.NoSuchActIdMembershipException if a act ID membership with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdMembership remove(ActIdMembershipPK actIdMembershipPK)
		throws NoSuchActIdMembershipException, SystemException {
		return remove((Serializable)actIdMembershipPK);
	}

	/**
	 * Removes the act ID membership with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the act ID membership
	 * @return the act ID membership that was removed
	 * @throws com.vnpt.portlet.user.NoSuchActIdMembershipException if a act ID membership with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdMembership remove(Serializable primaryKey)
		throws NoSuchActIdMembershipException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ActIdMembership actIdMembership = (ActIdMembership)session.get(ActIdMembershipImpl.class,
					primaryKey);

			if (actIdMembership == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchActIdMembershipException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(actIdMembership);
		}
		catch (NoSuchActIdMembershipException nsee) {
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
	protected ActIdMembership removeImpl(ActIdMembership actIdMembership)
		throws SystemException {
		actIdMembership = toUnwrappedModel(actIdMembership);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(actIdMembership)) {
				actIdMembership = (ActIdMembership)session.get(ActIdMembershipImpl.class,
						actIdMembership.getPrimaryKeyObj());
			}

			if (actIdMembership != null) {
				session.delete(actIdMembership);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (actIdMembership != null) {
			clearCache(actIdMembership);
		}

		return actIdMembership;
	}

	@Override
	public ActIdMembership updateImpl(
		com.vnpt.portlet.user.model.ActIdMembership actIdMembership)
		throws SystemException {
		actIdMembership = toUnwrappedModel(actIdMembership);

		boolean isNew = actIdMembership.isNew();

		Session session = null;

		try {
			session = openSession();

			if (actIdMembership.isNew()) {
				session.save(actIdMembership);

				actIdMembership.setNew(false);
			}
			else {
				session.merge(actIdMembership);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ActIdMembershipModelImpl.ENTITY_CACHE_ENABLED,
			ActIdMembershipImpl.class, actIdMembership.getPrimaryKey(),
			actIdMembership);

		return actIdMembership;
	}

	protected ActIdMembership toUnwrappedModel(ActIdMembership actIdMembership) {
		if (actIdMembership instanceof ActIdMembershipImpl) {
			return actIdMembership;
		}

		ActIdMembershipImpl actIdMembershipImpl = new ActIdMembershipImpl();

		actIdMembershipImpl.setNew(actIdMembership.isNew());
		actIdMembershipImpl.setPrimaryKey(actIdMembership.getPrimaryKey());

		actIdMembershipImpl.setUserId(actIdMembership.getUserId());
		actIdMembershipImpl.setGroupId(actIdMembership.getGroupId());

		return actIdMembershipImpl;
	}

	/**
	 * Returns the act ID membership with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the act ID membership
	 * @return the act ID membership
	 * @throws com.vnpt.portlet.user.NoSuchActIdMembershipException if a act ID membership with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdMembership findByPrimaryKey(Serializable primaryKey)
		throws NoSuchActIdMembershipException, SystemException {
		ActIdMembership actIdMembership = fetchByPrimaryKey(primaryKey);

		if (actIdMembership == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchActIdMembershipException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return actIdMembership;
	}

	/**
	 * Returns the act ID membership with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchActIdMembershipException} if it could not be found.
	 *
	 * @param actIdMembershipPK the primary key of the act ID membership
	 * @return the act ID membership
	 * @throws com.vnpt.portlet.user.NoSuchActIdMembershipException if a act ID membership with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdMembership findByPrimaryKey(ActIdMembershipPK actIdMembershipPK)
		throws NoSuchActIdMembershipException, SystemException {
		return findByPrimaryKey((Serializable)actIdMembershipPK);
	}

	/**
	 * Returns the act ID membership with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the act ID membership
	 * @return the act ID membership, or <code>null</code> if a act ID membership with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdMembership fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ActIdMembership actIdMembership = (ActIdMembership)EntityCacheUtil.getResult(ActIdMembershipModelImpl.ENTITY_CACHE_ENABLED,
				ActIdMembershipImpl.class, primaryKey);

		if (actIdMembership == _nullActIdMembership) {
			return null;
		}

		if (actIdMembership == null) {
			Session session = null;

			try {
				session = openSession();

				actIdMembership = (ActIdMembership)session.get(ActIdMembershipImpl.class,
						primaryKey);

				if (actIdMembership != null) {
					cacheResult(actIdMembership);
				}
				else {
					EntityCacheUtil.putResult(ActIdMembershipModelImpl.ENTITY_CACHE_ENABLED,
						ActIdMembershipImpl.class, primaryKey,
						_nullActIdMembership);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ActIdMembershipModelImpl.ENTITY_CACHE_ENABLED,
					ActIdMembershipImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return actIdMembership;
	}

	/**
	 * Returns the act ID membership with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param actIdMembershipPK the primary key of the act ID membership
	 * @return the act ID membership, or <code>null</code> if a act ID membership with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdMembership fetchByPrimaryKey(
		ActIdMembershipPK actIdMembershipPK) throws SystemException {
		return fetchByPrimaryKey((Serializable)actIdMembershipPK);
	}

	/**
	 * Returns all the act ID memberships.
	 *
	 * @return the act ID memberships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActIdMembership> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the act ID memberships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdMembershipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of act ID memberships
	 * @param end the upper bound of the range of act ID memberships (not inclusive)
	 * @return the range of act ID memberships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActIdMembership> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the act ID memberships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdMembershipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of act ID memberships
	 * @param end the upper bound of the range of act ID memberships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of act ID memberships
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActIdMembership> findAll(int start, int end,
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

		List<ActIdMembership> list = (List<ActIdMembership>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACTIDMEMBERSHIP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACTIDMEMBERSHIP;

				if (pagination) {
					sql = sql.concat(ActIdMembershipModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ActIdMembership>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActIdMembership>(list);
				}
				else {
					list = (List<ActIdMembership>)QueryUtil.list(q,
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
	 * Removes all the act ID memberships from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ActIdMembership actIdMembership : findAll()) {
			remove(actIdMembership);
		}
	}

	/**
	 * Returns the number of act ID memberships.
	 *
	 * @return the number of act ID memberships
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

				Query q = session.createQuery(_SQL_COUNT_ACTIDMEMBERSHIP);

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
	 * Initializes the act ID membership persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vnpt.portlet.user.model.ActIdMembership")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ActIdMembership>> listenersList = new ArrayList<ModelListener<ActIdMembership>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ActIdMembership>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ActIdMembershipImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ACTIDMEMBERSHIP = "SELECT actIdMembership FROM ActIdMembership actIdMembership";
	private static final String _SQL_COUNT_ACTIDMEMBERSHIP = "SELECT COUNT(actIdMembership) FROM ActIdMembership actIdMembership";
	private static final String _ORDER_BY_ENTITY_ALIAS = "actIdMembership.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ActIdMembership exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ActIdMembershipPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"userId", "groupId"
			});
	private static ActIdMembership _nullActIdMembership = new ActIdMembershipImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ActIdMembership> toCacheModel() {
				return _nullActIdMembershipCacheModel;
			}
		};

	private static CacheModel<ActIdMembership> _nullActIdMembershipCacheModel = new CacheModel<ActIdMembership>() {
			@Override
			public ActIdMembership toEntityModel() {
				return _nullActIdMembership;
			}
		};
}
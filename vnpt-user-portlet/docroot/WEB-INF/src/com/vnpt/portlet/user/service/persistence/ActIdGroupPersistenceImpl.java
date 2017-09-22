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

import com.vnpt.portlet.user.NoSuchActIdGroupException;
import com.vnpt.portlet.user.model.ActIdGroup;
import com.vnpt.portlet.user.model.impl.ActIdGroupImpl;
import com.vnpt.portlet.user.model.impl.ActIdGroupModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the act ID group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see ActIdGroupPersistence
 * @see ActIdGroupUtil
 * @generated
 */
public class ActIdGroupPersistenceImpl extends BasePersistenceImpl<ActIdGroup>
	implements ActIdGroupPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ActIdGroupUtil} to access the act ID group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ActIdGroupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ActIdGroupModelImpl.ENTITY_CACHE_ENABLED,
			ActIdGroupModelImpl.FINDER_CACHE_ENABLED, ActIdGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ActIdGroupModelImpl.ENTITY_CACHE_ENABLED,
			ActIdGroupModelImpl.FINDER_CACHE_ENABLED, ActIdGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ActIdGroupModelImpl.ENTITY_CACHE_ENABLED,
			ActIdGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ActIdGroupPersistenceImpl() {
		setModelClass(ActIdGroup.class);
	}

	/**
	 * Caches the act ID group in the entity cache if it is enabled.
	 *
	 * @param actIdGroup the act ID group
	 */
	@Override
	public void cacheResult(ActIdGroup actIdGroup) {
		EntityCacheUtil.putResult(ActIdGroupModelImpl.ENTITY_CACHE_ENABLED,
			ActIdGroupImpl.class, actIdGroup.getPrimaryKey(), actIdGroup);

		actIdGroup.resetOriginalValues();
	}

	/**
	 * Caches the act ID groups in the entity cache if it is enabled.
	 *
	 * @param actIdGroups the act ID groups
	 */
	@Override
	public void cacheResult(List<ActIdGroup> actIdGroups) {
		for (ActIdGroup actIdGroup : actIdGroups) {
			if (EntityCacheUtil.getResult(
						ActIdGroupModelImpl.ENTITY_CACHE_ENABLED,
						ActIdGroupImpl.class, actIdGroup.getPrimaryKey()) == null) {
				cacheResult(actIdGroup);
			}
			else {
				actIdGroup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all act ID groups.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ActIdGroupImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ActIdGroupImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the act ID group.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ActIdGroup actIdGroup) {
		EntityCacheUtil.removeResult(ActIdGroupModelImpl.ENTITY_CACHE_ENABLED,
			ActIdGroupImpl.class, actIdGroup.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ActIdGroup> actIdGroups) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ActIdGroup actIdGroup : actIdGroups) {
			EntityCacheUtil.removeResult(ActIdGroupModelImpl.ENTITY_CACHE_ENABLED,
				ActIdGroupImpl.class, actIdGroup.getPrimaryKey());
		}
	}

	/**
	 * Creates a new act ID group with the primary key. Does not add the act ID group to the database.
	 *
	 * @param id the primary key for the new act ID group
	 * @return the new act ID group
	 */
	@Override
	public ActIdGroup create(String id) {
		ActIdGroup actIdGroup = new ActIdGroupImpl();

		actIdGroup.setNew(true);
		actIdGroup.setPrimaryKey(id);

		return actIdGroup;
	}

	/**
	 * Removes the act ID group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the act ID group
	 * @return the act ID group that was removed
	 * @throws com.vnpt.portlet.user.NoSuchActIdGroupException if a act ID group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdGroup remove(String id)
		throws NoSuchActIdGroupException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the act ID group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the act ID group
	 * @return the act ID group that was removed
	 * @throws com.vnpt.portlet.user.NoSuchActIdGroupException if a act ID group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdGroup remove(Serializable primaryKey)
		throws NoSuchActIdGroupException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ActIdGroup actIdGroup = (ActIdGroup)session.get(ActIdGroupImpl.class,
					primaryKey);

			if (actIdGroup == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchActIdGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(actIdGroup);
		}
		catch (NoSuchActIdGroupException nsee) {
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
	protected ActIdGroup removeImpl(ActIdGroup actIdGroup)
		throws SystemException {
		actIdGroup = toUnwrappedModel(actIdGroup);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(actIdGroup)) {
				actIdGroup = (ActIdGroup)session.get(ActIdGroupImpl.class,
						actIdGroup.getPrimaryKeyObj());
			}

			if (actIdGroup != null) {
				session.delete(actIdGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (actIdGroup != null) {
			clearCache(actIdGroup);
		}

		return actIdGroup;
	}

	@Override
	public ActIdGroup updateImpl(
		com.vnpt.portlet.user.model.ActIdGroup actIdGroup)
		throws SystemException {
		actIdGroup = toUnwrappedModel(actIdGroup);

		boolean isNew = actIdGroup.isNew();

		Session session = null;

		try {
			session = openSession();

			if (actIdGroup.isNew()) {
				session.save(actIdGroup);

				actIdGroup.setNew(false);
			}
			else {
				session.merge(actIdGroup);
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

		EntityCacheUtil.putResult(ActIdGroupModelImpl.ENTITY_CACHE_ENABLED,
			ActIdGroupImpl.class, actIdGroup.getPrimaryKey(), actIdGroup);

		return actIdGroup;
	}

	protected ActIdGroup toUnwrappedModel(ActIdGroup actIdGroup) {
		if (actIdGroup instanceof ActIdGroupImpl) {
			return actIdGroup;
		}

		ActIdGroupImpl actIdGroupImpl = new ActIdGroupImpl();

		actIdGroupImpl.setNew(actIdGroup.isNew());
		actIdGroupImpl.setPrimaryKey(actIdGroup.getPrimaryKey());

		actIdGroupImpl.setId(actIdGroup.getId());
		actIdGroupImpl.setRev(actIdGroup.getRev());
		actIdGroupImpl.setName(actIdGroup.getName());
		actIdGroupImpl.setType(actIdGroup.getType());

		return actIdGroupImpl;
	}

	/**
	 * Returns the act ID group with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the act ID group
	 * @return the act ID group
	 * @throws com.vnpt.portlet.user.NoSuchActIdGroupException if a act ID group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdGroup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchActIdGroupException, SystemException {
		ActIdGroup actIdGroup = fetchByPrimaryKey(primaryKey);

		if (actIdGroup == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchActIdGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return actIdGroup;
	}

	/**
	 * Returns the act ID group with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchActIdGroupException} if it could not be found.
	 *
	 * @param id the primary key of the act ID group
	 * @return the act ID group
	 * @throws com.vnpt.portlet.user.NoSuchActIdGroupException if a act ID group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdGroup findByPrimaryKey(String id)
		throws NoSuchActIdGroupException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the act ID group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the act ID group
	 * @return the act ID group, or <code>null</code> if a act ID group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdGroup fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ActIdGroup actIdGroup = (ActIdGroup)EntityCacheUtil.getResult(ActIdGroupModelImpl.ENTITY_CACHE_ENABLED,
				ActIdGroupImpl.class, primaryKey);

		if (actIdGroup == _nullActIdGroup) {
			return null;
		}

		if (actIdGroup == null) {
			Session session = null;

			try {
				session = openSession();

				actIdGroup = (ActIdGroup)session.get(ActIdGroupImpl.class,
						primaryKey);

				if (actIdGroup != null) {
					cacheResult(actIdGroup);
				}
				else {
					EntityCacheUtil.putResult(ActIdGroupModelImpl.ENTITY_CACHE_ENABLED,
						ActIdGroupImpl.class, primaryKey, _nullActIdGroup);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ActIdGroupModelImpl.ENTITY_CACHE_ENABLED,
					ActIdGroupImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return actIdGroup;
	}

	/**
	 * Returns the act ID group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the act ID group
	 * @return the act ID group, or <code>null</code> if a act ID group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdGroup fetchByPrimaryKey(String id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the act ID groups.
	 *
	 * @return the act ID groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActIdGroup> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the act ID groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of act ID groups
	 * @param end the upper bound of the range of act ID groups (not inclusive)
	 * @return the range of act ID groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActIdGroup> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the act ID groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of act ID groups
	 * @param end the upper bound of the range of act ID groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of act ID groups
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActIdGroup> findAll(int start, int end,
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

		List<ActIdGroup> list = (List<ActIdGroup>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACTIDGROUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACTIDGROUP;

				if (pagination) {
					sql = sql.concat(ActIdGroupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ActIdGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActIdGroup>(list);
				}
				else {
					list = (List<ActIdGroup>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the act ID groups from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ActIdGroup actIdGroup : findAll()) {
			remove(actIdGroup);
		}
	}

	/**
	 * Returns the number of act ID groups.
	 *
	 * @return the number of act ID groups
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

				Query q = session.createQuery(_SQL_COUNT_ACTIDGROUP);

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
	 * Initializes the act ID group persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vnpt.portlet.user.model.ActIdGroup")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ActIdGroup>> listenersList = new ArrayList<ModelListener<ActIdGroup>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ActIdGroup>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ActIdGroupImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ACTIDGROUP = "SELECT actIdGroup FROM ActIdGroup actIdGroup";
	private static final String _SQL_COUNT_ACTIDGROUP = "SELECT COUNT(actIdGroup) FROM ActIdGroup actIdGroup";
	private static final String _ORDER_BY_ENTITY_ALIAS = "actIdGroup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ActIdGroup exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ActIdGroupPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "rev", "name", "type"
			});
	private static ActIdGroup _nullActIdGroup = new ActIdGroupImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ActIdGroup> toCacheModel() {
				return _nullActIdGroupCacheModel;
			}
		};

	private static CacheModel<ActIdGroup> _nullActIdGroupCacheModel = new CacheModel<ActIdGroup>() {
			@Override
			public ActIdGroup toEntityModel() {
				return _nullActIdGroup;
			}
		};
}
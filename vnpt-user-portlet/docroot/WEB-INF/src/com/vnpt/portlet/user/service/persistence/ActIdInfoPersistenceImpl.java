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

import com.vnpt.portlet.user.NoSuchActIdInfoException;
import com.vnpt.portlet.user.model.ActIdInfo;
import com.vnpt.portlet.user.model.impl.ActIdInfoImpl;
import com.vnpt.portlet.user.model.impl.ActIdInfoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the act ID info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see ActIdInfoPersistence
 * @see ActIdInfoUtil
 * @generated
 */
public class ActIdInfoPersistenceImpl extends BasePersistenceImpl<ActIdInfo>
	implements ActIdInfoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ActIdInfoUtil} to access the act ID info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ActIdInfoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ActIdInfoModelImpl.ENTITY_CACHE_ENABLED,
			ActIdInfoModelImpl.FINDER_CACHE_ENABLED, ActIdInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ActIdInfoModelImpl.ENTITY_CACHE_ENABLED,
			ActIdInfoModelImpl.FINDER_CACHE_ENABLED, ActIdInfoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ActIdInfoModelImpl.ENTITY_CACHE_ENABLED,
			ActIdInfoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ActIdInfoPersistenceImpl() {
		setModelClass(ActIdInfo.class);
	}

	/**
	 * Caches the act ID info in the entity cache if it is enabled.
	 *
	 * @param actIdInfo the act ID info
	 */
	@Override
	public void cacheResult(ActIdInfo actIdInfo) {
		EntityCacheUtil.putResult(ActIdInfoModelImpl.ENTITY_CACHE_ENABLED,
			ActIdInfoImpl.class, actIdInfo.getPrimaryKey(), actIdInfo);

		actIdInfo.resetOriginalValues();
	}

	/**
	 * Caches the act ID infos in the entity cache if it is enabled.
	 *
	 * @param actIdInfos the act ID infos
	 */
	@Override
	public void cacheResult(List<ActIdInfo> actIdInfos) {
		for (ActIdInfo actIdInfo : actIdInfos) {
			if (EntityCacheUtil.getResult(
						ActIdInfoModelImpl.ENTITY_CACHE_ENABLED,
						ActIdInfoImpl.class, actIdInfo.getPrimaryKey()) == null) {
				cacheResult(actIdInfo);
			}
			else {
				actIdInfo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all act ID infos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ActIdInfoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ActIdInfoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the act ID info.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ActIdInfo actIdInfo) {
		EntityCacheUtil.removeResult(ActIdInfoModelImpl.ENTITY_CACHE_ENABLED,
			ActIdInfoImpl.class, actIdInfo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ActIdInfo> actIdInfos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ActIdInfo actIdInfo : actIdInfos) {
			EntityCacheUtil.removeResult(ActIdInfoModelImpl.ENTITY_CACHE_ENABLED,
				ActIdInfoImpl.class, actIdInfo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new act ID info with the primary key. Does not add the act ID info to the database.
	 *
	 * @param id the primary key for the new act ID info
	 * @return the new act ID info
	 */
	@Override
	public ActIdInfo create(long id) {
		ActIdInfo actIdInfo = new ActIdInfoImpl();

		actIdInfo.setNew(true);
		actIdInfo.setPrimaryKey(id);

		return actIdInfo;
	}

	/**
	 * Removes the act ID info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the act ID info
	 * @return the act ID info that was removed
	 * @throws com.vnpt.portlet.user.NoSuchActIdInfoException if a act ID info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdInfo remove(long id)
		throws NoSuchActIdInfoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the act ID info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the act ID info
	 * @return the act ID info that was removed
	 * @throws com.vnpt.portlet.user.NoSuchActIdInfoException if a act ID info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdInfo remove(Serializable primaryKey)
		throws NoSuchActIdInfoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ActIdInfo actIdInfo = (ActIdInfo)session.get(ActIdInfoImpl.class,
					primaryKey);

			if (actIdInfo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchActIdInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(actIdInfo);
		}
		catch (NoSuchActIdInfoException nsee) {
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
	protected ActIdInfo removeImpl(ActIdInfo actIdInfo)
		throws SystemException {
		actIdInfo = toUnwrappedModel(actIdInfo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(actIdInfo)) {
				actIdInfo = (ActIdInfo)session.get(ActIdInfoImpl.class,
						actIdInfo.getPrimaryKeyObj());
			}

			if (actIdInfo != null) {
				session.delete(actIdInfo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (actIdInfo != null) {
			clearCache(actIdInfo);
		}

		return actIdInfo;
	}

	@Override
	public ActIdInfo updateImpl(com.vnpt.portlet.user.model.ActIdInfo actIdInfo)
		throws SystemException {
		actIdInfo = toUnwrappedModel(actIdInfo);

		boolean isNew = actIdInfo.isNew();

		Session session = null;

		try {
			session = openSession();

			if (actIdInfo.isNew()) {
				session.save(actIdInfo);

				actIdInfo.setNew(false);
			}
			else {
				session.merge(actIdInfo);
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

		EntityCacheUtil.putResult(ActIdInfoModelImpl.ENTITY_CACHE_ENABLED,
			ActIdInfoImpl.class, actIdInfo.getPrimaryKey(), actIdInfo);

		return actIdInfo;
	}

	protected ActIdInfo toUnwrappedModel(ActIdInfo actIdInfo) {
		if (actIdInfo instanceof ActIdInfoImpl) {
			return actIdInfo;
		}

		ActIdInfoImpl actIdInfoImpl = new ActIdInfoImpl();

		actIdInfoImpl.setNew(actIdInfo.isNew());
		actIdInfoImpl.setPrimaryKey(actIdInfo.getPrimaryKey());

		actIdInfoImpl.setId(actIdInfo.getId());
		actIdInfoImpl.setRev(actIdInfo.getRev());
		actIdInfoImpl.setUserId(actIdInfo.getUserId());
		actIdInfoImpl.setType(actIdInfo.getType());
		actIdInfoImpl.setKey(actIdInfo.getKey());
		actIdInfoImpl.setValue(actIdInfo.getValue());
		actIdInfoImpl.setPassword(actIdInfo.getPassword());
		actIdInfoImpl.setParent_id_(actIdInfo.getParent_id_());

		return actIdInfoImpl;
	}

	/**
	 * Returns the act ID info with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the act ID info
	 * @return the act ID info
	 * @throws com.vnpt.portlet.user.NoSuchActIdInfoException if a act ID info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchActIdInfoException, SystemException {
		ActIdInfo actIdInfo = fetchByPrimaryKey(primaryKey);

		if (actIdInfo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchActIdInfoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return actIdInfo;
	}

	/**
	 * Returns the act ID info with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchActIdInfoException} if it could not be found.
	 *
	 * @param id the primary key of the act ID info
	 * @return the act ID info
	 * @throws com.vnpt.portlet.user.NoSuchActIdInfoException if a act ID info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdInfo findByPrimaryKey(long id)
		throws NoSuchActIdInfoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the act ID info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the act ID info
	 * @return the act ID info, or <code>null</code> if a act ID info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdInfo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ActIdInfo actIdInfo = (ActIdInfo)EntityCacheUtil.getResult(ActIdInfoModelImpl.ENTITY_CACHE_ENABLED,
				ActIdInfoImpl.class, primaryKey);

		if (actIdInfo == _nullActIdInfo) {
			return null;
		}

		if (actIdInfo == null) {
			Session session = null;

			try {
				session = openSession();

				actIdInfo = (ActIdInfo)session.get(ActIdInfoImpl.class,
						primaryKey);

				if (actIdInfo != null) {
					cacheResult(actIdInfo);
				}
				else {
					EntityCacheUtil.putResult(ActIdInfoModelImpl.ENTITY_CACHE_ENABLED,
						ActIdInfoImpl.class, primaryKey, _nullActIdInfo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ActIdInfoModelImpl.ENTITY_CACHE_ENABLED,
					ActIdInfoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return actIdInfo;
	}

	/**
	 * Returns the act ID info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the act ID info
	 * @return the act ID info, or <code>null</code> if a act ID info with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActIdInfo fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the act ID infos.
	 *
	 * @return the act ID infos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActIdInfo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the act ID infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of act ID infos
	 * @param end the upper bound of the range of act ID infos (not inclusive)
	 * @return the range of act ID infos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActIdInfo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the act ID infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of act ID infos
	 * @param end the upper bound of the range of act ID infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of act ID infos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActIdInfo> findAll(int start, int end,
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

		List<ActIdInfo> list = (List<ActIdInfo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACTIDINFO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACTIDINFO;

				if (pagination) {
					sql = sql.concat(ActIdInfoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ActIdInfo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActIdInfo>(list);
				}
				else {
					list = (List<ActIdInfo>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the act ID infos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ActIdInfo actIdInfo : findAll()) {
			remove(actIdInfo);
		}
	}

	/**
	 * Returns the number of act ID infos.
	 *
	 * @return the number of act ID infos
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

				Query q = session.createQuery(_SQL_COUNT_ACTIDINFO);

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
	 * Initializes the act ID info persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vnpt.portlet.user.model.ActIdInfo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ActIdInfo>> listenersList = new ArrayList<ModelListener<ActIdInfo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ActIdInfo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ActIdInfoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ACTIDINFO = "SELECT actIdInfo FROM ActIdInfo actIdInfo";
	private static final String _SQL_COUNT_ACTIDINFO = "SELECT COUNT(actIdInfo) FROM ActIdInfo actIdInfo";
	private static final String _ORDER_BY_ENTITY_ALIAS = "actIdInfo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ActIdInfo exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ActIdInfoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "rev", "userId", "type", "key", "value", "password"
			});
	private static ActIdInfo _nullActIdInfo = new ActIdInfoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ActIdInfo> toCacheModel() {
				return _nullActIdInfoCacheModel;
			}
		};

	private static CacheModel<ActIdInfo> _nullActIdInfoCacheModel = new CacheModel<ActIdInfo>() {
			@Override
			public ActIdInfo toEntityModel() {
				return _nullActIdInfo;
			}
		};
}
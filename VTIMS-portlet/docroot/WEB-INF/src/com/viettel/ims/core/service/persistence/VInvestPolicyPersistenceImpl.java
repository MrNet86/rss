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

import com.viettel.ims.core.NoSuchVInvestPolicyException;
import com.viettel.ims.core.model.VInvestPolicy;
import com.viettel.ims.core.model.impl.VInvestPolicyImpl;
import com.viettel.ims.core.model.impl.VInvestPolicyModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the v invest policy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see VInvestPolicyPersistence
 * @see VInvestPolicyUtil
 * @generated
 */
public class VInvestPolicyPersistenceImpl extends BasePersistenceImpl<VInvestPolicy>
	implements VInvestPolicyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VInvestPolicyUtil} to access the v invest policy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VInvestPolicyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VInvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
			VInvestPolicyModelImpl.FINDER_CACHE_ENABLED,
			VInvestPolicyImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VInvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
			VInvestPolicyModelImpl.FINDER_CACHE_ENABLED,
			VInvestPolicyImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VInvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
			VInvestPolicyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public VInvestPolicyPersistenceImpl() {
		setModelClass(VInvestPolicy.class);
	}

	/**
	 * Caches the v invest policy in the entity cache if it is enabled.
	 *
	 * @param vInvestPolicy the v invest policy
	 */
	@Override
	public void cacheResult(VInvestPolicy vInvestPolicy) {
		EntityCacheUtil.putResult(VInvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
			VInvestPolicyImpl.class, vInvestPolicy.getPrimaryKey(),
			vInvestPolicy);

		vInvestPolicy.resetOriginalValues();
	}

	/**
	 * Caches the v invest policies in the entity cache if it is enabled.
	 *
	 * @param vInvestPolicies the v invest policies
	 */
	@Override
	public void cacheResult(List<VInvestPolicy> vInvestPolicies) {
		for (VInvestPolicy vInvestPolicy : vInvestPolicies) {
			if (EntityCacheUtil.getResult(
						VInvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
						VInvestPolicyImpl.class, vInvestPolicy.getPrimaryKey()) == null) {
				cacheResult(vInvestPolicy);
			}
			else {
				vInvestPolicy.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all v invest policies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VInvestPolicyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VInvestPolicyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the v invest policy.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VInvestPolicy vInvestPolicy) {
		EntityCacheUtil.removeResult(VInvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
			VInvestPolicyImpl.class, vInvestPolicy.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VInvestPolicy> vInvestPolicies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VInvestPolicy vInvestPolicy : vInvestPolicies) {
			EntityCacheUtil.removeResult(VInvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
				VInvestPolicyImpl.class, vInvestPolicy.getPrimaryKey());
		}
	}

	/**
	 * Creates a new v invest policy with the primary key. Does not add the v invest policy to the database.
	 *
	 * @param investPolicyId the primary key for the new v invest policy
	 * @return the new v invest policy
	 */
	@Override
	public VInvestPolicy create(long investPolicyId) {
		VInvestPolicy vInvestPolicy = new VInvestPolicyImpl();

		vInvestPolicy.setNew(true);
		vInvestPolicy.setPrimaryKey(investPolicyId);

		return vInvestPolicy;
	}

	/**
	 * Removes the v invest policy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param investPolicyId the primary key of the v invest policy
	 * @return the v invest policy that was removed
	 * @throws com.viettel.ims.core.NoSuchVInvestPolicyException if a v invest policy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VInvestPolicy remove(long investPolicyId)
		throws NoSuchVInvestPolicyException, SystemException {
		return remove((Serializable)investPolicyId);
	}

	/**
	 * Removes the v invest policy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v invest policy
	 * @return the v invest policy that was removed
	 * @throws com.viettel.ims.core.NoSuchVInvestPolicyException if a v invest policy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VInvestPolicy remove(Serializable primaryKey)
		throws NoSuchVInvestPolicyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VInvestPolicy vInvestPolicy = (VInvestPolicy)session.get(VInvestPolicyImpl.class,
					primaryKey);

			if (vInvestPolicy == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVInvestPolicyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vInvestPolicy);
		}
		catch (NoSuchVInvestPolicyException nsee) {
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
	protected VInvestPolicy removeImpl(VInvestPolicy vInvestPolicy)
		throws SystemException {
		vInvestPolicy = toUnwrappedModel(vInvestPolicy);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vInvestPolicy)) {
				vInvestPolicy = (VInvestPolicy)session.get(VInvestPolicyImpl.class,
						vInvestPolicy.getPrimaryKeyObj());
			}

			if (vInvestPolicy != null) {
				session.delete(vInvestPolicy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vInvestPolicy != null) {
			clearCache(vInvestPolicy);
		}

		return vInvestPolicy;
	}

	@Override
	public VInvestPolicy updateImpl(
		com.viettel.ims.core.model.VInvestPolicy vInvestPolicy)
		throws SystemException {
		vInvestPolicy = toUnwrappedModel(vInvestPolicy);

		boolean isNew = vInvestPolicy.isNew();

		Session session = null;

		try {
			session = openSession();

			if (vInvestPolicy.isNew()) {
				session.save(vInvestPolicy);

				vInvestPolicy.setNew(false);
			}
			else {
				session.merge(vInvestPolicy);
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

		EntityCacheUtil.putResult(VInvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
			VInvestPolicyImpl.class, vInvestPolicy.getPrimaryKey(),
			vInvestPolicy);

		return vInvestPolicy;
	}

	protected VInvestPolicy toUnwrappedModel(VInvestPolicy vInvestPolicy) {
		if (vInvestPolicy instanceof VInvestPolicyImpl) {
			return vInvestPolicy;
		}

		VInvestPolicyImpl vInvestPolicyImpl = new VInvestPolicyImpl();

		vInvestPolicyImpl.setNew(vInvestPolicy.isNew());
		vInvestPolicyImpl.setPrimaryKey(vInvestPolicy.getPrimaryKey());

		vInvestPolicyImpl.setInvestPolicyId(vInvestPolicy.getInvestPolicyId());
		vInvestPolicyImpl.setInfoPolicyTypeName(vInvestPolicy.getInfoPolicyTypeName());
		vInvestPolicyImpl.setInfoPolicyName(vInvestPolicy.getInfoPolicyName());
		vInvestPolicyImpl.setInfoProposeGroupName(vInvestPolicy.getInfoProposeGroupName());
		vInvestPolicyImpl.setInfoVerifyGroupName(vInvestPolicy.getInfoVerifyGroupName());
		vInvestPolicyImpl.setInfoPolicyDate(vInvestPolicy.getInfoPolicyDate());
		vInvestPolicyImpl.setInfoPolicyDeployDate(vInvestPolicy.getInfoPolicyDeployDate());

		return vInvestPolicyImpl;
	}

	/**
	 * Returns the v invest policy with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v invest policy
	 * @return the v invest policy
	 * @throws com.viettel.ims.core.NoSuchVInvestPolicyException if a v invest policy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VInvestPolicy findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVInvestPolicyException, SystemException {
		VInvestPolicy vInvestPolicy = fetchByPrimaryKey(primaryKey);

		if (vInvestPolicy == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVInvestPolicyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vInvestPolicy;
	}

	/**
	 * Returns the v invest policy with the primary key or throws a {@link com.viettel.ims.core.NoSuchVInvestPolicyException} if it could not be found.
	 *
	 * @param investPolicyId the primary key of the v invest policy
	 * @return the v invest policy
	 * @throws com.viettel.ims.core.NoSuchVInvestPolicyException if a v invest policy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VInvestPolicy findByPrimaryKey(long investPolicyId)
		throws NoSuchVInvestPolicyException, SystemException {
		return findByPrimaryKey((Serializable)investPolicyId);
	}

	/**
	 * Returns the v invest policy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v invest policy
	 * @return the v invest policy, or <code>null</code> if a v invest policy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VInvestPolicy fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		VInvestPolicy vInvestPolicy = (VInvestPolicy)EntityCacheUtil.getResult(VInvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
				VInvestPolicyImpl.class, primaryKey);

		if (vInvestPolicy == _nullVInvestPolicy) {
			return null;
		}

		if (vInvestPolicy == null) {
			Session session = null;

			try {
				session = openSession();

				vInvestPolicy = (VInvestPolicy)session.get(VInvestPolicyImpl.class,
						primaryKey);

				if (vInvestPolicy != null) {
					cacheResult(vInvestPolicy);
				}
				else {
					EntityCacheUtil.putResult(VInvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
						VInvestPolicyImpl.class, primaryKey, _nullVInvestPolicy);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VInvestPolicyModelImpl.ENTITY_CACHE_ENABLED,
					VInvestPolicyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vInvestPolicy;
	}

	/**
	 * Returns the v invest policy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param investPolicyId the primary key of the v invest policy
	 * @return the v invest policy, or <code>null</code> if a v invest policy with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public VInvestPolicy fetchByPrimaryKey(long investPolicyId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)investPolicyId);
	}

	/**
	 * Returns all the v invest policies.
	 *
	 * @return the v invest policies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VInvestPolicy> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the v invest policies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.VInvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v invest policies
	 * @param end the upper bound of the range of v invest policies (not inclusive)
	 * @return the range of v invest policies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VInvestPolicy> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the v invest policies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.VInvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v invest policies
	 * @param end the upper bound of the range of v invest policies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of v invest policies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<VInvestPolicy> findAll(int start, int end,
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

		List<VInvestPolicy> list = (List<VInvestPolicy>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VINVESTPOLICY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VINVESTPOLICY;

				if (pagination) {
					sql = sql.concat(VInvestPolicyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VInvestPolicy>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<VInvestPolicy>(list);
				}
				else {
					list = (List<VInvestPolicy>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v invest policies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (VInvestPolicy vInvestPolicy : findAll()) {
			remove(vInvestPolicy);
		}
	}

	/**
	 * Returns the number of v invest policies.
	 *
	 * @return the number of v invest policies
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

				Query q = session.createQuery(_SQL_COUNT_VINVESTPOLICY);

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
	 * Initializes the v invest policy persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.viettel.ims.core.model.VInvestPolicy")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VInvestPolicy>> listenersList = new ArrayList<ModelListener<VInvestPolicy>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VInvestPolicy>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VInvestPolicyImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VINVESTPOLICY = "SELECT vInvestPolicy FROM VInvestPolicy vInvestPolicy";
	private static final String _SQL_COUNT_VINVESTPOLICY = "SELECT COUNT(vInvestPolicy) FROM VInvestPolicy vInvestPolicy";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vInvestPolicy.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VInvestPolicy exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VInvestPolicyPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"investPolicyId"
			});
	private static VInvestPolicy _nullVInvestPolicy = new VInvestPolicyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<VInvestPolicy> toCacheModel() {
				return _nullVInvestPolicyCacheModel;
			}
		};

	private static CacheModel<VInvestPolicy> _nullVInvestPolicyCacheModel = new CacheModel<VInvestPolicy>() {
			@Override
			public VInvestPolicy toEntityModel() {
				return _nullVInvestPolicy;
			}
		};
}
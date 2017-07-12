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

package com.vnpt.portal.rss.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.vnpt.portal.rss.model.RssConfig;

import java.util.List;

/**
 * The persistence utility for the rss config service. This utility wraps {@link RssConfigPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see RssConfigPersistence
 * @see RssConfigPersistenceImpl
 * @generated
 */
public class RssConfigUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(RssConfig rssConfig) {
		getPersistence().clearCache(rssConfig);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RssConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RssConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RssConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static RssConfig update(RssConfig rssConfig)
		throws SystemException {
		return getPersistence().update(rssConfig);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static RssConfig update(RssConfig rssConfig,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(rssConfig, serviceContext);
	}

	/**
	* Caches the rss config in the entity cache if it is enabled.
	*
	* @param rssConfig the rss config
	*/
	public static void cacheResult(
		com.vnpt.portal.rss.model.RssConfig rssConfig) {
		getPersistence().cacheResult(rssConfig);
	}

	/**
	* Caches the rss configs in the entity cache if it is enabled.
	*
	* @param rssConfigs the rss configs
	*/
	public static void cacheResult(
		java.util.List<com.vnpt.portal.rss.model.RssConfig> rssConfigs) {
		getPersistence().cacheResult(rssConfigs);
	}

	/**
	* Creates a new rss config with the primary key. Does not add the rss config to the database.
	*
	* @param rssConfigId the primary key for the new rss config
	* @return the new rss config
	*/
	public static com.vnpt.portal.rss.model.RssConfig create(long rssConfigId) {
		return getPersistence().create(rssConfigId);
	}

	/**
	* Removes the rss config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rssConfigId the primary key of the rss config
	* @return the rss config that was removed
	* @throws com.vnpt.portal.rss.NoSuchRssConfigException if a rss config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssConfig remove(long rssConfigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssConfigException {
		return getPersistence().remove(rssConfigId);
	}

	public static com.vnpt.portal.rss.model.RssConfig updateImpl(
		com.vnpt.portal.rss.model.RssConfig rssConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(rssConfig);
	}

	/**
	* Returns the rss config with the primary key or throws a {@link com.vnpt.portal.rss.NoSuchRssConfigException} if it could not be found.
	*
	* @param rssConfigId the primary key of the rss config
	* @return the rss config
	* @throws com.vnpt.portal.rss.NoSuchRssConfigException if a rss config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssConfig findByPrimaryKey(
		long rssConfigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssConfigException {
		return getPersistence().findByPrimaryKey(rssConfigId);
	}

	/**
	* Returns the rss config with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param rssConfigId the primary key of the rss config
	* @return the rss config, or <code>null</code> if a rss config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssConfig fetchByPrimaryKey(
		long rssConfigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(rssConfigId);
	}

	/**
	* Returns all the rss configs.
	*
	* @return the rss configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssConfig> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the rss configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rss configs
	* @param end the upper bound of the range of rss configs (not inclusive)
	* @return the range of rss configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssConfig> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the rss configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rss configs
	* @param end the upper bound of the range of rss configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of rss configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssConfig> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the rss configs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of rss configs.
	*
	* @return the number of rss configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RssConfigPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RssConfigPersistence)PortletBeanLocatorUtil.locate(com.vnpt.portal.rss.service.ClpSerializer.getServletContextName(),
					RssConfigPersistence.class.getName());

			ReferenceRegistry.registerReference(RssConfigUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(RssConfigPersistence persistence) {
	}

	private static RssConfigPersistence _persistence;
}
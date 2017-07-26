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

package com.vnpt.portal.rss.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.vnpt.portal.rss.model.RssFeeds;
import com.vnpt.portal.rss.service.RssFeedsLocalService;
import com.vnpt.portal.rss.service.persistence.RssCategoryPersistence;
import com.vnpt.portal.rss.service.persistence.RssConfigPersistence;
import com.vnpt.portal.rss.service.persistence.RssFeedsPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the rss feeds local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.vnpt.portal.rss.service.impl.RssFeedsLocalServiceImpl}.
 * </p>
 *
 * @author MrNet
 * @see com.vnpt.portal.rss.service.impl.RssFeedsLocalServiceImpl
 * @see com.vnpt.portal.rss.service.RssFeedsLocalServiceUtil
 * @generated
 */
public abstract class RssFeedsLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements RssFeedsLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.vnpt.portal.rss.service.RssFeedsLocalServiceUtil} to access the rss feeds local service.
	 */

	/**
	 * Adds the rss feeds to the database. Also notifies the appropriate model listeners.
	 *
	 * @param rssFeeds the rss feeds
	 * @return the rss feeds that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public RssFeeds addRssFeeds(RssFeeds rssFeeds) throws SystemException {
		rssFeeds.setNew(true);

		return rssFeedsPersistence.update(rssFeeds);
	}

	/**
	 * Creates a new rss feeds with the primary key. Does not add the rss feeds to the database.
	 *
	 * @param rssFeedsId the primary key for the new rss feeds
	 * @return the new rss feeds
	 */
	@Override
	public RssFeeds createRssFeeds(long rssFeedsId) {
		return rssFeedsPersistence.create(rssFeedsId);
	}

	/**
	 * Deletes the rss feeds with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param rssFeedsId the primary key of the rss feeds
	 * @return the rss feeds that was removed
	 * @throws PortalException if a rss feeds with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public RssFeeds deleteRssFeeds(long rssFeedsId)
		throws PortalException, SystemException {
		return rssFeedsPersistence.remove(rssFeedsId);
	}

	/**
	 * Deletes the rss feeds from the database. Also notifies the appropriate model listeners.
	 *
	 * @param rssFeeds the rss feeds
	 * @return the rss feeds that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public RssFeeds deleteRssFeeds(RssFeeds rssFeeds) throws SystemException {
		return rssFeedsPersistence.remove(rssFeeds);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(RssFeeds.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return rssFeedsPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return rssFeedsPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return rssFeedsPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return rssFeedsPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return rssFeedsPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public RssFeeds fetchRssFeeds(long rssFeedsId) throws SystemException {
		return rssFeedsPersistence.fetchByPrimaryKey(rssFeedsId);
	}

	/**
	 * Returns the rss feeds with the primary key.
	 *
	 * @param rssFeedsId the primary key of the rss feeds
	 * @return the rss feeds
	 * @throws PortalException if a rss feeds with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RssFeeds getRssFeeds(long rssFeedsId)
		throws PortalException, SystemException {
		return rssFeedsPersistence.findByPrimaryKey(rssFeedsId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return rssFeedsPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the rss feedses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rss feedses
	 * @param end the upper bound of the range of rss feedses (not inclusive)
	 * @return the range of rss feedses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RssFeeds> getRssFeedses(int start, int end)
		throws SystemException {
		return rssFeedsPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of rss feedses.
	 *
	 * @return the number of rss feedses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getRssFeedsesCount() throws SystemException {
		return rssFeedsPersistence.countAll();
	}

	/**
	 * Updates the rss feeds in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param rssFeeds the rss feeds
	 * @return the rss feeds that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public RssFeeds updateRssFeeds(RssFeeds rssFeeds) throws SystemException {
		return rssFeedsPersistence.update(rssFeeds);
	}

	/**
	 * Returns the rss category local service.
	 *
	 * @return the rss category local service
	 */
	public com.vnpt.portal.rss.service.RssCategoryLocalService getRssCategoryLocalService() {
		return rssCategoryLocalService;
	}

	/**
	 * Sets the rss category local service.
	 *
	 * @param rssCategoryLocalService the rss category local service
	 */
	public void setRssCategoryLocalService(
		com.vnpt.portal.rss.service.RssCategoryLocalService rssCategoryLocalService) {
		this.rssCategoryLocalService = rssCategoryLocalService;
	}

	/**
	 * Returns the rss category persistence.
	 *
	 * @return the rss category persistence
	 */
	public RssCategoryPersistence getRssCategoryPersistence() {
		return rssCategoryPersistence;
	}

	/**
	 * Sets the rss category persistence.
	 *
	 * @param rssCategoryPersistence the rss category persistence
	 */
	public void setRssCategoryPersistence(
		RssCategoryPersistence rssCategoryPersistence) {
		this.rssCategoryPersistence = rssCategoryPersistence;
	}

	/**
	 * Returns the rss config local service.
	 *
	 * @return the rss config local service
	 */
	public com.vnpt.portal.rss.service.RssConfigLocalService getRssConfigLocalService() {
		return rssConfigLocalService;
	}

	/**
	 * Sets the rss config local service.
	 *
	 * @param rssConfigLocalService the rss config local service
	 */
	public void setRssConfigLocalService(
		com.vnpt.portal.rss.service.RssConfigLocalService rssConfigLocalService) {
		this.rssConfigLocalService = rssConfigLocalService;
	}

	/**
	 * Returns the rss config persistence.
	 *
	 * @return the rss config persistence
	 */
	public RssConfigPersistence getRssConfigPersistence() {
		return rssConfigPersistence;
	}

	/**
	 * Sets the rss config persistence.
	 *
	 * @param rssConfigPersistence the rss config persistence
	 */
	public void setRssConfigPersistence(
		RssConfigPersistence rssConfigPersistence) {
		this.rssConfigPersistence = rssConfigPersistence;
	}

	/**
	 * Returns the rss feeds local service.
	 *
	 * @return the rss feeds local service
	 */
	public com.vnpt.portal.rss.service.RssFeedsLocalService getRssFeedsLocalService() {
		return rssFeedsLocalService;
	}

	/**
	 * Sets the rss feeds local service.
	 *
	 * @param rssFeedsLocalService the rss feeds local service
	 */
	public void setRssFeedsLocalService(
		com.vnpt.portal.rss.service.RssFeedsLocalService rssFeedsLocalService) {
		this.rssFeedsLocalService = rssFeedsLocalService;
	}

	/**
	 * Returns the rss feeds persistence.
	 *
	 * @return the rss feeds persistence
	 */
	public RssFeedsPersistence getRssFeedsPersistence() {
		return rssFeedsPersistence;
	}

	/**
	 * Sets the rss feeds persistence.
	 *
	 * @param rssFeedsPersistence the rss feeds persistence
	 */
	public void setRssFeedsPersistence(RssFeedsPersistence rssFeedsPersistence) {
		this.rssFeedsPersistence = rssFeedsPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.vnpt.portal.rss.model.RssFeeds",
			rssFeedsLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.vnpt.portal.rss.model.RssFeeds");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return RssFeeds.class;
	}

	protected String getModelClassName() {
		return RssFeeds.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = rssFeedsPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.vnpt.portal.rss.service.RssCategoryLocalService.class)
	protected com.vnpt.portal.rss.service.RssCategoryLocalService rssCategoryLocalService;
	@BeanReference(type = RssCategoryPersistence.class)
	protected RssCategoryPersistence rssCategoryPersistence;
	@BeanReference(type = com.vnpt.portal.rss.service.RssConfigLocalService.class)
	protected com.vnpt.portal.rss.service.RssConfigLocalService rssConfigLocalService;
	@BeanReference(type = RssConfigPersistence.class)
	protected RssConfigPersistence rssConfigPersistence;
	@BeanReference(type = com.vnpt.portal.rss.service.RssFeedsLocalService.class)
	protected com.vnpt.portal.rss.service.RssFeedsLocalService rssFeedsLocalService;
	@BeanReference(type = RssFeedsPersistence.class)
	protected RssFeedsPersistence rssFeedsPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private RssFeedsLocalServiceClpInvoker _clpInvoker = new RssFeedsLocalServiceClpInvoker();
}
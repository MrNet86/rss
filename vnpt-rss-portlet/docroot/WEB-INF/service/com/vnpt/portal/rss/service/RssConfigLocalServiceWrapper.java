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

package com.vnpt.portal.rss.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RssConfigLocalService}.
 *
 * @author MrNet
 * @see RssConfigLocalService
 * @generated
 */
public class RssConfigLocalServiceWrapper implements RssConfigLocalService,
	ServiceWrapper<RssConfigLocalService> {
	public RssConfigLocalServiceWrapper(
		RssConfigLocalService rssConfigLocalService) {
		_rssConfigLocalService = rssConfigLocalService;
	}

	/**
	* Adds the rss config to the database. Also notifies the appropriate model listeners.
	*
	* @param rssConfig the rss config
	* @return the rss config that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portal.rss.model.RssConfig addRssConfig(
		com.vnpt.portal.rss.model.RssConfig rssConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssConfigLocalService.addRssConfig(rssConfig);
	}

	/**
	* Creates a new rss config with the primary key. Does not add the rss config to the database.
	*
	* @param rssConfigId the primary key for the new rss config
	* @return the new rss config
	*/
	@Override
	public com.vnpt.portal.rss.model.RssConfig createRssConfig(long rssConfigId) {
		return _rssConfigLocalService.createRssConfig(rssConfigId);
	}

	/**
	* Deletes the rss config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rssConfigId the primary key of the rss config
	* @return the rss config that was removed
	* @throws PortalException if a rss config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portal.rss.model.RssConfig deleteRssConfig(long rssConfigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rssConfigLocalService.deleteRssConfig(rssConfigId);
	}

	/**
	* Deletes the rss config from the database. Also notifies the appropriate model listeners.
	*
	* @param rssConfig the rss config
	* @return the rss config that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portal.rss.model.RssConfig deleteRssConfig(
		com.vnpt.portal.rss.model.RssConfig rssConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssConfigLocalService.deleteRssConfig(rssConfig);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rssConfigLocalService.dynamicQuery();
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssConfigLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _rssConfigLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssConfigLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssConfigLocalService.dynamicQueryCount(dynamicQuery);
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
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssConfigLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.vnpt.portal.rss.model.RssConfig fetchRssConfig(long rssConfigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssConfigLocalService.fetchRssConfig(rssConfigId);
	}

	/**
	* Returns the rss config with the primary key.
	*
	* @param rssConfigId the primary key of the rss config
	* @return the rss config
	* @throws PortalException if a rss config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portal.rss.model.RssConfig getRssConfig(long rssConfigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rssConfigLocalService.getRssConfig(rssConfigId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rssConfigLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.vnpt.portal.rss.model.RssConfig> getRssConfigs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssConfigLocalService.getRssConfigs(start, end);
	}

	/**
	* Returns the number of rss configs.
	*
	* @return the number of rss configs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getRssConfigsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssConfigLocalService.getRssConfigsCount();
	}

	/**
	* Updates the rss config in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rssConfig the rss config
	* @return the rss config that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portal.rss.model.RssConfig updateRssConfig(
		com.vnpt.portal.rss.model.RssConfig rssConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssConfigLocalService.updateRssConfig(rssConfig);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _rssConfigLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_rssConfigLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _rssConfigLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public RssConfigLocalService getWrappedRssConfigLocalService() {
		return _rssConfigLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRssConfigLocalService(
		RssConfigLocalService rssConfigLocalService) {
		_rssConfigLocalService = rssConfigLocalService;
	}

	@Override
	public RssConfigLocalService getWrappedService() {
		return _rssConfigLocalService;
	}

	@Override
	public void setWrappedService(RssConfigLocalService rssConfigLocalService) {
		_rssConfigLocalService = rssConfigLocalService;
	}

	private RssConfigLocalService _rssConfigLocalService;
}
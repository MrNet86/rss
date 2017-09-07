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
 * Provides a wrapper for {@link RssFeedsLocalService}.
 *
 * @author MrNet
 * @see RssFeedsLocalService
 * @generated
 */
public class RssFeedsLocalServiceWrapper implements RssFeedsLocalService,
	ServiceWrapper<RssFeedsLocalService> {
	public RssFeedsLocalServiceWrapper(
		RssFeedsLocalService rssFeedsLocalService) {
		_rssFeedsLocalService = rssFeedsLocalService;
	}

	/**
	* Adds the rss feeds to the database. Also notifies the appropriate model listeners.
	*
	* @param rssFeeds the rss feeds
	* @return the rss feeds that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portal.rss.model.RssFeeds addRssFeeds(
		com.vnpt.portal.rss.model.RssFeeds rssFeeds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssFeedsLocalService.addRssFeeds(rssFeeds);
	}

	/**
	* Creates a new rss feeds with the primary key. Does not add the rss feeds to the database.
	*
	* @param rssFeedsId the primary key for the new rss feeds
	* @return the new rss feeds
	*/
	@Override
	public com.vnpt.portal.rss.model.RssFeeds createRssFeeds(long rssFeedsId) {
		return _rssFeedsLocalService.createRssFeeds(rssFeedsId);
	}

	/**
	* Deletes the rss feeds with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rssFeedsId the primary key of the rss feeds
	* @return the rss feeds that was removed
	* @throws PortalException if a rss feeds with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portal.rss.model.RssFeeds deleteRssFeeds(long rssFeedsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rssFeedsLocalService.deleteRssFeeds(rssFeedsId);
	}

	/**
	* Deletes the rss feeds from the database. Also notifies the appropriate model listeners.
	*
	* @param rssFeeds the rss feeds
	* @return the rss feeds that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portal.rss.model.RssFeeds deleteRssFeeds(
		com.vnpt.portal.rss.model.RssFeeds rssFeeds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssFeedsLocalService.deleteRssFeeds(rssFeeds);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rssFeedsLocalService.dynamicQuery();
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
		return _rssFeedsLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _rssFeedsLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssFeedsLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _rssFeedsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _rssFeedsLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.vnpt.portal.rss.model.RssFeeds fetchRssFeeds(long rssFeedsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssFeedsLocalService.fetchRssFeeds(rssFeedsId);
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
	public com.vnpt.portal.rss.model.RssFeeds getRssFeeds(long rssFeedsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rssFeedsLocalService.getRssFeeds(rssFeedsId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rssFeedsLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.vnpt.portal.rss.model.RssFeeds> getRssFeedses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssFeedsLocalService.getRssFeedses(start, end);
	}

	/**
	* Returns the number of rss feedses.
	*
	* @return the number of rss feedses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getRssFeedsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssFeedsLocalService.getRssFeedsesCount();
	}

	/**
	* Updates the rss feeds in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rssFeeds the rss feeds
	* @return the rss feeds that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portal.rss.model.RssFeeds updateRssFeeds(
		com.vnpt.portal.rss.model.RssFeeds rssFeeds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssFeedsLocalService.updateRssFeeds(rssFeeds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _rssFeedsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_rssFeedsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _rssFeedsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.vnpt.portal.rss.model.RssFeeds> searchRssFeeds(
		com.liferay.portal.kernel.dao.search.SearchContainer searchContainer,
		int start, int end, int status, long scopeGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssFeedsLocalService.searchRssFeeds(searchContainer, start,
			end, status, scopeGroupId);
	}

	@Override
	public int countRssFeeds(
		com.liferay.portal.kernel.dao.search.SearchContainer searchContainer,
		int status, long scopeGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssFeedsLocalService.countRssFeeds(searchContainer, status,
			scopeGroupId);
	}

	@Override
	public boolean checkIsExistsUrl(java.lang.Long groupId, java.lang.String url)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssFeedsLocalService.checkIsExistsUrl(groupId, url);
	}

	@Override
	public java.util.List<com.vnpt.portal.rss.model.RssFeeds> searchRssFeedsByCategory(
		int start, int end, int status, long scopeGroupId, long rssCategoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rssFeedsLocalService.searchRssFeedsByCategory(start, end,
			status, scopeGroupId, rssCategoryId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public RssFeedsLocalService getWrappedRssFeedsLocalService() {
		return _rssFeedsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRssFeedsLocalService(
		RssFeedsLocalService rssFeedsLocalService) {
		_rssFeedsLocalService = rssFeedsLocalService;
	}

	@Override
	public RssFeedsLocalService getWrappedService() {
		return _rssFeedsLocalService;
	}

	@Override
	public void setWrappedService(RssFeedsLocalService rssFeedsLocalService) {
		_rssFeedsLocalService = rssFeedsLocalService;
	}

	private RssFeedsLocalService _rssFeedsLocalService;
}
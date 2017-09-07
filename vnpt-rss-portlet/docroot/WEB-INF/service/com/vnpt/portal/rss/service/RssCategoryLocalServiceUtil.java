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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for RssCategory. This utility wraps
 * {@link com.vnpt.portal.rss.service.impl.RssCategoryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author MrNet
 * @see RssCategoryLocalService
 * @see com.vnpt.portal.rss.service.base.RssCategoryLocalServiceBaseImpl
 * @see com.vnpt.portal.rss.service.impl.RssCategoryLocalServiceImpl
 * @generated
 */
public class RssCategoryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.vnpt.portal.rss.service.impl.RssCategoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the rss category to the database. Also notifies the appropriate model listeners.
	*
	* @param rssCategory the rss category
	* @return the rss category that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory addRssCategory(
		com.vnpt.portal.rss.model.RssCategory rssCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addRssCategory(rssCategory);
	}

	/**
	* Creates a new rss category with the primary key. Does not add the rss category to the database.
	*
	* @param rssCategoryId the primary key for the new rss category
	* @return the new rss category
	*/
	public static com.vnpt.portal.rss.model.RssCategory createRssCategory(
		long rssCategoryId) {
		return getService().createRssCategory(rssCategoryId);
	}

	/**
	* Deletes the rss category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rssCategoryId the primary key of the rss category
	* @return the rss category that was removed
	* @throws PortalException if a rss category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory deleteRssCategory(
		long rssCategoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteRssCategory(rssCategoryId);
	}

	/**
	* Deletes the rss category from the database. Also notifies the appropriate model listeners.
	*
	* @param rssCategory the rss category
	* @return the rss category that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory deleteRssCategory(
		com.vnpt.portal.rss.model.RssCategory rssCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteRssCategory(rssCategory);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.vnpt.portal.rss.model.RssCategory fetchRssCategory(
		long rssCategoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchRssCategory(rssCategoryId);
	}

	/**
	* Returns the rss category with the primary key.
	*
	* @param rssCategoryId the primary key of the rss category
	* @return the rss category
	* @throws PortalException if a rss category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory getRssCategory(
		long rssCategoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getRssCategory(rssCategoryId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the rss categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rss categories
	* @param end the upper bound of the range of rss categories (not inclusive)
	* @return the range of rss categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssCategory> getRssCategories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRssCategories(start, end);
	}

	/**
	* Returns the number of rss categories.
	*
	* @return the number of rss categories
	* @throws SystemException if a system exception occurred
	*/
	public static int getRssCategoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRssCategoriesCount();
	}

	/**
	* Updates the rss category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rssCategory the rss category
	* @return the rss category that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory updateRssCategory(
		com.vnpt.portal.rss.model.RssCategory rssCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateRssCategory(rssCategory);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Search rssCategory by scopeGroupId
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssCategory> searchRssCategory(
		int start, int end, long scopeGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().searchRssCategory(start, end, scopeGroupId);
	}

	/**
	* Count rssCategory by scopeGroupId
	*/
	public static int countRssCategory(long scopeGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countRssCategory(scopeGroupId);
	}

	/**
	* get rssCategoryName by Id
	*/
	public static java.lang.String getRssCategoryNameById(
		java.util.List<com.vnpt.portal.rss.model.RssCategory> rssCategories,
		long rssCategoryId) {
		return getService().getRssCategoryNameById(rssCategories, rssCategoryId);
	}

	/**
	* Check if rssCategory is used in rssConfig
	*
	* @param rssCategoryId
	* @param scopeGroupId
	* @return
	* @throws SystemException
	*/
	public static boolean isExistsInConfig(long rssCategoryId, long scopeGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().isExistsInConfig(rssCategoryId, scopeGroupId);
	}

	/**
	* Check if rssCategory is used in rssFeeds
	*
	* @param rssCategoryId
	* @param scopeGroupId
	* @return
	* @throws SystemException
	*/
	public static boolean isExistsInFeeds(long rssCategoryId, long scopeGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().isExistsInFeeds(rssCategoryId, scopeGroupId);
	}

	public static void clearService() {
		_service = null;
	}

	public static RssCategoryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					RssCategoryLocalService.class.getName());

			if (invokableLocalService instanceof RssCategoryLocalService) {
				_service = (RssCategoryLocalService)invokableLocalService;
			}
			else {
				_service = new RssCategoryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(RssCategoryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(RssCategoryLocalService service) {
	}

	private static RssCategoryLocalService _service;
}
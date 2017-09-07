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

import com.vnpt.portal.rss.model.RssFeeds;

import java.util.List;

/**
 * The persistence utility for the rss feeds service. This utility wraps {@link RssFeedsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see RssFeedsPersistence
 * @see RssFeedsPersistenceImpl
 * @generated
 */
public class RssFeedsUtil {
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
	public static void clearCache(RssFeeds rssFeeds) {
		getPersistence().clearCache(rssFeeds);
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
	public static List<RssFeeds> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RssFeeds> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RssFeeds> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static RssFeeds update(RssFeeds rssFeeds) throws SystemException {
		return getPersistence().update(rssFeeds);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static RssFeeds update(RssFeeds rssFeeds,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(rssFeeds, serviceContext);
	}

	/**
	* Returns all the rss feedses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the rss feedses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of rss feedses
	* @param end the upper bound of the range of rss feedses (not inclusive)
	* @return the range of matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the rss feedses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of rss feedses
	* @param end the upper bound of the range of rss feedses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first rss feeds in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rss feeds
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first rss feeds in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last rss feeds in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rss feeds
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last rss feeds in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the rss feedses before and after the current rss feeds in the ordered set where groupId = &#63;.
	*
	* @param rssFeedsId the primary key of the current rss feeds
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rss feeds
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a rss feeds with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds[] findByGroupId_PrevAndNext(
		long rssFeedsId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(rssFeedsId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the rss feedses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of rss feedses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the rss feedses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the rss feedses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of rss feedses
	* @param end the upper bound of the range of rss feedses (not inclusive)
	* @return the range of matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the rss feedses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of rss feedses
	* @param end the upper bound of the range of rss feedses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first rss feeds in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rss feeds
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first rss feeds in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last rss feeds in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rss feeds
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last rss feeds in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the rss feedses before and after the current rss feeds in the ordered set where companyId = &#63;.
	*
	* @param rssFeedsId the primary key of the current rss feeds
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rss feeds
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a rss feeds with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds[] findByCompanyId_PrevAndNext(
		long rssFeedsId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(rssFeedsId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the rss feedses where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of rss feedses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns all the rss feedses where groupId = &#63; and url = &#63;.
	*
	* @param groupId the group ID
	* @param url the url
	* @return the matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByUrl(
		long groupId, java.lang.String url)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUrl(groupId, url);
	}

	/**
	* Returns a range of all the rss feedses where groupId = &#63; and url = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param url the url
	* @param start the lower bound of the range of rss feedses
	* @param end the upper bound of the range of rss feedses (not inclusive)
	* @return the range of matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByUrl(
		long groupId, java.lang.String url, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUrl(groupId, url, start, end);
	}

	/**
	* Returns an ordered range of all the rss feedses where groupId = &#63; and url = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param url the url
	* @param start the lower bound of the range of rss feedses
	* @param end the upper bound of the range of rss feedses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByUrl(
		long groupId, java.lang.String url, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUrl(groupId, url, start, end, orderByComparator);
	}

	/**
	* Returns the first rss feeds in the ordered set where groupId = &#63; and url = &#63;.
	*
	* @param groupId the group ID
	* @param url the url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rss feeds
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds findByUrl_First(
		long groupId, java.lang.String url,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException {
		return getPersistence().findByUrl_First(groupId, url, orderByComparator);
	}

	/**
	* Returns the first rss feeds in the ordered set where groupId = &#63; and url = &#63;.
	*
	* @param groupId the group ID
	* @param url the url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds fetchByUrl_First(
		long groupId, java.lang.String url,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUrl_First(groupId, url, orderByComparator);
	}

	/**
	* Returns the last rss feeds in the ordered set where groupId = &#63; and url = &#63;.
	*
	* @param groupId the group ID
	* @param url the url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rss feeds
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds findByUrl_Last(
		long groupId, java.lang.String url,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException {
		return getPersistence().findByUrl_Last(groupId, url, orderByComparator);
	}

	/**
	* Returns the last rss feeds in the ordered set where groupId = &#63; and url = &#63;.
	*
	* @param groupId the group ID
	* @param url the url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds fetchByUrl_Last(
		long groupId, java.lang.String url,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUrl_Last(groupId, url, orderByComparator);
	}

	/**
	* Returns the rss feedses before and after the current rss feeds in the ordered set where groupId = &#63; and url = &#63;.
	*
	* @param rssFeedsId the primary key of the current rss feeds
	* @param groupId the group ID
	* @param url the url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rss feeds
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a rss feeds with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds[] findByUrl_PrevAndNext(
		long rssFeedsId, long groupId, java.lang.String url,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException {
		return getPersistence()
				   .findByUrl_PrevAndNext(rssFeedsId, groupId, url,
			orderByComparator);
	}

	/**
	* Removes all the rss feedses where groupId = &#63; and url = &#63; from the database.
	*
	* @param groupId the group ID
	* @param url the url
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUrl(long groupId, java.lang.String url)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUrl(groupId, url);
	}

	/**
	* Returns the number of rss feedses where groupId = &#63; and url = &#63;.
	*
	* @param groupId the group ID
	* @param url the url
	* @return the number of matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUrl(long groupId, java.lang.String url)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUrl(groupId, url);
	}

	/**
	* Caches the rss feeds in the entity cache if it is enabled.
	*
	* @param rssFeeds the rss feeds
	*/
	public static void cacheResult(com.vnpt.portal.rss.model.RssFeeds rssFeeds) {
		getPersistence().cacheResult(rssFeeds);
	}

	/**
	* Caches the rss feedses in the entity cache if it is enabled.
	*
	* @param rssFeedses the rss feedses
	*/
	public static void cacheResult(
		java.util.List<com.vnpt.portal.rss.model.RssFeeds> rssFeedses) {
		getPersistence().cacheResult(rssFeedses);
	}

	/**
	* Creates a new rss feeds with the primary key. Does not add the rss feeds to the database.
	*
	* @param rssFeedsId the primary key for the new rss feeds
	* @return the new rss feeds
	*/
	public static com.vnpt.portal.rss.model.RssFeeds create(long rssFeedsId) {
		return getPersistence().create(rssFeedsId);
	}

	/**
	* Removes the rss feeds with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rssFeedsId the primary key of the rss feeds
	* @return the rss feeds that was removed
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a rss feeds with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds remove(long rssFeedsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException {
		return getPersistence().remove(rssFeedsId);
	}

	public static com.vnpt.portal.rss.model.RssFeeds updateImpl(
		com.vnpt.portal.rss.model.RssFeeds rssFeeds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(rssFeeds);
	}

	/**
	* Returns the rss feeds with the primary key or throws a {@link com.vnpt.portal.rss.NoSuchRssFeedsException} if it could not be found.
	*
	* @param rssFeedsId the primary key of the rss feeds
	* @return the rss feeds
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a rss feeds with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds findByPrimaryKey(
		long rssFeedsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException {
		return getPersistence().findByPrimaryKey(rssFeedsId);
	}

	/**
	* Returns the rss feeds with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param rssFeedsId the primary key of the rss feeds
	* @return the rss feeds, or <code>null</code> if a rss feeds with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssFeeds fetchByPrimaryKey(
		long rssFeedsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(rssFeedsId);
	}

	/**
	* Returns all the rss feedses.
	*
	* @return the rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssFeeds> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.vnpt.portal.rss.model.RssFeeds> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the rss feedses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssFeedsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rss feedses
	* @param end the upper bound of the range of rss feedses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssFeeds> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the rss feedses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of rss feedses.
	*
	* @return the number of rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RssFeedsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RssFeedsPersistence)PortletBeanLocatorUtil.locate(com.vnpt.portal.rss.service.ClpSerializer.getServletContextName(),
					RssFeedsPersistence.class.getName());

			ReferenceRegistry.registerReference(RssFeedsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(RssFeedsPersistence persistence) {
	}

	private static RssFeedsPersistence _persistence;
}
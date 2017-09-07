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

import com.liferay.portal.service.persistence.BasePersistence;

import com.vnpt.portal.rss.model.RssFeeds;

/**
 * The persistence interface for the rss feeds service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see RssFeedsPersistenceImpl
 * @see RssFeedsUtil
 * @generated
 */
public interface RssFeedsPersistence extends BasePersistence<RssFeeds> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RssFeedsUtil} to access the rss feeds persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the rss feedses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first rss feeds in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rss feeds
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portal.rss.model.RssFeeds findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException;

	/**
	* Returns the first rss feeds in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portal.rss.model.RssFeeds fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last rss feeds in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rss feeds
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portal.rss.model.RssFeeds findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException;

	/**
	* Returns the last rss feeds in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portal.rss.model.RssFeeds fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vnpt.portal.rss.model.RssFeeds[] findByGroupId_PrevAndNext(
		long rssFeedsId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException;

	/**
	* Removes all the rss feedses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rss feedses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the rss feedses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first rss feeds in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rss feeds
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portal.rss.model.RssFeeds findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException;

	/**
	* Returns the first rss feeds in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portal.rss.model.RssFeeds fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last rss feeds in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rss feeds
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portal.rss.model.RssFeeds findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException;

	/**
	* Returns the last rss feeds in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portal.rss.model.RssFeeds fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vnpt.portal.rss.model.RssFeeds[] findByCompanyId_PrevAndNext(
		long rssFeedsId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException;

	/**
	* Removes all the rss feedses where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rss feedses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the rss feedses where groupId = &#63; and url = &#63;.
	*
	* @param groupId the group ID
	* @param url the url
	* @return the matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByUrl(
		long groupId, java.lang.String url)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByUrl(
		long groupId, java.lang.String url, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vnpt.portal.rss.model.RssFeeds> findByUrl(
		long groupId, java.lang.String url, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vnpt.portal.rss.model.RssFeeds findByUrl_First(long groupId,
		java.lang.String url,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException;

	/**
	* Returns the first rss feeds in the ordered set where groupId = &#63; and url = &#63;.
	*
	* @param groupId the group ID
	* @param url the url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portal.rss.model.RssFeeds fetchByUrl_First(long groupId,
		java.lang.String url,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vnpt.portal.rss.model.RssFeeds findByUrl_Last(long groupId,
		java.lang.String url,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException;

	/**
	* Returns the last rss feeds in the ordered set where groupId = &#63; and url = &#63;.
	*
	* @param groupId the group ID
	* @param url the url
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rss feeds, or <code>null</code> if a matching rss feeds could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portal.rss.model.RssFeeds fetchByUrl_Last(long groupId,
		java.lang.String url,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vnpt.portal.rss.model.RssFeeds[] findByUrl_PrevAndNext(
		long rssFeedsId, long groupId, java.lang.String url,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException;

	/**
	* Removes all the rss feedses where groupId = &#63; and url = &#63; from the database.
	*
	* @param groupId the group ID
	* @param url the url
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUrl(long groupId, java.lang.String url)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rss feedses where groupId = &#63; and url = &#63;.
	*
	* @param groupId the group ID
	* @param url the url
	* @return the number of matching rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public int countByUrl(long groupId, java.lang.String url)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the rss feeds in the entity cache if it is enabled.
	*
	* @param rssFeeds the rss feeds
	*/
	public void cacheResult(com.vnpt.portal.rss.model.RssFeeds rssFeeds);

	/**
	* Caches the rss feedses in the entity cache if it is enabled.
	*
	* @param rssFeedses the rss feedses
	*/
	public void cacheResult(
		java.util.List<com.vnpt.portal.rss.model.RssFeeds> rssFeedses);

	/**
	* Creates a new rss feeds with the primary key. Does not add the rss feeds to the database.
	*
	* @param rssFeedsId the primary key for the new rss feeds
	* @return the new rss feeds
	*/
	public com.vnpt.portal.rss.model.RssFeeds create(long rssFeedsId);

	/**
	* Removes the rss feeds with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rssFeedsId the primary key of the rss feeds
	* @return the rss feeds that was removed
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a rss feeds with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portal.rss.model.RssFeeds remove(long rssFeedsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException;

	public com.vnpt.portal.rss.model.RssFeeds updateImpl(
		com.vnpt.portal.rss.model.RssFeeds rssFeeds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the rss feeds with the primary key or throws a {@link com.vnpt.portal.rss.NoSuchRssFeedsException} if it could not be found.
	*
	* @param rssFeedsId the primary key of the rss feeds
	* @return the rss feeds
	* @throws com.vnpt.portal.rss.NoSuchRssFeedsException if a rss feeds with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portal.rss.model.RssFeeds findByPrimaryKey(long rssFeedsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssFeedsException;

	/**
	* Returns the rss feeds with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param rssFeedsId the primary key of the rss feeds
	* @return the rss feeds, or <code>null</code> if a rss feeds with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portal.rss.model.RssFeeds fetchByPrimaryKey(long rssFeedsId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the rss feedses.
	*
	* @return the rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vnpt.portal.rss.model.RssFeeds> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vnpt.portal.rss.model.RssFeeds> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vnpt.portal.rss.model.RssFeeds> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the rss feedses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rss feedses.
	*
	* @return the number of rss feedses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
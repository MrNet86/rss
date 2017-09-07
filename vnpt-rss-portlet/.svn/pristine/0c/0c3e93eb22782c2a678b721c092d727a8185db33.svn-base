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

import com.vnpt.portal.rss.model.RssCategory;

import java.util.List;

/**
 * The persistence utility for the rss category service. This utility wraps {@link RssCategoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see RssCategoryPersistence
 * @see RssCategoryPersistenceImpl
 * @generated
 */
public class RssCategoryUtil {
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
	public static void clearCache(RssCategory rssCategory) {
		getPersistence().clearCache(rssCategory);
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
	public static List<RssCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RssCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RssCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static RssCategory update(RssCategory rssCategory)
		throws SystemException {
		return getPersistence().update(rssCategory);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static RssCategory update(RssCategory rssCategory,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(rssCategory, serviceContext);
	}

	/**
	* Returns all the rss categories where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching rss categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssCategory> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the rss categories where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of rss categories
	* @param end the upper bound of the range of rss categories (not inclusive)
	* @return the range of matching rss categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssCategory> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the rss categories where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of rss categories
	* @param end the upper bound of the range of rss categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rss categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssCategory> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first rss category in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rss category
	* @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a matching rss category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssCategoryException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first rss category in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rss category, or <code>null</code> if a matching rss category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last rss category in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rss category
	* @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a matching rss category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssCategoryException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last rss category in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rss category, or <code>null</code> if a matching rss category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the rss categories before and after the current rss category in the ordered set where groupId = &#63;.
	*
	* @param rssCategoryId the primary key of the current rss category
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rss category
	* @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a rss category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory[] findByGroupId_PrevAndNext(
		long rssCategoryId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssCategoryException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(rssCategoryId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the rss categories where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of rss categories where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching rss categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the rss categories where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching rss categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssCategory> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the rss categories where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of rss categories
	* @param end the upper bound of the range of rss categories (not inclusive)
	* @return the range of matching rss categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssCategory> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the rss categories where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of rss categories
	* @param end the upper bound of the range of rss categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rss categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssCategory> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first rss category in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rss category
	* @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a matching rss category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssCategoryException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first rss category in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rss category, or <code>null</code> if a matching rss category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last rss category in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rss category
	* @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a matching rss category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssCategoryException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last rss category in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rss category, or <code>null</code> if a matching rss category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the rss categories before and after the current rss category in the ordered set where companyId = &#63;.
	*
	* @param rssCategoryId the primary key of the current rss category
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rss category
	* @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a rss category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory[] findByCompanyId_PrevAndNext(
		long rssCategoryId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssCategoryException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(rssCategoryId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the rss categories where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of rss categories where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching rss categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Caches the rss category in the entity cache if it is enabled.
	*
	* @param rssCategory the rss category
	*/
	public static void cacheResult(
		com.vnpt.portal.rss.model.RssCategory rssCategory) {
		getPersistence().cacheResult(rssCategory);
	}

	/**
	* Caches the rss categories in the entity cache if it is enabled.
	*
	* @param rssCategories the rss categories
	*/
	public static void cacheResult(
		java.util.List<com.vnpt.portal.rss.model.RssCategory> rssCategories) {
		getPersistence().cacheResult(rssCategories);
	}

	/**
	* Creates a new rss category with the primary key. Does not add the rss category to the database.
	*
	* @param rssCategoryId the primary key for the new rss category
	* @return the new rss category
	*/
	public static com.vnpt.portal.rss.model.RssCategory create(
		long rssCategoryId) {
		return getPersistence().create(rssCategoryId);
	}

	/**
	* Removes the rss category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rssCategoryId the primary key of the rss category
	* @return the rss category that was removed
	* @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a rss category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory remove(
		long rssCategoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssCategoryException {
		return getPersistence().remove(rssCategoryId);
	}

	public static com.vnpt.portal.rss.model.RssCategory updateImpl(
		com.vnpt.portal.rss.model.RssCategory rssCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(rssCategory);
	}

	/**
	* Returns the rss category with the primary key or throws a {@link com.vnpt.portal.rss.NoSuchRssCategoryException} if it could not be found.
	*
	* @param rssCategoryId the primary key of the rss category
	* @return the rss category
	* @throws com.vnpt.portal.rss.NoSuchRssCategoryException if a rss category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory findByPrimaryKey(
		long rssCategoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portal.rss.NoSuchRssCategoryException {
		return getPersistence().findByPrimaryKey(rssCategoryId);
	}

	/**
	* Returns the rss category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param rssCategoryId the primary key of the rss category
	* @return the rss category, or <code>null</code> if a rss category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vnpt.portal.rss.model.RssCategory fetchByPrimaryKey(
		long rssCategoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(rssCategoryId);
	}

	/**
	* Returns all the rss categories.
	*
	* @return the rss categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssCategory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.vnpt.portal.rss.model.RssCategory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the rss categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portal.rss.model.impl.RssCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rss categories
	* @param end the upper bound of the range of rss categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of rss categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vnpt.portal.rss.model.RssCategory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the rss categories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of rss categories.
	*
	* @return the number of rss categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RssCategoryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RssCategoryPersistence)PortletBeanLocatorUtil.locate(com.vnpt.portal.rss.service.ClpSerializer.getServletContextName(),
					RssCategoryPersistence.class.getName());

			ReferenceRegistry.registerReference(RssCategoryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(RssCategoryPersistence persistence) {
	}

	private static RssCategoryPersistence _persistence;
}
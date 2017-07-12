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

import com.liferay.portal.service.persistence.BasePersistence;

import com.viettel.ims.core.model.InvestCategories;

/**
 * The persistence interface for the invest categories service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see InvestCategoriesPersistenceImpl
 * @see InvestCategoriesUtil
 * @generated
 */
public interface InvestCategoriesPersistence extends BasePersistence<InvestCategories> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InvestCategoriesUtil} to access the invest categories persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the invest categorieses where objId = &#63; and isActive = &#63;.
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @return the matching invest categorieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.InvestCategories> findByObjId(
		long objId, long isActive)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the invest categorieses where objId = &#63; and isActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestCategoriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @param start the lower bound of the range of invest categorieses
	* @param end the upper bound of the range of invest categorieses (not inclusive)
	* @return the range of matching invest categorieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.InvestCategories> findByObjId(
		long objId, long isActive, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the invest categorieses where objId = &#63; and isActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestCategoriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @param start the lower bound of the range of invest categorieses
	* @param end the upper bound of the range of invest categorieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching invest categorieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.InvestCategories> findByObjId(
		long objId, long isActive, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first invest categories in the ordered set where objId = &#63; and isActive = &#63;.
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching invest categories
	* @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a matching invest categories could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.InvestCategories findByObjId_First(
		long objId, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestCategoriesException;

	/**
	* Returns the first invest categories in the ordered set where objId = &#63; and isActive = &#63;.
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching invest categories, or <code>null</code> if a matching invest categories could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.InvestCategories fetchByObjId_First(
		long objId, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last invest categories in the ordered set where objId = &#63; and isActive = &#63;.
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching invest categories
	* @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a matching invest categories could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.InvestCategories findByObjId_Last(
		long objId, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestCategoriesException;

	/**
	* Returns the last invest categories in the ordered set where objId = &#63; and isActive = &#63;.
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching invest categories, or <code>null</code> if a matching invest categories could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.InvestCategories fetchByObjId_Last(
		long objId, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the invest categorieses before and after the current invest categories in the ordered set where objId = &#63; and isActive = &#63;.
	*
	* @param investCategoriesId the primary key of the current invest categories
	* @param objId the obj ID
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next invest categories
	* @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a invest categories with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.InvestCategories[] findByObjId_PrevAndNext(
		long investCategoriesId, long objId, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestCategoriesException;

	/**
	* Removes all the invest categorieses where objId = &#63; and isActive = &#63; from the database.
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByObjId(long objId, long isActive)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of invest categorieses where objId = &#63; and isActive = &#63;.
	*
	* @param objId the obj ID
	* @param isActive the is active
	* @return the number of matching invest categorieses
	* @throws SystemException if a system exception occurred
	*/
	public int countByObjId(long objId, long isActive)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the invest categories in the entity cache if it is enabled.
	*
	* @param investCategories the invest categories
	*/
	public void cacheResult(
		com.viettel.ims.core.model.InvestCategories investCategories);

	/**
	* Caches the invest categorieses in the entity cache if it is enabled.
	*
	* @param investCategorieses the invest categorieses
	*/
	public void cacheResult(
		java.util.List<com.viettel.ims.core.model.InvestCategories> investCategorieses);

	/**
	* Creates a new invest categories with the primary key. Does not add the invest categories to the database.
	*
	* @param investCategoriesId the primary key for the new invest categories
	* @return the new invest categories
	*/
	public com.viettel.ims.core.model.InvestCategories create(
		long investCategoriesId);

	/**
	* Removes the invest categories with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param investCategoriesId the primary key of the invest categories
	* @return the invest categories that was removed
	* @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a invest categories with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.InvestCategories remove(
		long investCategoriesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestCategoriesException;

	public com.viettel.ims.core.model.InvestCategories updateImpl(
		com.viettel.ims.core.model.InvestCategories investCategories)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the invest categories with the primary key or throws a {@link com.viettel.ims.core.NoSuchInvestCategoriesException} if it could not be found.
	*
	* @param investCategoriesId the primary key of the invest categories
	* @return the invest categories
	* @throws com.viettel.ims.core.NoSuchInvestCategoriesException if a invest categories with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.InvestCategories findByPrimaryKey(
		long investCategoriesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestCategoriesException;

	/**
	* Returns the invest categories with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param investCategoriesId the primary key of the invest categories
	* @return the invest categories, or <code>null</code> if a invest categories with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.InvestCategories fetchByPrimaryKey(
		long investCategoriesId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the invest categorieses.
	*
	* @return the invest categorieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.InvestCategories> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the invest categorieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestCategoriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of invest categorieses
	* @param end the upper bound of the range of invest categorieses (not inclusive)
	* @return the range of invest categorieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.InvestCategories> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the invest categorieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestCategoriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of invest categorieses
	* @param end the upper bound of the range of invest categorieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of invest categorieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.InvestCategories> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the invest categorieses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of invest categorieses.
	*
	* @return the number of invest categorieses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
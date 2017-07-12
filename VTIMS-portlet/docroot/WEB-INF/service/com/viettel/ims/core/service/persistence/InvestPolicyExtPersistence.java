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

import com.viettel.ims.core.model.InvestPolicyExt;

/**
 * The persistence interface for the invest policy ext service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see InvestPolicyExtPersistenceImpl
 * @see InvestPolicyExtUtil
 * @generated
 */
public interface InvestPolicyExtPersistence extends BasePersistence<InvestPolicyExt> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InvestPolicyExtUtil} to access the invest policy ext persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the invest policy exts where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @return the matching invest policy exts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.InvestPolicyExt> findByInfoPolicyName(
		java.lang.String infoPolicyName, long isActive)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the invest policy exts where infoPolicyName = &#63; and isActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param start the lower bound of the range of invest policy exts
	* @param end the upper bound of the range of invest policy exts (not inclusive)
	* @return the range of matching invest policy exts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.InvestPolicyExt> findByInfoPolicyName(
		java.lang.String infoPolicyName, long isActive, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the invest policy exts where infoPolicyName = &#63; and isActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param start the lower bound of the range of invest policy exts
	* @param end the upper bound of the range of invest policy exts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching invest policy exts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.InvestPolicyExt> findByInfoPolicyName(
		java.lang.String infoPolicyName, long isActive, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first invest policy ext in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching invest policy ext
	* @throws com.viettel.ims.core.NoSuchInvestPolicyExtException if a matching invest policy ext could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.InvestPolicyExt findByInfoPolicyName_First(
		java.lang.String infoPolicyName, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestPolicyExtException;

	/**
	* Returns the first invest policy ext in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching invest policy ext, or <code>null</code> if a matching invest policy ext could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.InvestPolicyExt fetchByInfoPolicyName_First(
		java.lang.String infoPolicyName, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last invest policy ext in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching invest policy ext
	* @throws com.viettel.ims.core.NoSuchInvestPolicyExtException if a matching invest policy ext could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.InvestPolicyExt findByInfoPolicyName_Last(
		java.lang.String infoPolicyName, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestPolicyExtException;

	/**
	* Returns the last invest policy ext in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching invest policy ext, or <code>null</code> if a matching invest policy ext could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.InvestPolicyExt fetchByInfoPolicyName_Last(
		java.lang.String infoPolicyName, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the invest policy exts before and after the current invest policy ext in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param investPolicyId the primary key of the current invest policy ext
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next invest policy ext
	* @throws com.viettel.ims.core.NoSuchInvestPolicyExtException if a invest policy ext with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.InvestPolicyExt[] findByInfoPolicyName_PrevAndNext(
		long investPolicyId, java.lang.String infoPolicyName, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestPolicyExtException;

	/**
	* Removes all the invest policy exts where infoPolicyName = &#63; and isActive = &#63; from the database.
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByInfoPolicyName(java.lang.String infoPolicyName,
		long isActive)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of invest policy exts where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @return the number of matching invest policy exts
	* @throws SystemException if a system exception occurred
	*/
	public int countByInfoPolicyName(java.lang.String infoPolicyName,
		long isActive)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the invest policy ext in the entity cache if it is enabled.
	*
	* @param investPolicyExt the invest policy ext
	*/
	public void cacheResult(
		com.viettel.ims.core.model.InvestPolicyExt investPolicyExt);

	/**
	* Caches the invest policy exts in the entity cache if it is enabled.
	*
	* @param investPolicyExts the invest policy exts
	*/
	public void cacheResult(
		java.util.List<com.viettel.ims.core.model.InvestPolicyExt> investPolicyExts);

	/**
	* Creates a new invest policy ext with the primary key. Does not add the invest policy ext to the database.
	*
	* @param investPolicyId the primary key for the new invest policy ext
	* @return the new invest policy ext
	*/
	public com.viettel.ims.core.model.InvestPolicyExt create(
		long investPolicyId);

	/**
	* Removes the invest policy ext with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param investPolicyId the primary key of the invest policy ext
	* @return the invest policy ext that was removed
	* @throws com.viettel.ims.core.NoSuchInvestPolicyExtException if a invest policy ext with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.InvestPolicyExt remove(
		long investPolicyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestPolicyExtException;

	public com.viettel.ims.core.model.InvestPolicyExt updateImpl(
		com.viettel.ims.core.model.InvestPolicyExt investPolicyExt)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the invest policy ext with the primary key or throws a {@link com.viettel.ims.core.NoSuchInvestPolicyExtException} if it could not be found.
	*
	* @param investPolicyId the primary key of the invest policy ext
	* @return the invest policy ext
	* @throws com.viettel.ims.core.NoSuchInvestPolicyExtException if a invest policy ext with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.InvestPolicyExt findByPrimaryKey(
		long investPolicyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestPolicyExtException;

	/**
	* Returns the invest policy ext with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param investPolicyId the primary key of the invest policy ext
	* @return the invest policy ext, or <code>null</code> if a invest policy ext with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.InvestPolicyExt fetchByPrimaryKey(
		long investPolicyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the invest policy exts.
	*
	* @return the invest policy exts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.InvestPolicyExt> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the invest policy exts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of invest policy exts
	* @param end the upper bound of the range of invest policy exts (not inclusive)
	* @return the range of invest policy exts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.InvestPolicyExt> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the invest policy exts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyExtModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of invest policy exts
	* @param end the upper bound of the range of invest policy exts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of invest policy exts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.InvestPolicyExt> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the invest policy exts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of invest policy exts.
	*
	* @return the number of invest policy exts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
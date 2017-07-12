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

import com.viettel.ims.core.model.VInvestPolicy;

/**
 * The persistence interface for the v invest policy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see VInvestPolicyPersistenceImpl
 * @see VInvestPolicyUtil
 * @generated
 */
public interface VInvestPolicyPersistence extends BasePersistence<VInvestPolicy> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VInvestPolicyUtil} to access the v invest policy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the v invest policy in the entity cache if it is enabled.
	*
	* @param vInvestPolicy the v invest policy
	*/
	public void cacheResult(
		com.viettel.ims.core.model.VInvestPolicy vInvestPolicy);

	/**
	* Caches the v invest policies in the entity cache if it is enabled.
	*
	* @param vInvestPolicies the v invest policies
	*/
	public void cacheResult(
		java.util.List<com.viettel.ims.core.model.VInvestPolicy> vInvestPolicies);

	/**
	* Creates a new v invest policy with the primary key. Does not add the v invest policy to the database.
	*
	* @param investPolicyId the primary key for the new v invest policy
	* @return the new v invest policy
	*/
	public com.viettel.ims.core.model.VInvestPolicy create(long investPolicyId);

	/**
	* Removes the v invest policy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param investPolicyId the primary key of the v invest policy
	* @return the v invest policy that was removed
	* @throws com.viettel.ims.core.NoSuchVInvestPolicyException if a v invest policy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.VInvestPolicy remove(long investPolicyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchVInvestPolicyException;

	public com.viettel.ims.core.model.VInvestPolicy updateImpl(
		com.viettel.ims.core.model.VInvestPolicy vInvestPolicy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the v invest policy with the primary key or throws a {@link com.viettel.ims.core.NoSuchVInvestPolicyException} if it could not be found.
	*
	* @param investPolicyId the primary key of the v invest policy
	* @return the v invest policy
	* @throws com.viettel.ims.core.NoSuchVInvestPolicyException if a v invest policy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.VInvestPolicy findByPrimaryKey(
		long investPolicyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchVInvestPolicyException;

	/**
	* Returns the v invest policy with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param investPolicyId the primary key of the v invest policy
	* @return the v invest policy, or <code>null</code> if a v invest policy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.VInvestPolicy fetchByPrimaryKey(
		long investPolicyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the v invest policies.
	*
	* @return the v invest policies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.VInvestPolicy> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the v invest policies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.VInvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v invest policies
	* @param end the upper bound of the range of v invest policies (not inclusive)
	* @return the range of v invest policies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.VInvestPolicy> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the v invest policies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.VInvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v invest policies
	* @param end the upper bound of the range of v invest policies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v invest policies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.VInvestPolicy> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v invest policies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of v invest policies.
	*
	* @return the number of v invest policies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
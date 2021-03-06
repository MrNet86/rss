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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.viettel.ims.core.model.InvestPolicy;

import java.util.List;

/**
 * The persistence utility for the invest policy service. This utility wraps {@link InvestPolicyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see InvestPolicyPersistence
 * @see InvestPolicyPersistenceImpl
 * @generated
 */
public class InvestPolicyUtil {
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
	public static void clearCache(InvestPolicy investPolicy) {
		getPersistence().clearCache(investPolicy);
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
	public static List<InvestPolicy> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<InvestPolicy> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<InvestPolicy> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static InvestPolicy update(InvestPolicy investPolicy)
		throws SystemException {
		return getPersistence().update(investPolicy);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static InvestPolicy update(InvestPolicy investPolicy,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(investPolicy, serviceContext);
	}

	/**
	* Returns all the invest policies where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @return the matching invest policies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.InvestPolicy> findByInfoPolicyName(
		java.lang.String infoPolicyName, long isActive)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByInfoPolicyName(infoPolicyName, isActive);
	}

	/**
	* Returns a range of all the invest policies where infoPolicyName = &#63; and isActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param start the lower bound of the range of invest policies
	* @param end the upper bound of the range of invest policies (not inclusive)
	* @return the range of matching invest policies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.InvestPolicy> findByInfoPolicyName(
		java.lang.String infoPolicyName, long isActive, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInfoPolicyName(infoPolicyName, isActive, start, end);
	}

	/**
	* Returns an ordered range of all the invest policies where infoPolicyName = &#63; and isActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param start the lower bound of the range of invest policies
	* @param end the upper bound of the range of invest policies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching invest policies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.InvestPolicy> findByInfoPolicyName(
		java.lang.String infoPolicyName, long isActive, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInfoPolicyName(infoPolicyName, isActive, start, end,
			orderByComparator);
	}

	/**
	* Returns the first invest policy in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching invest policy
	* @throws com.viettel.ims.core.NoSuchInvestPolicyException if a matching invest policy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestPolicy findByInfoPolicyName_First(
		java.lang.String infoPolicyName, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestPolicyException {
		return getPersistence()
				   .findByInfoPolicyName_First(infoPolicyName, isActive,
			orderByComparator);
	}

	/**
	* Returns the first invest policy in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching invest policy, or <code>null</code> if a matching invest policy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestPolicy fetchByInfoPolicyName_First(
		java.lang.String infoPolicyName, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInfoPolicyName_First(infoPolicyName, isActive,
			orderByComparator);
	}

	/**
	* Returns the last invest policy in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching invest policy
	* @throws com.viettel.ims.core.NoSuchInvestPolicyException if a matching invest policy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestPolicy findByInfoPolicyName_Last(
		java.lang.String infoPolicyName, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestPolicyException {
		return getPersistence()
				   .findByInfoPolicyName_Last(infoPolicyName, isActive,
			orderByComparator);
	}

	/**
	* Returns the last invest policy in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching invest policy, or <code>null</code> if a matching invest policy could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestPolicy fetchByInfoPolicyName_Last(
		java.lang.String infoPolicyName, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInfoPolicyName_Last(infoPolicyName, isActive,
			orderByComparator);
	}

	/**
	* Returns the invest policies before and after the current invest policy in the ordered set where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param investPolicyId the primary key of the current invest policy
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next invest policy
	* @throws com.viettel.ims.core.NoSuchInvestPolicyException if a invest policy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestPolicy[] findByInfoPolicyName_PrevAndNext(
		long investPolicyId, java.lang.String infoPolicyName, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestPolicyException {
		return getPersistence()
				   .findByInfoPolicyName_PrevAndNext(investPolicyId,
			infoPolicyName, isActive, orderByComparator);
	}

	/**
	* Returns all the invest policies that the user has permission to view where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @return the matching invest policies that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.InvestPolicy> filterFindByInfoPolicyName(
		java.lang.String infoPolicyName, long isActive)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByInfoPolicyName(infoPolicyName, isActive);
	}

	/**
	* Returns a range of all the invest policies that the user has permission to view where infoPolicyName = &#63; and isActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param start the lower bound of the range of invest policies
	* @param end the upper bound of the range of invest policies (not inclusive)
	* @return the range of matching invest policies that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.InvestPolicy> filterFindByInfoPolicyName(
		java.lang.String infoPolicyName, long isActive, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByInfoPolicyName(infoPolicyName, isActive, start,
			end);
	}

	/**
	* Returns an ordered range of all the invest policies that the user has permissions to view where infoPolicyName = &#63; and isActive = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param start the lower bound of the range of invest policies
	* @param end the upper bound of the range of invest policies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching invest policies that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.InvestPolicy> filterFindByInfoPolicyName(
		java.lang.String infoPolicyName, long isActive, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByInfoPolicyName(infoPolicyName, isActive, start,
			end, orderByComparator);
	}

	/**
	* Returns the invest policies before and after the current invest policy in the ordered set of invest policies that the user has permission to view where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param investPolicyId the primary key of the current invest policy
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next invest policy
	* @throws com.viettel.ims.core.NoSuchInvestPolicyException if a invest policy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestPolicy[] filterFindByInfoPolicyName_PrevAndNext(
		long investPolicyId, java.lang.String infoPolicyName, long isActive,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestPolicyException {
		return getPersistence()
				   .filterFindByInfoPolicyName_PrevAndNext(investPolicyId,
			infoPolicyName, isActive, orderByComparator);
	}

	/**
	* Removes all the invest policies where infoPolicyName = &#63; and isActive = &#63; from the database.
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByInfoPolicyName(java.lang.String infoPolicyName,
		long isActive)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByInfoPolicyName(infoPolicyName, isActive);
	}

	/**
	* Returns the number of invest policies where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @return the number of matching invest policies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInfoPolicyName(java.lang.String infoPolicyName,
		long isActive)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByInfoPolicyName(infoPolicyName, isActive);
	}

	/**
	* Returns the number of invest policies that the user has permission to view where infoPolicyName = &#63; and isActive = &#63;.
	*
	* @param infoPolicyName the info policy name
	* @param isActive the is active
	* @return the number of matching invest policies that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByInfoPolicyName(
		java.lang.String infoPolicyName, long isActive)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterCountByInfoPolicyName(infoPolicyName, isActive);
	}

	/**
	* Caches the invest policy in the entity cache if it is enabled.
	*
	* @param investPolicy the invest policy
	*/
	public static void cacheResult(
		com.viettel.ims.core.model.InvestPolicy investPolicy) {
		getPersistence().cacheResult(investPolicy);
	}

	/**
	* Caches the invest policies in the entity cache if it is enabled.
	*
	* @param investPolicies the invest policies
	*/
	public static void cacheResult(
		java.util.List<com.viettel.ims.core.model.InvestPolicy> investPolicies) {
		getPersistence().cacheResult(investPolicies);
	}

	/**
	* Creates a new invest policy with the primary key. Does not add the invest policy to the database.
	*
	* @param investPolicyId the primary key for the new invest policy
	* @return the new invest policy
	*/
	public static com.viettel.ims.core.model.InvestPolicy create(
		long investPolicyId) {
		return getPersistence().create(investPolicyId);
	}

	/**
	* Removes the invest policy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param investPolicyId the primary key of the invest policy
	* @return the invest policy that was removed
	* @throws com.viettel.ims.core.NoSuchInvestPolicyException if a invest policy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestPolicy remove(
		long investPolicyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestPolicyException {
		return getPersistence().remove(investPolicyId);
	}

	public static com.viettel.ims.core.model.InvestPolicy updateImpl(
		com.viettel.ims.core.model.InvestPolicy investPolicy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(investPolicy);
	}

	/**
	* Returns the invest policy with the primary key or throws a {@link com.viettel.ims.core.NoSuchInvestPolicyException} if it could not be found.
	*
	* @param investPolicyId the primary key of the invest policy
	* @return the invest policy
	* @throws com.viettel.ims.core.NoSuchInvestPolicyException if a invest policy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestPolicy findByPrimaryKey(
		long investPolicyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchInvestPolicyException {
		return getPersistence().findByPrimaryKey(investPolicyId);
	}

	/**
	* Returns the invest policy with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param investPolicyId the primary key of the invest policy
	* @return the invest policy, or <code>null</code> if a invest policy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.InvestPolicy fetchByPrimaryKey(
		long investPolicyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(investPolicyId);
	}

	/**
	* Returns all the invest policies.
	*
	* @return the invest policies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.InvestPolicy> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the invest policies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of invest policies
	* @param end the upper bound of the range of invest policies (not inclusive)
	* @return the range of invest policies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.InvestPolicy> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the invest policies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of invest policies
	* @param end the upper bound of the range of invest policies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of invest policies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.InvestPolicy> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the invest policies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of invest policies.
	*
	* @return the number of invest policies
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static InvestPolicyPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (InvestPolicyPersistence)PortletBeanLocatorUtil.locate(com.viettel.ims.core.service.ClpSerializer.getServletContextName(),
					InvestPolicyPersistence.class.getName());

			ReferenceRegistry.registerReference(InvestPolicyUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(InvestPolicyPersistence persistence) {
	}

	private static InvestPolicyPersistence _persistence;
}
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

package com.viettel.ims.core.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InvestPolicyLocalService}.
 *
 * @author MrNet
 * @see InvestPolicyLocalService
 * @generated
 */
public class InvestPolicyLocalServiceWrapper implements InvestPolicyLocalService,
	ServiceWrapper<InvestPolicyLocalService> {
	public InvestPolicyLocalServiceWrapper(
		InvestPolicyLocalService investPolicyLocalService) {
		_investPolicyLocalService = investPolicyLocalService;
	}

	/**
	* Adds the invest policy to the database. Also notifies the appropriate model listeners.
	*
	* @param investPolicy the invest policy
	* @return the invest policy that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ims.core.model.InvestPolicy addInvestPolicy(
		com.viettel.ims.core.model.InvestPolicy investPolicy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyLocalService.addInvestPolicy(investPolicy);
	}

	/**
	* Creates a new invest policy with the primary key. Does not add the invest policy to the database.
	*
	* @param investPolicyId the primary key for the new invest policy
	* @return the new invest policy
	*/
	@Override
	public com.viettel.ims.core.model.InvestPolicy createInvestPolicy(
		long investPolicyId) {
		return _investPolicyLocalService.createInvestPolicy(investPolicyId);
	}

	/**
	* Deletes the invest policy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param investPolicyId the primary key of the invest policy
	* @return the invest policy that was removed
	* @throws PortalException if a invest policy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ims.core.model.InvestPolicy deleteInvestPolicy(
		long investPolicyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyLocalService.deleteInvestPolicy(investPolicyId);
	}

	/**
	* Deletes the invest policy from the database. Also notifies the appropriate model listeners.
	*
	* @param investPolicy the invest policy
	* @return the invest policy that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ims.core.model.InvestPolicy deleteInvestPolicy(
		com.viettel.ims.core.model.InvestPolicy investPolicy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyLocalService.deleteInvestPolicy(investPolicy);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _investPolicyLocalService.dynamicQuery();
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
		return _investPolicyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _investPolicyLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.InvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _investPolicyLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _investPolicyLocalService.dynamicQueryCount(dynamicQuery);
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
		return _investPolicyLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.viettel.ims.core.model.InvestPolicy fetchInvestPolicy(
		long investPolicyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyLocalService.fetchInvestPolicy(investPolicyId);
	}

	/**
	* Returns the invest policy with the primary key.
	*
	* @param investPolicyId the primary key of the invest policy
	* @return the invest policy
	* @throws PortalException if a invest policy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ims.core.model.InvestPolicy getInvestPolicy(
		long investPolicyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyLocalService.getInvestPolicy(investPolicyId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.viettel.ims.core.model.InvestPolicy> getInvestPolicies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyLocalService.getInvestPolicies(start, end);
	}

	/**
	* Returns the number of invest policies.
	*
	* @return the number of invest policies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getInvestPoliciesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyLocalService.getInvestPoliciesCount();
	}

	/**
	* Updates the invest policy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param investPolicy the invest policy
	* @return the invest policy that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ims.core.model.InvestPolicy updateInvestPolicy(
		com.viettel.ims.core.model.InvestPolicy investPolicy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyLocalService.updateInvestPolicy(investPolicy);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _investPolicyLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_investPolicyLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _investPolicyLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.viettel.ims.core.model.InvestPolicy> searchInvestPolicy(
		com.liferay.portal.kernel.dao.search.SearchContainer searchContainer,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyLocalService.searchInvestPolicy(searchContainer,
			start, end);
	}

	@Override
	public int countInvestPolicy(
		com.liferay.portal.kernel.dao.search.SearchContainer searchContainer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyLocalService.countInvestPolicy(searchContainer);
	}

	@Override
	public java.util.List<com.viettel.ims.core.model.InvestPolicyExt> searchInvestPolicyExt(
		com.liferay.portal.kernel.dao.search.SearchContainer searchContainer,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _investPolicyLocalService.searchInvestPolicyExt(searchContainer,
			start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public InvestPolicyLocalService getWrappedInvestPolicyLocalService() {
		return _investPolicyLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedInvestPolicyLocalService(
		InvestPolicyLocalService investPolicyLocalService) {
		_investPolicyLocalService = investPolicyLocalService;
	}

	@Override
	public InvestPolicyLocalService getWrappedService() {
		return _investPolicyLocalService;
	}

	@Override
	public void setWrappedService(
		InvestPolicyLocalService investPolicyLocalService) {
		_investPolicyLocalService = investPolicyLocalService;
	}

	private InvestPolicyLocalService _investPolicyLocalService;
}
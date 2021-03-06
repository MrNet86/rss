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
 * Provides a wrapper for {@link VInvestPolicyLocalService}.
 *
 * @author MrNet
 * @see VInvestPolicyLocalService
 * @generated
 */
public class VInvestPolicyLocalServiceWrapper
	implements VInvestPolicyLocalService,
		ServiceWrapper<VInvestPolicyLocalService> {
	public VInvestPolicyLocalServiceWrapper(
		VInvestPolicyLocalService vInvestPolicyLocalService) {
		_vInvestPolicyLocalService = vInvestPolicyLocalService;
	}

	/**
	* Adds the v invest policy to the database. Also notifies the appropriate model listeners.
	*
	* @param vInvestPolicy the v invest policy
	* @return the v invest policy that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ims.core.model.VInvestPolicy addVInvestPolicy(
		com.viettel.ims.core.model.VInvestPolicy vInvestPolicy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vInvestPolicyLocalService.addVInvestPolicy(vInvestPolicy);
	}

	/**
	* Creates a new v invest policy with the primary key. Does not add the v invest policy to the database.
	*
	* @param investPolicyId the primary key for the new v invest policy
	* @return the new v invest policy
	*/
	@Override
	public com.viettel.ims.core.model.VInvestPolicy createVInvestPolicy(
		long investPolicyId) {
		return _vInvestPolicyLocalService.createVInvestPolicy(investPolicyId);
	}

	/**
	* Deletes the v invest policy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param investPolicyId the primary key of the v invest policy
	* @return the v invest policy that was removed
	* @throws PortalException if a v invest policy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ims.core.model.VInvestPolicy deleteVInvestPolicy(
		long investPolicyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vInvestPolicyLocalService.deleteVInvestPolicy(investPolicyId);
	}

	/**
	* Deletes the v invest policy from the database. Also notifies the appropriate model listeners.
	*
	* @param vInvestPolicy the v invest policy
	* @return the v invest policy that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ims.core.model.VInvestPolicy deleteVInvestPolicy(
		com.viettel.ims.core.model.VInvestPolicy vInvestPolicy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vInvestPolicyLocalService.deleteVInvestPolicy(vInvestPolicy);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vInvestPolicyLocalService.dynamicQuery();
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
		return _vInvestPolicyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.VInvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vInvestPolicyLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.VInvestPolicyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vInvestPolicyLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _vInvestPolicyLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vInvestPolicyLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.viettel.ims.core.model.VInvestPolicy fetchVInvestPolicy(
		long investPolicyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vInvestPolicyLocalService.fetchVInvestPolicy(investPolicyId);
	}

	/**
	* Returns the v invest policy with the primary key.
	*
	* @param investPolicyId the primary key of the v invest policy
	* @return the v invest policy
	* @throws PortalException if a v invest policy with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ims.core.model.VInvestPolicy getVInvestPolicy(
		long investPolicyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vInvestPolicyLocalService.getVInvestPolicy(investPolicyId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vInvestPolicyLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.viettel.ims.core.model.VInvestPolicy> getVInvestPolicies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vInvestPolicyLocalService.getVInvestPolicies(start, end);
	}

	/**
	* Returns the number of v invest policies.
	*
	* @return the number of v invest policies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVInvestPoliciesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vInvestPolicyLocalService.getVInvestPoliciesCount();
	}

	/**
	* Updates the v invest policy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vInvestPolicy the v invest policy
	* @return the v invest policy that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ims.core.model.VInvestPolicy updateVInvestPolicy(
		com.viettel.ims.core.model.VInvestPolicy vInvestPolicy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vInvestPolicyLocalService.updateVInvestPolicy(vInvestPolicy);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _vInvestPolicyLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_vInvestPolicyLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _vInvestPolicyLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VInvestPolicyLocalService getWrappedVInvestPolicyLocalService() {
		return _vInvestPolicyLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVInvestPolicyLocalService(
		VInvestPolicyLocalService vInvestPolicyLocalService) {
		_vInvestPolicyLocalService = vInvestPolicyLocalService;
	}

	@Override
	public VInvestPolicyLocalService getWrappedService() {
		return _vInvestPolicyLocalService;
	}

	@Override
	public void setWrappedService(
		VInvestPolicyLocalService vInvestPolicyLocalService) {
		_vInvestPolicyLocalService = vInvestPolicyLocalService;
	}

	private VInvestPolicyLocalService _vInvestPolicyLocalService;
}
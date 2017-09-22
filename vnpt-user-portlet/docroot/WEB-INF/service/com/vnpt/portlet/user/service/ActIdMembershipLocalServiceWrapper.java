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

package com.vnpt.portlet.user.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ActIdMembershipLocalService}.
 *
 * @author ToanNQ86
 * @see ActIdMembershipLocalService
 * @generated
 */
public class ActIdMembershipLocalServiceWrapper
	implements ActIdMembershipLocalService,
		ServiceWrapper<ActIdMembershipLocalService> {
	public ActIdMembershipLocalServiceWrapper(
		ActIdMembershipLocalService actIdMembershipLocalService) {
		_actIdMembershipLocalService = actIdMembershipLocalService;
	}

	/**
	* Adds the act ID membership to the database. Also notifies the appropriate model listeners.
	*
	* @param actIdMembership the act ID membership
	* @return the act ID membership that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdMembership addActIdMembership(
		com.vnpt.portlet.user.model.ActIdMembership actIdMembership)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdMembershipLocalService.addActIdMembership(actIdMembership);
	}

	/**
	* Creates a new act ID membership with the primary key. Does not add the act ID membership to the database.
	*
	* @param actIdMembershipPK the primary key for the new act ID membership
	* @return the new act ID membership
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdMembership createActIdMembership(
		com.vnpt.portlet.user.service.persistence.ActIdMembershipPK actIdMembershipPK) {
		return _actIdMembershipLocalService.createActIdMembership(actIdMembershipPK);
	}

	/**
	* Deletes the act ID membership with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param actIdMembershipPK the primary key of the act ID membership
	* @return the act ID membership that was removed
	* @throws PortalException if a act ID membership with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdMembership deleteActIdMembership(
		com.vnpt.portlet.user.service.persistence.ActIdMembershipPK actIdMembershipPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _actIdMembershipLocalService.deleteActIdMembership(actIdMembershipPK);
	}

	/**
	* Deletes the act ID membership from the database. Also notifies the appropriate model listeners.
	*
	* @param actIdMembership the act ID membership
	* @return the act ID membership that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdMembership deleteActIdMembership(
		com.vnpt.portlet.user.model.ActIdMembership actIdMembership)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdMembershipLocalService.deleteActIdMembership(actIdMembership);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _actIdMembershipLocalService.dynamicQuery();
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
		return _actIdMembershipLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdMembershipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _actIdMembershipLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdMembershipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _actIdMembershipLocalService.dynamicQuery(dynamicQuery, start,
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
		return _actIdMembershipLocalService.dynamicQueryCount(dynamicQuery);
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
		return _actIdMembershipLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.vnpt.portlet.user.model.ActIdMembership fetchActIdMembership(
		com.vnpt.portlet.user.service.persistence.ActIdMembershipPK actIdMembershipPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdMembershipLocalService.fetchActIdMembership(actIdMembershipPK);
	}

	/**
	* Returns the act ID membership with the primary key.
	*
	* @param actIdMembershipPK the primary key of the act ID membership
	* @return the act ID membership
	* @throws PortalException if a act ID membership with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdMembership getActIdMembership(
		com.vnpt.portlet.user.service.persistence.ActIdMembershipPK actIdMembershipPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _actIdMembershipLocalService.getActIdMembership(actIdMembershipPK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _actIdMembershipLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the act ID memberships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdMembershipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of act ID memberships
	* @param end the upper bound of the range of act ID memberships (not inclusive)
	* @return the range of act ID memberships
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.vnpt.portlet.user.model.ActIdMembership> getActIdMemberships(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdMembershipLocalService.getActIdMemberships(start, end);
	}

	/**
	* Returns the number of act ID memberships.
	*
	* @return the number of act ID memberships
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getActIdMembershipsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdMembershipLocalService.getActIdMembershipsCount();
	}

	/**
	* Updates the act ID membership in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param actIdMembership the act ID membership
	* @return the act ID membership that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdMembership updateActIdMembership(
		com.vnpt.portlet.user.model.ActIdMembership actIdMembership)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdMembershipLocalService.updateActIdMembership(actIdMembership);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _actIdMembershipLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_actIdMembershipLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _actIdMembershipLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ActIdMembershipLocalService getWrappedActIdMembershipLocalService() {
		return _actIdMembershipLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedActIdMembershipLocalService(
		ActIdMembershipLocalService actIdMembershipLocalService) {
		_actIdMembershipLocalService = actIdMembershipLocalService;
	}

	@Override
	public ActIdMembershipLocalService getWrappedService() {
		return _actIdMembershipLocalService;
	}

	@Override
	public void setWrappedService(
		ActIdMembershipLocalService actIdMembershipLocalService) {
		_actIdMembershipLocalService = actIdMembershipLocalService;
	}

	private ActIdMembershipLocalService _actIdMembershipLocalService;
}
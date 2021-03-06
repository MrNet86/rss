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
 * Provides a wrapper for {@link ActIdGroupLocalService}.
 *
 * @author ToanNQ86
 * @see ActIdGroupLocalService
 * @generated
 */
public class ActIdGroupLocalServiceWrapper implements ActIdGroupLocalService,
	ServiceWrapper<ActIdGroupLocalService> {
	public ActIdGroupLocalServiceWrapper(
		ActIdGroupLocalService actIdGroupLocalService) {
		_actIdGroupLocalService = actIdGroupLocalService;
	}

	/**
	* Adds the act ID group to the database. Also notifies the appropriate model listeners.
	*
	* @param actIdGroup the act ID group
	* @return the act ID group that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdGroup addActIdGroup(
		com.vnpt.portlet.user.model.ActIdGroup actIdGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdGroupLocalService.addActIdGroup(actIdGroup);
	}

	/**
	* Creates a new act ID group with the primary key. Does not add the act ID group to the database.
	*
	* @param id the primary key for the new act ID group
	* @return the new act ID group
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdGroup createActIdGroup(
		java.lang.String id) {
		return _actIdGroupLocalService.createActIdGroup(id);
	}

	/**
	* Deletes the act ID group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the act ID group
	* @return the act ID group that was removed
	* @throws PortalException if a act ID group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdGroup deleteActIdGroup(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _actIdGroupLocalService.deleteActIdGroup(id);
	}

	/**
	* Deletes the act ID group from the database. Also notifies the appropriate model listeners.
	*
	* @param actIdGroup the act ID group
	* @return the act ID group that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdGroup deleteActIdGroup(
		com.vnpt.portlet.user.model.ActIdGroup actIdGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdGroupLocalService.deleteActIdGroup(actIdGroup);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _actIdGroupLocalService.dynamicQuery();
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
		return _actIdGroupLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _actIdGroupLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _actIdGroupLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _actIdGroupLocalService.dynamicQueryCount(dynamicQuery);
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
		return _actIdGroupLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.vnpt.portlet.user.model.ActIdGroup fetchActIdGroup(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdGroupLocalService.fetchActIdGroup(id);
	}

	/**
	* Returns the act ID group with the primary key.
	*
	* @param id the primary key of the act ID group
	* @return the act ID group
	* @throws PortalException if a act ID group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdGroup getActIdGroup(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _actIdGroupLocalService.getActIdGroup(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _actIdGroupLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the act ID groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of act ID groups
	* @param end the upper bound of the range of act ID groups (not inclusive)
	* @return the range of act ID groups
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.vnpt.portlet.user.model.ActIdGroup> getActIdGroups(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdGroupLocalService.getActIdGroups(start, end);
	}

	/**
	* Returns the number of act ID groups.
	*
	* @return the number of act ID groups
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getActIdGroupsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdGroupLocalService.getActIdGroupsCount();
	}

	/**
	* Updates the act ID group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param actIdGroup the act ID group
	* @return the act ID group that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdGroup updateActIdGroup(
		com.vnpt.portlet.user.model.ActIdGroup actIdGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdGroupLocalService.updateActIdGroup(actIdGroup);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _actIdGroupLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_actIdGroupLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _actIdGroupLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ActIdGroupLocalService getWrappedActIdGroupLocalService() {
		return _actIdGroupLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedActIdGroupLocalService(
		ActIdGroupLocalService actIdGroupLocalService) {
		_actIdGroupLocalService = actIdGroupLocalService;
	}

	@Override
	public ActIdGroupLocalService getWrappedService() {
		return _actIdGroupLocalService;
	}

	@Override
	public void setWrappedService(ActIdGroupLocalService actIdGroupLocalService) {
		_actIdGroupLocalService = actIdGroupLocalService;
	}

	private ActIdGroupLocalService _actIdGroupLocalService;
}
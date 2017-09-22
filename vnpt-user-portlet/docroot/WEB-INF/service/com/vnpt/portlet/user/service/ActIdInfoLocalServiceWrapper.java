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
 * Provides a wrapper for {@link ActIdInfoLocalService}.
 *
 * @author ToanNQ86
 * @see ActIdInfoLocalService
 * @generated
 */
public class ActIdInfoLocalServiceWrapper implements ActIdInfoLocalService,
	ServiceWrapper<ActIdInfoLocalService> {
	public ActIdInfoLocalServiceWrapper(
		ActIdInfoLocalService actIdInfoLocalService) {
		_actIdInfoLocalService = actIdInfoLocalService;
	}

	/**
	* Adds the act ID info to the database. Also notifies the appropriate model listeners.
	*
	* @param actIdInfo the act ID info
	* @return the act ID info that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdInfo addActIdInfo(
		com.vnpt.portlet.user.model.ActIdInfo actIdInfo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdInfoLocalService.addActIdInfo(actIdInfo);
	}

	/**
	* Creates a new act ID info with the primary key. Does not add the act ID info to the database.
	*
	* @param id the primary key for the new act ID info
	* @return the new act ID info
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdInfo createActIdInfo(long id) {
		return _actIdInfoLocalService.createActIdInfo(id);
	}

	/**
	* Deletes the act ID info with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the act ID info
	* @return the act ID info that was removed
	* @throws PortalException if a act ID info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdInfo deleteActIdInfo(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _actIdInfoLocalService.deleteActIdInfo(id);
	}

	/**
	* Deletes the act ID info from the database. Also notifies the appropriate model listeners.
	*
	* @param actIdInfo the act ID info
	* @return the act ID info that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdInfo deleteActIdInfo(
		com.vnpt.portlet.user.model.ActIdInfo actIdInfo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdInfoLocalService.deleteActIdInfo(actIdInfo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _actIdInfoLocalService.dynamicQuery();
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
		return _actIdInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _actIdInfoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _actIdInfoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _actIdInfoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _actIdInfoLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.vnpt.portlet.user.model.ActIdInfo fetchActIdInfo(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdInfoLocalService.fetchActIdInfo(id);
	}

	/**
	* Returns the act ID info with the primary key.
	*
	* @param id the primary key of the act ID info
	* @return the act ID info
	* @throws PortalException if a act ID info with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdInfo getActIdInfo(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _actIdInfoLocalService.getActIdInfo(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _actIdInfoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the act ID infos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdInfoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of act ID infos
	* @param end the upper bound of the range of act ID infos (not inclusive)
	* @return the range of act ID infos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.vnpt.portlet.user.model.ActIdInfo> getActIdInfos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdInfoLocalService.getActIdInfos(start, end);
	}

	/**
	* Returns the number of act ID infos.
	*
	* @return the number of act ID infos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getActIdInfosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdInfoLocalService.getActIdInfosCount();
	}

	/**
	* Updates the act ID info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param actIdInfo the act ID info
	* @return the act ID info that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.ActIdInfo updateActIdInfo(
		com.vnpt.portlet.user.model.ActIdInfo actIdInfo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _actIdInfoLocalService.updateActIdInfo(actIdInfo);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _actIdInfoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_actIdInfoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _actIdInfoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ActIdInfoLocalService getWrappedActIdInfoLocalService() {
		return _actIdInfoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedActIdInfoLocalService(
		ActIdInfoLocalService actIdInfoLocalService) {
		_actIdInfoLocalService = actIdInfoLocalService;
	}

	@Override
	public ActIdInfoLocalService getWrappedService() {
		return _actIdInfoLocalService;
	}

	@Override
	public void setWrappedService(ActIdInfoLocalService actIdInfoLocalService) {
		_actIdInfoLocalService = actIdInfoLocalService;
	}

	private ActIdInfoLocalService _actIdInfoLocalService;
}
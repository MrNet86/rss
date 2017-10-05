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
 * Provides a wrapper for {@link LiferayDatabaseLocalService}.
 *
 * @author ToanNQ86
 * @see LiferayDatabaseLocalService
 * @generated
 */
public class LiferayDatabaseLocalServiceWrapper
	implements LiferayDatabaseLocalService,
		ServiceWrapper<LiferayDatabaseLocalService> {
	public LiferayDatabaseLocalServiceWrapper(
		LiferayDatabaseLocalService liferayDatabaseLocalService) {
		_liferayDatabaseLocalService = liferayDatabaseLocalService;
	}

	/**
	* Adds the liferay database to the database. Also notifies the appropriate model listeners.
	*
	* @param liferayDatabase the liferay database
	* @return the liferay database that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.LiferayDatabase addLiferayDatabase(
		com.vnpt.portlet.user.model.LiferayDatabase liferayDatabase)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _liferayDatabaseLocalService.addLiferayDatabase(liferayDatabase);
	}

	/**
	* Creates a new liferay database with the primary key. Does not add the liferay database to the database.
	*
	* @param itemFieldId the primary key for the new liferay database
	* @return the new liferay database
	*/
	@Override
	public com.vnpt.portlet.user.model.LiferayDatabase createLiferayDatabase(
		long itemFieldId) {
		return _liferayDatabaseLocalService.createLiferayDatabase(itemFieldId);
	}

	/**
	* Deletes the liferay database with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemFieldId the primary key of the liferay database
	* @return the liferay database that was removed
	* @throws PortalException if a liferay database with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.LiferayDatabase deleteLiferayDatabase(
		long itemFieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _liferayDatabaseLocalService.deleteLiferayDatabase(itemFieldId);
	}

	/**
	* Deletes the liferay database from the database. Also notifies the appropriate model listeners.
	*
	* @param liferayDatabase the liferay database
	* @return the liferay database that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.LiferayDatabase deleteLiferayDatabase(
		com.vnpt.portlet.user.model.LiferayDatabase liferayDatabase)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _liferayDatabaseLocalService.deleteLiferayDatabase(liferayDatabase);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _liferayDatabaseLocalService.dynamicQuery();
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
		return _liferayDatabaseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.LiferayDatabaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _liferayDatabaseLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.LiferayDatabaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _liferayDatabaseLocalService.dynamicQuery(dynamicQuery, start,
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
		return _liferayDatabaseLocalService.dynamicQueryCount(dynamicQuery);
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
		return _liferayDatabaseLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.vnpt.portlet.user.model.LiferayDatabase fetchLiferayDatabase(
		long itemFieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _liferayDatabaseLocalService.fetchLiferayDatabase(itemFieldId);
	}

	/**
	* Returns the liferay database with the primary key.
	*
	* @param itemFieldId the primary key of the liferay database
	* @return the liferay database
	* @throws PortalException if a liferay database with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.LiferayDatabase getLiferayDatabase(
		long itemFieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _liferayDatabaseLocalService.getLiferayDatabase(itemFieldId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _liferayDatabaseLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the liferay databases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.LiferayDatabaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of liferay databases
	* @param end the upper bound of the range of liferay databases (not inclusive)
	* @return the range of liferay databases
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.vnpt.portlet.user.model.LiferayDatabase> getLiferayDatabases(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _liferayDatabaseLocalService.getLiferayDatabases(start, end);
	}

	/**
	* Returns the number of liferay databases.
	*
	* @return the number of liferay databases
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLiferayDatabasesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _liferayDatabaseLocalService.getLiferayDatabasesCount();
	}

	/**
	* Updates the liferay database in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param liferayDatabase the liferay database
	* @return the liferay database that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.LiferayDatabase updateLiferayDatabase(
		com.vnpt.portlet.user.model.LiferayDatabase liferayDatabase)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _liferayDatabaseLocalService.updateLiferayDatabase(liferayDatabase);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _liferayDatabaseLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_liferayDatabaseLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _liferayDatabaseLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.liferay.portal.model.User> findAllUserByGroupAndChild(
		long groupId, int start, int end) {
		return _liferayDatabaseLocalService.findAllUserByGroupAndChild(groupId,
			start, end);
	}

	@Override
	public int countAllUserByGroupAndChild(long groupId) {
		return _liferayDatabaseLocalService.countAllUserByGroupAndChild(groupId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LiferayDatabaseLocalService getWrappedLiferayDatabaseLocalService() {
		return _liferayDatabaseLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLiferayDatabaseLocalService(
		LiferayDatabaseLocalService liferayDatabaseLocalService) {
		_liferayDatabaseLocalService = liferayDatabaseLocalService;
	}

	@Override
	public LiferayDatabaseLocalService getWrappedService() {
		return _liferayDatabaseLocalService;
	}

	@Override
	public void setWrappedService(
		LiferayDatabaseLocalService liferayDatabaseLocalService) {
		_liferayDatabaseLocalService = liferayDatabaseLocalService;
	}

	private LiferayDatabaseLocalService _liferayDatabaseLocalService;
}
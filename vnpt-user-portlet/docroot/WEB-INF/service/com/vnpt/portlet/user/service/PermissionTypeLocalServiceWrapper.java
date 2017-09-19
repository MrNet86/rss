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
 * Provides a wrapper for {@link PermissionTypeLocalService}.
 *
 * @author ToanNQ86
 * @see PermissionTypeLocalService
 * @generated
 */
public class PermissionTypeLocalServiceWrapper
	implements PermissionTypeLocalService,
		ServiceWrapper<PermissionTypeLocalService> {
	public PermissionTypeLocalServiceWrapper(
		PermissionTypeLocalService permissionTypeLocalService) {
		_permissionTypeLocalService = permissionTypeLocalService;
	}

	/**
	* Adds the permission type to the database. Also notifies the appropriate model listeners.
	*
	* @param permissionType the permission type
	* @return the permission type that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.PermissionType addPermissionType(
		com.vnpt.portlet.user.model.PermissionType permissionType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _permissionTypeLocalService.addPermissionType(permissionType);
	}

	/**
	* Creates a new permission type with the primary key. Does not add the permission type to the database.
	*
	* @param permissionTypeId the primary key for the new permission type
	* @return the new permission type
	*/
	@Override
	public com.vnpt.portlet.user.model.PermissionType createPermissionType(
		long permissionTypeId) {
		return _permissionTypeLocalService.createPermissionType(permissionTypeId);
	}

	/**
	* Deletes the permission type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param permissionTypeId the primary key of the permission type
	* @return the permission type that was removed
	* @throws PortalException if a permission type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.PermissionType deletePermissionType(
		long permissionTypeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _permissionTypeLocalService.deletePermissionType(permissionTypeId);
	}

	/**
	* Deletes the permission type from the database. Also notifies the appropriate model listeners.
	*
	* @param permissionType the permission type
	* @return the permission type that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.PermissionType deletePermissionType(
		com.vnpt.portlet.user.model.PermissionType permissionType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _permissionTypeLocalService.deletePermissionType(permissionType);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _permissionTypeLocalService.dynamicQuery();
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
		return _permissionTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _permissionTypeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _permissionTypeLocalService.dynamicQuery(dynamicQuery, start,
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
		return _permissionTypeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _permissionTypeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.vnpt.portlet.user.model.PermissionType fetchPermissionType(
		long permissionTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _permissionTypeLocalService.fetchPermissionType(permissionTypeId);
	}

	/**
	* Returns the permission type with the primary key.
	*
	* @param permissionTypeId the primary key of the permission type
	* @return the permission type
	* @throws PortalException if a permission type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.PermissionType getPermissionType(
		long permissionTypeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _permissionTypeLocalService.getPermissionType(permissionTypeId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _permissionTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the permission types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of permission types
	* @param end the upper bound of the range of permission types (not inclusive)
	* @return the range of permission types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.vnpt.portlet.user.model.PermissionType> getPermissionTypes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _permissionTypeLocalService.getPermissionTypes(start, end);
	}

	/**
	* Returns the number of permission types.
	*
	* @return the number of permission types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPermissionTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _permissionTypeLocalService.getPermissionTypesCount();
	}

	/**
	* Updates the permission type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param permissionType the permission type
	* @return the permission type that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.PermissionType updatePermissionType(
		com.vnpt.portlet.user.model.PermissionType permissionType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _permissionTypeLocalService.updatePermissionType(permissionType);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _permissionTypeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_permissionTypeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _permissionTypeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PermissionTypeLocalService getWrappedPermissionTypeLocalService() {
		return _permissionTypeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPermissionTypeLocalService(
		PermissionTypeLocalService permissionTypeLocalService) {
		_permissionTypeLocalService = permissionTypeLocalService;
	}

	@Override
	public PermissionTypeLocalService getWrappedService() {
		return _permissionTypeLocalService;
	}

	@Override
	public void setWrappedService(
		PermissionTypeLocalService permissionTypeLocalService) {
		_permissionTypeLocalService = permissionTypeLocalService;
	}

	private PermissionTypeLocalService _permissionTypeLocalService;
}
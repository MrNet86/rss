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
 * Provides a wrapper for {@link PermissionGroupLocalService}.
 *
 * @author ToanNQ86
 * @see PermissionGroupLocalService
 * @generated
 */
public class PermissionGroupLocalServiceWrapper
	implements PermissionGroupLocalService,
		ServiceWrapper<PermissionGroupLocalService> {
	public PermissionGroupLocalServiceWrapper(
		PermissionGroupLocalService permissionGroupLocalService) {
		_permissionGroupLocalService = permissionGroupLocalService;
	}

	/**
	* Adds the permission group to the database. Also notifies the appropriate model listeners.
	*
	* @param permissionGroup the permission group
	* @return the permission group that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.PermissionGroup addPermissionGroup(
		com.vnpt.portlet.user.model.PermissionGroup permissionGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _permissionGroupLocalService.addPermissionGroup(permissionGroup);
	}

	/**
	* Creates a new permission group with the primary key. Does not add the permission group to the database.
	*
	* @param permissionGroupId the primary key for the new permission group
	* @return the new permission group
	*/
	@Override
	public com.vnpt.portlet.user.model.PermissionGroup createPermissionGroup(
		long permissionGroupId) {
		return _permissionGroupLocalService.createPermissionGroup(permissionGroupId);
	}

	/**
	* Deletes the permission group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param permissionGroupId the primary key of the permission group
	* @return the permission group that was removed
	* @throws PortalException if a permission group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.PermissionGroup deletePermissionGroup(
		long permissionGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _permissionGroupLocalService.deletePermissionGroup(permissionGroupId);
	}

	/**
	* Deletes the permission group from the database. Also notifies the appropriate model listeners.
	*
	* @param permissionGroup the permission group
	* @return the permission group that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.PermissionGroup deletePermissionGroup(
		com.vnpt.portlet.user.model.PermissionGroup permissionGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _permissionGroupLocalService.deletePermissionGroup(permissionGroup);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _permissionGroupLocalService.dynamicQuery();
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
		return _permissionGroupLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _permissionGroupLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _permissionGroupLocalService.dynamicQuery(dynamicQuery, start,
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
		return _permissionGroupLocalService.dynamicQueryCount(dynamicQuery);
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
		return _permissionGroupLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.vnpt.portlet.user.model.PermissionGroup fetchPermissionGroup(
		long permissionGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _permissionGroupLocalService.fetchPermissionGroup(permissionGroupId);
	}

	/**
	* Returns the permission group with the primary key.
	*
	* @param permissionGroupId the primary key of the permission group
	* @return the permission group
	* @throws PortalException if a permission group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.PermissionGroup getPermissionGroup(
		long permissionGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _permissionGroupLocalService.getPermissionGroup(permissionGroupId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _permissionGroupLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the permission groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.PermissionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of permission groups
	* @param end the upper bound of the range of permission groups (not inclusive)
	* @return the range of permission groups
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.vnpt.portlet.user.model.PermissionGroup> getPermissionGroups(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _permissionGroupLocalService.getPermissionGroups(start, end);
	}

	/**
	* Returns the number of permission groups.
	*
	* @return the number of permission groups
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPermissionGroupsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _permissionGroupLocalService.getPermissionGroupsCount();
	}

	/**
	* Updates the permission group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param permissionGroup the permission group
	* @return the permission group that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.PermissionGroup updatePermissionGroup(
		com.vnpt.portlet.user.model.PermissionGroup permissionGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _permissionGroupLocalService.updatePermissionGroup(permissionGroup);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _permissionGroupLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_permissionGroupLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _permissionGroupLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PermissionGroupLocalService getWrappedPermissionGroupLocalService() {
		return _permissionGroupLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPermissionGroupLocalService(
		PermissionGroupLocalService permissionGroupLocalService) {
		_permissionGroupLocalService = permissionGroupLocalService;
	}

	@Override
	public PermissionGroupLocalService getWrappedService() {
		return _permissionGroupLocalService;
	}

	@Override
	public void setWrappedService(
		PermissionGroupLocalService permissionGroupLocalService) {
		_permissionGroupLocalService = permissionGroupLocalService;
	}

	private PermissionGroupLocalService _permissionGroupLocalService;
}
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
 * Provides a wrapper for {@link GroupUsersLocalService}.
 *
 * @author ToanNQ86
 * @see GroupUsersLocalService
 * @generated
 */
public class GroupUsersLocalServiceWrapper implements GroupUsersLocalService,
	ServiceWrapper<GroupUsersLocalService> {
	public GroupUsersLocalServiceWrapper(
		GroupUsersLocalService groupUsersLocalService) {
		_groupUsersLocalService = groupUsersLocalService;
	}

	/**
	* Adds the group users to the database. Also notifies the appropriate model listeners.
	*
	* @param groupUsers the group users
	* @return the group users that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.GroupUsers addGroupUsers(
		com.vnpt.portlet.user.model.GroupUsers groupUsers)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _groupUsersLocalService.addGroupUsers(groupUsers);
	}

	/**
	* Creates a new group users with the primary key. Does not add the group users to the database.
	*
	* @param groupUsersPK the primary key for the new group users
	* @return the new group users
	*/
	@Override
	public com.vnpt.portlet.user.model.GroupUsers createGroupUsers(
		com.vnpt.portlet.user.service.persistence.GroupUsersPK groupUsersPK) {
		return _groupUsersLocalService.createGroupUsers(groupUsersPK);
	}

	/**
	* Deletes the group users with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param groupUsersPK the primary key of the group users
	* @return the group users that was removed
	* @throws PortalException if a group users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.GroupUsers deleteGroupUsers(
		com.vnpt.portlet.user.service.persistence.GroupUsersPK groupUsersPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _groupUsersLocalService.deleteGroupUsers(groupUsersPK);
	}

	/**
	* Deletes the group users from the database. Also notifies the appropriate model listeners.
	*
	* @param groupUsers the group users
	* @return the group users that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.GroupUsers deleteGroupUsers(
		com.vnpt.portlet.user.model.GroupUsers groupUsers)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _groupUsersLocalService.deleteGroupUsers(groupUsers);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _groupUsersLocalService.dynamicQuery();
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
		return _groupUsersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupUsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _groupUsersLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupUsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _groupUsersLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _groupUsersLocalService.dynamicQueryCount(dynamicQuery);
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
		return _groupUsersLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.vnpt.portlet.user.model.GroupUsers fetchGroupUsers(
		com.vnpt.portlet.user.service.persistence.GroupUsersPK groupUsersPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _groupUsersLocalService.fetchGroupUsers(groupUsersPK);
	}

	/**
	* Returns the group users with the primary key.
	*
	* @param groupUsersPK the primary key of the group users
	* @return the group users
	* @throws PortalException if a group users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.GroupUsers getGroupUsers(
		com.vnpt.portlet.user.service.persistence.GroupUsersPK groupUsersPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _groupUsersLocalService.getGroupUsers(groupUsersPK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _groupUsersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the group userses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupUsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of group userses
	* @param end the upper bound of the range of group userses (not inclusive)
	* @return the range of group userses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.vnpt.portlet.user.model.GroupUsers> getGroupUserses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _groupUsersLocalService.getGroupUserses(start, end);
	}

	/**
	* Returns the number of group userses.
	*
	* @return the number of group userses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getGroupUsersesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _groupUsersLocalService.getGroupUsersesCount();
	}

	/**
	* Updates the group users in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param groupUsers the group users
	* @return the group users that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vnpt.portlet.user.model.GroupUsers updateGroupUsers(
		com.vnpt.portlet.user.model.GroupUsers groupUsers)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _groupUsersLocalService.updateGroupUsers(groupUsers);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _groupUsersLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_groupUsersLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _groupUsersLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.liferay.portal.model.User> getUserByPermissionGroupId(
		long permissionGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _groupUsersLocalService.getUserByPermissionGroupId(permissionGroupId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public GroupUsersLocalService getWrappedGroupUsersLocalService() {
		return _groupUsersLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedGroupUsersLocalService(
		GroupUsersLocalService groupUsersLocalService) {
		_groupUsersLocalService = groupUsersLocalService;
	}

	@Override
	public GroupUsersLocalService getWrappedService() {
		return _groupUsersLocalService;
	}

	@Override
	public void setWrappedService(GroupUsersLocalService groupUsersLocalService) {
		_groupUsersLocalService = groupUsersLocalService;
	}

	private GroupUsersLocalService _groupUsersLocalService;
}
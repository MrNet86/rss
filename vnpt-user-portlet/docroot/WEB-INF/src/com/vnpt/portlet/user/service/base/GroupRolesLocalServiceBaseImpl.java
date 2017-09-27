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

package com.vnpt.portlet.user.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.vnpt.portlet.user.model.GroupRoles;
import com.vnpt.portlet.user.service.GroupRolesLocalService;
import com.vnpt.portlet.user.service.persistence.ActIdGroupPersistence;
import com.vnpt.portlet.user.service.persistence.ActIdInfoPersistence;
import com.vnpt.portlet.user.service.persistence.ActIdMembershipPersistence;
import com.vnpt.portlet.user.service.persistence.ActIdUserPersistence;
import com.vnpt.portlet.user.service.persistence.GroupRolesPK;
import com.vnpt.portlet.user.service.persistence.GroupRolesPersistence;
import com.vnpt.portlet.user.service.persistence.GroupUsersPersistence;
import com.vnpt.portlet.user.service.persistence.PermissionGroupPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the group roles local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.vnpt.portlet.user.service.impl.GroupRolesLocalServiceImpl}.
 * </p>
 *
 * @author ToanNQ86
 * @see com.vnpt.portlet.user.service.impl.GroupRolesLocalServiceImpl
 * @see com.vnpt.portlet.user.service.GroupRolesLocalServiceUtil
 * @generated
 */
public abstract class GroupRolesLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements GroupRolesLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.vnpt.portlet.user.service.GroupRolesLocalServiceUtil} to access the group roles local service.
	 */

	/**
	 * Adds the group roles to the database. Also notifies the appropriate model listeners.
	 *
	 * @param groupRoles the group roles
	 * @return the group roles that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public GroupRoles addGroupRoles(GroupRoles groupRoles)
		throws SystemException {
		groupRoles.setNew(true);

		return groupRolesPersistence.update(groupRoles);
	}

	/**
	 * Creates a new group roles with the primary key. Does not add the group roles to the database.
	 *
	 * @param groupRolesPK the primary key for the new group roles
	 * @return the new group roles
	 */
	@Override
	public GroupRoles createGroupRoles(GroupRolesPK groupRolesPK) {
		return groupRolesPersistence.create(groupRolesPK);
	}

	/**
	 * Deletes the group roles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param groupRolesPK the primary key of the group roles
	 * @return the group roles that was removed
	 * @throws PortalException if a group roles with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public GroupRoles deleteGroupRoles(GroupRolesPK groupRolesPK)
		throws PortalException, SystemException {
		return groupRolesPersistence.remove(groupRolesPK);
	}

	/**
	 * Deletes the group roles from the database. Also notifies the appropriate model listeners.
	 *
	 * @param groupRoles the group roles
	 * @return the group roles that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public GroupRoles deleteGroupRoles(GroupRoles groupRoles)
		throws SystemException {
		return groupRolesPersistence.remove(groupRoles);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(GroupRoles.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return groupRolesPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupRolesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return groupRolesPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupRolesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return groupRolesPersistence.findWithDynamicQuery(dynamicQuery, start,
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return groupRolesPersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return groupRolesPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public GroupRoles fetchGroupRoles(GroupRolesPK groupRolesPK)
		throws SystemException {
		return groupRolesPersistence.fetchByPrimaryKey(groupRolesPK);
	}

	/**
	 * Returns the group roles with the primary key.
	 *
	 * @param groupRolesPK the primary key of the group roles
	 * @return the group roles
	 * @throws PortalException if a group roles with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GroupRoles getGroupRoles(GroupRolesPK groupRolesPK)
		throws PortalException, SystemException {
		return groupRolesPersistence.findByPrimaryKey(groupRolesPK);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return groupRolesPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the group roleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.GroupRolesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of group roleses
	 * @param end the upper bound of the range of group roleses (not inclusive)
	 * @return the range of group roleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GroupRoles> getGroupRoleses(int start, int end)
		throws SystemException {
		return groupRolesPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of group roleses.
	 *
	 * @return the number of group roleses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getGroupRolesesCount() throws SystemException {
		return groupRolesPersistence.countAll();
	}

	/**
	 * Updates the group roles in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param groupRoles the group roles
	 * @return the group roles that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public GroupRoles updateGroupRoles(GroupRoles groupRoles)
		throws SystemException {
		return groupRolesPersistence.update(groupRoles);
	}

	/**
	 * Returns the act ID group local service.
	 *
	 * @return the act ID group local service
	 */
	public com.vnpt.portlet.user.service.ActIdGroupLocalService getActIdGroupLocalService() {
		return actIdGroupLocalService;
	}

	/**
	 * Sets the act ID group local service.
	 *
	 * @param actIdGroupLocalService the act ID group local service
	 */
	public void setActIdGroupLocalService(
		com.vnpt.portlet.user.service.ActIdGroupLocalService actIdGroupLocalService) {
		this.actIdGroupLocalService = actIdGroupLocalService;
	}

	/**
	 * Returns the act ID group persistence.
	 *
	 * @return the act ID group persistence
	 */
	public ActIdGroupPersistence getActIdGroupPersistence() {
		return actIdGroupPersistence;
	}

	/**
	 * Sets the act ID group persistence.
	 *
	 * @param actIdGroupPersistence the act ID group persistence
	 */
	public void setActIdGroupPersistence(
		ActIdGroupPersistence actIdGroupPersistence) {
		this.actIdGroupPersistence = actIdGroupPersistence;
	}

	/**
	 * Returns the act ID info local service.
	 *
	 * @return the act ID info local service
	 */
	public com.vnpt.portlet.user.service.ActIdInfoLocalService getActIdInfoLocalService() {
		return actIdInfoLocalService;
	}

	/**
	 * Sets the act ID info local service.
	 *
	 * @param actIdInfoLocalService the act ID info local service
	 */
	public void setActIdInfoLocalService(
		com.vnpt.portlet.user.service.ActIdInfoLocalService actIdInfoLocalService) {
		this.actIdInfoLocalService = actIdInfoLocalService;
	}

	/**
	 * Returns the act ID info persistence.
	 *
	 * @return the act ID info persistence
	 */
	public ActIdInfoPersistence getActIdInfoPersistence() {
		return actIdInfoPersistence;
	}

	/**
	 * Sets the act ID info persistence.
	 *
	 * @param actIdInfoPersistence the act ID info persistence
	 */
	public void setActIdInfoPersistence(
		ActIdInfoPersistence actIdInfoPersistence) {
		this.actIdInfoPersistence = actIdInfoPersistence;
	}

	/**
	 * Returns the act ID membership local service.
	 *
	 * @return the act ID membership local service
	 */
	public com.vnpt.portlet.user.service.ActIdMembershipLocalService getActIdMembershipLocalService() {
		return actIdMembershipLocalService;
	}

	/**
	 * Sets the act ID membership local service.
	 *
	 * @param actIdMembershipLocalService the act ID membership local service
	 */
	public void setActIdMembershipLocalService(
		com.vnpt.portlet.user.service.ActIdMembershipLocalService actIdMembershipLocalService) {
		this.actIdMembershipLocalService = actIdMembershipLocalService;
	}

	/**
	 * Returns the act ID membership persistence.
	 *
	 * @return the act ID membership persistence
	 */
	public ActIdMembershipPersistence getActIdMembershipPersistence() {
		return actIdMembershipPersistence;
	}

	/**
	 * Sets the act ID membership persistence.
	 *
	 * @param actIdMembershipPersistence the act ID membership persistence
	 */
	public void setActIdMembershipPersistence(
		ActIdMembershipPersistence actIdMembershipPersistence) {
		this.actIdMembershipPersistence = actIdMembershipPersistence;
	}

	/**
	 * Returns the act ID user local service.
	 *
	 * @return the act ID user local service
	 */
	public com.vnpt.portlet.user.service.ActIdUserLocalService getActIdUserLocalService() {
		return actIdUserLocalService;
	}

	/**
	 * Sets the act ID user local service.
	 *
	 * @param actIdUserLocalService the act ID user local service
	 */
	public void setActIdUserLocalService(
		com.vnpt.portlet.user.service.ActIdUserLocalService actIdUserLocalService) {
		this.actIdUserLocalService = actIdUserLocalService;
	}

	/**
	 * Returns the act ID user persistence.
	 *
	 * @return the act ID user persistence
	 */
	public ActIdUserPersistence getActIdUserPersistence() {
		return actIdUserPersistence;
	}

	/**
	 * Sets the act ID user persistence.
	 *
	 * @param actIdUserPersistence the act ID user persistence
	 */
	public void setActIdUserPersistence(
		ActIdUserPersistence actIdUserPersistence) {
		this.actIdUserPersistence = actIdUserPersistence;
	}

	/**
	 * Returns the group roles local service.
	 *
	 * @return the group roles local service
	 */
	public com.vnpt.portlet.user.service.GroupRolesLocalService getGroupRolesLocalService() {
		return groupRolesLocalService;
	}

	/**
	 * Sets the group roles local service.
	 *
	 * @param groupRolesLocalService the group roles local service
	 */
	public void setGroupRolesLocalService(
		com.vnpt.portlet.user.service.GroupRolesLocalService groupRolesLocalService) {
		this.groupRolesLocalService = groupRolesLocalService;
	}

	/**
	 * Returns the group roles persistence.
	 *
	 * @return the group roles persistence
	 */
	public GroupRolesPersistence getGroupRolesPersistence() {
		return groupRolesPersistence;
	}

	/**
	 * Sets the group roles persistence.
	 *
	 * @param groupRolesPersistence the group roles persistence
	 */
	public void setGroupRolesPersistence(
		GroupRolesPersistence groupRolesPersistence) {
		this.groupRolesPersistence = groupRolesPersistence;
	}

	/**
	 * Returns the group users local service.
	 *
	 * @return the group users local service
	 */
	public com.vnpt.portlet.user.service.GroupUsersLocalService getGroupUsersLocalService() {
		return groupUsersLocalService;
	}

	/**
	 * Sets the group users local service.
	 *
	 * @param groupUsersLocalService the group users local service
	 */
	public void setGroupUsersLocalService(
		com.vnpt.portlet.user.service.GroupUsersLocalService groupUsersLocalService) {
		this.groupUsersLocalService = groupUsersLocalService;
	}

	/**
	 * Returns the group users persistence.
	 *
	 * @return the group users persistence
	 */
	public GroupUsersPersistence getGroupUsersPersistence() {
		return groupUsersPersistence;
	}

	/**
	 * Sets the group users persistence.
	 *
	 * @param groupUsersPersistence the group users persistence
	 */
	public void setGroupUsersPersistence(
		GroupUsersPersistence groupUsersPersistence) {
		this.groupUsersPersistence = groupUsersPersistence;
	}

	/**
	 * Returns the permission group local service.
	 *
	 * @return the permission group local service
	 */
	public com.vnpt.portlet.user.service.PermissionGroupLocalService getPermissionGroupLocalService() {
		return permissionGroupLocalService;
	}

	/**
	 * Sets the permission group local service.
	 *
	 * @param permissionGroupLocalService the permission group local service
	 */
	public void setPermissionGroupLocalService(
		com.vnpt.portlet.user.service.PermissionGroupLocalService permissionGroupLocalService) {
		this.permissionGroupLocalService = permissionGroupLocalService;
	}

	/**
	 * Returns the permission group persistence.
	 *
	 * @return the permission group persistence
	 */
	public PermissionGroupPersistence getPermissionGroupPersistence() {
		return permissionGroupPersistence;
	}

	/**
	 * Sets the permission group persistence.
	 *
	 * @param permissionGroupPersistence the permission group persistence
	 */
	public void setPermissionGroupPersistence(
		PermissionGroupPersistence permissionGroupPersistence) {
		this.permissionGroupPersistence = permissionGroupPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.vnpt.portlet.user.model.GroupRoles",
			groupRolesLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.vnpt.portlet.user.model.GroupRoles");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return GroupRoles.class;
	}

	protected String getModelClassName() {
		return GroupRoles.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = groupRolesPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.vnpt.portlet.user.service.ActIdGroupLocalService.class)
	protected com.vnpt.portlet.user.service.ActIdGroupLocalService actIdGroupLocalService;
	@BeanReference(type = ActIdGroupPersistence.class)
	protected ActIdGroupPersistence actIdGroupPersistence;
	@BeanReference(type = com.vnpt.portlet.user.service.ActIdInfoLocalService.class)
	protected com.vnpt.portlet.user.service.ActIdInfoLocalService actIdInfoLocalService;
	@BeanReference(type = ActIdInfoPersistence.class)
	protected ActIdInfoPersistence actIdInfoPersistence;
	@BeanReference(type = com.vnpt.portlet.user.service.ActIdMembershipLocalService.class)
	protected com.vnpt.portlet.user.service.ActIdMembershipLocalService actIdMembershipLocalService;
	@BeanReference(type = ActIdMembershipPersistence.class)
	protected ActIdMembershipPersistence actIdMembershipPersistence;
	@BeanReference(type = com.vnpt.portlet.user.service.ActIdUserLocalService.class)
	protected com.vnpt.portlet.user.service.ActIdUserLocalService actIdUserLocalService;
	@BeanReference(type = ActIdUserPersistence.class)
	protected ActIdUserPersistence actIdUserPersistence;
	@BeanReference(type = com.vnpt.portlet.user.service.GroupRolesLocalService.class)
	protected com.vnpt.portlet.user.service.GroupRolesLocalService groupRolesLocalService;
	@BeanReference(type = GroupRolesPersistence.class)
	protected GroupRolesPersistence groupRolesPersistence;
	@BeanReference(type = com.vnpt.portlet.user.service.GroupUsersLocalService.class)
	protected com.vnpt.portlet.user.service.GroupUsersLocalService groupUsersLocalService;
	@BeanReference(type = GroupUsersPersistence.class)
	protected GroupUsersPersistence groupUsersPersistence;
	@BeanReference(type = com.vnpt.portlet.user.service.PermissionGroupLocalService.class)
	protected com.vnpt.portlet.user.service.PermissionGroupLocalService permissionGroupLocalService;
	@BeanReference(type = PermissionGroupPersistence.class)
	protected PermissionGroupPersistence permissionGroupPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private GroupRolesLocalServiceClpInvoker _clpInvoker = new GroupRolesLocalServiceClpInvoker();
}
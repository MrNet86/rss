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

package com.vnpt.portlet.user.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.vnpt.portlet.user.model.ActIdGroup;

/**
 * The persistence interface for the act ID group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see ActIdGroupPersistenceImpl
 * @see ActIdGroupUtil
 * @generated
 */
public interface ActIdGroupPersistence extends BasePersistence<ActIdGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ActIdGroupUtil} to access the act ID group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the act ID group in the entity cache if it is enabled.
	*
	* @param actIdGroup the act ID group
	*/
	public void cacheResult(com.vnpt.portlet.user.model.ActIdGroup actIdGroup);

	/**
	* Caches the act ID groups in the entity cache if it is enabled.
	*
	* @param actIdGroups the act ID groups
	*/
	public void cacheResult(
		java.util.List<com.vnpt.portlet.user.model.ActIdGroup> actIdGroups);

	/**
	* Creates a new act ID group with the primary key. Does not add the act ID group to the database.
	*
	* @param id the primary key for the new act ID group
	* @return the new act ID group
	*/
	public com.vnpt.portlet.user.model.ActIdGroup create(java.lang.String id);

	/**
	* Removes the act ID group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the act ID group
	* @return the act ID group that was removed
	* @throws com.vnpt.portlet.user.NoSuchActIdGroupException if a act ID group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.ActIdGroup remove(java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchActIdGroupException;

	public com.vnpt.portlet.user.model.ActIdGroup updateImpl(
		com.vnpt.portlet.user.model.ActIdGroup actIdGroup)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the act ID group with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchActIdGroupException} if it could not be found.
	*
	* @param id the primary key of the act ID group
	* @return the act ID group
	* @throws com.vnpt.portlet.user.NoSuchActIdGroupException if a act ID group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.ActIdGroup findByPrimaryKey(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchActIdGroupException;

	/**
	* Returns the act ID group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the act ID group
	* @return the act ID group, or <code>null</code> if a act ID group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.ActIdGroup fetchByPrimaryKey(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the act ID groups.
	*
	* @return the act ID groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vnpt.portlet.user.model.ActIdGroup> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vnpt.portlet.user.model.ActIdGroup> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the act ID groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of act ID groups
	* @param end the upper bound of the range of act ID groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of act ID groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vnpt.portlet.user.model.ActIdGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the act ID groups from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of act ID groups.
	*
	* @return the number of act ID groups
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
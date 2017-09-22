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

import com.vnpt.portlet.user.model.ActIdUser;

/**
 * The persistence interface for the act ID user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ToanNQ86
 * @see ActIdUserPersistenceImpl
 * @see ActIdUserUtil
 * @generated
 */
public interface ActIdUserPersistence extends BasePersistence<ActIdUser> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ActIdUserUtil} to access the act ID user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the act ID user in the entity cache if it is enabled.
	*
	* @param actIdUser the act ID user
	*/
	public void cacheResult(com.vnpt.portlet.user.model.ActIdUser actIdUser);

	/**
	* Caches the act ID users in the entity cache if it is enabled.
	*
	* @param actIdUsers the act ID users
	*/
	public void cacheResult(
		java.util.List<com.vnpt.portlet.user.model.ActIdUser> actIdUsers);

	/**
	* Creates a new act ID user with the primary key. Does not add the act ID user to the database.
	*
	* @param id the primary key for the new act ID user
	* @return the new act ID user
	*/
	public com.vnpt.portlet.user.model.ActIdUser create(java.lang.String id);

	/**
	* Removes the act ID user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the act ID user
	* @return the act ID user that was removed
	* @throws com.vnpt.portlet.user.NoSuchActIdUserException if a act ID user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.ActIdUser remove(java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchActIdUserException;

	public com.vnpt.portlet.user.model.ActIdUser updateImpl(
		com.vnpt.portlet.user.model.ActIdUser actIdUser)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the act ID user with the primary key or throws a {@link com.vnpt.portlet.user.NoSuchActIdUserException} if it could not be found.
	*
	* @param id the primary key of the act ID user
	* @return the act ID user
	* @throws com.vnpt.portlet.user.NoSuchActIdUserException if a act ID user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.ActIdUser findByPrimaryKey(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vnpt.portlet.user.NoSuchActIdUserException;

	/**
	* Returns the act ID user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the act ID user
	* @return the act ID user, or <code>null</code> if a act ID user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vnpt.portlet.user.model.ActIdUser fetchByPrimaryKey(
		java.lang.String id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the act ID users.
	*
	* @return the act ID users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vnpt.portlet.user.model.ActIdUser> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the act ID users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of act ID users
	* @param end the upper bound of the range of act ID users (not inclusive)
	* @return the range of act ID users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vnpt.portlet.user.model.ActIdUser> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the act ID users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vnpt.portlet.user.model.impl.ActIdUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of act ID users
	* @param end the upper bound of the range of act ID users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of act ID users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vnpt.portlet.user.model.ActIdUser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the act ID users from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of act ID users.
	*
	* @return the number of act ID users
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
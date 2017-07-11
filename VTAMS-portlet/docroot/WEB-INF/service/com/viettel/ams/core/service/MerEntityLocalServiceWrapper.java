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

package com.viettel.ams.core.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MerEntityLocalService}.
 *
 * @author MrNet
 * @see MerEntityLocalService
 * @generated
 */
public class MerEntityLocalServiceWrapper implements MerEntityLocalService,
	ServiceWrapper<MerEntityLocalService> {
	public MerEntityLocalServiceWrapper(
		MerEntityLocalService merEntityLocalService) {
		_merEntityLocalService = merEntityLocalService;
	}

	/**
	* Adds the mer entity to the database. Also notifies the appropriate model listeners.
	*
	* @param merEntity the mer entity
	* @return the mer entity that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.MerEntity addMerEntity(
		com.viettel.ams.core.model.MerEntity merEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _merEntityLocalService.addMerEntity(merEntity);
	}

	/**
	* Creates a new mer entity with the primary key. Does not add the mer entity to the database.
	*
	* @param merEntityId the primary key for the new mer entity
	* @return the new mer entity
	*/
	@Override
	public com.viettel.ams.core.model.MerEntity createMerEntity(
		long merEntityId) {
		return _merEntityLocalService.createMerEntity(merEntityId);
	}

	/**
	* Deletes the mer entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param merEntityId the primary key of the mer entity
	* @return the mer entity that was removed
	* @throws PortalException if a mer entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.MerEntity deleteMerEntity(
		long merEntityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _merEntityLocalService.deleteMerEntity(merEntityId);
	}

	/**
	* Deletes the mer entity from the database. Also notifies the appropriate model listeners.
	*
	* @param merEntity the mer entity
	* @return the mer entity that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.MerEntity deleteMerEntity(
		com.viettel.ams.core.model.MerEntity merEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _merEntityLocalService.deleteMerEntity(merEntity);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _merEntityLocalService.dynamicQuery();
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
		return _merEntityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.MerEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _merEntityLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.MerEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _merEntityLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _merEntityLocalService.dynamicQueryCount(dynamicQuery);
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
		return _merEntityLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.viettel.ams.core.model.MerEntity fetchMerEntity(long merEntityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _merEntityLocalService.fetchMerEntity(merEntityId);
	}

	/**
	* Returns the mer entity with the primary key.
	*
	* @param merEntityId the primary key of the mer entity
	* @return the mer entity
	* @throws PortalException if a mer entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.MerEntity getMerEntity(long merEntityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _merEntityLocalService.getMerEntity(merEntityId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _merEntityLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the mer entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.MerEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mer entities
	* @param end the upper bound of the range of mer entities (not inclusive)
	* @return the range of mer entities
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.viettel.ams.core.model.MerEntity> getMerEntities(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _merEntityLocalService.getMerEntities(start, end);
	}

	/**
	* Returns the number of mer entities.
	*
	* @return the number of mer entities
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getMerEntitiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _merEntityLocalService.getMerEntitiesCount();
	}

	/**
	* Updates the mer entity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param merEntity the mer entity
	* @return the mer entity that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.MerEntity updateMerEntity(
		com.viettel.ams.core.model.MerEntity merEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _merEntityLocalService.updateMerEntity(merEntity);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _merEntityLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_merEntityLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _merEntityLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List searchMerEntities(
		com.liferay.portal.kernel.dao.search.SearchContainer searchContainer,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _merEntityLocalService.searchMerEntities(searchContainer, start,
			end);
	}

	@Override
	public int countMerEntities(
		com.liferay.portal.kernel.dao.search.SearchContainer searchContainer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _merEntityLocalService.countMerEntities(searchContainer);
	}

	@Override
	public java.util.List<com.viettel.ams.core.model.MerEntity> getMerEntities(
		long[] merIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _merEntityLocalService.getMerEntities(merIds);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MerEntityLocalService getWrappedMerEntityLocalService() {
		return _merEntityLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMerEntityLocalService(
		MerEntityLocalService merEntityLocalService) {
		_merEntityLocalService = merEntityLocalService;
	}

	@Override
	public MerEntityLocalService getWrappedService() {
		return _merEntityLocalService;
	}

	@Override
	public void setWrappedService(MerEntityLocalService merEntityLocalService) {
		_merEntityLocalService = merEntityLocalService;
	}

	private MerEntityLocalService _merEntityLocalService;
}
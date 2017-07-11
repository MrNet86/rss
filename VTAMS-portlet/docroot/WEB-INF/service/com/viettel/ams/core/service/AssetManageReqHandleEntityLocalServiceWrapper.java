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
 * Provides a wrapper for {@link AssetManageReqHandleEntityLocalService}.
 *
 * @author MrNet
 * @see AssetManageReqHandleEntityLocalService
 * @generated
 */
public class AssetManageReqHandleEntityLocalServiceWrapper
	implements AssetManageReqHandleEntityLocalService,
		ServiceWrapper<AssetManageReqHandleEntityLocalService> {
	public AssetManageReqHandleEntityLocalServiceWrapper(
		AssetManageReqHandleEntityLocalService assetManageReqHandleEntityLocalService) {
		_assetManageReqHandleEntityLocalService = assetManageReqHandleEntityLocalService;
	}

	/**
	* Adds the asset manage req handle entity to the database. Also notifies the appropriate model listeners.
	*
	* @param assetManageReqHandleEntity the asset manage req handle entity
	* @return the asset manage req handle entity that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqHandleEntity addAssetManageReqHandleEntity(
		com.viettel.ams.core.model.AssetManageReqHandleEntity assetManageReqHandleEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleEntityLocalService.addAssetManageReqHandleEntity(assetManageReqHandleEntity);
	}

	/**
	* Creates a new asset manage req handle entity with the primary key. Does not add the asset manage req handle entity to the database.
	*
	* @param id the primary key for the new asset manage req handle entity
	* @return the new asset manage req handle entity
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqHandleEntity createAssetManageReqHandleEntity(
		long id) {
		return _assetManageReqHandleEntityLocalService.createAssetManageReqHandleEntity(id);
	}

	/**
	* Deletes the asset manage req handle entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the asset manage req handle entity
	* @return the asset manage req handle entity that was removed
	* @throws PortalException if a asset manage req handle entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqHandleEntity deleteAssetManageReqHandleEntity(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleEntityLocalService.deleteAssetManageReqHandleEntity(id);
	}

	/**
	* Deletes the asset manage req handle entity from the database. Also notifies the appropriate model listeners.
	*
	* @param assetManageReqHandleEntity the asset manage req handle entity
	* @return the asset manage req handle entity that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqHandleEntity deleteAssetManageReqHandleEntity(
		com.viettel.ams.core.model.AssetManageReqHandleEntity assetManageReqHandleEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleEntityLocalService.deleteAssetManageReqHandleEntity(assetManageReqHandleEntity);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assetManageReqHandleEntityLocalService.dynamicQuery();
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
		return _assetManageReqHandleEntityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqHandleEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assetManageReqHandleEntityLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqHandleEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assetManageReqHandleEntityLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _assetManageReqHandleEntityLocalService.dynamicQueryCount(dynamicQuery);
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
		return _assetManageReqHandleEntityLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.viettel.ams.core.model.AssetManageReqHandleEntity fetchAssetManageReqHandleEntity(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleEntityLocalService.fetchAssetManageReqHandleEntity(id);
	}

	/**
	* Returns the asset manage req handle entity with the primary key.
	*
	* @param id the primary key of the asset manage req handle entity
	* @return the asset manage req handle entity
	* @throws PortalException if a asset manage req handle entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqHandleEntity getAssetManageReqHandleEntity(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleEntityLocalService.getAssetManageReqHandleEntity(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleEntityLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the asset manage req handle entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqHandleEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset manage req handle entities
	* @param end the upper bound of the range of asset manage req handle entities (not inclusive)
	* @return the range of asset manage req handle entities
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.viettel.ams.core.model.AssetManageReqHandleEntity> getAssetManageReqHandleEntities(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleEntityLocalService.getAssetManageReqHandleEntities(start,
			end);
	}

	/**
	* Returns the number of asset manage req handle entities.
	*
	* @return the number of asset manage req handle entities
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAssetManageReqHandleEntitiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleEntityLocalService.getAssetManageReqHandleEntitiesCount();
	}

	/**
	* Updates the asset manage req handle entity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assetManageReqHandleEntity the asset manage req handle entity
	* @return the asset manage req handle entity that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqHandleEntity updateAssetManageReqHandleEntity(
		com.viettel.ams.core.model.AssetManageReqHandleEntity assetManageReqHandleEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleEntityLocalService.updateAssetManageReqHandleEntity(assetManageReqHandleEntity);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assetManageReqHandleEntityLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assetManageReqHandleEntityLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assetManageReqHandleEntityLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssetManageReqHandleEntityLocalService getWrappedAssetManageReqHandleEntityLocalService() {
		return _assetManageReqHandleEntityLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssetManageReqHandleEntityLocalService(
		AssetManageReqHandleEntityLocalService assetManageReqHandleEntityLocalService) {
		_assetManageReqHandleEntityLocalService = assetManageReqHandleEntityLocalService;
	}

	@Override
	public AssetManageReqHandleEntityLocalService getWrappedService() {
		return _assetManageReqHandleEntityLocalService;
	}

	@Override
	public void setWrappedService(
		AssetManageReqHandleEntityLocalService assetManageReqHandleEntityLocalService) {
		_assetManageReqHandleEntityLocalService = assetManageReqHandleEntityLocalService;
	}

	private AssetManageReqHandleEntityLocalService _assetManageReqHandleEntityLocalService;
}
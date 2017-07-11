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
 * Provides a wrapper for {@link AssetManageReqEntityLocalService}.
 *
 * @author MrNet
 * @see AssetManageReqEntityLocalService
 * @generated
 */
public class AssetManageReqEntityLocalServiceWrapper
	implements AssetManageReqEntityLocalService,
		ServiceWrapper<AssetManageReqEntityLocalService> {
	public AssetManageReqEntityLocalServiceWrapper(
		AssetManageReqEntityLocalService assetManageReqEntityLocalService) {
		_assetManageReqEntityLocalService = assetManageReqEntityLocalService;
	}

	/**
	* Adds the asset manage req entity to the database. Also notifies the appropriate model listeners.
	*
	* @param assetManageReqEntity the asset manage req entity
	* @return the asset manage req entity that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqEntity addAssetManageReqEntity(
		com.viettel.ams.core.model.AssetManageReqEntity assetManageReqEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqEntityLocalService.addAssetManageReqEntity(assetManageReqEntity);
	}

	/**
	* Creates a new asset manage req entity with the primary key. Does not add the asset manage req entity to the database.
	*
	* @param id the primary key for the new asset manage req entity
	* @return the new asset manage req entity
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqEntity createAssetManageReqEntity(
		long id) {
		return _assetManageReqEntityLocalService.createAssetManageReqEntity(id);
	}

	/**
	* Deletes the asset manage req entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the asset manage req entity
	* @return the asset manage req entity that was removed
	* @throws PortalException if a asset manage req entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqEntity deleteAssetManageReqEntity(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqEntityLocalService.deleteAssetManageReqEntity(id);
	}

	/**
	* Deletes the asset manage req entity from the database. Also notifies the appropriate model listeners.
	*
	* @param assetManageReqEntity the asset manage req entity
	* @return the asset manage req entity that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqEntity deleteAssetManageReqEntity(
		com.viettel.ams.core.model.AssetManageReqEntity assetManageReqEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqEntityLocalService.deleteAssetManageReqEntity(assetManageReqEntity);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assetManageReqEntityLocalService.dynamicQuery();
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
		return _assetManageReqEntityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assetManageReqEntityLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assetManageReqEntityLocalService.dynamicQuery(dynamicQuery,
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
		return _assetManageReqEntityLocalService.dynamicQueryCount(dynamicQuery);
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
		return _assetManageReqEntityLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.viettel.ams.core.model.AssetManageReqEntity fetchAssetManageReqEntity(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqEntityLocalService.fetchAssetManageReqEntity(id);
	}

	/**
	* Returns the asset manage req entity with the primary key.
	*
	* @param id the primary key of the asset manage req entity
	* @return the asset manage req entity
	* @throws PortalException if a asset manage req entity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqEntity getAssetManageReqEntity(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqEntityLocalService.getAssetManageReqEntity(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqEntityLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the asset manage req entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset manage req entities
	* @param end the upper bound of the range of asset manage req entities (not inclusive)
	* @return the range of asset manage req entities
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.viettel.ams.core.model.AssetManageReqEntity> getAssetManageReqEntities(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqEntityLocalService.getAssetManageReqEntities(start,
			end);
	}

	/**
	* Returns the number of asset manage req entities.
	*
	* @return the number of asset manage req entities
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAssetManageReqEntitiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqEntityLocalService.getAssetManageReqEntitiesCount();
	}

	/**
	* Updates the asset manage req entity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assetManageReqEntity the asset manage req entity
	* @return the asset manage req entity that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqEntity updateAssetManageReqEntity(
		com.viettel.ams.core.model.AssetManageReqEntity assetManageReqEntity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqEntityLocalService.updateAssetManageReqEntity(assetManageReqEntity);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assetManageReqEntityLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assetManageReqEntityLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assetManageReqEntityLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssetManageReqEntityLocalService getWrappedAssetManageReqEntityLocalService() {
		return _assetManageReqEntityLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssetManageReqEntityLocalService(
		AssetManageReqEntityLocalService assetManageReqEntityLocalService) {
		_assetManageReqEntityLocalService = assetManageReqEntityLocalService;
	}

	@Override
	public AssetManageReqEntityLocalService getWrappedService() {
		return _assetManageReqEntityLocalService;
	}

	@Override
	public void setWrappedService(
		AssetManageReqEntityLocalService assetManageReqEntityLocalService) {
		_assetManageReqEntityLocalService = assetManageReqEntityLocalService;
	}

	private AssetManageReqEntityLocalService _assetManageReqEntityLocalService;
}
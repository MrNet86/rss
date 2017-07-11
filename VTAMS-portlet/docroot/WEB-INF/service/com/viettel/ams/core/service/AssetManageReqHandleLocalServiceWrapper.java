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
 * Provides a wrapper for {@link AssetManageReqHandleLocalService}.
 *
 * @author MrNet
 * @see AssetManageReqHandleLocalService
 * @generated
 */
public class AssetManageReqHandleLocalServiceWrapper
	implements AssetManageReqHandleLocalService,
		ServiceWrapper<AssetManageReqHandleLocalService> {
	public AssetManageReqHandleLocalServiceWrapper(
		AssetManageReqHandleLocalService assetManageReqHandleLocalService) {
		_assetManageReqHandleLocalService = assetManageReqHandleLocalService;
	}

	/**
	* Adds the asset manage req handle to the database. Also notifies the appropriate model listeners.
	*
	* @param assetManageReqHandle the asset manage req handle
	* @return the asset manage req handle that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqHandle addAssetManageReqHandle(
		com.viettel.ams.core.model.AssetManageReqHandle assetManageReqHandle)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleLocalService.addAssetManageReqHandle(assetManageReqHandle);
	}

	/**
	* Creates a new asset manage req handle with the primary key. Does not add the asset manage req handle to the database.
	*
	* @param handleId the primary key for the new asset manage req handle
	* @return the new asset manage req handle
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqHandle createAssetManageReqHandle(
		long handleId) {
		return _assetManageReqHandleLocalService.createAssetManageReqHandle(handleId);
	}

	/**
	* Deletes the asset manage req handle with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param handleId the primary key of the asset manage req handle
	* @return the asset manage req handle that was removed
	* @throws PortalException if a asset manage req handle with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqHandle deleteAssetManageReqHandle(
		long handleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleLocalService.deleteAssetManageReqHandle(handleId);
	}

	/**
	* Deletes the asset manage req handle from the database. Also notifies the appropriate model listeners.
	*
	* @param assetManageReqHandle the asset manage req handle
	* @return the asset manage req handle that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqHandle deleteAssetManageReqHandle(
		com.viettel.ams.core.model.AssetManageReqHandle assetManageReqHandle)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleLocalService.deleteAssetManageReqHandle(assetManageReqHandle);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assetManageReqHandleLocalService.dynamicQuery();
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
		return _assetManageReqHandleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqHandleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assetManageReqHandleLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqHandleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assetManageReqHandleLocalService.dynamicQuery(dynamicQuery,
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
		return _assetManageReqHandleLocalService.dynamicQueryCount(dynamicQuery);
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
		return _assetManageReqHandleLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.viettel.ams.core.model.AssetManageReqHandle fetchAssetManageReqHandle(
		long handleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleLocalService.fetchAssetManageReqHandle(handleId);
	}

	/**
	* Returns the asset manage req handle with the primary key.
	*
	* @param handleId the primary key of the asset manage req handle
	* @return the asset manage req handle
	* @throws PortalException if a asset manage req handle with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqHandle getAssetManageReqHandle(
		long handleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleLocalService.getAssetManageReqHandle(handleId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the asset manage req handles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ams.core.model.impl.AssetManageReqHandleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset manage req handles
	* @param end the upper bound of the range of asset manage req handles (not inclusive)
	* @return the range of asset manage req handles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.viettel.ams.core.model.AssetManageReqHandle> getAssetManageReqHandles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleLocalService.getAssetManageReqHandles(start,
			end);
	}

	/**
	* Returns the number of asset manage req handles.
	*
	* @return the number of asset manage req handles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAssetManageReqHandlesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleLocalService.getAssetManageReqHandlesCount();
	}

	/**
	* Updates the asset manage req handle in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assetManageReqHandle the asset manage req handle
	* @return the asset manage req handle that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.viettel.ams.core.model.AssetManageReqHandle updateAssetManageReqHandle(
		com.viettel.ams.core.model.AssetManageReqHandle assetManageReqHandle)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqHandleLocalService.updateAssetManageReqHandle(assetManageReqHandle);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assetManageReqHandleLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assetManageReqHandleLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assetManageReqHandleLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssetManageReqHandleLocalService getWrappedAssetManageReqHandleLocalService() {
		return _assetManageReqHandleLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssetManageReqHandleLocalService(
		AssetManageReqHandleLocalService assetManageReqHandleLocalService) {
		_assetManageReqHandleLocalService = assetManageReqHandleLocalService;
	}

	@Override
	public AssetManageReqHandleLocalService getWrappedService() {
		return _assetManageReqHandleLocalService;
	}

	@Override
	public void setWrappedService(
		AssetManageReqHandleLocalService assetManageReqHandleLocalService) {
		_assetManageReqHandleLocalService = assetManageReqHandleLocalService;
	}

	private AssetManageReqHandleLocalService _assetManageReqHandleLocalService;
}
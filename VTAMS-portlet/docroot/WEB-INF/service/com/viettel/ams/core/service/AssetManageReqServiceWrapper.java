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
 * Provides a wrapper for {@link AssetManageReqService}.
 *
 * @author MrNet
 * @see AssetManageReqService
 * @generated
 */
public class AssetManageReqServiceWrapper implements AssetManageReqService,
	ServiceWrapper<AssetManageReqService> {
	public AssetManageReqServiceWrapper(
		AssetManageReqService assetManageReqService) {
		_assetManageReqService = assetManageReqService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assetManageReqService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assetManageReqService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assetManageReqService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.viettel.ams.core.model.AssetManageReq> searchAssetManageReq(
		com.liferay.portal.kernel.dao.search.SearchContainer searchContainer,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqService.searchAssetManageReq(searchContainer,
			start, end);
	}

	@Override
	public int countAssetManageReq(
		com.liferay.portal.kernel.dao.search.SearchContainer searchContainer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assetManageReqService.countAssetManageReq(searchContainer);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssetManageReqService getWrappedAssetManageReqService() {
		return _assetManageReqService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssetManageReqService(
		AssetManageReqService assetManageReqService) {
		_assetManageReqService = assetManageReqService;
	}

	@Override
	public AssetManageReqService getWrappedService() {
		return _assetManageReqService;
	}

	@Override
	public void setWrappedService(AssetManageReqService assetManageReqService) {
		_assetManageReqService = assetManageReqService;
	}

	private AssetManageReqService _assetManageReqService;
}
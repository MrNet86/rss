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

package com.viettel.ims.core.service.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.SystemException;
import com.viettel.ims.core.model.InvestCategories;
import com.viettel.ims.core.model.InvestPolicy;
import com.viettel.ims.core.service.InvestPolicyLocalServiceUtil;
import com.viettel.ims.core.service.base.InvestCategoriesLocalServiceBaseImpl;
import com.viettel.ims.core.service.persistence.InvestCategoriesUtil;
import com.viettel.ims.search.InvestPolicySearchTerms;

/**
 * The implementation of the invest categories local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.viettel.ims.core.service.InvestCategoriesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author MrNet
 * @see com.viettel.ims.core.service.base.InvestCategoriesLocalServiceBaseImpl
 * @see com.viettel.ims.core.service.InvestCategoriesLocalServiceUtil
 */
public class InvestCategoriesLocalServiceImpl
	extends InvestCategoriesLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.viettel.ims.core.service.InvestCategoriesLocalServiceUtil} to access the invest categories local service.
	 */

	public List<InvestCategories> findByObjId(long objId, long isActive) throws SystemException {

		return InvestCategoriesUtil.findByObjId(objId, isActive);
	}

}
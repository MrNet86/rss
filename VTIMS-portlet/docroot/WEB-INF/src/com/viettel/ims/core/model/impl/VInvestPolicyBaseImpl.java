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

package com.viettel.ims.core.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.viettel.ims.core.model.VInvestPolicy;
import com.viettel.ims.core.service.VInvestPolicyLocalServiceUtil;

/**
 * The extended model base implementation for the VInvestPolicy service. Represents a row in the &quot;V_INVEST_POLICY&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VInvestPolicyImpl}.
 * </p>
 *
 * @author MrNet
 * @see VInvestPolicyImpl
 * @see com.viettel.ims.core.model.VInvestPolicy
 * @generated
 */
public abstract class VInvestPolicyBaseImpl extends VInvestPolicyModelImpl
	implements VInvestPolicy {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a v invest policy model instance should use the {@link VInvestPolicy} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VInvestPolicyLocalServiceUtil.addVInvestPolicy(this);
		}
		else {
			VInvestPolicyLocalServiceUtil.updateVInvestPolicy(this);
		}
	}
}
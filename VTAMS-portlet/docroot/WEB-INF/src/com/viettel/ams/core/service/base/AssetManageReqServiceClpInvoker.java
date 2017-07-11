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

package com.viettel.ams.core.service.base;

import com.viettel.ams.core.service.AssetManageReqServiceUtil;

import java.util.Arrays;

/**
 * @author MrNet
 * @generated
 */
public class AssetManageReqServiceClpInvoker {
	public AssetManageReqServiceClpInvoker() {
		_methodName52 = "getBeanIdentifier";

		_methodParameterTypes52 = new String[] {  };

		_methodName53 = "setBeanIdentifier";

		_methodParameterTypes53 = new String[] { "java.lang.String" };

		_methodName58 = "searchAssetManageReq";

		_methodParameterTypes58 = new String[] {
				"com.liferay.portal.kernel.dao.search.SearchContainer", "int",
				"int"
			};

		_methodName59 = "countAssetManageReq";

		_methodParameterTypes59 = new String[] {
				"com.liferay.portal.kernel.dao.search.SearchContainer"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName52.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
			return AssetManageReqServiceUtil.getBeanIdentifier();
		}

		if (_methodName53.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
			AssetManageReqServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName58.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
			return AssetManageReqServiceUtil.searchAssetManageReq((com.liferay.portal.kernel.dao.search.SearchContainer)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName59.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes59, parameterTypes)) {
			return AssetManageReqServiceUtil.countAssetManageReq((com.liferay.portal.kernel.dao.search.SearchContainer)arguments[0]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName52;
	private String[] _methodParameterTypes52;
	private String _methodName53;
	private String[] _methodParameterTypes53;
	private String _methodName58;
	private String[] _methodParameterTypes58;
	private String _methodName59;
	private String[] _methodParameterTypes59;
}
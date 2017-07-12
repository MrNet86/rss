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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.SystemException;
import com.viettel.ims.core.model.InvestPolicyExt;
import com.viettel.ims.core.model.impl.InvestPolicyExtImpl;
import com.viettel.ims.core.service.base.InvestPolicyExtLocalServiceBaseImpl;
import com.viettel.ims.core.service.persistence.InvestPolicyExtFinderUtil;

/**
 * The implementation of the invest policy ext local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.viettel.ims.core.service.InvestPolicyExtLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author MrNet
 * @see com.viettel.ims.core.service.base.InvestPolicyExtLocalServiceBaseImpl
 * @see com.viettel.ims.core.service.InvestPolicyExtLocalServiceUtil
 */
public class InvestPolicyExtLocalServiceImpl
	extends InvestPolicyExtLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.viettel.ims.core.service.InvestPolicyExtLocalServiceUtil} to access the invest policy ext local service.
	 */

	private static SessionFactory sessionFactory = (SessionFactory)PortalBeanLocatorUtil.locate("liferaySessionFactory");

	public List<InvestPolicyExt> searchInvestPolicyExt (SearchContainer searchContainer, int start, int end) throws SystemException {
		System.out.println("InvestPolicyExtLocalServiceImpl.searchInvestPolicyExt");

		List<InvestPolicyExt> lstResult = InvestPolicyExtFinderUtil.getInvestPolicyExt();
		System.out.println("searchInvestPolicyExt size :"+lstResult.size());
//		Session session = null;
//		try{
//			session = sessionFactory.openSession();
////			String sql = "select decode(info_policy_type, 1, 'Chu truong mua sam', 2, 'chu truong dau tu', '') as infoPolicyTypeName, "
////					+ " INFO_POLICY_NAME as infoPolicyName, "
////					+ " (select name from sys_group where group_id = INFO_PROPOSE_GROUP_ID) as infoProposeGroupName, "
////					+ " (select name from sys_group where group_id = INFO_VERIFY_GROUP_ID) as infoVerifyGroupName, "
////					+ " INFO_POLICY_DATE as infoPolicyDate, INFO_POLICY_DEPLOY_DATE as infoPolicyDeployDate "
////					+ " from invest_policy ";
//
//			String sql = "Select name, group_code from Sys_Group ";
//
//			SQLQuery query = session.createSQLQuery(sql);
////			query.addScalar("infoPolicyTypeName", Type.STRING);
////			query.addScalar("infoPolicyName", Type.STRING);
////			query.addScalar("infoProposeGroupName", Type.STRING);
////			query.addScalar("infoVerifyGroupName", Type.STRING);
////			query.addScalar("infoPolicyDate", Type.DATE);
////			query.addScalar("infoPolicyDeployDate", Type.DATE);
////
////			query.addEntity("InvestPolicyExt", InvestPolicyExtImpl.class);
////
////			QueryPos qPos = QueryPos.getInstance(query);
//			query.setCacheable(false);
//			List lst = query.list();
//			System.out.println("InvestPolicyExtLocalServiceImpl lst :"+lst.size());
//			InvestPolicyExt obj = new InvestPolicyExtImpl();
//			for (Object object : lst) {
//				Object[] arrayobject=(Object[])object;
//				System.out.println("infoProposeGroupName :"+(String)arrayobject[0]);
////				obj.setInfoPolicyTypeName((String)arrayobject[0]);
////				obj.setInfoPolicyName((String)arrayobject[1]);
////				obj.setInfoProposeGroupName((String)arrayobject[2]);
////				obj.setInfoVerifyGroupName((String)arrayobject[3]);
////				obj.setInfoPolicyDate((Date)arrayobject[4]);
////				obj.setInfoPolicyDeployDate((Date)arrayobject[5]);
//
//				lstResult.add(obj);
//			}
//
//		}
//		catch(Exception ex){
//			ex.printStackTrace();
//		}

		return lstResult;
	}

}
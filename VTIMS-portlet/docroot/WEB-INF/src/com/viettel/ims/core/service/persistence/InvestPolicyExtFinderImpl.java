package com.viettel.ims.core.service.persistence;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.viettel.ims.core.model.InvestPolicy;
import com.viettel.ims.core.model.InvestPolicyExt;

public class InvestPolicyExtFinderImpl extends
		BasePersistenceImpl<InvestPolicyExt> implements InvestPolicyExtFinder {

	public List<InvestPolicyExt> getInvestPolicyExt() {
		System.out.println("getInvestPolicyExt");
		Session session = null;
		List<InvestPolicy> lstResult = null;
		try{
			session = openSession();

			String sql = CustomSQLUtil.get("getInvestPolicyExt");
			SQLQuery sqlQuery = session.createSQLQuery(sql);

//			sqlQuery.addEntity("InvestPolicy", InvestPolicyImpl.class);
			List<Object[]> lst = sqlQuery.list();
			System.out.println("lstResult :"+lst.size());

		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			closeSession(session);
		}

		return null;
	}
}

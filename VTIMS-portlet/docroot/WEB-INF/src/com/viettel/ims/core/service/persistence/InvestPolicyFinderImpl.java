package com.viettel.ims.core.service.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.viettel.ims.core.model.InvestPolicy;
import com.viettel.ims.core.model.InvestPolicyExt;
import com.viettel.ims.core.model.impl.InvestPolicyExtImpl;
import com.viettel.ims.search.InvestPolicySearchTerms;

public class InvestPolicyFinderImpl extends BasePersistenceImpl<InvestPolicy>
		implements InvestPolicyFinder {

	public List<InvestPolicyExt> findInvestPolicy(
			SearchContainer searchContainer, int start, int end) {
		System.out.println("getInvestPolicyExt");
		Session session = null;
		List<InvestPolicyExt> lstResult = new ArrayList<InvestPolicyExt>();
		try {
			session = openSession();

			StringBuilder sql = new StringBuilder(
					CustomSQLUtil.get("searchInvestPolicyInfo"));
			List lstParam = new ArrayList();
			InvestPolicySearchTerms searchTerms = (InvestPolicySearchTerms) searchContainer
					.getSearchTerms();

			if (!searchTerms.getInfoPolicyName().isEmpty()) {
				sql.append(" And lower(info_policy_name) like ? ");
				lstParam.add("%"
						+ searchTerms.getInfoPolicyName().toLowerCase() + "%");
			}

			if (!searchTerms.getInfoPolicyType().isEmpty()
					&& !searchTerms.getInfoPolicyType().equals("0")) {
				sql.append(" And info_policy_type = ? ");
				lstParam.add(Long.valueOf(searchTerms.getInfoPolicyType()));
			}

			if (searchTerms.getInfoProposeGroupId() != null
					&& searchTerms.getInfoProposeGroupId() > 0L) {
				sql.append(" And info_propose_group_id = ? ");
				lstParam.add(searchTerms.getInfoProposeGroupId());
			}

			if (searchTerms.getInfoVerifyGroupId() != null
					&& searchTerms.getInfoVerifyGroupId() > 0L) {
				sql.append(" And info_verify_group_id = ? ");
				lstParam.add(searchTerms.getInfoVerifyGroupId());
			}

			System.out.println("sqlllll :" + sql);
			SQLQuery sqlQuery = session.createSQLQuery(sql.toString());
			sqlQuery.addScalar("investPolicyId", Type.LONG);
			sqlQuery.addScalar("infoPolicyTypeName", Type.STRING);
			sqlQuery.addScalar("infoPolicyName", Type.STRING);
			sqlQuery.addScalar("infoProposeGroupName", Type.STRING);
			sqlQuery.addScalar("infoVerifyGroupName", Type.STRING);
			sqlQuery.addScalar("infoPolicyDate", Type.DATE);
			sqlQuery.addScalar("infoPolicyDeployDate", Type.DATE);

			QueryPos qPos = QueryPos.getInstance(sqlQuery);

			for (int i = 0; i < lstParam.size(); i++) {
				qPos.add(lstParam.get(i));
			}

			sqlQuery.setFirstResult(start);
			sqlQuery.setMaxResults(end);
			List lst = sqlQuery.list();
			System.out.println("lstResult :" + lst.size());

			InvestPolicyExt objExt = null;

			for (Object obj : lst) {
				Object[] arrObj = (Object[]) obj;

				objExt = new InvestPolicyExtImpl();
				objExt.setInvestPolicyId((Long) arrObj[0]);
				objExt.setInfoPolicyTypeName((String) arrObj[1]);
				objExt.setInfoPolicyName((String) arrObj[2]);
				objExt.setInfoProposeGroupName((String) arrObj[3]);
				objExt.setInfoVerifyGroupName((String) arrObj[4]);
				objExt.setInfoPolicyDate((Date) arrObj[5]);
				objExt.setInfoPolicyDeployDate((Date) arrObj[6]);

				lstResult.add(objExt);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession(session);
		}

		return lstResult;
	}
}

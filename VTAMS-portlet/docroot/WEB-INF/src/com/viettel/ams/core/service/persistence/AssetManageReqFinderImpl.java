package com.viettel.ams.core.service.persistence;

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
import com.viettel.ams.core.model.AssetManageReq;
import com.viettel.ams.search.AssetManageReqSearchTerms;

public class AssetManageReqFinderImpl extends
		BasePersistenceImpl<AssetManageReq> implements AssetManageReqFinder {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List findAssetManageReq(
			SearchContainer searchContainer, int start, int end) {
		System.out.println("AssetManageReqFinderImpl.findAssetManageReqExt");
		Session session = null;
		List lstResult = new ArrayList();
		try {
			session = openSession();
			StringBuilder sql = new StringBuilder(CustomSQLUtil.get("findAssetManageReq"));
			List lstParam = new ArrayList();
			AssetManageReqSearchTerms searchTerms = (AssetManageReqSearchTerms) searchContainer
					.getSearchTerms();

			if(!searchTerms.getCode().isEmpty()) {
				sql.append(" And lower(a.code) like ? ");
				lstParam.add("%"+searchTerms.getCode().toLowerCase()+"%");
			}
			if(searchTerms.getReqGroupId() != null && searchTerms.getReqGroupId() > 0) {
				sql.append(" And a.req_group_id = ? ");
				lstParam.add(searchTerms.getReqGroupId());
			}
			if(searchTerms.getRecvGroupId() != null && searchTerms.getRecvGroupId() > 0) {
				sql.append(" And a.recv_group_id = ? ");
				lstParam.add(searchTerms.getRecvGroupId());
			}
			sql.append(" Order by a.manage_req_id desc ");
			System.out.println("sql.toString :"+sql.toString());
			SQLQuery sqlQuery = session.createSQLQuery(sql.toString());
			sqlQuery.addScalar("manage_req_id", Type.LONG);
			sqlQuery.addScalar("code", Type.STRING);
			sqlQuery.addScalar("reqGroupName", Type.STRING);
			sqlQuery.addScalar("recvGroupName", Type.STRING);
			sqlQuery.addScalar("full_name", Type.STRING);
			sqlQuery.addScalar("delegator", Type.STRING);
			sqlQuery.addScalar("created_date", Type.DATE);
			sqlQuery.addScalar("status", Type.LONG);
			sqlQuery.addScalar("asset_type", Type.LONG);
			sqlQuery.addScalar("status_ca", Type.LONG);
			sqlQuery.addScalar("reqGroupId", Type.LONG);
			sqlQuery.addScalar("recvGroupId", Type.LONG);

			QueryPos qPos = QueryPos.getInstance(sqlQuery);
			for (int i = 0; i < lstParam.size(); i++) {
				qPos.add(lstParam.get(i));
			}

			sqlQuery.setFirstResult(start);
			sqlQuery.setMaxResults(end);
			long startTime = System.currentTimeMillis();
			lstResult = sqlQuery.list();
			long endTime = System.currentTimeMillis();
			System.out.println("startTime :"+startTime +"|| endTime :"+endTime);
			System.out.println("List size :"+lstResult.size() +" ||Query time :"+ (endTime - startTime)/1000 + " s");

		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			closeSession(session);
		}
		return lstResult;
	}

	@SuppressWarnings("rawtypes")
	public List findEntityByAssetManageReq (Long manageReqId) {
		Session session = null;
		List lstResult = new ArrayList();
		try {
			session = openSession();
			StringBuilder sql = new StringBuilder(CustomSQLUtil.get("findEntityByAssetManageReq"));

			SQLQuery sqlQuery = session.createSQLQuery(sql.toString());
			sqlQuery.addScalar("req_id", Type.LONG);
			sqlQuery.addScalar("MER_ENTITY_ID", Type.LONG);
			sqlQuery.addScalar("name", Type.STRING);
			sqlQuery.addScalar("code", Type.STRING);
			sqlQuery.addScalar("SERIAL_NUMBER", Type.STRING);
			sqlQuery.addScalar("COUNT", Type.DOUBLE);
			sqlQuery.addScalar("QUANTITY", Type.DOUBLE);
			sqlQuery.addScalar("DESCRIPTION", Type.STRING);

			QueryPos qPos = QueryPos.getInstance(sqlQuery);
			qPos.add(manageReqId);

			lstResult = sqlQuery.list();
			System.out.println("findEntityByAssetManageReq size :"+lstResult.size());
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			closeSession(session);
		}
		return lstResult;
	}
}

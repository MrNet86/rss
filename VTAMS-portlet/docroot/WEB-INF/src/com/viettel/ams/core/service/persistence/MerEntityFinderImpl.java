package com.viettel.ams.core.service.persistence;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.viettel.ams.core.model.MerEntity;
import com.viettel.ams.search.MerEntitySearchTerms;

public class MerEntityFinderImpl extends
	BasePersistenceImpl<MerEntity> implements MerEntityFinder {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List findMerEntity (SearchContainer searchContainer, int start, int end) {
		System.out.println("MerEntityFinderImpl.findMerEntity");
		Session session = null;
		List lstResult = new ArrayList();
		try {
			session = openSession();
			List lstParam = new ArrayList();
			MerEntitySearchTerms searchTerms = (MerEntitySearchTerms) searchContainer
					.getSearchTerms();

			StringBuilder sqlBuilder = new StringBuilder(CustomSQLUtil.get("findMerEntity"));

			if(!searchTerms.getMerName().isEmpty()){
				sqlBuilder.append(" And lower(c.name) like ? ");
				lstParam.add("%" + searchTerms.getMerName().toLowerCase() + "%");
			}
			if(!searchTerms.getMerCode().isEmpty()){
				sqlBuilder.append(" And c.code like ? ");
				lstParam.add("%" + searchTerms.getMerCode() + "%");
			}
			if(!searchTerms.getSerialNumber().isEmpty()){
				sqlBuilder.append(" And a.serial_number like ? ");
				lstParam.add("%" + searchTerms.getSerialNumber() + "%");
			}
			SQLQuery sqlQuery = session.createSQLQuery(sqlBuilder.toString());
			sqlQuery.addScalar("merEntityId", Type.LONG);
			sqlQuery.addScalar("merName", Type.STRING);
			sqlQuery.addScalar("merCode", Type.STRING);
			sqlQuery.addScalar("serialNumber", Type.STRING);
			sqlQuery.addScalar("contractCode", Type.STRING);
			sqlQuery.addScalar("stationCode", Type.STRING);
			sqlQuery.addScalar("count", Type.DOUBLE);
			sqlQuery.addScalar("statusName", Type.STRING);
			sqlQuery.addScalar("merId", Type.LONG);

			QueryPos qPos = QueryPos.getInstance(sqlQuery);
			for (int i = 0; i < lstParam.size(); i++) {
				qPos.add(lstParam.get(i));
			}

			sqlQuery.setFirstResult(start);
			sqlQuery.setMaxResults(end);

			lstResult = sqlQuery.list();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			closeSession(session);
		}
		return lstResult;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int countMerEntity (SearchContainer searchContainer) {
		System.out.println("MerEntityFinderImpl.findMerEntity");
		Session session = null;
		int numRow = 0;
		try {
			session = openSession();
			List lstParam = new ArrayList();
			MerEntitySearchTerms searchTerms = (MerEntitySearchTerms) searchContainer
					.getSearchTerms();

			StringBuilder sqlBuilder = new StringBuilder(CustomSQLUtil.get("countMerEntity"));

			if(!searchTerms.getMerName().isEmpty()){
				sqlBuilder.append(" And lower(c.name) like ? ");
				lstParam.add("%" + searchTerms.getMerName().toLowerCase() + "%");
			}
			if(!searchTerms.getMerCode().isEmpty()){
				sqlBuilder.append(" And c.code like ? ");
				lstParam.add("%" + searchTerms.getMerCode() + "%");
			}
			if(!searchTerms.getSerialNumber().isEmpty()){
				sqlBuilder.append(" And a.serial_number like ? ");
				lstParam.add("%" + searchTerms.getSerialNumber() + "%");
			}
			SQLQuery sqlQuery = session.createSQLQuery(sqlBuilder.toString());
			sqlQuery.addScalar("numRow", Type.LONG);

			QueryPos qPos = QueryPos.getInstance(sqlQuery);
			for (int i = 0; i < lstParam.size(); i++) {
				qPos.add(lstParam.get(i));
			}

			numRow = ((Long)sqlQuery.uniqueResult()).intValue();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			closeSession(session);
		}
		return numRow;
	}
}

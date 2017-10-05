package com.vnpt.portlet.user.service.persistence;

import java.util.List;

import javax.transaction.SystemException;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.vnpt.portlet.user.model.LiferayDatabase;
import com.vnpt.portlet.user.utils.VnptConstants;

public class LiferayDatabaseFinderImpl extends BasePersistenceImpl<LiferayDatabase>
	implements LiferayDatabaseFinder {

	public List<User> findAllUserByGroupAndChild(long groupId, int start, int end) {
		
		SessionFactory sessionFactory = (SessionFactory)PortalBeanLocatorUtil.locate("liferaySessionFactory");
		
		Session session = null;
	    try {
	        session = sessionFactory.openSession();

	        String sql = CustomSQLUtil.get(VnptConstants.FIND_ALL_USER_BY_GROUP_AND_CHILD);

	        SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(false);
	        q.addEntity("User_", PortalClassLoaderUtil.getClassLoader().loadClass("com.liferay.portal.model.impl.UserImpl"));

	        QueryPos qPos = QueryPos.getInstance(q);  
	        qPos.add("%" + groupId + "%");
	        
	        return (List<User>) QueryUtil.list(q, getDialect(), start, end);
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        closeSession(session);
	    }
	    
		return null;
	}
	
	public List countAllUserByGroupAndChild(long groupId) {
		
		SessionFactory sessionFactory = (SessionFactory)PortalBeanLocatorUtil.locate("liferaySessionFactory");
		
		Session session = null;
		try {
			session = sessionFactory.openSession();
			
			String sql = CustomSQLUtil.get(VnptConstants.COUNT_ALL_USER_BY_GROUP_AND_CHILD);
			
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);
			q.addScalar("totalRow", Type.INTEGER);
			
			QueryPos qPos = QueryPos.getInstance(q);  
			qPos.add("%" + groupId + "%");
			
			return (List) q.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return null;
	}

}

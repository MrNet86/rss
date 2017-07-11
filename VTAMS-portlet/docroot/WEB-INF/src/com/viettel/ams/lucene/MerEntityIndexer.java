package com.viettel.ams.lucene;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

import javax.portlet.PortletURL;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.util.GetterUtil;
import com.viettel.ams.core.model.MerEntity;
import com.viettel.ams.core.service.MerEntityLocalServiceUtil;
import com.viettel.ams.core.service.persistence.MerEntityActionableDynamicQuery;

public class MerEntityIndexer extends BaseIndexer {

	public static final String[] CLASS_NAMES = { MerEntity.class.getName() };

    public static final String PORTLET_ID = "VTAMS";

    public MerEntityIndexer() {
		// TODO Auto-generated constructor stub
    	setPermissionAware(true);
	}

	@Override
	public String[] getClassNames() {
		// TODO Auto-generated method stub
		return CLASS_NAMES;
	}

	@Override
	public String getPortletId() {
		// TODO Auto-generated method stub
		return PORTLET_ID;
	}

	@Override
	protected void doDelete(Object obj) throws Exception {
		// TODO Auto-generated method stub
		MerEntity entry = (MerEntity)obj;

        deleteDocument(20155, entry.getMerEntityId());
	}

	@Override
	protected Document doGetDocument(Object obj) throws Exception {
		// TODO Auto-generated method stub
		MerEntity entry = (MerEntity) obj;

		Document document = getBaseModelDocument(PORTLET_ID, entry);
//		document.addDate(Field.MODIFIED_DATE, entry.getCreatedDate());
//        document.addKeyword(Field.GROUP_ID, entry.getGroupId());
//        document.addKeyword(Field.SCOPE_GROUP_ID, entry.getGroupId());
        document.addKeyword("merId", entry.getMerId());
        document.addKeyword("stationId", entry.getStationId());
        document.addKeyword(Field.DESCRIPTION, entry.getDescription());
        document.addKeyword("warehouseId", entry.getWarehouseId());
        document.addKeyword("merEntityId", entry.getMerEntityId());

        return document;
	}

	@Override
	protected Summary doGetSummary(Document document, Locale arg1, String arg2,
			PortletURL arg3) throws Exception {
		// TODO Auto-generated method stub
		 Summary summary = createSummary(document);

         summary.setMaxContentLength(200);

         return summary;
	}

	@Override
	protected void doReindex(Object obj) throws Exception {
		// TODO Auto-generated method stub
		MerEntity entry = (MerEntity)obj;

        Document document = getDocument(entry);

        SearchEngineUtil.updateDocument(
                getSearchEngineId(), 20155, document);
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		// TODO Auto-generated method stub
        long companyId = GetterUtil.getLong(ids[0]);

        reindexEntries(companyId);
	}

	@Override
	protected void doReindex(String arg0, long classPK) throws Exception {
		// TODO Auto-generated method stub
		MerEntity entry = MerEntityLocalServiceUtil.getMerEntity(classPK);

        doReindex(entry);
	}

	@Override
	protected String getPortletId(SearchContext arg0) {
		// TODO Auto-generated method stub
		return PORTLET_ID;
	}

	protected void reindexEntries(long companyId) throws PortalException,
			SystemException {

		final Collection<Document> documents = new ArrayList<Document>();

		ActionableDynamicQuery actionableDynamicQuery = new MerEntityActionableDynamicQuery() {

			@Override
			protected void addCriteria(DynamicQuery dynamicQuery) {
			}

			@Override
			protected void performAction(Object object) throws PortalException {
				MerEntity entry = (MerEntity) object;

				Document document = getDocument(entry);

				documents.add(document);
			}

		};

		actionableDynamicQuery.setCompanyId(companyId);

		actionableDynamicQuery.performActions();

		SearchEngineUtil.updateDocuments(getSearchEngineId(), companyId,
				documents);
	}
}

<%@page import="com.viettel.ams.modelext.MerEntityExt"%>
<%@page import="com.viettel.ams.core.service.MerEntityLocalServiceUtil"%>
<%@include file="../init.jsp"%>

<%
PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("action", ActionConstants.SELECT_MER_ENTITY);

String eventName = ParamUtil.getString(request, "eventName",
		liferayPortletResponse.getNamespace() + "selectMerEntity");
String target = ParamUtil.getString(request, "target");

portletURL.setParameter("eventName", eventName);
if (Validator.isNotNull(target)) {
	portletURL.setParameter("target", target);
}

%>

<aui:form action="<%= portletURL.toString() %>" method="POST" name="selectMerEntityFm">
	<aui:input id="deleteRowIds" name="deleteRowIds" type="hidden" value=""/>
	<liferay-ui:search-container
		rowChecker="<%= new RowChecker(renderResponse) %>"
		searchContainer="<%= new MerEntitySearch(renderRequest, portletURL) %>"
	>

		<liferay-ui:search-form page="/jsp/merEntity/search.jsp"
			searchContainer="<%= searchContainer %>"
			servletContext="<%= this.getServletContext() %>"
		/>

		<%
			List lst = MerEntityLocalServiceUtil.searchMerEntities(searchContainer, searchContainer.getStart(), searchContainer.getEnd());
			List<MerEntityExt> lstResult = new ArrayList<MerEntityExt>();
			MerEntityExt objExt = null;
			for (Object item : lst) {
				Object[] arrObj = (Object[]) item;

				objExt = new MerEntityExt();
				objExt.setMerEntityId(arrObj[0] == null ? 0 : (Long)arrObj[0]);
				objExt.setMerName((String)arrObj[1]);
				objExt.setMerCode((String)arrObj[2]);
				objExt.setSerialNumber((String)arrObj[3]);
				objExt.setContractCode((String)arrObj[4]);
				objExt.setStationCode((String)arrObj[5]);
				objExt.setCount((Double)arrObj[6]);
				objExt.setStatusName((String)arrObj[7]);
				objExt.setMerId((Long)arrObj[8]);

				lstResult.add(objExt);
			}
		%>
		<liferay-ui:search-container-results
			results="<%= lstResult %>"
			total="<%= MerEntityLocalServiceUtil.countMerEntities(searchContainer) %>"
		/>

		<liferay-ui:search-container-row
			className="com.viettel.ams.modelext.MerEntityExt"
			modelVar="aMerEntity"
			keyProperty="merEntityId"
		>

<%-- 			<liferay-ui:search-container-column-text property="merEntityId" name="Mer.merEntityId"/> --%>
			<liferay-ui:search-container-column-text property="merName" name="Mer.merName"/>
			<liferay-ui:search-container-column-text property="merCode" name="Mer.merCode"/>
			<liferay-ui:search-container-column-text property="serialNumber" name="Mer.serialNumber"/>
			<liferay-ui:search-container-column-text property="contractCode" name="Mer.contractCode"/>
			<liferay-ui:search-container-column-text property="stationCode" name="Mer.stationCode"/>
			<liferay-ui:search-container-column-text property="count" name="Mer.count"/>
			<liferay-ui:search-container-column-text property="statusName" name="Mer.statusName"/>

			<liferay-ui:search-container-column-text>
				<%
				Map<String, Object> data = new HashMap<String, Object>();

				data.put("merentityid", aMerEntity.getMerEntityId());
				data.put("merName", aMerEntity.getMerName());
				data.put("mercode", aMerEntity.getMerCode());
				data.put("serialnumber", aMerEntity.getSerialNumber());
				data.put("count", aMerEntity.getCount());
				%>
				<aui:button cssClass="selector-button" data="<%= data %>" value="choose" />
			</liferay-ui:search-container-column-text>

		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</aui:form>
<aui:script use="aui-base">
	var Util = Liferay.Util;

	A.one('#<portlet:namespace />selectMerEntityFm').delegate(
		'click',
		function(event) {
			var result = Util.getAttributes(event.currentTarget, 'data-');

			Util.getOpener().Liferay.fire('<%= HtmlUtil.escapeJS(eventName) %>', result);

// 			Util.getWindow().hide();
		},
		'.selector-button'
	);
</aui:script>
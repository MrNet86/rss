<%@page import="com.viettel.ams.modelext.AssetManageReqExt"%>
<%@ include file="/jsp/init.jsp" %>
<%
	PortletURL portletURL = (PortletURL)request.getAttribute("view.jsp-portletURL");
	System.out.println("viewAllManageReq portletURL :"+portletURL);
%>

<aui:form action="<%= portletURL.toString() %>" method="post" name="name">
	<liferay-util:include page="/jsp/assetManage/toolbar.jsp"
		servletContext="<%= this.getServletContext() %>"
	/>

	<liferay-ui:search-container
		rowChecker="<%= new RowChecker(renderResponse) %>"
		searchContainer="<%= new AssetManageReqSearch(renderRequest, portletURL) %>"
	>

		<liferay-ui:search-form page="/jsp/assetManage/search.jsp"
			searchContainer="<%= searchContainer %>"
			servletContext="<%= this.getServletContext() %>"
		/>
		<%
		List lst = AssetManageReqLocalServiceUtil.searchListTest(searchContainer, searchContainer.getStart(), searchContainer.getEnd());
		List<AssetManageReqExt> lstResult = new ArrayList<AssetManageReqExt>();
		AssetManageReqExt objExt = null;
		System.out.println("jsp lst size :"+lst.size());
		long startTime = System.currentTimeMillis();
		for (Object item : lst) {
			Object[] arrObj = (Object[]) item;
			objExt = new AssetManageReqExt();
			objExt.setManageReqId((Long)arrObj[0]);
			objExt.setCode((String)arrObj[1]);
			objExt.setReqGroupName((String)arrObj[2]);
			objExt.setRecvGroupName((String)arrObj[3]);
			objExt.setCreatedName((String)arrObj[4]);
			objExt.setDelegator((String)arrObj[5]);
			objExt.setCreatedDate((Date)arrObj[6]);
			objExt.setStatus((Long)arrObj[7]);
			objExt.setAssetType((Long)arrObj[8]);
			objExt.setStatusCa((Long)arrObj[9]);
			objExt.setReqGroupId((Long)arrObj[10]);
			objExt.setRecvGroupId((Long)arrObj[11]);

			lstResult.add(objExt);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("jsp startTime :"+startTime +"|| endTime :"+endTime);
		System.out.println("jsp Transform to Object :"+ (endTime - startTime)/1000 + " s");
		%>
		<liferay-ui:search-container-results
			results="<%= lstResult %>"
			total="<%= AssetManageReqLocalServiceUtil.countAssetManageReq(searchContainer) %>"
		/>

		<liferay-ui:search-container-row
			className="com.viettel.ams.modelext.AssetManageReqExt"
			modelVar="aAssetManageReq"
			keyProperty="manageReqId"
		>

			<portlet:renderURL windowState="<%= WindowState.NORMAL.toString() %>" var="editURL">
				<portlet:param name="action" value="<%= ActionConstants.EDIT_MANAGE_REQ %>" />
				<portlet:param name="backURL" value="<%= portletURL.toString() %>" />
				<portlet:param name="manageReqId" value="<%= String.valueOf(aAssetManageReq.getManageReqId()) %>" />
			</portlet:renderURL>

			<liferay-ui:search-container-column-text
				name="Edit" align="center" valign="center" href="<%=editURL%>">
				<liferay-ui:icon image="edit" />
			</liferay-ui:search-container-column-text>

			<liferay-ui:search-container-column-text property="code" name="Req.code"/>

			<liferay-ui:search-container-column-text property="reqGroupName" name="Req.reqGroupName"/>

			<liferay-ui:search-container-column-text property="recvGroupName" name="Req.recvGroupName"/>

			<liferay-ui:search-container-column-text property="delegator" name="Req.delegator"/>

			<liferay-ui:search-container-column-text property="status" name="Req.status"/>

		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />
	</liferay-ui:search-container>

</aui:form>

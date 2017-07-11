<%@page import="com.viettel.ams.utils.ActionConstants"%>
<%@include file="init.jsp" %>

<%
	String tabName = "view-all-manage-req,create-manage-req,"
			+ "create-manage-req-from-construction,create-manage-req-from-contract,"
			+ "view-all-manage-cmd,process-manage-cmd";

	String tab = ParamUtil.getString(request, "tab", "view-all-manage-req");
	System.out.println("viewHome.jsp tab :"+tab);

	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setParameter("tab", tab);

	String pageUrl = "";
	if("view-all-manage-req".equals(tab)) {
		portletURL.setParameter("action", ActionConstants.VIEW_ALL_MANAGE_REQ);
		pageUrl = "/jsp/assetManage/viewAllManageReq.jsp";
	}
	else if ("create-manage-req".equals(tab)) {
		portletURL.setParameter("action", ActionConstants.CREATE_MANAGE_REQ);
		pageUrl = "/jsp/assetManage/editManageReq.jsp";
	}
	else if ("create-manage-req-from-construction".equals(tab)) {
		portletURL.setParameter("action", ActionConstants.CREATE_MANAGE_REQ_FROM_CONSTRUCTION);
		pageUrl = "/jsp/assetManage/createManageReq.jsp";
	}
	else if ("create-manage-req-from-contract".equals(tab)) {
		portletURL.setParameter("action", ActionConstants.CREATE_MANAGE_REQ_FROM_CONTRACT);
		pageUrl = "/jsp/assetManage/viewAllManageReq.jsp";
	}
	else if ("view-all-manage-cmd".equals(tab)) {
		portletURL.setParameter("action", ActionConstants.VIEW_ALL_MANAGE_CMD);
		pageUrl = "/jsp/assetManage/viewAllManageReq.jsp";
	}
	else if ("process-manage-cmd".equals(tab)) {
		portletURL.setParameter("action", ActionConstants.PROCESS_MANAGE_CMD);
		pageUrl = "/jsp/assetManage/viewAllManageReq.jsp";
	}

%>

<liferay-ui:tabs
	names="<%= tabName %>"
	value="<%= tab %>"
	portletURL="<%= portletURL %>"
	param="tab"
	refresh="<%= true %>"
/>

<liferay-util:include page="<%= pageUrl %>"
	servletContext="<%=this.getServletContext()%>" />

<%-- <c:choose> --%>
<%-- 	<c:when test='<%= "AssetMove".equals(tab) %>'> --%>
<%-- 		<liferay-util:include page="/jsp/assetMove/view.jsp" --%>
<%-- 			servletContext="<%=this.getServletContext()%>" /> --%>
<%-- 	</c:when> --%>
<%-- 	<c:when test='<%= "AssetManage".equals(tab) %>'> --%>
<%-- 		<liferay-util:include page="/jsp/assetManage/viewAssetManageReq.jsp" --%>
<%-- 			servletContext="<%=this.getServletContext()%>" /> --%>
<%-- 	</c:when> --%>
<%-- </c:choose> --%>

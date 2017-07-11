<%@ include file="/jsp/init.jsp" %>
<!-- directory->view.jsp -->
<%
String tabs1 = ParamUtil.getString(request, "tabs1", "view-all-manage-req");
System.out.println("viewManage.jsp tabs1 :"+tabs1 +" || equals :"+ ("view-all-manage-req".equals(tabs1)));
PortletURL portletURL = renderResponse.createRenderURL();

portletURL.setParameter("tabs1", tabs1);
// if("view-all-manage-req".equals(tabs1)){
// 	portletURL.setParameter("action", ActionConstants.VIEW_ALL_MANAGE_REQ);
// }
// else if ("create-manage-req".equals(tabs1)) {
// 	portletURL.setParameter("action", ActionConstants.CREATE_MANAGE_REQ);
// }
// portletURL.setParameter("action", ActionConstants.UPDATE_MANAGE_REQ);

pageContext.setAttribute("portletURL", portletURL);

String portletURLString = portletURL.toString();

request.setAttribute("view.jsp-portletURL", portletURL);
request.setAttribute("view.jsp-portletURLString", portletURLString);
System.out.println("viewManage portletURL :"+portletURL);
%>
<%-- <aui:form action="<%= portletURLString %>" method="post" name="fm"> --%>
<%-- 	<liferay-portlet:renderURLParams varImpl="portletURL" /> --%>
<%-- 	<aui:input name="tabs1" type="hidden" value="<%= tabs1 %>" /> --%>
<%-- 	<aui:input name="redirect" type="hidden" value="<%= portletURLString %>" /> --%>

	<liferay-util:include page="/jsp/assetManage/tabs1.jsp"
		servletContext="<%= this.getServletContext() %>"/>

	<c:choose>
		<c:when test='<%= ActionConstants.VIEW_ALL_MANAGE_REQ.equals(tabs1) %>'>
			<liferay-util:include page="/jsp/assetManage/viewAllManageReq.jsp"
				servletContext="<%= this.getServletContext() %>"/>
		</c:when>
		<c:when test='<%= ActionConstants.CREATE_MANAGE_REQ.equals(tabs1) %>'>
			<liferay-util:include page="/jsp/assetManage/editManageReq.jsp"
				servletContext="<%= this.getServletContext() %>"/>
		</c:when>
		<c:when test='<%= ActionConstants.VIEW_ALL_MANAGE_CMD.equals(tabs1) %>'>
			<liferay-util:include page="/jsp/assetManage/viewAllManageCmd.jsp" />
		</c:when>
	</c:choose>

<%-- </aui:form> --%>
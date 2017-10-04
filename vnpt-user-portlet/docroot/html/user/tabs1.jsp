<%@page import="com.vnpt.portlet.user.permission.VnptPermission"%>
<%@ include file="../init.jsp" %>

<%
//check permission
boolean isAdmin = VnptPermission.contains(permissionChecker, scopeGroupId, VnptConstants.USER_PER_ADMIN);

String tabs1 = ParamUtil.getString(request, "tabs1", VnptConstants.VIEW_USER);
// String action = ParamUtil.getString(request, "action", VnptConstants.VIEW_USER);

PortletURL portletURL = renderResponse.createRenderURL();
// portletURL.setParameter("action", action);
portletURL.setParameter("tabs1", tabs1);

String tabs1Names = "view-user";
if(isAdmin) {
	tabs1Names += ",edit-user";
}

tabs1Names = HtmlUtil.escape(tabs1Names);

String backURL = ParamUtil.getString(request, "backURL");
%>

<liferay-ui:tabs
	names="<%= tabs1Names %>"
	value="<%= tabs1 %>"
	portletURL="<%= portletURL %>"
	param="tabs1"
/>

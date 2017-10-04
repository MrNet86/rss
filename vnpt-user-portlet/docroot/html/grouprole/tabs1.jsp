<%@page import="com.vnpt.portlet.user.permission.VnptPermission"%>
<%@ include file="../init.jsp" %>

<%
//check permission
boolean isAdmin = VnptPermission.contains(permissionChecker, scopeGroupId, VnptConstants.USER_PER_ADMIN);

String tabs1 = ParamUtil.getString(request, "tabs1", VnptConstants.VIEW_GROUP_ROLE);

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("tabs1", tabs1);

String tabs1Names = "view-group-role";
if(isAdmin) {
	tabs1Names += ",edit-group-role";
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

<%@page import="com.vnpt.portal.rss.permission.RssPermission"%>
<%@ include file="../init.jsp" %>

<%
// check user permission
boolean isConfigRss = RssPermission.contains(permissionChecker, scopeGroupId, "CONFIG_RSS");
boolean isApprove = RssPermission.contains(permissionChecker, scopeGroupId, "APPROVE_FEED");
boolean isEdit = RssPermission.contains(permissionChecker, scopeGroupId, "EDIT_FEED");

String tabs1 = ParamUtil.getString(request, "tabs1", RssConstants.VIEW_RSS_PUBLISHED);

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("action", tabs1);
portletURL.setParameter("tabs1", tabs1);

String tabs1Names = "view-rss-published";

if(isEdit || isApprove) {
	tabs1Names += ",view-rss-feeds,view-rss-wait-for-approve" ;
}
if(isConfigRss) {
	tabs1Names += ",config-rss,view-rss-category" ;
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

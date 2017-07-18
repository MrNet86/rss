<%@ include file="init.jsp" %>

<%
String tabNames = "view-rss-feeds,config-rss,view-rss-wait-for-approve,view-rss-published";
String tab = ParamUtil.getString(request, "tab", "view-rss-feeds");

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("tab", tab);
System.out.println("tab :"+tab);
String pageUrl = "";

if("config-rss".equals(tab)) {
	System.out.println("config-rss tab");
	portletURL.setParameter("action", RssConstants.CONFIG_RSS);
	pageUrl = "/html/backend/config_rss.jsp";
}
else if("view-rss-feeds".equals(tab)) {
	portletURL.setParameter("action", RssConstants.VIEW_ALL_RSS);
	pageUrl = "/html/backend/view_rss_feeds.jsp";
}
else if("view-rss-wait-for-approve".equals(tab)) {
	portletURL.setParameter("action", RssConstants.VIEW_RSS_WAIT_FOR_APPROVE);
	pageUrl = "/html/backend/view_rss_wait_for_approve.jsp";
}
else if("view-rss-published".equals(tab)) {
	portletURL.setParameter("action", RssConstants.VIEW_RSS_PUBLISHED);
	pageUrl = "/html/backend/view_rss_published.jsp";
}
System.out.println("pageUrl :"+pageUrl);
%>

<liferay-ui:tabs
	names="<%= tabNames %>"
	value="<%= tab %>"
	portletURL="<%= portletURL %>"
	param="tab"
	refresh="<%= true %>"
/>

<liferay-util:include page="<%= pageUrl %>"
	servletContext="<%=this.getServletContext()%>" />
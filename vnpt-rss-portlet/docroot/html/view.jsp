<%@ include file="init.jsp" %>

<%
String tabNames = "view-rss-feeds,config-rss";
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
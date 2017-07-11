<%@ include file="init.jsp" %>

<%
String tabNames = "view-all-rss,manage-rss";
String tab = ParamUtil.getString(request, "tab", "view-all-rss");

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("tab", tab);

String pageUrl = "";

if("view-all-rss".equals(tab)) {
	portletURL.setParameter("action", RssConstants.VIEW_ALL_RSS);
	pageUrl = "html/backend/view_all_rss.jsp";
}

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
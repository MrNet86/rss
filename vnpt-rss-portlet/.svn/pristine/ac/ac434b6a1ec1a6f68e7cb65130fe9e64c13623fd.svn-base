<%@ include file="init.jsp" %>

<%
String tabs1 = ParamUtil.getString(request, "tabs1", RssConstants.VIEW_RSS_PUBLISHED);

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("tabs1", tabs1);

String portletURLString = portletURL.toString();

request.setAttribute("view.jsp-portletURL", portletURL);
request.setAttribute("view.jsp-portletURLString", portletURLString);

pageContext.setAttribute("portletURL", portletURL);
%>

<liferay-util:include page="/html/backend/tabs1.jsp"
	servletContext="<%= this.getServletContext() %>"/>

<c:choose>	
	<c:when test='<%= RssConstants.VIEW_RSS_PUBLISHED.equals(tabs1) %>'>
		<liferay-util:include page="/html/backend/view_rss_published.jsp"
			servletContext="<%= this.getServletContext() %>"/>
	</c:when>
	<c:when test='<%= RssConstants.VIEW_RSS_FEEDS.equals(tabs1) %>'>
		<liferay-util:include page="/html/backend/view_rss_feeds.jsp"
			servletContext="<%= this.getServletContext() %>"/>
	</c:when>
	<c:when test='<%= RssConstants.VIEW_RSS_WAIT_FOR_APPROVE.equals(tabs1) %>'>
		<liferay-util:include page="/html/backend/view_rss_wait_for_approve.jsp"
			servletContext="<%= this.getServletContext() %>"/>
	</c:when>	
	<c:when test='<%= RssConstants.CONFIG_RSS.equals(tabs1) %>'>
		<liferay-util:include page="/html/backend/config_rss.jsp"
			servletContext="<%= this.getServletContext() %>"/>
	</c:when>
	<c:when test='<%= RssConstants.VIEW_RSS_CATEGORY.equals(tabs1) %>'>
		<liferay-util:include page="/html/backend/view_rss_category.jsp"
			servletContext="<%= this.getServletContext() %>"/>
	</c:when>
</c:choose>
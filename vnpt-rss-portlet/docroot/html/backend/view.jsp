<%@ include file="../init.jsp" %>

<%
String tabs1 = ParamUtil.getString(request, "tabs1", "view-rss-feeds");
%>

<liferay-util:include page="/html/backend/tabs1.jsp" />

<c:choose>
	<c:when test='<%= tabs1.equals("view-rss-feeds") %>'>
		<%@ include file="/html/backend/view_rss_feeds.jspf" %>
	</c:when>
	<c:when test='<%= tabs1.equals("config-rss") %>'>
		<%@ include file="/html/backend/config_rss.jspf" %>
	</c:when>
	<c:when test='<%= tabs1.equals("view-rss-wait-for-approve") %>'>
		<%@ include file="/html/backend/view_rss_wait_for_approve.jspf" %>
	</c:when>
	<c:when test='<%= tabs1.equals("view-rss-published") %>'>
		<%@ include file="/html/backend/view_rss_published.jspf" %>
	</c:when>
</c:choose>
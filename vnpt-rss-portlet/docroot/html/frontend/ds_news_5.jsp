<%@page import="com.vnpt.portal.rss.model.RssFeeds"%>
<%@ include file="../init.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<%
String title = "";
String thumbnailUrl = "";
String shortDescription = "";
String entryUrl = "";
String publishDate = "";
RssFeeds rssFeeds = null;
long classPK;

List<RssFeeds> results = (List<RssFeeds>) request.getAttribute("view.jsp-results");
%>
<%--
<h3 class="title-list-news2" >
	<c:if test="<%= Validator.isNotNull(portletTitle) %>">
		<%= HtmlUtil.escape(portletTitle) %>
	</c:if>
</h3>
 --%>
<div class="box">
	<div class="list-tab">
		<ul class="bullet">
			<c:if test="<%= results.size() > 0 %>">
				<%
				for (int i = 0; i < results.size(); i++) {
					rssFeeds = results.get(i);

					title = HtmlUtil.escape(rssFeeds.getTitle());
					entryUrl = _escapeJavaScriptLink(rssFeeds.getUrl());
					shortDescription = StringUtil.shorten(rssFeeds.getContent(), titleLength);
					%>
					<li><a href="<%= entryUrl %>" title="<%= title %>"><%= shortDescription %></a></li>
				<% } %>
			</c:if>
		</ul>
	</div>
</div>
<%!
private String _escapeJavaScriptLink(String link) {
	if (Validator.isNull(link)) {
		return StringPool.BLANK;
	}

	if (link.indexOf(StringPool.COLON) == 10) {
		String protocol = StringUtil.toLowerCase(link.substring(0, 10));

		if (protocol.equals("javascript")) {
			link = StringUtil.replaceFirst(link, StringPool.COLON, "%3a");
		}
	}

	return link;
}
%>
<%@page import="com.sun.syndication.feed.synd.SyndEntry"%>
<%@ include file="../init.jsp" %>

<%
String randomId = StringPool.BLANK;

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

SyndEntry feed = (SyndEntry)row.getObject();
%>

<portlet:actionURL var="sendApproveURL">
	<portlet:param name="action" value="<%= RssConstants.SEND_FOR_APPROVE %>" />
	<portlet:param name="title" value="<%= feed.getTitle() %>"/>
	<portlet:param name="url" value="<%= feed.getLink() %>" />
	<portlet:param name="publishedDate" value='<%= feed.getPublishedDate() != null ? dateFormatDate.format(feed.getPublishedDate()) : ""  %>' />
	<portlet:param name="content" value="<%= feed.getAuthor() %>" />
</portlet:actionURL>

<aui:button href="<%= sendApproveURL %>" 
	value="send-for-approve"
/>

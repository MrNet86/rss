<%@ include file="../init.jsp" %>

<%
String randomId = StringPool.BLANK;

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

RssFeeds feed = (RssFeeds)row.getObject();

%>

<portlet:actionURL var="sendApproveURL">
	<portlet:param name="action" value="<%= RssConstants.SEND_FOR_APPROVE %>" />
	<portlet:param name="title" value="<%= feed.getTitle() %>"/>
	<portlet:param name="url" value="<%= feed.getUrl() %>" />
	<portlet:param name="publishedDate" value='<%= feed.getPublishedDate() != null ? dateFormatDate.format(feed.getPublishedDate()) : ""  %>' />
	<portlet:param name="content" value="<%= feed.getContent() %>" />
	<portlet:param name="rssCategoryId" value="<%= String.valueOf(feed.getRssCategoryId()) %>" />
</portlet:actionURL>

<aui:button href="<%= sendApproveURL %>" 
	value="rss-send-for-approve"
/>

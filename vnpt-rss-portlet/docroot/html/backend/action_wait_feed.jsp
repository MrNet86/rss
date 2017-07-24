<%@page import="com.vnpt.portal.rss.permission.RssPermission"%>
<%@ include file="../init.jsp" %>

<%
String randomId = StringPool.BLANK;

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

RssFeeds feed = (RssFeeds)row.getObject();

//check permission to approve
boolean isApprove = RssPermission.contains(permissionChecker, scopeGroupId, "APPROVE_FEED");

if(isApprove && feed.getStatus() != 1) {
%>
<portlet:actionURL var="approveURL">
	<portlet:param name="action" value="<%= RssConstants.PROCESS_FEED %>" />
	<portlet:param name="rssStatus" value="<%= String.valueOf(RssConstants.RSS_STATUS_PUBLISHED) %>" />
	<portlet:param name="rssFeedsId" value="<%= String.valueOf(feed.getRssFeedsId()) %>" />
</portlet:actionURL>

<aui:button href="<%= approveURL %>"
	value="rss-approve"
/>

<portlet:actionURL var="rejectURL">
	<portlet:param name="action" value="<%= RssConstants.PROCESS_FEED %>" />
	<portlet:param name="rssStatus" value="<%= String.valueOf(RssConstants.RSS_STATUS_REJECT) %>" />
	<portlet:param name="rssFeedsId" value="<%= String.valueOf(feed.getRssFeedsId()) %>" />
</portlet:actionURL>

<aui:button href="<%= rejectURL %>"
	value="rss-reject"
/>
<%}%>
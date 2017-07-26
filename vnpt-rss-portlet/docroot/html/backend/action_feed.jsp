<%@ include file="../init.jsp" %>

<%
String randomId = StringPool.BLANK;

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

RssFeeds feed = (RssFeeds)row.getObject();

Long rssCategoryId = (Long)row.getParameter("rssCategoryId");
if(rssCategoryId != null) {
	System.out.println("rssCategoryId 223 :" + rssCategoryId);
}

String[] rssId = ParamUtil.getParameterValues(request, "rssCategoryId");
if(rssId != null) {
	for (int i =0 ; i< rssId.length; i++) {
		System.out.println("rssId :"+rssId[i]);
	}
}

%>

<portlet:actionURL var="sendApproveURL">
	<portlet:param name="action" value="<%= RssConstants.SEND_FOR_APPROVE %>" />
	<portlet:param name="title" value="<%= feed.getTitle() %>"/>
	<portlet:param name="url" value="<%= feed.getUrl() %>" />
	<portlet:param name="publishedDate" value='<%= feed.getPublishedDate() != null ? dateFormatDate.format(feed.getPublishedDate()) : ""  %>' />
	<portlet:param name="content" value="<%= feed.getContent() %>" />
</portlet:actionURL>

<aui:button href="<%= sendApproveURL %>" 
	value="rss-send-for-approve"
/>

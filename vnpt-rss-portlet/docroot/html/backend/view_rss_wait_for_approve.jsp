<%@ include file="../init.jsp" %>
<%
PortletURL portletURL = (PortletURL)request.getAttribute("view.jsp-portletURL");

%>

<liferay-ui:success key="rss-feed-reject" message="rss-feed-reject"/> 

<liferay-ui:success key="rss-feed-publish-success" message="rss-feed-publish-success"/>

<aui:form action="<%= portletURL.toString() %>" method="post" name="fm">
<liferay-ui:search-container
	searchContainer="<%= new RssFeedsSearch(renderRequest, portletURL) %>"
>
	<liferay-ui:search-form page="/html/backend/search.jsp"
		searchContainer="<%= searchContainer %>"
		servletContext="<%= this.getServletContext() %>"
	/>

	<liferay-ui:search-container-results
		results="<%= RssFeedsLocalServiceUtil.getRssFeeds(searchContainer, searchContainer.getStart(), searchContainer.getEnd(), RssConstants.RSS_STATUS_WAITING, scopeGroupId) %>"
		total="<%= RssFeedsLocalServiceUtil.countRssFeeds(searchContainer, RssConstants.RSS_STATUS_WAITING, scopeGroupId) %>"
	/>

	<liferay-ui:search-container-row
		className="com.vnpt.portal.rss.model.RssFeeds"
		modelVar="aRssFeeds"
	>

		<liferay-ui:search-container-column-text
			name="rss-title"
			value="<%= HtmlUtil.escape(aRssFeeds.getTitle()) %>"
			href="<%= _escapeJavaScriptLink(aRssFeeds.getUrl()) %>"
			target="_blank"
		/>

		<liferay-ui:search-container-column-text
			name="rss-content"
			value='<%= aRssFeeds.getContent() == null ? "" : aRssFeeds.getContent() %>'
		/>

		<liferay-ui:search-container-column-text
			name="status"
			value='<%= aRssFeeds.getStatus() == 0 ? "Waiting" : "Rejected" %>'
		/>

		<liferay-ui:search-container-column-jsp
			align="center"
			path="/html/backend/action_wait_feed.jsp"
		/>

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
</aui:form>
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
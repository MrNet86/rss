<%@ include file="../init.jsp" %>
<%
PortletURL portletURL = (PortletURL)renderResponse.createRenderURL();

%>
<aui:form action="<%= portletURL.toString() %>" method="post" name="fm">
	<liferay-ui:search-container
		rowChecker="<%= new RowChecker(renderResponse) %>"
		searchContainer="<%= new RssFeedsSearch(renderRequest, portletURL) %>"
	>
		<liferay-ui:search-form page="/html/backend/search.jsp"
			searchContainer="<%= searchContainer %>"
			servletContext="<%= this.getServletContext() %>"
		/>
		
		<liferay-ui:search-container-results
			results="<%= RssFeedsLocalServiceUtil.getRssFeedsPublished(searchContainer, searchContainer.getStart(), searchContainer.getEnd(), RssConstants.RSS_STATUS_PUBLISHED, scopeGroupId) %>"
			total="<%= RssFeedsLocalServiceUtil.countRssFeedsPublished(searchContainer, RssConstants.RSS_STATUS_PUBLISHED, scopeGroupId) %>"
		/>
	
		<liferay-ui:search-container-row
			className="com.vnpt.portal.rss.model.RssFeeds"
			modelVar="aRssFeeds"
		>
				
			<liferay-ui:search-container-column-text
				name="title"
				value="<%= HtmlUtil.escape(aRssFeeds.getTitle()) %>"
				href="<%= _escapeJavaScriptLink(aRssFeeds.getUrl()) %>"
				target="_blank"
			/>
			
			<liferay-ui:search-container-column-text property="status" />
	
			<liferay-ui:search-container-column-text property="content" />
	
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
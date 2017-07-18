<%@ include file="../init.jsp" %>
<%
PortletURL portletURL = (PortletURL)renderResponse.createRenderURL();
%>
<aui:form action="<%= portletURL.toString() %>" method="post" name="fm">
<liferay-ui:search-container>
	<liferay-ui:search-container-results
		results="<%= RssFeedsLocalServiceUtil.getRssFeedses(searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= RssFeedsLocalServiceUtil.getRssFeedsesCount() %>"
	/>

	<liferay-ui:search-container-row
		className="com.vnpt.portal.rss.model.RssFeeds"
		modelVar="aRssFeeds"
	>
			
		<liferay-ui:search-container-column-text property="title" />

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

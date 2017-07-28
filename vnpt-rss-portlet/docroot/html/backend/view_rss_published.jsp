<%@ include file="../init.jsp" %>
<%
PortletURL portletURL = (PortletURL)request.getAttribute("view.jsp-portletURL");

%>

<portlet:actionURL var="deleteURL" secure="true">
	<portlet:param name="action" value="<%= RssConstants.PROCESS_FEED %>" />
	<portlet:param name="rssStatus" value="<%= String.valueOf(RssConstants.RSS_STATUS_REJECT) %>" />
</portlet:actionURL>

<aui:form action="<%= portletURL.toString() %>" method="post" name="fm">

	<aui:input name="deleteIds" type="hidden" />
	
	<liferay-ui:search-container
		searchContainer="<%= new RssFeedsSearch(renderRequest, portletURL) %>"
		rowChecker="<%= new RowChecker(renderResponse) %>"
	>
		<liferay-ui:search-form page="/html/backend/search.jsp"
			searchContainer="<%= searchContainer %>"
			servletContext="<%= this.getServletContext() %>"
		/>

		<liferay-ui:search-container-results
			results="<%= RssFeedsLocalServiceUtil.getRssFeeds(searchContainer, searchContainer.getStart(), searchContainer.getEnd(), RssConstants.RSS_STATUS_PUBLISHED, scopeGroupId) %>"
			total="<%= RssFeedsLocalServiceUtil.countRssFeeds(searchContainer, RssConstants.RSS_STATUS_PUBLISHED, scopeGroupId) %>"
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
				name="rss-publishedDate"
				value='<%= aRssFeeds.getPublishedDate() == null ? "" : dateFormatDate.format(aRssFeeds.getPublishedDate()) %>'
			/>

		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
	
	<aui:button-row>
		<aui:button onClick='<%= renderResponse.getNamespace() + "rejectPublic();" %>' type="submit" />
	</aui:button-row>
	
</aui:form>

<aui:script>

Liferay.provide(
	window,
	'<portlet:namespace />rejectPublic',
	function() {
		var checkBoxValue = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
		
		if(checkBoxValue==""||checkBoxValue==null){
	    	alert('<%= UnicodeLanguageUtil.get(pageContext, "Please select atleast one article to reject") %>');
	     	return false;
	 	}
		
	 	if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "Are you sure you want to reject the selected article? ") %>')) {
	     	document.<portlet:namespace />fm.<portlet:namespace />deleteIds.value = checkBoxValue;
	     	submitForm(document.<portlet:namespace />fm, "<%= deleteURL %>");                
	 	}			
	},
	['liferay-util-list-fields']
);


</aui:script>
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
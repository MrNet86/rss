<%@ include file="../init.jsp" %>
<%
PortletURL portletURL = (PortletURL)request.getAttribute("view.jsp-portletURL");

List<RssCategory> lstRssCategory = RssCategoryLocalServiceUtil.searchRssCategory(-1, -1, scopeGroupId);
%>

<liferay-ui:success key="rss-feed-reject" message="rss-feed-reject"/>

<liferay-ui:success key="rss-feed-publish-success" message="rss-feed-publish-success"/>

<aui:form action="<%= portletURL.toString() %>" method="post" name="fm">

	<aui:input name="rssFeedsIds" type="hidden" />

	<liferay-ui:search-container
		searchContainer="<%= new RssFeedsSearch(renderRequest, portletURL) %>"
		rowChecker="<%= new RowChecker(renderResponse) %>"
	>
		<aui:nav-bar>
			<aui:nav-bar-search cssClass="pull-right">
				<liferay-ui:search-form page="/html/backend/search.jsp"
					searchContainer="<%= searchContainer %>"
					servletContext="<%= this.getServletContext() %>"
				/>
			</aui:nav-bar-search>
		</aui:nav-bar>

		<liferay-ui:search-container-results
			results="<%= RssFeedsLocalServiceUtil.searchRssFeeds(searchContainer, searchContainer.getStart(), searchContainer.getEnd(), RssConstants.RSS_STATUS_WAITING, scopeGroupId) %>"
			total="<%= RssFeedsLocalServiceUtil.countRssFeeds(searchContainer, RssConstants.RSS_STATUS_WAITING, scopeGroupId) %>"
		/>

		<liferay-ui:search-container-row
			className="com.vnpt.portal.rss.model.RssFeeds"
			modelVar="aRssFeeds"
			keyProperty="rssFeedsId"
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
				name="view-rss-category"
				value='<%= RssCategoryLocalServiceUtil.getRssCategoryNameById(lstRssCategory, aRssFeeds.getRssCategoryId())%>'
			/>

			<liferay-ui:search-container-column-text
				name="rss-created-date"
				value='<%= aRssFeeds.getCreatedDate() == null ? "" : dateFormatDate.format(aRssFeeds.getCreatedDate()) %>'
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

	<aui:button-row>
		<aui:button onClick='<%= renderResponse.getNamespace() + "rejectPublic();" %>' name="rss-unpublished" value="rss-unpublished"/>
	</aui:button-row>

</aui:form>

<aui:script use="aui-base,liferay-portlet-url,aui-node">

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
	     	document.<portlet:namespace />fm.<portlet:namespace />rssFeedsIds.value = checkBoxValue;
	     	document.<portlet:namespace />fm.method = 'post';
	     	submitForm(document.<portlet:namespace />fm, '<portlet:actionURL><portlet:param name="action" value="<%= RssConstants.PROCESS_FEED %>" /><portlet:param name="rssStatus" value="<%= String.valueOf(RssConstants.RSS_STATUS_UNPUBLISHED) %>" /></portlet:actionURL>');
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
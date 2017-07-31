<%@ include file="../init.jsp" %>

<%
	
	// get portletPreferenes parameter
	long rssCategoryId = GetterUtil.getLong(portletPreferences.getValue("rssCategoryId", StringPool.TRUE), 0);
	int rssDisplayItem = GetterUtil.getInteger(portletPreferences.getValue("rssDisplayItem", StringPool.TRUE), 5);
	String portletTitle = portletPreferences.getValue("rssPortletTitle", StringPool.BLANK);
	System.out.println("view.jsp rssCategoryId :"+rssCategoryId);
	
	if(Validator.isNotNull(portletTitle)) {
		renderResponse.setTitle(portletTitle);
	}
	
	PortletURL portletURL = renderResponse.createRenderURL();

	SearchContainer<RssFeeds> searchContainer =
		new SearchContainer<RssFeeds>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, displayItem, portletURL, null, null);

	if (!paginationType.equals("none")) {
		searchContainer.setDelta(displayItem);
		searchContainer.setDeltaConfigurable(false);
	}

	List<RssFeeds> results = RssFeedsLocalServiceUtil.searchRssFeedsByCategory(0, rssDisplayItem, RssConstants.RSS_STATUS_PUBLISHED, 0, rssCategoryId);

	int total = RssFeedsLocalServiceUtil.countRssFeeds(searchContainer, RssConstants.RSS_STATUS_PUBLISHED, scopeGroupId);

	searchContainer.setTotal(total);

	searchContainer.setResults(results);

	request.setAttribute("view.jsp-searchContainer", searchContainer);
	request.setAttribute("view.jsp-total", total);
	request.setAttribute("view.jsp-results", results);
%>

<c:if test="<%=Validator.isNotNull(portletTitle) %>" >
	<h4 class="news-header-title" style="display: none">
		<%--
		<c:choose>
			<c:when test="<%= Validator.isNotNull(linkedLayoutURL) %>">
				<a href="<%= linkedLayoutURL %>" title="<%= HtmlUtil.escape(titleViewRss) %>"><%= HtmlUtil.escape(titleViewRss) %></a>
			</c:when>
			<c:otherwise>
				<span><%= HtmlUtil.escape(titleViewRss) %></span>
			</c:otherwise>
		</c:choose>
		 --%>
		<span><%= HtmlUtil.escape(portletTitle) %></span>
	</h4>
</c:if>

<liferay-util:include page="/html/frontend/ds_news_5.jsp" servletContext="<%= this.getServletContext() %>" />

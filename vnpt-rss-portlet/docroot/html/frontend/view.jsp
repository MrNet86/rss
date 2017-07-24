<%@ include file="../init.jsp" %>
<%--
<c:if test="<%=Validator.isNotNull(portletTitle) %>" >
	<h4 class="news-header-title" style="display: none">
		<c:choose>
			<c:when test="<%= Validator.isNotNull(linkedLayoutURL) %>">
				<a href="<%= linkedLayoutURL %>" title="<%= HtmlUtil.escape(portletTitle) %>"><%= HtmlUtil.escape(portletTitle) %></a>
			</c:when>
			<c:otherwise>
				<span><%= HtmlUtil.escape(portletTitle) %></span>
			</c:otherwise>
		</c:choose>
	</h4>
</c:if>
 --%>
<%
	PortletURL portletURL = renderResponse.createRenderURL();

	SearchContainer<RssFeeds> searchContainer =
		new SearchContainer<RssFeeds>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, displayItem, portletURL, null, null);

	if (!paginationType.equals("none")) {
		searchContainer.setDelta(displayItem);
		searchContainer.setDeltaConfigurable(false);
	}

	List<RssFeeds> results = RssFeedsLocalServiceUtil.getRssFeeds(searchContainer, searchContainer.getStart(), searchContainer.getEnd(), RssConstants.RSS_STATUS_PUBLISHED, scopeGroupId);

	int total = RssFeedsLocalServiceUtil.countRssFeeds(searchContainer, RssConstants.RSS_STATUS_PUBLISHED, scopeGroupId);

	searchContainer.setTotal(total);

	searchContainer.setResults(results);

	request.setAttribute("view.jsp-searchContainer", searchContainer);
	request.setAttribute("view.jsp-total", total);
	request.setAttribute("view.jsp-results", results);
%>

<liferay-util:include page="/html/frontend/ds_news_5.jsp" servletContext="<%= this.getServletContext() %>" />

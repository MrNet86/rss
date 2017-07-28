<%@ include file="../init.jsp" %>
<%
PortletURL portletURL = (PortletURL)request.getAttribute("view.jsp-portletURL");
%>

<liferay-ui:success key="update-rss-category-success" message="update-rss-category-success"/>
<liferay-ui:success key="delete-rss-category-success" message="delete-rss-category-success"/>

<liferay-ui:error key="error-rss-category-exists-in-config" message="error-rss-category-exists-in-config"/>
<liferay-ui:error key="error-rss-category-exists-in-feed" message="error-rss-category-exists-in-feed"/>

<aui:form action="<%= portletURL.toString() %>" method="post" name="fm">

	<liferay-util:include page="/html/backend/toolbar.jsp"
		servletContext="<%= this.getServletContext() %>"
	/>

	<liferay-ui:search-container >

		<liferay-ui:search-container-results
			results="<%= RssCategoryLocalServiceUtil.searchRssCategory(searchContainer.getStart(), searchContainer.getEnd(), scopeGroupId) %>"
			total="<%= RssCategoryLocalServiceUtil.countRssCategory(scopeGroupId) %>"
		/>

		<liferay-ui:search-container-row
			className="com.vnpt.portal.rss.model.RssCategory"
			modelVar="aRssCategory"
		>
			
			<portlet:renderURL var="editURL" >
				<portlet:param name="action" value="<%= RssConstants.CREATE_RSS_CATEGORY %>" />
				<portlet:param name="rssCategoryId" value="<%= String.valueOf(aRssCategory.getRssCategoryId()) %>"/>
			</portlet:renderURL>

			<liferay-ui:search-container-column-text
				name="rss-category-name"
				value="<%= HtmlUtil.escape(aRssCategory.getName()) %>"
				href="<%= editURL %>"
			/>

			<liferay-ui:search-container-column-text
				name="rss-description"
				value='<%= aRssCategory.getDescription() == null ? "" : HtmlUtil.escape(aRssCategory.getDescription()) %>'
				href="<%= editURL %>"
			/>
			
			<liferay-ui:search-container-column-text
				name="action"
			>
				<liferay-ui:icon-menu>
					<portlet:actionURL var="deleteURL">
						<portlet:param name="action" value="<%= RssConstants.DELETE_RSS_CATEGORY %>" />
						<portlet:param name="rssCategoryId" value="<%= String.valueOf(aRssCategory.getRssCategoryId()) %>"/>
					</portlet:actionURL>
					<liferay-ui:icon-delete url="<%=deleteURL%>" />
				</liferay-ui:icon-menu>
			</liferay-ui:search-container-column-text>
		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</aui:form>
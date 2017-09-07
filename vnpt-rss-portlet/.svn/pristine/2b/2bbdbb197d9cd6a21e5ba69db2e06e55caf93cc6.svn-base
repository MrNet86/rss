<%@ include file="../init.jsp" %>
<%
PortletURL portletURL = (PortletURL)request.getAttribute("view.jsp-portletURL");
%>

<aui:form action="<%= portletURL.toString() %>" method="post" name="fm">
	<liferay-ui:search-container>		

		<liferay-ui:search-container-results
			results="<%= RssCategoryLocalServiceUtil.getRssCategories(-1, -1) %>"
			total="<%= RssCategoryLocalServiceUtil.getRssCategoriesCount() %>"
		/>

		<liferay-ui:search-container-row
			className="com.vnpt.portal.rss.model.RssCategory"
			modelVar="aRssCategory"
		>

			<liferay-ui:search-container-column-text
				name="rss-category-name"
				value="<%= HtmlUtil.escape(aRssCategory.getName()) %>"
			/>

			<liferay-ui:search-container-column-text
				name="rss-description"
				value='<%= aRssCategory.getDescription() == null ? "" : HtmlUtil.escape(aRssCategory.getDescription()) %>'
			/>

		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</aui:form>
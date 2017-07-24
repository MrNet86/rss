<%@ include file="../init.jsp"%>

<%
PortletURL portletURL = renderResponse.createRenderURL();

String toolbarItem = ParamUtil.getString(request, "toolbarItem", "view-all");
%>

<aui:nav-bar>
	<aui:nav>

		<portlet:renderURL var="viewRssCatURL">
			<portlet:param name="action" value="<%= RssConstants.VIEW_RSS_CATEGORY %>"/>
			<portlet:param name="tabs1" value="<%= RssConstants.VIEW_RSS_CATEGORY %>"/>
		</portlet:renderURL>
		<aui:nav-item label="Common.ViewAll" iconCssClass="icon-list"
			href="<%= viewRssCatURL %>"
			selected='<%= "view-all".equals(toolbarItem) %>'
		/>

		<portlet:renderURL var="createRssCatURL">
			<portlet:param name="action" value="<%= RssConstants.UPDATE_RSS_CATEGORY %>"/>
			<portlet:param name="toolbarItem" value="add"/>
		</portlet:renderURL>
		<aui:nav-item label="Common.Add" iconCssClass="icon-plus"
			href="<%= createRssCatURL %>"
			selected='<%= "add".equals(toolbarItem) %>'
		/>

	</aui:nav>
</aui:nav-bar>
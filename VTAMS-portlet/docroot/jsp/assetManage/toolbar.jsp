<%@ include file="/jsp/init.jsp"%>

<%
PortletURL portletURL = renderResponse.createRenderURL();

String toolbarItem = ParamUtil.getString(request, "toolbarItem", "view-all");
%>

<aui:nav-bar>
	<aui:nav>

		<portlet:renderURL var="viewAllManageReqURL">
			<portlet:param name="action" value="<%= ActionConstants.VIEW_MANAGE %>"/>
			<portlet:param name="tabs1" value="<%= ActionConstants.VIEW_ALL_MANAGE_REQ %>"/>
		</portlet:renderURL>
		<aui:nav-item label="Common.ViewAll" iconCssClass="icon-list"
			href="<%= viewAllManageReqURL %>"
			selected='<%= "view-all".equals(toolbarItem) %>'
		/>

		<portlet:renderURL var="createManageReqURL">
			<portlet:param name="action" value="<%= ActionConstants.VIEW_MANAGE %>"/>
			<portlet:param name="tabs1" value="<%= ActionConstants.CREATE_MANAGE_REQ %>"/>
			<portlet:param name="toolbarItem" value="add"/>
		</portlet:renderURL>
		<aui:nav-item label="Common.Add" iconCssClass="icon-plus"
			href="<%= createManageReqURL %>"
			selected='<%= "add".equals(toolbarItem) %>'
		/>

	</aui:nav>
</aui:nav-bar>
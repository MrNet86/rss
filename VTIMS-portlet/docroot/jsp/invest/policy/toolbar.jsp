<%@page import="com.liferay.portal.security.permission.ActionKeys"%>
<%@page import="com.viettel.ims.permission.InvestPolicyModelPermission"%>
<%@page import="com.liferay.portal.security.permission.PermissionChecker"%>
<%@page import="com.viettel.ims.common.ActionConstants"%>
<%@include file="/jsp/init.jsp" %>

<%
	String backURL = ParamUtil.getString(request, "backURL");
	System.out.println("toolbar backURL :"+backURL);

	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setWindowState(windowState.NORMAL);

	String toolbarItem = ParamUtil.getString(request, "toolbarItem", "view-all");
	System.out.println("toolbar Policy :"+toolbarItem);

// 	long scopeGroupId = themeDisplay.getScopeGroupId();
	boolean isView = InvestPolicyModelPermission.contains(permissionChecker, scopeGroupId, "VIEW_INVEST_POLICY");
	boolean isAdd = InvestPolicyModelPermission.contains(permissionChecker, scopeGroupId, "ADD_INVEST_POLICY");
	boolean isDelete = InvestPolicyModelPermission.contains(permissionChecker, scopeGroupId, "DELETE_INVEST_POLICY");
	System.out.println("isView :"+isView +" || isAdd :"+isAdd +" || isDelete :"+isDelete);
%>

<aui:nav-bar>
	<aui:nav>
		<%
			portletURL.setParameter("action", ActionConstants.VIEW_INVEST_POLICY);
		%>
		<aui:nav-item label="Common.ViewAll" iconCssClass="icon-list"
			href="<%= portletURL.toString() %>"
			selected='<%= "view-all".equals(toolbarItem) %>' />

		<portlet:renderURL var="viewPolicyURL" windowState="normal">
			<portlet:param name="action" value="<%= ActionConstants.VIEW_INVEST_POLICY %>" />
		</portlet:renderURL>
		<c:if test='<%= isAdd %>'>
			<portlet:renderURL var="editPolicyURL" windowState="normal">
				<portlet:param name="action" value="<%= ActionConstants.EDIT_INVEST_POLICY %>" />
				<portlet:param name="toolbarItem" value="add"/>
			</portlet:renderURL>
			<aui:nav-item label="Common.Add" iconCssClass="icon-list"
				href="<%= editPolicyURL %>"
				selected='<%= "add".equals(toolbarItem) %>' />
		</c:if>
	</aui:nav>
</aui:nav-bar>
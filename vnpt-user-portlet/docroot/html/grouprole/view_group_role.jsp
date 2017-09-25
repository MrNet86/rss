<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="../init.jsp"%>
<%

PortletURL portletURL = (PortletURL) request.getAttribute("view.jsp-portletURL");
SearchContainer<PermissionGroup> searchContainer = null;
searchContainer = new SearchContainer<PermissionGroup>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 
						SearchContainer.DEFAULT_DELTA, portletURL, null, StringPool.BLANK);


System.out.println("user :"+user.getEmailAddress() +" ||groupId :"+user.getGroupId()+" || scopeGroupId :"+scopeGroupId);
// get all regular role of user
List<PermissionGroup> lstPerGroup = PermissionGroupLocalServiceUtil.getPermissionGroups(-1, -1);
for (PermissionGroup role : lstPerGroup) {
	System.out.println("groupName :"+role.getGroupName() +" || groupCode :"+role.getGroupCode());
}

%>
<aui:form action="" method="post" name="fm">
	
	<liferay-ui:search-container
		searchContainer="<%= searchContainer %>"
		var="roleSearchContainer"
	>
	
		<liferay-ui:search-container-results 
			results="<%= PermissionGroupLocalServiceUtil.findByActiveGroupId(scopeGroupId, 1, searchContainer.getStart(), searchContainer.getEnd()) %>"
			total="<%= PermissionGroupLocalServiceUtil.countByfindByActiveGroupId(scopeGroupId, 1) %>"
		/>
	
		<liferay-ui:search-container-row
			className="com.vnpt.portlet.user.model.PermissionGroup"
			modelVar="aPerGroup"
			keyProperty="permissionGroupId"
		>
		
			<liferay-ui:search-container-column-text property="permissionGroupId" />
			
			<liferay-ui:search-container-column-text property="groupName" />
			
			<liferay-ui:search-container-column-text property="groupCode" />
			
			<liferay-ui:search-container-column-text property="description" />
			
			<liferay-ui:search-container-column-text name="role">
				<%
					String sites = "";
					List<Role> lstRole = GroupRolesLocalServiceUtil.getRolesByPerGroupId(aPerGroup.getPermissionGroupId());
					for(Role role : lstRole) {
						sites += role.getName() + ", ";
					}
					System.out.println("sites :"+sites);
				%>
				<%= sites %>
			</liferay-ui:search-container-column-text>
													
		</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
		
</aui:form>
<%@page import="com.vnpt.portlet.user.permission.VnptPermission"%>
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

%>
<aui:form action="" method="post" name="fm">
	
	<liferay-ui:success key="update-group-role-successfull" message="cap-nhat-thanh-cong-nhom-quyen" />
	
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
		
			<liferay-ui:search-container-column-text 
				name="ten-nhom-quyen"
				value="<%= aPerGroup.getGroupName() %>"
			/>
			
			<liferay-ui:search-container-column-text 
				name="ma-nhom-quyen"
				value="<%= aPerGroup.getGroupCode() %>"
			/>
			
			<liferay-ui:search-container-column-text 
				name="mo-ta" 
				value="<%= aPerGroup.getDescription() %>"
			/>
			<%
				String sites = "";
				List<Role> lstRole = GroupRolesLocalServiceUtil.getRolesByPerGroupId(aPerGroup.getPermissionGroupId());
				for(Role role : lstRole) {
					sites += role.getName() + ", ";
				}
			%>
			<liferay-ui:search-container-column-text 
				name="loai-nhom-quyen" 
				value="<%= sites %>"
			/>
			
			<%
			if (VnptPermission.contains(permissionChecker, scopeGroupId, VnptConstants.USER_PER_ADMIN)) {
			%>
			<liferay-ui:search-container-column-jsp
				align="center"
				path="/html/grouprole/action_group_role.jsp"
			/>
			<%
			}
			%>	
		</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
		
</aui:form>
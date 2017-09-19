<%@page import="com.liferay.portal.model.Role"%>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../init.jsp" %>

<%
PortletURL portletURL = (PortletURL) request.getAttribute("view.jsp-portletURL");
SearchContainer<Role> searchContainer = null;
searchContainer = new SearchContainer<Role>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 
						SearchContainer.DEFAULT_DELTA, portletURL, null, StringPool.BLANK);
%>

<aui:form action="" method="get" name="fm">
	
	<liferay-ui:search-container
		searchContainer="<%= searchContainer %>"
		var="roleSearchContainer"
	>
	
		<liferay-ui:search-container-results
			results="<%= RoleLocalServiceUtil.getRoles(roleSearchContainer.getStart(), roleSearchContainer.getEnd()) %>"
			total="<%= RoleLocalServiceUtil.getRolesCount() %>"
		/>
	
		<liferay-ui:search-container-row
			className="com.liferay.portal.model.Role"
			modelVar="aRole"
			keyProperty="roleId"
		>
		
			<liferay-ui:search-container-column-text property="roleId" />
			
			<liferay-ui:search-container-column-text property="name" />
			
			<liferay-ui:search-container-column-text property="title" />
			
			<liferay-ui:search-container-column-text property="description" />
			
<%-- 			<liferay-ui:search-container-column-jsp --%>
<%-- 				align="center" --%>
<%-- 				path="/html/user/action_user.jsp" --%>
<%-- 			/> --%>
											
		</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
	
</aui:form>

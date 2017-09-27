<%@page import="com.liferay.portal.model.Role"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../init.jsp" %>

<%
String randomId = StringPool.BLANK;

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

PermissionGroup _aPerRole = (PermissionGroup)row.getObject();

%>

<portlet:renderURL var="editURL">
	<portlet:param name="action" value="<%= VnptConstants.EDIT_GROUP_ROLE %>" />
	<portlet:param name="tabs1" value="<%= VnptConstants.EDIT_GROUP_ROLE %>" />
	<portlet:param name="permissionGroupId" value="<%= String.valueOf(_aPerRole.getPermissionGroupId()) %>"/>	
</portlet:renderURL>

<div class="list-button">
	<a class="btn btn-sm btn-primary" href="<%= editURL %>">
		<i class="fa fa-edit"></i>
	</a>
</div>

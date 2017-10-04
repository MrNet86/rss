<%@page import="com.liferay.portal.DuplicateRoleException"%>
<%@page import="com.liferay.portal.RoleNameException"%>
<%@page import="com.liferay.portal.RequiredRoleException"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="../init.jsp"%>

<%
String backURL = (String)request.getAttribute("backURL");
String name = "", title = "", description = "";
long roleId = 0;
Role role = (Role)request.getAttribute("role");
if(role != null) {
	roleId = role.getRoleId();
	name = role.getName();
	title = LanguageUtil.get(pageContext, role.getTitle()) ;
	
	System.out.println("title :"+title+" || :: "+LanguageUtil.get(portletConfig, themeDisplay.getLocale(), role.getTitle()));
	description = role.getDescription();
}
%>

<portlet:actionURL var="updateURL">
	<portlet:param name="action" value="<%= VnptConstants.UPDATE_ROLE %>"/>
</portlet:actionURL>

<aui:form action="<%= updateURL %>" method="post" name="fm">
	
	<liferay-ui:error exception="<%= DuplicateRoleException.class %>" message="please-enter-a-unique-name" />
	<liferay-ui:error exception="<%= RequiredRoleException.class %>" message="old-role-name-is-a-required-system-role" />
	<liferay-ui:error exception="<%= RoleNameException.class %>" message="please-enter-a-valid-name" />
	
	<liferay-ui:success key="update-role-successfull" message="update-role-successfull" />

	<aui:input type="hidden" name="roleId" value="<%= roleId %>"/>
			
	<div class="row">
		<div class="col-md-12">
			<h1 class="page-header">Cập nhật loại nhóm quyền</h1>
		</div>
	</div>
		
	<div class="row col-md-12 panel top-orange panel-body">
		
		<div class="form-group row">
			<div class="col-md-2 col-sm-3 col-xs-12">
				<label for="#"><liferay-ui:message key="ten-loai-nhom-quyen"/></label>
			</div>
			<div class="col-md-4 col-sm-3 col-xs-12">
				<aui:input name="title" label="" cssClass="form-control" value="<%= title %>"/>
			</div>
		</div>
		
		<div class="form-group row">
			<div class="col-md-2 col-sm-3 col-xs-12">
				<label for="#"><liferay-ui:message key="ma-loai-nhom-quyen"/></label>
			</div>
			<div class="col-md-4 col-sm-3 col-xs-12">
				<aui:input name="name" label="" cssClass="form-control" value="<%= name %>"/>
			</div>
		</div>
		
		<div class="form-group row">
			<div class="col-md-2 col-sm-3 col-xs-12">
				<label for="#"><liferay-ui:message key="mo-ta"/></label>
			</div>
			<div class="col-md-4 col-sm-3 col-xs-12">
				<aui:input name="description" type="textarea" label="" value="<%= description %>" 
					rows="5" cols="30" cssClass="form-control"/>
			</div>
		</div>
	</div>
	<div class="separator"><!-- --></div>
	<aui:button-row>
		<aui:button type="submit" icon="icon-save" />
	</aui:button-row>
	
	
</aui:form>
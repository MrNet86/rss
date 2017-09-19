<%@page import="com.liferay.portal.model.Role"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="../init.jsp"%>

<%
String backURL = (String)request.getAttribute("backURL");
String name = "", title = "", description = "";

Role role = (Role)request.getAttribute("role");
if(role != null) {
	name = role.getName();
	title = role.getTitle();
	description = role.getDescription();
}
%>

<portlet:actionURL var="updateURL">
	<portlet:param name="action" value="<%= VnptConstants.UPDATE_ROLE %>"/>
</portlet:actionURL>

<aui:form action="<%= updateURL %>" method="post" name="fm">
	
	<div class="row">
		<div class="col-md-12">
			<h1 class="page-header">Tạo mới nhóm quyền</h1>
		</div>
	</div>
		
	<div class="row col-md-12 panel top-orange panel-body">
		<div class="form-group row">
			<div class="col-md-2 col-sm-3 col-xs-12">
				<label for="#"><liferay-ui:message key="roleType"/></label>
			</div>
			<div class="col-md-4 col-sm-3 col-xs-12">
				<aui:select name="type" label="" cssClass="form-control">
					<aui:option label="regular" value="1" />
					<aui:option label="site" value="2" />
					<aui:option label="organization" value="3" />
				</aui:select>
			</div>
		</div>

		<div class="form-group row">
			<div class="col-md-2 col-sm-3 col-xs-12">
				<label for="#"><liferay-ui:message key="roleName"/></label>
			</div>
			<div class="col-md-4 col-sm-3 col-xs-12">
				<aui:input name="name" label="" cssClass="form-control" value="<%= name %>"/>
			</div>
		</div>
		
		<div class="form-group row">
			<div class="col-md-2 col-sm-3 col-xs-12">
				<label for="#"><liferay-ui:message key="roleTitle"/></label>
			</div>
			<div class="col-md-4 col-sm-3 col-xs-12">
				<aui:input name="title" label="" cssClass="form-control" value="<%= title %>"/>
			</div>
		</div>
		
		<div class="form-group row">
			<div class="col-md-2 col-sm-3 col-xs-12">
				<label for="#"><liferay-ui:message key="description"/></label>
			</div>
			<div class="col-md-4 col-sm-3 col-xs-12">
				<aui:input name="description" type="textarea" label="" value="<%= description %>" 
					rows="5" cols="30" cssClass="form-control"/>
			</div>
		</div>
	</div>
	<div class="separator"><!-- --></div>
	<aui:button-row>
		<aui:button type="submit" value="Command.Save"  icon="icon-save" />
		<aui:button type="cancel" value="Command.Cancel"  icon="icon-undo" href="<%= backURL %>" />
	</aui:button-row>
	
	
</aui:form>
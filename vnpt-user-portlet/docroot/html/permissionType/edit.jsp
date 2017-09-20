<%@page import="com.vnpt.portlet.user.model.impl.PermissionTypeImpl"%>
<%@page import="com.vnpt.portlet.user.model.PermissionType"%>
<%@ include file="../init.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String backURL = (String)request.getAttribute("backURL");

PermissionType perType = (PermissionType) request.getAttribute("perType");
if(perType == null) {
	perType = new PermissionTypeImpl();
} else {
	System.out.println("edit perType is not null");
}
%>

<portlet:actionURL var="updateURL">
	<portlet:param name="action" value="<%= VnptConstants.UPDATE_PERMISSION_TYPE %>"/>
</portlet:actionURL>

<aui:form action="<%= updateURL %>" method="post" name="fm">
	
	<liferay-ui:success key="update-successfull" message="update-successfull" />
	
	<aui:input name='permissionTypeId' type="hidden" value="<%= perType.getPermissionTypeId() %>" />
	
	<div class="row">
		<div class="col-md-12">
			<h1 class="page-header">Tạo mới loại nhóm quyền</h1>
		</div>
	</div>
		
	<div class="row col-md-12 panel top-orange panel-body">
		<div class="form-group row">
			<div class="col-md-2 col-sm-3 col-xs-12">
				<label for="#"><liferay-ui:message key="typeName"/></label>
			</div>
			<div class="col-md-4 col-sm-3 col-xs-12">
				<aui:input name="typeName" label="" type="text" value="<%= perType.getTypeName() %>" cssClass="form-control">
					<aui:validator name="required" />
					<aui:validator name="maxLength">100</aui:validator>
				</aui:input>
			</div>
		</div>

		<div class="form-group row">
			<div class="col-md-2 col-sm-3 col-xs-12">
				<label for="#"><liferay-ui:message key="typeCode"/></label>
			</div>
			<div class="col-md-4 col-sm-3 col-xs-12">
				<aui:input name="typeCode" label="" type="text" value="<%= perType.getTypeCode() %>" cssClass="form-control">
					<aui:validator name="maxLength">50</aui:validator>
				</aui:input>
			</div>
		</div>
		<div class="form-group row">
			<div class="col-md-2 col-sm-3 col-xs-12">
				<label for="#"><liferay-ui:message key="description"/></label>
			</div>
			<div class="col-md-4 col-sm-3 col-xs-12">
				<aui:input name="description" type="textarea" label="" value="<%= perType.getDescription() %>"
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
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="../init.jsp"%>
<%

//get all regular role of user
List<Role> lstRegularRole = RoleLocalServiceUtil.getUserRoles(user.getUserId());
for (Role role : lstRegularRole) {
	System.out.println("regular role :"+role.getName());
}

%>

<portlet:actionURL var="updateURL">
	<portlet:param name="action" value="<%= VnptConstants.UPDATE_GROUP_ROLE %>"/>
</portlet:actionURL>

<aui:form action="<%= updateURL %>" method="post" name="fm">
	
	<liferay-ui:error key="add-user-exception" message="add-user-exception" />	
	<liferay-ui:success key="update-group-role-successfull" message="update-group-role-successfull" />	
	
	<div class="row">
		<div class="col-md-12">
			<h1 class="page-header">Tạo mới nhóm quyền</h1>
		</div>
	</div>
	
	<div class="panel top-orange">
		<div class="panel-body">
			
			<div class="form-group">
				<div class="row">
					<div class="col-md-2 col-sm-3 col-xs-12">
						<label for="#"><liferay-ui:message key="role"/></label>
					</div>
					<div class="col-md-4 col-sm-9 col-xs-12">
						<aui:select name="roleId" label="" multiple="true" cssClass="form-control" required="true">
							<%
								for (Role role : lstRegularRole) {
							%>
								<aui:option value="<%= role.getRoleId() %>" selected=''>
									<%= role.getTitle() %>
								</aui:option>
							<%
								}
							%>
						</aui:select>
					</div>
				</div>
			</div>
			
			<div class="form-group">
				<div class="row">
					<div class="col-md-2 col-sm-3 col-xs-12">
		                <label for="#"><liferay-ui:message key="groupName"/></label>
		            </div>
		            <div class="col-md-4 col-sm-9 col-xs-12">
		                <aui:input type="text" name="groupName" label="" cssClass="form-control" value="">
							<aui:validator name="required" />
						</aui:input>
		            </div> 							
				</div>
			</div>
			
			<div class="form-group">
				<div class="row">
					<div class="col-md-2 col-sm-3 col-xs-12">
		                <label for="#"><liferay-ui:message key="groupCode"/></label>
		            </div>
		            <div class="col-md-4 col-sm-9 col-xs-12">
		                <aui:input type="text" name="groupCode" label="" 
		                	cssClass="form-control" value="">
							<aui:validator name="required" />
						</aui:input>
		            </div> 							
				</div>
			</div>
			
			<div class="form-group">
				<div class="row">
					<div class="col-md-2 col-sm-3 col-xs-12">
		                <label for="#"><liferay-ui:message key="description"/></label>
		            </div>
		            <div class="col-md-4 col-sm-9 col-xs-12">
		                <aui:input type="text" name="description" label="" 
		                	cssClass="form-control" value="" />								
		            </div> 							
				</div>
			</div>
			
		</div>
	</div>
		
		<div class="separator"><!-- --></div>
	<aui:button-row>
		<aui:button type="submit" value="Command.Save"  icon="icon-save" />
		<aui:button type="cancel" value="Command.Cancel"  icon="icon-undo" href="#" />
	</aui:button-row>
</aui:form>
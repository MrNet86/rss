<%@page import="java.util.Collections"%>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="../init.jsp"%>
<%
//get all regular role of user
List<Role> lstRegularRole = RoleLocalServiceUtil.getUserRoles(user.getUserId());

//list site where user login belong to
List<Group> groups = (List<Group>) request.getAttribute("groups");
if(groups == null || groups.isEmpty()) {
	 groups = Collections.emptyList();
}
PermissionGroup perGroup = (PermissionGroup) request.getAttribute("perGroup");
List<Role> lstRole = (List<Role>) request.getAttribute("lstRole");
%>

<portlet:actionURL var="updateURL">
	<portlet:param name="action" value="<%= VnptConstants.UPDATE_GROUP_ROLE %>"/>
</portlet:actionURL>

<aui:form action="<%= updateURL %>" method="post" name="fm">
	
	<liferay-ui:error key="add-user-exception" message="add-user-exception" />	
	
	<aui:input type="hidden" name="permissionGroupId" value='<%= perGroup != null ? perGroup.getPermissionGroupId() : ""%>'/>
	
	<div class="row">
		<div class="col-md-12">
			<h1 class="page-header">Cập nhật nhóm quyền</h1>
		</div>
	</div>
	
	<div class="panel top-orange">
		<div class="panel-body">
			
			<div class="form-group">
				<div class="row">
					<div class="col-md-2 col-sm-3 col-xs-12">
						<label for="#"><liferay-ui:message key="site"/></label>
					</div>
					<div class="col-md-4 col-sm-9 col-xs-12">
						<aui:select name="userSite" label="" cssClass="form-control" required="true">
							<%
								for (Group group : groups) {
							%>
								<aui:option value="<%= group.getGroupId() %>" selected="<%= group.getGroupId() == scopeGroupId.longValue() %>" >
									<%= group.getName() %>
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
						<label for="#"><liferay-ui:message key="loai-nhom-quyen"/></label>
					</div>
					<div class="col-md-4 col-sm-9 col-xs-12">
						<aui:select name="roleId" label="" multiple="true" cssClass="form-control" required="true">
							<%
								for (Role role : lstRegularRole) {
							%>
								<aui:option value="<%= role.getRoleId() %>" selected='<%= lstRole == null ? false : lstRole.contains(role) %>'>
									<%= role.getName() %>
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
		                <label for="#"><liferay-ui:message key="ten-nhom-quyen"/></label>
		            </div>
		            <div class="col-md-4 col-sm-9 col-xs-12">
		                <aui:input type="text" name="groupName" label="" cssClass="form-control" value='<%= perGroup != null ? perGroup.getGroupName() : "" %>'>
							<aui:validator name="required" />
							<aui:validator name="maxLength">50</aui:validator>
						</aui:input>
		            </div> 							
				</div>
			</div>
			
			<div class="form-group">
				<div class="row">
					<div class="col-md-2 col-sm-3 col-xs-12">
		                <label for="#"><liferay-ui:message key="ma-nhom-quyen"/></label>
		            </div>
		            <div class="col-md-4 col-sm-9 col-xs-12">
		                <aui:input type="text" name="groupCode" label="" 
		                	cssClass="form-control" value='<%= perGroup != null ? perGroup.getGroupCode() : "" %>'>
							<aui:validator name="required" />
							<aui:validator name="maxLength">50</aui:validator>
						</aui:input>
		            </div> 							
				</div>
			</div>
			
			<div class="form-group">
				<div class="row">
					<div class="col-md-2 col-sm-3 col-xs-12">
		                <label for="#"><liferay-ui:message key="mo-ta"/></label>
		            </div>
		            <div class="col-md-4 col-sm-9 col-xs-12">
		                <aui:input type="text" name="description" label="" 
		                	cssClass="form-control" value='<%= perGroup != null ? perGroup.getDescription() : "" %>' />								
		            </div>
				</div>
			</div>
			
		</div>
	</div>
		
		<div class="separator"><!-- --></div>
	<aui:button-row>
		<aui:button type="submit" icon="icon-save" />
	</aui:button-row>
</aui:form>
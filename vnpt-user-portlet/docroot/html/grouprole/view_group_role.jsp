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
<aui:form action="" method="post" name="fm">
	
<!-- 	<div class="row"> -->
<!-- 		<div class="col-md-12">		 -->
			<div class="panel top-orange">
				<div class="panel-body">
					
					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-3 col-xs-12">
								<label for="#"><liferay-ui:message key="site"/></label>
							</div>
							<div class="col-md-4 col-sm-9 col-xs-12">
								<aui:select name="userSite" label="" multiple="true" cssClass="form-control" required="true">
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
				                <aui:input type="text" name="groupName" label="" cssClass="form-control" value="<%=  %>">
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
				                	cssClass="form-control" value="<%=  %>">
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
				                	cssClass="form-control" value="<%=  %>" />								
				            </div> 							
						</div>
					</div>
					
					
				</div>
			</div>
<!-- 		</div> -->
<!-- 	</div> -->
		
</aui:form>
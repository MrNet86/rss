<%@page import="com.liferay.portal.model.Role"%>
<%@page import="com.liferay.portal.kernel.util.KeyValuePairComparator"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.KeyValuePair"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="../init.jsp" %>
<%
List<PermissionGroup> lstPerGroup = PermissionGroupLocalServiceUtil.findByActiveGroupId(scopeGroupId, 1, -1, -1) ;
%>
<portlet:actionURL var="updateURL">
	<portlet:param name="action" value="<%= VnptConstants.UPDATE_ASSIGN_USER %>"/>
</portlet:actionURL>

<portlet:resourceURL id="getResourceUserByGroupRole" var="getGroupRoleUserURL" />

<aui:form action="<%= updateURL %>" method="post" name="fm" onSubmit='<%= "event.preventDefault(); " + renderResponse.getNamespace() + "assignUser();" %>'>
	
	<aui:input name="assignUserIds" type="hidden" />
	
	<div class="panel top-orange">
		<div class="panel-body">
			<div class="form-group">
				<div class="row">
					<div class="col-md-2 col-sm-3 col-xs-12">
						<label for="#"><liferay-ui:message key="loai-nhom-quyen"/></label>
					</div>
					<div class="col-md-4 col-sm-9 col-xs-12">
						<aui:select label="" name="permissionGroupId" onChange='<%= renderResponse.getNamespace() + "getUserByGroupRole();" %>'>
							<%
								for (PermissionGroup perGroup : lstPerGroup) {
							%>
									<aui:option label="<%= perGroup.getGroupName() %>" value="<%= perGroup.getPermissionGroupId() %>" />
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
						<label ><liferay-ui:message key="user"/></label>
					</div>
					<div class="col-md-10 col-sm-9 col-xs-12">
						<aui:fieldset cssClass="available-languages" label="view-user">
							<%
							List<User> lstUser = new ArrayList<User>();
							List<Group> sites =  user.getMySiteGroups();
							for (Group group : sites) {
								if(group.getSite()) {
									lstUser.addAll(UserLocalServiceUtil.getGroupUsers(group.getGroupId()));
								}
							}
							if(!lstUser.isEmpty()) {
								lstUser.remove(0); // except test@liferay.com
							}
							
							// Left list	
							List<KeyValuePair> leftList = new ArrayList<KeyValuePair>();
						
// 							for (User aUser : lstUser) {
// 								leftList.add(new KeyValuePair(String.valueOf(aUser.getUserId()), aUser.getFullName() + " - " + aUser.getEmailAddress()));
// 							}
						
							// Right list
						
							List rightList = new ArrayList<KeyValuePair>();
// 							rightList = ListUtil.sort(rightList, new KeyValuePairComparator(false, true));
							%>
						
							<liferay-ui:input-move-boxes
								leftBoxName="availableUserIds"
								leftList="<%= leftList %>"
								leftReorder="true"
								leftTitle="none-group-role"
								rightBoxName="currentUserIds"
								rightList="<%= rightList %>"
								rightTitle="in-group-role"
							/>
						</aui:fieldset> 
					</div>
				</div>
			</div>
		</div>
	</div>	
	
	<aui:button-row>
		<aui:button type="submit" icon="icon-save" />
	</aui:button-row>
	
</aui:form>

<aui:script use="aui-base">
	
	AUI().ready(function(A) {
		<portlet:namespace />getUserByGroupRole();
	});
	
	Liferay.provide(
		window,
		'<portlet:namespace />assignUser',
		function() {

			document.<portlet:namespace />fm.<portlet:namespace />assignUserIds.value = Liferay.Util.listSelect(document.<portlet:namespace />fm.<portlet:namespace />availableUserIds);

			submitForm(document.<portlet:namespace />fm);
		},
		['liferay-util-list-fields']
	);

	Liferay.provide(
		window,
		'<portlet:namespace />getUserByGroupRole',
		function() {
			
			var	permissionGroupId = document.getElementById("<portlet:namespace/>permissionGroupId").value;
			
			AUI().use('aui-io-request', function(A){
				 
		        A.io.request('<%=  getGroupRoleUserURL %>', {
		               method: 'get',
		               dataType: 'json',
		               data: {
		            	   <portlet:namespace />permissionGroupId : permissionGroupId
		               },
		               on: {
		            	   success: function(event, id, obj) {
		            		   var responseData = this.get('responseData');
		                	   if(responseData) {
		                		   
		                		   var avaiUser = A.one("#<portlet:namespace />availableUserIds");
		                		   if(avaiUser) {
		                			   avaiUser.empty();
		                		   }
		                		   for(var i in responseData.avaiableUser){
		                			   var opt = document.createElement('option');
		                			   opt.innerHTML = responseData.avaiableUser[i].name;
		                			   opt.value = responseData.avaiableUser[i].value;
		                			   
		                			   avaiUser.appendChild(opt);
		                		   }
		                		   
		                		   var curUser = A.one("#<portlet:namespace />currentUserIds");
		                		   if(curUser) {
		                			   curUser.empty();
		                		   }
		                		   for(var i in responseData.currentUser){
		                			   var opt = document.createElement('option');
		                			   opt.innerHTML = responseData.currentUser[i].name;
		                			   opt.value = responseData.currentUser[i].value;
		                			   
		                			   curUser.appendChild(opt);
		                		   }
		                		   
		                	   }
		                	   else {
		                		   console.log("responseData has error");
		                	   }
		                   }
		               }
		        });
		 
		    });
		},
		['aui-io-request', 'aui-base']
	);
</aui:script>
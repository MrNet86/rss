<%@page import="com.liferay.portal.kernel.util.KeyValuePairComparator"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.KeyValuePair"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="../init.jsp" %>

<portlet:actionURL var="updateURL">
	<portlet:param name="action" value="<%= VnptConstants.UPDATE_GROUP_ROLE %>"/>
</portlet:actionURL>

<aui:form action="" method="post" name="fm">
	<div class="panel top-orange">
		<div class="panel-body">
			<div class="form-group">
				<div class="row">
					<div class="col-md-2 col-sm-3 col-xs-12">
						<label for="#"><liferay-ui:message key="groupRole"/></label>
					</div>
					<div class="col-md-4 col-sm-9 col-xs-12">
						<aui:select label="" name="languageId">
							<%
							List<PermissionGroup> lstPerGroup = PermissionGroupLocalServiceUtil.getPermissionGroups(-1, -1);
					
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
						<aui:fieldset cssClass="available-languages" label="available-languages">
							<%
							List<User> lstUser = new ArrayList<User>();
							List<Group> sites =  user.getMySiteGroups();
							for (Group group : sites) {
								System.out.println("siteId :"+group.getGroupId() + " || sites name :"+group.getName());
								if(group.getSite()) {
									lstUser.addAll(UserLocalServiceUtil.getGroupUsers(group.getGroupId()));
								}
							}
							if(!lstUser.isEmpty()) {
								lstUser.remove(0); // except test@liferay.com
							}
							
							// Left list	
							List<KeyValuePair> leftList = new ArrayList<KeyValuePair>();
						
							for (User aUser : lstUser) {
								leftList.add(new KeyValuePair(String.valueOf(aUser.getUserId()), aUser.getFullName() + " - " + aUser.getEmailAddress()));
							}
						
							// Right list
						
							List rightList = new ArrayList<KeyValuePair>();
							rightList = ListUtil.sort(rightList, new KeyValuePairComparator(false, true));
							%>
						
							<liferay-ui:input-move-boxes
								leftBoxName="currentLanguageIds"
								leftList="<%= leftList %>"
								leftReorder="true"
								leftTitle="current"
								rightBoxName="availableLanguageIds"
								rightList="<%= rightList %>"
								rightTitle="available"
							/>
						</aui:fieldset> 
					</div>
				</div>
			</div>
		</div>
	</div>	
	
</aui:form>	
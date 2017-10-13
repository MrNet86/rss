<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.UserGroupRoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.UserGroup"%>
<%@page import="java.util.Collections"%>
<%@page import="com.liferay.portal.model.Phone"%>
<%@page import="com.liferay.portal.ReservedUserIdException"%>
<%@page import="com.liferay.portal.DuplicateUserIdException"%>
<%@page import="com.liferay.portal.ReservedUserScreenNameException"%>
<%@ page import="com.liferay.portal.DuplicateUserEmailAddressException" %>
<%@ page import="com.liferay.portal.DuplicateUserScreenNameException" %>
<%@ page import="com.liferay.portal.UserIdException" %>
<%@ include file="../init.jsp" %>

<%
String redirect = ParamUtil.getString(request, "redirect");
String email = "";
String fullName = "";
String phoneNumber = "";
boolean isMale = true;
boolean isSiteAdmin = false;
long userId = 0;

// list site where user login belong to
List<Group> groups = (List<Group>) request.getAttribute("groups");
if(groups.isEmpty()) {
	 groups = Collections.emptyList();
}

// list site of modifield user
List<Group> curGroups = Collections.emptyList();

User aUser = (User) request.getAttribute("user");
if(aUser != null) {
	userId = aUser.getUserId();
	email = aUser.getEmailAddress();
	fullName = aUser.getLastName() + " " + aUser.getMiddleName() + " " + aUser.getFirstName();
	
	if(aUser.getContact() != null) {
		isMale = aUser.getContact().getMale();
		List<Phone> lstPhone = aUser.getPhones();
		for(Phone phone : lstPhone) {
			if(phone.getPrimary()) {
				phoneNumber = phone.getNumber();	
			}
		}
	}
	
	curGroups = aUser.getGroups();
	for(Group gr : groups) {
		isSiteAdmin =  UserGroupRoleLocalServiceUtil.hasUserGroupRole(userId, gr.getGroupId(),
			RoleLocalServiceUtil.getRole(themeDisplay.getCompanyId(), "Site Administrator").getRoleId());	
	}
	
}

%>

<portlet:actionURL var="updateUserURL">
	<portlet:param name="action" value="<%= VnptConstants.UPDATE_USER %>"/>
</portlet:actionURL>

<aui:form action="<%= updateUserURL %>" method="post" name="fm">
	
	<aui:input type="hidden" name="userId" value="<%= userId %>"/>
	
	<liferay-ui:error exception="<%= DuplicateUserEmailAddressException.class %>" focusField="emailAddress" message="the-email-address-you-requested-is-already-taken" />
	<liferay-ui:error exception="<%= ReservedUserEmailAddressException.class %>" focusField="emailAddress" message="the-email-address-you-requested-is-reserved" />
	<liferay-ui:error exception="<%= UserEmailAddressException.class %>" focusField="emailAddress" message="please-enter-a-valid-email-address" />
	<liferay-ui:error exception="<%= DuplicateUserIdException.class %>" message="the-user-id-you-requested-is-already-taken" />
	<liferay-ui:error exception="<%= ReservedUserIdException.class %>" message="the-user-id-you-requested-is-reserved" />
	<liferay-ui:error exception="<%= DuplicateUserScreenNameException.class %>" focusField="screenName" message="the-screen-name-you-requested-is-already-taken" />
	<liferay-ui:error exception="<%= ReservedUserScreenNameException.class %>" focusField="screenName" message="the-screen-name-you-requested-is-reserved" />
	<liferay-ui:error exception="<%= UserIdException.class %>" message="please-enter-a-valid-user-id" />
	
	<liferay-ui:error key="add-user-exception" message="add-user-exception" />	
	<liferay-ui:success key="add-user-successfull" message="add-user-successfull" />

	<div class="row">
		<div class="col-md-12">
			<h1 class="page-header"><liferay-ui:message key="them-moi-nguoi-dung" /></h1>
		</div>
	</div>
			
	<div class="row">
		<div class="col-md-12">		
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
										for (Group group : groups) {
									%>
										<aui:option value="<%= group.getGroupId() %>" selected='<%= curGroups.contains(group) %>'>
											<%= group.getName() %>
										</aui:option>
									<%
										}
									%>
								</aui:select>
							</div>
							
							<div class="col-md-2 col-sm-3 col-xs-12">
				                <label for="#"><liferay-ui:message key="site-admin"/></label>
				            </div>
				            <div class="col-md-4 col-sm-9 col-xs-12">
				                <aui:input label="" name="isSiteAdmin" type="checkbox" value="<%= isSiteAdmin %>"/>
				            </div> 
						</div>
					</div>
					
					<div class="form-group">
						<div class="row">
				            <div class="col-md-2 col-sm-3 col-xs-12">
				                <label for="#"><liferay-ui:message key="screen-name"/></label>
				            </div>
				            <div class="col-md-4 col-sm-9 col-xs-12">
				                <aui:input type="text" name="screenName" label="" cssClass="form-control" value='<%= aUser == null ? "" : HtmlUtil.escape(aUser.getScreenName()) %>'>
									<aui:validator name="required" />
									<aui:validator name="maxLength">50</aui:validator>
								</aui:input>
				            </div> 
			            </div>
		            </div>
		            
					<div class="form-group">
						<div class="row">
				            <div class="col-md-2 col-sm-3 col-xs-12">
				                <label for="#"><liferay-ui:message key="email"/></label>
				            </div>
				            <div class="col-md-4 col-sm-9 col-xs-12">
				                <aui:input type="text" name="emailAddress" label="" cssClass="form-control" value="<%= HtmlUtil.escape(email) %>">
									<aui:validator name="required" />
									<aui:validator name="email"/>
									<aui:validator name="maxLength">50</aui:validator>
								</aui:input>
				            </div> 
				            
				            <div class="col-md-2 col-sm-3 col-xs-12">
				                <label for="#"><liferay-ui:message key="ho-va-ten"/></label>
				            </div>
				            <div class="col-md-4 col-sm-9 col-xs-12">
				                <aui:input type="text" name="fullName" label="" cssClass="form-control" 
				                	value="<%= fullName %>">
									<aui:validator name="required" />
									<aui:validator name="maxLength">100</aui:validator>
									<aui:validator name="custom" errorMessage="ho-va-ten-khong-hop-le" >
										function (val) {
											if(val.trim().indexOf(" ") > -1) {
												return true;
											} else {
												return false;
											}
										}
									</aui:validator> 
								</aui:input>
				            </div> 
				        </div>
			        </div>
			        
			        <div class="form-group">
				        <div class="row">
				        	<div class="col-md-2 col-sm-3 col-xs-12">
				        		<label><liferay-ui:message key="so-dien-thoai"/></label>
				        	</div>
				        	<div class="col-md-4 col-sm-9 col-xs-12">
				        		<aui:input type="text" name="phoneNumber" label="" cssClass="form-control" value="<%= phoneNumber %>">
									<aui:validator name="digits" />
									<aui:validator name="maxLength">11</aui:validator>
								</aui:input>
				        	</div>
				        	
				        	<div class="col-md-2 col-sm-3 col-xs-12">
				        		<label><liferay-ui:message key="gioi-tinh"/></label>
				        	</div>
				        	<div class="col-md-4 col-sm-9 col-xs-12">
				        		<aui:select name="male" label="" cssClass="form-control">
									<aui:option label="male" value="true" selected='<%= isMale %>'/>
									<aui:option label="female" value="false" selected='<%= !isMale %>'/>
								</aui:select>
				        	</div>
				        </div>
			        </div>
			        
			        <div class="form-group">
				        <c:if test="<%= aUser == null %>">
				        	<div class="row">
					        	<div class="col-md-2 col-sm-3 col-xs-12">
					        		<label><liferay-ui:message key="mat-khau"/></label>
					        	</div>
					        	<div class="col-md-4 col-sm-9 col-xs-12">
					        		<aui:input autocomplete="off" name="password1" size="30" type="password" label="" cssClass="form-control">
					        			<aui:validator name="required" />
					        		</aui:input>
					        	</div>
					        	
					        	<div class="col-md-2 col-sm-3 col-xs-12">
					        		<label><liferay-ui:message key="nhap-lai-mat-khau"/></label>
					        	</div>
					        	<div class="col-md-4 col-sm-9 col-xs-12">
					        		<aui:input autocomplete="off" name="password2" size="30" type="password" label="" cssClass="form-control">
										<aui:validator name="required" />
										<aui:validator name="maxLength">50</aui:validator>
										<aui:validator name="equalTo">
											'#<portlet:namespace />password1'
										</aui:validator>
									</aui:input>
					        	</div>
					        </div>
				        </c:if>
			        </div>
		        </div>
	        </div>
		</div>
	</div>

</aui:form>

<aui:button-row>
	<aui:button onClick='<%= renderResponse.getNamespace() + "saveUser();" %>' type="submit" />
</aui:button-row>

<aui:script>

	function <portlet:namespace />saveUser() {
		submitForm(document.<portlet:namespace />fm);
	}
	
</aui:script>

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

User _user = (User) request.getAttribute("user");
if(_user != null) {
	email = _user.getEmailAddress();
	fullName = _user.getLastName() + " " + _user.getMiddleName() + " " + _user.getFirstName();
	
	if(_user.getContact() != null) {
		isMale = _user.getContact().getMale();
		List<Phone> lstPhone = _user.getPhones();
		for(Phone phone : lstPhone) {
			if(phone.getPrimary()) {
				phoneNumber = phone.getNumber();	
			}
		}		
	}
}
else {
	System.out.println("_user is null");
}
%>

<portlet:actionURL var="updateUserURL">
	<portlet:param name="action" value="<%= VnptConstants.UPDATE_USER %>"/>
</portlet:actionURL>

<aui:form action="<%= updateUserURL %>" method="post" name="fm">
	
	<h3><liferay-ui:message key="them-moi-nguoi-dung" /></h3>
	
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
			<div class="row">
	            <div class="col-md-2 col-sm-3 col-xs-12">
	                <label for="#"><liferay-ui:message key="email"/></label>
	            </div>
	            <div class="col-md-4 col-sm-9 col-xs-12">
	                <aui:input type="text" name="emailAddress" label="" cssClass="form-control" value="<%= email %>">
						<aui:validator name="required" />
						<aui:validator name="email"/>
					</aui:input>
	            </div> 
	            
	            <div class="col-md-2 col-sm-3 col-xs-12">
	                <label for="#"><liferay-ui:message key="ho-va-ten"/></label>
	            </div>
	            <div class="col-md-4 col-sm-9 col-xs-12">
	                <aui:input type="text" name="fullName" label="" cssClass="form-control" 
	                	value="<%= fullName %>">
						<aui:validator name="required" />
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
	        
	        <div class="row">
	        	<div class="col-md-2 col-sm-3 col-xs-12">
	        		<label><liferay-ui:message key="phone"/></label>
	        	</div>
	        	<div class="col-md-4 col-sm-9 col-xs-12">
	        		<aui:input type="text" name="phoneNumber" label="" cssClass="form-control" value="<%= phoneNumber %>">
						<aui:validator name="digits" />
						<aui:validator name="maxLength">11</aui:validator>
					</aui:input>
	        	</div>
	        	
	        	<div class="col-md-2 col-sm-3 col-xs-12">
	        		<label><liferay-ui:message key="gender"/></label>
	        	</div>
	        	<div class="col-md-4 col-sm-9 col-xs-12">
	        		<aui:select name="male" label="" cssClass="form-control">
						<aui:option label="male" value="true" selected='<%= isMale %>'/>
						<aui:option label="female" value="false" selected='<%= !isMale %>'/>
					</aui:select>
	        	</div>
	        </div>
	        
	        <div class="row">
	        	<div class="col-md-2 col-sm-3 col-xs-12">
	        		<label><liferay-ui:message key="password"/></label>
	        	</div>
	        	<div class="col-md-4 col-sm-9 col-xs-12">
	        		<aui:input autocomplete="off" name="password1" size="30" type="password" label="" cssClass="form-control">
	        			<aui:validator name="required" />
	        		</aui:input>
	        	</div>
	        	
	        	<div class="col-md-2 col-sm-3 col-xs-12">
	        		<label><liferay-ui:message key="enter-again"/></label>
	        	</div>
	        	<div class="col-md-4 col-sm-9 col-xs-12">
	        		<aui:input autocomplete="off" name="password2" size="30" type="password" label="" cssClass="form-control">
						<aui:validator name="required" />
						<aui:validator name="equalTo">
							'#<portlet:namespace />password1'
						</aui:validator>
					</aui:input>
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


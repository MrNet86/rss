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
long userId = 0;

List<Group> groups = Collections.emptyList();
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
	System.out.println("user :"+aUser.getFullName() + "|| email :"+aUser.getEmailAddress());
	List<UserGroup> userGroups = aUser.getUserGroups();
	for (UserGroup uGroup : userGroups) {
		System.out.println("userGroup :"+uGroup.getName() +" || user :"+uGroup.getUserName());
	}
	
	long[] u = aUser.getUserGroupIds();
	if(u != null) {
		for(long l : u) {
			System.out.println("userGroupIds :"+l);
		}
	}
	
	groups = aUser.getGroups();
}
else {
	groups = (List<Group>) request.getAttribute("groups");
	if(groups != null) {
		System.out.println("groups size :"+groups.size());
	}
}
%>

<portlet:actionURL var="updateUserURL">
	<portlet:param name="action" value="<%= VnptConstants.UPDATE_USER %>"/>
</portlet:actionURL>

<aui:form action="<%= updateUserURL %>" method="post" name="fm">
	
	<aui:input type="hidden" name="userId" value="<%= userId %>"/>
	
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
					<label for="#"><liferay-ui:message key="site"/></label>
				</div>
				<div class="col-md-4 col-sm-9 col-xs-12">
					<aui:select name="userSite" label="" multiple="true" cssClass="form-control">
						<%
							for (Group group : groups) {
						%>
							<aui:option value="<%= group.getGroupId() %>" >
								<%= group.getName() %>
							</aui:option>
						<%
							}
						%>
					</aui:select>
				</div>
			</div>
			
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
	        
	        <c:if test="<%= aUser == null %>">
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
	        </c:if>
	        
		</div>
	</div>

</aui:form>

<aui:button-row>
	<aui:button onClick='<%= renderResponse.getNamespace() + "saveUser();" %>' type="submit" />
</aui:button-row>

<aui:script>

	Liferay.on('_submitAction',function(event) {
		
		var data = $('#<portlet:namespace/>fm').serializeArray().reduce(function(obj, item) {
		    obj[item.name] = item.value;
		    return obj;
		}, {});
		
		console.log(data);
		
		Liferay.fire('_callBackAction', {
			user_form : data,
			user_namespace : '<portlet:namespace/>'
		});
		
	});
	
	function <portlet:namespace />saveUser() {
		submitForm(document.<portlet:namespace />fm);
	}
	
</aui:script>


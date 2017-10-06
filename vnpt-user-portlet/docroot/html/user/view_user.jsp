<%@page import="com.liferay.portlet.usersadmin.util.UsersAdminUtil"%>
<%@page import="java.util.Collections"%>
<%@page import="com.liferay.portal.security.auth.CompanyThreadLocal"%>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="com.vnpt.portlet.user.permission.VnptPermission"%>
<%@page import="com.liferay.portal.model.Phone"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ include file="../init.jsp" %>

<%
PortletURL portletURL = (PortletURL) request.getAttribute("view.jsp-portletURL");
SearchContainer<User> searchContainer = null;
searchContainer = new SearchContainer<User>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 
						SearchContainer.DEFAULT_DELTA, portletURL, null, StringPool.BLANK);
%>

<aui:form action="<%= portletURL.toString() %>" method="post" name="fm">

	<liferay-ui:search-container
		searchContainer="<%= searchContainer %>"
		var="userSearchContainer"
	>
	
		<liferay-ui:search-container-results
			results="<%= LiferayDatabaseLocalServiceUtil.findAllUserByGroupAndChild(scopeGroupId, 
					searchContainer.getStart(), searchContainer.getEnd()) %>"
			total="<%= LiferayDatabaseLocalServiceUtil.countAllUserByGroupAndChild(scopeGroupId) %>"
		/>
	
		<liferay-ui:search-container-row
			className="com.liferay.portal.model.User"
			modelVar="aUser"
			keyProperty="userId"
		>
		
			<liferay-ui:search-container-column-text 
				name="email"
				value="<%= aUser.getEmailAddress() %>"
			/>
			
			<liferay-ui:search-container-column-text 
				name="ho-va-ten"
				value="<%= aUser.getFullName() %>"
			/>
			
			<%
			String phoneNumber = "";
			List<Phone> lstPhone = aUser.getPhones();
			for(Phone phone : lstPhone) {
				if(phone.getPrimary()) {
					phoneNumber = phone.getNumber();	
				}
			}
			%>
			<liferay-ui:search-container-column-text 
 				name="so-dien-thoai"
 				value="<%= phoneNumber %>"
 			/>
			
			<%
			// get all site of user
			String strSite = "";
			List<Group> groups = Collections.emptyList();
			groups = aUser.getGroups();
			for(Group grp :groups) {
				strSite += grp.getName() +", ";
			}
			if(!"".equals(strSite)) {
				strSite = strSite.substring(0, strSite.length()-2);
			}
			%>
			<liferay-ui:search-container-column-text
 				name="site"
 				value="<%= strSite %>"			 
 			/>
			<%
			if (VnptPermission.contains(permissionChecker, scopeGroupId, VnptConstants.USER_PER_ADMIN)) {
			%>
			<liferay-ui:search-container-column-jsp
				align="center"
				path="/html/user/action_user.jsp"
			/>
			<%
			}
			%>										
		</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
	
</aui:form>

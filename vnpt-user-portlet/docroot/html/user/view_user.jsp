<%@page import="com.vnpt.portlet.user.permission.VnptPermission"%>
<%@page import="com.liferay.portal.model.Phone"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ include file="../init.jsp" %>

<%
PortletURL portletURL = (PortletURL) request.getAttribute("view.jsp-portletURL");
SearchContainer<User> searchContainer = null;
searchContainer = new SearchContainer<User>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 
						SearchContainer.DEFAULT_DELTA, portletURL, null, StringPool.BLANK);

// get all user's site
List<User> lstUser = new ArrayList<User>();
List<Group> sites =  user.getMySites();
for (Group group : sites) {
	System.out.println("siteId :"+group.getGroupId() + " || sites name :"+group.getName());
	if(group.getSite()) {
		lstUser.addAll(UserLocalServiceUtil.getGroupUsers(group.getGroupId()));
	}
}
if(!lstUser.isEmpty()) {
	lstUser.remove(0); // except test@liferay.com
}
%>

<aui:form action="<%= portletURL.toString() %>" method="post" name="fm">

	<liferay-ui:search-container
		searchContainer="<%= searchContainer %>"
		var="userSearchContainer"
	>
	
		<liferay-ui:search-container-results>
			<%
				results = ListUtil.subList(lstUser, searchContainer.getStart(),
	                searchContainer.getEnd());
	
				if(lstUser.size()<searchContainer.getEnd()){
		            results = ListUtil.subList(lstUser, searchContainer.getStart(),
		            		lstUser.size());
		            total = lstUser.size();
		        } else{
		            results = ListUtil.subList(lstUser, searchContainer.getStart(),
		                    searchContainer.getEnd());
		            total = lstUser.size();
		        }
	
		        pageContext.setAttribute("results", results);
		        pageContext.setAttribute("total", total);
			%>
		</liferay-ui:search-container-results>
	
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

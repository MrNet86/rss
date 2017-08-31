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
			results="<%= UserLocalServiceUtil.getUsers(userSearchContainer.getStart(), userSearchContainer.getEnd()) %>"
			total="<%= UserLocalServiceUtil.getUsersCount() %>"
		/>
	
		<liferay-ui:search-container-row
			className="com.liferay.portal.model.User"
			modelVar="aUser"
			keyProperty="userId"
		>
		
			<liferay-ui:search-container-column-text property="userId" />
			
			<liferay-ui:search-container-column-text property="fullName" />
			
			<liferay-ui:search-container-column-text property="emailAddress" />
			
			<liferay-ui:search-container-column-jsp
				align="center"
				path="/html/user/action_user.jsp"
			/>
											
		</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
	
</aui:form>

<%--
<%@ include file="../init.jsp" %>
<%
PortletURL portletURL = (PortletURL)request.getAttribute("view.jsp-portletURL");

%>

<liferay-ui:success key="update-rss-category-success" message="update-rss-category-success"/>
<liferay-ui:error key="error-rss-category-exists-in-feed" message="error-rss-category-exists-in-feed"/>

<aui:form action="<%= portletURL.toString() %>" method="post" name="fm">

	<liferay-ui:search-container >

		<liferay-ui:search-container-results
			results="<%= PermissionTypeLocalServiceUtil.getPermissionTypes(-1, -1) %>"
			total="<%= PermissionTypeLocalServiceUtil.getPermissionTypesCount() %>"
		/>

		<liferay-ui:search-container-row
		
			className="com.vnpt.portlet.user.model.PermissionType"
			modelVar="aPerType"
		>

			<portlet:renderURL var="editURL" >
				<portlet:param name="action" value="<%= VnptConstants.EDIT_PERMISSION_TYPE %>" />
				<portlet:param name="tabs1" value="<%= VnptConstants.EDIT_PERMISSION_TYPE %>" />
				<portlet:param name="permissionTypeId" value="<%= String.valueOf(aPerType.getPermissionTypeId()) %>"/>
			</portlet:renderURL>

			<liferay-ui:search-container-column-text
				name="type-name"
				value="<%= HtmlUtil.escape(aPerType.getTypeName()) %>"
				href="<%= editURL %>"
			/>

			<liferay-ui:search-container-column-text
				name="type-code"
				value='<%= aPerType.getTypeCode() == null ? "" : HtmlUtil.escape(aPerType.getTypeCode()) %>'
				href="<%= editURL %>"
			/>

			<liferay-ui:search-container-column-text
				name="description"
				value='<%= aPerType.getDescription() == null ? "" : HtmlUtil.escape(aPerType.getDescription()) %>'
				href="<%= editURL %>"
			/>

			<liferay-ui:search-container-column-text
				name="action"
			>
			
			<liferay-ui:icon-menu>
				<portlet:actionURL var="deleteURL">
					<portlet:param name="action" value="<%= VnptConstants.DELETE_PERMISSION_TYPE %>" />
					<portlet:param name="permissionTypeId" value="<%= String.valueOf(aPerType.getPermissionTypeId()) %>"/>
				</portlet:actionURL>
				<liferay-ui:icon-delete url="<%=deleteURL%>" />
			</liferay-ui:icon-menu>
			
			</liferay-ui:search-container-column-text>
		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</aui:form>
 --%>
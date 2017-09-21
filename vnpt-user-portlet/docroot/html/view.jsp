<%@ include file="init.jsp" %>

<%
String tabs1 = ParamUtil.getString(request, "tabs1", VnptConstants.VIEW_USER);

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("tabs1", tabs1);

request.setAttribute("view.jsp-portletURL", portletURL);

pageContext.setAttribute("portletURL", portletURL);
%>

<liferay-util:include page="/html/tabs1.jsp"
	servletContext="<%= this.getServletContext() %>"/>

<c:choose>	
	<c:when test='<%= VnptConstants.VIEW_USER.equals(tabs1) %>'>
		<liferay-util:include page="/html/user/view_user.jsp"
			servletContext="<%= this.getServletContext() %>"/>
	</c:when>
	<c:when test='<%= VnptConstants.EDIT_USER.equals(tabs1) %>'>
		<liferay-util:include page="/html/user/edit_user.jsp"
			servletContext="<%= this.getServletContext() %>"/>
	</c:when>
	<c:when test='<%= VnptConstants.VIEW_PERMISSION_TYPE.equals(tabs1) %>'>
		<liferay-util:include page="/html/permissionType/view.jsp"
			servletContext="<%= this.getServletContext() %>"/>
	</c:when>
	<c:when test='<%= VnptConstants.EDIT_PERMISSION_TYPE.equals(tabs1) %>'>
		<liferay-util:include page="/html/permissionType/edit.jsp"
			servletContext="<%= this.getServletContext() %>"/>
	</c:when>
	<c:when test='<%= VnptConstants.VIEW_ROLE.equals(tabs1) %>'>
		<liferay-util:include page="/html/role/view.jsp"
			servletContext="<%= this.getServletContext() %>"/>
	</c:when>
	<c:when test='<%= VnptConstants.EDIT_ROLE.equals(tabs1) %>'>
		<liferay-util:include page="/html/role/edit.jsp"
			servletContext="<%= this.getServletContext() %>"/>
	</c:when>
	<c:when test='<%= VnptConstants.EDIT_GROUP_ROLE.equals(tabs1) %>'>
		<liferay-util:include page="/html/grouprole/edit_group_role.jsp"
			servletContext="<%= this.getServletContext() %>"/>
	</c:when>
</c:choose>
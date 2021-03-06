<%@ include file="../init.jsp" %>

<%
String tabs1 = ParamUtil.getString(request, "tabs1", VnptConstants.VIEW_ROLE);

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("tabs1", tabs1);

request.setAttribute("view.jsp-portletURL", portletURL);

pageContext.setAttribute("portletURL", portletURL);
%>

<liferay-util:include page="/html/role/tabs1.jsp"
	servletContext="<%= this.getServletContext() %>"/>

<c:choose>	
	<c:when test='<%= VnptConstants.VIEW_ROLE.equals(tabs1) %>'>
		<liferay-util:include page="/html/role/view_role.jsp"
			servletContext="<%= this.getServletContext() %>"/>
	</c:when>
	<c:when test='<%= VnptConstants.EDIT_ROLE.equals(tabs1) %>'>
		<liferay-util:include page="/html/role/edit_role.jsp"
			servletContext="<%= this.getServletContext() %>"/>
	</c:when>
</c:choose>
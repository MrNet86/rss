<%@include file="../init.jsp"%>

<%
String tab = ParamUtil.getString(request, "tab", "Policy");
String tabName = "Policy,Project";

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("tab", tab);
portletURL.setParameter("backURL", currentURL);
portletURL.setParameter("action", ActionConstants.VIEW_INVEST);

System.out.println("viewInvest.jsp ");
%>

<liferay-ui:tabs
	names="<%= tabName %>"
	value="<%= tab %>"
	portletURL="<%= portletURL %>"
	param="tab"
	refresh="<%= true %>"
/>

<c:choose>
	<c:when test='<%= "Policy".equals(tab) %>'>
		<liferay-util:include page="/jsp/invest/policy/viewPolicy.jsp"
			servletContext="<%=this.getServletContext()%>" />
	</c:when>
	<c:when test='<%= "Project".equals(tab) %>'>
		<liferay-util:include page="/jsp/invest/project/viewProject.jsp"
			servletContext="<%=this.getServletContext()%>" />
	</c:when>
</c:choose>

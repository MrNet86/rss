<%@page import="com.viettel.ims.common.ActionConstants"%>
<%@include file="init.jsp" %>

<%
String backURL = ParamUtil.getString(request, "backURL");

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setWindowState(WindowState.NORMAL);

String actionURL = ParamUtil.getString(request, "action", ActionConstants.VIEW_INVEST);
System.out.println("navigateMenus action :"+actionURL);
%>
<aui:nav-bar>
	<aui:nav>
		<!-- Invest -->
		<% portletURL.setParameter("action", ActionConstants.VIEW_INVEST); %>
		<aui:nav-item iconCssClass="icon-home" label="Nav.Invest"
			href="<%= portletURL.toString() %>"
			selected='<%= ActionConstants.VIEW_INVEST.equals(actionURL) || ActionConstants.VIEW_INVEST_POLICY.equals(actionURL) || ActionConstants.EDIT_INVEST_POLICY.equals(actionURL)
			|| ActionConstants.VIEW_INVEST_PROJECT.equals(actionURL) || ActionConstants.EDIT_INVEST_PROJECT.equals(actionURL) %>'>
		</aui:nav-item>

		<%-- Contract --%>
		<% portletURL.setParameter("action", ActionConstants.VIEW_CONTRACT); %>
		<aui:nav-item iconCssClass="icon-gear" label="Nav.Contract"
			href="<%= portletURL.toString() %>" selected='<%= ActionConstants.VIEW_CONTRACT.equals(actionURL) %>'>
		</aui:nav-item>

		<!-- Setting -->
		<% portletURL.setParameter("action", ActionConstants.VIEW_SETTING); %>
		<aui:nav-item iconCssClass="icon-gear" label="Nav.Setting" href="<%= portletURL.toString() %>"
			selected='<%= ActionConstants.VIEW_SETTING.equals(actionURL) %>'  />

	</aui:nav>
</aui:nav-bar>

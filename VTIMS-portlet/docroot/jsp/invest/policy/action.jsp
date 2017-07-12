<%@page import="com.viettel.ims.core.model.InvestPolicyExt"%>
<%@page import="com.viettel.ims.search.InvestPolicySearch"%>
<%@ include file="/jsp/init.jsp"%>

<%
	InvestPolicySearch searchContainer = (InvestPolicySearch) request
			.getAttribute("liferay-ui:search:searchContainer");

	ResultRow row = (ResultRow) request
			.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

	InvestPolicyExt investPolicyExt = (InvestPolicyExt)row.getObject();

%>

<liferay-ui:icon-menu>
	<portlet:renderURL var="varBackURL">
		<portlet:param name="action" value="<%= ActionConstants.VIEW_INVEST_POLICY %>" />
	</portlet:renderURL>
	<portlet:renderURL windowState="<%= WindowState.NORMAL.toString() %>" var="editURL">
		<portlet:param name="action" value="<%= ActionConstants.EDIT_INVEST_POLICY %>" />
		<portlet:param name="backURL" value="<%= varBackURL %>" />
		<portlet:param name="investPolicyId" value="<%= String.valueOf(investPolicyExt.getInvestPolicyId()) %>" />
	</portlet:renderURL>
	<liferay-ui:icon message="Command.Edit" iconCssClass="icon-edit" url="<%= editURL %>" />

	<liferay-ui:icon message="Decide" iconCssClass="icon-add" url="<%= editURL %>" />

	<liferay-ui:icon message="Verify" iconCssClass="icon-add" url="<%= editURL %>" />
</liferay-ui:icon-menu>
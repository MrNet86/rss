<%@page import="com.viettel.ims.permission.InvestPolicyModelPermission"%>
<%@page import="com.viettel.ims.search.InvestPolicySearch"%>
<%@page import="com.viettel.ims.core.service.InvestPolicyLocalServiceUtil"%>
<%@page import="com.viettel.ims.core.service.InvestPolicyExtLocalServiceUtil"%>
<%@page import="com.viettel.ims.common.ActionConstants"%>
<%@include file="/jsp/init.jsp"%>

<%
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setParameter("action", ActionConstants.VIEW_INVEST_POLICY);

	boolean isUpdate = InvestPolicyModelPermission.contains(
			permissionChecker, scopeGroupId, "UPDATE_INVEST_POLICY");

%>

<portlet:renderURL var="actionFormURL" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="action" value="<%= ActionConstants.VIEW_INVEST_POLICY %>"/>
</portlet:renderURL>

<aui:form action="<%= portletURL.toString() %>" method="POST" name="frm">
	<liferay-util:include page="/jsp/invest/policy/toolbar.jsp" servletContext="<%= this.getServletContext() %>" />

	<liferay-ui:search-container
		rowChecker="<%= new RowChecker(renderResponse) %>"
		searchContainer="<%= new InvestPolicySearch(renderRequest, portletURL) %>"
	>

		<liferay-ui:search-form page="/jsp/invest/policy/search.jsp"
			searchContainer="<%= searchContainer %>"
			servletContext="<%= this.getServletContext() %>"
		/>

		<liferay-ui:search-container-results
			results="<%= InvestPolicyLocalServiceUtil.searchInvestPolicyExt(searchContainer, searchContainer.getStart(), searchContainer.getEnd()) %>"
			total="<%= InvestPolicyLocalServiceUtil.countInvestPolicy(searchContainer) %>"
		/>

		<liferay-ui:search-container-row
			className="com.viettel.ims.core.model.InvestPolicyExt"
			modelVar="aInvestPolicy"
		>

			<portlet:renderURL var="varBackURL">
				<portlet:param name="action" value="<%= ActionConstants.VIEW_INVEST_POLICY %>" />
			</portlet:renderURL>
			<portlet:renderURL windowState="<%= WindowState.NORMAL.toString() %>" var="editURL" escapeXml="true">
				<portlet:param name="action" value="<%= ActionConstants.EDIT_INVEST_POLICY %>" />
<%-- 				<portlet:param name="backURL" value="<%= varBackURL %>" /> --%>
				<portlet:param name="investPolicyId" value="<%= String.valueOf(aInvestPolicy.getInvestPolicyId()) %>" />
			</portlet:renderURL>

			<liferay-portlet:renderURL var="encryptURL" encrypt="true" >
				<portlet:param name="action" value="<%= ActionConstants.EDIT_INVEST_POLICY %>" />
<%-- 				<portlet:param name="backURL" value="<%= varBackURL %>" /> --%>
				<portlet:param name="investPolicyId" value="<%= String.valueOf(aInvestPolicy.getInvestPolicyId()) %>" />
			</liferay-portlet:renderURL>

			<c:if test="<%= isUpdate %>">
				<liferay-ui:search-container-column-text
					name="Edit"
					align="center" valign="center"
					href="<%=encryptURL%>">
					<liferay-ui:icon image="edit" />
				</liferay-ui:search-container-column-text>
			</c:if>

<%-- 			<liferay-ui:search-container-column-text --%>
<%-- 				name="Policy.infoPolicyType" --%>
<%-- 				value='<%= aInvestPolicy.getInfoPolicyType() == 1 ? "Mua Sam" : "Dau Tu" %>' --%>
<%-- 			/> --%>

			<liferay-ui:search-container-column-text property="infoPolicyTypeName"
				name="Policy.infoPolicyType"/>

			<liferay-ui:search-container-column-text property="infoPolicyName"
				name="Policy.infoPolicyName"/>

			<liferay-ui:search-container-column-text property="infoProposeGroupName"
				name="Policy.infoProposeGroupId"/>

			<liferay-ui:search-container-column-text property="infoVerifyGroupName"
				name="Policy.infoVerifyGroupId"/>

			<liferay-ui:search-container-column-text
				name="Policy.infoPolicyDate"
				value='<%=aInvestPolicy.getInfoPolicyDate() == null ? ""
					: dateFormatDate.format(aInvestPolicy.getInfoPolicyDate())%>'
			/>

			<liferay-ui:search-container-column-text
				name="Policy.infoPolicyDeployDate" align="center"
				value='<%= aInvestPolicy.getInfoPolicyDeployDate() == null ? ""
					: dateFormatDate.format(aInvestPolicy.getInfoPolicyDeployDate()) %>'
			/>

			<liferay-ui:search-container-column-jsp
				align="center"
				path="/jsp/invest/policy/action.jsp"
			/>

		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />
	</liferay-ui:search-container>

</aui:form>
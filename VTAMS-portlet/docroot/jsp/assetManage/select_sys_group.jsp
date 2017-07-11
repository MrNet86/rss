<%@page import="com.viettel.ams.core.service.SysGroupLocalServiceUtil"%>
<%@include file="../init.jsp"%>

<%
PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("action", ActionConstants.VIEW_SYS_GROUP);

String eventName = ParamUtil.getString(request, "eventName",
		liferayPortletResponse.getNamespace() + "selectSysGroup");
String target = ParamUtil.getString(request, "target");

portletURL.setParameter("eventName", eventName);
if (Validator.isNotNull(target)) {
	portletURL.setParameter("target", target);
}
%>
<h3><liferay-ui:message key="Title.SysGroup"/></h3>

<aui:form action="<%= portletURL.toString() %>" method="POST" name="selectSysGroupFm">
	<aui:input id="deleteRowIds" name="deleteRowIds" type="hidden" value=""/>
	<liferay-ui:search-container
		rowChecker="<%= new RowChecker(renderResponse) %>"
		searchContainer="<%= new SysGroupSearch(renderRequest, portletURL) %>"
	>

		<liferay-ui:search-container-results
			results="<%= SysGroupLocalServiceUtil.getSysGroups(searchContainer.getStart(), searchContainer.getEnd()) %>"
			total="<%= SysGroupLocalServiceUtil.getSysGroupsCount() %>"
		/>

		<liferay-ui:search-container-row
			className="com.viettel.ams.core.model.SysGroup"
			modelVar="aSysGroup"
			keyProperty="groupId"
		>

			<liferay-ui:search-container-column-text
				name="groupId"
				property="groupId"
			/>

			<liferay-ui:search-container-column-text
				name="SysGroup.name"
				value='<%= aSysGroup.getName() == null ? "" : HtmlUtil.escape(aSysGroup.getName()) %>'
			/>

			<liferay-ui:search-container-column-text
				name="SysGroup.groupCode"
				value='<%= aSysGroup.getGroupCode() == null ? "" : HtmlUtil.escape(aSysGroup.getGroupCode()) %>'
			/>

			<liferay-ui:search-container-column-text
				name="Common.Address"
				value='<%= aSysGroup.getAddress() == null ? "" : HtmlUtil.escape(aSysGroup.getAddress()) %>'
			/>

			<liferay-ui:search-container-column-text>
				<%
				Map<String, Object> data = new HashMap<String, Object>();

				data.put("groupid", aSysGroup.getGroupId());
				data.put("name", aSysGroup.getName());
				data.put("groupcode", aSysGroup.getGroupCode());
				%>
				<aui:button cssClass="selector-button" data="<%= data %>" value="choose" />
			</liferay-ui:search-container-column-text>

		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</aui:form>
<aui:script use="aui-base">
	var Util = Liferay.Util;

	A.one('#<portlet:namespace />selectSysGroupFm').delegate(
		'click',
		function(event) {
			var result = Util.getAttributes(event.currentTarget, 'data-');

			Util.getOpener().Liferay.fire('<%= HtmlUtil.escapeJS(eventName) %>', result);

			Util.getWindow().hide();
		},
		'.selector-button'
	);
</aui:script>
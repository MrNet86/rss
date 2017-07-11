<%@page import="java.util.Collections"%>
<%@page import="com.viettel.ams.core.model.SysGroup"%>
<%@ include file="/jsp/init.jsp" %>
<%
String backURL = ParamUtil.getString(request, "backURL");
String sysgroupIds = ParamUtil.getString(request,
			"sysGroupsSearchContainerPrimaryKeys");
List<SysGroup> sysgroups = new ArrayList<SysGroup>();

// System.out.println("sysgroupIds :"+sysgroupIds);

if(Validator.isNotNull(sysgroupIds)){
	long[] sysgroupArray = StringUtil.split(sysgroupIds, 0L);
	SysGroup obj = SysGroupLocalServiceUtil.getSysGroup(sysgroupArray[0]);
	sysgroups.add(obj);
}
// System.out.println("sysgroups :"+sysgroups.size());
currentURLObj.setParameter("historyKey", renderResponse.getNamespace() + "sysgroups");
%>

<portlet:actionURL var="actionURL">
	<portlet:param name="action" value="<%= ActionConstants.UPDATE_MANAGE_REQ %>"/>
</portlet:actionURL>

<liferay-util:buffer var="removeSysGroupIcon">
	<liferay-ui:icon
		image="unlink"
		label="<%= true %>"
		message="remove"
	/>
</liferay-util:buffer>

<aui:form action="<%= actionURL %>" method="post" name="name">

	<liferay-util:include page="/jsp/assetManage/toolbar.jsp"
		servletContext="<%= this.getServletContext() %>"
	/>

	<aui:row>
		<aui:col span="6">
			<aui:input name="document" label="Req.document"
				cssClass="size60" inlineLabel="false">
				<aui:validator name="required"/>
			</aui:input>
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col span="6">
			<aui:input type="text" cssClass="size60"
				name="reqGroupName" value="${reqGroupName}"
				label="Req.reqGroupName" inlineLabel="false">
				<aui:validator name="required" />
			</aui:input>
			<aui:input name="reqGroupId" type="hidden"/>
		</aui:col>
		<aui:col span="6">
			<aui:input type="text" cssClass="size60" inlineLabel="false"
			name="delegator" label="Req.delegator"/>
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col span="6">
			<aui:input type="text" cssClass="size60" inlineLabel="false"
				name="titleDelegator" label="Req.titleDelegator"/>
		</aui:col>
		<aui:col span="6">
			<aui:input type="text" cssClass="size60" inlineLabel="false"
				name="mobileNumber" label="Req.mobileNumber"/>
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col span="6">
			<aui:input type="text" cssClass="size60"
				name="recvGroupName" value="${recvGroupName}"
				label="Req.recvGroupName" inlineLabel="false">
			</aui:input>
			<aui:input name="recvGroupId" type="hidden"/>
		</aui:col>
		<aui:col span="6">
			<aui:select name="retrieceCauseId" label="Req.retrieceCauseId"
				inlineLabel="false" cssClass="size60">
				<aui:option value='1' >
					Hạ cấp
				</aui:option>
				<aui:option value='2' >
					Nâng cấp
				</aui:option>
				<aui:option value='3' selected='<%= true %>'>
					Thay đổi người quản lý tài sản
				</aui:option>
			</aui:select>
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col span="6">
			<aui:select name="type" label="Req.type" showRequiredLabel="true"
				inlineLabel="false" cssClass="size60">
				<aui:option value='1' >
					<liferay-ui:message key="Req.type.1" />
				</aui:option>
				<aui:option value='2' >
					<liferay-ui:message key="Req.type.2" />
				</aui:option>
				<aui:option value='3' selected='<%= true %>'>
					<liferay-ui:message key="Req.type.3" />
				</aui:option>
			</aui:select>
		</aui:col>
		<aui:col span="6">

		</aui:col>
	</aui:row>


	<!-- Danh sach tai san -->
	<h3><liferay-ui:message key="organizations" /></h3>
	<liferay-ui:search-container
		curParam="organizationsCur"
		headerNames="groupId,name,groupCode,null"
		iteratorURL="<%= currentURLObj %>"
		total="<%= sysgroups.size() %>"
	>
		<liferay-ui:search-container-results
			results="<%= sysgroups.subList(searchContainer.getStart(), searchContainer.getResultEnd()) %>"
		/>

		<liferay-ui:search-container-row
			className="com.viettel.ams.core.model.SysGroup"
			escapedModel="<%= true %>"
			keyProperty="groupId"
			modelVar="aSysGroup"
		>
			<liferay-ui:search-container-column-text
				name="groupId"
				property="groupId"
			/>
			<liferay-ui:search-container-column-text
				name="name"
				property="name"
			/>
			<liferay-ui:search-container-column-text
				name="groupCode"
				property="groupCode"
			/>
			<liferay-ui:search-container-column-text name="remove">
				<a class="modify-link" data-rowId="<%= aSysGroup.getGroupId() %>" href="javascript:;"><%= removeSysGroupIcon %></a>
			</liferay-ui:search-container-column-text>

		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
	<br />

	<liferay-ui:icon
		cssClass="modify-link"
		iconCssClass="icon-search"
		id="selectSysGroupLink"
		label="<%= true %>"
		linkCssClass="btn"
		message="select"
		method="get"
		url="javascript:;"
	/>

	<aui:button-row>
		<aui:button type="submit" value="Command.Save" icon="icon-save" />
		<aui:button type="cancel" value="Command.Cancel"  icon="icon-undo" href="<%= backURL %>" />
	</aui:button-row>

</aui:form>

<aui:script use="liferay-search-container">
	var searchContainer = Liferay.SearchContainer.get('<portlet:namespace />sysGroupsSearchContainer');

	searchContainer.get('contentBox').delegate(
		'click',
		function(event) {
			var link = event.currentTarget;
			var tr = link.ancestor('tr');

			searchContainer.deleteRow(tr, link.getAttribute('data-rowId'));
		},
		'.modify-link'
	);

	var selectSysGroupLink = A.one('#<portlet:namespace />selectSysGroupLink');

	if (selectSysGroupLink) {
		selectSysGroupLink.on(
			'click',
			function(event) {
				Liferay.Util.selectEntity(
					{
						dialog: {
							constrain: true,
							modal: true
						},
						id: '<portlet:namespace />selectSysGroup',
						title: '<liferay-ui:message arguments="aSysGroup" key="select-x" />',
						uri: '<portlet:renderURL windowState="<%= LiferayWindowState.POP_UP.toString() %>"><portlet:param name="action" value="<%= ActionConstants.SELECT_MER_ENTITY %>" /></portlet:renderURL>'
					},
					function(event) {
						var rowColumns = [];

						rowColumns.push(event.groupid);
						rowColumns.push(event.name);
						rowColumns.push(event.groupcode);
						rowColumns.push('<a class="modify-link" data-rowId="' + event.groupid + '" href="javascript:;"><%= UnicodeFormatter.toString(removeSysGroupIcon) %></a>');

						searchContainer.addRow(rowColumns, event.groupid);
						searchContainer.updateDataStore();
					}
				);
			}
		);
	}
</aui:script>




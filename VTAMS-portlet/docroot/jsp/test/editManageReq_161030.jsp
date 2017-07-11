<%@page import="com.viettel.ams.core.model.AssetManageReq"%>
<%@page import="com.viettel.ams.core.model.MerEntity"%>
<%@page import="com.viettel.ams.modelext.MerEntityExt"%>
<%@page import="java.util.Collections"%>
<%@page import="com.viettel.ams.core.model.SysGroup"%>
<%@ include file="/jsp/init.jsp" %>
<%
String backURL = ParamUtil.getString(request, "backURL");
AssetManageReq manageReq = (AssetManageReq) request.getAttribute("manageReq");

// SysGroup
// String sysgroupIds = ParamUtil.getString(request,
// 			"sysGroupsSearchContainerPrimaryKeys");
// List<SysGroup> sysgroups = new ArrayList<SysGroup>();

// if(Validator.isNotNull(sysgroupIds)){
// 	long[] sysgroupArray = StringUtil.split(sysgroupIds, 0L);
// 	SysGroup obj = SysGroupLocalServiceUtil.getSysGroup(sysgroupArray[0]);
// 	sysgroups.add(obj);
// }
// currentURLObj.setParameter("historyKey", renderResponse.getNamespace() + "sysgroups");

// MerEntity
String merEntityIds = ParamUtil.getString(request,
			"merEntityExtsSearchContainerPrimaryKeys");
System.out.println("merEntityIds :"+merEntityIds);
List<MerEntityExt> merEntityExts = new ArrayList<MerEntityExt>();

// if(Validator.isNotNull(merEntityIds)){
// 	long[] arrIds = StringUtil.split(merEntityIds, 0L);
// 	merEntityExts = MerEntityLocalServiceUtil.getMerEntity(arrIds[0]);
// }
if(manageReq != null) {

}

currentURLObj.setParameter("historyKey", renderResponse.getNamespace() + "merEntitys");

System.out.println("ID : " + themeDisplay.getPortletDisplay().getId());

System.out.println("InstanceID: " + themeDisplay.getPortletDisplay().getInstanceId());

System.out.println("Portlet Name: " + themeDisplay.getPortletDisplay().getPortletName());

%>

<portlet:actionURL var="actionURL">
	<portlet:param name="action" value="<%= ActionConstants.UPDATE_MANAGE_REQ %>"/>
</portlet:actionURL>

<liferay-util:buffer var="removeIcon">
	<liferay-ui:icon
		image="unlink"
		label="<%= true %>"
		message="remove"
	/>
</liferay-util:buffer>

<aui:form action="<%= actionURL %>" method="post" name="fm">
	<aui:model-context model="<%= AssetManageReq.class %>" bean="<%= manageReq %>" />
	<aui:input name="manageReqId" type="hidden" value="<%= manageReq.getManageReqId() %>"/>

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
				name="mobileNumber" label="Req.mobileNumber">
				<aui:validator name="number" />
			</aui:input>
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col span="6">
			<aui:input type="text" cssClass="size60"
				name="recvGroupName" value="${recvGroupName}"
				label="Req.recvGroupName" inlineLabel="false">
				<aui:validator name="required" />
			</aui:input>
			<aui:input name="recvGroupId" type="hidden"/>
		</aui:col>
		<aui:col span="6">
			<aui:select name="retrieveCauseId" label="Req.retrieveCauseId"
				inlineLabel="false" cssClass="size60">
				<aui:option value='1' >
					<liferay-ui:message key="Req.retrieceCause.1" />
				</aui:option>
				<aui:option value='2' >
					<liferay-ui:message key="Req.retrieceCause.2" />
				</aui:option>
				<aui:option value='3' >
					<liferay-ui:message key="Req.retrieceCause.3" />
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
	<br />

	<!-- Danh sach tai san -->
	<liferay-ui:panel collapsible="<%= true %>" extended="<%= true %>" id="selectMerEntityPanel" persistState="<%= true %>" title="Req.MerEntity.Title">

		<liferay-ui:search-container
			curParam="merCurParam"
			headerNames="Mer.Id,Mer.merName,Mer.merCode,Mer.serialNumber,
				Mer.count,Mer.reqCount,Common.Comment,null"
			iteratorURL="<%= currentURLObj %>"
			total="<%= merEntityExts.size() %>"
		>
			<liferay-ui:search-container-results
				results="<%= merEntityExts.subList(searchContainer.getStart(), searchContainer.getResultEnd()) %>"
			/>

			<liferay-ui:search-container-row
				className="com.viettel.ams.modelext.MerEntityExt"
				escapedModel="<%= true %>"
				keyProperty="merEntityId"
				modelVar="aMerEntity"
			>

				<liferay-ui:search-container-column-text property="merEntityId" name="Mer.Id"/>
				<liferay-ui:search-container-column-text property="merName" name="Mer.merName"/>
				<liferay-ui:search-container-column-text property="merCode" name="Mer.merCode"/>
				<liferay-ui:search-container-column-text property="serialNumber" name="Mer.serialNumber"/>
				<liferay-ui:search-container-column-text property="count" name="Mer.count"/>

				<liferay-ui:search-container-column-jsp path="/jsp/merEntity/reqCount.jsp"/>
				<liferay-ui:search-container-column-jsp path="/jsp/merEntity/description.jsp"/>

				<liferay-ui:search-container-column-text name="remove">
					<a class="modify-link" data-rowId="<%= aMerEntity.getMerEntityId() %>" href="javascript:;"><%= removeIcon %></a>
				</liferay-ui:search-container-column-text>

			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator />
		</liferay-ui:search-container>
		<br />

		<liferay-ui:icon
			cssClass="modify-link"
			iconCssClass="icon-search"
			id="selectLink"
			label="<%= true %>"
			linkCssClass="btn"
			message="select"
			method="get"
			url="javascript:;"
		/>
	</liferay-ui:panel>

	<aui:button-row>
		<aui:button type="submit" value="Command.Save" icon="icon-save" />
		<aui:button type="cancel" value="Command.Cancel"  icon="icon-undo" href="<%= backURL %>" />
	</aui:button-row>

</aui:form>


<liferay-portlet:resourceURL var="getAutoSysGroup"
	portletName="VTAdmin_WAR_VTAdminportlet" plid="<%= ActionConstants.ADMIN_LAYOUT_ID %>"
	id="<%=ActionConstants.AUTO_GET_SYS_GROUP %>"
/>

<aui:script use="liferay-search-container">
	var searchContainer = Liferay.SearchContainer.get('<portlet:namespace />merEntityExtsSearchContainer');

	searchContainer.get('contentBox').delegate(
		'click',
		function(event) {
			var link = event.currentTarget;
			var tr = link.ancestor('tr');

			searchContainer.deleteRow(tr, link.getAttribute('data-rowId'));
		},
		'.modify-link'
	);

	var selectLink = A.one('#<portlet:namespace />selectLink');

	if (selectLink) {
		selectLink.on(
			'click',
			function(event) {
				Liferay.Util.selectEntity(
					{
						dialog: {
							constrain: true,
							modal: true,
							width: 1000
						},
						id: '<portlet:namespace />selectMerEntity',
						title: '<liferay-ui:message arguments="aMerEntity" key="select-x" />',
						uri: '<portlet:renderURL windowState="<%= LiferayWindowState.POP_UP.toString() %>"><portlet:param name="action" value="<%= ActionConstants.SELECT_MER_ENTITY %>" /></portlet:renderURL>'
					},
					function(event) {
						var rowColumns = [];

						rowColumns.push(event.merentityid);
						rowColumns.push(event.mername);
						rowColumns.push(event.mercode);
						rowColumns.push(event.serialnumber);
						rowColumns.push(event.count);
						rowColumns.push('<input type="text" name="<portlet:namespace />reqCount" value="'+ event.count +'"/><input type="hidden" name="<portlet:namespace />merId" value="'+ event.merentityid +'"/>');
						rowColumns.push('<input type="text" name="<portlet:namespace />description" value=""/>');
// 						rowColumns.push('<textarea form ="fm" name="<portlet:namespace />description"  cols="40" wrap="soft" rows="2"></textarea>');
						rowColumns.push('<a class="modify-link" data-rowId="' + event.merentityid + '" href="javascript:;"><%= UnicodeFormatter.toString(removeIcon) %></a>');

						searchContainer.addRow(rowColumns, event.merentityid);
						searchContainer.updateDataStore();
					}
				);
			}
		);
	}
</aui:script>

<aui:script>
// RequestGroup
AUI().use('autocomplete-list','aui-base','aui-io-request',
		'autocomplete-filters','autocomplete-highlighters',
	function (A) {
		var responseData;

		var autoComplete = new A.AutoCompleteList({
			allowBrowserAutocomplete: 'true',
			activateFirstItem: 'true',
			inputNode: '#<portlet:namespace />reqGroupName',
			resultTextLocator:'groupCode',
			disabled : true,
			minQueryLength : 3,
			on: {
				select: function(event) {
					var result = event.result.raw;
					A.one('#<portlet:namespace/>reqGroupId').set('value',result.groupId);
				}
			},
			render: 'true',
			resultHighlighter: 'phraseMatch',
			resultFilters:['phraseMatch'],
			source:function(){
				var inputValue=A.one("#<portlet:namespace />reqGroupName").get('value');
				var myAjaxRequest=A.io.request('<%= getAutoSysGroup.toString() %>' ,{
					dataType: 'json',
					method:'POST',
					data:{groupCode: inputValue,},
					autoLoad:false,
					sync:false,
					on: {
						success:function(){
							var data=this.get('responseData');
							responseData=data;
					}}
				});
				myAjaxRequest.start();
				return responseData;
			},
		});
	});

// ReceiveGroup
AUI().use('autocomplete-list','aui-base','aui-io-request',
		'autocomplete-filters','autocomplete-highlighters',
	function (A) {
		var responseData;

		var autoComplete = new A.AutoCompleteList({
			allowBrowserAutocomplete: 'true',
			activateFirstItem: 'true',
			inputNode: '#<portlet:namespace />recvGroupName',
			resultTextLocator:'groupCode',
			disabled : true,
			minQueryLength : 3,
			on: {
				select: function(event) {
					var result = event.result.raw;
					A.one('#<portlet:namespace/>recvGroupId').set('value',result.groupId);
				}
			},
			render: 'true',
			resultHighlighter: 'phraseMatch',
			resultFilters:['phraseMatch'],
			source:function(){
				var inputValue=A.one("#<portlet:namespace />recvGroupName").get('value');
				var myAjaxRequest=A.io.request('<%= getAutoSysGroup.toString() %>' ,{
					dataType: 'json',
					method:'POST',
					data:{groupCode: inputValue,},
					autoLoad:false,
					sync:false,
					on: {
						success:function(){
							var data=this.get('responseData');
							responseData=data;
					}}
				});
				myAjaxRequest.start();
				return responseData;
			},
		});
	});
</aui:script>


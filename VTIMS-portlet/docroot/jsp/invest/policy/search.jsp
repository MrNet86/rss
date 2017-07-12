<%@page import="com.viettel.ims.search.InvestPolicySearch"%>
<%@page import="com.viettel.ims.search.InvestPolicyDisplayTerms"%>
<%@page import="com.viettel.ims.common.ActionConstants"%>
<%@ include file="/jsp/init.jsp"%>

<%
	String redirect = ParamUtil.getString(request, "redirect");

	InvestPolicySearch searchContainer = (InvestPolicySearch) request
			.getAttribute("liferay-ui:search:searchContainer");
	InvestPolicyDisplayTerms displayTerms = (InvestPolicyDisplayTerms) searchContainer
			.getDisplayTerms();
%>
<aui:column columnWidth="50">
	<aui:input label="Policy.infoPolicyName" cssClass="size60"
		inlineLabel="left" inlineField="false"
		name="<%=displayTerms.INFO_POLICY_NAME%>"
		value="<%=displayTerms.getInfoPolicyName()%>" />

	<aui:input label="Policy.infoProposeGroupId" cssClass="size60"
		name="<%= displayTerms.INFO_PROPOSE_GROUP_NAME %>"
		value="<%= displayTerms.getInfoProposeGroupName() %>" inlineLabel="false" />
	<aui:input type="hidden"
		name="<%= displayTerms.INFO_PROPOSE_GROUP_ID %>"
		value="<%= displayTerms.getInfoProposeGroupId() %>"/>


</aui:column>

<aui:column columnWidth="50">
	<aui:select label="Policy.infoPolicyType" cssClass="size60"
		name="<%= displayTerms.INFO_POLICY_TYPE %>" inlineLabel="false">
		<option value='0'>
			<liferay-ui:message key="Common.Select" />
		</option>
		<option value="1">
			<liferay-ui:message key="Policy.Shopping" />
		</option>
		<option value="2">
			<liferay-ui:message key="Policy.Invest" />
		</option>
	</aui:select>

	<aui:row>
		<aui:input label="Policy.infoVerifyGroupId" cssClass="size60"
			name="<%= displayTerms.INFO_VERIFY_GROUP_NAME %>"
			value="<%= displayTerms.getInfoVerifyGroupName() %>" inlineLabel="false"/>
		<aui:input type="hidden"
			name="<%= displayTerms.INFO_VERIFY_GROUP_ID %>"
			value="<%= displayTerms.getInfoVerifyGroupId() %>"/>
	</aui:row>
</aui:column>

<aui:button-row>
	<portlet:renderURL var="searchSysGroupURL"
		windowState="<%=WindowState.NORMAL.toString()%>">
		<portlet:param name="action"
			value="<%=ActionConstants.VIEW_INVEST_POLICY%>" />
	</portlet:renderURL>
	<aui:button type="submit" value="Command.Search" icon="icon-search" />
	<aui:button type="cancel" value="Command.Cancel" icon="icon-undo"
		href="<%=redirect%>" />
</aui:button-row>


<liferay-portlet:resourceURL var="getAutoSysGroup"
	portletName="VTAdmin_WAR_VTAdminportlet" plid="40401"
	id="<%=ActionConstants.AUTO_GET_SYS_GROUP %>" />

<aui:script>
//DV De xuat
AUI().use('autocomplete-list','aui-base','aui-io-request','autocomplete-filters','autocomplete-highlighters',
	function (A) {
		var responseData;
		var groupName = A.one("#<portlet:namespace />infoProposeGroupName").get('value');
		if(groupName == '') {
			A.one('#<portlet:namespace/>infoProposeGroupId').set('value', 0);
		}
		var autoComplete = new A.AutoCompleteList({
			allowBrowserAutocomplete: 'true',
			activateFirstItem: 'true',
			inputNode: '#<portlet:namespace />infoProposeGroupName',
			resultTextLocator:'groupCode',
			disabled : true,
			minQueryLength : 3,
			on: {
				select: function(event) {
					var result = event.result.raw;
					A.one('#<portlet:namespace/>infoProposeGroupId').set('value',result.groupId);
				}
			},
			render: 'true',
			resultHighlighter: 'phraseMatch',
			resultFilters:['phraseMatch'],
			source:function(){
				var inputValue=A.one("#<portlet:namespace />infoProposeGroupName").get('value');
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
	}
);

//DV Tham dinh
AUI().use('autocomplete-list','aui-base','aui-io-request','autocomplete-filters','autocomplete-highlighters',
	function (A) {
		var responseData;

		var autoComplete = new A.AutoCompleteList({
			allowBrowserAutocomplete: 'true',
			activateFirstItem: 'true',
			inputNode: '#<portlet:namespace />infoVerifyGroupName',
			resultTextLocator:'groupCode',
			disabled : true,
			minQueryLength : 3,
			on: {
				select: function(event) {
					var result = event.result.raw;
					A.one('#<portlet:namespace/>infoVerifyGroupId').set('value',result.groupId);
				}
			},
			render: 'true',
			resultHighlighter: 'phraseMatch',
			resultFilters:['phraseMatch'],
			source:function(){
				var inputValue=A.one("#<portlet:namespace />infoVerifyGroupName").get('value');
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
	}
);

</aui:script>
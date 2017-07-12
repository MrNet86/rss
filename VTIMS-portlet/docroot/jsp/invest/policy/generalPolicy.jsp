<%@page import="com.viettel.admin.core.service.SysGroupLocalServiceUtil"%>
<%@page import="com.viettel.admin.core.model.SysGroup"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="com.viettel.ims.core.model.InvestPolicy"%>
<%@page import="com.viettel.ims.common.ActionConstants"%>
<%@page import="com.liferay.portal.ContactBirthdayException"%>
<%@include file="/jsp/init.jsp" %>

<%
	InvestPolicy generalPolicy = (InvestPolicy)request.getAttribute("investPolicy");
	if(generalPolicy != null) {
		System.out
				.println("generalPolicy is not null 111 infoService :"
						+ generalPolicy.getInfoService()
						+ " || contains 4 :"
						+ generalPolicy.getInfoService().contains("4"));
	} else {
		System.out.println("generalPolicy is null 111");
	}

	Calendar infoPolicyDate = CalendarFactoryUtil.getCalendar(timeZone,
			locale);
	if (generalPolicy.getInfoPolicyDate() != null) {
		infoPolicyDate.setTime(generalPolicy.getInfoPolicyDate());
	}

	Calendar infoPolicyDeployDate = CalendarFactoryUtil.getCalendar(
			timeZone, locale);
	if (generalPolicy.getInfoPolicyDeployDate() != null) {
		infoPolicyDeployDate.setTime(generalPolicy
				.getInfoPolicyDeployDate());
	}

	Boolean isAdd = (Boolean)request.getAttribute("isAdd");
	System.out.println("generalPolicy isAdd :"+isAdd);

%>

<aui:model-context model="<%= InvestPolicy.class %>" bean="<%= generalPolicy %>" />
<aui:input name="investPolicyId" type="hidden" value="<%= generalPolicy.getInvestPolicyId() %>"/>
<aui:input name="isActive" type="hidden"/>

<aui:row>
	<aui:select name="infoPolicyType" label="Policy.infoPolicyType" required="true"
		helpMessage="Choose type of Policy" inlineLabel="false" cssClass="size60">
		<aui:option value='0' disabled="disabled">
			<liferay-ui:message key="Common.Select" />
		</aui:option>
		<aui:option value="1">
			<liferay-ui:message key="Policy.Shopping" />
		</aui:option>
		<aui:option value="2">
			<liferay-ui:message key="Policy.Invest" />
		</aui:option>
	</aui:select>
</aui:row>

<aui:row>
	<aui:input name="infoPolicyName" label="Policy.infoPolicyName" type="text"
		inlineLabel="false" cssClass="size60" placeholder="Policy.Name">
		<aui:validator name="required" />
	</aui:input>
</aui:row>

<aui:row>
	<aui:input name="infoProposeGroupName" type="text"
		value="${fn:escapeXml(infoProposeGroupName)}"
		label="Policy.infoProposeGroupId" inlineLabel="false"
		cssClass="size60" placeholder="AutoComplete SysGroup.Code">
		<aui:validator name="required" />
	</aui:input>
	<aui:input name="infoProposeGroupId" type="hidden"/>
</aui:row>

<aui:row>
	<aui:input name="infoVerifyGroupName" type="text"
		value="${infoVerifyGroupName}"
		label="Policy.infoVerifyGroupId" inlineLabel="false"
		cssClass="size60" placeholder="AutoComplete SysGroup.Code">
		<aui:validator name="required" />
	</aui:input>
	<aui:input name="infoVerifyGroupId" type="hidden"/>
</aui:row>

<aui:row>
	<aui:field-wrapper label="Policy.infoPolicyDate" inlineLabel="left" inlineField="<%= false %>" >
		<liferay-ui:input-date name="infoPolicyDate"
			dayParam="infoPolicyDateDay" dayValue="<%=infoPolicyDate.get(Calendar.DATE)%>"
			monthParam="infoPolicyDateMonth" monthValue="<%=infoPolicyDate.get(Calendar.MONTH)%>"
			yearParam="infoPolicyDateYear" yearValue="<%=infoPolicyDate.get(Calendar.YEAR)%>"
			firstDayOfWeek="<%=infoPolicyDate.getFirstDayOfWeek() - 1%>"
			>
		</liferay-ui:input-date>
	</aui:field-wrapper>
</aui:row>

<aui:row>
	<aui:field-wrapper label="Policy.infoPolicyDeployDate" inlineLabel="left" inlineField="<%= false %>" >
		<liferay-ui:input-date name="infoPolicyDeployDate"
			dayParam="infoPolicyDeployDateDay" dayValue="<%=infoPolicyDeployDate.get(Calendar.DATE)%>"
			monthParam="infoPolicyDeployDateMonth" monthValue="<%=infoPolicyDeployDate.get(Calendar.MONTH)%>"
			yearParam="infoPolicyDeployDateYear" yearValue="<%=infoPolicyDeployDate.get(Calendar.YEAR)%>"
			firstDayOfWeek="<%=infoPolicyDeployDate.getFirstDayOfWeek() - 1%>"
			>
		</liferay-ui:input-date>
	</aui:field-wrapper>
</aui:row>

<aui:row>
	<aui:input name="infoResponsibleUserName" type="text"
		value="${infoResponsibleUserName}"
		label="Policy.infoResponsibleUserId" inlineLabel="false"
		cssClass="size60" placeholder="AutoComplete CatEmployee.Code">
		<aui:validator name="required" />
	</aui:input>
	<aui:input name="infoResponsibleUserId" type="hidden"/>
</aui:row>

<aui:row>
	<aui:select name="service" label="Policy.infoService" multiple="true" showRequiredLabel="true"
		helpMessage="Choose type of Service" inlineLabel="false" cssClass="size60">
		<aui:option value='1' selected='<%= generalPolicy.getInfoService().contains("1") %>'>
			<liferay-ui:message key="Policy.infoService.Type.1" />
		</aui:option>
		<aui:option value='2' selected='<%= generalPolicy.getInfoService().contains("2") %>'>
			<liferay-ui:message key="Policy.infoService.Type.2" />
		</aui:option>
		<aui:option value='3' selected='<%= generalPolicy.getInfoService().contains("3") %>'>
			<liferay-ui:message key="Policy.infoService.Type.3" />
		</aui:option>
		<aui:option value='4' selected='<%= generalPolicy.getInfoService().contains("4") %>'>
			<liferay-ui:message key="Policy.infoService.Type.4" />
		</aui:option>
		<aui:option value='5' selected='<%= generalPolicy.getInfoService().contains("5") %>'>
			<liferay-ui:message key="Policy.infoService.Type.5" />
		</aui:option>
		<aui:option value='6' selected='<%= generalPolicy.getInfoService().contains("6") %>'>
			<liferay-ui:message key="Policy.infoService.Type.6" />
		</aui:option>
		<aui:option value='7' selected='<%= generalPolicy.getInfoService().contains("7") %>'>
			<liferay-ui:message key="Policy.infoService.Type.7" />
		</aui:option>
	</aui:select>
</aui:row>

<aui:row>
	<aui:input name="infoTechnique" label="Policy.infoTechnique" inlineLabel="false" cssClass="size60">
		<aui:validator name="required" />
	</aui:input>
</aui:row>

<aui:row>
	<aui:input name="infoInvestLocation" label="Policy.infoInvestLocation" inlineLabel="false" cssClass="size60"/>
</aui:row>

<aui:row>
	<aui:input name="infoInvestTarget" label="Policy.infoInvestTarget"
		inlineLabel="false" cssClass="size60" type="textarea" cols="200"
		rows="4" >
		<aui:validator name="required" />
	</aui:input>
</aui:row>

<aui:row>
	<aui:input name="infoInvestName" label="Policy.infoInvestName" inlineLabel="false" cssClass="size60" />
</aui:row>

<aui:row>
	<aui:input name="infoInvestDeadline" label="Policy.infoInvestDeadline" inlineLabel="false" cssClass="size60"/>
</aui:row>

<aui:row>
	<aui:input name="infoInvestCreateGroupName" type="text"
		value="${infoInvestCreateGroupName}"
		label="Policy.infoInvestCreateGroupId" inlineLabel="false"
		cssClass="size60" placeholder="AutoComplete SysGroup.Code"/>
	<aui:input name="infoInvestCreateGroupId" type="hidden"/>
</aui:row>

<aui:row>
	<aui:input name="infoInvestDeployGroupName" type="text"
		value="${infoInvestDeployGroupName}"
		label="Policy.infoInvestDeployGroupId" inlineLabel="false"
		cssClass="size60" placeholder="AutoComplete SysGroup.Code"/>
	<aui:input name="infoInvestDeployGroupId" type="hidden" />
</aui:row>

<aui:row>
	<aui:col span="4">
		<liferay-ui:message key="Common.FileAttachment" />
	</aui:col>
	<aui:col span="8">
		<input id="<portlet:namespace />uploadFile"
			class="field success-field" name="uploadFile"
			style="width: auto;" type="file">
	</aui:col>
</aui:row>

<liferay-portlet:resourceURL var="getAutoCatEmployee"
	portletName="VTAdmin_WAR_VTAdminportlet" plid="40401"
	id="<%=ActionConstants.AUTO_GET_CAT_EMPLOYEE%>" />

<liferay-portlet:resourceURL var="getAutoSysGroup"
	portletName="VTAdmin_WAR_VTAdminportlet" plid="40401"
	id="<%=ActionConstants.AUTO_GET_SYS_GROUP %>" />

<aui:script>
// Ca nhan chu tri
AUI().use('autocomplete-list','aui-base','aui-io-request','autocomplete-filters','autocomplete-highlighters',
	function (A) {
		var responseData;
// 		var resourceURL = Liferay.PortletURL.createResourceURL();
// 		resourceURL.setPortletId('VTAdmin_WAR_VTAdminportlet');
// 		resourceURL.setResourceId('autoGetCatEmployee');

		var autoComplete = new A.AutoCompleteList({
			allowBrowserAutocomplete: 'true',
			activateFirstItem: 'true',
			inputNode: '#<portlet:namespace />infoResponsibleUserName',
			resultTextLocator:'code',
			disabled : true,
			minQueryLength : 3,
			on: {
				select: function(event) {
					var result = event.result.raw;
					A.one('#<portlet:namespace/>infoResponsibleUserId').set('value',result.id);
				}
			},

			render: 'true',
			resultHighlighter: 'phraseMatch',
			resultFilters:['phraseMatch'],
			source:function(){
				var inputValue=A.one("#<portlet:namespace />infoResponsibleUserName").get('value');
				var myAjaxRequest=A.io.request('<%= getAutoCatEmployee.toString() %>' ,{
					dataType: 'json',
					method:'POST',
					data:{code:inputValue,},
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

// 		autoComplete.render();

	});

// DV De xuat
AUI().use('autocomplete-list','aui-base','aui-io-request','autocomplete-filters','autocomplete-highlighters',
	function (A) {
		var responseData;

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
	});

// DV Tham dinh
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
		});


// DV to chuc lap du an
AUI().use('autocomplete-list','aui-base','aui-io-request','autocomplete-filters','autocomplete-highlighters',
	function (A) {
		var responseData;

		var autoComplete = new A.AutoCompleteList({
			allowBrowserAutocomplete: 'true',
			activateFirstItem: 'true',
			inputNode: '#<portlet:namespace />infoInvestCreateGroupName',
			resultTextLocator:'groupCode',
			disabled : true,
			minQueryLength : 3,
			on: {
				select: function(event) {
					var result = event.result.raw;
					A.one('#<portlet:namespace/>infoInvestCreateGroupId').set('value',result.groupId);
				}
			},
			render: 'true',
			resultHighlighter: 'phraseMatch',
			resultFilters:['phraseMatch'],
			source:function(){
				var inputValue=A.one("#<portlet:namespace />infoInvestCreateGroupName").get('value');
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

//DV Trien khai
AUI().use('autocomplete-list','aui-base','aui-io-request','autocomplete-filters','autocomplete-highlighters',
	function (A) {
		var responseData;

		var autoComplete = new A.AutoCompleteList({
			allowBrowserAutocomplete: 'true',
			activateFirstItem: 'true',
			inputNode: '#<portlet:namespace />infoInvestDeployGroupName',
			resultTextLocator:'groupCode',
			disabled : true,
			minQueryLength : 3,
			on: {
				select: function(event) {
					var result = event.result.raw;
					A.one('#<portlet:namespace/>infoInvestDeployGroupId').set('value',result.groupId);
				}
			},
			render: 'true',
			resultHighlighter: 'phraseMatch',
			resultFilters:['phraseMatch'],
			source:function(){
				var inputValue=A.one("#<portlet:namespace />infoInvestDeployGroupName").get('value');
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

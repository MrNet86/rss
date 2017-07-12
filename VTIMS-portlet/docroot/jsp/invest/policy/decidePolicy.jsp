<%@include file="/jsp/init.jsp"%>

<aui:row>
	<aui:input name="decideDelivererUserName" label="Policy.decideDelivererUserName" inlineLabel="false" cssClass="size60"/>
	<aui:input name="decideDelivererUserId" type="hidden" />
</aui:row>

<aui:row>
	<aui:input name="decideReceiveUserName" label="Policy.decideReceiveUserName" inlineLabel="false" cssClass="size60"/>
	<aui:input name="decideReceiveUserId" type="hidden"/>
</aui:row>

<aui:input name="decideAskDate" label="Policy.decideAskDate" inlineLabel="false" cssClass="size60"/>

<aui:input name="decideDeadline" label="Policy.decideDeadline" inlineLabel="false" cssClass="size60">
	<aui:validator name="number"/>
	<aui:validator name="max">99</aui:validator>
</aui:input>

<aui:input name="decideFinishDate" label="Policy.decideFinishDate" inlineLabel="false" cssClass="size60"/>

<aui:input name="decideDescription" label="Policy.decideDescription" type="textarea" cssClass="size60" cols="100" rows="5" inlineLabel="false" >
	<aui:validator name="maxLength">250</aui:validator>
</aui:input>


<liferay-portlet:resourceURL var="getCatEmployee" id="" />

<aui:script>
// AutoComplete CatEmployee
AUI().use('autocomplete-list','aui-base','aui-io-request','autocomplete-filters','autocomplete-highlighters',
	function (A) {
		var testData;
		var autoComplete = new A.AutoCompleteList({
			allowBrowserAutocomplete: 'true',
			activateFirstItem: 'true',
			inputNode: '#<portlet:namespace />decideDelivererUserName',
			resultTextLocator:'code',

			width: 150,
			disabled : true,
			minQueryLength : 2,
			on: {
				select: function(event) {
					var result = event.result.raw;
					A.one('#<portlet:namespace/>decideDelivererUserId').set('value',result.catEmployeeId);
				}
			},

			render: 'true',
			resultHighlighter: 'phraseMatch',
			resultFilters:['phraseMatch'],
			source:function(){
				var inputValue=A.one("#<portlet:namespace />decideDelivererUserName").get('value');
				var myAjaxRequest=A.io.request('<%= getCatEmployee.toString() %>',{
					dataType: 'json',
					method:'POST',
					data:{<portlet:namespace />code:inputValue,},
					autoLoad:false,
					sync:false,
					on: {
						success:function(){
							var data=this.get('responseData');
							testData=data;
					}}
				});
				myAjaxRequest.start();
				return testData;
			},
		});

		autoComplete.render();

	});

</aui:script>



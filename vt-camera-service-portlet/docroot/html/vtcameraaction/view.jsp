<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="init.jsp" %>

<portlet:actionURL var="updateURL" name="update"/>

<liferay-ui:success key="add-success" message="add-successfull"/>

<aui:button-row>
	<aui:button onClick='<%= renderResponse.getNamespace() + "processAction();" %>' type="submit" />
</aui:button-row>


 <aui:script>
	// temp
	// to check validate of each portlet (require to reset)
	var portletActivesTemp = [];
	// to store data of all portlet members (require to reset)
	var  callBackDataArr = [];
	// to store all file from all portlet member (require to reset)
	var fileArrayStorer = [];
	//store fileName of all portlet member to get content on server (require to reset)
	var inputFileNamesArr = [];
	function <portlet:namespace />processAction() {
		//reset temp
		portletActivesTemp = [];
		callBackDataArr = [];
		fileArrayStorer = [];
		inputFileNamesArr = [];

		// send signnal submit to all portlet member
		Liferay.fire('_submitAction', {});
	}

	Liferay.on('_callBackAction',function(event) {
		// console.log("Gọi hàm callBackAction")
		// get data from portlet member
		var callBackData = event.callBackData;
		// if each portlet member is response data
		if(callBackData) {
			//file array member
			var fileArray = [];
			fileArray = callBackData.fileArray;
			console.log("fileArray :"+fileArray +" || namespace :"+ callBackData.namespace);

			// store namespace from each data member to compare with configuration
			portletActivesTemp.push(callBackData.namespace);

			// store to global file array
			if(fileArray) {
				for(var i = 0; i < fileArray.length; i++) {
					fileArrayStorer.push(fileArray[i]);
					inputFileNamesArr.push(fileArray[i].inputName);
				}

				// delete arrayFile from callbackData
				delete callBackData.fileArray;
			}
			// store all data to submit to server to process business
			callBackDataArr.push(callBackData);
		}

		// compare namespace array with configuration
		// each portlet member is validated, it can be response here
		// when all portlet members is responsed data (portlet member has validated), the namesapce of each portlet member is stored in portletActivesTemp
		// if portletActivesTemp is equals with configuration (store in portletActives) => all portlet members is validated
		var plActive = <portlet:namespace/>compareArr(portletActivesTemp.join(","), '<%=StringUtil.merge(portletActives)%>');
		console.log("plActive   " + plActive);
		// if all portlets is validated
		if(plActive == 'true') {

				var formData = new FormData();

				formData.append('<portlet:namespace />callBackDataInputExceptFile', JSON.stringify(callBackDataArr));

				if(fileArrayStorer.length > 0) {
					formData.append('<portlet:namespace />inputFileNamesArr', inputFileNamesArr.join(","));
				}
				for(var i = 0; i < fileArrayStorer.length; i++) {
					var file = fileArrayStorer[i].file;
					formData.append(fileArrayStorer[i].inputName, file);
				}
				$.ajax({
					type: "POST",
		            enctype: 'multipart/form-data',
					   url: '<%= updateURL.toString() %>',
					   data: formData,
					   processData: false ,
					   contentType: false,
					   async: false,
					   error: function() {
					     console.log("ajax error");
					   },
					   success: function(data) {
					     console.log("ajax success");
					   },
					   type: 'POST'
					});

				// reset temp array
				portletActivesTemp = [];
				callBackDataArr = [];
				fileArrayStorer = [];
				inputFileNamesArr = [];
		}
	});

	// compare two array
	function <portlet:namespace/>compareArr(strArr1, strArr2) {
		var arrTmp1 = strArr1.split(",");
		arrTmp1 = arrTmp1.sort();

		var arrTmp2 =  strArr2.split(",");
		arrTmp2 = arrTmp2.sort();

		console.log("arrTmp1  " + arrTmp1.join(","));
		console.log("arrTmp2  " + arrTmp2.join(","));

		if(arrTmp1.join(",") == arrTmp2.join(",")) {
			return 'true';
		} else {
			return 'false';
		}
	}

</aui:script>
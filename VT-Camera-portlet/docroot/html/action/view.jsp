<%@page import="com.vt.portlet.camera.utils.CameraUtils"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="init.jsp" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<portlet:actionURL var="updateURL" >
	<portlet:param name="action" value="submitForm"/>
</portlet:actionURL>

<div id="message_"></div>

<aui:button-row>
	<aui:button onClick='<%= renderResponse.getNamespace() + "processAction();" %>' type="submit" />
</aui:button-row>

 <aui:script>
	
	// temp
	var portletActivesTemp = [];
	
	// hardcode 
	var customerDataHardCode = {};
	var serviceDataHardCode = {};
	function <portlet:namespace />processAction() {

		// test json service
		
// 		$.ajax({
// 		  url: 'https://jsonplaceholder.typicode.com/posts',
// 		  method: 'GET',
// 		  success: function(data) {
// 			//called when successful
// 	  	  	for(i in data) {
//       		   		console.log("--title :"+data[i].title);	
//       		   }
// 		  },
// 		});
		
		// end test json service
		
		
		Liferay.fire('_submitAction', {});
		
		//reset parameter value
		 portletActivesTemp = [];
		
		 customerDataHardCode = {};
		 serviceDataHardCode = {};

	}

	Liferay.on('_callBackAction',function(event) {
		console.log("Gọi hàm callBackAction")
		// get data from customer form
		
		
		var customerData = event.customerData;
		var serviceData = event.serviceData;
		
		if(customerData) {
			portletActivesTemp.push(customerData.namespace);
			customerDataHardCode = customerData;
			
		}
		
		if(serviceData) {
			portletActivesTemp.push(serviceData.namespace);
			
			serviceDataHardCode = serviceData;
		}
		
		
		var plActive = <portlet:namespace/>compareArr(portletActivesTemp.join(","), '<%=StringUtil.merge(portletActives)%>');
		console.log("plActive   " + plActive);
		if(plActive == 'true') {
			/* $.ajax({
				url: '<%= updateURL.toString() %>',
				data: {
				    <portlet:namespace />customerData : JSON.stringify(customerDataHardCode),
				    <portlet:namespace />serviceData : JSON.stringify(serviceDataHardCode)
				},
				error: function() {
					console.log("Có lỗi khi gọi hàm ajax");
				},
				dataType: 'jsonp',
				success: function(data) {
				  	console.log("success");
				  	alert("Submit ajax thành công");
				},
				type: 'POST'
			}); 
			
			$.ajax({
				url:'<%= updateURL.toString() %>',
				dataType: "json",
				data:{
					<portlet:namespace />customerData : JSON.stringify(customerDataHardCode),
				    <portlet:namespace />serviceData : JSON.stringify(serviceDataHardCode)
				},
				type: "get",
				success: function(data){					
					//Firing the event.
					console.log("success");
				}
			});
			*/
			
			AUI().use('aui-io-request', function(A){
				 
		        A.io.request('<%=updateURL.toString()%>', {
		               method: 'post',
		               dataType: 'json',
		               data: {
		            	   <portlet:namespace />customerData : JSON.stringify(customerDataHardCode),
						   <portlet:namespace />serviceData : JSON.stringify(serviceDataHardCode)
		               },
		               on: {
		                   success: function() {
		                	   console.log("ajax success");
		                	   document.getElementById("message_").innerHTML = "add successfull";
		                   }
		               }
		        });
		 
		    });
			
			
			// reset temp
			portletActivesTemp = [];
			customerDataHardCode = {};
			serviceDataHardCode = {};
		}
	});

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
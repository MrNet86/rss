<%@page import="com.vt.camera.service.CustomerLocalServiceUtil"%>
<%@page import="com.vt.camera.model.Customer"%>
<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="init.jsp" %>

<%
List<Customer> lstCustomer = CustomerLocalServiceUtil.getCustomers(-1, -1);
Calendar issueDate = CalendarFactoryUtil.getCalendar(timeZone,
		locale);

Calendar birthday = CalendarFactoryUtil.getCalendar(timeZone,
		locale);

%>

<portlet:resourceURL id="getSelectedCustomer" var="getSelectedCustomerURL" />

<portlet:resourceURL id="getCustomerTypeByGroup" var="getCustomerTypeByGroupURL" />

<div class="container-fluid container-vt">
<!-- 	<h3 class="title">Thông tin khách hàng</h3> -->
	<form id="<portlet:namespace/>fm" name="<portlet:namespace/>fm" class="form-horizontal" action="" method="POST">
		<div class="row-fluid">
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Chọn khách hàng</label>
		    		<div class="controls span6">
		      			<aui:select name="customerService" label="" onchange="getCustomerService()">
							<%
							for(Customer customer : lstCustomer) {
							%>
								<option value="<%= customer.getCustomerId() %>"><%= customer.getFullName() %></option>
							<%
								}
							%>
						</aui:select>
		    		</div>
		    	</div>
	    	</div>
    	</div>

    	<div class="row-fluid">
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Nhóm loại khách hàng</label>
		    		<div class="controls span6">
		    			<aui:select name="customerGroup" label="" onChange="getCustomerTypeByGroup()">
							<aui:option label="Cá nhân trong nước" value="1" />
							<aui:option label="Doanh nghiệp" value="2" />
						</aui:select>
		    		</div>
		    	</div>
	    	</div>

	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" >Loại khách hàng <span class="required">*</span></label>
		    		<div class="controls span6">
		      			<aui:select name="customerType" label="" >
						</aui:select>
		    		</div>
		    	</div>
	    	</div>
    	</div>

    	<div class="row-fluid">
			<div class="span4">
				<div class="control-group row-fluid">
					<div class="control-label control-label-input span6">
						<aui:select name="identifyType" label="" onChange="getCustomerTypeByGroup()" class="control-label" >
							<aui:option label="CMT" value="1" />
							<aui:option label="Hộ chiếu" value="2" />
						</aui:select>
					</div>

					<div class="controls span6">
<!-- 						<div class="input-append"> -->
								<aui:input type="text" name="identifyNo" label="">
									<aui:validator name="required" errorMessage="Bắt buộc nhập số CMT"/>
									<aui:validator name="number" errorMessage="Chỉ được nhập số" />
								</aui:input>
<!-- 								<span class="add-on icon-search"></span> -->
<!-- 	      				</div> -->
		    		</div>
<!-- 		    		<div class="controls span6"> -->
<!-- 						<div class="input-append"> -->
<%-- 	      					<input id="<portlet:namespace/>identifyNo" name="<portlet:namespace/>identifyNo" type="text"/> --%>
<!-- 	      					<span class="add-on icon-search"></span> -->
<!-- 	      				</div> -->
<!--       				</div> -->
	    		</div>
	    	</div>

	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6">Nơi cấp <span class="required">*</span></label>
		    		<div class="controls span6">
		      			<aui:input name="issuePlace" label="" />
		    		</div>
		    	</div>
	    	</div>

	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" >Ngày cấp <span class="required">*</span></label>
		    		<div class="controls span6">
		      			<liferay-ui:input-date name="issueDate"
							dayParam="issueDateDay" dayValue="<%=issueDate.get(Calendar.DATE)%>"
							monthParam="issueDateMonth" monthValue="<%=issueDate.get(Calendar.MONTH)%>"
							yearParam="issueDateYear" yearValue="<%=issueDate.get(Calendar.YEAR)%>"
							firstDayOfWeek="<%=issueDate.getFirstDayOfWeek() - 1%>"
						/>
		    		</div>
		    	</div>
	    	</div>
	    </div>

	    <div class="row-fluid">
	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" >Tên khách hàng <span class="required">*</span></label>
		    		<div class="controls span6">
		      			<aui:input name="fullName" label="" />
		    		</div>
		    	</div>
	    	</div>

	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" >Ngày sinh<span class="required">*</span></label>
		    		<div class="controls span6">
		      			<liferay-ui:input-date name="birthday"
							dayParam="birthdayDay" dayValue="<%=birthday.get(Calendar.DATE)%>"
							monthParam="birthdayMonth" monthValue="<%=birthday.get(Calendar.MONTH)%>"
							yearParam="birthdayYear" yearValue="<%=birthday.get(Calendar.YEAR)%>"
							firstDayOfWeek="<%=birthday.getFirstDayOfWeek() - 1%>"
						/>
		    		</div>
		    	</div>
	    	</div>

	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" >Giới tính</label>
		    		<div class="controls span6">
		    			<div class="form-inline">
			      			<label class="radio mr-20">
			      				<input type="radio" name="sex" value="1" checked>
			      				<div class="radio-check"><div class="inside"></div></div>
			      				Nam
	  						</label>
	  						<label class="radio">
	  							<input type="radio" name="sex" value="2">
	  							<div class="radio-check"><div class="inside"></div></div>
	  							Nữ
							</label>
						</div>
		    		</div>
		    	</div>
	    	</div>
	    </div>

	    <div class="row-fluid">
	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" >Quốc tịch</label>
		    		<div class="controls span6">
		      			<aui:input name="nationalId" label="" />
		    		</div>
		    	</div>
	    	</div>

	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" >Địa chỉ <span class="required">*</span></label>
		    		<div class="controls span6">
   						<aui:input name="address" label="" type="textarea" col="3"/>
		    		</div>
		    	</div>
	    	</div>

	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" >Ghi chú</label>
		    		<div class="controls span6">
		      			<aui:input name="description" label="" type="textarea" col="3"/>
		    		</div>
		    	</div>
	    	</div>
	    </div>
	</form>
</div>

<aui:script>

$(document).ready(function() {
	getCustomerTypeByGroup();
});

var rules = {
	<portlet:namespace />identifyNo: {
		required: true,
		number: true
	},
	<portlet:namespace />issuePlace: {
		required: true
	},
	<portlet:namespace />issueDate: {
		required: true
	},
	<portlet:namespace />fullName: {
		required: true
	},
	<portlet:namespace />birthday: {
		required: true
	},
	<portlet:namespace />address: {
		required: true
	}
}

var fieldStrings = {
	<portlet:namespace />identifyNo: {
		required: 'Bạn phải nhập số CMT',
		number: 'Chỉ dc nhập số'
	},
	<portlet:namespace />issuePlace: {
		required: 'Bạn phải nhập nơi cấp CMT'
	},
	<portlet:namespace />issueDate: {
		required: 'Bạn phải nhập ngày cấp CMT'
	},
	<portlet:namespace />fullName: {
		required: 'Bạn phải nhập họ tên khách hàng'
	},
	<portlet:namespace />birthday: {
		required: 'Bạn phải nhập ngày sinh khách hàng'
	},
	<portlet:namespace />address: {
		required: 'Bạn phải nhập địa chỉ khách hàng'
	}
}
Liferay.on('_submitAction',function(event) {

	AUI().ready('aui-form-validator', 'aui-overlay-context-panel', function(A) {

		var validator1 = new A.FormValidator({

			boundingBox: '#<portlet:namespace />fm',
			validateOnBlur: true,
			selectText: true,
			rules: rules,
			fieldStrings: fieldStrings
		});

		validator1.validate();

		var formObj = $('#<portlet:namespace/>fm');
		if(validator1.hasErrors()){
			event.halt();
		}
		else {
			<portlet:namespace />checkValidate(formObj);
		}

	});

});


function <portlet:namespace />checkValidate(formObj) {
	var data = formObj.serializeArray().reduce(function(obj, item) {
 	    obj[item.name] = item.value;
 	    return obj;
 	}, {});
	var responseData = {};
	responseData.formData = data;
	responseData.namespace = '<portlet:namespace />';
	Liferay.fire('_callBackAction', {
		callBackData : responseData
	});

}
function getCustomerService() {
	var sel = document.getElementById("<portlet:namespace/>customerService");
   	var customerId = sel.options[sel.selectedIndex].value;
   	console.log("customerId :"+customerId);

   	$.ajax({
		url:'<%= getSelectedCustomerURL %>',
		dataType: "json",
		data:{
			<portlet:namespace />customerId: customerId
		},
		type: "get",
		success: function(data){
			//Firing the event.
			Liferay.fire('setCustomerService', {jsonCustomerService:data});
		}
	});

}

Liferay.provide(
	window,
	'getCustomerTypeByGroup',
	function() {
		var	customerGroup = document.getElementById("<portlet:namespace/>customerGroup").value;
// 		console.log("--customerGroup :"+customerGroup);

		AUI().use('aui-io-request', function(A){

	        A.io.request('<%=  getCustomerTypeByGroupURL %>', {
            	method: 'get',
           		dataType: 'json',
                data: {
            	    <portlet:namespace />customerGroup : customerGroup
                },
                on: {
           	    	success: function(event, id, obj) {
	           	    	// clear old option data
	       		   	   	var customerType = document.getElementById("<portlet:namespace/>customerType");
	               	    if(customerType != 'undefined' && customerType != null && customerType != '') {
	               		    $('#<portlet:namespace/>customerType').empty();
	               	    }

	               	    // add new option data
	           		    var responseData = this.get('responseData');
						console.log("data :"+JSON.stringify(responseData));
					    for(var i in responseData.data) {
						    console.log("get type service success :"+ responseData.data[i].typeTitle);
						    var opt = document.createElement('option');
						    opt.innerHTML = responseData.data[i].typeTitle;
	                	    opt.value = responseData.data[i].titleId;
	                	    customerType.appendChild(opt);
					    }
                    }
                }
	        });

	    });
	},
	['aui-io-request', 'aui-base']
);

</aui:script>
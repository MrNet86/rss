<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="init.jsp" %>

<%
Calendar appointDate = CalendarFactoryUtil.getCalendar(timeZone,
		locale);
%>
<portlet:renderURL var="defaultServiceURL">
     <param value="controller" name="service">
</portlet:renderURL>

<div class="container-fluid container-vt">
<!-- 	<h3 class="title">Thông tin khách hàng</h3> -->
	<form id="<portlet:namespace/>fm" name="<portlet:namespace/>fm" class="form-horizontal" action="" method="POST">
		<div class="row-fluid">
			<div class="span8">
				<div class="control-group row-fluid">
		    		<label class="control-label span3" >NV phát triển</label>
		    		<div class="controls span9">
		    			<aui:input name="deployName" label="" />
		    		</div>
		    	</div>
	    	</div>
	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" >Ngày hẹn lắp đặt <span class="required">*</span></label>
		    		<div class="controls span6">
		      			<liferay-ui:input-date name="appointDate"
							dayParam="appointDateDay" dayValue="<%=appointDate.get(Calendar.DATE)%>"
							monthParam="appointDateMonth" monthValue="<%=appointDate.get(Calendar.MONTH)%>"
							yearParam="appointDateYear" yearValue="<%=appointDate.get(Calendar.YEAR)%>"
							firstDayOfWeek="<%=appointDate.getFirstDayOfWeek() - 1%>"
						/>
		    		</div>
		    	</div>
	    	</div>
    	</div>

    	<div class="row-fluid">
    		<div class="span8">
				<div class="control-group row-fluid">
					<label class="control-label span3" >Dịch vụ</label>
					<div class="controls span9">
		    			<div class="form-inline">
			      			<label class="radio mr-20">
			      				<input type="radio" name="serviceType" value="1" checked>
			      				<div class="radio-check"><div class="inside"></div></div>
			      				Camera
	  						</label>
	  						<label class="radio mr-20">
	  							<input type="radio" name="serviceType" value="2">
	  							<div class="radio-check"><div class="inside"></div></div>
	  							Công nghệ
							</label>
	  						<label class="radio mr-20">
	  							<input type="radio" name="serviceType" value="3">
	  							<div class="radio-check"><div class="inside"></div></div>
	  							Quang
							</label>
						</div>
		    		</div>
				</div>
			</div>
    	</div>

    	<div class="row-fluid">
    		<div class="span8">
				<div class="control-group row-fluid">
					<label class="control-label span3" >Địa chỉ lắp đặt <span class="required">*</span></label>
					<div class="controls span9">
						<aui:input name="address" label="" />
					</div>
				</div>
			</div>
    		<div class="span4">
				<div class="control-group row-fluid">
					<label class="control-label span6" >Đường dây</label>
					<div class="controls span6">
						<aui:input name="line" label="" />
					</div>
				</div>
			</div>
    	</div>

    	<div class="row-fluid">
    		<div class="span4">
				<div class="control-group row-fluid">
					<label class="control-label span6" >Hình thức TK <span class="required">*</span></label>
					<div class="controls span6">
						<aui:select name="serviceType" label="" >
							<aui:option label="Viettel triển khai" value="1" />
							<aui:option label="Thuê đối tác" value="2" />
						</aui:select>
					</div>
				</div>
			</div>
    	</div>

    	<div class="row-fluid">
    		<div class="span4">
				<div class="control-group row-fluid">
					<label class="control-label span6" >Gói cước <span class="required">*</span></label>
					<div class="controls span6">
						<aui:input name="packageType" label="" />
					</div>
				</div>
			</div>
    		<div class="span4">
				<div class="control-group row-fluid">
					<label class="control-label span6" >ISDN/Account <span class="required">*</span></label>
					<div class="controls span6">
						<aui:input name="isdnNo" label="" />
					</div>
				</div>
			</div>
    		<div class="span4">
				<div class="control-group row-fluid">
					<label class="control-label span6" >Loại thuê bao <span class="required">*</span></label>
					<div class="controls span6">
						<aui:select name="accountType" label="" >
							<aui:option label="Cáp đồng" value="1" />
							<aui:option label="Cáp quang" value="2" />
						</aui:select>
					</div>
				</div>
			</div>
    	</div>

    	<div class="row-fluid">
    		<div class="span4">
				<div class="control-group row-fluid">
					<label class="control-label span6" >HT hòa mạng <span class="required">*</span></label>
					<div class="controls span6">
						<aui:input name="HTHM" label="" />
					</div>
				</div>
			</div>
    		<div class="span4">
				<div class="control-group row-fluid">
					<label class="control-label span6" >CT khuyến mại <span class="required">*</span></label>
					<div class="controls span6">
						<aui:select name="promotion" label="" >
							<aui:option label="Chọn giá trị" value="0" />
							<aui:option label="Miễn phí Data 3 tháng" value="1" />
							<aui:option label="20 phút gọi miễn phí" value="2" />
						</aui:select>
					</div>
				</div>
			</div>
    		<div class="span4">
				<div class="control-group row-fluid">
					<label class="control-label span6" >CT cước đóng trước <span class="required">*</span></label>
					<div class="controls span6">
						<aui:select name="CTCDT" label="" >
							<aui:option label="Chọn giá trị" value="0" />
							<aui:option label="Đóng 6 tháng" value="1" />
							<aui:option label="Đóng cả năm" value="2" />
						</aui:select>
					</div>
				</div>
			</div>
    	</div>

	</form>
</div>

<aui:script>

var rules = {
	<portlet:namespace />address: {
		required: true
	},
	<portlet:namespace />packageType: {
		required: true
	},
	<portlet:namespace />isdnNo: {
		required: true
	},
	<portlet:namespace />HTHM: {
		required: true
	}
}

var fieldStrings = {
	<portlet:namespace />address: {
		required: 'Bạn phải nhập địa chỉ lắp đặt'
	},
	<portlet:namespace />packageType: {
		required: 'Bạn phải nhập gói cước'
	},
	<portlet:namespace />isdnNo: {
		required: 'Bạn phải nhập ISDN/Account'
	},
	<portlet:namespace />HTHM: {
		required: 'Bạn phải nhập hình thức hòa mạng'
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
// 			event.halt();
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

	var responsedata = {};

	responsedata.formData = data;
	responsedata.namespace = '<portlet:namespace/>';
	Liferay.fire('_callBackAction', {
		callBackData : responsedata
	});
}
Liferay.on('setCustomerService',function(event) {
	console.log("on setCustomerService");
	var obj = event.jsonCustomerService;
	if(obj != 'undefined' && obj != null && obj != "") {
		console.log("deployName :"+obj.deployName);
		document.<portlet:namespace />fm.<portlet:namespace />deployName.value = obj.deployName ;
		document.<portlet:namespace />fm.<portlet:namespace />address.value = obj.address ;
	}
});

</aui:script>
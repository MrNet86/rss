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
Calendar signDate = CalendarFactoryUtil.getCalendar(timeZone,
		locale);

Calendar collectDate = CalendarFactoryUtil.getCalendar(timeZone,
		locale);

%>

<div class="container-fluid container-vt">
	<h3 class="title">Thông tin thanh toán</h3>
	<form id="<portlet:namespace/>fm" name="<portlet:namespace/>fm" class="form-horizontal" action="" method="POST">
		<div class="row-fluid">
			<div class="span4">
				<div class="control-group row-fluid">
					<label class="control-label span6" for="<portlet:namespace/>contractNumber">Số hợp đồng</label>
					<div class="controls span6">
						<div class="input-append">
							<aui:input type="text" name="contractNumber" label="">
							</aui:input>
							<span class="add-on add-on-multi icon-search"></span>
							<span class="add-on add-on-multi icon-repeat icon-rotate"></span>
						</div>
		    		</div>
				</div>
			</div>
			
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="<portlet:namespace/>signDate">Ngày ký <span class="required">*</span></label>
		    		<div class="controls span6">
		      			<liferay-ui:input-date name="signDate"
							dayParam="signDateDay" dayValue="<%=signDate.get(Calendar.DATE)%>"
							monthParam="signDateMonth" monthValue="<%=signDate.get(Calendar.MONTH)%>"
							yearParam="signDateYear" yearValue="<%=signDate.get(Calendar.YEAR)%>"
							firstDayOfWeek="<%=signDate.getFirstDayOfWeek() - 1%>"
						/>
		    		</div>
		    	</div>
	    	</div>
	    	
	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="<portlet:namespace/>postCycle">Chu kỳ cước <span class="required">*</span></label>
		    		<div class="controls span6">
		      			<aui:select name="postCycle" label="">
							<option value="1">Chu kỳ cước 1</option>
							<option value="1">Chu kỳ cước 2</option>
						</aui:select>
		    		</div>
		    	</div>
	    	</div>
		</div>
		
		<div class="row-fluid">
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="<portlet:namespace/>paymentMethod">Hình thức TT <span class="required">*</span></label>
		    		<div class="controls span6">
		      			<aui:select name="paymentMethod" label="">
							<option value="1">Ủy nhiệm chi</option>
							<option value="2">Ủy nhiệm chi 2</option>
						</aui:select>
		    		</div>
		    	</div>
	    	</div>
	    	
	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="<portlet:namespace/>postNotiMethod">Hình thức TBC <span class="required">*</span></label>
		    		<div class="controls span6">
		      			<aui:select name="postNotiMethod" label="">
							<option>-- Chọn giá trị --</option>
							<option value="1">1</option>
							<option value="1">2</option>
						</aui:select>
		    		</div>
		    	</div>
	    	</div>
	    	
	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="<portlet:namespace/>printPostDetail">In chi tiết cước <span class="required">*</span></label>
		    		<div class="controls span6">
		      			<aui:select name="printPostDetail" label="">
							<option value="1">In bản kê chi tiết cước</option>
							<option value="1">2</option>
						</aui:select>
		    		</div>
		    	</div>
	    	</div>
		</div>
		
		<div class="row-fluid">
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="<portlet:namespace/>email">Email</label>
		    		<div class="controls span6">
		      			<aui:input name="email" label="" />
		    		</div>
		    	</div>
	    	</div>
	    	
	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="<portlet:namespace/>phoneNumber">Điện thoại</label>
		    		<div class="controls span6">
		      			<aui:input name="phoneNumber" label="" />
		    		</div>
		    	</div>
	    	</div>
		</div>
		
		<div class="row-fluid">
			<div class="span4">
				<div class="control-group row-fluid">
					<label class="control-label span6" for="<portlet:namespace/>bankName">Tên ngân hàng/ Chi nhánh <span class="required">*</span></label>
					<div class="controls span6">
						<div class="input-append">
							<aui:input type="text" name="bankName" label="">
							</aui:input>
							<span class="add-on icon-search"></span>
						</div>
		    		</div>
				</div>
			</div>
			
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="<portlet:namespace/>bankAddress">Địa chỉ ngân hàng</label>
		    		<div class="controls span6">
		      			<aui:input name="bankAddress" label="" />
		    		</div>
		    	</div>
	    	</div>
	    	
	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="<portlet:namespace/>accountName">Tên tài khoản <span class="required">*</span></label>
		    		<div class="controls span6">
		      			<aui:input name="accountName" label="" />
		    		</div>
		    	</div>
	    	</div>
		</div>
		
		<div class="row-fluid">
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="<portlet:namespace/>account">Tài khoản <span class="required">*</span></label>
		    		<div class="controls span6">
		      			<aui:input name="account" label="" />
		    		</div>
		    	</div>
	    	</div>
	    	
	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="<portlet:namespace/>collectAccount">Tài khoản nhờ thu</label>
		    		<div class="controls span6">
		      			<aui:input name="collectAccount" label="" />
		    		</div>
		    	</div>
	    	</div>
	    	
	    	<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="<portlet:namespace/>signDate">Ngày nhờ thu</label>
		    		<div class="controls span6">
		      			<liferay-ui:input-date name="collectDate"
							dayParam="collectDateDay" dayValue="<%=collectDate.get(Calendar.DATE)%>"
							monthParam="collectDateMonth" monthValue="<%=collectDate.get(Calendar.MONTH)%>"
							yearParam="collectDateYear" yearValue="<%=collectDate.get(Calendar.YEAR)%>"
							firstDayOfWeek="<%=collectDate.getFirstDayOfWeek() - 1%>"
						/>
		    		</div>
		    	</div>
	    	</div>
		</div>
		
		<div class="row-fluid">
			<div class="span8">
				<div class="control-group row-fluid">
		    		<label class="control-label span3" for="<portlet:namespace/>verifyAddress">Địa chỉ XM/TBC <span class="required">*</span></label>
		    		<div class="controls span9">
		      			<aui:input name="verifyAddress" label="" />
		    		</div>
		    	</div>
	    	</div>
	    </div>
		
		<div class="row-fluid">
			<div class="span8">
				<div class="control-group row-fluid">
		    		<label class="control-label span3" for="<portlet:namespace/>postBillAddress">Địa chỉ hóa đơn cước <span class="required">*</span></label>
		    		<div class="controls span9">
		      			<aui:input name="postBillAddress" label="" />
		    		</div>
		    	</div>
	    	</div>
		</div>
	</form>
</div>

<aui:script>

Liferay.on('_submitAction',function(event) {

	AUI().ready('aui-form-validator', 'aui-overlay-context-panel', function(A) {

		var validator1 = new A.FormValidator({

			boundingBox: '#<portlet:namespace />fm',
			validateOnBlur: true,
			selectText: true,

			rules: {
				<portlet:namespace />identifyNo: {
					required: true,
					number: true
				}
			}
			,

			fieldStrings: {
				<portlet:namespace />identifyNo: {
					required: 'Bạn phải nhập số CMT',
					number: 'Chỉ dc nhập số'
				}
			}

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
	var responsedata = {};
	responsedata.formData = data;
	responsedata.namespace = '<portlet:namespace />';
	Liferay.fire('_callBackAction', {
			customerData : responsedata
	});
}

</aui:script>
<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="../../init.jsp" %>

<%
Calendar date = CalendarFactoryUtil.getCalendar(timeZone,
		locale);

%>

<div class="container-fluid container-vt">
<!-- 	<h3 class="title">Thông tin thanh toán</h3> -->
	<form id="<portlet:namespace/>fm" name="<portlet:namespace/>fm" class="form-horizontal" action="" method="POST">
		<div class="row-fluid">
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Số hợp đồng</label>
		    		<div class="controls span6">
		    			<aui:input name="shd" label="" />
		    		</div>
		    	</div>
	    	</div>
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Ngày ký</label>
		    		<div class="controls span6">
		    			<liferay-ui:input-date name="issueDate"
							dayParam="issueDateDay" dayValue="<%=date.get(Calendar.DATE)%>"
							monthParam="issueDateMonth" monthValue="<%=date.get(Calendar.MONTH)%>"
							yearParam="issueDateYear" yearValue="<%=date.get(Calendar.YEAR)%>"
							firstDayOfWeek="<%=date.getFirstDayOfWeek() - 1%>"
						/>
		    		</div>
		    	</div>
	    	</div>
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Chu kỳ cước <span class="required">*</span></label>
		    		<div class="controls span6">
		    			<aui:select name="customerGroup" label="" >
							<aui:option label="Chọn giá trị" value="0" />
							<aui:option label="3 tháng" value="1" />
							<aui:option label="6 tháng" value="2" />
							<aui:option label="12 tháng" value="3" />
						</aui:select>
		    		</div>
		    	</div>
	    	</div>
    	</div>
		<div class="row-fluid">
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Hình thức TT <span class="required">*</span></label>
		    		<div class="controls span6">
		    			<aui:select name="httt" label="" >
							<aui:option label="Ủy nhiệm thu" value="1" />
							<aui:option label="Chuyển khoản" value="2" />
						</aui:select>
		    		</div>
		    	</div>
	    	</div>
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Hình thức TBC <span class="required">*</span></label>
		    		<div class="controls span6">
		    			<aui:select name="httbc" label="" >
		    				<aui:option label="Chọn giá trị" value="0" />
							<aui:option label="TBC 1" value="1" />
							<aui:option label="TBC 2" value="2" />
						</aui:select>
		    		</div>
		    	</div>
	    	</div>
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">In chi tiết cước <span class="required">*</span></label>
		    		<div class="controls span6">
		    			<aui:select name="customerGroup" label="" >
							<aui:option label="Chọn giá trị" value="0" />
							<aui:option label="In toàn bộ" value="1" />
							<aui:option label="In cơ bản" value="2" />
						</aui:select>
		    		</div>
		    	</div>
	    	</div>
    	</div>

		<div class="row-fluid">
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Email</label>
		    		<div class="controls span6">
		    			<aui:input name="email" label="" />
		    		</div>
		    	</div>
	    	</div>
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Điện thoại <span class="required">*</span></label>
		    		<div class="controls span6">
		    			<aui:input name="dt" label="" />
		    		</div>
		    	</div>
	    	</div>
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Điện thoại cố định</label>
		    		<div class="controls span6">
		    			<aui:input name="dtcd" label="" />
		    		</div>
		    	</div>
	    	</div>
    	</div>

		<div class="row-fluid">
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Số HĐ in hóa đơn</label>
		    		<div class="controls span6">
		    			<aui:input name="shdIn" label="" />
		    		</div>
		    	</div>
	    	</div>
    	</div>

		<div class="row-fluid">
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Tên ngân hàng/ Chi nhánh <span class="required">*</span></label>
		    		<div class="controls span6">
		    			<aui:input name="nh" label="" />
		    		</div>
		    	</div>
	    	</div>
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Địa chỉ ngân hàng</label>
		    		<div class="controls span6">
		    			<aui:input name="dcnh" label="" />
		    		</div>
		    	</div>
	    	</div>
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Tài khoản <span class="required">*</span></label>
		    		<div class="controls span6">
		    			<aui:input name="tk" label="" />
		    		</div>
		    	</div>
	    	</div>
    	</div>

		<div class="row-fluid">
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Tên tài khoản <span class="required">*</span></label>
		    		<div class="controls span6">
		    			<aui:input name="ttk" label="" />
		    		</div>
		    	</div>
	    	</div>
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Tài khoản nhờ thu</label>
		    		<div class="controls span6">
		    			<aui:input name="tknt" label="" />
		    		</div>
		    	</div>
	    	</div>
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Ngày nhờ thu</label>
		    		<div class="controls span6">
		    			<liferay-ui:input-date name="issueDate"
							dayParam="issueDateDay" dayValue="<%=date.get(Calendar.DATE)%>"
							monthParam="issueDateMonth" monthValue="<%=date.get(Calendar.MONTH)%>"
							yearParam="issueDateYear" yearValue="<%=date.get(Calendar.YEAR)%>"
							firstDayOfWeek="<%=date.getFirstDayOfWeek() - 1%>"
						/>
		    		</div>
		    	</div>
	    	</div>
    	</div>

		<div class="row-fluid">
			<div class="span8">
				<div class="control-group row-fluid">
		    		<label class="control-label span3" for="#">Địa chỉ XM/TBC <span class="required">*</span></label>
		    		<div class="controls span9">
					    <aui:input name="tknt" label="" />
		    		</div>
		    	</div>
	    	</div>
    	</div>

		<div class="row-fluid">
			<div class="span8">
				<div class="control-group row-fluid">
		    		<label class="control-label span3" for="#">Địa chỉ hóa đơn cước <span class="required">*</span></label>
		    		<div class="controls span9">
					    <aui:input name="tknt" label="" />
		    		</div>
		    	</div>
	    	</div>
			<div class="span4">
				<div class="control-group row-fluid">
		    		<label class="control-label span6" for="#">Sử dụng địa chỉ XM/TBC cước</label>
		    		<div class="controls span6">
					    <aui:input name="tknt" label="" />
		    		</div>
		    	</div>
	    	</div>
    	</div>

   	</form>
</div>
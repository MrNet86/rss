<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="init.jsp" %>
<%
	/*
		@author: dunglt
		freelancer
	*/
	//TODO
	
%>
<div class="container-fluid container-vt">
	<h3 class="title">Thông tin hồ sơ khách hàng</h3>
	<form id="<portlet:namespace/>fm" name="<portlet:namespace/>fm" class="form-horizontal" action="" method="POST">
		<div class="row-fluid">
			<div class="span6">
				<div class="control-group row-fluid">
		    		<label class="control-label span4" for="#">Chọn hồ sơ<span class="required">*</span></label>
		    		<div class="controls span4">
		      			<aui:select name="identifyType" label="" class="control-label" >
							<aui:option label="[CMTND] Chứng minh thư" value="1" />
							<aui:option label="[HĐ] Hợp đồng" value="2" />
							<aui:option label="[PLHĐ] Phụ lục hợp đồng" value="3" />
						</aui:select>
		    		</div>
		    		<div class="controls span4">
		      			<input id="<portlet:namespace />uploadFile1" name="<portlet:namespace />uploadFile1" type="file">
		    		</div>
		    	</div>
	    	</div>
    	</div>
		<div class="row-fluid">
			<div class="span6">
				<div class="control-group row-fluid">
		    		<label class="control-label span4" for="#">Chọn hồ sơ<span class="required">*</span></label>
		    		<div class="controls span4">
		      			<aui:select name="identifyType" label="" class="control-label" >
							<aui:option label="[CMTND] Chứng minh thư" value="1" />
							<aui:option label="[HĐ] Hợp đồng" value="2" />
							<aui:option label="[PLHĐ] Phụ lục hợp đồng" value="3" />
						</aui:select>
		    		</div>
		    		<div class="controls span4">
		      			<input id="<portlet:namespace />uploadFile2" name="<portlet:namespace />uploadFile2" type="file">
		    		</div>
		    	</div>
	    	</div>
    	</div>
		<div class="row-fluid">
			<div class="span6">
				<div class="control-group row-fluid">
		    		<label class="control-label span4" for="#">Chọn hồ sơ<span class="required">*</span></label>
		    		<div class="controls span4">
		      			<aui:select name="identifyType" label="" class="control-label" >
							<aui:option label="[CMTND] Chứng minh thư" value="1" />
							<aui:option label="[HĐ] Hợp đồng" value="2" />
							<aui:option label="[PLHĐ] Phụ lục hợp đồng" value="3" />
						</aui:select>
		    		</div>
		    		<div class="controls span4">
		      			<input id="<portlet:namespace />uploadFile3" name="<portlet:namespace />uploadFile3" type="file">
		    		</div>
		    	</div>
	    	</div>
    	</div>
   	</form>
</div>

<aui:script>
var fileUploadOne;
var fileUploadTwo;
var fileUploadThree;

AUI().ready(function(A) {
	$('#<portlet:namespace />uploadFile1').on('change', function() {
		fileUploadOne = this.files[0]; 
	});
	
	$('#<portlet:namespace />uploadFile2').on('change', function() {
		fileUploadTwo = this.files[0]; 
	});
	
	$('#<portlet:namespace />uploadFile3').on('change', function() {
		fileUploadThree = this.files[0]; 
	});
});


Liferay.on('_submitAction',function(event) {
	// declare response data to send to action portlet
	var responseData = {};

	// get All data from input except file
	var data = <portlet:namespace />getDataInputExceptFile($('#<portlet:namespace/>fm'));
		
	// array to store all file from input
	var fileArray = [];

	// add file from input to file array if it is not undefined
	if(fileUploadOne) {
		var fileUploadObjOne =  {};
		fileUploadObjOne = <portlet:namespace />createObjectFileData(fileUploadOne, '<portlet:namespace />uploadFile1');
		
		fileArray.push(fileUploadObjOne);
	}
	if(fileUploadTwo) {
		var fileUploadObjTwo = {};
		fileUploadObjTwo = <portlet:namespace />createObjectFileData(fileUploadTwo, '<portlet:namespace />uploadFile2');
		fileArray.push(fileUploadObjTwo);
	}
	if(fileUploadThree) {
		var fileUploadObjThree = {};
		fileUploadObjThree = <portlet:namespace />createObjectFileData(fileUploadThree, '<portlet:namespace />uploadFile3');
		fileArray.push(fileUploadObjThree);
	}
	
	// pack data to response data
	responseData.namespace = '<portlet:namespace />';
	responseData.formData = data;
	responseData.fileArray = fileArray;
	
	// callback to action portlet
	Liferay.fire('_callBackAction', {
		callBackData : responseData
	});
});
	
function <portlet:namespace />createObjectFileData(file, inputFileName) {
	var fileUploadObj = {};
	fileUploadObj.file = file;
	fileUploadObj.inputName = inputFileName;
	
	return fileUploadObj;
};

// to get datas on all input except input file 
function <portlet:namespace />getDataInputExceptFile(formObj) {
	var data = formObj.serializeArray().reduce(function(obj, item) {
 	    obj[item.name] = item.value;
 	    return obj;
 	}, {});
	
	return data;
};

</aui:script>
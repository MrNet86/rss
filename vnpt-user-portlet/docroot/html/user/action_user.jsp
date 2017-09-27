<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="../init.jsp" %>

<%
String randomId = StringPool.BLANK;

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

User _aUser = (User)row.getObject();

%>

<portlet:renderURL var="editURL">
	<portlet:param name="action" value="<%= VnptConstants.EDIT_USER %>" />
	<portlet:param name="tabs1" value="<%= VnptConstants.EDIT_USER %>" />
	<portlet:param name="userId" value="<%= String.valueOf(_aUser.getUserId()) %>"/>	
</portlet:renderURL>

<portlet:actionURL var="deleteURL">
	<portlet:param name="action" value="<%= VnptConstants.DELETE_USER %>" />
	<portlet:param name="userId" value="<%= String.valueOf(_aUser.getUserId()) %>"/>	
</portlet:actionURL>

<div class="list-button">
	<a class="btn btn-sm btn-primary" href="<%= editURL %>">
		<i class="fa fa-edit"></i>
	</a>
	<%
	String deleteHref = "javascript: deleteUser('" + deleteURL + "');";
	%>
	<button class="btn btn-sm btn-danger " onclick="<%= deleteHref %>">
		<i class="fa fa-trash-o"></i>
	</button>
</div>

<aui:script use="aui-base">

Liferay.provide(
	window,
	'deleteUser',
	function(url) {
		
	 	if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "ban-co-muon-xoa-nguoi-dung-nay-khong") %>')) {
	 		window.location.href = url;
	 	}
	 	
	},
	['aui-base']
);

</aui:script>
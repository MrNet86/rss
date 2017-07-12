<%@page import="com.viettel.ims.permission.InvestPolicyModelPermission"%>
<%@page import="com.viettel.ims.core.model.InvestPolicy"%>
<%@page import="com.viettel.ims.common.ActionConstants"%>
<%@include file="/jsp/init.jsp"%>

<%
	String backURL = (String)request.getAttribute("backURL");


// 	String backURL = ParamUtil.getString(request, "backURL");
	System.out.println("editPolicy backURL :"+backURL);

	String[] sections1 = { "generalPolicy", "investCategories",
		"othersInfoPolicy"};
	String[] sections2 = { "decidePolicy" };
	String[] sections3 = { "verifyPolicy" };

	boolean isAdd = InvestPolicyModelPermission.contains(
		permissionChecker, scopeGroupId, "ADD_INVEST_POLICY");
	boolean isUpdate = InvestPolicyModelPermission.contains(
		permissionChecker, scopeGroupId, "UPDATE_INVEST_POLICY");
	boolean isDecide = InvestPolicyModelPermission.contains(
		permissionChecker, scopeGroupId, "DECIDE_INVEST_POLICY");
	boolean isVerify = InvestPolicyModelPermission.contains(
		permissionChecker, scopeGroupId, "VERIFY_INVEST_POLICY");

	// Neu them moi thi hien thi sections1
	String[] _CATEGORY_NAMES = { "PolicyInfo"};
	String[][] categorySections = { sections1};
	// Neu co quyen tham dinh thi hien thi thong tin 'Tham dinh'
	if(isDecide){
		_CATEGORY_NAMES = new String[] { "PolicyInfo", "DecidePolicy"};
		categorySections = new String[][] { sections1, sections2};
	}

	// Neu co quyen phe duyet thi hien thi tat ca
	if(isVerify) {
		_CATEGORY_NAMES = new String[] { "PolicyInfo", "DecidePolicy",
				"VerifyPolicy" };
		categorySections = new String[][] { sections1, sections2, sections3 };
	}

	request.setAttribute("isAdd", isAdd);
%>

<liferay-util:include page="/jsp/navMenu.jsp"
	servletContext="<%= this.getServletContext() %>" />

<c:choose>
	<c:when test="<%= isAdd || isUpdate %>">
		<liferay-ui:header backLabel="Back to investHome"
			backURL="<%= backURL %>" localizeTitle="<%= false %>"
			title="Add New Policy" />

		<liferay-util:include page="/jsp/invest/policy/toolbar.jsp"
			servletContext="<%= this.getServletContext() %>">
			<liferay-util:param name="toolbarItem" value="add" />
		</liferay-util:include>

		<portlet:actionURL var="editPolicyActionURL">
			<portlet:param name="action"
				value="<%= ActionConstants.UPDATE_INVEST_POLICY %>" />
		</portlet:actionURL>
		<portlet:actionURL var="editPolicyActionFromUploadURL">
			<portlet:param name="action"
				value="<%= ActionConstants.UPDATE_INVEST_POLICY_FROM_UPLOAD %>" />
		</portlet:actionURL>

		<aui:form action="<%= editPolicyActionFromUploadURL %>" method="post" name="fm"
			enctype="multipart/form-data">
			<liferay-ui:form-navigator backURL="<%= backURL %>"
				categoryNames="<%= _CATEGORY_NAMES %>"
				categorySections="<%= categorySections %>"
				jspPath="/jsp/invest/policy/" />
		</aui:form>
	</c:when>
	<c:otherwise>
		<liferay-ui:message
			key="you-do-not-have-permission-to-access-the-requested-resource" />
	</c:otherwise>
</c:choose>


<%@ include file="/jsp/init.jsp" %>
<%
String tabs1 = ParamUtil.getString(request, "tabs1", "view-all-manage-req");


PortletURL tabs1Url = renderResponse.createRenderURL();

String action = ParamUtil.getString(request, "action", ActionConstants.VIEW_MANAGE);

if("view-all-manage-req".equals(tabs1)){
	action = ActionConstants.VIEW_ALL_MANAGE_REQ;
}
else if ("create-manage-req".equals(tabs1)) {
	action = ActionConstants.CREATE_MANAGE_REQ;
}
System.out.println("tabs1 action :"+action);

tabs1Url.setParameter("action", action);

String tabs1Names = "view-all-manage-req,create-manage-req,"
		+ "create-manage-req-from-construction,create-manage-req-from-contract,"
		+ "view-all-manage-cmd,process-manage-cmd";

tabs1Names = HtmlUtil.escape(tabs1Names);
String tabs1Value = tabs1Names ;

String backURL = ParamUtil.getString(request, "backURL");
%>

<%-- <liferay-ui:tabs --%>
<%-- 	names="<%= tabs1Names %>" --%>
<%-- 	value="<%= tabs1Value %>" --%>
<%-- 	portletURL="<%= tabs1Url %>" --%>
<%-- 	param="tab" --%>
<%-- /> --%>

<liferay-ui:tabs
	names="<%= tabs1Names %>"
	value="<%= tabs1 %>"
	portletURL="<%= tabs1Url %>"
	param="tabs1"
/>

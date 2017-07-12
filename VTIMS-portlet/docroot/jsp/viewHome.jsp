<%@page import="com.viettel.ims.common.ActionConstants"%>
<%@include file="init.jsp" %>
<%
String redirect = ParamUtil.getString(request, "redirect");
String backURL = ParamUtil.getString(request, "backURL", redirect);

String actionStr = ParamUtil.getString(request, "action", ActionConstants.VIEW_INVEST);

String pageUrl = "";
if(ActionConstants.VIEW_INVEST.equals(actionStr)) {
	pageUrl = "/jsp/invest/viewInvest.jsp";
}
else if(ActionConstants.VIEW_CONTRACT.equals(actionStr)) {
	pageUrl = "/jsp/contract/viewContract.jsp";
}
else {
	pageUrl = "/jsp/invest/viewInvest.jsp";
}

System.out.println("action :"+actionStr + " || pageUrl :"+pageUrl);
%>

<liferay-util:include page="/jsp/navMenu.jsp"
	servletContext="<%= this.getServletContext() %>"
/>

<div >
	<liferay-util:include page="<%= pageUrl %>" servletContext="<%= this.getServletContext() %>"/>
	<div class="ats-separator"></div>
</div>

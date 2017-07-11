<%@page import="com.viettel.ams.modelext.MerEntityExt"%>
<%@ include file="/jsp/init.jsp" %>

<%
SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");

String redirect = searchContainer.getIteratorURL().toString();

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

MerEntityExt merEntityExt = (MerEntityExt)row.getObject();
%>

<input type="text" name="<portlet:namespace />reqCount" value="<%= merEntityExt.getReqCount() %>"/>

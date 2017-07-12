<%@page import="com.viettel.ims.core.model.InvestPolicy"%>
<%@ include file="/jsp/init.jsp"%>

<%
	InvestPolicy generalPolicy = (InvestPolicy)request.getAttribute("investPolicy");
	long id = 0l;
	if(generalPolicy != null){
		id = generalPolicy.getInvestPolicyId();
	}
%>
<liferay-util:include page="/jsp/fileattachment/edit.jsp" servletContext="<%=this.getServletContext()%>">
	<liferay-util:param name="objectType" value="<%= String.valueOf(1) %>"></liferay-util:param>
	<liferay-util:param name="objectId" value="<%= String.valueOf(id) %>"></liferay-util:param>
</liferay-util:include>
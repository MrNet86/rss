<%@page import="javax.portlet.PortletPreferences"%>
<%@ include file="/init.jsp" %>

<%
	PortletPreferences preferences = renderRequest.getPreferences();
	
	portletResource = ParamUtil.getString(request, "portletResource");
	
	if (Validator.isNotNull(portletResource)) {
		preferences = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource); 
	}
	
%>   
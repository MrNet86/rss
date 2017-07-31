<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@ taglib prefix="liferay-util" uri="http://liferay.com/tld/util" %>
<%@ taglib prefix="liferay-security" uri="http://liferay.com/tld/security" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@page import="com.vnpt.portal.rss.service.RssCategoryLocalServiceUtil"%>
<%@page import="com.vnpt.portal.rss.model.RssCategory"%>
<%@page import="java.util.List"%>

<liferay-theme:defineObjects />
<portlet:defineObjects/>

<%

List<RssCategory> lstRssCategory = RssCategoryLocalServiceUtil.searchRssCategory(-1, -1, scopeGroupId);
  
long rssCategoryId = GetterUtil.getLong(portletPreferences.getValue("rssCategoryId", StringPool.TRUE), 0);

int rssDisplayItem = GetterUtil.getInteger(portletPreferences.getValue("rssDisplayItem", StringPool.TRUE), 5);

String rssPortletTitle = portletPreferences.getValue("rssPortletTitle", StringPool.BLANK);

System.out.println("configuration.jsp rssCategoryId :"+rssCategoryId);

%>

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<aui:form action="<%= configurationURL  %>" name="fm" method="post">
	
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />
	
	<aui:input name="preferences--rssPortletTitle--" type="text" value="<%= rssPortletTitle %>">
		<aui:validator name="required" />
		<aui:validator name="maxLength">500</aui:validator>
	</aui:input>
	<aui:select name="preferences--rssCategoryId--" label="view-rss-category">
		<%
		for(RssCategory rssCategory : lstRssCategory) {
		%>
			<aui:option label="<%= rssCategory.getName() %>" value="<%= rssCategory.getRssCategoryId() %>" selected="<%= rssCategory.getRssCategoryId() == rssCategoryId %>" />
		<%}%>
	</aui:select>
	
	<aui:select name="preferences--rssDisplayItem--" label="display-item">
		<%
		int[] displayItems = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 25, 30, 40, 50, 60, 70, 80, 90, 100};

		for (int displayItem_ : displayItems) {
		%>
			<aui:option label="<%= displayItem_ %>" selected="<%= displayItem_ == rssDisplayItem %>" value="<%= displayItem_ %>"/>
		<%
		}
		%>
	</aui:select>
		 
	<aui:button-row>
        <aui:button type="submit" />
    </aui:button-row>
    
</aui:form>
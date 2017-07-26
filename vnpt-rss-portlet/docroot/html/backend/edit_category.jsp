<%@ include file="../init.jsp" %>

<%
String backURL = (String)request.getAttribute("backURL");

RssCategory rssCategory = (RssCategory) request.getAttribute("rssCategory");
System.out.println("edit rssCategory :"+rssCategory.getRssCategoryId());
%>
<liferay-ui:header backLabel="Back"
	backURL="<%= backURL %>" localizeTitle="<%= false %>"
	title="Add new rss category"
/>

<portlet:actionURL var="updateURL">
	<portlet:param name="action" value="<%= RssConstants.UPDATE_RSS_CATEGORY %>"/>
</portlet:actionURL>

<aui:form action="<%= updateURL %>" method="post" name="fm">

	<aui:input name='rssCategoryId' type="hidden" value="<%= rssCategory.getRssCategoryId() %>" />

	<aui:input name="name" label="name" type="text" value="<%= rssCategory.getName() %>">
		<aui:validator name="maxLength">250</aui:validator>
	</aui:input>

	<aui:input name="description" label="description" type="textarea" cols="100" rows="5" value="<%= rssCategory.getDescription() %>">
		<aui:validator name="maxLength">250</aui:validator>
	</aui:input>

	<div class="separator"><!-- --></div>
	<aui:button-row>
		<aui:button type="submit" value="Command.Save"  icon="icon-save" />
		<aui:button type="cancel" value="Command.Cancel"  icon="icon-undo" href="<%= backURL %>" />
	</aui:button-row>

</aui:form>

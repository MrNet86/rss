<%@ include file="/jsp/init.jsp" %>

<%
	String redirect  = ParamUtil.getString(request, "redirect");
	AssetManageReqSearch searchContainer = (AssetManageReqSearch) request
		.getAttribute("liferay-ui:search:searchContainer");
	AssetManageReqDisplayTerms displayTerms = (AssetManageReqDisplayTerms) searchContainer
		.getDisplayTerms();
%>

<aui:column columnWidth="50">
	<aui:input label="code" cssClass="size60"
		inlineField="false" inlineLabel="left"
		name="<%= AssetManageReqDisplayTerms.CODE %>"
		value="<%= displayTerms.getCode() %>"
	/>
</aui:column>

<aui:column columnWidth="50">
	<aui:input label="status" cssClass="size60"
		inlineField="false" inlineLabel="left"
		name="<%= AssetManageReqDisplayTerms.STATUS %>"
		value="<%= displayTerms.getStatus() %>"
	/>
</aui:column>

<aui:button-row>
	<aui:button type="submit" icon="icon-search" value="Command.Search"/>
	<aui:button type="cancel" icon="icon-cancel" value="Command.Cancel" href="<%= redirect %>"/>
</aui:button-row>
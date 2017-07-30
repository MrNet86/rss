<%@ include file="../init.jsp" %>

<%
	String redirect  = ParamUtil.getString(request, "redirect");
	RssFeedsSearch searchContainer = (RssFeedsSearch) request
		.getAttribute("liferay-ui:search:searchContainer");
	RssFeedsDisplayTerms displayTerms = (RssFeedsDisplayTerms) searchContainer
		.getDisplayTerms();
%>

<liferay-ui:search-toggle
	autoFocus="<%= windowState.equals(WindowState.MAXIMIZED) %>"
	buttonLabel="search"
	displayTerms="<%= displayTerms %>"
	id="toggle_id_cat_partner_search"
>
</liferay-ui:search-toggle>

<%-- <aui:column columnWidth="50">
	<aui:input label="url" cssClass="size60"
		inlineField="false" inlineLabel="left"
		name="<%= RssFeedsDisplayTerms.URL %>"
		value="<%= displayTerms.getUrl() %>"
	/>
</aui:column>

<aui:column columnWidth="50">
	<aui:input label="title" cssClass="size60"
		inlineField="false" inlineLabel="left"
		name="<%= RssFeedsDisplayTerms.TITLE %>"
		value="<%= displayTerms.getTitle() %>"
	/>
</aui:column>

<aui:button-row>
	<aui:button type="submit" icon="icon-search" value="Command.Search"/>
	<aui:button type="cancel" icon="icon-cancel" value="Command.Cancel" href="<%= redirect %>"/>
</aui:button-row> --%>
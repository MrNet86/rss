<%@ include file="/jsp/init.jsp" %>

<%
	String redirect  = ParamUtil.getString(request, "redirect");
	MerEntitySearch searchContainer = (MerEntitySearch) request
		.getAttribute("liferay-ui:search:searchContainer");
	MerEntityDisplayTerms displayTerms = (MerEntityDisplayTerms) searchContainer
		.getDisplayTerms();
%>

<aui:row>
	<aui:col span="6">
		<aui:input label="Mer.merName" cssClass="size60"
			inlineField="false" inlineLabel="left"
			name="<%= MerEntityDisplayTerms.MER_NAME %>"
			value="<%= displayTerms.getMerName() %>"
		/>
	</aui:col>
	<aui:col span="6">
		<aui:input label="Mer.merCode" cssClass="size60"
			inlineField="false" inlineLabel="left"
			name="<%= MerEntityDisplayTerms.MER_CODE %>"
			value="<%= displayTerms.getMerCode() %>"
		/>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col span="6">
		<aui:input label="Mer.serialNumber" cssClass="size60"
			inlineField="false" inlineLabel="left"
			name="<%= MerEntityDisplayTerms.SERIAL_NUMBER %>"
			value="<%= displayTerms.getSerialNumber() %>"
		/>
	</aui:col>
	<aui:col span="6">

	</aui:col>
</aui:row>

<aui:button-row>
	<aui:button type="submit" icon="icon-search" value="Command.Search"/>
	<aui:button type="cancel" icon="icon-cancel" value="Command.Cancel" href="<%= redirect %>"/>
</aui:button-row>
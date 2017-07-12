<%@page import="com.liferay.portal.model.Contact"%>
<%@page import="com.liferay.portal.model.ListTypeConstants"%>
<%@include file="/jsp/init.jsp" %>
<%
String className = Contact.class.getName();
%>
<aui:select name="otherCapital" label="Policy.otherCapital" inlineLabel="false" cssClass="size60">
	<aui:option disabled="disabled" hidden="true" value="0">
		<liferay-ui:message key="Common.Select" />
	</aui:option>
	<aui:option value="1">
		<liferay-ui:message key="Policy.Shopping" />
	</aui:option>
	<aui:option value="2">
		<liferay-ui:message key="Policy.Invest" />
	</aui:option>
</aui:select>

<%-- <aui:select inlineField="<%=true%>" label="Policy.otherCapital" --%>
<%-- 	listType='<%= className + ListTypeConstants.PHONE%>' --%>
<%-- 	name='otherCapital' /> --%>

<aui:input name="otherLocalValue" label="Policy.otherLocalValue" inlineLabel="false" cssClass="size60" >
	<aui:validator name="number" />
	<aui:validator name="max">999999999999999999</aui:validator>
</aui:input>

<aui:input name="otherForeignValue" label="Policy.otherForeignValue" inlineLabel="false" cssClass="size60" >
<aui:validator name="number" />
	<aui:validator name="max">999999999999999999</aui:validator>
</aui:input>

<aui:input name="otherTax" label="Policy.otherTax" inlineLabel="false" cssClass="size60" >
<aui:validator name="number" />
	<aui:validator name="max">999999999999999999</aui:validator>
</aui:input>

<aui:input name="otherTotalValue" label="Policy.otherTotalValue" inlineLabel="false" cssClass="size60" >
<aui:validator name="number" />
	<aui:validator name="max">999999999999999999</aui:validator>
</aui:input>

<aui:input name="otherTotalValueTax" label="Policy.otherTotalValueTax" inlineLabel="false" cssClass="size60" >
<aui:validator name="number" />
	<aui:validator name="max">999999999999999999</aui:validator>
</aui:input>


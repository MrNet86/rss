<%@page import="com.viettel.ims.core.service.InvestCategoriesLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.ListTypeServiceUtil"%>
<%@page import="com.liferay.portal.model.ListTypeConstants"%>
<%@page import="java.util.Collections"%>
<%@page import="com.viettel.ims.core.model.InvestCategories"%>
<%@include file="/jsp/init.jsp" %>

<%

List<InvestCategories> investCategories = Collections.emptyList();

long investPolicyId = ParamUtil.getLong(request, "investPolicyId");
if(investPolicyId > 0) {
	investCategories = InvestCategoriesLocalServiceUtil.findByObjId(investPolicyId, 1);
}

int[] rowIndexes = null;

if(investCategories.isEmpty()){
	investCategories = new ArrayList<InvestCategories>();

	investCategories.add(new InvestCategoriesImpl());

	rowIndexes = new int[] {0};
}
else {
	rowIndexes = new int[investCategories.size()];
	for (int i = 0; i < investCategories.size() ; i++) {
		rowIndexes[i] = i;
		System.out.println("---------- rowIndexes[i]" + i);
	}
}

if(rowIndexes == null) {
	rowIndexes = new int[0];
}

System.out.println("rowIndexes :"+rowIndexes.length);
%>

<liferay-ui:error-marker key="errorSection" value="addresses" />
<div id="invCat">
	<aui:fieldset>
		<%
		for (int i = 0; i < rowIndexes.length; i++) {
			int rowIdx = rowIndexes[i];
			InvestCategories invCategories = investCategories.get(i);
		%>

			<aui:model-context bean="<%= invCategories %>" model="<%= InvestCategories.class %>" />

			<div class="lfr-form-row lfr-form-row-inline">
				<div class="row-fields">
					<aui:column columnWidth="50">
						<aui:input name='<%="investCategoriesId" + rowIdx%>'
							type="hidden" value="<%=invCategories.getInvestCategoriesId()%>" />
						<aui:input fieldParam='<%="name" + rowIdx%>'
							id='<%="name" + rowIdx%>' inlineLabel="false"
							label="InvestCategories.name" name="name" cssClass="size60" />

						<aui:input fieldParam='<%="unitId" + rowIdx%>'
							id='<%="unitId" + rowIdx%>' inlineLabel="false" name="unitId"
							cssClass="size60" type="hidden" />
						<aui:input inlineLabel="false" label="InvestCategories.unitName"
							name='<%="unitName" + rowIdx%>' type="text" cssClass="size60" />

						<aui:input fieldParam='<%="quantity" + rowIdx%>'
							id='<%="quantity" + rowIdx%>' inlineLabel="false"
							name="quantity" cssClass="size60">
							<aui:validator name="number" />
						</aui:input>

						<aui:input fieldParam='<%="vat" + rowIdx%>'
							id='<%="vat" + rowIdx%>' inlineLabel="false" name="vat"
							cssClass="size60">
							<aui:validator name="number" />
						</aui:input>
					</aui:column>

					<aui:column columnWidth="50">
						<aui:input fieldParam='<%="description" + rowIdx%>'
							id='<%="description" + rowIdx%>' inlineLabel="false"
							label="InvestCategories.description" name="description"
							cssClass="size60" />

<%-- 						<aui:input fieldParam='<%="catCurrencyId" + rowIdx%>' --%>
<%-- 							id='<%="catCurrencyId" + rowIdx%>' inlineLabel="false" --%>
<%-- 							name="catCurrencyId" cssClass="size60" type="hidden" /> --%>
					<aui:select name='<%="catCurrencyId" + rowIdx%>' label="InvestCategories.catCurrencyName"
						inlineLabel="false" cssClass="size60"
						id='<%="catCurrencyId" + rowIdx%>'>
						<aui:option value='1'
							selected="<%=invCategories.getCatCurrencyId() == 1%>">VND</aui:option>
						<aui:option value='2'
							selected="<%=invCategories.getCatCurrencyId() == 2%>">USD</aui:option>
						<aui:option value='3'
							selected="<%=invCategories.getCatCurrencyId() == 3%>">EUR</aui:option>
					</aui:select>

					<aui:input fieldParam='<%="unitPrice" + rowIdx%>'
							id='<%="unitPrice" + rowIdx%>' inlineLabel="false"
							label="InvestCategories.unitPrice" name="unitPrice"
							cssClass="size60">
							<aui:validator name="number" />
						</aui:input>

						<aui:input inlineLabel="false" label="InvestCategories.totalAfterVat"
							name='<%="totalAfterVat" + rowIdx%>' type="text"
							cssClass="size60">
							<aui:validator name="number" />
						</aui:input>
					</aui:column>
				</div>
			</div>

		<%
		}
		%>

		<aui:input name="indexes" type="hidden" value="<%= StringUtil.merge(rowIndexes) %>" />
	</aui:fieldset>
</div>
<aui:script use="liferay-auto-fields">

AUI().use('liferay-auto-fields',function(A) {
	new Liferay.AutoFields(
	    {
	        contentBox: '#invCat',
	        fieldIndexes: '<portlet:namespace />rowIndexes',
	        namespace: '<portlet:namespace />'
	    }
	).render();
});

// Liferay.once(
// 	'formNavigator:reveal<portlet:namespace />addresses',
// 	function() {
// 		new Liferay.AutoFields(
// 			{
// 				contentBox: '#<portlet:namespace />addresses > fieldset',
// 				fieldIndexes: '<portlet:namespace />rowIndexes',
// 				namespace: '<portlet:namespace />'
// 			}
// 		).render();
// 	}
// );
</aui:script>
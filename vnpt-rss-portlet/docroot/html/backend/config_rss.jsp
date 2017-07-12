<%@page import="com.vnpt.portal.rss.model.impl.RssConfigImpl"%>
<%@page import="com.vnpt.portal.rss.service.persistence.RssConfigUtil"%>
<%@page import="java.util.Collections"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="java.util.Enumeration"%>
<%@page import="javax.portlet.RenderResponse"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ include file="../init.jsp" %>
<%

String redirect = ParamUtil.getString(request, "redirect");

String typeSelection = ParamUtil.getString(request, "typeSelection");

int assetOrder = ParamUtil.getInteger(request, "assetOrder", -1);

// String[] urls = portletPreferences.getValues("urls", new String[0]);

// String[] titles = portletPreferences.getValues("titles", new String[0]);



List<RssConfig> rssConfigs = Collections.emptyList();

int[] rssIndexes = null;

String rssIndexesParam = ParamUtil.getString(request, "rssIndexes");

if(Validator.isNotNull(rssIndexesParam)) {
	rssConfigs = new ArrayList<RssConfig>();

	rssIndexes = StringUtil.split(rssIndexesParam, 0);

	for(int rssIndex : rssIndexes) {
		rssConfigs.add(new RssConfigImpl());
	}
}
else {
	System.out.println("come here");
	rssConfigs = RssConfigLocalServiceUtil.getRssConfigs(0, 0);

	if(rssConfigs.isEmpty()) {
		rssConfigs = new ArrayList<RssConfig>();
		rssConfigs.add(new RssConfigImpl());

		rssIndexes = new int[] {0};
	}
	else {
		rssIndexes = new int[rssConfigs.size()];
	}
}

if(rssIndexes == null) {
	rssIndexes = new int[0];
}

System.out.println("rssIndexes :"+rssIndexes.length +" || rssConfig :"+rssConfigs.size());

PortletURL actionUrl = renderResponse.createActionURL();
actionUrl.setParameter("action", RssConstants.UPDATE_CONFIG_RSS);

System.out.println("redirect :"+redirect);
%>
<aui:form action="<%= actionUrl %>" method="post" name="fm">

	<liferay-ui:error-marker key="errorSection" value="titles" />
<div id="rssFieldset">
	<aui:fieldset >

		<%

		for (int i = 0; i < rssIndexes.length; i++) {
			int rssIndex = rssIndexes[i];

			RssConfig rssConfig = rssConfigs.get(i);
		%>
			<aui:model-context bean="<%= rssConfig %>" model="<%= RssConfig.class %>" />

			<div class="lfr-form-row lfr-form-row-inline">
				<div class="row-fields">
					<aui:input name='<%= "rssConfigId" + rssIndex %>' type="hidden" value="<%= rssConfig.getRssConfigId() %>" />

					<aui:input fieldParam='<%= "title" + rssIndex %>' id='<%= "title" + rssIndex %>' inlineField="<%= true %>" name="title" />

					<aui:input fieldParam='<%= "url" + rssIndex %>' id='<%= "url" + rssIndex %>' inlineField="<%= true %>" name="url" />
				</div>
			</div>

		<%
		}
		%>

		<aui:input name="indexes" type="hidden" value="<%= StringUtil.merge(rssIndexes) %>" />

	</aui:fieldset>
</div>
	<aui:script use="liferay-auto-fields">
		AUI().use('liferay-auto-fields',function(A) {
			new Liferay.AutoFields(
			    {
			        contentBox: '#rssFieldset',
			        fieldIndexes: '<portlet:namespace />rssIndexes',
			        namespace: '<portlet:namespace />'
			    }
			).render();
		});

	</aui:script>

	<aui:button-row>
		<aui:button onClick='<%= renderResponse.getNamespace() + "saveSettings();" %>' type="submit" />
	</aui:button-row>

</aui:form>



<aui:script>
function <portlet:namespace />saveSettings() {
	submitForm(document.<portlet:namespace />fm, '<%= HtmlUtil.escapeJS(actionUrl.toString()) %>');
}
</aui:script>

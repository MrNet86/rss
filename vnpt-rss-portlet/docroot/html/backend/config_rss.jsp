<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="java.util.Enumeration"%>
<%@page import="javax.portlet.RenderResponse"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ include file="../init.jsp" %>
<%

String redirect = ParamUtil.getString(request, "redirect");

String typeSelection = ParamUtil.getString(request, "typeSelection");

int assetOrder = ParamUtil.getInteger(request, "assetOrder", -1);

String[] urls = portletPreferences.getValues("urls", new String[0]);

String[] titles = portletPreferences.getValues("titles", new String[0]);

int entriesPerFeed = GetterUtil.getInteger(portletPreferences.getValue("entriesPerFeed", "8"));
int expandedEntriesPerFeed = GetterUtil.getInteger(portletPreferences.getValue("expandedEntriesPerFeed", "1"));
boolean showFeedTitle = GetterUtil.getBoolean(portletPreferences.getValue("showFeedTitle", Boolean.TRUE.toString()));
boolean showFeedPublishedDate = GetterUtil.getBoolean(portletPreferences.getValue("showFeedPublishedDate", Boolean.TRUE.toString()));
boolean showFeedDescription = GetterUtil.getBoolean(portletPreferences.getValue("showFeedDescription", Boolean.TRUE.toString()));
boolean showFeedImage = GetterUtil.getBoolean(portletPreferences.getValue("showFeedImage", Boolean.TRUE.toString()));
String feedImageAlignment = portletPreferences.getValue("feedImageAlignment", "right");
boolean showFeedItemAuthor = GetterUtil.getBoolean(portletPreferences.getValue("showFeedItemAuthor", Boolean.TRUE.toString()));

String[] headerArticleValues = portletPreferences.getValues("headerArticleValues", new String[] {"0", ""});

long headerArticleGroupId = GetterUtil.getLong(headerArticleValues[0]);
String headerArticleId = headerArticleValues[1];

String[] footerArticleValues = portletPreferences.getValues("footerArticleValues", new String[] {"0", ""});

long footerArticleGroupId = GetterUtil.getLong(footerArticleValues[0]);
String footerArticleId = footerArticleValues[1];

PortletURL actionUrl = renderResponse.createActionURL();
actionUrl.setParameter("action", RssConstants.UPDATE_CONFIG_RSS);

System.out.println("redirect :"+redirect);
%>
<aui:form action="<%= actionUrl %>" method="post" name="fm">
	<c:choose>
		<c:when test="<%= typeSelection.equals(StringPool.BLANK) %>">
			<liferay-ui:panel-container extended="<%= true %>" id="rssFeedsSettingsPanelContainer" persistState="<%= true %>">
				<liferay-ui:panel collapsible="<%= true %>" extended="<%= true %>" id="rssFeedsSettingsPanel" persistState="<%= true %>" title="feeds">
					<liferay-ui:error exception="<%= ValidatorException.class %>">	
						<%
						ValidatorException ve = (ValidatorException)errorException;
						%>
	
						<liferay-ui:message key="the-following-are-invalid-urls" />
	
						<%
						Enumeration enu = ve.getFailedKeys();
	
						while (enu.hasMoreElements()) {
							String url = (String)enu.nextElement();
						%>
	
							<strong><%= HtmlUtil.escape(url) %></strong><%= (enu.hasMoreElements()) ? ", " : "." %>
	
						<%
						}
						%>
					</liferay-ui:error>
					
					<aui:fieldset cssClass="subscriptions">

						<%
						if (urls.length == 0) {
							urls = new String[1];
							urls [0] = StringPool.BLANK;
						}

						for (int i = 0; i < urls.length; i++) {
							String title = StringPool.BLANK;

							if (i < titles.length) {
								title = titles[i];
							}
						%>

							<div class="lfr-form-row lfr-form-row-inline">
								<div class="row-fields">
									<aui:input cssClass="lfr-input-text-container" label="title" name='<%= "title" + i %>' value="<%= title %>" />

									<aui:input cssClass="lfr-input-text-container" label="url" name='<%= "url" + i %>' value="<%= urls[i] %>" />
								</div>
							</div>

						<%
						}
						%>

					</aui:fieldset>
				</liferay-ui:panel>
				
				<liferay-ui:panel collapsible="<%= true %>" extended="<%= true %>" id="rssFeedsDisplaySettingsPanel" persistState="<%= true %>" title="display-settings">
					<aui:fieldset>
						<aui:input name="preferences--showFeedTitle--" type="checkbox" value="<%= showFeedTitle %>" />

						<aui:input name="preferences--showFeedPublishedDate--" type="checkbox" value="<%= showFeedPublishedDate %>" />

						<aui:input name="preferences--showFeedDescription--" type="checkbox" value="<%= showFeedDescription %>" />

						<%
						String taglibShowFeedImageOnClick = "if (this.checked) {document." + renderResponse.getNamespace() + "fm." + renderResponse.getNamespace() + "feedImageAlignment.disabled = '';} else {document." + renderResponse.getNamespace() + "fm." + renderResponse.getNamespace() + "feedImageAlignment.disabled = 'disabled';}";
						%>

						<aui:input name="preferences--showFeedImage--" onClick="<%= taglibShowFeedImageOnClick %>" type="checkbox" value="<%= showFeedImage %>" />

						<aui:input name="preferences--showFeedItemAuthor--" type="checkbox" value="<%= showFeedItemAuthor %>" />

						<aui:select label="num-of-entries-per-feed" name="preferences--entriesPerFeed--">

							<%
							for (int i = 1; i < 10; i++) {
							%>

								<aui:option label="<%= i %>" selected="<%= i == entriesPerFeed %>" />

							<%
							}
							%>

						</aui:select>

						<aui:select label="num-of-expanded-entries-per-feed" name="preferences--expandedEntriesPerFeed--">

							<%
							for (int i = 0; i < 10; i++) {
							%>

								<aui:option label="<%= i %>" selected="<%= i == expandedEntriesPerFeed %>" />

							<%
							}
							%>

						</aui:select>

						<aui:select disabled="<%= !showFeedImage %>" name="preferences--feedImageAlignment--">
							<aui:option label="left" selected='<%= feedImageAlignment.equals("left") %>' />
							<aui:option label="right" selected='<%= feedImageAlignment.equals("right") %>' />
						</aui:select>
						 
					</aui:fieldset>
				</liferay-ui:panel>
				
			</liferay-ui:panel-container>
			
			<aui:button-row>
				<aui:button onClick='<%= renderResponse.getNamespace() + "saveSettings();" %>' type="submit" />
			</aui:button-row>
						
			<aui:script use="aui-base,liferay-auto-fields">
				var subscriptionsTable = A.one('#<portlet:namespace />subscriptions');

				if (subscriptionsTable) {
					subscriptionsTable.delegate(
						'click',
						function(event) {
							event.currentTarget.get('parentNode.parentNode').remove();
						},
						'.remove-subscription'
					);
				}

				new Liferay.AutoFields(
					{
						contentBox: 'fieldset.subscriptions',
						fieldIndexes: '<portlet:namespace />subscriptionIndexes',
						namespace: '<portlet:namespace />'
					}
				).render();
			</aui:script>
			
		</c:when>
	</c:choose>
</aui:form>
<aui:script>
function <portlet:namespace />saveSettings() {

	document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = '<%= Constants.UPDATE %>';
	document.<portlet:namespace />fm.<portlet:namespace />typeSelection.value = '';

	submitForm(document.<portlet:namespace />fm, '<%= HtmlUtil.escapeJS(actionUrl.toString()) %>');
}
</aui:script>

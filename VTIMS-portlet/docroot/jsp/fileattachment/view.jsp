<%@page import="com.viettel.ims.core.service.FileAttachmentLocalServiceUtil"%>
<%@page import="com.viettel.ims.core.model.FileAttachment"%>
<%@page import="com.liferay.portal.webserver.WebServerServletTokenUtil"%>
<%@ include file="/jsp/init.jsp"%>

<%
PortletURL portletURL = renderResponse.createRenderURL();
int objectType = ParamUtil.getInteger(request, "objectType");
long objectId = ParamUtil.getLong(request, "objectId");

String action = "";
String objectTypeId = "";
String tab ="";
if(objectType == 1){ // 1 - InvestPolicy
	action = ActionConstants.EDIT_INVEST_POLICY;
	objectTypeId = "investPolicyId";
	tab ="tabAttachment";
}

portletURL.setParameter("action", action);
portletURL.setParameter("subaction", ActionConstants.VIEW_FILE_ATTACHMENT);
String portletURLString = portletURL.toString();

List<FileAttachment> fileAttachmentes = FileAttachmentLocalServiceUtil.getFileAttachmentsByObject(objectType, objectId);
int numRec = fileAttachmentes != null ? fileAttachmentes.size() : 0;

%>

<aui:form action="<%= portletURLString %>" method="post" name="fm">
	<c:choose>
		<c:when test='<%= numRec == 0 %>'>
			<div class="alert alert-info">
				<liferay-ui:message key="autosoft_no-record-were-found" />
			</div>
		</c:when>
	</c:choose>

	<liferay-ui:search-container
		>

		<liferay-ui:search-container-results
			results="<%= fileAttachmentes %>"
			total="<%= numRec %>"
		/>

		<liferay-ui:search-container-row
			className="com.viettel.ims.core.model.FileAttachment"
			escapedModel="<%= false %>"
			keyProperty="fileAttachmentId"
			modelVar="fileAttachment"
			>
			<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="rowURL">
				<portlet:param name="action" value="<%= action %>" />
				<portlet:param name="subaction" value="<%= ActionConstants.EDIT_FILE_ATTACHMENT %>" />
				<portlet:param name="fileAttachmentId" value="<%= String.valueOf(fileAttachment.getFileAttachmentId()) %>" />
			</portlet:renderURL>

			<portlet:resourceURL var="downloadURL" id='<%= ActionConstants.DOWNLOAD_FILE_ATTACHMENT %>'>
				<portlet:param name="fileAttachmentId" value="<%= String.valueOf(fileAttachment.getFileAttachmentId()) %>" />
			</portlet:resourceURL>
			<liferay-ui:search-container-column-text
				name='<%= LanguageUtil.get(response.getLocale(), "Common.Title") %>'
				value='<%= fileAttachment.getTitle() == null ? "" : fileAttachment.getTitle() %>'
			/>
			<liferay-ui:search-container-column-text
				name='<%= LanguageUtil.get(response.getLocale(), "Common.Description") %>'
				value='<%= fileAttachment.getDescription() == null ? "" : fileAttachment.getDescription() %>'
			/>
			<liferay-ui:search-container-column-text
				name='<%= LanguageUtil.get(response.getLocale(), "Common.Name") %>'
				value='<%= fileAttachment.getName() == null ? "" : fileAttachment.getName() %>'
			/>
			<liferay-ui:search-container-column-text
				href="<%= downloadURL.toString() %>"
				name='<%= LanguageUtil.get(response.getLocale(), "Common.Size") %>'
				value='<%= fileAttachment.getSize_() > 0 ? String.valueOf(fileAttachment.getSize_()) : "" %>'
			/>
 			<liferay-ui:search-container-column-jsp
				align="right"
				path="/html/common/fileattachment/action.jsp"
			/>

		</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

	</liferay-ui:search-container>

	<div class="separator"><!-- --></div>
	<aui:button-row>
		<aui:button type="button" value="Command.Add" icon="icon-plus" onClick='<%= renderResponse.getNamespace() + "Add();" %>' />
	</aui:button-row>
</aui:form>
<portlet:renderURL var="formAddAction">
	<portlet:param name="action" value="<%= action %>" />
	<portlet:param name="<%= objectTypeId %>" value="<%= String.valueOf(objectId) %>" />
	<portlet:param name="tab" value="<%= tab %>" />
	<portlet:param name="subaction" value="<%= ActionConstants.EDIT_FILE_ATTACHMENT %>" />
</portlet:renderURL>
<aui:script>
	function <portlet:namespace />Add() {
		document.<portlet:namespace />fm.method = "post";
		submitForm(document.<portlet:namespace />fm, "<%= formAddAction %>");
	}
</aui:script>
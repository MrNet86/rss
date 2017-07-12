<%@page import="com.viettel.ims.core.model.FileAttachment"%>
<%@page import="com.liferay.portal.kernel.util.TextFormatter"%>
<%@ include file="/jsp/init.jsp" %>
<%

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
FileAttachment fileAttachment = (FileAttachment)row.getObject();
String action = "";
String objectTypeId = "";
String tab ="";
if(fileAttachment != null && fileAttachment.getObjectType() == 1){
	action = ActionConstants.EDIT_INVEST_POLICY;
	objectTypeId = "investPolicyId";
	tab ="tabAttachment";
}

%>

<liferay-ui:icon-menu>
		<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editURL">
			<portlet:param name="action" value="<%= action %>" />
			<portlet:param name="<%= objectTypeId %>" value="<%= String.valueOf(fileAttachment.getObjectId()) %>" />
			<portlet:param name="tab" value="<%= tab %>" />
			<portlet:param name="subaction" value="<%= ActionConstants.EDIT_FILE_ATTACHMENT %>" />
			<portlet:param name="fileAttachmentId" value="<%= String.valueOf(fileAttachment.getFileAttachmentId()) %>" />
		</portlet:renderURL>
		<liferay-ui:icon message="Command.Edit" iconCssClass="icon-edit" url="<%= editURL %>" />
		<portlet:resourceURL var="downloadURL" id='<%= ActionConstants.DOWNLOAD_FILE_ATTACHMENT %>'>
			<portlet:param name="fileAttachmentId" value="<%= String.valueOf(fileAttachment.getFileAttachmentId()) %>" />
		</portlet:resourceURL>
		<liferay-ui:icon
			iconCssClass="icon-download"
			label="<%= true %>"
			message='<%= LanguageUtil.get(pageContext, "download") + " (" + TextFormatter.formatStorageSize(fileAttachment.getSize_(), locale) + ")" %>'
			url="<%= downloadURL %>"
		/>
</liferay-ui:icon-menu>
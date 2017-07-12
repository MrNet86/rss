<%@page import="com.viettel.ims.core.model.FileAttachment"%>
<%@ include file="/jsp/init.jsp" %>
<%
	String redirect = ParamUtil.getString(request, "redirect");
	String backURL = ParamUtil.getString(request, "backURL", redirect);

	FileAttachment fileAttachment = (FileAttachment)request.getAttribute("fileAttachment");

	String title = fileAttachment != null ? fileAttachment.getTitle() : "";
	String description = fileAttachment != null ? fileAttachment.getDescription() : "";

%>
<portlet:actionURL var="formAction">
    <portlet:param name="action" value="<%= ActionConstants.UPDATE_FILE_ATTACHMENT_TITLE %>"/>
</portlet:actionURL>
<aui:form action="${formAction}" method="post" name="fm">
	<aui:model-context model="<%= FileAttachment.class %>" bean="${fileAttachment}"/>
	<aui:input name="fileAttachmentId" type="hidden"/>
	<aui:input name="companyId" type="hidden"/>
	<aui:input name="objectType" type="hidden"/>
	<aui:input name="objectId" type="hidden"/>
	<aui:row>
		<aui:input name="title" type="text" label="Common.Title" value="<%= title %>" cssClass="size80" maxlength="255" inlineLabel="false">
			<aui:validator name="required" errorMessage="autosoft-you-must-enter-the-info-to-this"/>
		</aui:input>
	</aui:row>
	<aui:row>
		<aui:input name="description" label="Common.Description"
			value="<%=description%>" type="textarea" cols="60" rows="4"
			inlineLabel="false" />
	</aui:row>
	<aui:row>
		<liferay-ui:message key="autosoft_asteric_notice" />
	</aui:row>
	<div class="separator"><!-- --></div>
	<aui:button-row>
		<aui:button type="submit" value="Command.Save"  icon="icon-save" />
		<%
		if(Validator.isNotNull(fileAttachment) && fileAttachment.getFileAttachmentId() > 0){
		%>
			<aui:button type="button" value="Command.Delete" icon="icon-remove" onClick='<%= renderResponse.getNamespace() + "deleteCurrent();"%>' />
		<%
		}
		%>

		<aui:button type="cancel" value="Command.Cancel" icon="icon-undo" href="<%= redirect %>" />
	</aui:button-row>
</aui:form>
<aui:script>
	function <portlet:namespace />deleteCurrent() {
		if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "are-you-sure-you-want-to-delete-this") %>')) {
			document.<portlet:namespace />fm.method = "post";
			submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="action" value="<%= ActionConstants.DELETE_FILE_ATTACHMENT%>"/><portlet:param name="fileAttachmentTobeDeletedId" value="<%= String.valueOf(fileAttachment.getFileAttachmentId()) %>" /></portlet:actionURL>');
		}
	}
</aui:script>
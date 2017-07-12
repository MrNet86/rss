<%@page import="com.viettel.ims.core.model.FileAttachment"%>
<%@page import="com.liferay.portal.kernel.util.PrefsPropsUtil"%>
<%@ include file="/jsp/init.jsp" %>
<%
	String redirect = ParamUtil.getString(request, "redirect");
	String backURL = ParamUtil.getString(request, "backURL", redirect);

	FileAttachment fileAttachment = (FileAttachment)request.getAttribute("fileAttachment");
	long fileAttachmentId = fileAttachment != null ? fileAttachment.getFileAttachmentId() : 0L;
	String title = fileAttachment != null ? fileAttachment.getTitle() : "";
	String description = fileAttachment != null ? fileAttachment.getDescription() : "";
%>
<portlet:actionURL var="formAction">
    <portlet:param name="action" value="<%= ActionConstants.UPDATE_FILE_ATTACHMENT %>"/>
</portlet:actionURL>
<aui:form action="${formAction}" method="post" name="fm" enctype="multipart/form-data" >
	<aui:input name="fileAttachmentId"  type="hidden" value="<%= String.valueOf(fileAttachmentId) %>"/>
	<aui:input name="companyId" type="hidden" value="<%= String.valueOf(0) %>"/>
	<aui:input name="objectType" type="hidden" value="<%= String.valueOf(1) %>"/>
	<aui:input name="objectId" type="hidden" value="<%= String.valueOf(0) %>"/>
	<%
// 		if(fileAttachment != null && fileAttachment.getFileAttachmentId() == 0){
	%>
	<aui:row>
		<aui:col span="2">
			<liferay-ui:message key="Common.FileAttachment" />
		</aui:col>
		<aui:col span="10">
			<input id="<portlet:namespace />uploadFile"
				class="field success-field" name="uploadFile"
				onChange='<%=renderResponse.getNamespace()+ "validateTitle();"%>'
				style="width: auto;" type="file">
		</aui:col>
	</aui:row>
	<%
// 		}
	%>
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
		<aui:button type="button" value="Command.Delete" icon="icon-remove"
			onClick='<%= renderResponse.getNamespace() + "deleteCurrent();"%>' />
		<%
		}
		%>
		<aui:button type="cancel" value="Command.Cancel" icon="icon-undo" href="<%= redirect %>" />
	</aui:button-row>
</aui:form>

<aui:script>
	jQuery('#<portlet:namespace />uploadFile').bind('change', changeTile);
	jQuery('#<portlet:namespace />uploadFile').ready(changeTile);
	function changeTile() {
		var nameFile = jQuery('#<portlet:namespace />uploadFile').val();
		jQuery('#<portlet:namespace />title').val(nameFile);
	}

	function <portlet:namespace />deleteCurrent() {
		if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "are-you-sure-you-want-to-delete-this") %>')) {
			document.<portlet:namespace />fm.method = "post";
			submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="action" value="<%= ActionConstants.DELETE_FILE_ATTACHMENT%>"/></portlet:actionURL>');
		}
	}

	function <portlet:namespace />validateTitle() {
		Liferay.Form.get('<portlet:namespace />fm').formValidator.validateField('<portlet:namespace />title');
	}

</aui:script>

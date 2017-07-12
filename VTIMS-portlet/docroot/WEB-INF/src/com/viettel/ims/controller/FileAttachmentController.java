package com.viettel.ims.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.activation.MimetypesFileTypeMap;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.portlet.bind.PortletRequestBindingException;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CompanyConstants;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.DuplicateFileException;
import com.liferay.portlet.documentlibrary.FileSizeException;
import com.liferay.portlet.documentlibrary.NoSuchDirectoryException;
import com.liferay.portlet.documentlibrary.NoSuchFileException;
import com.liferay.portlet.documentlibrary.model.DLFileEntryConstants;
import com.liferay.portlet.documentlibrary.store.DLStoreUtil;
import com.viettel.ims.common.ActionConstants;
import com.viettel.ims.common.CommonUtils;
import com.viettel.ims.core.model.FileAttachment;
import com.viettel.ims.core.model.impl.FileAttachmentImpl;
import com.viettel.ims.core.service.FileAttachmentLocalServiceUtil;

@Controller(value = "fileAttachmentController")
@RequestMapping(value = "VIEW")
public class FileAttachmentController {

	@RequestMapping(params = "action=" + ActionConstants.VIEW_FILE_ATTACHMENT)
	public String listFileAttachment(RenderRequest renderRequest) {
		return "view";
	}

	@RequestMapping(params = "action=" + ActionConstants.EDIT_FILE_ATTACHMENT)
	public String showEditFileAttachment(Model model, RenderRequest renderRequest) {
		long companyId = 0L;

		int objectType = 0;
		long objectId = 0L;

		FileAttachment fileAttachment = new FileAttachmentImpl();
		try {
			String fileAttachmentId = renderRequest.getParameter("fileAttachmentId");
			if (fileAttachmentId != null && !"".equals(fileAttachmentId)) {
				fileAttachment = FileAttachmentLocalServiceUtil.getFileAttachment(Long.valueOf(fileAttachmentId));
				objectType = fileAttachment.getObjectType();
				objectId = fileAttachment.getObjectId();
			} else {
				objectType = Integer.valueOf(renderRequest.getParameter("objectType"));
				objectId = Long.valueOf(renderRequest.getParameter("objectId"));
				fileAttachment.setCompanyId(companyId);
				fileAttachment.setObjectType(objectType);
				fileAttachment.setObjectId(objectId);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("fileAttachment", fileAttachment);

		renderRequest.setAttribute("objectId", objectId);
		renderRequest.setAttribute("tab", "tabAttachment");

		return "view";
	}

	@ActionMapping(params = "action=" + ActionConstants.UPDATE_FILE_ATTACHMENT)
	public void addFileAttachment(@RequestParam("uploadFile") MultipartFile uploadFile,
		ActionRequest actionRequest, ActionResponse actionResponse)
		throws PortletRequestBindingException, PortalException, SystemException {

		try {
			long fileAttachmentId = ParamUtil.getLong(actionRequest, "fileAttachmentId");
			long companyId = 0L;
			int objectType = ParamUtil.getInteger(actionRequest, "objectType");
			long objectId = ParamUtil.getLong(actionRequest, "objectId");

			String dirPathPrefix = "";
			String action = "";
			String objectIdName = "";
			if (objectType == 1) {
				dirPathPrefix = "investPolicy/";
				action = ActionConstants.EDIT_INVEST_POLICY;
				objectIdName = "investPolicyId";
			}

			String directoryPath = dirPathPrefix.concat(String.valueOf(objectId));

			String fileName = "";
			long size = 0;
			String contentType = "";
			if (uploadFile != null && uploadFile.getSize() > 0) {
				size = uploadFile.getSize();

				if (size < 104857600) { // 100MB
					fileName = uploadFile.getOriginalFilename();
					contentType = uploadFile.getContentType();

					// Create folder
					CommonUtils.createFolder(directoryPath, companyId);

					String filePath = CommonUtils.getFilePath(dirPathPrefix, objectId, fileName);
					try {
						// Save file
						DLStoreUtil.addFile(companyId, CompanyConstants.SYSTEM, filePath, uploadFile.getBytes());

						// Write to DBe
						FileAttachment fileAttachment = new FileAttachmentImpl();
			    		if(fileAttachmentId > 0){
			    			fileAttachment = FileAttachmentLocalServiceUtil.getFileAttachment(fileAttachmentId);
			    		}
			    		fileAttachment.setCompanyId(companyId);
			    		fileAttachment.setRepositoryId(CompanyConstants.SYSTEM);
			    		fileAttachment.setFolderId(0L);
			    		String title = ParamUtil.getString(actionRequest, actionResponse.getNamespace()+"title");
			    		fileAttachment.setTitle(title);
			    		String description = ParamUtil.getString(actionRequest, actionResponse.getNamespace()+"description");
			    		fileAttachment.setDescription(description);
			    		fileAttachment.setTreePath_("");
			    		fileAttachment.setName(fileName);
			    		String extension = CommonUtils.getExtension(fileName, fileName);
			    		fileAttachment.setExtention(extension);
			    		fileAttachment.setFileTypeId(0);
			    		fileAttachment.setVersion(DLFileEntryConstants.VERSION_DEFAULT);
			    		fileAttachment.setSize_(size);
			    		fileAttachment.setReadCount(DLFileEntryConstants.DEFAULT_READ_COUNT);
			    		fileAttachment.setObjectType(objectType);
			    		fileAttachment.setObjectId(objectId);

						if(fileAttachment.getCreatedById() == 0){
							fileAttachment.setCreatedById(CommonUtils.getUserId(actionRequest));
						}
						fileAttachment.setModifiedById(CommonUtils.getUserId(actionRequest));

						if (fileAttachment.getCreatedDate() == null || fileAttachment.getCreatedDate().equals("")) {
							fileAttachment.setCreatedDate(new Date());
						}
						fileAttachment.setModifiedDate(new Date());

						if (fileAttachmentId > 0) {
							FileAttachmentLocalServiceUtil.updateFileAttachment(fileAttachment);
						} else {
							FileAttachmentLocalServiceUtil.addFileAttachment(fileAttachment);
						}

						actionResponse.setRenderParameter("action", action);
						actionResponse.setRenderParameter(objectIdName, "" + objectId);
						actionResponse.setRenderParameter("tab", "tabAttachment");
						SessionMessages.add(actionRequest, "success");
					} catch (DuplicateFileException dde) {
						SessionErrors.add(actionRequest, dde.getClass());
						actionResponse.setRenderParameter("action", action);
						actionResponse.setRenderParameter("subaction", ActionConstants.EDIT_FILE_ATTACHMENT);
						actionResponse.setRenderParameter(objectIdName, "" + objectId);
						actionResponse.setRenderParameter("tab", "tabAttachment");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} else {
				SessionErrors.add(actionRequest, FileSizeException.class);
				actionResponse.setRenderParameter("action", action);
				actionResponse.setRenderParameter("subaction", ActionConstants.VIEW_FILE_ATTACHMENT);
				actionResponse.setRenderParameter(objectIdName, "" + objectId);
				actionResponse.setRenderParameter("objectId", "" + objectId);
				actionResponse.setRenderParameter("tab", "tabAttachment");
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}

	@ActionMapping(params = "action=" + ActionConstants.UPDATE_FILE_ATTACHMENT_TITLE)
	public void updateTitle(
			@ModelAttribute("fileAttachment") FileAttachmentImpl fileAttachment,
			BindingResult result, ActionRequest actionRequest,
			ActionResponse actionResponse)
			throws PortletRequestBindingException, PortalException,
			SystemException {

		long fileAttachmentId = fileAttachment.getFileAttachmentId();
		FileAttachment fileAttachmentUpdate = FileAttachmentLocalServiceUtil.getFileAttachment(fileAttachmentId);

		fileAttachmentUpdate.setModifiedById(CommonUtils.getUserId(actionRequest));

		boolean fWrite = false;
		if (fileAttachment.getTitle() != null && !fileAttachment.getTitle().equals("")) {
			fileAttachmentUpdate.setTitle(fileAttachment.getTitle());
			fWrite = true;
		}

		if (fileAttachment.getDescription() != null && !fileAttachment.getDescription().equals("")) {
			fileAttachmentUpdate.setDescription(fileAttachment.getDescription());
			fWrite = true;
		}
		if(fWrite){
			FileAttachmentLocalServiceUtil.updateFileAttachment(fileAttachmentUpdate);
		}

		int objectType = ParamUtil.getInteger(actionRequest, "objectType");
		long objectId = ParamUtil.getLong(actionRequest, "objectId");

		String action = "";
		String objectIdName = "";
		if (objectType == 1) {
			action = ActionConstants.EDIT_INVEST_POLICY;
			objectIdName = "investPolicyId";
		}

		actionResponse.setRenderParameter("action", action);
		actionResponse.setRenderParameter("subaction", ActionConstants.VIEW_FILE_ATTACHMENT);
		actionResponse.setRenderParameter(objectIdName, "" + objectId);
		actionResponse.setRenderParameter("objectId", "" + objectId);
		actionResponse.setRenderParameter("tab", "tabAttachment");

	}

	// delete 1
	@ActionMapping(params = "action=" + ActionConstants.DELETE_FILE_ATTACHMENT)
	public void deleteFileAttachment(@RequestParam("fileAttachmentTobeDeletedId") Integer fileAttachmentId, ActionRequest actionRequest,
			ActionResponse actionResponse) throws SystemException, PortalException {

		FileAttachment fileAttachment = FileAttachmentLocalServiceUtil.getFileAttachment(fileAttachmentId);
		int objectType = fileAttachment.getObjectType();
		long objectId = fileAttachment.getObjectId();

		String dirPathPrefix = "";
		if (objectType == 1) {
			dirPathPrefix = "investPolicy/";
		}

		String filePath = CommonUtils.getFilePath(dirPathPrefix, objectId, fileAttachment.getName());
		try {
			DLStoreUtil.deleteFile(fileAttachment.getCompanyId(), CompanyConstants.SYSTEM, filePath);
		} catch (NoSuchDirectoryException nsde) {
			if (_log.isDebugEnabled()) {
				_log.debug(nsde, nsde);
			}
		} catch (NoSuchFileException nsfe) {
			if (_log.isDebugEnabled()) {
				_log.debug(nsfe, nsfe);
			}
		}

		FileAttachmentLocalServiceUtil.deleteFileAttachment(fileAttachmentId);

		actionResponse.setRenderParameter("subaction", ActionConstants.VIEW_FILE_ATTACHMENT);
		actionResponse.setRenderParameter("tab", "tabAttachment");
		actionResponse.setRenderParameter("objectId", "" + objectId);
		if (objectType == 1L) {
			actionResponse.setRenderParameter("action", ActionConstants.EDIT_INVEST_POLICY);
			actionResponse.setRenderParameter("investerId", "" + objectId);
		}
	}

	@ResourceMapping(value = ActionConstants.DOWNLOAD_FILE_ATTACHMENT)
	public void downloadFile(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortalException, SystemException {
		long fileAttachmentId = ParamUtil.getLong(resourceRequest, "fileAttachmentId");
		FileAttachment fileAttachment = FileAttachmentLocalServiceUtil.getFileAttachment(fileAttachmentId);

		// String fileName = ParamUtil.getString(resourceRequest, "fileName");

		long companyId = PortalUtil.getCompanyId(resourceRequest);

		String dirPathPrefix = "";
		String action = "";
		String objectIdName = "";
		int objectType = fileAttachment.getObjectType();
		long objectId = fileAttachment.getObjectId();
		if (objectType == 1) {
			dirPathPrefix = "investPolicy/";
			action = ActionConstants.EDIT_INVEST_POLICY;
			objectIdName = "investPolicyId";
		}

		String filePath = CommonUtils.getFilePath(dirPathPrefix, objectId, fileAttachment.getName());

		System.out.println("filePath=" + filePath);
		// String filePath = "Sample_Chapters" + File.separator + fileName;

		File file = null;
		try {
			file = DLStoreUtil.getFile(companyId, CompanyConstants.SYSTEM, filePath);
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}

		if (Validator.isNotNull(file)) {
			byte[] bytes;
			try {
				bytes = FileUtil.getBytes(file);
				String contentType = new MimetypesFileTypeMap().getContentType(file);

				// preparing the response
				HttpServletResponse response = PortalUtil.getHttpServletResponse(resourceResponse);
				response.setContentType(contentType);
				response.setHeader("Content-Disposition", "attachment; filename= " + fileAttachment.getName());

				ServletResponseUtil.write(response, bytes);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static Log	_log	= LogFactoryUtil.getLog(FileAttachmentController.class);
}

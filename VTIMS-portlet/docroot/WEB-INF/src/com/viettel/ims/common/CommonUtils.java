package com.viettel.ims.common;

import java.io.File;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.CompanyConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.documentlibrary.DuplicateDirectoryException;
import com.liferay.portlet.documentlibrary.store.DLStoreUtil;

public class CommonUtils {

	public static long getUserId (PortletRequest request) {
		Long id = 0L;
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		if(themeDisplay != null){
			User user = themeDisplay.getUser();
			if(user != null) {
				id = user.getUserId();
			}
		}
		return id;
	}

	public static void createFolder(String folderName, long companyId){
		boolean folderExists = false;

		try {
			folderExists = DLStoreUtil.hasDirectory(companyId, CompanyConstants.SYSTEM, folderName);
		} catch (PortalException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SystemException  e) {
			e.printStackTrace();
		}
		if(!folderExists){
			try {
				DLStoreUtil.addDirectory(companyId, CompanyConstants.SYSTEM, folderName);
			}
			catch (DuplicateDirectoryException dde) {
				System.out.println("duplicate");
			}
			catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch( SystemException e) {
				e.printStackTrace();
			}
		}

	}

	public static String getExtension(String title, String sourceFileName) {
		String extension = FileUtil.getExtension(sourceFileName);

		if (Validator.isNull(extension)) {
			extension = FileUtil.getExtension(title);
		}

		return extension;
	}

	public static String getMimeType(
		String sourceFileName, String mimeType, String title, File file) {

		if (Validator.isNull(mimeType) ||
			mimeType.equals(ContentTypes.APPLICATION_OCTET_STREAM)) {

			String extension = getExtension(title, sourceFileName);

			mimeType = MimeTypesUtil.getContentType(file, "A." + extension);
		}

		return mimeType;
	}

	public static String getDirectoryPath(String dirPathPrefix, long id) {
		return dirPathPrefix.concat(String.valueOf(id));
	}

	public static String getFilePath(String dirPathPrefix, long id, String filename) {
		return getDirectoryPath(dirPathPrefix, id).concat(StringPool.SLASH).concat(
			filename);
	}

}

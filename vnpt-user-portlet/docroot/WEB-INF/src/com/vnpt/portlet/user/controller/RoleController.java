package com.vnpt.portlet.user.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.DuplicateRoleException;
import com.liferay.portal.NoSuchRoleException;
import com.liferay.portal.RequiredRoleException;
import com.liferay.portal.RoleNameException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.CompanyThreadLocal;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.RoleServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.vnpt.portlet.user.model.ActIdGroup;
import com.vnpt.portlet.user.model.impl.ActIdGroupImpl;
import com.vnpt.portlet.user.permission.VnptPermission;
import com.vnpt.portlet.user.service.ActIdGroupLocalServiceUtil;
import com.vnpt.portlet.user.utils.VnptConstants;

@Controller
@RequestMapping("VIEW")
public class RoleController {
	
	private static final Log _log = LogFactoryUtil.getLog(RoleController.class);
	
	@RenderMapping
	public String viewRole(RenderRequest renderRequest,
			RenderResponse renderResponse) throws Exception {
		return "view";
	}

	@RenderMapping(params="tabs1="+VnptConstants.EDIT_ROLE)
	public String editRole(RenderRequest renderRequest,
			RenderResponse renderResponse) throws Exception {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		PermissionChecker permissionChecker = themeDisplay.getPermissionChecker();

		// check edit permission
		if (!VnptPermission.contains(permissionChecker, groupId, VnptConstants.USER_PER_ADMIN)) {
			SessionErrors.add(renderRequest, "use-have-not-permission");
			return "user/error_permission" ;
		}

		long roleId = ParamUtil.getLong(renderRequest, "roleId", 0L);
		if(roleId > 0 ) {
			Role role = RoleLocalServiceUtil.fetchRole(roleId);
			if(role != null) {
				renderRequest.setAttribute("role", role);
			}
		}
		
		// get all site of user login
		List<Group> groups = Collections.emptyList();
		groups = themeDisplay.getUser().getGroups();		
		renderRequest.setAttribute("groups", groups);
		
		return "view";
	}
	
	@ActionMapping(params="action="+VnptConstants.UPDATE_ROLE)
	public void updateRole (ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		Locale defaultLocale = PortalUtil.getSiteDefaultLocale(groupId);

		Long roleId = ParamUtil.getLong(actionRequest, "roleId", 0L);
		int type = ParamUtil.getInteger(actionRequest, "type");
		String name = ParamUtil.getString(actionRequest, "name");
		String title = ParamUtil.getString(actionRequest, "title");
		String description = ParamUtil.getString(actionRequest, "description");
		Map<Locale, String> titleMap = new HashMap<Locale, String>();
		Map<Locale, String> descriptionMap = new HashMap<Locale, String>();
		
		titleMap.put(defaultLocale, title);
		descriptionMap.put(defaultLocale, description);
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Role.class.getName(), actionRequest);
		
		
		Role aRole = RoleLocalServiceUtil.getRole(CompanyThreadLocal.getCompanyId(), "Administrator");
		List<User> aUsers = UserLocalServiceUtil.getRoleUsers(aRole.getRoleId());
		long aUserId = 20158; 
		if(aUsers != null && !aUsers.isEmpty()) {
			aUserId = aUsers.get(0).getUserId();
		}
		User userAdmin = UserLocalServiceUtil.getUser(aUserId);
		PermissionChecker checker = PermissionCheckerFactoryUtil.create(userAdmin);
		PermissionThreadLocal.setPermissionChecker(checker);
		
		try {
			if(roleId <= 0) {
				Role role = RoleServiceUtil.addRole(null, 0, name, titleMap, descriptionMap, 
						type, null, serviceContext);
				
				// Assign user to new Role
				UserServiceUtil.addRoleUsers(role.getRoleId(), new long[] {themeDisplay.getUserId()});
				
				// insert into actIdGroup
				ActIdGroup actIdGroup = new ActIdGroupImpl();
				actIdGroup.setId(name);;
				actIdGroup.setRev(1);
				actIdGroup.setName(name);
				actIdGroup.setType("assignment");
				
				ActIdGroupLocalServiceUtil.addActIdGroup(actIdGroup);
				
				SessionMessages.add(actionRequest, "update-role-successfull");
			}
			else {
				Role role = RoleServiceUtil.updateRole(roleId, name, titleMap, descriptionMap, 
						null, serviceContext);
				
				// Assign user to new Role
				UserServiceUtil.addRoleUsers(role.getRoleId(), new long[] {themeDisplay.getUserId()});
							
				// insert into actIdGroup
				ActIdGroup actIdGroup = ActIdGroupLocalServiceUtil.fetchActIdGroup(name);
				if(actIdGroup == null) {
					actIdGroup = new ActIdGroupImpl();
				}
				
				actIdGroup.setId(name);;
				actIdGroup.setRev(1);
				actIdGroup.setName(name);
				actIdGroup.setType("assignment");
				
				ActIdGroupLocalServiceUtil.updateActIdGroup(actIdGroup);
				
				SessionMessages.add(actionRequest, "update-role-successfull");
			}
		}
		catch (Exception e) {
			if (e instanceof PrincipalException) {
				SessionErrors.add(actionRequest, e.getClass());
			}
			else if (e instanceof DuplicateRoleException ||
					 e instanceof NoSuchRoleException ||
					 e instanceof RequiredRoleException ||
					 e instanceof RoleNameException) {

				SessionErrors.add(actionRequest, e.getClass());
			}
			else {
				throw e;
			}
		}
		
		actionResponse.setRenderParameter("tabs1", VnptConstants.EDIT_ROLE);
		actionResponse.setRenderParameter("action", VnptConstants.EDIT_ROLE);
	}
	
}

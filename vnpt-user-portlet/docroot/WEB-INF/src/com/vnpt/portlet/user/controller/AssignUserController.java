package com.vnpt.portlet.user.controller;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.CompanyThreadLocal;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserServiceUtil;
import com.vnpt.portlet.user.model.GroupUsers;
import com.vnpt.portlet.user.model.impl.GroupUsersImpl;
import com.vnpt.portlet.user.service.GroupRolesLocalServiceUtil;
import com.vnpt.portlet.user.service.GroupUsersLocalServiceUtil;
import com.vnpt.portlet.user.utils.VnptConstants;

@Controller
@RequestMapping("VIEW")
public class AssignUserController {
	
	@ActionMapping(params="action=" + VnptConstants.UPDATE_ASSIGN_USER)
	public void updateAssignUser(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		
		long permissionGroupId = ParamUtil.getLong(actionRequest, "permissionGroupId");
		
		List<Role> lstRole = GroupRolesLocalServiceUtil.getRolesByPerGroupId(permissionGroupId);
		
		long[] availableUserIds = StringUtil.split(
				ParamUtil.getString(actionRequest, "assignUserIds"), 0L);
		for (long userId : availableUserIds) {
			
			GroupUsers groupUsers = new GroupUsersImpl();
			groupUsers.setPermissionGroupId(permissionGroupId);
			groupUsers.setUserId(userId);
			
			GroupUsersLocalServiceUtil.updateGroupUsers(groupUsers);			
		}
		
		Role aRole = RoleLocalServiceUtil.getRole(CompanyThreadLocal.getCompanyId(), "Administrator");
		List<User> aUsers = UserLocalServiceUtil.getRoleUsers(aRole.getRoleId());
		long aUserId = 0; 
		if(aUsers != null && !aUsers.isEmpty()) {
			aUserId = aUsers.get(0).getUserId();
		}
		User userAdmin = UserLocalServiceUtil.getUser(aUserId);
		PermissionChecker checker = PermissionCheckerFactoryUtil.create(userAdmin);
		PermissionThreadLocal.setPermissionChecker(checker);
					
		for(Role role : lstRole) {
			UserServiceUtil.addRoleUsers(role.getRoleId(), availableUserIds);
		}
		
	}
	
}

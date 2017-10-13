package com.vnpt.portlet.user.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.CompanyThreadLocal;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.vnpt.portlet.user.model.GroupUsers;
import com.vnpt.portlet.user.model.impl.GroupUsersImpl;
import com.vnpt.portlet.user.service.GroupRolesLocalServiceUtil;
import com.vnpt.portlet.user.service.GroupUsersLocalServiceUtil;
import com.vnpt.portlet.user.utils.VnptConstants;

@Controller
@RequestMapping("VIEW")
public class AssignUserController {
	
	private static final Log _log = LogFactoryUtil.getLog(AssignUserController.class);
	
	@RenderMapping
	public String viewAssignUser(RenderRequest renderRequest,
			RenderResponse renderResponse) throws Exception {
		_log.info("viewAssignUser ");		
		
		return "assign_user";
	}
	
	@ActionMapping(params="action=" + VnptConstants.UPDATE_ASSIGN_USER)
	public void updateAssignUser(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		
		long permissionGroupId = ParamUtil.getLong(actionRequest, "permissionGroupId");

		// get all role of groupRole
		List<Role> lstRole = GroupRolesLocalServiceUtil.getRolesByPerGroupId(permissionGroupId);
		
		long[] availableUserIds = StringUtil.split(
				ParamUtil.getString(actionRequest, "assignUserIds"), 0L);

		// assign user to groupRole
		for (long userId : availableUserIds) {			
			GroupUsers groupUsers = new GroupUsersImpl();
			groupUsers.setPermissionGroupId(permissionGroupId);
			groupUsers.setUserId(userId);
			
			GroupUsersLocalServiceUtil.updateGroupUsers(groupUsers);			
		}

		// Cap nhat lai role thuoc cac nhom quyen cho user dc chon
		// Kiem tra xem nguoi dung nao dc gan quyen thi them moi
		// nguoi dung nao loai bo ra khoi nhom phai xoa bo cac quyen tuong ung cua no di
		
		// assign role to user
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
	
	@ResourceMapping("getResourceUserByGroupRole")
	public void getUserByGroupRole(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException, PortalException,
			SystemException {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);

		Long permissionGroupId = ParamUtil.getLong(resourceRequest,"permissionGroupId", 0L);
		_log.info("getUserByGroupRole permissionGroupId :"+permissionGroupId);

		// get all assigned user
		List<User> lstAssignUser = GroupUsersLocalServiceUtil.getUserByPermissionGroupId(permissionGroupId);
		
		// get all user by login user
		List<User> lstUser = new ArrayList<User>();
		List<Group> sites =  themeDisplay.getUser().getMySiteGroups();
		for (Group group : sites) {
			if(group.getSite()) {
				lstUser.addAll(UserLocalServiceUtil.getGroupUsers(group.getGroupId()));
			}
		}
		
		lstUser.removeAll(lstAssignUser);

		_log.info("getUserByGroupRole unAssign list :"+lstUser.size() +" || assignList :"+lstAssignUser.size());
		
		JSONArray jsonArrayAvaiable = JSONFactoryUtil.createJSONArray();
		JSONArray jsonArrayCurrent = JSONFactoryUtil.createJSONArray();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		
		// Avaiable
		for(User us : lstUser) {
			jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("value", us.getUserId());
			jsonObject.put("name", us.getFullName() +" - " + us.getEmailAddress());
			
			jsonArrayAvaiable.put(jsonObject);
		}				
		
		// Current
		for(User us : lstAssignUser) {
			jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("value", us.getUserId());
			jsonObject.put("name", us.getFullName() +" - " + us.getEmailAddress());
			
			jsonArrayCurrent.put(jsonObject);
		}		
		jsonObject = JSONFactoryUtil.createJSONObject();
		jsonObject.put("currentUser", jsonArrayCurrent);
		jsonObject.put("avaiableUser", jsonArrayAvaiable);
		
		// write data object
		PrintWriter printWriter = resourceResponse.getWriter();
		printWriter.println(jsonObject);
		
	}
}

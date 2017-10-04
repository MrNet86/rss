package com.vnpt.portlet.user.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Role;
import com.liferay.portal.theme.ThemeDisplay;
import com.vnpt.portlet.user.model.GroupRoles;
import com.vnpt.portlet.user.model.PermissionGroup;
import com.vnpt.portlet.user.model.impl.GroupRolesImpl;
import com.vnpt.portlet.user.model.impl.PermissionGroupImpl;
import com.vnpt.portlet.user.service.GroupRolesLocalServiceUtil;
import com.vnpt.portlet.user.service.PermissionGroupLocalServiceUtil;
import com.vnpt.portlet.user.service.persistence.GroupRolesPK;
import com.vnpt.portlet.user.utils.VnptConstants;

@Controller
@RequestMapping("VIEW")
public class GroupRoleController {
	
	@RenderMapping(params="action="+VnptConstants.EDIT_GROUP_ROLE)
	public String editGroupRole (RenderRequest renderRequest, 
			RenderResponse renderResponse) throws Exception {
		// get all site of user login
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		List<Group> groups = Collections.emptyList();
		groups = themeDisplay.getUser().getGroups();		
		renderRequest.setAttribute("groups", groups);
		
		long permissionGroupId = ParamUtil.getLong(renderRequest, "permissionGroupId", 0);
		
		if(permissionGroupId > 0) {
			PermissionGroup perGroup = PermissionGroupLocalServiceUtil.getPermissionGroup(permissionGroupId);
			if(perGroup != null) {
				List<Role> lstRole = GroupRolesLocalServiceUtil.getRolesByPerGroupId(perGroup.getPermissionGroupId());
				
				renderRequest.setAttribute("perGroup", perGroup);
				renderRequest.setAttribute("lstRole", lstRole);
			}
		}
		
		return "view";
	}
	
	@ActionMapping(params="action="+VnptConstants.UPDATE_GROUP_ROLE)
	public void updateGroupRole (ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		
		Long permissionGroupId = ParamUtil.getLong(actionRequest, "permissionGroupId", 0);
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		Long userSiteId = ParamUtil.getLong(actionRequest, "userSite");
		String groupName = ParamUtil.getString(actionRequest, "groupName");
		String groupCode = ParamUtil.getString(actionRequest, "groupCode");
		String description = ParamUtil.getString(actionRequest, "description");
				
		PermissionGroup perGroup = new PermissionGroupImpl();
		if(permissionGroupId > 0) {
			perGroup = PermissionGroupLocalServiceUtil.fetchPermissionGroup(permissionGroupId);
		}
		
		perGroup.setGroupName(groupName);
		perGroup.setGroupCode(groupCode);
		perGroup.setDescription(description);
		perGroup.setIsActive(1);
		perGroup.setGroupId(userSiteId); // userSite selected
		perGroup.setCompanyId(themeDisplay.getCompanyId());
		
		perGroup = PermissionGroupLocalServiceUtil.updatePermissionGroup(perGroup);
		
		// delete old role before update
		List<Long> lstOldRole = new ArrayList<Long>();
		if(permissionGroupId > 0) {
			lstOldRole = GroupRolesLocalServiceUtil.getRolesIdByPerGroupId(permissionGroupId);
		}
		
		// Mapping permissionGroup and Role_
		GroupRoles groupRoles = null;
		String[] strRoleId = actionRequest.getParameterValues("roleId");
		long[] roles = new long[strRoleId.length] ;
		for (int i = 0; i < strRoleId.length; i++) {
			roles[i] = Long.valueOf(strRoleId[i]);
			lstOldRole.remove(roles[i]);
			
			groupRoles = new GroupRolesImpl();
			groupRoles.setRoleId(roles[i]);
			groupRoles.setPermissionGroupId(perGroup.getPermissionGroupId());
			
			GroupRolesLocalServiceUtil.updateGroupRoles(groupRoles);
		}
		
		if(!lstOldRole.isEmpty()) {
			for(Long id : lstOldRole) {
				GroupRolesPK groupRolesPK = new GroupRolesPK(permissionGroupId, id);
				GroupRolesLocalServiceUtil.deleteGroupRoles(groupRolesPK);
			}
		}
		
		SessionMessages.add(actionRequest, "update-group-role-successfull");
		actionResponse.setRenderParameter("tabs1", VnptConstants.VIEW_GROUP_ROLE);
		actionResponse.setRenderParameter("action", VnptConstants.VIEW_GROUP_ROLE);
	}
	
}

package com.vnpt.portlet.user.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.DuplicateOpenIdException;
import com.liferay.portal.DuplicateUserEmailAddressException;
import com.liferay.portal.DuplicateUserScreenNameException;
import com.liferay.portal.EmailAddressException;
import com.liferay.portal.GroupFriendlyURLException;
import com.liferay.portal.NoSuchListTypeException;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.RequiredUserException;
import com.liferay.portal.ReservedUserEmailAddressException;
import com.liferay.portal.ReservedUserScreenNameException;
import com.liferay.portal.UserEmailAddressException;
import com.liferay.portal.UserFieldException;
import com.liferay.portal.UserIdException;
import com.liferay.portal.UserPasswordException;
import com.liferay.portal.UserReminderQueryException;
import com.liferay.portal.UserScreenNameException;
import com.liferay.portal.UserSmsException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.RandomUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.ClassResolverUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassInvoker;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Address;
import com.liferay.portal.model.Contact;
import com.liferay.portal.model.EmailAddress;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Phone;
import com.liferay.portal.model.ResourcePermission;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.model.UserGroupRole;
import com.liferay.portal.model.Website;
import com.liferay.portal.security.auth.CompanyThreadLocal;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.membershippolicy.MembershipPolicyException;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.PermissionServiceUtil;
import com.liferay.portal.service.PhoneLocalServiceUtil;
import com.liferay.portal.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.RoleServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.announcements.model.AnnouncementsDelivery;
import com.liferay.portlet.usersadmin.util.UsersAdminUtil;
import com.vnpt.portlet.user.model.PermissionType;
import com.vnpt.portlet.user.model.impl.PermissionTypeImpl;
import com.vnpt.portlet.user.permission.VnptPermission;
import com.vnpt.portlet.user.service.PermissionTypeLocalServiceUtil;
import com.vnpt.portlet.user.utils.VnptConstants;

@Controller
@RequestMapping("VIEW")
public class UserController {
	
	private static final Log _log = LogFactoryUtil.getLog(UserController.class);
	
	@RenderMapping
	public String renderHomePage() {
		System.out.println("renderHomePage");
		return "view";
	}
	
	@RequestMapping(params="action="+VnptConstants.VIEW_USER)
	public String viewUserPage(RenderRequest renderRequest,
			RenderResponse renderResponse) throws Exception {
		String tabs1 = ParamUtil.getString(renderRequest, "tabs1");
		
		System.out.println("viewUserPage tabs1 :" + tabs1);
		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		List<Group> groups = Collections.emptyList();
		groups = themeDisplay.getUser().getGroups();		
		renderRequest.setAttribute("groups", groups);
		return "view";
	}
	
	@RenderMapping(params="action="+VnptConstants.EDIT_USER)
	public String editUserPage(RenderRequest renderRequest,
			RenderResponse renderResponse) throws Exception {
		System.out.println("edit user");
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		PermissionChecker permissionChecker = themeDisplay.getPermissionChecker();

		// check edit permission
		if (!VnptPermission.contains(permissionChecker, groupId, VnptConstants.USER_PER_ADMIN)) {
			SessionErrors.add(renderRequest, "use-have-not-permission");
			return "user/error_permission" ;
		}

		long userId = ParamUtil.getLong(renderRequest, "userId", 0L);
		if(userId > 0 ) {
			User user = UserLocalServiceUtil.getUser(userId);
			if(user != null) {
				renderRequest.setAttribute("user", user);
			}
		}
		System.out.println("editUserPage userId :"+userId);

		// get all site of user login
		List<Group> groups = Collections.emptyList();
		groups = themeDisplay.getUser().getGroups();		
		renderRequest.setAttribute("groups", groups);
		
		return "view";
	}
	
	@ActionMapping(params="action="+VnptConstants.UPDATE_USER)
	public void updateUserAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		
		System.out.println("updateUserAction ");
		long userId = ParamUtil.getLong(actionRequest, "userId");
		
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
				WebKeys.THEME_DISPLAY);
		
		// check permission update
		long groupId = themeDisplay.getScopeGroupId();
		PermissionChecker permissionChecker = themeDisplay.getPermissionChecker();
		
		if (!VnptPermission.contains(permissionChecker, groupId, VnptConstants.USER_PER_ADMIN)) {
			SessionErrors.add(actionRequest, "use-have-not-permission");			
		}
		else {
			
			// Input properties
			String emailAddress = ParamUtil.getString(actionRequest, "emailAddress");
			
			String fullName = ParamUtil.getString(actionRequest, "fullName");		
			String firstName = fullName.substring(0, fullName.indexOf(" ")).trim();		
			String lastName = fullName.substring(fullName.lastIndexOf(" "), fullName.length()).trim();		
			String middleName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" ")).trim();
			
			boolean male = ParamUtil.getBoolean(actionRequest, "male", true);
			
			String phoneNumber = ParamUtil.getString(actionRequest, "phoneNumber");
			
			List<Phone> phones = new ArrayList<Phone>();
			if(phoneNumber != null && !"".equals(phoneNumber)) {
				Phone phone = PhoneLocalServiceUtil.createPhone(0L);
				phone.setNumber(phoneNumber);	
				phone.setTypeId(11008); // Mobile Phone
				phone.setPrimary(true);
		
				phones.add(phone);
			}
			
			String password1 = actionRequest.getParameter("password1");
			String password2 = actionRequest.getParameter("password2");
	
			// Generate screenName from email
			String screenName = StringUtil.replace(emailAddress, "@", "");
			screenName = StringUtil.replace(screenName, "_", "");
			screenName = StringUtil.replace(screenName, "-", "");		
			screenName = RandomUtil.shuffle(screenName);
			
			String[] strGroups = actionRequest.getParameterValues("userSite");
			long[] groupIds = new long[strGroups.length] ;
			for (int i = 0; i < strGroups.length; i++) {
				groupIds[i] = Long.valueOf(strGroups[i]);
			}
			
			// Default properties 		
			int birthdayMonth = 1;
			int birthdayDay = 1;
			int birthdayYear = 1970;
			
//			long[] groupIds = UsersAdminUtil.getGroupIds(actionRequest);
			long[] organizationIds = UsersAdminUtil.getOrganizationIds(
					actionRequest);
			long[] roleIds = UsersAdminUtil.getRoleIds(actionRequest);
			long[] userGroupIds = UsersAdminUtil.getUserGroupIds(actionRequest);
			
			List<Address> addresses = new ArrayList<Address>();
			List<EmailAddress> emailAddresses = new ArrayList<EmailAddress>();		
			List<Website> websites = new ArrayList<Website>();
			List<AnnouncementsDelivery> announcementsDeliveries = new ArrayList<AnnouncementsDelivery>();
			
			boolean sendEmail = true;
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					User.class.getName(), actionRequest);
			
			// Behalf of Admin user 
			Role adminRole = RoleLocalServiceUtil.getRole(CompanyThreadLocal.getCompanyId(), "Administrator");
			List<User> adminUsers = UserLocalServiceUtil.getRoleUsers(adminRole.getRoleId());
			long userAdminId = 20159; // default@liferay.com
			if(adminUsers != null && !adminUsers.isEmpty()) {
				userAdminId = adminUsers.get(0).getUserId();
			}
			User userAdmin = UserLocalServiceUtil.getUser(userAdminId);
			PermissionChecker checker = PermissionCheckerFactoryUtil.create(userAdmin);
			PermissionThreadLocal.setPermissionChecker(checker);
			
			// end
			try {
				if(userId > 0) { // edit User
					
					User user = UserLocalServiceUtil.fetchUser(userId);
					if(user != null ) {
						Contact contact = user.getContact();					
						Calendar birthday = CalendarFactoryUtil.getCalendar();
						birthday.setTime(contact.getBirthday());
											
						String portletContext="ROOT";
						
						// get announcementsDeliveries
						String className = "com.liferay.portlet.usersadmin.action.EditUserAction";
						MethodKey mKey = new MethodKey(ClassResolverUtil.resolveByPortletClassLoader(className, portletContext), 
												"getAnnouncementsDeliveries", ActionRequest.class, User.class);
						try {
//							List<AnnouncementsDelivery> announcementsDeliveries =
//									getAnnouncementsDeliveries(actionRequest, user);
							announcementsDeliveries = (List<AnnouncementsDelivery>)PortalClassInvoker.invoke(true, mKey , actionRequest, user);						
						}
						catch (Exception ex) {
							_log.error(ex);
						}
						
						// get userGroupRoles
						List<UserGroupRole> userGroupRoles = null;
						className = "com.liferay.portlet.usersadmin.util.UsersAdminUtil";
						mKey = new MethodKey(ClassResolverUtil.resolveByPortletClassLoader(className, portletContext), 
												"getUserGroupRoles", PortletRequest.class);					
						try {
//							List<UserGroupRole> userGroupRoles = UsersAdminUtil.getUserGroupRoles(actionRequest);
							userGroupRoles = (List<UserGroupRole>)PortalClassInvoker.invoke(true, mKey , actionRequest);						
						}
						catch (Exception ex) {
							_log.error(ex);
						}
						
						// get oldPassword
						className = "com.liferay.portlet.admin.util.AdminUtil";
						mKey = new MethodKey(ClassResolverUtil.resolveByPortletClassLoader(className, portletContext), 
								"getUpdateUserPassword", ActionRequest.class, long.class);
						String oldPassword = null;
						try {
//							String oldPassword = AdminUtil.getUpdateUserPassword(
//									actionRequest, user.getUserId());
							oldPassword = (String)PortalClassInvoker.invoke(true, mKey , actionRequest, user.getUserId());						
						}
						catch (Exception ex) {
							_log.error(ex);
						}					
						
//						User user = UserServiceUtil.updateUser(
//								user.getUserId(), oldPassword, newPassword1, newPassword2,
//								passwordReset, reminderQueryQuestion, reminderQueryAnswer,
//								screenName, emailAddress, facebookId, openId, languageId,
//								timeZoneId, greeting, comments, firstName, middleName, lastName,
//								prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear,
//								smsSn, aimSn, facebookSn, icqSn, jabberSn, msnSn, mySpaceSn,
//								skypeSn, twitterSn, ymSn, jobTitle, groupIds, organizationIds,
//								roleIds, userGroupRoles, userGroupIds, addresses, emailAddresses,
//								phones, websites, announcementsDeliveries, serviceContext);
						
						user = UserServiceUtil.updateUser(
								user.getUserId(), oldPassword, null, null,
								false, user.getReminderQueryQuestion(), user.getReminderQueryAnswer(),
								user.getScreenName(), emailAddress, user.getFacebookId(), user.getOpenId(), user.getLanguageId(),
								user.getTimeZoneId(), user.getGreeting(), user.getComments(), firstName, middleName, lastName,
								contact.getPrefixId(), contact.getSuffixId(), male, birthday.MONTH, birthday.DATE, birthday.YEAR,
								contact.getSmsSn(), contact.getAimSn(), contact.getFacebookSn(), contact.getIcqSn(), contact.getJabberSn(), contact.getMsnSn(), contact.getMySpaceSn(),
								contact.getSkypeSn(), contact.getTwitterSn(), contact.getYmSn(), contact.getJobTitle(), groupIds, user.getOrganizationIds(),
								user.getRoleIds(), userGroupRoles, user.getUserGroupIds(), user.getAddresses(), user.getEmailAddresses(),
								phones, user.getWebsites(), announcementsDeliveries, serviceContext);
						
					}
				} else { // add new User
					
//					User user = UserServiceUtil.addUser(
//					themeDisplay.getCompanyId(), autoPassword, password1, password2,
//					autoScreenName, screenName, emailAddress, facebookId, openId,
//					LocaleUtil.getDefault(), firstName, middleName, lastName, prefixId,
//					suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle,
//					groupIds, organizationIds, roleIds, userGroupIds, addresses,
//					emailAddresses, phones, websites, announcementsDeliveries,
//					sendEmail, serviceContext);
					
					User user = UserServiceUtil.addUser(
							themeDisplay.getCompanyId(), true, password1, password2,
							false, screenName, emailAddress, 0, null,
							LocaleUtil.getDefault(), firstName, middleName, lastName, 0,
							0, male, birthdayMonth, birthdayDay, birthdayYear, StringPool.BLANK,
							groupIds, organizationIds, roleIds, userGroupIds, addresses,
							emailAddresses, phones, websites, announcementsDeliveries,
							sendEmail, serviceContext);
					
					// set password to login
					user = UserLocalServiceUtil.updatePassword(user.getUserId(), password1, password2, true);
				}
			}
			catch (Exception e) {
				e.printStackTrace();
				if (e instanceof NoSuchUserException ||
					e instanceof PrincipalException) {
	
					SessionErrors.add(actionRequest, e.getClass());
				}
				else if (e instanceof DuplicateOpenIdException ||
						 e instanceof DuplicateUserEmailAddressException ||					 
						 e instanceof EmailAddressException ||
						 e instanceof DuplicateUserScreenNameException ||
						 e instanceof GroupFriendlyURLException ||
						 e instanceof MembershipPolicyException ||					 
						 e instanceof RequiredUserException ||
						 e instanceof ReservedUserEmailAddressException ||
						 e instanceof ReservedUserScreenNameException ||
						 e instanceof UserEmailAddressException ||
						 e instanceof UserFieldException ||
						 e instanceof UserIdException ||
						 e instanceof UserPasswordException ||
						 e instanceof UserReminderQueryException ||
						 e instanceof UserScreenNameException ||
						 e instanceof UserSmsException) {
	
					if (e instanceof NoSuchListTypeException) {
						NoSuchListTypeException nslte = (NoSuchListTypeException)e;
	
						SessionErrors.add(
							actionRequest,
							e.getClass().getName() + nslte.getType());
					}
					else {
						SessionErrors.add(actionRequest, e.getClass(), e);
					}
				}
				else {
					SessionErrors.add(actionRequest, "add-user-exception");
				}
			}
			
			SessionMessages.add(actionRequest, "add-user-successfull");
			
		}
		
		actionResponse.setRenderParameter("tabs1", VnptConstants.EDIT_USER);
		actionResponse.setRenderParameter("action", VnptConstants.EDIT_USER);
	}
	
	@ActionMapping(params="action="+VnptConstants.DELETE_USER)
	public void deleteUserAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		long userId = ParamUtil.getLong(actionRequest, "userId", 0L);
		
		System.out.println("deleteUserAction userId :"+userId);
		if(userId > 0 ) {			
			UserServiceUtil.deleteUser(userId);
		}
		
	}
	
	@RenderMapping(params="action="+VnptConstants.EDIT_PERMISSION_TYPE)
	public String editPermissionType (RenderRequest renderRequest,
			RenderResponse renderResponse) throws Exception {
		Long permissionTypeId = ParamUtil.getLong(renderRequest, "permissionTypeId", 0L);
		if(permissionTypeId > 0) {
			PermissionType perType = PermissionTypeLocalServiceUtil.fetchPermissionType(permissionTypeId);
			if(perType != null) {
				renderRequest.setAttribute("perType", perType);
			}
		}
		
		return "view";
	}
	
	@ActionMapping(params="action="+VnptConstants.UPDATE_PERMISSION_TYPE)
	public void updatePermissionType (ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		
		System.out.println("updatePermissionType");
		Long permissionTypeId = ParamUtil.getLong(actionRequest, "permissionTypeId", 0L);
		
		String typeName = ParamUtil.getString(actionRequest, "typeName");
		String typeCode = ParamUtil.getString(actionRequest, "typeCode");
		String description = ParamUtil.getString(actionRequest, "description");
		
		PermissionType perType = new PermissionTypeImpl();
		if(permissionTypeId > 0) {
			perType = PermissionTypeLocalServiceUtil.fetchPermissionType(permissionTypeId);
			perType.setTypeName(typeName);
			perType.setTypeCode(typeCode);
			perType.setDescription(description);
			
			PermissionTypeLocalServiceUtil.updatePermissionType(perType);
		} else {
			
			perType.setTypeName(typeName);
			perType.setTypeCode(typeCode);
			perType.setDescription(description);
			perType.setIsActive(1);
			
			PermissionTypeLocalServiceUtil.addPermissionType(perType);			
		}
		
		SessionMessages.add(actionRequest, "update-successfull");
		actionResponse.setRenderParameter("tabs1", VnptConstants.EDIT_PERMISSION_TYPE);
		actionResponse.setRenderParameter("action", VnptConstants.EDIT_PERMISSION_TYPE);
	}
	
	@ActionMapping(params="action="+VnptConstants.DELETE_PERMISSION_TYPE)
	public void deletePermissionType(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		
		Long permissionTypeId = ParamUtil.getLong(actionRequest, "permissionTypeId", 0L);
		
		System.out.println("deleteUserAction permissionTypeId :"+permissionTypeId);
		if(permissionTypeId > 0 ) {			
			PermissionTypeLocalServiceUtil.deletePermissionType(permissionTypeId);
		}
		
	}
	
	@RenderMapping(params="action="+VnptConstants.EDIT_ROLE)
	public String editRole(RenderRequest renderRequest,
			RenderResponse renderResponse) throws Exception {
		System.out.println("edit user");
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
		System.out.println("editUserPage userId :"+roleId);

		return "view";
	}
	
	@ActionMapping(params="action="+VnptConstants.UPDATE_ROLE)
	public void updateRole (ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		
		System.out.println("updateRole");
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		Locale defaultLocale = PortalUtil.getSiteDefaultLocale(groupId);

		Long roleId = ParamUtil.getLong(actionRequest, "roleId", 0L);
		
		int type = ParamUtil.getInteger(actionRequest, "type");
		String name = ParamUtil.getString(actionRequest, "name");
		String title = ParamUtil.getString(actionRequest, "title");
		String description = ParamUtil.getString(actionRequest, "description");
		System.out.println("title :"+title);
		Map<Locale, String> titleMap =new HashMap<Locale, String>();
		Map<Locale, String> descriptionMap = new HashMap<Locale, String>();
		
		titleMap.put(defaultLocale, title);
		descriptionMap.put(defaultLocale, description);
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Role.class.getName(), actionRequest);

		if(roleId <= 0) {
			RoleServiceUtil.addRole(null, 0, name, titleMap, descriptionMap, 
					type, null, serviceContext);
		}
		else {
			RoleServiceUtil.updateRole(roleId, name, titleMap, descriptionMap, 
					null, serviceContext);
		}
		
		SessionMessages.add(actionRequest, "update-role-successfull");
		actionResponse.setRenderParameter("tabs1", VnptConstants.EDIT_ROLE);
		actionResponse.setRenderParameter("action", VnptConstants.EDIT_ROLE);
	}
}

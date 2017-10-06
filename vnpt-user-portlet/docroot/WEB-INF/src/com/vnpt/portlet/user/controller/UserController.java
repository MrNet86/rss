package com.vnpt.portlet.user.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

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
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.ClassResolverUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassInvoker;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Address;
import com.liferay.portal.model.Contact;
import com.liferay.portal.model.EmailAddress;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Phone;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.model.UserGroupRole;
import com.liferay.portal.model.Website;
import com.liferay.portal.security.auth.CompanyThreadLocal;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.membershippolicy.MembershipPolicyException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.PhoneLocalServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserGroupRoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.service.persistence.UserGroupRolePK;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.announcements.model.AnnouncementsDelivery;
import com.liferay.portlet.usersadmin.util.UsersAdminUtil;
import com.vnpt.portlet.user.model.ActIdUser;
import com.vnpt.portlet.user.model.impl.ActIdUserImpl;
import com.vnpt.portlet.user.permission.VnptPermission;
import com.vnpt.portlet.user.service.ActIdUserLocalServiceUtil;
import com.vnpt.portlet.user.utils.VnptConstants;

@Controller
@RequestMapping("VIEW")
public class UserController {
	
	private static final Log _log = LogFactoryUtil.getLog(UserController.class);
	
	@RenderMapping
	public String viewUser(RenderRequest renderRequest,
			RenderResponse renderResponse) throws Exception {
		String tabs1 = ParamUtil.getString(renderRequest, "tabs1");
		_log.info("viewUser tabs1 :"+tabs1);		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		List<Group> groups = Collections.emptyList();
		groups = themeDisplay.getUser().getGroups();		
		renderRequest.setAttribute("groups", groups);
		
		return "view";
	}
	
	@RenderMapping(params="tabs1="+VnptConstants.EDIT_USER)
	public String editUser (RenderRequest renderRequest, RenderResponse renderResponse) throws Exception {
		
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

		// get all site of user login
		List<Group> groups = Collections.emptyList();
		groups = themeDisplay.getUser().getGroups();		
		renderRequest.setAttribute("groups", groups);
		
		return "view";
	}
	
	@ActionMapping(params="action="+VnptConstants.UPDATE_USER)
	public void updateUserAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		
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
			
			String screenName = ParamUtil.getString(actionRequest, "screenName");
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
	
			String[] strGroups = actionRequest.getParameterValues("userSite");
			long[] groupIds = new long[strGroups.length] ;
			for (int i = 0; i < strGroups.length; i++) {
				groupIds[i] = Long.valueOf(strGroups[i]);
			}

			// if isSiteAdmin, assign user to Site Administrator
			boolean isSiteAdmin = ParamUtil.getBoolean(
					actionRequest, "isSiteAdmin");

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
			
			Role aRole = RoleLocalServiceUtil.getRole(CompanyThreadLocal.getCompanyId(), "Administrator");
			List<User> aUsers = UserLocalServiceUtil.getRoleUsers(aRole.getRoleId());			
			long aUserId = 0;
			if(aUsers != null && !aUsers.isEmpty()) {
				aUserId = aUsers.get(0).getUserId();
			}
			User userAdmin = UserLocalServiceUtil.getUser(aUserId);
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
						
						//site admin group
						Role siteAdRole = RoleLocalServiceUtil.getRole(themeDisplay.getCompanyId(), "Site Administrator");

						for (int j = 0; j < groupIds.length; j++) {
							UserGroupRolePK userGroupRolePK = new UserGroupRolePK (
								user.getUserId(), groupIds[j], siteAdRole.getRoleId());
							
							UserGroupRole userGroupRole =
								UserGroupRoleLocalServiceUtil.createUserGroupRole (
									userGroupRolePK);
							if(isSiteAdmin) {
								UserGroupRoleLocalServiceUtil.addUserGroupRole(userGroupRole);
							} else {
								UserGroupRoleLocalServiceUtil.deleteUserGroupRole(userGroupRole);
							}
						}
						
						// update actIdUser in activity
						ActIdUser actIdUser = ActIdUserLocalServiceUtil.fetchActIdUser(emailAddress);
						
						if(actIdUser == null) {
							actIdUser = new ActIdUserImpl();
						}
						
						actIdUser.setId(emailAddress);
						actIdUser.setRev(1);
						actIdUser.setFirst(firstName);
						actIdUser.setLast(lastName);
						actIdUser.setEmail(emailAddress);
						actIdUser.setPwd(emailAddress);
						
						ActIdUserLocalServiceUtil.updateActIdUser(actIdUser);
						
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
					
					//site admin group
					Role siteAdRole = RoleLocalServiceUtil.getRole(themeDisplay.getCompanyId(), "Site Administrator");

					// add Site Administrator Role
					if(isSiteAdmin) {
						for (int j = 0; j < groupIds.length; j++) {
							UserGroupRolePK userGroupRolePK = new UserGroupRolePK(
								user.getUserId(), groupIds[j], siteAdRole.getRoleId());
	
							UserGroupRole userGroupRole =
								UserGroupRoleLocalServiceUtil.createUserGroupRole(
									userGroupRolePK);
							
							UserGroupRoleLocalServiceUtil.addUserGroupRole(userGroupRole);
						}					
					}
					
					// insert actIdUser into activity db
					ActIdUser actIdUser = new ActIdUserImpl();
					actIdUser.setId(emailAddress);
					actIdUser.setRev(1);
					actIdUser.setFirst(firstName);
					actIdUser.setLast(lastName);
					actIdUser.setEmail(emailAddress);
					actIdUser.setPwd(emailAddress);
					
					ActIdUserLocalServiceUtil.addActIdUser(actIdUser);
					
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
		
		if(userId > 0 ) {			
			
			User user = UserLocalServiceUtil.fetchUser(userId);
			
			// delete actIdUser in activiti DB
			ActIdUser actIdUser = ActIdUserLocalServiceUtil.fetchActIdUser(user.getEmailAddress());
			if(actIdUser != null) {
				
			} else {
				actIdUser = new ActIdUserImpl();
			}

			// delete user
			UserServiceUtil.deleteUser(userId);
		}
		
	}

}

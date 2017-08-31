package com.vnpt.portal.user.controller;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
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
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Address;
import com.liferay.portal.model.EmailAddress;
import com.liferay.portal.model.Phone;
import com.liferay.portal.model.User;
import com.liferay.portal.model.Website;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.membershippolicy.MembershipPolicyException;
import com.liferay.portal.service.PhoneLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.announcements.model.AnnouncementsDelivery;
import com.liferay.portlet.usersadmin.util.UsersAdminUtil;
import com.vnpt.portal.user.utils.VnptConstants;

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
	public String viewUserPage() {
		System.out.println("viewUserPage");
		return "view";
	}
	
	@RenderMapping(params="action="+VnptConstants.EDIT_USER)
	public String editUserPage(RenderRequest renderRequest,
			RenderResponse renderResponse) throws Exception {
		
		long userId = ParamUtil.getLong(renderRequest, "userId", 0L);
		if(userId > 0 ) {
			User user = UserLocalServiceUtil.getUser(userId);
			if(user != null) {
				renderRequest.setAttribute("user", user);
			}
		}
		System.out.println("editUserPage userId :"+userId);
		return "view";
	}
	
	@ActionMapping(params="action="+VnptConstants.UPDATE_USER)
	public void updateUserAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		
		System.out.println("updateUserAction ");
		
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
				WebKeys.THEME_DISPLAY);
		
		// Input properties
		String emailAddress = ParamUtil.getString(actionRequest, "emailAddress");
		
		String fullName = ParamUtil.getString(actionRequest, "fullName");
		
		String firstName = fullName.substring(0, fullName.indexOf(" ")).trim();		
		String lastName = fullName.substring(fullName.lastIndexOf(" "), fullName.length()).trim();		
		String middleName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" ")).trim();
		
		System.out.println("first :"+firstName + "|| middle :"+middleName +" || last :"+lastName);
		
		int birthdayMonth = 1;
		int birthdayDay = 1;
		int birthdayYear = 1970;
	
		boolean male = ParamUtil.getBoolean(actionRequest, "male", true);
		
		String phoneNumber = ParamUtil.getString(actionRequest, "phoneNumber");
		
		List<Phone> phones = new ArrayList<Phone>();
		if(phoneNumber != null && !"".equals(phoneNumber)) {
			Phone phone = PhoneLocalServiceUtil.createPhone(0L);
			phone.setNumber(phoneNumber);	
			phone.setTypeId(11008);
			phone.setPrimary(true);
	
			phones.add(phone);
		}
		
		String password1 = actionRequest.getParameter("password1");
		String password2 = actionRequest.getParameter("password2");

		// Default properties 
		String screenName = StringUtil.replace(emailAddress, "@", "");
		screenName = StringUtil.replace(screenName, "_", "");
		screenName = StringUtil.replace(screenName, "-", "");		
		screenName = RandomUtil.shuffle(screenName);
		
		System.out.println("screenName :"+screenName);
		
		long[] groupIds = UsersAdminUtil.getGroupIds(actionRequest);
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
		
//		User user = UserServiceUtil.addUser(
//				themeDisplay.getCompanyId(), autoPassword, password1, password2,
//				autoScreenName, screenName, emailAddress, facebookId, openId,
//				LocaleUtil.getDefault(), firstName, middleName, lastName, prefixId,
//				suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle,
//				groupIds, organizationIds, roleIds, userGroupIds, addresses,
//				emailAddresses, phones, websites, announcementsDeliveries,
//				sendEmail, serviceContext);
		try {
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
			
			actionResponse.setRenderParameter("tabs1", VnptConstants.EDIT_USER);
			actionResponse.setRenderParameter("action", VnptConstants.EDIT_USER);
		}
		
		SessionMessages.add(actionRequest, "add-user-successfull");
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
}

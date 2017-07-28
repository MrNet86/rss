package com.vnpt.portal.rss.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.portlet.LiferayPortletMode;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.vnpt.portal.rss.model.RssCategory;
import com.vnpt.portal.rss.model.RssConfig;
import com.vnpt.portal.rss.model.RssFeeds;
import com.vnpt.portal.rss.model.impl.RssCategoryImpl;
import com.vnpt.portal.rss.model.impl.RssConfigImpl;
import com.vnpt.portal.rss.model.impl.RssFeedsImpl;
import com.vnpt.portal.rss.service.RssCategoryLocalServiceUtil;
import com.vnpt.portal.rss.service.RssConfigLocalServiceUtil;
import com.vnpt.portal.rss.service.RssFeedsLocalServiceUtil;
import com.vnpt.portal.rss.utils.RssConstants;

@Controller()
@RequestMapping("VIEW")
public class RssController {

	public static final String PREFERENCES_PREFIX = "preferences--";

	@RenderMapping
	public String renderHomePage() {

		return "view";
	}

	@RequestMapping(params="action="+RssConstants.CONFIG_RSS)
	public String viewConfigRss (RenderRequest request, RenderResponse response) {
		System.out.println("viewConfigRss ");

		return "view";
	}

	@RequestMapping(params="action="+RssConstants.VIEW_RSS_FEEDS)
	public String viewRssFeeds (RenderRequest request, RenderResponse response) {
		System.out.println("viewRssFeeds ");

		return "view";
	}

	@RequestMapping(params="action="+RssConstants.VIEW_RSS_WAIT_FOR_APPROVE)
	public String viewRssWait (RenderRequest request, RenderResponse response) {
		System.out.println("viewRssWait ");

		return "view";
	}

	@RequestMapping(params="action="+RssConstants.VIEW_RSS_PUBLISHED)
	public String viewRssPublished (RenderRequest request, RenderResponse response) {
		System.out.println("viewRssPublished ");

		return "view";
	}

	@ActionMapping(params="action=" + RssConstants.UPDATE_CONFIG_RSS)
	public void updateConfigRss(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		System.out.println("updateConfigRss");

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		long companyId = themeDisplay.getCompanyId();

		RssConfig rssConfig = null;
		Set<Long> rssConfigIds = new HashSet<Long>();

		int[] rowIndexes = StringUtil.split(
				ParamUtil.getString(actionRequest, "rssIndexes"), 0);
		for (int rowIndex : rowIndexes) {

			Long rssConfigId = ParamUtil.getLong(actionRequest, "rssConfigId" + rowIndex);
			String url = ParamUtil.getString(actionRequest, "url" + rowIndex);
			String title = ParamUtil.getString(actionRequest, "title" + rowIndex);
			int totalFeed = ParamUtil.getInteger(actionRequest, "totalFeed" + rowIndex, 10);
			long rssCategoryId = ParamUtil.getInteger(actionRequest, "rssCategoryId" + rowIndex, 0);
			System.out.println("rssCategoryId :"+rssCategoryId);
			if (Validator.isNull(url)) {
				continue;
			}

			// update or insert into table eportal_rss_config
			if(rssConfigId <= 0) {
				rssConfig = new RssConfigImpl();

				rssConfig.setTitle(title);
				rssConfig.setUrl(url);
				rssConfig.setTotalFeed(totalFeed);
				rssConfig.setRssCategoryId(rssCategoryId);
				
				rssConfig.setGroupId(groupId);
				rssConfig.setCompanyId(companyId);

				rssConfig = RssConfigLocalServiceUtil.addRssConfig(rssConfig);
			} else {
				rssConfig = RssConfigLocalServiceUtil.fetchRssConfig(rssConfigId);

				rssConfig.setTitle(title);
				rssConfig.setUrl(url);
				rssConfig.setTotalFeed(totalFeed);
				rssConfig.setRssCategoryId(rssCategoryId);
				
				rssConfig = RssConfigLocalServiceUtil.updateRssConfig(rssConfig);
			}

			rssConfigIds.add(rssConfig.getRssConfigId());
		}

		// delete unsaved rssConfig
		List<RssConfig> lstRssConfig = RssConfigLocalServiceUtil.getRssConfigs(-1, -1);
		for (RssConfig rssConfig2 : lstRssConfig) {
			if(!rssConfigIds.contains(rssConfig2.getRssConfigId())) {
				RssConfigLocalServiceUtil.deleteRssConfig(rssConfig2.getRssConfigId());
			}
		}

		return ;
	}

	@ActionMapping(params="action=" + RssConstants.SEND_FOR_APPROVE)
	public void sendForApprove(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {

		System.out.println("send for approve");
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		long companyId = themeDisplay.getCompanyId();

		String url = ParamUtil.getString(actionRequest, "url");
		String title = ParamUtil.getString(actionRequest, "title");
		String publishedDate = ParamUtil.getString(actionRequest, "publishedDate");
		String content = ParamUtil.getString(actionRequest, "content");
		Long rssCategoryId = ParamUtil.getLong(actionRequest, "rssCategoryId");				

		// check if url exists then do nothing
		if(RssFeedsLocalServiceUtil.checkIsExistsUrl(groupId, url)) {
			SessionErrors.add(actionRequest, "rss-feed-is-exists");
			actionResponse.setRenderParameter("tabs1", RssConstants.VIEW_RSS_FEEDS);
			return;
		}
		RssFeeds rssFeeds = new RssFeedsImpl();
		rssFeeds.setTitle(title);
		rssFeeds.setUrl(url);
		rssFeeds.setContent(content);
		rssFeeds.setRssCategoryId(rssCategoryId);

		DateFormat dateFormatDate = new SimpleDateFormat("dd/MM/yyyy");
		if(dateFormatDate != null && !"".equals(publishedDate)) {
			rssFeeds.setPublishedDate(dateFormatDate.parse(publishedDate));
		}

		rssFeeds.setStatus(0); // wait for approve

		rssFeeds.setCreatedId(themeDisplay.getUserId());
		rssFeeds.setCreatedDate(new Date());
		rssFeeds.setGroupId(groupId);
		rssFeeds.setCompanyId(companyId);

		RssFeedsLocalServiceUtil.addRssFeeds(rssFeeds);

		SessionMessages.add(actionRequest, "rss-feed-send-success");

		actionResponse.setRenderParameter("tabs1", RssConstants.VIEW_RSS_FEEDS);
	}

	@ActionMapping(params="action=" + RssConstants.PROCESS_FEED)
	public void processFeed(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {

		System.out.println("process feed");
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		int rssStatus = ParamUtil.getInteger(actionRequest, "rssStatus");
		
		String strRssFeedsIds = ParamUtil.getString(actionRequest, "rssFeedsIds");	
		if(strRssFeedsIds != null && !"".equals(strRssFeedsIds)) {
			System.out.println("strDeleteIds :"+strRssFeedsIds);
			long[] rssFeedsIds = StringUtil.split(strRssFeedsIds, 0L);
			for (long id : rssFeedsIds) {
				RssFeeds rssFeeds = RssFeedsLocalServiceUtil.fetchRssFeeds(id);
				rssFeeds.setStatus(rssStatus);
				rssFeeds.setApprovedId(themeDisplay.getUserId());
				rssFeeds.setApprovedDate(new Date());

				RssFeedsLocalServiceUtil.updateRssFeeds(rssFeeds);
			}
		}
		else {
			long rssFeedsId = ParamUtil.getLong(actionRequest, "rssFeedsId", 0);
			if(rssFeedsId > 0) {
				RssFeeds rssFeeds = RssFeedsLocalServiceUtil.fetchRssFeeds(rssFeedsId);
				rssFeeds.setStatus(rssStatus);
				rssFeeds.setApprovedId(themeDisplay.getUserId());
				rssFeeds.setApprovedDate(new Date());

				RssFeedsLocalServiceUtil.updateRssFeeds(rssFeeds);
			}

			if(rssStatus == 1) {
				SessionMessages.add(actionRequest, "rss-feed-reject");
			} else {
				SessionMessages.add(actionRequest, "rss-feed-publish-success");
			}

			actionResponse.setRenderParameter("tabs1", RssConstants.VIEW_RSS_WAIT_FOR_APPROVE);
		}
	}

	@RequestMapping(params="action="+RssConstants.CREATE_RSS_CATEGORY)
	public String createRssCategory (Model model, RenderRequest renderRequest,
			RenderResponse response) throws Exception {
		System.out.println("createRssCategory ");

		RssCategory rssCategory = new RssCategoryImpl();
		long rssCategoryId = ParamUtil.getLong(renderRequest, "rssCategoryId", 0L);
		if(rssCategoryId > 0) {
			rssCategory = RssCategoryLocalServiceUtil.fetchRssCategory(rssCategoryId);
		}

		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		PortletURL renderUrl = PortletURLFactoryUtil.create(renderRequest,
				themeDisplay.getPortletDisplay().getId(),
				themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);
		renderUrl.setWindowState(LiferayWindowState.NORMAL);
		renderUrl.setPortletMode(LiferayPortletMode.VIEW);
		renderUrl.setParameter("action", RssConstants.VIEW_RSS_CATEGORY);
		renderUrl.setParameter("tabs1", RssConstants.VIEW_RSS_CATEGORY);
		model.addAttribute("backURL", renderUrl.toString());

		model.addAttribute("rssCategory", rssCategory);
		return "/backend/edit_category";
	}
	
	@ActionMapping(params="action=" + RssConstants.UPDATE_RSS_CATEGORY)
	public void updateRssCategory(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		System.out.println("updateRssCategory");

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		long companyId = themeDisplay.getCompanyId();

		long rssCategoryId = ParamUtil.getLong(actionRequest, "rssCategoryId", 0L);
		String name = ParamUtil.getString(actionRequest, "name");
		String description = ParamUtil.getString(actionRequest, "description");

		RssCategory rssCategory = null;
		if(rssCategoryId > 0) {
			rssCategory = RssCategoryLocalServiceUtil.fetchRssCategory(rssCategoryId);
			if(rssCategory != null) {
				rssCategory.setName(name);
				rssCategory.setDescription(description);
			}

			RssCategoryLocalServiceUtil.updateRssCategory(rssCategory);
		}
		else {
			rssCategory = new RssCategoryImpl();

			rssCategory.setName(name);
			rssCategory.setDescription(description);

			rssCategory.setGroupId(groupId);
			rssCategory.setCompanyId(companyId);
			rssCategory.setCreatedId(themeDisplay.getUserId());
			rssCategory.setCreatedDate(new Date());
			rssCategory.setStatus(1);

			RssCategoryLocalServiceUtil.addRssCategory(rssCategory);
		}

		SessionMessages.add(actionRequest, "update-rss-category-success");

		actionResponse.setRenderParameter("tabs1", RssConstants.VIEW_RSS_CATEGORY);
	}

	@ActionMapping(params="action=" + RssConstants.DELETE_RSS_CATEGORY)
	public void deleteRssCategory (ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long scopeGroupId = themeDisplay.getScopeGroupId();
		
		RssCategory rssCategory = new RssCategoryImpl();
		long rssCategoryId = ParamUtil.getLong(actionRequest, "rssCategoryId", 0L);
		if(rssCategoryId > 0) {
			rssCategory = RssCategoryLocalServiceUtil.fetchRssCategory(rssCategoryId);
		}
		
		if(rssCategory != null) {
			
			// check if rssCategory is used in rssConfig or rssFeed
			if(RssCategoryLocalServiceUtil.isExistsInConfig(rssCategoryId, scopeGroupId)) {
				System.out.println("isExistsInConfig");
				SessionErrors.add(actionRequest, "error-rss-category-exists-in-config");
				actionResponse.setRenderParameter("tabs1", RssConstants.VIEW_RSS_CATEGORY);
				return;
			}
			
			if(RssCategoryLocalServiceUtil.isExistsInFeeds(rssCategoryId, scopeGroupId)) {
				System.out.println("isExistsInFeeds");
				SessionErrors.add(actionRequest, "error-rss-category-exists-in-feed");
				actionResponse.setRenderParameter("tabs1", RssConstants.VIEW_RSS_CATEGORY);
				return;
			}
			
			rssCategory.setStatus(0);
			rssCategory.setCreatedId(themeDisplay.getUserId());
			rssCategory.setCreatedDate(new Date());
			
			RssCategoryLocalServiceUtil.updateRssCategory(rssCategory);
		}
		
		SessionMessages.add(actionRequest, "delete-rss-category-success");
		actionResponse.setRenderParameter("tabs1", RssConstants.VIEW_RSS_CATEGORY);
		
	}
}

package com.vnpt.portal.rss.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.vnpt.portal.rss.model.RssConfig;
import com.vnpt.portal.rss.model.RssFeeds;
import com.vnpt.portal.rss.model.impl.RssConfigImpl;
import com.vnpt.portal.rss.model.impl.RssFeedsImpl;
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

			if (Validator.isNull(url)) {
				continue;
			}
			
			// update or insert into table eportal_rss_config
			if(rssConfigId <= 0) {
				rssConfig = new RssConfigImpl();
				
				rssConfig.setTitle(title);
				rssConfig.setUrl(url);
				
				rssConfig.setGroupId(groupId);
				rssConfig.setCompanyId(companyId);
				
				rssConfig = RssConfigLocalServiceUtil.addRssConfig(rssConfig);
			} else {
				rssConfig = RssConfigLocalServiceUtil.fetchRssConfig(rssConfigId);
				
				rssConfig.setTitle(title);
				rssConfig.setUrl(url);				
				
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
		
		RssFeeds rssFeeds = new RssFeedsImpl();
		rssFeeds.setTitle(title);
		rssFeeds.setUrl(url);
		rssFeeds.setContent(content);
		
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
		
		System.out.println("url :"+url);
		
	}
	
	@ActionMapping(params="action=" + RssConstants.PROCESS_FEED)
	public void processFeed(ActionRequest actionRequest, 
			ActionResponse actionResponse) throws Exception {
		
		System.out.println("process feed");
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		long rssFeedsId = ParamUtil.getLong(actionRequest, "rssFeedsId", 0);
		int rssStatus = ParamUtil.getInteger(actionRequest, "rssStatus");
		
		if(rssFeedsId > 0) {
			RssFeeds rssFeeds = RssFeedsLocalServiceUtil.fetchRssFeeds(rssFeedsId);
			rssFeeds.setStatus(rssStatus);
			rssFeeds.setApprovedId(themeDisplay.getUserId());
			rssFeeds.setApprovedDate(new Date());
			
			RssFeedsLocalServiceUtil.updateRssFeeds(rssFeeds);
		}
		
	}
	
}

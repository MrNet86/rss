package com.vnpt.portal.rss.controller;

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
import com.vnpt.portal.rss.model.RssConfig;
import com.vnpt.portal.rss.model.impl.RssConfigImpl;
import com.vnpt.portal.rss.service.RssConfigLocalServiceUtil;
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
	
}

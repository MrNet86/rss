package com.vnpt.portal.rss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller("rssController")
@RequestMapping("VIEW")
public class RssController {

	@RenderMapping
	public String renderHomePage() {
		
		return "view";
	}
	
}

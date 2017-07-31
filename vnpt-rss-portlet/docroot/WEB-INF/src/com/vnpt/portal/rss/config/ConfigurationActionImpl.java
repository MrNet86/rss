package com.vnpt.portal.rss.config;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;

public class ConfigurationActionImpl extends DefaultConfigurationAction {

	@Override
	public void processAction(
	    PortletConfig portletConfig, ActionRequest actionRequest,
	    ActionResponse actionResponse) throws Exception {  

	    PortletPreferences prefs = actionRequest.getPreferences();

	    String somePreferenceKey = prefs.getValue(
	        "somePreferenceKey", "true");
	    System.out.println("somePreferenceKey :" + somePreferenceKey);
	    // Add any preference processing here.
	    
	    super.processAction(portletConfig, actionRequest, actionResponse);
	}	
	
	private static Log _log = LogFactory.getLog(ConfigurationActionImpl.class);
}

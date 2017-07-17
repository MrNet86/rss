<%@page import="com.liferay.portal.kernel.sanitizer.Sanitizer"%>
<%@page import="com.liferay.portal.kernel.sanitizer.SanitizerException"%>
<%@page import="com.liferay.portal.kernel.sanitizer.SanitizerUtil"%>
<%@page import="com.sun.syndication.feed.synd.SyndContent"%>
<%@page import="com.liferay.portal.kernel.util.Http"%>
<%@page import="com.sun.syndication.feed.synd.SyndEntry"%>
<%@page import="com.liferay.portal.kernel.util.PortalClassInvoker"%>
<%@page import="com.liferay.portal.kernel.util.ClassResolverUtil"%>
<%@page import="com.liferay.portal.kernel.util.MethodKey"%>
<%@page import="com.sun.syndication.feed.synd.SyndFeed"%>
<%@ include file="../init.jsp"%>

<%
String url = StringPool.BLANK;
String title = StringPool.BLANK;

List<RssConfig> lstRssConfig = RssConfigLocalServiceUtil.searchRssConfig(-1, -1);
for(RssConfig rssConfig : lstRssConfig) {
	url = rssConfig.getUrl();
	title = rssConfig.getTitle();
	System.out.println("url :"+url +" || title :"+title);

%>

<%-- 	<%@ include file="feed.jspf" %> --%>

<%
}
%>

<%
List<SyndEntry> lstResults = new ArrayList<SyndEntry>();
for(RssConfig rssConfig : lstRssConfig) {
	url = rssConfig.getUrl();
	title = rssConfig.getTitle();

	// get syndFeed from url
	SyndFeed feed = null;
	final String className = "com.liferay.portlet.rss.util.RSSUtil";
	String portletContext="ROOT";
	MethodKey mKey = new MethodKey(ClassResolverUtil.resolveByPortletClassLoader(className, portletContext), "getFeed", String.class);
	try {
		ObjectValuePair ovp = (ObjectValuePair)PortalClassInvoker.invoke(true, mKey , url);

		feed = (SyndFeed)ovp.getValue();

		// get base url from feedLink
		String baseURL = null;
		String feedLink = feed.getLink();
		if(Validator.isNull(feedLink) || !HttpUtil.hasDomain(feedLink)) {
			baseURL = HttpUtil.getProtocol(url)
						.concat(Http.PROTOCOL_DELIMITER).concat(HttpUtil.getDomain(url));
			if(Validator.isNotNull(feedLink)){
				feedLink = baseURL.concat(feedLink);
			}
			else {
				feedLink = baseURL;
			}
		}
		else {
			baseURL = HttpUtil.getProtocol(feedLink).concat(Http.PROTOCOL_DELIMITER)
						.concat(HttpUtil.getDomain(feedLink));
		}
		
		// get feed entry
		List entries = feed.getEntries();
		for(int i = 0; i < entries.size(); i++) {
			SyndEntry entry = (SyndEntry) entries.get(i);
			
			String entryLink = entry.getLink();

			if (Validator.isNotNull(entryLink) && !HttpUtil.hasDomain(entryLink)) {
				entryLink = baseURL + entryLink;
				entry.setLink(entryLink);
			}
			
			SyndContent content = entry.getDescription();
			List contents = new ArrayList();

			if (content == null) {
				contents = entry.getContents();
			}
			else {
				contents.add(content);
			}
			for (int k = 0; k < contents.size(); k++) {
				content = (SyndContent)contents.get(k);

				if ((content != null) && Validator.isNotNull(content.getValue())) {
					String value = StringUtil.replace(
						content.getValue(),
						new String[] {
							"src=\"/",
							"href=\"/"
						},
						new String[] {
							"src=\"" + baseURL + "/",
							"href=\"" + baseURL + "/"
						});

					String sanitizedValue = null;

					try {
						sanitizedValue = SanitizerUtil.sanitize(company.getCompanyId(), scopeGroupId, user.getUserId(), null, 0, ContentTypes.TEXT_HTML, Sanitizer.MODE_XSS, value, null);
					}
					catch (SanitizerException se) {
						sanitizedValue = StringPool.BLANK;
					}
					
					entry.setAuthor(sanitizedValue);
				}
			}
			
			
			lstResults.add(entry); 
		}
		
	}
	catch (Exception e) {
		System.out.println("Exception eee :"+e.getMessage());
	}

	
}

PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setParameter("action", RssConstants.CONFIG_RSS);
portletURL.setParameter("tab", "view-rss-feeds");	
%>
<aui:form action="<%= portletURL.toString() %>" method="post" name="name">
	<liferay-ui:search-container>
		<liferay-ui:search-container-results
			results="<%= lstResults %>"
			total="<%= lstResults.size() %>"
		/>
		
		<liferay-ui:search-container-row
			className="com.sun.syndication.feed.synd.SyndEntry"
			modelVar="aSyndFeed"
		>
			
			<liferay-ui:search-container-column-text 
				name="title"
				value="<%= HtmlUtil.escape(aSyndFeed.getTitle()) %>"
				href="<%= _escapeJavaScriptLink(aSyndFeed.getLink()) %>"
				target="_blank"
			/>
			
			<liferay-ui:search-container-column-text 
				name="publicDate"
				value='<%= aSyndFeed.getPublishedDate() != null ? dateFormatDateTime.format(aSyndFeed.getPublishedDate()) : ""%>'
			/>
			
			<liferay-ui:search-container-column-text 
				name="description"
				value='<%= aSyndFeed.getAuthor() != null ? aSyndFeed.getAuthor() : ""%>'
			/>
			
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator />
		
	</liferay-ui:search-container>	
</aui:form>

<%!
private String _escapeJavaScriptLink(String link) {
	if (Validator.isNull(link)) {
		return StringPool.BLANK;
	}

	if (link.indexOf(StringPool.COLON) == 10) {
		String protocol = StringUtil.toLowerCase(link.substring(0, 10));

		if (protocol.equals("javascript")) {
			link = StringUtil.replaceFirst(link, StringPool.COLON, "%3a");
		}
	}

	return link;
}
%>
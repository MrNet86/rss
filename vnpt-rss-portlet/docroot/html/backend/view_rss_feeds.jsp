<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
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
int totalFeed = 10;
int size = 0;

List<RssConfig> lstRssConfig = RssConfigLocalServiceUtil.searchRssConfig(-1, -1);

List<SyndEntry> lstResults = new ArrayList<SyndEntry>();
for(RssConfig rssConfig : lstRssConfig) {
	url = rssConfig.getUrl();
	title = rssConfig.getTitle();		
	totalFeed = rssConfig.getTotalFeed();
	
	// get syndFeed from url
	SyndFeed feed = null;
	final String className = "com.liferay.portlet.rss.util.RSSUtil";
	String portletContext="ROOT";
	MethodKey mKey = new MethodKey(ClassResolverUtil.resolveByPortletClassLoader(className, portletContext), "getFeed", String.class);
	try {
		ObjectValuePair ovp = (ObjectValuePair)PortalClassInvoker.invoke(true, mKey , url);

		feed = (SyndFeed)ovp.getValue();

		// set title
		if(Validator.isNull(title)) {
			title = feed.getTitle();
		}

		// get base url from feedLink
		String baseURL = null;
		String feedLink = feed.getLink();
		if(Validator.isNull(feedLink) || !HttpUtil.hasDomain(feedLink)) {
			baseURL = HttpUtil.getProtocol(url)
						.concat(Http.PROTOCOL_DELIMITER).concat(HttpUtil.getDomain(url));
			if(Validator.isNotNull(feedLink)) {
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
		size = (entries.size() > totalFeed) ? totalFeed : entries.size(); 
		
		for(int i = 0; i < size ; i++) {
			SyndEntry entry = (SyndEntry) entries.get(i);

			// set rss resource to title
			entry.setUri(title);

			String entryLink = entry.getLink();

			if (Validator.isNotNull(entryLink) && !HttpUtil.hasDomain(entryLink)) {
				entryLink = baseURL + entryLink;
				entry.setLink(entryLink);
			}

			// get feed content
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

					// set feed content to author
					entry.setAuthor(sanitizedValue);
				}
			}

			lstResults.add(entry);
		}

	}
	catch (NullPointerException e) {
		System.out.println("Exception eee :"+e.getMessage());
	%>
		<font color="red">
			<liferay-ui:message key="rss-cannot-parse" /> : <%= url %>
			<br/>
			<br/>
		</font>
	<%
	}
	catch (Exception ex) {}
}

PortletURL portletURL = (PortletURL)request.getAttribute("view.jsp-portletURL");
System.out.println("view_rss_feeds.jsp portletURL :"+portletURL);

%>
<liferay-ui:error key="rss-feed-is-exists" message="rss-feed-is-exists"/>

<liferay-ui:success key="rss-feed-send-success" message="rss-feed-send-success"/>

<aui:form action="<%= portletURL.toString() %>" method="post" name="name">

	<liferay-ui:search-container delta="20">
		<liferay-ui:search-container-results>
		<%
			results = ListUtil.subList(lstResults, searchContainer.getStart(),
                searchContainer.getEnd());

			if(lstResults.size()<searchContainer.getEnd()){
	            results = ListUtil.subList(lstResults, searchContainer.getStart(),
	            		lstResults.size());
	            total = lstResults.size();
	        } else{
	            results = ListUtil.subList(lstResults, searchContainer.getStart(),
	                    searchContainer.getEnd());
	            total = lstResults.size();
	        }

	        pageContext.setAttribute("results", results);
	        pageContext.setAttribute("total", total);
		%>
		</liferay-ui:search-container-results>

		<liferay-ui:search-container-row
			className="com.sun.syndication.feed.synd.SyndEntry"
			modelVar="aSyndFeed"
		>

			<liferay-ui:search-container-column-text
				name="rss-source"
				value="<%= HtmlUtil.escape(aSyndFeed.getUri()) %>"
			/>

			<liferay-ui:search-container-column-text
				name="rss-title"
				value="<%= HtmlUtil.escape(aSyndFeed.getTitle()) %>"
				href="<%= _escapeJavaScriptLink(aSyndFeed.getLink()) %>"
				target="_blank"
			/>

			<liferay-ui:search-container-column-text
				name="rss-publishedDate"
				value='<%= aSyndFeed.getPublishedDate() != null ? dateFormatDate.format(aSyndFeed.getPublishedDate()) : ""%>'
			/>

			<liferay-ui:search-container-column-text
				name="rss-content"
				value='<%= aSyndFeed.getAuthor() != null ? aSyndFeed.getAuthor() : ""%>'
			/>

			<liferay-ui:search-container-column-jsp
				align="center"
				path="/html/backend/action_feed.jsp"
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
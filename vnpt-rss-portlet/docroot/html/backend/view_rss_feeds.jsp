<%@page import="com.vnpt.portal.rss.model.impl.RssFeedsImpl"%>
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

List<RssFeeds> lstResults = new ArrayList<RssFeeds>();
RssFeeds rssFeeds = null;

int indexRow = 0;

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
			rssFeeds = new RssFeedsImpl();

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

					// set feed content
					rssFeeds.setContent(sanitizedValue);
				}
			}

			// set rssFeeds
			rssFeeds.setTitle(entry.getTitle());
			rssFeeds.setUrl(entryLink);
			rssFeeds.setDescription(title);
			rssFeeds.setPublishedDate(entry.getPublishedDate());
			rssFeeds.setRssFeedsId(indexRow);
			indexRow ++;
			
			lstResults.add(rssFeeds);
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

List<RssCategory> lstCategory = RssCategoryLocalServiceUtil.searchRssCategory(-1, -1, scopeGroupId);

%>
<liferay-ui:error key="rss-feed-is-exists" message="rss-feed-is-exists"/>

<liferay-ui:success key="rss-feed-send-success" message="rss-feed-send-success"/>

<portlet:actionURL var="sendURL">
	<portlet:param name="action" value="<%= RssConstants.SEND_FOR_APPROVE %>" />
</portlet:actionURL>

<aui:form action="<%= sendURL %>" method="post" name="fm">

	<liferay-ui:search-container 
		searchContainer="<%= new RssFeedsSearch(renderRequest, portletURL) %>"
		rowChecker="<%= new RowChecker(renderResponse) %>"
	>
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
			className="com.vnpt.portal.rss.model.RssFeeds"
			modelVar="aRssFeed"
			keyProperty="rssFeedsId"
		>
			<aui:input name="sendId" type="hidden"/>
			
			<liferay-ui:search-container-column-text
				name="rss-source"
				value="<%= HtmlUtil.escape(aRssFeed.getDescription()) %>"
			/>

			<liferay-ui:search-container-column-text
				name="rss-title"
				value="<%= HtmlUtil.escape(aRssFeed.getTitle()) %>"
				href="<%= _escapeJavaScriptLink(aRssFeed.getUrl()) %>"
				target="_blank"
			/>

			<liferay-ui:search-container-column-text
				name="rss-publishedDate"
				value='<%= aRssFeed.getPublishedDate() != null ? dateFormatDate.format(aRssFeed.getPublishedDate()) : ""%>'
			/>

			<liferay-ui:search-container-column-text
				name="rss-content"
				value='<%= aRssFeed.getContent() != null ? aRssFeed.getContent() : ""%>'
			/>

			<liferay-ui:search-container-column-text
				name="rss-content"
			>
				<select name="<portlet:namespace />rssCategoryId" id="<portlet:namespace />rssCategoryId" >
				  <%
					for(RssCategory rssCategory : lstCategory) {
					%>
						<option value="<%= rssCategory.getRssCategoryId() %>"><%= rssCategory.getName() %></option>
					<%}%>
				</select>
			</liferay-ui:search-container-column-text>
			
			<%-- <liferay-ui:search-container-column-jsp
				name="rss-category"
				align="center"
				path="/html/backend/select_category.jsp"
			/> --%>

			<liferay-ui:search-container-column-jsp
				align="center"
				path="/html/backend/action_feed.jsp"
			/>

		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator />

	</liferay-ui:search-container>
	
	<aui:button value="sendApprove"
                onClick='<%= renderResponse.getNamespace() + "sendApprove();" %>' />
</aui:form>

<aui:script>
Liferay.provide(
    window,
    '<portlet:namespace />sendApprove',
    function() {
    	var checkBoxValue = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
    	
     	if(checkBoxValue==""||checkBoxValue==null){
	    	alert('<%= UnicodeLanguageUtil.get(pageContext, "Please select atleast one student to assign") %>');
	     	return false;
     	}
     	if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "Are you sure you want to assign the selected students? ") %>')) {
	     	document.<portlet:namespace />fm.<portlet:namespace />sendId.value = checkBoxValue;
	     	submitForm(document.<portlet:namespace />fm, "<%= sendURL %>");                
     	}
   	},
    ['liferay-util-list-fields']
);
</aui:script>

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
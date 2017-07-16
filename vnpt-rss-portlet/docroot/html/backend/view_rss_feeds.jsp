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

	<%@ include file="feed.jspf" %>

<%
}
%>
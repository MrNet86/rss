<%@ include file="../init.jsp" %>

<%
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

RssFeeds feed = (RssFeeds)row.getObject();
feed.setRssCategoryId(5);
List<RssCategory> lstCategory = RssCategoryLocalServiceUtil.getRssCategories(-1, -1);
System.out.println("lstCategory :"+lstCategory.size());
%>
<select name="rssCategoryId" id="rssCategoryId" >
  <%
	for(RssCategory rssCategory : lstCategory) {
	%>
		<option value="<%= rssCategory.getRssCategoryId() %>"><%= rssCategory.getName() %></option>
	<%}%>
</select>
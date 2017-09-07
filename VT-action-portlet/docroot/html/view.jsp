<%@ include file="init.jsp" %>



<%--
<div class="row">
	<div class="col-md-12">		
		<div class="row">
            <div class="col-md-2 col-sm-3 col-xs-12">
                <label for="#"><liferay-ui:message key="email"/></label>
            </div>
            <div class="col-md-4 col-sm-9 col-xs-12">
                <aui:input type="text" name="emailAddress" label="" cssClass="form-control" >
					<aui:validator name="required" />
					<aui:validator name="email"/>
				</aui:input>
            </div> 
            
            <div class="col-md-2 col-sm-3 col-xs-12">
                <label for="#"><liferay-ui:message key="ho-va-ten"/></label>
            </div>
            <div class="col-md-4 col-sm-9 col-xs-12">
                <aui:input type="text" name="fullName" label="" cssClass="form-control" >
					<aui:validator name="required" />
					<aui:validator name="custom" errorMessage="ho-va-ten-khong-hop-le" >
						function (val) {
							if(val.trim().indexOf(" ") > -1) {
								return true;
							} else {
								return false;
							}
						}
					</aui:validator> 
				</aui:input>
            </div> 
        </div>	
	</div>		
</div>
  --%>
 
<portlet:actionURL var="updateURL" >
	<portlet:param name="action" value="submitForm"/>
</portlet:actionURL>
 
<aui:button-row>
	<aui:button onClick='<%= renderResponse.getNamespace() + "processAction();" %>' type="submit" />
</aui:button-row>
	 
 
 <aui:script>

	function <portlet:namespace />processAction() {
		
		Liferay.fire('_submitAction', {});
		
	}
	
	var arr = "";
	
	Liferay.on('_callBackAction',function(event) {
		
		var user_form = event.user_form;
		var user_namespace = event.user_namespace;
		
		var rss_form = event.rss_form;
		
		if(user_form != 'undefined' && user_form != null && user_form != "") {
			var emailAddress = user_form._vnptuser_WAR_vnptuserportlet_emailAddress;	
			console.log("emailAddress =  " + emailAddress);
			console.log("user_namespace :" + user_namespace);
			
			$.ajax({
				   url: '<%= updateURL.toString() %>',
				   data: {
					   <portlet:namespace />namespace : user_namespace,
				       <portlet:namespace />user_form : JSON.stringify(user_form)
				   },
				   error: function() {
				     // $('#info').html('<p>An error has occurred</p>');
				   },
				   dataType: 'jsonp',
				   success: function(data) {
				     console.log("success");
				   },
				   type: 'POST'
				});
		}
	});
	
	
	
</aui:script>
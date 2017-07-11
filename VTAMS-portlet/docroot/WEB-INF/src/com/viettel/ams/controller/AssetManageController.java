package com.viettel.ams.controller;

import java.util.Date;
import java.util.Random;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.viettel.ams.common.CommonUtils;
import com.viettel.ams.core.model.AssetManageReq;
import com.viettel.ams.core.model.AssetManageReqEntity;
import com.viettel.ams.core.model.SysGroup;
import com.viettel.ams.core.model.impl.AssetManageReqEntityImpl;
import com.viettel.ams.core.model.impl.AssetManageReqImpl;
import com.viettel.ams.core.service.AssetManageReqEntityLocalServiceUtil;
import com.viettel.ams.core.service.AssetManageReqLocalServiceUtil;
import com.viettel.ams.core.service.SysGroupLocalServiceUtil;
import com.viettel.ams.utils.ActionConstants;

@Controller
@RequestMapping(value = "VIEW")
public class AssetManageController {

	@RenderMapping(params="action="+ActionConstants.EDIT_MANAGE_REQ)
	public String editManageReq (Model model, RenderRequest request,
			RenderResponse response) throws Exception {
		System.out.println("editManageReq ");
		AssetManageReq manageReq = new AssetManageReqImpl();
		long id = ParamUtil.getLong(request, "manageReqId", 0L);
		System.out.println("edit manageReqId :"+id);
		if(id > 0) {
			manageReq = AssetManageReqLocalServiceUtil.getAssetManageReq(id);

			SysGroup sysGroup = null;
			if(manageReq.getReqGroupId() != 0) {
				sysGroup = SysGroupLocalServiceUtil.getSysGroup(manageReq.getReqGroupId());
				if(sysGroup != null){
					request.setAttribute("reqGroupName", sysGroup.getName());
					System.out.println("reqGroupName :"+sysGroup.getName());
				}
			}
			if(manageReq.getRecvGroupId() != 0) {
				sysGroup = SysGroupLocalServiceUtil.getSysGroup(manageReq.getRecvGroupId());
				if(sysGroup != null){
					request.setAttribute("recvGroupName", sysGroup.getName());
				}
			}

		}

		model.addAttribute("manageReq", manageReq);
		return "assetManage/editManageReq";
	}

	@ActionMapping(params = "action=" + ActionConstants.UPDATE_MANAGE_REQ)
	public void updateManageReq(ActionRequest request, ActionResponse response)
			throws Exception {
		System.out.println("updateManageReq");
		AssetManageReq assetManageReq = new AssetManageReqImpl();

		Long manageReqId = ParamUtil.getLong(request, "manageReqId", 0L);
		if(manageReqId > 0){
			assetManageReq = AssetManageReqLocalServiceUtil.getAssetManageReq(manageReqId);
		}
		System.out.println("updateManageReq manageReqId :"+manageReqId);
		// Get parameter from request
		String document = ParamUtil.getString(request, "document");
		Long reqGroupId = ParamUtil.getLong(request, "reqGroupId", 0L);
		String delegator = ParamUtil.getString(request, "delegator");
		String titleDelegator = ParamUtil.getString(request, "titleDelegator");
		Long mobileNumber = ParamUtil.getLong(request, "mobileNumber", 0L);
		Long recvGroupId = ParamUtil.getLong(request, "recvGroupId", 0L);
		Long retrieveCauseId = ParamUtil
				.getLong(request, "retrieveCauseId", 0L);
		Long type = ParamUtil.getLong(request, "type", 0L);

		// create AssetManageReq
		assetManageReq.setDocument(document);
		assetManageReq.setReqGroupId(reqGroupId);
		assetManageReq.setDelegator(delegator);
		assetManageReq.setTitleDelegator(titleDelegator);
		assetManageReq.setMobileNumber(mobileNumber);
		assetManageReq.setRecvGroupId(recvGroupId);
		assetManageReq.setRetrieveCauseId(retrieveCauseId);
		assetManageReq.setType(type);

		// default properties
		assetManageReq.setStatus(1L);
		assetManageReq.setCreatedDate(new Date());
		assetManageReq.setCreatorId(CommonUtils.getUserId(request));

		// random code generator
		Random rnd = new Random();
		assetManageReq.setCode(String.valueOf(rnd.nextInt(999999999)));

		AssetManageReq obj = AssetManageReqLocalServiceUtil.addAssetManageReq(assetManageReq);

		System.out.println("manageReqId :"+obj.getPrimaryKey()+" || id :"+obj.getManageReqId());

		// insert merchandise into AssetManageReqEntity
		long[] merIds = getLongArray(request, "merEntityExtsSearchContainerPrimaryKeys");
		System.out.println("merIds :"+merIds);

		String[] strMerId = request.getParameterValues("merId");
		String[] strReqCount = request.getParameterValues("reqCount");
//		String[] strDescription = request.getParameterValues("description");
		String[] strDescription = ParamUtil.getParameterValues(request, "description");
		System.out.println("strDescription :"+strDescription);

		Long merId = 0L;
		Double reqCount = 0D;
		String description;
		if (strMerId != null) {
			for (int i = 0; i < strMerId.length; i++) {
				merId = Long.valueOf(strMerId[i]);
				reqCount = Double.valueOf(strReqCount[i]);
				description = strDescription[i];
				System.out.println("reqCount :" + reqCount
						+ "|| merId :" + merId +" || des :"+description);
				insertAssetManageReqEntity(obj, merId, reqCount,
						description);
			}
		}

		// redirect to render view
		response.setRenderParameter("action",
				ActionConstants.VIEW_ALL_MANAGE_REQ);
	}

	private void insertAssetManageReqEntity(AssetManageReq assetManageReq,
			Long merId, Double reqCount, String description) throws Exception {
		// TODO Auto-generated method stub
		AssetManageReqEntity reqEntity = new AssetManageReqEntityImpl();
		reqEntity.setReqId(assetManageReq.getManageReqId());
		reqEntity.setMerEntityId(merId);
		reqEntity.setQuantity(reqCount);
		reqEntity.setDescription(description);
		reqEntity.setGroupId(assetManageReq.getReqGroupId());
		reqEntity.setTimeRetrieve(new Date());

		AssetManageReqEntityLocalServiceUtil
				.updateAssetManageReqEntity(reqEntity);
	}

	protected long[] getLongArray(PortletRequest portletRequest, String name) {
		String value = portletRequest.getParameter(name);

		if (value == null) {
			return null;
		}

		return StringUtil.split(GetterUtil.getString(value), 0L);
	}

}

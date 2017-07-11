package com.viettel.ams.controller;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.viettel.ams.utils.ActionConstants;

@Controller
@RequestMapping(value="VIEW")
public class AmsController {

	@RenderMapping
    public String viewHome (RenderRequest request, RenderResponse response) {
		System.out.println("AmsController viewHome");

		return "assetManage/viewManage";
    }

	@RenderMapping(params="action="+ActionConstants.VIEW_MANAGE)
	public String viewManage (RenderRequest request, RenderResponse response) {
		System.out.println("viewManage ");

		return "assetManage/viewManage";
	}

	@RenderMapping(params="action="+ActionConstants.VIEW_ALL_MANAGE_REQ)
	public String viewAllManageReq (RenderRequest request, RenderResponse response) {
		System.out.println("viewAllManageReq ");

		return "assetManage/viewManage";
	}

	@RenderMapping(params="action="+ActionConstants.CREATE_MANAGE_REQ)
	public String createManageReq (RenderRequest request, RenderResponse response) {
		System.out.println("createManageReq ");

		return "assetManage/viewManage";
	}

	@RenderMapping(params="action=select_sys_group")
	public String selectSysGroup (RenderRequest request, RenderResponse response) {
		System.out.println("selectSysGroup ");

		return "assetManage/select_sys_group";
	}

	@RenderMapping(params="action="+ActionConstants.SELECT_MER_ENTITY)
	public String selectMerEntity (RenderRequest request, RenderResponse response) {
		System.out.println("selectMerEntity");

		return "merEntity/select_mer_entity";
	}

}

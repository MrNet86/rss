package com.viettel.ams.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.viettel.ams.utils.ActionConstants;

@Controller
@RequestMapping(value="VIEW")
public class AssetMoveController {

//	@RenderMapping(params="action=" + ActionConstants.VIEW_ASSET_MOVE)
//	public String viewMove(RenderRequest request, RenderResponse response) {
//		System.out.println("viewMove");
//
//		request.setAttribute("tab", "AssetMove");
//		request.setAttribute("abc", "AssetMove");
//		return "viewHome";
//	}
}

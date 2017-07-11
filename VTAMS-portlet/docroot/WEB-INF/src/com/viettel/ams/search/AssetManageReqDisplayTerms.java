package com.viettel.ams.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;

public class AssetManageReqDisplayTerms extends DisplayTerms {

	public static final String CODE = "code";
	public static final String REQ_GROUP_ID = "reqGroupId";
	public static final String RECV_GROUP_ID = "recvGroupId";
	public static final String STATUS = "status";

	protected String code;
	protected Long reqGroupId;
	protected Long recvGroupId;
	protected String status;

	public AssetManageReqDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);
		code = ParamUtil.getString(portletRequest, CODE);
		reqGroupId = ParamUtil.getLong(portletRequest, REQ_GROUP_ID);
		recvGroupId = ParamUtil.getLong(portletRequest, RECV_GROUP_ID);
		status = ParamUtil.getString(portletRequest, STATUS);

	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getReqGroupId() {
		return reqGroupId;
	}

	public void setReqGroupId(Long reqGroupId) {
		this.reqGroupId = reqGroupId;
	}

	public Long getRecvGroupId() {
		return recvGroupId;
	}

	public void setRecvGroupId(Long recvGroupId) {
		this.recvGroupId = recvGroupId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

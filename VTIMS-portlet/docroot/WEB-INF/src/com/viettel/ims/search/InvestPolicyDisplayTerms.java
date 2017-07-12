package com.viettel.ims.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;

public class InvestPolicyDisplayTerms extends DisplayTerms {

	public static final String INFO_POLICY_TYPE = "infoPolicyType";
	public static final String INFO_POLICY_NAME = "infoPolicyName";
	public static final String INFO_PROPOSE_GROUP_ID = "infoProposeGroupId";
	public static final String INFO_PROPOSE_GROUP_NAME = "infoProposeGroupName";
	public static final String INFO_VERIFY_GROUP_ID = "infoVerifyGroupId";
	public static final String INFO_VERIFY_GROUP_NAME = "infoVerifyGroupName";
	public static final String IS_ACTIVE = "isActive";

	protected String infoPolicyType;
	protected String infoPolicyName;
	protected long infoProposeGroupId;
	protected String infoProposeGroupName;
	protected long infoVerifyGroupId;
	protected String infoVerifyGroupName;
	protected long isActive;

	public InvestPolicyDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);
		infoPolicyType = ParamUtil.getString(portletRequest, INFO_POLICY_TYPE);
		infoPolicyName = ParamUtil.getString(portletRequest, INFO_POLICY_NAME);
		infoProposeGroupId = ParamUtil.getLong(portletRequest, INFO_PROPOSE_GROUP_ID);
		infoProposeGroupName = ParamUtil.getString(portletRequest, INFO_PROPOSE_GROUP_NAME);
		infoVerifyGroupId = ParamUtil.getLong(portletRequest, INFO_VERIFY_GROUP_ID);
		infoVerifyGroupName = ParamUtil.getString(portletRequest, INFO_VERIFY_GROUP_NAME);
		isActive = ParamUtil.getLong(portletRequest, IS_ACTIVE);
	}

	public String getInfoPolicyType() {
		return infoPolicyType;
	}

	public void setInfoPolicyType(String infoPolicyType) {
		this.infoPolicyType = infoPolicyType;
	}

	public String getInfoPolicyName() {
		return infoPolicyName;
	}

	public void setInfoPolicyName(String infoPolicyName) {
		this.infoPolicyName = infoPolicyName;
	}

	public Long getInfoProposeGroupId() {
		return infoProposeGroupId;
	}

	public void setInfoProposeGroupId(Long infoProposeGroupId) {
		this.infoProposeGroupId = infoProposeGroupId;
	}

	public Long getInfoVerifyGroupId() {
		return infoVerifyGroupId;
	}

	public void setInfoVerifyGroupId(Long infoVerifyGroupId) {
		this.infoVerifyGroupId = infoVerifyGroupId;
	}

	public long getIsActive() {
		return isActive;
	}

	public void setIsActive(long isActive) {
		this.isActive = isActive;
	}

	public String getInfoProposeGroupName() {
		return infoProposeGroupName;
	}

	public void setInfoProposeGroupName(String infoProposeGroupName) {
		this.infoProposeGroupName = infoProposeGroupName;
	}

	public String getInfoVerifyGroupName() {
		return infoVerifyGroupName;
	}

	public void setInfoVerifyGroupName(String infoVerifyGroupName) {
		this.infoVerifyGroupName = infoVerifyGroupName;
	}

}

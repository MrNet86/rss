package com.viettel.ams.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;

public class SysGroupDisplayTerms extends DisplayTerms {

	public static final String NAME = "name";
	public static final String GROUP_CODE = "groupCode";
	public static final String IS_ACTIVE = "isActive";

	protected String name;
	protected String groupCode;
	protected long isActive;

	public SysGroupDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);
		name = ParamUtil.getString(portletRequest, NAME);
		groupCode = ParamUtil.getString(portletRequest, GROUP_CODE);
		isActive = ParamUtil.getLong(portletRequest, IS_ACTIVE);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public long getIsActive() {
		return isActive;
	}

	public void setIsActive(long isActive) {
		this.isActive = isActive;
	}

}

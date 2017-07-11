package com.viettel.ams.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;

public class MerEntityDisplayTerms extends DisplayTerms {

	public static String MER_NAME = "merName";
	public static String MER_CODE = "merCode";
	public static String SERIAL_NUMBER = "serialNumber";
	public static String GROUP_NAME = "groupName";
	public static String GROUP_ID = "groupId";

	protected String merName;
	protected String merCode;
	protected String serialNumber;
	protected String groupName;
	protected long groupId;

	public MerEntityDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);
		// TODO Auto-generated constructor stub
		merName = ParamUtil.getString(portletRequest, MER_NAME);
		merCode = ParamUtil.getString(portletRequest, MER_CODE);
		serialNumber = ParamUtil.getString(portletRequest, SERIAL_NUMBER);
		groupName = ParamUtil.getString(portletRequest, GROUP_NAME);
		groupId = ParamUtil.getLong(portletRequest, GROUP_ID);
	}

	public String getMerName() {
		return merName;
	}

	public void setMerName(String merName) {
		this.merName = merName;
	}

	public String getMerCode() {
		return merCode;
	}

	public void setMerCode(String merCode) {
		this.merCode = merCode;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


}

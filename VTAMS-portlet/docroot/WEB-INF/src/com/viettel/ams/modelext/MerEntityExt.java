package com.viettel.ams.modelext;

import com.viettel.ams.core.model.impl.MerEntityImpl;

public class MerEntityExt extends MerEntityImpl {

	private String merName;
	private String merCode;
	private String groupName;
	private String groupCode;
	private String stationCode;
	private String warehouseName;
	private String warehouseCode;
	private String constructionName;
	private String constructionCode;
	private String statusName;

	private Double reqCount;
	private String reqDescription;
	private Long manageReqId;

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
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupCode() {
		return groupCode;
	}
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
	public String getStationCode() {
		return stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	public String getWarehouseCode() {
		return warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getConstructionName() {
		return constructionName;
	}
	public void setConstructionName(String constructionName) {
		this.constructionName = constructionName;
	}
	public String getConstructionCode() {
		return constructionCode;
	}
	public void setConstructionCode(String constructionCode) {
		this.constructionCode = constructionCode;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public Double getReqCount() {
		return reqCount;
	}
	public void setReqCount(Double reqCount) {
		this.reqCount = reqCount;
	}
	public String getReqDescription() {
		return reqDescription;
	}
	public void setReqDescription(String reqDescription) {
		this.reqDescription = reqDescription;
	}
	public Long getManageReqId() {
		return manageReqId;
	}
	public void setManageReqId(Long manageReqId) {
		this.manageReqId = manageReqId;
	}


}

package com.viettel.ams.modelext;

import com.viettel.ams.core.model.impl.AssetManageReqImpl;

public class AssetManageReqExt extends AssetManageReqImpl {

	private String reqGroupName;
	private String recvGroupName;
	private String createdName;
	public String getReqGroupName() {
		return reqGroupName;
	}
	public void setReqGroupName(String reqGroupName) {
		this.reqGroupName = reqGroupName;
	}
	public String getRecvGroupName() {
		return recvGroupName;
	}
	public void setRecvGroupName(String recvGroupName) {
		this.recvGroupName = recvGroupName;
	}
	public String getCreatedName() {
		return createdName;
	}
	public void setCreatedName(String createdName) {
		this.createdName = createdName;
	}


}

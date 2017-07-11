/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.viettel.ams.core.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SysGroup}.
 * </p>
 *
 * @author MrNet
 * @see SysGroup
 * @generated
 */
public class SysGroupWrapper implements SysGroup, ModelWrapper<SysGroup> {
	public SysGroupWrapper(SysGroup sysGroup) {
		_sysGroup = sysGroup;
	}

	@Override
	public Class<?> getModelClass() {
		return SysGroup.class;
	}

	@Override
	public String getModelClassName() {
		return SysGroup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("groupId", getGroupId());
		attributes.put("name", getName());
		attributes.put("groupCode", getGroupCode());
		attributes.put("fullName", getFullName());
		attributes.put("description", getDescription());
		attributes.put("provinceId", getProvinceId());
		attributes.put("address", getAddress());
		attributes.put("parentId", getParentId());
		attributes.put("path", getPath());
		attributes.put("status", getStatus());
		attributes.put("titleName", getTitleName());
		attributes.put("isOff", getIsOff());
		attributes.put("lockStatus", getLockStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String groupCode = (String)attributes.get("groupCode");

		if (groupCode != null) {
			setGroupCode(groupCode);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long provinceId = (Long)attributes.get("provinceId");

		if (provinceId != null) {
			setProvinceId(provinceId);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		Long parentId = (Long)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}

		String path = (String)attributes.get("path");

		if (path != null) {
			setPath(path);
		}

		Long status = (Long)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long titleName = (Long)attributes.get("titleName");

		if (titleName != null) {
			setTitleName(titleName);
		}

		Long isOff = (Long)attributes.get("isOff");

		if (isOff != null) {
			setIsOff(isOff);
		}

		Long lockStatus = (Long)attributes.get("lockStatus");

		if (lockStatus != null) {
			setLockStatus(lockStatus);
		}
	}

	/**
	* Returns the primary key of this sys group.
	*
	* @return the primary key of this sys group
	*/
	@Override
	public long getPrimaryKey() {
		return _sysGroup.getPrimaryKey();
	}

	/**
	* Sets the primary key of this sys group.
	*
	* @param primaryKey the primary key of this sys group
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_sysGroup.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the group ID of this sys group.
	*
	* @return the group ID of this sys group
	*/
	@Override
	public long getGroupId() {
		return _sysGroup.getGroupId();
	}

	/**
	* Sets the group ID of this sys group.
	*
	* @param groupId the group ID of this sys group
	*/
	@Override
	public void setGroupId(long groupId) {
		_sysGroup.setGroupId(groupId);
	}

	/**
	* Returns the name of this sys group.
	*
	* @return the name of this sys group
	*/
	@Override
	public java.lang.String getName() {
		return _sysGroup.getName();
	}

	/**
	* Sets the name of this sys group.
	*
	* @param name the name of this sys group
	*/
	@Override
	public void setName(java.lang.String name) {
		_sysGroup.setName(name);
	}

	/**
	* Returns the group code of this sys group.
	*
	* @return the group code of this sys group
	*/
	@Override
	public java.lang.String getGroupCode() {
		return _sysGroup.getGroupCode();
	}

	/**
	* Sets the group code of this sys group.
	*
	* @param groupCode the group code of this sys group
	*/
	@Override
	public void setGroupCode(java.lang.String groupCode) {
		_sysGroup.setGroupCode(groupCode);
	}

	/**
	* Returns the full name of this sys group.
	*
	* @return the full name of this sys group
	*/
	@Override
	public java.lang.String getFullName() {
		return _sysGroup.getFullName();
	}

	/**
	* Sets the full name of this sys group.
	*
	* @param fullName the full name of this sys group
	*/
	@Override
	public void setFullName(java.lang.String fullName) {
		_sysGroup.setFullName(fullName);
	}

	/**
	* Returns the description of this sys group.
	*
	* @return the description of this sys group
	*/
	@Override
	public java.lang.String getDescription() {
		return _sysGroup.getDescription();
	}

	/**
	* Sets the description of this sys group.
	*
	* @param description the description of this sys group
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_sysGroup.setDescription(description);
	}

	/**
	* Returns the province ID of this sys group.
	*
	* @return the province ID of this sys group
	*/
	@Override
	public java.lang.Long getProvinceId() {
		return _sysGroup.getProvinceId();
	}

	/**
	* Sets the province ID of this sys group.
	*
	* @param provinceId the province ID of this sys group
	*/
	@Override
	public void setProvinceId(java.lang.Long provinceId) {
		_sysGroup.setProvinceId(provinceId);
	}

	/**
	* Returns the address of this sys group.
	*
	* @return the address of this sys group
	*/
	@Override
	public java.lang.String getAddress() {
		return _sysGroup.getAddress();
	}

	/**
	* Sets the address of this sys group.
	*
	* @param address the address of this sys group
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_sysGroup.setAddress(address);
	}

	/**
	* Returns the parent ID of this sys group.
	*
	* @return the parent ID of this sys group
	*/
	@Override
	public java.lang.Long getParentId() {
		return _sysGroup.getParentId();
	}

	/**
	* Sets the parent ID of this sys group.
	*
	* @param parentId the parent ID of this sys group
	*/
	@Override
	public void setParentId(java.lang.Long parentId) {
		_sysGroup.setParentId(parentId);
	}

	/**
	* Returns the path of this sys group.
	*
	* @return the path of this sys group
	*/
	@Override
	public java.lang.String getPath() {
		return _sysGroup.getPath();
	}

	/**
	* Sets the path of this sys group.
	*
	* @param path the path of this sys group
	*/
	@Override
	public void setPath(java.lang.String path) {
		_sysGroup.setPath(path);
	}

	/**
	* Returns the status of this sys group.
	*
	* @return the status of this sys group
	*/
	@Override
	public java.lang.Long getStatus() {
		return _sysGroup.getStatus();
	}

	/**
	* Sets the status of this sys group.
	*
	* @param status the status of this sys group
	*/
	@Override
	public void setStatus(java.lang.Long status) {
		_sysGroup.setStatus(status);
	}

	/**
	* Returns the title name of this sys group.
	*
	* @return the title name of this sys group
	*/
	@Override
	public java.lang.Long getTitleName() {
		return _sysGroup.getTitleName();
	}

	/**
	* Sets the title name of this sys group.
	*
	* @param titleName the title name of this sys group
	*/
	@Override
	public void setTitleName(java.lang.Long titleName) {
		_sysGroup.setTitleName(titleName);
	}

	/**
	* Returns the is off of this sys group.
	*
	* @return the is off of this sys group
	*/
	@Override
	public java.lang.Long getIsOff() {
		return _sysGroup.getIsOff();
	}

	/**
	* Sets the is off of this sys group.
	*
	* @param isOff the is off of this sys group
	*/
	@Override
	public void setIsOff(java.lang.Long isOff) {
		_sysGroup.setIsOff(isOff);
	}

	/**
	* Returns the lock status of this sys group.
	*
	* @return the lock status of this sys group
	*/
	@Override
	public java.lang.Long getLockStatus() {
		return _sysGroup.getLockStatus();
	}

	/**
	* Sets the lock status of this sys group.
	*
	* @param lockStatus the lock status of this sys group
	*/
	@Override
	public void setLockStatus(java.lang.Long lockStatus) {
		_sysGroup.setLockStatus(lockStatus);
	}

	@Override
	public boolean isNew() {
		return _sysGroup.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_sysGroup.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _sysGroup.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sysGroup.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _sysGroup.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _sysGroup.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sysGroup.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sysGroup.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_sysGroup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_sysGroup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sysGroup.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SysGroupWrapper((SysGroup)_sysGroup.clone());
	}

	@Override
	public int compareTo(com.viettel.ams.core.model.SysGroup sysGroup) {
		return _sysGroup.compareTo(sysGroup);
	}

	@Override
	public int hashCode() {
		return _sysGroup.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.viettel.ams.core.model.SysGroup> toCacheModel() {
		return _sysGroup.toCacheModel();
	}

	@Override
	public com.viettel.ams.core.model.SysGroup toEscapedModel() {
		return new SysGroupWrapper(_sysGroup.toEscapedModel());
	}

	@Override
	public com.viettel.ams.core.model.SysGroup toUnescapedModel() {
		return new SysGroupWrapper(_sysGroup.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sysGroup.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sysGroup.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sysGroup.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SysGroupWrapper)) {
			return false;
		}

		SysGroupWrapper sysGroupWrapper = (SysGroupWrapper)obj;

		if (Validator.equals(_sysGroup, sysGroupWrapper._sysGroup)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public SysGroup getWrappedSysGroup() {
		return _sysGroup;
	}

	@Override
	public SysGroup getWrappedModel() {
		return _sysGroup;
	}

	@Override
	public void resetOriginalValues() {
		_sysGroup.resetOriginalValues();
	}

	private SysGroup _sysGroup;
}
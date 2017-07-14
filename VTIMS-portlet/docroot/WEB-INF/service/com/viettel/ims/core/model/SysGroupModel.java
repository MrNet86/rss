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

package com.viettel.ims.core.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the SysGroup service. Represents a row in the &quot;Sys_Group&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.viettel.ims.core.model.impl.SysGroupModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.viettel.ims.core.model.impl.SysGroupImpl}.
 * </p>
 *
 * @author MrNet
 * @see SysGroup
 * @see com.viettel.ims.core.model.impl.SysGroupImpl
 * @see com.viettel.ims.core.model.impl.SysGroupModelImpl
 * @generated
 */
public interface SysGroupModel extends BaseModel<SysGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sys group model instance should use the {@link SysGroup} interface instead.
	 */

	/**
	 * Returns the primary key of this sys group.
	 *
	 * @return the primary key of this sys group
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sys group.
	 *
	 * @param primaryKey the primary key of this sys group
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the group ID of this sys group.
	 *
	 * @return the group ID of this sys group
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this sys group.
	 *
	 * @param groupId the group ID of this sys group
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the name of this sys group.
	 *
	 * @return the name of this sys group
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this sys group.
	 *
	 * @param name the name of this sys group
	 */
	public void setName(String name);

	/**
	 * Returns the group code of this sys group.
	 *
	 * @return the group code of this sys group
	 */
	@AutoEscape
	public String getGroupCode();

	/**
	 * Sets the group code of this sys group.
	 *
	 * @param groupCode the group code of this sys group
	 */
	public void setGroupCode(String groupCode);

	/**
	 * Returns the full name of this sys group.
	 *
	 * @return the full name of this sys group
	 */
	@AutoEscape
	public String getFullName();

	/**
	 * Sets the full name of this sys group.
	 *
	 * @param fullName the full name of this sys group
	 */
	public void setFullName(String fullName);

	/**
	 * Returns the description of this sys group.
	 *
	 * @return the description of this sys group
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this sys group.
	 *
	 * @param description the description of this sys group
	 */
	public void setDescription(String description);

	/**
	 * Returns the province ID of this sys group.
	 *
	 * @return the province ID of this sys group
	 */
	public long getProvinceId();

	/**
	 * Sets the province ID of this sys group.
	 *
	 * @param provinceId the province ID of this sys group
	 */
	public void setProvinceId(long provinceId);

	/**
	 * Returns the address of this sys group.
	 *
	 * @return the address of this sys group
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this sys group.
	 *
	 * @param address the address of this sys group
	 */
	public void setAddress(String address);

	/**
	 * Returns the parent ID of this sys group.
	 *
	 * @return the parent ID of this sys group
	 */
	public long getParentId();

	/**
	 * Sets the parent ID of this sys group.
	 *
	 * @param parentId the parent ID of this sys group
	 */
	public void setParentId(long parentId);

	/**
	 * Returns the path of this sys group.
	 *
	 * @return the path of this sys group
	 */
	@AutoEscape
	public String getPath();

	/**
	 * Sets the path of this sys group.
	 *
	 * @param path the path of this sys group
	 */
	public void setPath(String path);

	/**
	 * Returns the status of this sys group.
	 *
	 * @return the status of this sys group
	 */
	public long getStatus();

	/**
	 * Sets the status of this sys group.
	 *
	 * @param status the status of this sys group
	 */
	public void setStatus(long status);

	/**
	 * Returns the title name of this sys group.
	 *
	 * @return the title name of this sys group
	 */
	public long getTitleName();

	/**
	 * Sets the title name of this sys group.
	 *
	 * @param titleName the title name of this sys group
	 */
	public void setTitleName(long titleName);

	/**
	 * Returns the is off of this sys group.
	 *
	 * @return the is off of this sys group
	 */
	public long getIsOff();

	/**
	 * Sets the is off of this sys group.
	 *
	 * @param isOff the is off of this sys group
	 */
	public void setIsOff(long isOff);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.viettel.ims.core.model.SysGroup sysGroup);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.viettel.ims.core.model.SysGroup> toCacheModel();

	@Override
	public com.viettel.ims.core.model.SysGroup toEscapedModel();

	@Override
	public com.viettel.ims.core.model.SysGroup toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
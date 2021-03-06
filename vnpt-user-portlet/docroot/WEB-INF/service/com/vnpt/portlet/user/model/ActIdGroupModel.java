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

package com.vnpt.portlet.user.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ActIdGroup service. Represents a row in the &quot;act_id_group&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vnpt.portlet.user.model.impl.ActIdGroupModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vnpt.portlet.user.model.impl.ActIdGroupImpl}.
 * </p>
 *
 * @author ToanNQ86
 * @see ActIdGroup
 * @see com.vnpt.portlet.user.model.impl.ActIdGroupImpl
 * @see com.vnpt.portlet.user.model.impl.ActIdGroupModelImpl
 * @generated
 */
public interface ActIdGroupModel extends BaseModel<ActIdGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a act ID group model instance should use the {@link ActIdGroup} interface instead.
	 */

	/**
	 * Returns the primary key of this act ID group.
	 *
	 * @return the primary key of this act ID group
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this act ID group.
	 *
	 * @param primaryKey the primary key of this act ID group
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the ID of this act ID group.
	 *
	 * @return the ID of this act ID group
	 */
	@AutoEscape
	public String getId();

	/**
	 * Sets the ID of this act ID group.
	 *
	 * @param id the ID of this act ID group
	 */
	public void setId(String id);

	/**
	 * Returns the rev of this act ID group.
	 *
	 * @return the rev of this act ID group
	 */
	public long getRev();

	/**
	 * Sets the rev of this act ID group.
	 *
	 * @param rev the rev of this act ID group
	 */
	public void setRev(long rev);

	/**
	 * Returns the name of this act ID group.
	 *
	 * @return the name of this act ID group
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this act ID group.
	 *
	 * @param name the name of this act ID group
	 */
	public void setName(String name);

	/**
	 * Returns the type of this act ID group.
	 *
	 * @return the type of this act ID group
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this act ID group.
	 *
	 * @param type the type of this act ID group
	 */
	public void setType(String type);

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
	public int compareTo(com.vnpt.portlet.user.model.ActIdGroup actIdGroup);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.vnpt.portlet.user.model.ActIdGroup> toCacheModel();

	@Override
	public com.vnpt.portlet.user.model.ActIdGroup toEscapedModel();

	@Override
	public com.vnpt.portlet.user.model.ActIdGroup toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
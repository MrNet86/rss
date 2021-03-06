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

package com.viettel.ams.core.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.viettel.ams.core.model.SysGroup;
import com.viettel.ams.core.model.SysGroupModel;
import com.viettel.ams.core.model.SysGroupSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the SysGroup service. Represents a row in the &quot;Sys_Group&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.viettel.ams.core.model.SysGroupModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SysGroupImpl}.
 * </p>
 *
 * @author MrNet
 * @see SysGroupImpl
 * @see com.viettel.ams.core.model.SysGroup
 * @see com.viettel.ams.core.model.SysGroupModel
 * @generated
 */
@JSON(strict = true)
public class SysGroupModelImpl extends BaseModelImpl<SysGroup>
	implements SysGroupModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sys group model instance should use the {@link com.viettel.ams.core.model.SysGroup} interface instead.
	 */
	public static final String TABLE_NAME = "Sys_Group";
	public static final Object[][] TABLE_COLUMNS = {
			{ "group_id", Types.BIGINT },
			{ "NAME", Types.VARCHAR },
			{ "group_code", Types.VARCHAR },
			{ "full_name", Types.VARCHAR },
			{ "DESCRIPTION", Types.VARCHAR },
			{ "province_id", Types.BIGINT },
			{ "address", Types.VARCHAR },
			{ "parent_id", Types.BIGINT },
			{ "path", Types.VARCHAR },
			{ "STATUS", Types.BIGINT },
			{ "TITLE_NAME", Types.BIGINT },
			{ "IS_OFF", Types.BIGINT },
			{ "lock_status", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table Sys_Group (group_id LONG not null primary key,NAME VARCHAR(75) null,group_code VARCHAR(75) null,full_name VARCHAR(75) null,DESCRIPTION VARCHAR(75) null,province_id LONG,address VARCHAR(75) null,parent_id LONG,path VARCHAR(75) null,STATUS LONG,TITLE_NAME LONG,IS_OFF LONG,lock_status LONG)";
	public static final String TABLE_SQL_DROP = "drop table Sys_Group";
	public static final String ORDER_BY_JPQL = " ORDER BY sysGroup.groupCode ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Sys_Group.group_code ASC";
	public static final String DATA_SOURCE = "amsDataSource";
	public static final String SESSION_FACTORY = "amsSessionFactory";
	public static final String TX_MANAGER = "amsTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.viettel.ams.core.model.SysGroup"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.viettel.ams.core.model.SysGroup"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.viettel.ams.core.model.SysGroup"),
			true);
	public static long GROUPCODE_COLUMN_BITMASK = 1L;
	public static long NAME_COLUMN_BITMASK = 2L;
	public static long PATH_COLUMN_BITMASK = 4L;
	public static long STATUS_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static SysGroup toModel(SysGroupSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		SysGroup model = new SysGroupImpl();

		model.setGroupId(soapModel.getGroupId());
		model.setName(soapModel.getName());
		model.setGroupCode(soapModel.getGroupCode());
		model.setFullName(soapModel.getFullName());
		model.setDescription(soapModel.getDescription());
		model.setProvinceId(soapModel.getProvinceId());
		model.setAddress(soapModel.getAddress());
		model.setParentId(soapModel.getParentId());
		model.setPath(soapModel.getPath());
		model.setStatus(soapModel.getStatus());
		model.setTitleName(soapModel.getTitleName());
		model.setIsOff(soapModel.getIsOff());
		model.setLockStatus(soapModel.getLockStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<SysGroup> toModels(SysGroupSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<SysGroup> models = new ArrayList<SysGroup>(soapModels.length);

		for (SysGroupSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.viettel.ams.core.model.SysGroup"));

	public SysGroupModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _groupId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setGroupId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _groupId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask |= NAME_COLUMN_BITMASK;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@JSON
	@Override
	public String getGroupCode() {
		if (_groupCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _groupCode;
		}
	}

	@Override
	public void setGroupCode(String groupCode) {
		_columnBitmask = -1L;

		if (_originalGroupCode == null) {
			_originalGroupCode = _groupCode;
		}

		_groupCode = groupCode;
	}

	public String getOriginalGroupCode() {
		return GetterUtil.getString(_originalGroupCode);
	}

	@JSON
	@Override
	public String getFullName() {
		if (_fullName == null) {
			return StringPool.BLANK;
		}
		else {
			return _fullName;
		}
	}

	@Override
	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	@Override
	public Long getProvinceId() {
		return _provinceId;
	}

	@Override
	public void setProvinceId(Long provinceId) {
		_provinceId = provinceId;
	}

	@JSON
	@Override
	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		_address = address;
	}

	@JSON
	@Override
	public Long getParentId() {
		return _parentId;
	}

	@Override
	public void setParentId(Long parentId) {
		_parentId = parentId;
	}

	@JSON
	@Override
	public String getPath() {
		if (_path == null) {
			return StringPool.BLANK;
		}
		else {
			return _path;
		}
	}

	@Override
	public void setPath(String path) {
		_columnBitmask |= PATH_COLUMN_BITMASK;

		if (_originalPath == null) {
			_originalPath = _path;
		}

		_path = path;
	}

	public String getOriginalPath() {
		return GetterUtil.getString(_originalPath);
	}

	@JSON
	@Override
	public Long getStatus() {
		return _status;
	}

	@Override
	public void setStatus(Long status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public Long getOriginalStatus() {
		return _originalStatus;
	}

	@JSON
	@Override
	public Long getTitleName() {
		return _titleName;
	}

	@Override
	public void setTitleName(Long titleName) {
		_titleName = titleName;
	}

	@JSON
	@Override
	public Long getIsOff() {
		return _isOff;
	}

	@Override
	public void setIsOff(Long isOff) {
		_isOff = isOff;
	}

	@JSON
	@Override
	public Long getLockStatus() {
		return _lockStatus;
	}

	@Override
	public void setLockStatus(Long lockStatus) {
		_lockStatus = lockStatus;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			SysGroup.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SysGroup toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SysGroup)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SysGroupImpl sysGroupImpl = new SysGroupImpl();

		sysGroupImpl.setGroupId(getGroupId());
		sysGroupImpl.setName(getName());
		sysGroupImpl.setGroupCode(getGroupCode());
		sysGroupImpl.setFullName(getFullName());
		sysGroupImpl.setDescription(getDescription());
		sysGroupImpl.setProvinceId(getProvinceId());
		sysGroupImpl.setAddress(getAddress());
		sysGroupImpl.setParentId(getParentId());
		sysGroupImpl.setPath(getPath());
		sysGroupImpl.setStatus(getStatus());
		sysGroupImpl.setTitleName(getTitleName());
		sysGroupImpl.setIsOff(getIsOff());
		sysGroupImpl.setLockStatus(getLockStatus());

		sysGroupImpl.resetOriginalValues();

		return sysGroupImpl;
	}

	@Override
	public int compareTo(SysGroup sysGroup) {
		int value = 0;

		value = getGroupCode().compareTo(sysGroup.getGroupCode());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SysGroup)) {
			return false;
		}

		SysGroup sysGroup = (SysGroup)obj;

		long primaryKey = sysGroup.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		SysGroupModelImpl sysGroupModelImpl = this;

		sysGroupModelImpl._originalName = sysGroupModelImpl._name;

		sysGroupModelImpl._originalGroupCode = sysGroupModelImpl._groupCode;

		sysGroupModelImpl._originalPath = sysGroupModelImpl._path;

		sysGroupModelImpl._originalStatus = sysGroupModelImpl._status;

		sysGroupModelImpl._setOriginalStatus = false;

		sysGroupModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SysGroup> toCacheModel() {
		SysGroupCacheModel sysGroupCacheModel = new SysGroupCacheModel();

		sysGroupCacheModel.groupId = getGroupId();

		sysGroupCacheModel.name = getName();

		String name = sysGroupCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			sysGroupCacheModel.name = null;
		}

		sysGroupCacheModel.groupCode = getGroupCode();

		String groupCode = sysGroupCacheModel.groupCode;

		if ((groupCode != null) && (groupCode.length() == 0)) {
			sysGroupCacheModel.groupCode = null;
		}

		sysGroupCacheModel.fullName = getFullName();

		String fullName = sysGroupCacheModel.fullName;

		if ((fullName != null) && (fullName.length() == 0)) {
			sysGroupCacheModel.fullName = null;
		}

		sysGroupCacheModel.description = getDescription();

		String description = sysGroupCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			sysGroupCacheModel.description = null;
		}

		sysGroupCacheModel.provinceId = getProvinceId();

		sysGroupCacheModel.address = getAddress();

		String address = sysGroupCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			sysGroupCacheModel.address = null;
		}

		sysGroupCacheModel.parentId = getParentId();

		sysGroupCacheModel.path = getPath();

		String path = sysGroupCacheModel.path;

		if ((path != null) && (path.length() == 0)) {
			sysGroupCacheModel.path = null;
		}

		sysGroupCacheModel.status = getStatus();

		sysGroupCacheModel.titleName = getTitleName();

		sysGroupCacheModel.isOff = getIsOff();

		sysGroupCacheModel.lockStatus = getLockStatus();

		return sysGroupCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{groupId=");
		sb.append(getGroupId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", groupCode=");
		sb.append(getGroupCode());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", provinceId=");
		sb.append(getProvinceId());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", parentId=");
		sb.append(getParentId());
		sb.append(", path=");
		sb.append(getPath());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", titleName=");
		sb.append(getTitleName());
		sb.append(", isOff=");
		sb.append(getIsOff());
		sb.append(", lockStatus=");
		sb.append(getLockStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.viettel.ams.core.model.SysGroup");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupCode</column-name><column-value><![CDATA[");
		sb.append(getGroupCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>provinceId</column-name><column-value><![CDATA[");
		sb.append(getProvinceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentId</column-name><column-value><![CDATA[");
		sb.append(getParentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>path</column-name><column-value><![CDATA[");
		sb.append(getPath());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>titleName</column-name><column-value><![CDATA[");
		sb.append(getTitleName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isOff</column-name><column-value><![CDATA[");
		sb.append(getIsOff());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lockStatus</column-name><column-value><![CDATA[");
		sb.append(getLockStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = SysGroup.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			SysGroup.class
		};
	private long _groupId;
	private String _name;
	private String _originalName;
	private String _groupCode;
	private String _originalGroupCode;
	private String _fullName;
	private String _description;
	private Long _provinceId;
	private String _address;
	private Long _parentId;
	private String _path;
	private String _originalPath;
	private Long _status;
	private Long _originalStatus;
	private boolean _setOriginalStatus;
	private Long _titleName;
	private Long _isOff;
	private Long _lockStatus;
	private long _columnBitmask;
	private SysGroup _escapedModel;
}
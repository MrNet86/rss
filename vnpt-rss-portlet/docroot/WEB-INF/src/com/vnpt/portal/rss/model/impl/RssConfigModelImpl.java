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

package com.vnpt.portal.rss.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.vnpt.portal.rss.model.RssConfig;
import com.vnpt.portal.rss.model.RssConfigModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the RssConfig service. Represents a row in the &quot;eportal_rss_config&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vnpt.portal.rss.model.RssConfigModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RssConfigImpl}.
 * </p>
 *
 * @author MrNet
 * @see RssConfigImpl
 * @see com.vnpt.portal.rss.model.RssConfig
 * @see com.vnpt.portal.rss.model.RssConfigModel
 * @generated
 */
public class RssConfigModelImpl extends BaseModelImpl<RssConfig>
	implements RssConfigModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a rss config model instance should use the {@link com.vnpt.portal.rss.model.RssConfig} interface instead.
	 */
	public static final String TABLE_NAME = "eportal_rss_config";
	public static final Object[][] TABLE_COLUMNS = {
			{ "rssConfigId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "title", Types.VARCHAR },
			{ "url", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table eportal_rss_config (rssConfigId LONG not null primary key,groupId LONG,companyId LONG,title VARCHAR(75) null,url VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table eportal_rss_config";
	public static final String ORDER_BY_JPQL = " ORDER BY rssConfig.rssConfigId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY eportal_rss_config.rssConfigId ASC";
	public static final String DATA_SOURCE = "eGovDataSource";
	public static final String SESSION_FACTORY = "eGovSessionFactory";
	public static final String TX_MANAGER = "eGovTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vnpt.portal.rss.model.RssConfig"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vnpt.portal.rss.model.RssConfig"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vnpt.portal.rss.model.RssConfig"));

	public RssConfigModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _rssConfigId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRssConfigId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _rssConfigId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return RssConfig.class;
	}

	@Override
	public String getModelClassName() {
		return RssConfig.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("rssConfigId", getRssConfigId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("title", getTitle());
		attributes.put("url", getUrl());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long rssConfigId = (Long)attributes.get("rssConfigId");

		if (rssConfigId != null) {
			setRssConfigId(rssConfigId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}
	}

	@Override
	public long getRssConfigId() {
		return _rssConfigId;
	}

	@Override
	public void setRssConfigId(long rssConfigId) {
		_rssConfigId = rssConfigId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@Override
	public String getUrl() {
		if (_url == null) {
			return StringPool.BLANK;
		}
		else {
			return _url;
		}
	}

	@Override
	public void setUrl(String url) {
		_url = url;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			RssConfig.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public RssConfig toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (RssConfig)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		RssConfigImpl rssConfigImpl = new RssConfigImpl();

		rssConfigImpl.setRssConfigId(getRssConfigId());
		rssConfigImpl.setGroupId(getGroupId());
		rssConfigImpl.setCompanyId(getCompanyId());
		rssConfigImpl.setTitle(getTitle());
		rssConfigImpl.setUrl(getUrl());

		rssConfigImpl.resetOriginalValues();

		return rssConfigImpl;
	}

	@Override
	public int compareTo(RssConfig rssConfig) {
		long primaryKey = rssConfig.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RssConfig)) {
			return false;
		}

		RssConfig rssConfig = (RssConfig)obj;

		long primaryKey = rssConfig.getPrimaryKey();

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
	}

	@Override
	public CacheModel<RssConfig> toCacheModel() {
		RssConfigCacheModel rssConfigCacheModel = new RssConfigCacheModel();

		rssConfigCacheModel.rssConfigId = getRssConfigId();

		rssConfigCacheModel.groupId = getGroupId();

		rssConfigCacheModel.companyId = getCompanyId();

		rssConfigCacheModel.title = getTitle();

		String title = rssConfigCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			rssConfigCacheModel.title = null;
		}

		rssConfigCacheModel.url = getUrl();

		String url = rssConfigCacheModel.url;

		if ((url != null) && (url.length() == 0)) {
			rssConfigCacheModel.url = null;
		}

		return rssConfigCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{rssConfigId=");
		sb.append(getRssConfigId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.vnpt.portal.rss.model.RssConfig");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>rssConfigId</column-name><column-value><![CDATA[");
		sb.append(getRssConfigId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = RssConfig.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			RssConfig.class
		};
	private long _rssConfigId;
	private long _groupId;
	private long _companyId;
	private String _title;
	private String _url;
	private RssConfig _escapedModel;
}
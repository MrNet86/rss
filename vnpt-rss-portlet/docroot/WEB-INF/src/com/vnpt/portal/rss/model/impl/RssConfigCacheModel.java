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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.vnpt.portal.rss.model.RssConfig;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RssConfig in entity cache.
 *
 * @author MrNet
 * @see RssConfig
 * @generated
 */
public class RssConfigCacheModel implements CacheModel<RssConfig>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{rssConfigId=");
		sb.append(rssConfigId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", title=");
		sb.append(title);
		sb.append(", url=");
		sb.append(url);
		sb.append(", totalFeed=");
		sb.append(totalFeed);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RssConfig toEntityModel() {
		RssConfigImpl rssConfigImpl = new RssConfigImpl();

		rssConfigImpl.setRssConfigId(rssConfigId);
		rssConfigImpl.setGroupId(groupId);
		rssConfigImpl.setCompanyId(companyId);

		if (title == null) {
			rssConfigImpl.setTitle(StringPool.BLANK);
		}
		else {
			rssConfigImpl.setTitle(title);
		}

		if (url == null) {
			rssConfigImpl.setUrl(StringPool.BLANK);
		}
		else {
			rssConfigImpl.setUrl(url);
		}

		rssConfigImpl.setTotalFeed(totalFeed);

		rssConfigImpl.resetOriginalValues();

		return rssConfigImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		rssConfigId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		title = objectInput.readUTF();
		url = objectInput.readUTF();
		totalFeed = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(rssConfigId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}

		objectOutput.writeInt(totalFeed);
	}

	public long rssConfigId;
	public long groupId;
	public long companyId;
	public String title;
	public String url;
	public int totalFeed;
}
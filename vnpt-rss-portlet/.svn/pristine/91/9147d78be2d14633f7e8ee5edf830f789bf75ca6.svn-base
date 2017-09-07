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

import com.vnpt.portal.rss.model.RssFeeds;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RssFeeds in entity cache.
 *
 * @author MrNet
 * @see RssFeeds
 * @generated
 */
public class RssFeedsCacheModel implements CacheModel<RssFeeds>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{rssFeedsId=");
		sb.append(rssFeedsId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", title=");
		sb.append(title);
		sb.append(", url=");
		sb.append(url);
		sb.append(", description=");
		sb.append(description);
		sb.append(", content=");
		sb.append(content);
		sb.append(", author=");
		sb.append(author);
		sb.append(", publishedDate=");
		sb.append(publishedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", createdId=");
		sb.append(createdId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", approvedId=");
		sb.append(approvedId);
		sb.append(", approvedDate=");
		sb.append(approvedDate);
		sb.append(", rssCategoryId=");
		sb.append(rssCategoryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RssFeeds toEntityModel() {
		RssFeedsImpl rssFeedsImpl = new RssFeedsImpl();

		rssFeedsImpl.setRssFeedsId(rssFeedsId);
		rssFeedsImpl.setGroupId(groupId);
		rssFeedsImpl.setCompanyId(companyId);

		if (title == null) {
			rssFeedsImpl.setTitle(StringPool.BLANK);
		}
		else {
			rssFeedsImpl.setTitle(title);
		}

		if (url == null) {
			rssFeedsImpl.setUrl(StringPool.BLANK);
		}
		else {
			rssFeedsImpl.setUrl(url);
		}

		if (description == null) {
			rssFeedsImpl.setDescription(StringPool.BLANK);
		}
		else {
			rssFeedsImpl.setDescription(description);
		}

		if (content == null) {
			rssFeedsImpl.setContent(StringPool.BLANK);
		}
		else {
			rssFeedsImpl.setContent(content);
		}

		if (author == null) {
			rssFeedsImpl.setAuthor(StringPool.BLANK);
		}
		else {
			rssFeedsImpl.setAuthor(author);
		}

		if (publishedDate == Long.MIN_VALUE) {
			rssFeedsImpl.setPublishedDate(null);
		}
		else {
			rssFeedsImpl.setPublishedDate(new Date(publishedDate));
		}

		rssFeedsImpl.setStatus(status);
		rssFeedsImpl.setCreatedId(createdId);

		if (createdDate == Long.MIN_VALUE) {
			rssFeedsImpl.setCreatedDate(null);
		}
		else {
			rssFeedsImpl.setCreatedDate(new Date(createdDate));
		}

		rssFeedsImpl.setApprovedId(approvedId);

		if (approvedDate == Long.MIN_VALUE) {
			rssFeedsImpl.setApprovedDate(null);
		}
		else {
			rssFeedsImpl.setApprovedDate(new Date(approvedDate));
		}

		rssFeedsImpl.setRssCategoryId(rssCategoryId);

		rssFeedsImpl.resetOriginalValues();

		return rssFeedsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		rssFeedsId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		title = objectInput.readUTF();
		url = objectInput.readUTF();
		description = objectInput.readUTF();
		content = objectInput.readUTF();
		author = objectInput.readUTF();
		publishedDate = objectInput.readLong();
		status = objectInput.readInt();
		createdId = objectInput.readLong();
		createdDate = objectInput.readLong();
		approvedId = objectInput.readLong();
		approvedDate = objectInput.readLong();
		rssCategoryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(rssFeedsId);
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

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}

		if (author == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(author);
		}

		objectOutput.writeLong(publishedDate);
		objectOutput.writeInt(status);
		objectOutput.writeLong(createdId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(approvedId);
		objectOutput.writeLong(approvedDate);
		objectOutput.writeLong(rssCategoryId);
	}

	public long rssFeedsId;
	public long groupId;
	public long companyId;
	public String title;
	public String url;
	public String description;
	public String content;
	public String author;
	public long publishedDate;
	public int status;
	public long createdId;
	public long createdDate;
	public long approvedId;
	public long approvedDate;
	public long rssCategoryId;
}
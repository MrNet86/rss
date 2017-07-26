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

import com.liferay.portal.kernel.exception.SystemException;

import com.vnpt.portal.rss.model.RssFeeds;
import com.vnpt.portal.rss.service.RssFeedsLocalServiceUtil;

/**
 * The extended model base implementation for the RssFeeds service. Represents a row in the &quot;eportal_rss_feeds&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RssFeedsImpl}.
 * </p>
 *
 * @author MrNet
 * @see RssFeedsImpl
 * @see com.vnpt.portal.rss.model.RssFeeds
 * @generated
 */
public abstract class RssFeedsBaseImpl extends RssFeedsModelImpl
	implements RssFeeds {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a rss feeds model instance should use the {@link RssFeeds} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RssFeedsLocalServiceUtil.addRssFeeds(this);
		}
		else {
			RssFeedsLocalServiceUtil.updateRssFeeds(this);
		}
	}
}
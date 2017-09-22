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

import com.vnpt.portlet.user.service.persistence.ActIdMembershipPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author ToanNQ86
 * @generated
 */
public class ActIdMembershipSoap implements Serializable {
	public static ActIdMembershipSoap toSoapModel(ActIdMembership model) {
		ActIdMembershipSoap soapModel = new ActIdMembershipSoap();

		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());

		return soapModel;
	}

	public static ActIdMembershipSoap[] toSoapModels(ActIdMembership[] models) {
		ActIdMembershipSoap[] soapModels = new ActIdMembershipSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ActIdMembershipSoap[][] toSoapModels(
		ActIdMembership[][] models) {
		ActIdMembershipSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ActIdMembershipSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ActIdMembershipSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ActIdMembershipSoap[] toSoapModels(
		List<ActIdMembership> models) {
		List<ActIdMembershipSoap> soapModels = new ArrayList<ActIdMembershipSoap>(models.size());

		for (ActIdMembership model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ActIdMembershipSoap[soapModels.size()]);
	}

	public ActIdMembershipSoap() {
	}

	public ActIdMembershipPK getPrimaryKey() {
		return new ActIdMembershipPK(_userId, _groupId);
	}

	public void setPrimaryKey(ActIdMembershipPK pk) {
		setUserId(pk.userId);
		setGroupId(pk.groupId);
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	private long _userId;
	private long _groupId;
}
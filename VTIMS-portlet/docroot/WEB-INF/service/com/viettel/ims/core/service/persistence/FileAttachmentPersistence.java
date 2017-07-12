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

package com.viettel.ims.core.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.viettel.ims.core.model.FileAttachment;

/**
 * The persistence interface for the file attachment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see FileAttachmentPersistenceImpl
 * @see FileAttachmentUtil
 * @generated
 */
public interface FileAttachmentPersistence extends BasePersistence<FileAttachment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FileAttachmentUtil} to access the file attachment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the file attachments where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching file attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.FileAttachment> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the file attachments where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.FileAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of file attachments
	* @param end the upper bound of the range of file attachments (not inclusive)
	* @return the range of matching file attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.FileAttachment> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the file attachments where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.FileAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of file attachments
	* @param end the upper bound of the range of file attachments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching file attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.FileAttachment> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first file attachment in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching file attachment
	* @throws com.viettel.ims.core.NoSuchFileAttachmentException if a matching file attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.FileAttachment findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchFileAttachmentException;

	/**
	* Returns the first file attachment in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching file attachment, or <code>null</code> if a matching file attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.FileAttachment fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last file attachment in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching file attachment
	* @throws com.viettel.ims.core.NoSuchFileAttachmentException if a matching file attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.FileAttachment findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchFileAttachmentException;

	/**
	* Returns the last file attachment in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching file attachment, or <code>null</code> if a matching file attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.FileAttachment fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the file attachments before and after the current file attachment in the ordered set where companyId = &#63;.
	*
	* @param fileAttachmentId the primary key of the current file attachment
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next file attachment
	* @throws com.viettel.ims.core.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.FileAttachment[] findByCompanyId_PrevAndNext(
		long fileAttachmentId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchFileAttachmentException;

	/**
	* Removes all the file attachments where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of file attachments where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching file attachments
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the file attachments where objectType = &#63; and objectId = &#63;.
	*
	* @param objectType the object type
	* @param objectId the object ID
	* @return the matching file attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.FileAttachment> findByO_O(
		int objectType, long objectId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the file attachments where objectType = &#63; and objectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.FileAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param objectType the object type
	* @param objectId the object ID
	* @param start the lower bound of the range of file attachments
	* @param end the upper bound of the range of file attachments (not inclusive)
	* @return the range of matching file attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.FileAttachment> findByO_O(
		int objectType, long objectId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the file attachments where objectType = &#63; and objectId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.FileAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param objectType the object type
	* @param objectId the object ID
	* @param start the lower bound of the range of file attachments
	* @param end the upper bound of the range of file attachments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching file attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.FileAttachment> findByO_O(
		int objectType, long objectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first file attachment in the ordered set where objectType = &#63; and objectId = &#63;.
	*
	* @param objectType the object type
	* @param objectId the object ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching file attachment
	* @throws com.viettel.ims.core.NoSuchFileAttachmentException if a matching file attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.FileAttachment findByO_O_First(
		int objectType, long objectId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchFileAttachmentException;

	/**
	* Returns the first file attachment in the ordered set where objectType = &#63; and objectId = &#63;.
	*
	* @param objectType the object type
	* @param objectId the object ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching file attachment, or <code>null</code> if a matching file attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.FileAttachment fetchByO_O_First(
		int objectType, long objectId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last file attachment in the ordered set where objectType = &#63; and objectId = &#63;.
	*
	* @param objectType the object type
	* @param objectId the object ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching file attachment
	* @throws com.viettel.ims.core.NoSuchFileAttachmentException if a matching file attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.FileAttachment findByO_O_Last(
		int objectType, long objectId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchFileAttachmentException;

	/**
	* Returns the last file attachment in the ordered set where objectType = &#63; and objectId = &#63;.
	*
	* @param objectType the object type
	* @param objectId the object ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching file attachment, or <code>null</code> if a matching file attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.FileAttachment fetchByO_O_Last(
		int objectType, long objectId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the file attachments before and after the current file attachment in the ordered set where objectType = &#63; and objectId = &#63;.
	*
	* @param fileAttachmentId the primary key of the current file attachment
	* @param objectType the object type
	* @param objectId the object ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next file attachment
	* @throws com.viettel.ims.core.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.FileAttachment[] findByO_O_PrevAndNext(
		long fileAttachmentId, int objectType, long objectId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchFileAttachmentException;

	/**
	* Removes all the file attachments where objectType = &#63; and objectId = &#63; from the database.
	*
	* @param objectType the object type
	* @param objectId the object ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByO_O(int objectType, long objectId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of file attachments where objectType = &#63; and objectId = &#63;.
	*
	* @param objectType the object type
	* @param objectId the object ID
	* @return the number of matching file attachments
	* @throws SystemException if a system exception occurred
	*/
	public int countByO_O(int objectType, long objectId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the file attachment in the entity cache if it is enabled.
	*
	* @param fileAttachment the file attachment
	*/
	public void cacheResult(
		com.viettel.ims.core.model.FileAttachment fileAttachment);

	/**
	* Caches the file attachments in the entity cache if it is enabled.
	*
	* @param fileAttachments the file attachments
	*/
	public void cacheResult(
		java.util.List<com.viettel.ims.core.model.FileAttachment> fileAttachments);

	/**
	* Creates a new file attachment with the primary key. Does not add the file attachment to the database.
	*
	* @param fileAttachmentId the primary key for the new file attachment
	* @return the new file attachment
	*/
	public com.viettel.ims.core.model.FileAttachment create(
		long fileAttachmentId);

	/**
	* Removes the file attachment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fileAttachmentId the primary key of the file attachment
	* @return the file attachment that was removed
	* @throws com.viettel.ims.core.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.FileAttachment remove(
		long fileAttachmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchFileAttachmentException;

	public com.viettel.ims.core.model.FileAttachment updateImpl(
		com.viettel.ims.core.model.FileAttachment fileAttachment)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the file attachment with the primary key or throws a {@link com.viettel.ims.core.NoSuchFileAttachmentException} if it could not be found.
	*
	* @param fileAttachmentId the primary key of the file attachment
	* @return the file attachment
	* @throws com.viettel.ims.core.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.FileAttachment findByPrimaryKey(
		long fileAttachmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchFileAttachmentException;

	/**
	* Returns the file attachment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fileAttachmentId the primary key of the file attachment
	* @return the file attachment, or <code>null</code> if a file attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viettel.ims.core.model.FileAttachment fetchByPrimaryKey(
		long fileAttachmentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the file attachments.
	*
	* @return the file attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.FileAttachment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the file attachments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.FileAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of file attachments
	* @param end the upper bound of the range of file attachments (not inclusive)
	* @return the range of file attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.FileAttachment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the file attachments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.viettel.ims.core.model.impl.FileAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of file attachments
	* @param end the upper bound of the range of file attachments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of file attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viettel.ims.core.model.FileAttachment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the file attachments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of file attachments.
	*
	* @return the number of file attachments
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
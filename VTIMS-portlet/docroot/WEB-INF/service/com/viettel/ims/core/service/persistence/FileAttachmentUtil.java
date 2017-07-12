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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.viettel.ims.core.model.FileAttachment;

import java.util.List;

/**
 * The persistence utility for the file attachment service. This utility wraps {@link FileAttachmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see FileAttachmentPersistence
 * @see FileAttachmentPersistenceImpl
 * @generated
 */
public class FileAttachmentUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(FileAttachment fileAttachment) {
		getPersistence().clearCache(fileAttachment);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FileAttachment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FileAttachment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FileAttachment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static FileAttachment update(FileAttachment fileAttachment)
		throws SystemException {
		return getPersistence().update(fileAttachment);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static FileAttachment update(FileAttachment fileAttachment,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(fileAttachment, serviceContext);
	}

	/**
	* Returns all the file attachments where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching file attachments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.FileAttachment> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

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
	public static java.util.List<com.viettel.ims.core.model.FileAttachment> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

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
	public static java.util.List<com.viettel.ims.core.model.FileAttachment> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first file attachment in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching file attachment
	* @throws com.viettel.ims.core.NoSuchFileAttachmentException if a matching file attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.FileAttachment findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchFileAttachmentException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first file attachment in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching file attachment, or <code>null</code> if a matching file attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.FileAttachment fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last file attachment in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching file attachment
	* @throws com.viettel.ims.core.NoSuchFileAttachmentException if a matching file attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.FileAttachment findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchFileAttachmentException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last file attachment in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching file attachment, or <code>null</code> if a matching file attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.FileAttachment fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

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
	public static com.viettel.ims.core.model.FileAttachment[] findByCompanyId_PrevAndNext(
		long fileAttachmentId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchFileAttachmentException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(fileAttachmentId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the file attachments where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of file attachments where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching file attachments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns all the file attachments where objectType = &#63; and objectId = &#63;.
	*
	* @param objectType the object type
	* @param objectId the object ID
	* @return the matching file attachments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.FileAttachment> findByO_O(
		int objectType, long objectId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByO_O(objectType, objectId);
	}

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
	public static java.util.List<com.viettel.ims.core.model.FileAttachment> findByO_O(
		int objectType, long objectId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByO_O(objectType, objectId, start, end);
	}

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
	public static java.util.List<com.viettel.ims.core.model.FileAttachment> findByO_O(
		int objectType, long objectId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByO_O(objectType, objectId, start, end,
			orderByComparator);
	}

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
	public static com.viettel.ims.core.model.FileAttachment findByO_O_First(
		int objectType, long objectId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchFileAttachmentException {
		return getPersistence()
				   .findByO_O_First(objectType, objectId, orderByComparator);
	}

	/**
	* Returns the first file attachment in the ordered set where objectType = &#63; and objectId = &#63;.
	*
	* @param objectType the object type
	* @param objectId the object ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching file attachment, or <code>null</code> if a matching file attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.FileAttachment fetchByO_O_First(
		int objectType, long objectId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByO_O_First(objectType, objectId, orderByComparator);
	}

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
	public static com.viettel.ims.core.model.FileAttachment findByO_O_Last(
		int objectType, long objectId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchFileAttachmentException {
		return getPersistence()
				   .findByO_O_Last(objectType, objectId, orderByComparator);
	}

	/**
	* Returns the last file attachment in the ordered set where objectType = &#63; and objectId = &#63;.
	*
	* @param objectType the object type
	* @param objectId the object ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching file attachment, or <code>null</code> if a matching file attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.FileAttachment fetchByO_O_Last(
		int objectType, long objectId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByO_O_Last(objectType, objectId, orderByComparator);
	}

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
	public static com.viettel.ims.core.model.FileAttachment[] findByO_O_PrevAndNext(
		long fileAttachmentId, int objectType, long objectId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchFileAttachmentException {
		return getPersistence()
				   .findByO_O_PrevAndNext(fileAttachmentId, objectType,
			objectId, orderByComparator);
	}

	/**
	* Removes all the file attachments where objectType = &#63; and objectId = &#63; from the database.
	*
	* @param objectType the object type
	* @param objectId the object ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByO_O(int objectType, long objectId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByO_O(objectType, objectId);
	}

	/**
	* Returns the number of file attachments where objectType = &#63; and objectId = &#63;.
	*
	* @param objectType the object type
	* @param objectId the object ID
	* @return the number of matching file attachments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByO_O(int objectType, long objectId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByO_O(objectType, objectId);
	}

	/**
	* Caches the file attachment in the entity cache if it is enabled.
	*
	* @param fileAttachment the file attachment
	*/
	public static void cacheResult(
		com.viettel.ims.core.model.FileAttachment fileAttachment) {
		getPersistence().cacheResult(fileAttachment);
	}

	/**
	* Caches the file attachments in the entity cache if it is enabled.
	*
	* @param fileAttachments the file attachments
	*/
	public static void cacheResult(
		java.util.List<com.viettel.ims.core.model.FileAttachment> fileAttachments) {
		getPersistence().cacheResult(fileAttachments);
	}

	/**
	* Creates a new file attachment with the primary key. Does not add the file attachment to the database.
	*
	* @param fileAttachmentId the primary key for the new file attachment
	* @return the new file attachment
	*/
	public static com.viettel.ims.core.model.FileAttachment create(
		long fileAttachmentId) {
		return getPersistence().create(fileAttachmentId);
	}

	/**
	* Removes the file attachment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fileAttachmentId the primary key of the file attachment
	* @return the file attachment that was removed
	* @throws com.viettel.ims.core.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.FileAttachment remove(
		long fileAttachmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchFileAttachmentException {
		return getPersistence().remove(fileAttachmentId);
	}

	public static com.viettel.ims.core.model.FileAttachment updateImpl(
		com.viettel.ims.core.model.FileAttachment fileAttachment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(fileAttachment);
	}

	/**
	* Returns the file attachment with the primary key or throws a {@link com.viettel.ims.core.NoSuchFileAttachmentException} if it could not be found.
	*
	* @param fileAttachmentId the primary key of the file attachment
	* @return the file attachment
	* @throws com.viettel.ims.core.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.FileAttachment findByPrimaryKey(
		long fileAttachmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.viettel.ims.core.NoSuchFileAttachmentException {
		return getPersistence().findByPrimaryKey(fileAttachmentId);
	}

	/**
	* Returns the file attachment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fileAttachmentId the primary key of the file attachment
	* @return the file attachment, or <code>null</code> if a file attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.viettel.ims.core.model.FileAttachment fetchByPrimaryKey(
		long fileAttachmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(fileAttachmentId);
	}

	/**
	* Returns all the file attachments.
	*
	* @return the file attachments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.viettel.ims.core.model.FileAttachment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.viettel.ims.core.model.FileAttachment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.viettel.ims.core.model.FileAttachment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the file attachments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of file attachments.
	*
	* @return the number of file attachments
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FileAttachmentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FileAttachmentPersistence)PortletBeanLocatorUtil.locate(com.viettel.ims.core.service.ClpSerializer.getServletContextName(),
					FileAttachmentPersistence.class.getName());

			ReferenceRegistry.registerReference(FileAttachmentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(FileAttachmentPersistence persistence) {
	}

	private static FileAttachmentPersistence _persistence;
}
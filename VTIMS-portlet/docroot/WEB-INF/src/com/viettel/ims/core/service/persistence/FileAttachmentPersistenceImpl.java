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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.viettel.ims.core.NoSuchFileAttachmentException;
import com.viettel.ims.core.model.FileAttachment;
import com.viettel.ims.core.model.impl.FileAttachmentImpl;
import com.viettel.ims.core.model.impl.FileAttachmentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the file attachment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MrNet
 * @see FileAttachmentPersistence
 * @see FileAttachmentUtil
 * @generated
 */
public class FileAttachmentPersistenceImpl extends BasePersistenceImpl<FileAttachment>
	implements FileAttachmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FileAttachmentUtil} to access the file attachment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FileAttachmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			FileAttachmentModelImpl.FINDER_CACHE_ENABLED,
			FileAttachmentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			FileAttachmentModelImpl.FINDER_CACHE_ENABLED,
			FileAttachmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			FileAttachmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			FileAttachmentModelImpl.FINDER_CACHE_ENABLED,
			FileAttachmentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			FileAttachmentModelImpl.FINDER_CACHE_ENABLED,
			FileAttachmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			FileAttachmentModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			FileAttachmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the file attachments where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching file attachments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FileAttachment> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<FileAttachment> findByCompanyId(long companyId, int start,
		int end) throws SystemException {
		return findByCompanyId(companyId, start, end, null);
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
	@Override
	public List<FileAttachment> findByCompanyId(long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<FileAttachment> list = (List<FileAttachment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FileAttachment fileAttachment : list) {
				if ((companyId != fileAttachment.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_FILEATTACHMENT_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FileAttachmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<FileAttachment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FileAttachment>(list);
				}
				else {
					list = (List<FileAttachment>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public FileAttachment findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchFileAttachmentException, SystemException {
		FileAttachment fileAttachment = fetchByCompanyId_First(companyId,
				orderByComparator);

		if (fileAttachment != null) {
			return fileAttachment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFileAttachmentException(msg.toString());
	}

	/**
	 * Returns the first file attachment in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching file attachment, or <code>null</code> if a matching file attachment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileAttachment fetchByCompanyId_First(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FileAttachment> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public FileAttachment findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchFileAttachmentException, SystemException {
		FileAttachment fileAttachment = fetchByCompanyId_Last(companyId,
				orderByComparator);

		if (fileAttachment != null) {
			return fileAttachment;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFileAttachmentException(msg.toString());
	}

	/**
	 * Returns the last file attachment in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching file attachment, or <code>null</code> if a matching file attachment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileAttachment fetchByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<FileAttachment> list = findByCompanyId(companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public FileAttachment[] findByCompanyId_PrevAndNext(long fileAttachmentId,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchFileAttachmentException, SystemException {
		FileAttachment fileAttachment = findByPrimaryKey(fileAttachmentId);

		Session session = null;

		try {
			session = openSession();

			FileAttachment[] array = new FileAttachmentImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, fileAttachment,
					companyId, orderByComparator, true);

			array[1] = fileAttachment;

			array[2] = getByCompanyId_PrevAndNext(session, fileAttachment,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FileAttachment getByCompanyId_PrevAndNext(Session session,
		FileAttachment fileAttachment, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FILEATTACHMENT_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(FileAttachmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(fileAttachment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FileAttachment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the file attachments where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompanyId(long companyId) throws SystemException {
		for (FileAttachment fileAttachment : findByCompanyId(companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(fileAttachment);
		}
	}

	/**
	 * Returns the number of file attachments where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching file attachments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCompanyId(long companyId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FILEATTACHMENT_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "fileAttachment.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_O_O = new FinderPath(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			FileAttachmentModelImpl.FINDER_CACHE_ENABLED,
			FileAttachmentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByO_O",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_O = new FinderPath(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			FileAttachmentModelImpl.FINDER_CACHE_ENABLED,
			FileAttachmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByO_O",
			new String[] { Integer.class.getName(), Long.class.getName() },
			FileAttachmentModelImpl.OBJECTTYPE_COLUMN_BITMASK |
			FileAttachmentModelImpl.OBJECTID_COLUMN_BITMASK |
			FileAttachmentModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_O_O = new FinderPath(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			FileAttachmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByO_O",
			new String[] { Integer.class.getName(), Long.class.getName() });

	/**
	 * Returns all the file attachments where objectType = &#63; and objectId = &#63;.
	 *
	 * @param objectType the object type
	 * @param objectId the object ID
	 * @return the matching file attachments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FileAttachment> findByO_O(int objectType, long objectId)
		throws SystemException {
		return findByO_O(objectType, objectId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<FileAttachment> findByO_O(int objectType, long objectId,
		int start, int end) throws SystemException {
		return findByO_O(objectType, objectId, start, end, null);
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
	@Override
	public List<FileAttachment> findByO_O(int objectType, long objectId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_O;
			finderArgs = new Object[] { objectType, objectId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_O_O;
			finderArgs = new Object[] {
					objectType, objectId,
					
					start, end, orderByComparator
				};
		}

		List<FileAttachment> list = (List<FileAttachment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FileAttachment fileAttachment : list) {
				if ((objectType != fileAttachment.getObjectType()) ||
						(objectId != fileAttachment.getObjectId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_FILEATTACHMENT_WHERE);

			query.append(_FINDER_COLUMN_O_O_OBJECTTYPE_2);

			query.append(_FINDER_COLUMN_O_O_OBJECTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FileAttachmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(objectType);

				qPos.add(objectId);

				if (!pagination) {
					list = (List<FileAttachment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FileAttachment>(list);
				}
				else {
					list = (List<FileAttachment>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public FileAttachment findByO_O_First(int objectType, long objectId,
		OrderByComparator orderByComparator)
		throws NoSuchFileAttachmentException, SystemException {
		FileAttachment fileAttachment = fetchByO_O_First(objectType, objectId,
				orderByComparator);

		if (fileAttachment != null) {
			return fileAttachment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("objectType=");
		msg.append(objectType);

		msg.append(", objectId=");
		msg.append(objectId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFileAttachmentException(msg.toString());
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
	@Override
	public FileAttachment fetchByO_O_First(int objectType, long objectId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FileAttachment> list = findByO_O(objectType, objectId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public FileAttachment findByO_O_Last(int objectType, long objectId,
		OrderByComparator orderByComparator)
		throws NoSuchFileAttachmentException, SystemException {
		FileAttachment fileAttachment = fetchByO_O_Last(objectType, objectId,
				orderByComparator);

		if (fileAttachment != null) {
			return fileAttachment;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("objectType=");
		msg.append(objectType);

		msg.append(", objectId=");
		msg.append(objectId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFileAttachmentException(msg.toString());
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
	@Override
	public FileAttachment fetchByO_O_Last(int objectType, long objectId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByO_O(objectType, objectId);

		if (count == 0) {
			return null;
		}

		List<FileAttachment> list = findByO_O(objectType, objectId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public FileAttachment[] findByO_O_PrevAndNext(long fileAttachmentId,
		int objectType, long objectId, OrderByComparator orderByComparator)
		throws NoSuchFileAttachmentException, SystemException {
		FileAttachment fileAttachment = findByPrimaryKey(fileAttachmentId);

		Session session = null;

		try {
			session = openSession();

			FileAttachment[] array = new FileAttachmentImpl[3];

			array[0] = getByO_O_PrevAndNext(session, fileAttachment,
					objectType, objectId, orderByComparator, true);

			array[1] = fileAttachment;

			array[2] = getByO_O_PrevAndNext(session, fileAttachment,
					objectType, objectId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FileAttachment getByO_O_PrevAndNext(Session session,
		FileAttachment fileAttachment, int objectType, long objectId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FILEATTACHMENT_WHERE);

		query.append(_FINDER_COLUMN_O_O_OBJECTTYPE_2);

		query.append(_FINDER_COLUMN_O_O_OBJECTID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(FileAttachmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(objectType);

		qPos.add(objectId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(fileAttachment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FileAttachment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the file attachments where objectType = &#63; and objectId = &#63; from the database.
	 *
	 * @param objectType the object type
	 * @param objectId the object ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByO_O(int objectType, long objectId)
		throws SystemException {
		for (FileAttachment fileAttachment : findByO_O(objectType, objectId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(fileAttachment);
		}
	}

	/**
	 * Returns the number of file attachments where objectType = &#63; and objectId = &#63;.
	 *
	 * @param objectType the object type
	 * @param objectId the object ID
	 * @return the number of matching file attachments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByO_O(int objectType, long objectId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_O_O;

		Object[] finderArgs = new Object[] { objectType, objectId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FILEATTACHMENT_WHERE);

			query.append(_FINDER_COLUMN_O_O_OBJECTTYPE_2);

			query.append(_FINDER_COLUMN_O_O_OBJECTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(objectType);

				qPos.add(objectId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_O_O_OBJECTTYPE_2 = "fileAttachment.objectType = ? AND ";
	private static final String _FINDER_COLUMN_O_O_OBJECTID_2 = "fileAttachment.objectId = ?";

	public FileAttachmentPersistenceImpl() {
		setModelClass(FileAttachment.class);
	}

	/**
	 * Caches the file attachment in the entity cache if it is enabled.
	 *
	 * @param fileAttachment the file attachment
	 */
	@Override
	public void cacheResult(FileAttachment fileAttachment) {
		EntityCacheUtil.putResult(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			FileAttachmentImpl.class, fileAttachment.getPrimaryKey(),
			fileAttachment);

		fileAttachment.resetOriginalValues();
	}

	/**
	 * Caches the file attachments in the entity cache if it is enabled.
	 *
	 * @param fileAttachments the file attachments
	 */
	@Override
	public void cacheResult(List<FileAttachment> fileAttachments) {
		for (FileAttachment fileAttachment : fileAttachments) {
			if (EntityCacheUtil.getResult(
						FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
						FileAttachmentImpl.class, fileAttachment.getPrimaryKey()) == null) {
				cacheResult(fileAttachment);
			}
			else {
				fileAttachment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all file attachments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FileAttachmentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FileAttachmentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the file attachment.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FileAttachment fileAttachment) {
		EntityCacheUtil.removeResult(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			FileAttachmentImpl.class, fileAttachment.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FileAttachment> fileAttachments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FileAttachment fileAttachment : fileAttachments) {
			EntityCacheUtil.removeResult(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
				FileAttachmentImpl.class, fileAttachment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new file attachment with the primary key. Does not add the file attachment to the database.
	 *
	 * @param fileAttachmentId the primary key for the new file attachment
	 * @return the new file attachment
	 */
	@Override
	public FileAttachment create(long fileAttachmentId) {
		FileAttachment fileAttachment = new FileAttachmentImpl();

		fileAttachment.setNew(true);
		fileAttachment.setPrimaryKey(fileAttachmentId);

		return fileAttachment;
	}

	/**
	 * Removes the file attachment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fileAttachmentId the primary key of the file attachment
	 * @return the file attachment that was removed
	 * @throws com.viettel.ims.core.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileAttachment remove(long fileAttachmentId)
		throws NoSuchFileAttachmentException, SystemException {
		return remove((Serializable)fileAttachmentId);
	}

	/**
	 * Removes the file attachment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the file attachment
	 * @return the file attachment that was removed
	 * @throws com.viettel.ims.core.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileAttachment remove(Serializable primaryKey)
		throws NoSuchFileAttachmentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FileAttachment fileAttachment = (FileAttachment)session.get(FileAttachmentImpl.class,
					primaryKey);

			if (fileAttachment == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFileAttachmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(fileAttachment);
		}
		catch (NoSuchFileAttachmentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected FileAttachment removeImpl(FileAttachment fileAttachment)
		throws SystemException {
		fileAttachment = toUnwrappedModel(fileAttachment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fileAttachment)) {
				fileAttachment = (FileAttachment)session.get(FileAttachmentImpl.class,
						fileAttachment.getPrimaryKeyObj());
			}

			if (fileAttachment != null) {
				session.delete(fileAttachment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (fileAttachment != null) {
			clearCache(fileAttachment);
		}

		return fileAttachment;
	}

	@Override
	public FileAttachment updateImpl(
		com.viettel.ims.core.model.FileAttachment fileAttachment)
		throws SystemException {
		fileAttachment = toUnwrappedModel(fileAttachment);

		boolean isNew = fileAttachment.isNew();

		FileAttachmentModelImpl fileAttachmentModelImpl = (FileAttachmentModelImpl)fileAttachment;

		Session session = null;

		try {
			session = openSession();

			if (fileAttachment.isNew()) {
				session.save(fileAttachment);

				fileAttachment.setNew(false);
			}
			else {
				session.merge(fileAttachment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FileAttachmentModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((fileAttachmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fileAttachmentModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { fileAttachmentModelImpl.getCompanyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((fileAttachmentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_O.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fileAttachmentModelImpl.getOriginalObjectType(),
						fileAttachmentModelImpl.getOriginalObjectId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O_O, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_O,
					args);

				args = new Object[] {
						fileAttachmentModelImpl.getObjectType(),
						fileAttachmentModelImpl.getObjectId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_O_O, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_O_O,
					args);
			}
		}

		EntityCacheUtil.putResult(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
			FileAttachmentImpl.class, fileAttachment.getPrimaryKey(),
			fileAttachment);

		return fileAttachment;
	}

	protected FileAttachment toUnwrappedModel(FileAttachment fileAttachment) {
		if (fileAttachment instanceof FileAttachmentImpl) {
			return fileAttachment;
		}

		FileAttachmentImpl fileAttachmentImpl = new FileAttachmentImpl();

		fileAttachmentImpl.setNew(fileAttachment.isNew());
		fileAttachmentImpl.setPrimaryKey(fileAttachment.getPrimaryKey());

		fileAttachmentImpl.setFileAttachmentId(fileAttachment.getFileAttachmentId());
		fileAttachmentImpl.setCompanyId(fileAttachment.getCompanyId());
		fileAttachmentImpl.setRepositoryId(fileAttachment.getRepositoryId());
		fileAttachmentImpl.setFolderId(fileAttachment.getFolderId());
		fileAttachmentImpl.setCreatedDate(fileAttachment.getCreatedDate());
		fileAttachmentImpl.setCreatedById(fileAttachment.getCreatedById());
		fileAttachmentImpl.setTreePath_(fileAttachment.getTreePath_());
		fileAttachmentImpl.setName(fileAttachment.getName());
		fileAttachmentImpl.setExtention(fileAttachment.getExtention());
		fileAttachmentImpl.setMimeType(fileAttachment.getMimeType());
		fileAttachmentImpl.setTitle(fileAttachment.getTitle());
		fileAttachmentImpl.setDescription(fileAttachment.getDescription());
		fileAttachmentImpl.setExtraSetting(fileAttachment.getExtraSetting());
		fileAttachmentImpl.setFileTypeId(fileAttachment.getFileTypeId());
		fileAttachmentImpl.setVersion(fileAttachment.getVersion());
		fileAttachmentImpl.setSize_(fileAttachment.getSize_());
		fileAttachmentImpl.setReadCount(fileAttachment.getReadCount());
		fileAttachmentImpl.setSmallImageId(fileAttachment.getSmallImageId());
		fileAttachmentImpl.setLargeImageId(fileAttachment.getLargeImageId());
		fileAttachmentImpl.setCustom1Image(fileAttachment.getCustom1Image());
		fileAttachmentImpl.setCustom2Image(fileAttachment.getCustom2Image());
		fileAttachmentImpl.setIsManualCheckInRequired(fileAttachment.isIsManualCheckInRequired());
		fileAttachmentImpl.setObjectType(fileAttachment.getObjectType());
		fileAttachmentImpl.setObjectId(fileAttachment.getObjectId());
		fileAttachmentImpl.setModifiedById(fileAttachment.getModifiedById());
		fileAttachmentImpl.setModifiedDate(fileAttachment.getModifiedDate());

		return fileAttachmentImpl;
	}

	/**
	 * Returns the file attachment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the file attachment
	 * @return the file attachment
	 * @throws com.viettel.ims.core.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileAttachment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFileAttachmentException, SystemException {
		FileAttachment fileAttachment = fetchByPrimaryKey(primaryKey);

		if (fileAttachment == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFileAttachmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return fileAttachment;
	}

	/**
	 * Returns the file attachment with the primary key or throws a {@link com.viettel.ims.core.NoSuchFileAttachmentException} if it could not be found.
	 *
	 * @param fileAttachmentId the primary key of the file attachment
	 * @return the file attachment
	 * @throws com.viettel.ims.core.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileAttachment findByPrimaryKey(long fileAttachmentId)
		throws NoSuchFileAttachmentException, SystemException {
		return findByPrimaryKey((Serializable)fileAttachmentId);
	}

	/**
	 * Returns the file attachment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the file attachment
	 * @return the file attachment, or <code>null</code> if a file attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileAttachment fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		FileAttachment fileAttachment = (FileAttachment)EntityCacheUtil.getResult(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
				FileAttachmentImpl.class, primaryKey);

		if (fileAttachment == _nullFileAttachment) {
			return null;
		}

		if (fileAttachment == null) {
			Session session = null;

			try {
				session = openSession();

				fileAttachment = (FileAttachment)session.get(FileAttachmentImpl.class,
						primaryKey);

				if (fileAttachment != null) {
					cacheResult(fileAttachment);
				}
				else {
					EntityCacheUtil.putResult(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
						FileAttachmentImpl.class, primaryKey,
						_nullFileAttachment);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
					FileAttachmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return fileAttachment;
	}

	/**
	 * Returns the file attachment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fileAttachmentId the primary key of the file attachment
	 * @return the file attachment, or <code>null</code> if a file attachment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FileAttachment fetchByPrimaryKey(long fileAttachmentId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)fileAttachmentId);
	}

	/**
	 * Returns all the file attachments.
	 *
	 * @return the file attachments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FileAttachment> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<FileAttachment> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<FileAttachment> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<FileAttachment> list = (List<FileAttachment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FILEATTACHMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FILEATTACHMENT;

				if (pagination) {
					sql = sql.concat(FileAttachmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FileAttachment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FileAttachment>(list);
				}
				else {
					list = (List<FileAttachment>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the file attachments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (FileAttachment fileAttachment : findAll()) {
			remove(fileAttachment);
		}
	}

	/**
	 * Returns the number of file attachments.
	 *
	 * @return the number of file attachments
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FILEATTACHMENT);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the file attachment persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.viettel.ims.core.model.FileAttachment")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FileAttachment>> listenersList = new ArrayList<ModelListener<FileAttachment>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FileAttachment>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(FileAttachmentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FILEATTACHMENT = "SELECT fileAttachment FROM FileAttachment fileAttachment";
	private static final String _SQL_SELECT_FILEATTACHMENT_WHERE = "SELECT fileAttachment FROM FileAttachment fileAttachment WHERE ";
	private static final String _SQL_COUNT_FILEATTACHMENT = "SELECT COUNT(fileAttachment) FROM FileAttachment fileAttachment";
	private static final String _SQL_COUNT_FILEATTACHMENT_WHERE = "SELECT COUNT(fileAttachment) FROM FileAttachment fileAttachment WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "fileAttachment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FileAttachment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FileAttachment exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FileAttachmentPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"fileAttachmentId", "companyId", "repositoryId", "folderId",
				"createdDate", "createdById", "treePath_", "name", "extention",
				"mimeType", "title", "description", "extraSetting", "fileTypeId",
				"version", "size_", "readCount", "smallImageId", "largeImageId",
				"custom1Image", "custom2Image", "isManualCheckInRequired",
				"objectType", "modifiedById", "modifiedDate"
			});
	private static FileAttachment _nullFileAttachment = new FileAttachmentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FileAttachment> toCacheModel() {
				return _nullFileAttachmentCacheModel;
			}
		};

	private static CacheModel<FileAttachment> _nullFileAttachmentCacheModel = new CacheModel<FileAttachment>() {
			@Override
			public FileAttachment toEntityModel() {
				return _nullFileAttachment;
			}
		};
}
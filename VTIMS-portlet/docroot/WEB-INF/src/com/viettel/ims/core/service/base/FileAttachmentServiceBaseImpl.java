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

package com.viettel.ims.core.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.viettel.ims.core.model.FileAttachment;
import com.viettel.ims.core.service.FileAttachmentService;
import com.viettel.ims.core.service.persistence.FileAttachmentPersistence;
import com.viettel.ims.core.service.persistence.InvestCategoriesPersistence;
import com.viettel.ims.core.service.persistence.InvestPolicyExtFinder;
import com.viettel.ims.core.service.persistence.InvestPolicyExtPersistence;
import com.viettel.ims.core.service.persistence.InvestPolicyFinder;
import com.viettel.ims.core.service.persistence.InvestPolicyPersistence;
import com.viettel.ims.core.service.persistence.SysGroupPersistence;
import com.viettel.ims.core.service.persistence.VInvestPolicyPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the file attachment remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.viettel.ims.core.service.impl.FileAttachmentServiceImpl}.
 * </p>
 *
 * @author MrNet
 * @see com.viettel.ims.core.service.impl.FileAttachmentServiceImpl
 * @see com.viettel.ims.core.service.FileAttachmentServiceUtil
 * @generated
 */
public abstract class FileAttachmentServiceBaseImpl extends BaseServiceImpl
	implements FileAttachmentService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.viettel.ims.core.service.FileAttachmentServiceUtil} to access the file attachment remote service.
	 */

	/**
	 * Returns the file attachment local service.
	 *
	 * @return the file attachment local service
	 */
	public com.viettel.ims.core.service.FileAttachmentLocalService getFileAttachmentLocalService() {
		return fileAttachmentLocalService;
	}

	/**
	 * Sets the file attachment local service.
	 *
	 * @param fileAttachmentLocalService the file attachment local service
	 */
	public void setFileAttachmentLocalService(
		com.viettel.ims.core.service.FileAttachmentLocalService fileAttachmentLocalService) {
		this.fileAttachmentLocalService = fileAttachmentLocalService;
	}

	/**
	 * Returns the file attachment remote service.
	 *
	 * @return the file attachment remote service
	 */
	public com.viettel.ims.core.service.FileAttachmentService getFileAttachmentService() {
		return fileAttachmentService;
	}

	/**
	 * Sets the file attachment remote service.
	 *
	 * @param fileAttachmentService the file attachment remote service
	 */
	public void setFileAttachmentService(
		com.viettel.ims.core.service.FileAttachmentService fileAttachmentService) {
		this.fileAttachmentService = fileAttachmentService;
	}

	/**
	 * Returns the file attachment persistence.
	 *
	 * @return the file attachment persistence
	 */
	public FileAttachmentPersistence getFileAttachmentPersistence() {
		return fileAttachmentPersistence;
	}

	/**
	 * Sets the file attachment persistence.
	 *
	 * @param fileAttachmentPersistence the file attachment persistence
	 */
	public void setFileAttachmentPersistence(
		FileAttachmentPersistence fileAttachmentPersistence) {
		this.fileAttachmentPersistence = fileAttachmentPersistence;
	}

	/**
	 * Returns the invest categories local service.
	 *
	 * @return the invest categories local service
	 */
	public com.viettel.ims.core.service.InvestCategoriesLocalService getInvestCategoriesLocalService() {
		return investCategoriesLocalService;
	}

	/**
	 * Sets the invest categories local service.
	 *
	 * @param investCategoriesLocalService the invest categories local service
	 */
	public void setInvestCategoriesLocalService(
		com.viettel.ims.core.service.InvestCategoriesLocalService investCategoriesLocalService) {
		this.investCategoriesLocalService = investCategoriesLocalService;
	}

	/**
	 * Returns the invest categories persistence.
	 *
	 * @return the invest categories persistence
	 */
	public InvestCategoriesPersistence getInvestCategoriesPersistence() {
		return investCategoriesPersistence;
	}

	/**
	 * Sets the invest categories persistence.
	 *
	 * @param investCategoriesPersistence the invest categories persistence
	 */
	public void setInvestCategoriesPersistence(
		InvestCategoriesPersistence investCategoriesPersistence) {
		this.investCategoriesPersistence = investCategoriesPersistence;
	}

	/**
	 * Returns the invest policy local service.
	 *
	 * @return the invest policy local service
	 */
	public com.viettel.ims.core.service.InvestPolicyLocalService getInvestPolicyLocalService() {
		return investPolicyLocalService;
	}

	/**
	 * Sets the invest policy local service.
	 *
	 * @param investPolicyLocalService the invest policy local service
	 */
	public void setInvestPolicyLocalService(
		com.viettel.ims.core.service.InvestPolicyLocalService investPolicyLocalService) {
		this.investPolicyLocalService = investPolicyLocalService;
	}

	/**
	 * Returns the invest policy persistence.
	 *
	 * @return the invest policy persistence
	 */
	public InvestPolicyPersistence getInvestPolicyPersistence() {
		return investPolicyPersistence;
	}

	/**
	 * Sets the invest policy persistence.
	 *
	 * @param investPolicyPersistence the invest policy persistence
	 */
	public void setInvestPolicyPersistence(
		InvestPolicyPersistence investPolicyPersistence) {
		this.investPolicyPersistence = investPolicyPersistence;
	}

	/**
	 * Returns the invest policy finder.
	 *
	 * @return the invest policy finder
	 */
	public InvestPolicyFinder getInvestPolicyFinder() {
		return investPolicyFinder;
	}

	/**
	 * Sets the invest policy finder.
	 *
	 * @param investPolicyFinder the invest policy finder
	 */
	public void setInvestPolicyFinder(InvestPolicyFinder investPolicyFinder) {
		this.investPolicyFinder = investPolicyFinder;
	}

	/**
	 * Returns the invest policy ext local service.
	 *
	 * @return the invest policy ext local service
	 */
	public com.viettel.ims.core.service.InvestPolicyExtLocalService getInvestPolicyExtLocalService() {
		return investPolicyExtLocalService;
	}

	/**
	 * Sets the invest policy ext local service.
	 *
	 * @param investPolicyExtLocalService the invest policy ext local service
	 */
	public void setInvestPolicyExtLocalService(
		com.viettel.ims.core.service.InvestPolicyExtLocalService investPolicyExtLocalService) {
		this.investPolicyExtLocalService = investPolicyExtLocalService;
	}

	/**
	 * Returns the invest policy ext persistence.
	 *
	 * @return the invest policy ext persistence
	 */
	public InvestPolicyExtPersistence getInvestPolicyExtPersistence() {
		return investPolicyExtPersistence;
	}

	/**
	 * Sets the invest policy ext persistence.
	 *
	 * @param investPolicyExtPersistence the invest policy ext persistence
	 */
	public void setInvestPolicyExtPersistence(
		InvestPolicyExtPersistence investPolicyExtPersistence) {
		this.investPolicyExtPersistence = investPolicyExtPersistence;
	}

	/**
	 * Returns the invest policy ext finder.
	 *
	 * @return the invest policy ext finder
	 */
	public InvestPolicyExtFinder getInvestPolicyExtFinder() {
		return investPolicyExtFinder;
	}

	/**
	 * Sets the invest policy ext finder.
	 *
	 * @param investPolicyExtFinder the invest policy ext finder
	 */
	public void setInvestPolicyExtFinder(
		InvestPolicyExtFinder investPolicyExtFinder) {
		this.investPolicyExtFinder = investPolicyExtFinder;
	}

	/**
	 * Returns the sys group local service.
	 *
	 * @return the sys group local service
	 */
	public com.viettel.ims.core.service.SysGroupLocalService getSysGroupLocalService() {
		return sysGroupLocalService;
	}

	/**
	 * Sets the sys group local service.
	 *
	 * @param sysGroupLocalService the sys group local service
	 */
	public void setSysGroupLocalService(
		com.viettel.ims.core.service.SysGroupLocalService sysGroupLocalService) {
		this.sysGroupLocalService = sysGroupLocalService;
	}

	/**
	 * Returns the sys group persistence.
	 *
	 * @return the sys group persistence
	 */
	public SysGroupPersistence getSysGroupPersistence() {
		return sysGroupPersistence;
	}

	/**
	 * Sets the sys group persistence.
	 *
	 * @param sysGroupPersistence the sys group persistence
	 */
	public void setSysGroupPersistence(SysGroupPersistence sysGroupPersistence) {
		this.sysGroupPersistence = sysGroupPersistence;
	}

	/**
	 * Returns the v invest policy local service.
	 *
	 * @return the v invest policy local service
	 */
	public com.viettel.ims.core.service.VInvestPolicyLocalService getVInvestPolicyLocalService() {
		return vInvestPolicyLocalService;
	}

	/**
	 * Sets the v invest policy local service.
	 *
	 * @param vInvestPolicyLocalService the v invest policy local service
	 */
	public void setVInvestPolicyLocalService(
		com.viettel.ims.core.service.VInvestPolicyLocalService vInvestPolicyLocalService) {
		this.vInvestPolicyLocalService = vInvestPolicyLocalService;
	}

	/**
	 * Returns the v invest policy persistence.
	 *
	 * @return the v invest policy persistence
	 */
	public VInvestPolicyPersistence getVInvestPolicyPersistence() {
		return vInvestPolicyPersistence;
	}

	/**
	 * Sets the v invest policy persistence.
	 *
	 * @param vInvestPolicyPersistence the v invest policy persistence
	 */
	public void setVInvestPolicyPersistence(
		VInvestPolicyPersistence vInvestPolicyPersistence) {
		this.vInvestPolicyPersistence = vInvestPolicyPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return FileAttachment.class;
	}

	protected String getModelClassName() {
		return FileAttachment.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = fileAttachmentPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.viettel.ims.core.service.FileAttachmentLocalService.class)
	protected com.viettel.ims.core.service.FileAttachmentLocalService fileAttachmentLocalService;
	@BeanReference(type = com.viettel.ims.core.service.FileAttachmentService.class)
	protected com.viettel.ims.core.service.FileAttachmentService fileAttachmentService;
	@BeanReference(type = FileAttachmentPersistence.class)
	protected FileAttachmentPersistence fileAttachmentPersistence;
	@BeanReference(type = com.viettel.ims.core.service.InvestCategoriesLocalService.class)
	protected com.viettel.ims.core.service.InvestCategoriesLocalService investCategoriesLocalService;
	@BeanReference(type = InvestCategoriesPersistence.class)
	protected InvestCategoriesPersistence investCategoriesPersistence;
	@BeanReference(type = com.viettel.ims.core.service.InvestPolicyLocalService.class)
	protected com.viettel.ims.core.service.InvestPolicyLocalService investPolicyLocalService;
	@BeanReference(type = InvestPolicyPersistence.class)
	protected InvestPolicyPersistence investPolicyPersistence;
	@BeanReference(type = InvestPolicyFinder.class)
	protected InvestPolicyFinder investPolicyFinder;
	@BeanReference(type = com.viettel.ims.core.service.InvestPolicyExtLocalService.class)
	protected com.viettel.ims.core.service.InvestPolicyExtLocalService investPolicyExtLocalService;
	@BeanReference(type = InvestPolicyExtPersistence.class)
	protected InvestPolicyExtPersistence investPolicyExtPersistence;
	@BeanReference(type = InvestPolicyExtFinder.class)
	protected InvestPolicyExtFinder investPolicyExtFinder;
	@BeanReference(type = com.viettel.ims.core.service.SysGroupLocalService.class)
	protected com.viettel.ims.core.service.SysGroupLocalService sysGroupLocalService;
	@BeanReference(type = SysGroupPersistence.class)
	protected SysGroupPersistence sysGroupPersistence;
	@BeanReference(type = com.viettel.ims.core.service.VInvestPolicyLocalService.class)
	protected com.viettel.ims.core.service.VInvestPolicyLocalService vInvestPolicyLocalService;
	@BeanReference(type = VInvestPolicyPersistence.class)
	protected VInvestPolicyPersistence vInvestPolicyPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private FileAttachmentServiceClpInvoker _clpInvoker = new FileAttachmentServiceClpInvoker();
}
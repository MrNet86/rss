package com.viettel.ims.controller;

import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.portlet.LiferayPortletMode;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.viettel.admin.core.model.CatEmployee;
import com.viettel.admin.core.model.SysGroup;
import com.viettel.admin.core.service.CatEmployeeLocalServiceUtil;
import com.viettel.admin.core.service.SysGroupLocalServiceUtil;
import com.viettel.ims.common.ActionConstants;
import com.viettel.ims.common.CommonUtils;
import com.viettel.ims.core.model.InvestCategories;
import com.viettel.ims.core.model.InvestPolicy;
import com.viettel.ims.core.model.impl.InvestCategoriesImpl;
import com.viettel.ims.core.model.impl.InvestPolicyImpl;
import com.viettel.ims.core.service.InvestCategoriesLocalServiceUtil;
import com.viettel.ims.core.service.InvestPolicyLocalServiceUtil;
import com.viettel.ims.utils.DateTimeUtils;

@Controller
@RequestMapping(value = "VIEW")
public class InvestPolicyController {

	private static SessionFactory sessionFactory = (SessionFactory) PortalBeanLocatorUtil
			.locate("liferaySessionFactory");

	@RequestMapping(params = "action=" + ActionConstants.EDIT_INVEST_POLICY)
	public String editPolicy(Model model, RenderRequest renderRequest,
			RenderResponse renderResponse) throws Exception {
		System.out.println("InvestController editPolicy :");

		InvestPolicy investPolicy = new InvestPolicyImpl();

		long investPolicyId = ParamUtil.getLong(renderRequest,
				"investPolicyId", 0L);

		if (investPolicyId > 0) {
			investPolicy = InvestPolicyLocalServiceUtil
					.fetchInvestPolicy(investPolicyId);
			SysGroup sysGroup = null;

			long infoProposeGroupId = investPolicy.getInfoProposeGroupId();
			String infoProposeGroupName = null;
			sysGroup = SysGroupLocalServiceUtil
					.fetchSysGroup(infoProposeGroupId);
			if (sysGroup != null) {
				infoProposeGroupName = sysGroup.getGroupCode() + "-"
						+ sysGroup.getFullName();
			}

			long infoVerifyGroupId = investPolicy.getInfoVerifyGroupId();
			String infoVerifyGroupName = null;
			sysGroup = SysGroupLocalServiceUtil
					.fetchSysGroup(infoVerifyGroupId);
			if (sysGroup != null) {
				infoVerifyGroupName = sysGroup.getGroupCode() + "-"
						+ sysGroup.getFullName();
			}

			long infoInvestCreateGroupId = investPolicy
					.getInfoInvestCreateGroupId();
			String infoInvestCreateGroupName = null;
			sysGroup = SysGroupLocalServiceUtil
					.fetchSysGroup(infoInvestCreateGroupId);
			if (sysGroup != null) {
				infoInvestCreateGroupName = sysGroup.getGroupCode() + "-"
						+ sysGroup.getFullName();
			}

			long infoInvestDeployGroupId = investPolicy
					.getInfoInvestCreateGroupId();
			String infoInvestDeployGroupName = null;
			sysGroup = SysGroupLocalServiceUtil
					.fetchSysGroup(infoInvestDeployGroupId);
			if (sysGroup != null) {
				infoInvestDeployGroupName = sysGroup.getGroupCode() + "-"
						+ sysGroup.getFullName();
			}

			long infoResponsibleUserId = investPolicy
					.getInfoResponsibleUserId();
			String infoResponsibleUserName = null;
			CatEmployee catEmployee = CatEmployeeLocalServiceUtil
					.fetchCatEmployee(infoResponsibleUserId);
			if (catEmployee != null) {
				infoResponsibleUserName = catEmployee.getCode() + "-"
						+ catEmployee.getFullName();
			}

			model.addAttribute("infoProposeGroupName", infoProposeGroupName);
			model.addAttribute("infoVerifyGroupName", infoVerifyGroupName);
			model.addAttribute("infoInvestCreateGroupName",
					infoInvestCreateGroupName);
			model.addAttribute("infoInvestDeployGroupName",
					infoInvestDeployGroupName);
			model.addAttribute("infoResponsibleUserName",
					infoResponsibleUserName);
		}


		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		PortletURL renderUrl = PortletURLFactoryUtil.create(renderRequest,
				themeDisplay.getPortletDisplay().getId(),
				themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);
		renderUrl.setWindowState(LiferayWindowState.NORMAL);
		renderUrl.setPortletMode(LiferayPortletMode.VIEW);
		renderUrl.setParameter("action", ActionConstants.VIEW_INVEST_POLICY);
		model.addAttribute("backURL", renderUrl.toString());


		model.addAttribute("investPolicy", investPolicy);

		return "invest/policy/editPolicy";
	}

	@InitBinder(value = "investPolicy")
	@ActionMapping(params = "action=" + ActionConstants.UPDATE_INVEST_POLICY)
	public void updatePolicy(
			@ModelAttribute("investPolicy") InvestPolicyImpl investPolicyImpl,
			BindingResult bindingResult, ActionRequest request,
			ActionResponse response) throws Exception {
		System.out.println("InvestController.updatePolicy");

		if (bindingResult.hasErrors()) {
			System.out.println("hasErrors :" + bindingResult.getErrorCount());
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();
			for (FieldError fieldError : fieldErrors) {
				System.out.println("fieldError Field:" + fieldError.getField()
						+ " || objectName: " + fieldError.getObjectName());
			}
		} else {
			System.out.println("bindingResult has no Errors");
		}

		String rowIndexes = request.getParameter("rowIndexes");
		System.out.println("rowIndexes :"+rowIndexes);
		String[] indexOfRows = rowIndexes.split(",");

		// Update
		if (investPolicyImpl != null
				&& investPolicyImpl.getInvestPolicyId() > 0) {

			String service = "";
			String[] str = request.getParameterValues("service");
			for (int i = 0; i < str.length; i++) {
				service += str[i] + ",";
			}
			if (!"".equals(service)) {
				service = service.substring(0, service.length() - 1);
			}

			System.out.println("service :" + service);
			investPolicyImpl.setInfoService(service);

			Date infoPolicyDate = DateTimeUtils.getInputDate(request,
					"infoPolicyDate", false);
			Date infoPolicyDeployDate = DateTimeUtils.getInputDate(request,
					"infoPolicyDeployDate", false);

			investPolicyImpl.setInfoPolicyDate(infoPolicyDate);
			investPolicyImpl.setInfoPolicyDeployDate(infoPolicyDeployDate);

			investPolicyImpl.setModifieldDate(new Date());
			investPolicyImpl.setModifieldId(CommonUtils.getUserId(request));

			updateListInvestCategories(request,
					investPolicyImpl.getInvestPolicyId(), indexOfRows);

			InvestPolicyLocalServiceUtil.updateInvestPolicy(investPolicyImpl);
		}
		// Create New
		else {
			System.out.println("---------investPolicyImpl is null");

			investPolicyImpl.setIsActive(1);
			investPolicyImpl.setCreatedDate(new Date());
			investPolicyImpl.setCreatedId(CommonUtils.getUserId(request));
			investPolicyImpl.setModifieldDate(new Date());
			investPolicyImpl.setModifieldId(CommonUtils.getUserId(request));

			InvestPolicyLocalServiceUtil.addInvestPolicy(investPolicyImpl);

			// Get list of investCategories
			updateListInvestCategories(request,
					investPolicyImpl.getInvestPolicyId(), indexOfRows);

		}
	}

	private void updateListInvestCategories(ActionRequest request,
			long investPolicyId, String[] indexOfRows) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("-------------updateListInvestCategories----------");
		// Update isActive = 0 for all investCategories
		List<InvestCategories> lst = InvestCategoriesLocalServiceUtil
				.findByObjId(investPolicyId, 1);
		for (InvestCategories investCategories : lst) {
			investCategories.setIsActive(0L);
			InvestCategoriesLocalServiceUtil
					.updateInvestCategories(investCategories);
		}
		// Update investCategories
		for (int i = 0; i < indexOfRows.length; i++) {
			Long investCategoriesId = ParamUtil.getLong(request,
					"investCategoriesId" + indexOfRows[i]);
			updateInvestCategories(request, indexOfRows[i], investCategoriesId,
					investPolicyId);
		}
	}

	private void updateInvestCategories(ActionRequest request,
			String indexOfRows, Long investCategoriesId, Long investPolicyId)
					throws Exception {
		// TODO Auto-generated method stub

		String name = ParamUtil.getString(request, "name" + indexOfRows);
		Long unitId = ParamUtil.getLong(request, "unitId" + indexOfRows);
		Long quantity = ParamUtil.getLong(request, "quantity" + indexOfRows);
		Double vat = ParamUtil.getDouble(request, "vat" + indexOfRows);

		String description = ParamUtil.getString(request, "description"
				+ indexOfRows);
		Long catCurrencyId = ParamUtil.getLong(request, "catCurrencyId"
				+ indexOfRows);

		Double unitPrice = ParamUtil.getDouble(request, "unitPrice"
				+ indexOfRows);

		InvestCategories obj = null;// InvestCategoriesLocalServiceUtil.createInvestCategories(investCategoriesId);
		if (investCategoriesId != null && investCategoriesId > 0) {
			obj = InvestCategoriesLocalServiceUtil
					.fetchInvestCategories(investCategoriesId);
		} else {
			obj = new InvestCategoriesImpl();
		}

		obj.setName(name);
		obj.setUnitId(unitId);
		obj.setQuantity(quantity);
		obj.setVat(vat);
		obj.setDescription(description);
		obj.setCatCurrencyId(catCurrencyId);
		obj.setUnitPrice(unitPrice);

		obj.setIsActive(1);
		if (obj.getCreatedDate() == null) {
			obj.setCreatedDate(new Date());
		}
		obj.setModifieldDate(new Date());

		obj.setType(ActionConstants.INVEST_POLICY_VALUE);
		obj.setObjId(investPolicyId);

		InvestCategoriesLocalServiceUtil.updateInvestCategories(obj);
	}

	@InitBinder(value = "investPolicy")
	@ActionMapping(params = "action=" + ActionConstants.UPDATE_INVEST_POLICY_FROM_UPLOAD)
	public void updatePolicyFromUpload(
			@ModelAttribute("investPolicy") InvestPolicyImpl investPolicyImpl,
			BindingResult bindingResult, ActionRequest request,
			ActionResponse response) throws Exception {
		System.out.println("InvestController.updatePolicyFromUpload");

		UploadPortletRequest uploadPortletRequest =
				PortalUtil.getUploadPortletRequest(request);

		if (bindingResult.hasErrors()) {
			System.out.println("hasErrors :" + bindingResult.getErrorCount());
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();
			for (FieldError fieldError : fieldErrors) {
				System.out.println("fieldError Field:" + fieldError.getField()
						+ " || objectName: " + fieldError.getObjectName());
			}
		} else {
			System.out.println("bindingResult has no Errors");
		}

		String rowIndexes = ParamUtil.getString(uploadPortletRequest, "rowIndexes");

		String[] indexOfRows = rowIndexes.split(",");

		// Update
		if (investPolicyImpl != null
				&& investPolicyImpl.getInvestPolicyId() > 0) {
			System.out.println("investPolicyImpl is not null");
			String service = "";
			String[] str = ParamUtil.getParameterValues(uploadPortletRequest, "service");
			for (int i = 0; i < str.length; i++) {
				service += str[i] + ",";
			}
			if (!"".equals(service)) {
				service = service.substring(0, service.length() - 1);
			}

			System.out.println("service :" + service);
			investPolicyImpl.setInfoService(service);

			Date infoPolicyDate = DateTimeUtils.getInputDateFromUpload(uploadPortletRequest,
					"infoPolicyDate", false);
			Date infoPolicyDeployDate = DateTimeUtils.getInputDateFromUpload(uploadPortletRequest,
					"infoPolicyDeployDate", false);

			investPolicyImpl.setInfoPolicyDate(infoPolicyDate);
			investPolicyImpl.setInfoPolicyDeployDate(infoPolicyDeployDate);

			investPolicyImpl.setModifieldDate(new Date());
			investPolicyImpl.setModifieldId(CommonUtils.getUserId(request));

			updateListInvestCategoriesFromUpload(uploadPortletRequest,
					investPolicyImpl.getInvestPolicyId(), indexOfRows);

			InvestPolicyLocalServiceUtil.updateInvestPolicy(investPolicyImpl);
		}
		// Create New
		else {
			System.out.println("---------investPolicyImpl is null");

			investPolicyImpl.setIsActive(1);
			investPolicyImpl.setCreatedDate(new Date());
			investPolicyImpl.setCreatedId(CommonUtils.getUserId(request));
			investPolicyImpl.setModifieldDate(new Date());
			investPolicyImpl.setModifieldId(CommonUtils.getUserId(request));

			InvestPolicyLocalServiceUtil.addInvestPolicy(investPolicyImpl);

			// Get list of investCategories
			updateListInvestCategoriesFromUpload(uploadPortletRequest,
					investPolicyImpl.getInvestPolicyId(), indexOfRows);
		}
	}

	private void updateListInvestCategoriesFromUpload(UploadPortletRequest uploadPortletRequest,
			long investPolicyId, String[] indexOfRows) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("-------------updateListInvestCategoriesFromUpload----------");
		// Update isActive = 0 for all investCategories
		List<InvestCategories> lst = InvestCategoriesLocalServiceUtil
				.findByObjId(investPolicyId, 1);
		for (InvestCategories investCategories : lst) {
			investCategories.setIsActive(0L);
			InvestCategoriesLocalServiceUtil
			.updateInvestCategories(investCategories);
		}
		// Update investCategories
		for (int i = 0; i < indexOfRows.length; i++) {
			Long investCategoriesId = ParamUtil.getLong(uploadPortletRequest,
					"investCategoriesId" + indexOfRows[i]);
			updateInvestCategoriesFromUpload(uploadPortletRequest, indexOfRows[i], investCategoriesId,
					investPolicyId);
		}
	}

	private void updateInvestCategoriesFromUpload(UploadPortletRequest uploadPortletRequest,
			String indexOfRows, Long investCategoriesId, Long investPolicyId)
			throws Exception {
		// TODO Auto-generated method stub
		String name = ParamUtil.getString(uploadPortletRequest, "name" + indexOfRows);
		Long unitId = ParamUtil.getLong(uploadPortletRequest, "unitId" + indexOfRows);
		Long quantity = ParamUtil.getLong(uploadPortletRequest, "quantity" + indexOfRows);
		Double vat = ParamUtil.getDouble(uploadPortletRequest, "vat" + indexOfRows);

		System.out.println("updateInvestCategoriesFromUpload name :"+name +"|| unitId :"+unitId);

		String description = ParamUtil.getString(uploadPortletRequest, "description"
				+ indexOfRows);
		Long catCurrencyId = ParamUtil.getLong(uploadPortletRequest, "catCurrencyId"
				+ indexOfRows);

		Double unitPrice = ParamUtil.getDouble(uploadPortletRequest, "unitPrice"
				+ indexOfRows);

		InvestCategories obj = null;// InvestCategoriesLocalServiceUtil.createInvestCategories(investCategoriesId);
		if (investCategoriesId != null && investCategoriesId > 0) {
			obj = InvestCategoriesLocalServiceUtil
					.fetchInvestCategories(investCategoriesId);
		} else {
			obj = new InvestCategoriesImpl();
		}

		obj.setName(name);
		obj.setUnitId(unitId);
		obj.setQuantity(quantity);
		obj.setVat(vat);
		obj.setDescription(description);
		obj.setCatCurrencyId(catCurrencyId);
		obj.setUnitPrice(unitPrice);

		obj.setIsActive(1);
		if (obj.getCreatedDate() == null) {
			obj.setCreatedDate(new Date());
		}
		obj.setModifieldDate(new Date());

		obj.setType(ActionConstants.INVEST_POLICY_VALUE);
		obj.setObjId(investPolicyId);

		InvestCategoriesLocalServiceUtil.updateInvestCategories(obj);
	}
}

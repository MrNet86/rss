package com.viettel.ims.utils;

import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;

public class DateTimeUtils {

	public static Date getInputDate(PortletRequest request, String param, boolean isStartDay) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.AM_PM, Calendar.AM);

		int month = ParamUtil.getInteger(request, param + "Month");
		int day = ParamUtil.getInteger(request, param + "Day");
		int year = ParamUtil.getInteger(request, param + "Year");
		if (isStartDay) {
			cal.set(year, month, day, 0, 0, 0);
			cal.set(Calendar.MILLISECOND, 0);
		} else {
			cal.set(year, month, day, 23, 59, 59);
			cal.set(Calendar.MILLISECOND, 999);
		}
		return cal.getTime();
	}

	public static Date getInputDateFromUpload(
			UploadPortletRequest uploadPortletRequest, String param,
			boolean isStartDay) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.AM_PM, Calendar.AM);

		int month = ParamUtil.getInteger(uploadPortletRequest, param + "Month");
		int day = ParamUtil.getInteger(uploadPortletRequest, param + "Day");
		int year = ParamUtil.getInteger(uploadPortletRequest, param + "Year");
		if (isStartDay) {
			cal.set(year, month, day, 0, 0, 0);
			cal.set(Calendar.MILLISECOND, 0);
		} else {
			cal.set(year, month, day, 23, 59, 59);
			cal.set(Calendar.MILLISECOND, 999);
		}
		return cal.getTime();
	}

}

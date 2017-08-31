package com.vnpt.portal.user.utils;

import java.sql.Connection;
import java.util.Properties;

import com.liferay.portal.kernel.dao.jdbc.DataSourceFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PrefsPropsUtil;

public class VnptUtils {

	public String[] splitFullName(String fullName) throws SystemException {

		String driver = PrefsPropsUtil
				.getString("jdbc.default.driverClassName");
		String url = PrefsPropsUtil.getString("jdbc.default.url");
		String dbuser = PrefsPropsUtil.getString("jdbc.default.username");
		String dbpassw = PrefsPropsUtil.getString("jdbc.default.password");

		Properties properties = new Properties();

		properties.setProperty("driverClassName", driver);
		properties.setProperty("url", url);
		properties.setProperty("userName", dbuser);
		properties.setProperty("password", dbpassw);

		try {
			
			Connection connection =  DataSourceFactoryUtil.initDataSource(properties).getConnection();
			
			connection.prepareStatement("").execute();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
}

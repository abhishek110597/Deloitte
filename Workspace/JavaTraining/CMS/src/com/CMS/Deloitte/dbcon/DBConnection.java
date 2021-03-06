package com.CMS.Deloitte.dbcon;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {
	public static Connection makeConnection() {
		Connection conn = null;
		try {
			FileReader reader = new FileReader("c://Deloitte//mydb.properties");
			Properties properties = new Properties();
			properties.load(reader);

			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");

			Class.forName(driver);
			// System.out.println("Driver Loaded");

			conn = DriverManager.getConnection(url, username, password);
			// System.out.println("Connected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;

	}

}

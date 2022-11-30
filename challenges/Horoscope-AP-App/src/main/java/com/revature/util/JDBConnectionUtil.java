package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDBConnectionUtil {

	public static Logger Logger = LoggerFactory.getLogger(JDBConnectionUtil.class);
	static final String JDBC_DRIVER = "org.h2.Driver";
	
	//establishing getConnection
	public static Connection getConnection() {
		
		//connection stated as null
		Connection conn = null;
		try {
			//connection to the driver
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection("jdbc:h2:~/horoscope", "admin", "password");
			
		} catch (SQLException e) {
			Logger.info("Exception occured in JDBConnectionUtil getConnection()");
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;

	}
}

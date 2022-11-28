package JDBConnectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDBConnectionUtil {

	public static Logger Logger = LoggerFactory.getLogger(JDBConnectionUtil.class);
	
	//establishing getConnection
	public static Connection getConnection() {
		
		//connection stated as null
		Connection conn = null;
		try {
			//connection to the driver
			conn = DriverManager.getConnection(System.getenv("data_base_url"), System.getenv("data_base_un"), System.getenv("data_pw"));
			
		} catch (SQLException e) {
			Logger.info("Exception occured in JDBConnectionUtil getConnection()");
			e.printStackTrace();
		}
		return conn;

	}
}

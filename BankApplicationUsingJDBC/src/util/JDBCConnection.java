package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {

	public static Connection connection = null;  
	
	private JDBCConnection() {
		
	}
	
	public static Connection getConnection() {
		
		if(connection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "vicky");
				//System.out.println(connection);
				return connection;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}

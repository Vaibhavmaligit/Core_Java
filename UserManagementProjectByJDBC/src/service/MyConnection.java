package service;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	public static Connection connection = null ;
	
	private MyConnection() {
		
	}
	
	public static Connection getConnection() {
		
		if(connection == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "vicky");
				return connection;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}

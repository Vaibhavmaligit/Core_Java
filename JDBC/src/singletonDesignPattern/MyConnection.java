package singletonDesignPattern;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	public static Connection connection = null;
	
	private MyConnection() {
		
	}
	
	public static Connection getConnection() {
		
		if(connection == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "vicky");
				//System.out.println("if condition connection : "+ connection); //to check it prints same hash code
				return connection;
			} catch (Exception e) {
				e.printStackTrace();
		}
	}
		//System.out.println("outside connection : "+connection ); //to check it prints same hash code
	return connection;
}
}
package jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) {
		System.out.println("==MAIN STARTED==");
		
		try { 
			//step 1 : load driver class
			Class.forName("com.mysql.jdbc.Driver");
			//step 2 : create connection
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "vicky");
			// step 3 : build SQL query
			String sql = "insert into student values(101,'VAIBHAV','NASHIK'),(102,'JAY','PUNE'),(103,'RAJ','MUMBAI')";
			// step 4 : create statement
			Statement st = cn.createStatement();
			// step 5 : execute SQL query
			st.execute(sql);
			// step 6 : close connection
			cn.close();
			System.out.println("RECORD INSERTED SUCCESSFULLY");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 
}

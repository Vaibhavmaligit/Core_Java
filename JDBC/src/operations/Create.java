package operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "vicky");
			String s = "create table employee(empId int, empName varchar(50), empSalary varchar(50))";
			Statement st = cn.createStatement();
			st.execute(s);
			cn.close();
			System.out.println("TABLE CREATED SUCCESSFULLY");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

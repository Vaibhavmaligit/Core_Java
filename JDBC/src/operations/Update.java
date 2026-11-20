package operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "vicky");
			String s = "update employee set empSalary = 60000 where empId = 22";
			Statement st = cn.createStatement();
			int i = st.executeUpdate(s);
			System.out.println("UPDATE COUNT : "+i);
			cn.close();
			System.out.println("RECORD UPDATED SUCCESSFULLY");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

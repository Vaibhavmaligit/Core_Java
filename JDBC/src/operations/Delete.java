package operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "vicky");
			String s = "delete from employee where empId = 33";
			Statement st = cn.createStatement();
			int i = st.executeUpdate(s);
			System.out.println("DELETE COUNT"+ i);
			cn.close();
			System.out.println("RECORDS DELETED SUCCESSFULLY");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

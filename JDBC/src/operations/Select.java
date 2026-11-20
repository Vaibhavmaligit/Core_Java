package operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "vicky");
			String s = "select * from employee";
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(s);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString("empName")+" "+rs.getInt("empSalary"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

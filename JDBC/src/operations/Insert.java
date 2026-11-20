package operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "vicky");
			String s = "insert into employee values (11,'LALIT',70000),(22,'JAY',50000),(33,'RAJ',40000),(44,'ROHAN',30000)";
			Statement st  = cn.createStatement();
			st.execute(s);
			cn.close();
			System.out.println("RECORD INSERTED SUCCESSFULLY");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

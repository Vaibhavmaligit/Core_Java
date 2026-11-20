package jdbcexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCProductExample {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "vicky");
			//String s = "insert into product values (11,'MOBILE','30000'),(22,'LAPTOP','80000'),(33,'SPEAKER','20000')"; // INSERT
			//String s = "update product set pPrice = 10000 where pId = 33"; // UPDATE
			String s = "delete from product where pId = 22"; // DELETE
			
			Statement st = cn.createStatement();
			st.execute(s);
			cn.close();
			System.out.println("RECORD INSERTED SUCCESSFULLY");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package statementInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import singletonDesignPattern.MyConnection;



public class UsingPreparedStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER STUDENT ID");
		int sId = sc.nextInt();
		System.out.println("ENTER STUDENT NAME");
		String name = sc.next();
		System.out.println("ENTER STUDENT ADDRESS");
		String address = sc.next();
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "vicky");
			Connection cn = MyConnection.getConnection();
			String s = "insert into student values(?,?,?)";
			PreparedStatement ps = cn.prepareStatement(s);
			ps.setInt(1, sId);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.execute();
			//cn.close();
			sc.close();
			System.out.println("RECORD INSERTED SUCCESSFULLY");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

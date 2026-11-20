package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import util.JDBCConnection;
import util.Validator;

public class UpdateDetails {
Scanner sc = new Scanner(System.in);
	
	public void updateName() {
		boolean flag = true;
		while(flag) {
		System.out.println("ENTER ACCOUNT NO.");
		long accno = sc.nextLong();
		try {
		Connection cn = JDBCConnection.getConnection();
		String s = "select * from bank where accountNo = ?";
		PreparedStatement ps = cn.prepareStatement(s);
		ps.setLong(1, accno);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			//System.out.println("ENTER NEW NAME TO UPDATE");
			//String newname = sc.next();
			
			String s1 = "update bank set accountHolderName = ? where accountNo = ?";
			PreparedStatement ps1 = cn.prepareStatement(s1);
			ps1.setString(1, Validator.validName());
			ps1.setLong(2, accno);
			ps1.executeUpdate();
			System.out.println("NAME UPDATED SUCCESSFULLY");
			flag = false;
		}else {
			System.out.println("INVALID ACCOUNT PLEASE TRY AGAIN");
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
	
	public void updateMobileNo() {
		boolean flag = true;
		while(flag) {
		System.out.println("ENTER ACCOUNT NO.");
		long accno = sc.nextLong();
		try {
		Connection cn = JDBCConnection.getConnection();
		String s = "select * from bank where accountNo = ?";
		PreparedStatement ps = cn.prepareStatement(s);
		ps.setLong(1, accno);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			System.out.println("ENTER NEW MOBILE NO. TO UPDATE");
			long newno = sc.nextLong();
			String s1 = "update bank set MobileNo = ? where accountNo = ?";
			PreparedStatement ps1 = cn.prepareStatement(s1);
			ps1.setLong(1, newno);
			ps1.setLong(2, accno);
			ps1.executeUpdate();
			System.out.println("MOBILE NO. UPDATED SUCCESSFULLY");
			flag = false;
		}else {
			System.out.println("INVALID ACCOUNT PLEASE TRY AGAIN");
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
	
	public void updateAddress() {
		boolean flag = true;
		while(flag) {
		System.out.println("ENTER ACCOUNT NO.");
		long accno = sc.nextLong();
		try {
		Connection cn = JDBCConnection.getConnection();
		String s = "select * from bank where accountNo = ?";
		PreparedStatement ps = cn.prepareStatement(s);
		ps.setLong(1, accno);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			System.out.println("ENTER NEW ADDRESS TO UPDATE");
			String newaddress = sc.next();
			String s1 = "update bank set address = ? where accountNo = ?";
			PreparedStatement ps1 = cn.prepareStatement(s1);
			ps1.setString(1, newaddress);
			ps1.setLong(2, accno);
			ps1.executeUpdate();
			System.out.println("ADDRESS UPDATED SUCCESSFULLY");
			flag = false;
		}else {
			System.out.println("INVALID ACCOUNT PLEASE TRY AGAIN");
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
	
	public void updateEmail() {
		boolean flag = true;
		while(flag) {
		System.out.println("ENTER ACCOUNT NO.");
		long accno = sc.nextLong();
		try {
		Connection cn = JDBCConnection.getConnection();
		String s = "select * from bank where accountNo = ?";
		PreparedStatement ps = cn.prepareStatement(s);
		ps.setLong(1, accno);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			//System.out.println("ENTER NEW EMAIL ID TO UPDATE");
			//String newemail = sc.next();
			String s1 = "update bank set emailId = ? where accountNo = ?";
			PreparedStatement ps1 = cn.prepareStatement(s1);
			ps1.setString(1, Validator.validEmail());
			ps1.setLong(2, accno);
			ps1.executeUpdate();
			System.out.println("EMAIL ID UPDATED SUCCESSFULLY");
			flag = false;
		}else {
			System.out.println("INVALID ACCOUNT PLEASE TRY AGAIN");
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
}

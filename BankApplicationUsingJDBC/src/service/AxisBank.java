package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

import customException.IncorrectMobileNoFormatException;
import customException.InvalidInputException;
import util.JDBCConnection;
import util.Validator;

public class AxisBank implements RBI {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void createDatabase() {
		try {
			Connection cn = JDBCConnection.getConnection();
			String s = "create table bank(AccountNo bigInt primary key, AccountHolderName varchar(50),Address varchar(200),MobileNo bigInt,EmailId varchar(50),AdharId varchar(15),PAN varchar(10),AccountBalance decimal(10,2) )";
			Statement smt = cn.createStatement();
			smt.execute(s);
			System.out.println("table created");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void createAccount()  {
		int crac;
		while(true) {
	    	 try {
		 System.out.println("ENTER NO. YOU NEED TO CREATE ACCOUNT");
		   crac = sc.nextInt();
		 if(crac > 0) {
			 break;
		 }else {
			 throw new InvalidInputException("ENTER NUMBER GRATER THAN 0 ");
		 }
	    	 }catch (InvalidInputException iie) {
				System.out.println(iie);
			}catch (InputMismatchException ime) {
				System.out.println(ime+" : ENTER NUMBERS ONLY");
				sc.next();
			}
	     }
		 try {
			 Connection cn = JDBCConnection.getConnection();
			 String s = "insert into bank values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = cn.prepareStatement(s);
			
            for(int i = 1; i<= crac; i++) {
				
				System.out.println("\nENTER USER "+i+" DETAILS");
			long accountNoGenerate = (long)(Math.random()*Math.pow(10, 12));
			System.out.println("YOUR ACCOUNT NO :\n"+accountNoGenerate);
			ps.setLong(1, accountNoGenerate);
			
			//System.out.println("ENTER ACCOUNT HOLDER NAME");
			//String name = sc.next();
			ps.setString(2, Validator.validName());
			
			System.out.println("ENTER ADDRESS");
			String address = sc.next();
			ps.setString(3, address);
			
			while(true) {
				try {
			System.out.println("ENTER MOBILE NUMBER");
			long mobile = sc.nextLong();
			if (mobile>=6000000000l && mobile<=9999999999l) {
				ps.setLong(4, mobile);
				break;
			}else { throw new IncorrectMobileNoFormatException("INVALID MOBILE NO. PLEASE ENTER 10 DIGITS NO. STARTING FROM 6 - 9");
			}
				}catch (IncorrectMobileNoFormatException ime) {
				System.out.println(ime);
				}catch (InputMismatchException e ) {
					System.out.println(e);
					sc.next();
				}
			}
			
			
			//System.out.println("ENTER EMAIL ID");
			//String email = sc.next();
			ps.setString(5, Validator.validEmail());
			
			//System.out.println("ENTER AADHAR ID");
			//long adhar = sc.nextLong();
			ps.setString(6, Validator.validAdharId());
			
			
			//System.out.println("ENTER PAN");
			//String pan = sc.next();
			ps.setString(7, Validator.validPanCard());
			
			double balance = 5000.00;
			System.out.println("YOUR ACCOUNT BALANCE :\n"+balance);
			ps.setDouble(8, balance);
			
			ps.execute();
			
			System.out.println("ACCOUNT CREATED SUCCESSFULLY");
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void displayAccountDetails() {
		int dispacc;
		while(true) {
	    	 try {
		 System.out.println("ENTER NO. YOU NEED TO DISPLAY ACCOUNT");
		 dispacc = sc.nextInt();
		 if(dispacc > 0) {
			 break;
		 }else {
			 throw new InvalidInputException("ENTER NUMBER GRATER THAN 0 ");
		 }
	    	 }catch (InvalidInputException iie) {
				System.out.println(iie);
			}catch (InputMismatchException ime) {
				System.out.println(ime+" : ENTER NUMBERS ONLY");
				sc.next();
			}
	     }
		 
		 for(int i = 1; i<=dispacc; i++) {
			 boolean flag = true;
			 while(flag) {
			 System.out.println("ENTER USER "+i+" ACCOUNT NO.");
			 long accno = sc.nextLong();
		 try {
			 Connection cn = JDBCConnection.getConnection();
			 String s = "select * from bank where AccountNO = ?";
			 PreparedStatement ps = cn.prepareStatement(s);
			 ps.setLong(1, accno);
			 ResultSet rs = ps.executeQuery();
			 if(rs.next()) {
				 System.out.println("----------------------------------------");
				 System.out.println("ACCOUNT NO : "+rs.getLong(1));
				 System.out.println("ACCOUNT HOLDER NAME : "+rs.getString(2));
				 System.out.println("ADDRESS : "+rs.getString(3));
				 System.out.println("MOBILE NO : "+rs.getLong(4));
				 System.out.println("EMAIL ID : "+rs.getString(5));
				 System.out.println("AADHAR ID : "+rs.getString(6));
				 System.out.println("PAN : "+rs.getString(7));
				 System.out.println("REMAINING BALANCE : "+rs.getDouble(8));
				 System.out.println("----------------------------------------");
				 flag = false;
			 }else {
				 System.out.println("ACCOUNT NO. NOT FOUND / INVALID ACCOUNT"); 
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
  }
}

	@Override
	public void displayAccountBalance() {
		
		System.out.println("ENTER ACCOUNT NO.");
		 long accno = sc.nextLong();
		 try {
			 Connection cn = JDBCConnection.getConnection();
			 String s = "select accountbalance from bank where accountno = ?";
			 PreparedStatement ps = cn.prepareStatement(s);
			 ps.setLong(1, accno);
			 ResultSet rs = ps.executeQuery();
			 if(rs.next()) {
				 System.out.println("REMAINING ACCOUNT BALANCE :\n"+rs.getDouble(1));
			 }else {
				 System.out.println("ACCOUNT NO. NOT FOUND / INVALID ACCOUNT");
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void depositAmount() {
		System.out.println("ENTER ACCOUNT NO.");
		 long accno = sc.nextLong();
		 try {
			 Connection cn = JDBCConnection.getConnection();
			 String s = "select * from bank where AccountNO = ?";
			 PreparedStatement ps = cn.prepareStatement(s);
			 ps.setLong(1, accno);
			 ResultSet rs = ps.executeQuery();
			 if(rs.next()) {
				 System.out.println("ENTER AMOUNT TO DEPOSIT");
				 double damount = sc.nextDouble();
				 String s1 = "update bank set accountBalance = accountBalance + ? where accountno = ?";
				 PreparedStatement ps1 = cn.prepareStatement(s1);
				 ps1.setLong(2, accno);
				 ps1.setDouble(1, damount);
				 ps1.executeUpdate();
				 System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
			 }else {
				 System.out.println("ACCOUNT NO. NOT FOUND / INVALID ACCOUNT");
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void withdrawAmount() {
		System.out.println("ENTER ACCOUNT NO.");
		 long accno = sc.nextLong();
		 try {
			 Connection cn = JDBCConnection.getConnection();
			 String s = "select * from bank where AccountNO = ?";
			 PreparedStatement ps = cn.prepareStatement(s);
			 ps.setLong(1, accno);
			 ResultSet rs = ps.executeQuery();
			 if(rs.next()) {
				 double balance = rs.getDouble("accountBalance");
				while(true) {
				 System.out.println("ENTER AMOUNT TO WITHDRAW");
				 double damount = sc.nextDouble();
				 if (damount <= 0) {
		                System.out.println("ENTER AMOUNT GRATER THAN 0");
		                continue;
		            }
		            else if (damount > balance) {
		                System.out.println("INSUFFICIENT BALANCE PLEASE TRY AGAIN");
		                continue;
		            }
		            else {
				 String s1 = "update bank set accountBalance = accountBalance - ? where accountno = ?";
				 PreparedStatement ps1 = cn.prepareStatement(s1);
				 ps1.setLong(2, accno);
				 ps1.setDouble(1, damount);
				 ps1.executeUpdate();
				 System.out.println("AMOUNT WITHDRAWN SUCCESSFULLY");
				 break;
		            }
				}
			 }else {
				 System.out.println("ACCOUNT NO. NOT FOUND / INVALID ACCOUNT");
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateAccountDetails() {
		UpdateDetails ud = new UpdateDetails();
		boolean flag = true;
		while(flag) {
			
		System.out.println("-------------------------------");
		System.out.println("1.UPDATE NAME");
		System.out.println("-------------------------------");
		System.out.println("2.UPDATE ADDRESS");
		System.out.println("-------------------------------");
		System.out.println("3.UPDATE MOBILE NO.");
		System.out.println("-------------------------------");
		System.out.println("4.UPDATE EMAIL");
		System.out.println("-------------------------------");
		System.out.println("5.EXIT");
		System.out.println("-------------------------------");
		System.out.println("ENTER CHOICE FROM 1 - 5");
		System.out.println("-------------------------------");
		
		int ch = sc.nextInt();
		
			switch (ch) {
			case 1:
                ud.updateName();
				break;

			case 2:
		        ud.updateAddress();
				break;

			case 3:
				ud.updateMobileNo();
				break;

			case 4:
				ud.updateEmail();
				break;

			case 5:
				System.out.println("YOU ARE REDIRECTED TO MAIN MENU >>>");
				flag=false;
				break;
				
			default:
				System.out.println("INCORRERT INPUT");
				break;
			}
		
		}
		
	}

	@Override
	public void deleteAccount() {
		
		int delete;
		while(true) {
	    	 try {
		 System.out.println("ENTER NO. YOU NEED TO CREATE ACCOUNT");
		   delete = sc.nextInt();
		 if(delete > 0) {
			 break;
		 }else {
			 throw new InvalidInputException("ENTER NUMBER GRATER THAN 0 ");
		 }
	    	 }catch (InvalidInputException iie) {
				System.out.println(iie);
			}catch (InputMismatchException ime) {
				System.out.println(ime+" : ENTER NUMBERS ONLY");
				sc.next();
			}
	     }
		
		for(int i = 1; i<= delete; i++) {
			boolean flag = true;
			while(flag) {
			System.out.println("ENTER ACCOUNT "+i+" TO DELETE");
			long deleteacc = sc.nextLong();
			try {
				Connection cn = JDBCConnection.getConnection();
				String s = "Select * from bank where accountNo = ?";
				PreparedStatement ps = cn.prepareStatement(s);
				ps.setLong(1, deleteacc);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					String s1 = "delete from bank where accountNo = ?";
					PreparedStatement ps1= cn.prepareStatement(s1);
					ps1.setLong(1, deleteacc);
					ps1.executeUpdate();
					System.out.println("ACCOUNT DELETED SUCCESSFULLY");
					flag = false;
				}else {
					System.out.println("INVALID ACCOUNT PLEASE TRY AGAIN");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		}
		
	}

	

}

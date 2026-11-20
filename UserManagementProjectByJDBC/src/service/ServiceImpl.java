package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

import customException.IncorrectEmailIdFormatExecption;
import customException.IncorrectIdFormatException;
import customException.IncorrectMobileNumberFormatException;
import customException.IncorrectNameFormatException;
import validator.Validator;

public class ServiceImpl implements Service {
	
	Scanner sc = new Scanner(System.in);

	public void createUser() {
		try {
			Connection cn = MyConnection.getConnection();
			String s = "create table user(userId int primary key,userName varchar(50),userAddress varchar(200),userMobileNo bigInt,userEmailId varchar(50) )";
			Statement smt = cn.createStatement();
			smt.execute(s);
			//System.out.println("table created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertUser() {
		
		int adduser;
		while (true) {
		    try {
		        System.out.println("ENTER NO. YOU NEED TO ADD USERS");
		        adduser = sc.nextInt();
		        if (adduser > 0) {
		            break;
		        } else {
		            System.out.println("PLEASE ENTER NUMBER GREATER THAN 0");
		        }
		    } catch (InputMismatchException e) {
		       // e.printStackTrace();
		    	System.out.println("PLEASE ENTER NUMBER ONLY");
		        sc.next();
		    }
		}
		
		try {
			Connection cn = MyConnection.getConnection();
			String s = "insert into user values(?,?,?,?,?)";
			PreparedStatement ps = cn.prepareStatement(s);
			
			for(int i = 1; i<= adduser; i++) {
				
				System.out.println("ENTER USER "+i+" DETAILS");
				
				System.out.println("ENTER USER ID");
				int uId;
				while(true) {
					try {
					uId = sc.nextInt();
					Validator.validId(uId);
					break;
					}catch (IncorrectIdFormatException ie) {
						System.out.println(ie);
						System.out.println("PLEASE ENTER USER ID AGAIN");
					}
				}
				System.out.println("ENTER USER NAME");
				String uName;
				while(true) {
					try {
						uName = sc.next();
						Validator.validName(uName);
						break;
					} catch (IncorrectNameFormatException ine) {
						System.out.println(ine);
						System.out.println("PLEASE ENTER USER NAME AGAIN");
					}
				}
				System.out.println("ENTER USER MOBILE NO.");
				long mobileNo;
				while(true) {
					try {
						mobileNo = sc.nextLong();
						Validator.validMoNumber(mobileNo);
						break;
					} catch (IncorrectMobileNumberFormatException | InputMismatchException ime) {
						System.out.println(ime);
						System.out.println("PLEASE ENTER MOBILE NO. AGAIN");
					}
				}
				System.out.println("ENTER USER ADDRESS");
				String address = sc.next();
				
				System.out.println("ENTER USER EMAIL");
				String email;
				while(true) {
					try {
						email = sc.next();
						Validator.validEmail(email);
						break;
					} catch (IncorrectEmailIdFormatExecption iee) {
						System.out.println(iee);
						System.out.println("PLEASE ENTER EMAIL ID AGAIN");
					}
				}
				
				ps.setInt(1, uId);
				ps.setString(2, uName);
				ps.setString(3, address);
				ps.setLong(4, mobileNo);
				ps.setString(5, email);
				ps.execute();
				
				System.out.println("USERS ADDED SUCCESSFULLY");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void displayUser() {
		int num;
		while (true) {
		    try {
		        System.out.println("ENTER NO. YOU NEED TO DISPLAY USERS");
		        num = sc.nextInt();
		        if (num > 0) {
		            break;
		        } else {
		            System.out.println("PLEASE ENTER NUMBER GREATER THAN 0");
		        }
		    } catch (InputMismatchException e) {
		      //  e.printStackTrace();
		    	System.out.println("PLEASE ENTER NUMBER ONLY");
		        sc.next();
		    }
		}
		
		for(int i = 1; i<= num; i++) {
		boolean flag = true;
		while(flag) {
			
			System.out.println("\nENTER USER "+i+" ID");
			int uid = sc.nextInt();
			
			try {
				Connection cn = MyConnection.getConnection();
				String s = "select * from user where userId = ?";
				PreparedStatement ps = cn.prepareStatement(s);
				ps.setInt(1, uid);
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()) {
					
					System.out.println("USER ID : "+ rs.getInt(1));
					System.out.println("USER NAME : "+rs.getString(2));
					System.out.println("USER ADDRESS : "+rs.getString(3));
					System.out.println("USER MOBILE NO. : "+rs.getLong(4));
					System.out.println("USER EMAIL : "+rs.getString(5));
					flag=false;
				} else {
					System.out.println("USER NOT FOUND\nPLEASE ENTER USER ID AGAIN");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		}
		
	}
	
	public void updateUser() {
		ServiceImpl si = new ServiceImpl();
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
                si.updateName();
				break;

			case 2:
				si.updateAddress();
				break;

			case 3:
				si.updateMobileNo();
				break;

			case 4:
				si.updateEmail();
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
	
	public void updateName() {
		boolean flag = true;
		while(flag) {
			
			System.out.println("ENTER USER ID");
			int num;
			while(true) {
				try {
					num = sc.nextInt();
					Validator.validId(num);
					break;
				} catch (IncorrectIdFormatException | InputMismatchException e) {
					e.getMessage();
					
				}
			}
			
			try {
				Connection cn = MyConnection.getConnection();
				String s = "select * from user where userId = ?";
				PreparedStatement ps = cn.prepareStatement(s);
				ps.setInt(1, num);
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()) {
					System.out.println("ENTER NEW USER NAME");
					String newname;
					while(true) {
						try {
						newname = sc.next();
						Validator.validName(newname);
						break;
						}catch (IncorrectNameFormatException ine) {
							ine.getMessage();
							System.out.println("PLEASE ENTER USER NAME AGAIN");
						}
					}

					String s1 = "update user set userName = ? where userId = ?";
					PreparedStatement ps1 = cn.prepareStatement(s1);
					ps1.setString(1, newname);
					ps1.setInt(2, num);
					ps1.executeUpdate();
					System.out.println("USER NAME UPDATED SUCCESSFULLY");
					flag = false;
				}else {
					System.out.println("USER NOT FOUND \nPLEASE ENTER USER ID AGAIN");
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
    public void updateAddress() {
    	boolean flag = true;
		while(flag) {
			
			System.out.println("ENTER USER ID");
			int num;
			while(true) {
				try {
					num = sc.nextInt();
					Validator.validId(num);
					break;
				} catch (IncorrectIdFormatException | InputMismatchException e) {
					e.getMessage();
					
				}
			}
			
			try {
				Connection cn = MyConnection.getConnection();
				String s = "select * from user where userId = ?";
				PreparedStatement ps = cn.prepareStatement(s);
				ps.setInt(1, num);
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()) {
					System.out.println("ENTER NEW USER ADDRESS");
					String newadd = sc.next();
					
					String s1 = "update user set userAddress = ? where userId = ?";
					PreparedStatement ps1 = cn.prepareStatement(s1);
					ps1.setString(1, newadd);
					ps1.setInt(2, num);
					ps1.executeUpdate();
					System.out.println("USER ADDRESS UPDATED SUCCESSFULLY");
					flag = false;
				}else {
					System.out.println("USER NOT FOUND \nPLEASE ENTER USER ID AGAIN");
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
    
    public void updateMobileNo() {
    	boolean flag = true;
		while(flag) {
			
			System.out.println("ENTER USER ID");
			int num;
			while(true) {
				try {
					num = sc.nextInt();
					Validator.validId(num);
					break;
				} catch (IncorrectIdFormatException | InputMismatchException e) {
					e.getMessage();
					
				}
			}
			
			try {
				Connection cn = MyConnection.getConnection();
				String s = "select * from user where userId = ?";
				PreparedStatement ps = cn.prepareStatement(s);
				ps.setInt(1, num);
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()) {
					System.out.println("ENTER NEW USER MOBILE NO.");
					long newmo = sc.nextLong();
					
					String s1 = "update user set userMobileNo = ? where userId = ?";
					PreparedStatement ps1 = cn.prepareStatement(s1);
					ps1.setLong(1, newmo);
					ps1.setInt(2, num);
					ps1.executeUpdate();
					System.out.println("USER MOBILE NO. UPDATED SUCCESSFULLY");
					flag = false;
				}else {
					System.out.println("USER NOT FOUND \nPLEASE ENTER USER ID AGAIN");
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
    
    public void updateEmail() {
    	boolean flag = true;
		while(flag) {
			
			System.out.println("ENTER USER ID");
			int num;
			while(true) {
				try {
					num = sc.nextInt();
					Validator.validId(num);
					break;
				} catch (IncorrectIdFormatException | InputMismatchException e) {
					e.getMessage();
					
				}
			}
			
			try {
				Connection cn = MyConnection.getConnection();
				String s = "select * from user where userId = ?";
				PreparedStatement ps = cn.prepareStatement(s);
				ps.setInt(1, num);
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()) {
					System.out.println("ENTER NEW USER EMAIL");
					String newemail = sc.next();
					
					String s1 = "update user set userEmailId = ? where userId = ?";
					PreparedStatement ps1 = cn.prepareStatement(s1);
					ps1.setString(1, newemail);
					ps1.setInt(2, num);
					ps1.executeUpdate();
					System.out.println("USER EMAIL UPDATED SUCCESSFULLY");
					flag = false;
				}else {
					System.out.println("USER NOT FOUND \nPLEASE ENTER USER ID AGAIN");
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void deleteUser() {
		int num1;
		while (true) {
		    try {
		        System.out.println("ENTER NO. YOU NEED TO DELETE USERS");
		        num1 = sc.nextInt();
		        if (num1 > 0) {
		            break;
		        } else {
		            System.out.println("PLEASE ENTER NUMBER GREATER THAN 0");
		        }
		    } catch (InputMismatchException e) {
		        
		    	//e.printStackTrace();
		    	System.out.println("PLEASE ENTER NUMBER ONLY");
		        sc.next();
		    }
		}
		
		for(int i = 1; i<= num1; i++) {
		boolean flag = true;
		while (flag) {

			System.out.println("ENTER USER ID");
			int num = sc.nextInt();

			try {
				Connection cn = MyConnection.getConnection();
				String s = "select * from user where userId = ?";
				PreparedStatement ps = cn.prepareStatement(s);
				ps.setInt(1, num);
				ResultSet rs = ps.executeQuery();

				if (rs.next()) {
					String s1 = "delete from user where userId = ?";
					PreparedStatement ps1 = cn.prepareStatement(s1);
					ps1.setInt(1, num);
					ps1.executeUpdate();
					System.out.println("USER DELETED SUCCESSFULLY");
				}else {
					System.out.println("USER NOT FOUND\nPLEASE ENTER USER ID AGAIN");	
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	}
	}
}

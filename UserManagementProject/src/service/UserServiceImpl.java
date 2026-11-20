package service;

import java.util.InputMismatchException;
import java.util.Scanner;

import customException.IncorrectAdharIdFormatException;
import customException.IncorrectEmailIdFormatException;
import customException.IncorrectInputException;
import customException.IncorrectNameFormatException;
import customException.IncorrectPanFormatException;
import model.Constant;
import model.User;
import model.Validator;



public class UserServiceImpl implements UserService {

	Scanner sc = new Scanner(System.in);
    User[] details = new User[Constant.maxSize];
	
	@Override
	public void createUser()  {
		System.out.println("ENTER NUMBER OF USERS YOU WANT TO CREATE");
		int num = 0;
		while (true) {
		    try {
		        num = sc.nextInt();
		        break;
		   } catch (InputMismatchException e) {
		        System.out.println("INVALID INPUT PLEASE ENTER NUMBER ONLY");
		        sc.next();
		    }
		}
		//autoGenerate id
		for(int i = 0; i<num; i++) {
			User us = new User();
			int userId = us.generateUserId();
			us.setuId(userId);
			System.out.println("YOUR USER ID : \n"+userId);
			
			//userName
			try {
				us.setuName(Validator.validName());
			} catch (IncorrectNameFormatException e1) {		
				e1.printStackTrace();
				try {
					Validator.validName();
				} catch (IncorrectNameFormatException e) {
					e.printStackTrace();
				}
			}
			
			//UserMobileNo
			boolean flag = true;
			while(flag) {
			System.out.println("----------------------------");
			System.out.println("ENTER YOUR MOBILE NUMBER");
			System.out.println("----------------------------");
			long mob = 0;
			try {
			    mob = sc.nextLong();
			} catch (InputMismatchException e) {
			    System.out.println("INVALID INPUT ENTER NUMBERS ONLY");
			    sc.next();
			    continue;
			}
			if (mob>=6000000000l && mob<=9999999999l) {
				us.setMobileNumber(mob);
				flag = false;
			}else {System.out.println("MOBILE NUMBER MUST BE POSITIVE\nOR 10 DIGITS OR START WITH NUMBER 6");}
			}
			//userAddress
			System.out.println("----------------------------");
			System.out.println("ENTER ADDRESS");
			System.out.println("----------------------------");
			us.setAddress(sc.next());
			
			//userAdharId
			try {
				us.setAddress(Validator.validAdharId());
			} catch (IncorrectAdharIdFormatException e) {
				e.printStackTrace();
			}
			
			//userPan
			try {
				us.setPan(Validator.validPanCard());
			} catch (IncorrectPanFormatException e) {
				e.printStackTrace();
			}
			
			//userEmail
			try {
				us.setEmail(Validator.validEmail());
			} catch (IncorrectEmailIdFormatException e) {
				e.printStackTrace();
			}
			
			details[i]= us;
			}
		}	
	

	@Override
	public void displayUserInfo() {
		boolean flag = true;
	    while (flag) {
	        System.out.println("-------------------------");
	        System.out.println("ENTER YOUR USER ID");
	        System.out.println("-------------------------");
	        int uID = 0;
	        try {
	        	uID = sc.nextInt();
	        } catch (InputMismatchException e) {
	            System.out.println("-------------------------");
	            System.out.println("INVALID INPUT ENTER NUMBERS ONLY");
	            System.out.println("-------------------------");
	            sc.next();
	            continue;
	        }
	        for (int i = 0; i < details.length; i++) {
	            if (details[i] != null) {
	                if (uID == details[i].getuId()) {
	             System.out.println(details[i]);
	                    flag = false;
	                    break;
	                }
	            }
	        }
	        if (flag) {
	            System.out.println("-------------------------");
	            System.out.println("INVALID USER ID");
	            System.out.println("-------------------------");
	        }
	    }
		
	}

	@Override
	public void updateUserInfo() {
		boolean flag = true;
	    while (flag) {
	        System.out.println("-------------------------");
	        System.out.println("ENTER USER ID");
	        System.out.println("-------------------------");
	        int userId1 = 0;
	        try {
	        	userId1 = sc.nextInt();
	        } catch (InputMismatchException e) {
	            System.out.println("-------------------------");
	            System.out.println("INVALID INPUT ENTER NUMBERS ONLY");
	            System.out.println("-------------------------");
	            sc.next();
	            continue;
	        }
	    for (User detail : details) {
	    if (detail != null && userId1 == detail.getuId()) {
	      boolean flag1 = true;
	      while (flag1) {

           System.out.println("\n-------------------------");
	       System.out.println("1. UPDATE NAME");
	       System.out.println("-------------------------");
	       System.out.println("2. UPDATE MOBILE NUMBER");
	       System.out.println("-------------------------");
	       System.out.println("3. UPDATE ADDRESS");
	       System.out.println("-------------------------");
	       System.out.println("4. UPDATE EMAIL");
	       System.out.println("-------------------------");
	       System.out.println("5. EXIT");
	       System.out.println("-------------------------");
	       System.out.println("\n______________________________________");
	       System.out.println("\nENTER YOUR CHOICE BETWEEN 1 - 5");
	       System.out.println("______________________________________");

	       int ch = 0;
	       try {
	           ch = sc.nextInt();
	       } catch (InputMismatchException e) {
	           System.out.println("INVALID CHOICE ENTER NUMBERS ONLY");
	           sc.next();
	           continue;
	       }
	       switch (ch) {
	       case 1:

	           String newname = null;
			try {
				newname = Validator.validName();
			} catch (IncorrectNameFormatException e1) {
				e1.printStackTrace();
			}
	           detail.setuName(newname);
	           System.out.println("...........................................");
	           System.out.println("\nYOUR NAME IS UPDATED TO : "+ detail.getuName());
	           System.out.println("...........................................");
	           break;

	       case 2:

	           boolean flag2 = true;
	           while (flag2) {
	           System.out.println("-------------------------");
	           System.out.println("ENTER NEW MOBILE NUMBER");
	           System.out.println("-------------------------");
	           long newnumber = 0;
	           try {
	               newnumber = sc.nextLong();
	           } catch (InputMismatchException e) {
	               System.out.println("INVALID MOBILE NUMBER... ENTER NUMBERS ONLY");
	               sc.next();
	               continue;
	           }
	           if (newnumber >= 6000000000L && newnumber <= 9999999999L) {
	           detail.setMobileNumber(newnumber);
	           System.out.println("...........................................");
	           System.out.println("\nYOUR MOBILE NUMBER IS UPDATED TO : "+ detail.getMobileNumber());
	           System.out.println("...........................................");
	           flag2 = false;
	           } else {
	           System.out.println("MOBILE NUMBER MUST BE POSITIVE\n"
	                              + "OR 10 DIGITS OR START WITH NUMBER 6");
	                            }
	                        }
	           break;

	       case 3:

	           System.out.println("-------------------------");
	           System.out.println("ENTER NEW ADDRESS");
	           System.out.println("-------------------------");
	           String newaddress = sc.next();
	           detail.setAddress(newaddress);
	           System.out.println("...........................................");
	           System.out.println("\nYOUR ADDRESS IS UPDATED TO : "+ detail.getAddress());
	           System.out.println("...........................................");
	           break;

	       case 4:

	           String newemail = null;
			try {
				newemail = Validator.validEmail();
			} catch (IncorrectEmailIdFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	           detail.setEmail(newemail);
	           System.out.println("...........................................");
	           System.out.println("\nYOUR EMAIL IS UPDATED TO : "+ detail.getEmail());
	           System.out.println("...........................................");
	           break;

	       case 5:

	           System.out.println("----------->>>>>>>>>>>>>>>>>>>>>>>>>>");
	           System.out.println("YOU ARE REDIRECTED TO MAIN MENU");
	           System.out.println("----------->>>>>>>>>>>>>>>>>>>>>>>>>>");
	           flag1 = false;
	           flag = false;
	           break;

	       default:

	           System.out.println("---------------------------------");
	           System.out.println("INVALID CHOICE PLEASE TRY AGAIN");
	           System.out.println("---------------------------------");
	           break;
	       }      
	               }
	            }
	        }
	        if (flag) {
	            System.out.println("-------------------------");
	            System.out.println("INVALID USER ID");
	            System.out.println("-------------------------");
	        }
	    }
		
	}

	@Override
	public void deleteUserInfo() {
		 try {
		   System.out.println("-------------------------");
		   System.out.println("ENTER USER ID TO DELETE");
		   System.out.println("-------------------------");
		   int uId2 = sc.nextInt();
		   boolean found = false;

		   for (int i = 0; i < details.length; i++) {
		   if (details[i] != null && details[i].getuId() == uId2) {
		   details[i] = null;
		   found = true;
		   System.out.println("-------------------------");
		   System.out.println("USER DELETED SUCCESSFULLY");
		   System.out.println("-------------------------");
           break;
	 }
 }
		   if (!found) {
		   System.out.println("-------------------------");
		   System.out.println("INVALID USER ID");
		   System.out.println("-------------------------");
	}
		    } catch (InputMismatchException e) {
		        System.out.println("-------------------------");
		        System.out.println("INVALID INPUT ENTER NUMBERS ONLY");
		        System.out.println("-------------------------");
		        sc.next();
		    }
	}

}

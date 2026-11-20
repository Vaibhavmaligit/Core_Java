package service;


import java.util.InputMismatchException;
import java.util.Scanner;


import model.Account;
import model.ConstantArraySize;
import model.Validator;


public class AxisBank implements RBI {

	Scanner sc = new Scanner(System.in);
    Account[] accounts = new Account[ConstantArraySize.maxSize];
	
	@Override
	public void createAccount() {
		System.out.println("ENTER NUMBER OF ACCOUNTS YOU WANT TO CREATE");
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
		for(int i = 0; i<num; i++) {
			Account ac = new Account();
			//System.out.println("ENTER ACCOUNT NUMBER");
			//ac.setAccountNo(sc.nextLong());
			long accNo = ac.generateAccountNumber();
			ac.setAccountNo(accNo);
			System.out.println("YOUR ACCOUNT NUMBER : \n"+accNo);
			
			//System.out.println("ENTER YOUR NAME");			
			//ac.setAccountHolderName(sc.next());
			ac.setAccountHolderName(Validator.validName());
			
			//System.out.println("ENTER MOBILE NUMBER");		
	       // ac.setMobileNumber(sc.nextLong());
			boolean flag6 = true;
			while(flag6) {
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
				ac.setMobileNumber(mob);
				flag6 = false;
			}else {System.out.println("MOBILE NUMBER MUST BE POSITIVE\nOR 10 DIGITS OR START WITH NUMBER 6");}
			}
			
			System.out.println("----------------------------");
			System.out.println("ENTER ADDRESS");
			System.out.println("----------------------------");
			ac.setAddress(sc.next());
			
			//System.out.println("ENTER EMAIL");		
			//ac.setEmailId(sc.next());
			ac.setEmailId(Validator.validEmail());
			
			//System.out.println("ENTER ADHAR ID");	
			//ac.setAdharId(sc.next());
			ac.setAdharId(Validator.validAdharId());
			
			//System.out.println("ENTER PAN");	
			//ac.setPan(sc.next());
			ac.setPan(Validator.validPanCard());
			accounts[i]= ac;
		}
		System.out.println("______________________________________");
	        System.out.println("\nACCOUNT CREATED SUCCESSFULLY");
	        System.out.println("______________________________________");
	}

	@Override
	public void displayAccountDetails() {
	    boolean flag = true;
	    while (flag) {
	        System.out.println("-------------------------");
	        System.out.println("ENTER YOUR ACCOUNT NUMBER");
	        System.out.println("-------------------------");
	        long accNo = 0;
	        try {
	            accNo = sc.nextLong();
	        } catch (InputMismatchException e) {
	            System.out.println("-------------------------");
	            System.out.println("INVALID INPUT ENTER NUMBERS ONLY");
	            System.out.println("-------------------------");
	            sc.next();
	            continue;
	        }
	        for (int i = 0; i < accounts.length; i++) {
	            if (accounts[i] != null) {
	                if (accNo == accounts[i].getAccountNo()) {
	             System.out.println(accounts[i]);
	                    flag = false;
	                    break;
	                }
	            }
	        }
	        if (flag) {
	            System.out.println("-------------------------");
	            System.out.println("ACCOUNT NUMBER INVALID");
	            System.out.println("-------------------------");
	        }
	    }
	}
	                 		
	
	@Override
	public void displayAccountBalance() {
	    boolean flag = true;
	    while (flag) {
	        System.out.println("-------------------------");
	        System.out.println("ENTER YOUR ACCOUNT NUMBER");
	        System.out.println("-------------------------");
	        long accNo = 0;
	        try {
	            accNo = sc.nextLong();
	        } catch (InputMismatchException e) {
	            System.out.println("-------------------------");
	            System.out.println("INVALID INPUT... ENTER NUMBERS ONLY");
	            System.out.println("-------------------------");
	            sc.next();
	            continue;
	        }
	        for (int i = 0; i < accounts.length; i++) {
	            if (accounts[i] != null) {
	                if (accNo == accounts[i].getAccountNo()) {
	        System.out.println("-------------------------");
	        System.out.println("REMAINING ACCOUNT BALANCE : " + accounts[i].getBalance());
	        System.out.println("-------------------------");
	                    flag = false;
	                    break;
	                }
	           }
	        }
	        if (flag) {
	            System.out.println("-------------------------");
	            System.out.println("ACCOUNT NUMBER INVALID");
	            System.out.println("-------------------------\n");
	        }
	   }
}
  
		
	@Override
	public void depositAmount() {
	    boolean flag2 = true;
	    boolean flag3 = true;
	    while (flag2) {
	        System.out.println("-------------------------");
	        System.out.println("ENTER YOUR ACCOUNT NUMBER");
	        System.out.println("-------------------------");
	        long accNo = 0;
	        try {
	            accNo = sc.nextLong();
	        } catch (InputMismatchException e) {
	            System.out.println("-------------------------");
	            System.out.println("INVALID INPUT... ENTER NUMBERS ONLY");
	            System.out.println("-------------------------");
	            sc.next();
	            continue;
	        }
	        for (Account acco : accounts) {
	        if (acco != null && accNo == acco.getAccountNo()) {
	               System.out.println("-------------------");
	               System.out.println("DEPOSIT AMOUNT : ");
	               System.out.println("-------------------");
	        flag2 = false;
	        while (flag3) {
	        	int amountdeposit = 0;
	        	try {
	        	    amountdeposit = sc.nextInt();
	        	} catch (InputMismatchException e) {
	        	    System.out.println("INVALID INPUT ENTER NUMBERS ONLY");
	        	    sc.next();
	        	    continue;
	        	}
	        if (amountdeposit <= 0) {
	             System.out.println("-------------------------------");
	             System.out.println("DEPOSIT AMOUNT GREATER THAN 0");
	             System.out.println("-------------------------------");
	           } 
	            else {
	            double updatedbalance = acco.getBalance() + amountdeposit;
                                          acco.setBalance(updatedbalance);
	            System.out.println("...........................................");
	            System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
	            System.out.println("DEPOSIT AMOUNT : " + amountdeposit);
	            System.out.println("YOUR UPDATED ACCOUNT BALANCE : "+ acco.getBalance());
	            System.out.println("...........................................");
	         flag3 = false;
	                    }
	          }
	            }
	   }
            if (flag2) {
	            System.out.println("-------------------------");
	            System.out.println("ACCOUNT NUMBER INVALID");
	            System.out.println("-------------------------");
	         }
	   } 
 }
      
      
	@Override
	public void withdrawAmount() {
	    boolean flag2 = true;
	    boolean flag3 = true;
	    while (flag2) {
	        System.out.println("-------------------------");
	        System.out.println("ENTER YOUR ACCOUNT NUMBER");
	        System.out.println("-------------------------");
	        long accNo = 0;
	        try {
	            accNo = sc.nextLong();
	        } catch (InputMismatchException e) {
	            System.out.println("-------------------------");
	            System.out.println("INVALID INPUT... ENTER NUMBERS ONLY");
	            System.out.println("-------------------------");
	            sc.next();
	            continue;
	        }
	    for (Account acco : accounts) {
	      if (acco != null && accNo == acco.getAccountNo()) {
	         System.out.println("-------------------");
	         System.out.println("WITHDRAW AMOUNT : ");
	         System.out.println("-------------------");
	      flag2 = false;
	      while (flag3) {
	    	  int amountwithdraw = 0;
	    	  try {
	    	      amountwithdraw = sc.nextInt();
	    	  } catch (InputMismatchException e) {
	    	      System.out.println("INVALID AMOUNT... ENTER NUMBERS ONLY");
	    	      sc.next();
	    	      continue;
	    	  }
	       if (amountwithdraw <= 0) {
	          System.out.println("-------------------------------");
	          System.out.println("WITHDRAW AMOUNT GREATER THAN 0");
	          System.out.println("-------------------------------");
	       }         
	          else if (amountwithdraw > acco.getBalance()) {
	          System.out.println("-------------------------------");
	          System.out.println("INSUFFICIENT BALANCE..!!");
	          System.out.println("YOUR CURRENT BALANCE : "+ acco.getBalance());
	          System.out.println("-------------------------------");
	          }

	     else {
	      double updatedbalance = acco.getBalance() - amountwithdraw;
	      acco.setBalance(updatedbalance);
	        System.out.println("...........................................");
	        System.out.println("AMOUNT WITHDRAWN SUCCESSFULLY");
	        System.out.println("WITHDRAWAL AMOUNT : " + amountwithdraw);
	        System.out.println("YOUR UPDATED ACCOUNT BALANCE : "+ acco.getBalance());
	        System.out.println("...........................................");

	      flag3 = false;
	     }
	      }
	      }
	    }
	      if (flag2) {
	        System.out.println("-------------------------");
	        System.out.println("ACCOUNT NUMBER INVALID");
	        System.out.println("-------------------------");
	      }
	    }
	}
	        
	
	@Override
	public void updateAccountDetails() {

	    boolean flag5 = true;
	    while (flag5) {
	        System.out.println("-------------------------");
	        System.out.println("ENTER YOUR ACCOUNT NUMBER");
	        System.out.println("-------------------------");
	        long accNo = 0;
	        try {
	            accNo = sc.nextLong();
	        } catch (InputMismatchException e) {
	            System.out.println("-------------------------");
	            System.out.println("INVALID INPUT... ENTER NUMBERS ONLY");
	            System.out.println("-------------------------");
	            sc.next();
	            continue;
	        }
	    for (Account acco : accounts) {
	    if (acco != null && accNo == acco.getAccountNo()) {
	      boolean flag4 = true;
	      while (flag4) {

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
	           System.out.println("INVALID CHOICE... ENTER NUMBERS ONLY");
	           sc.next();
	           continue;
	       }
	       switch (ch) {
	       case 1:

	           String newname = Validator.validName();
	           acco.setAccountHolderName(newname);
	           System.out.println("...........................................");
	           System.out.println("\nYOUR NAME IS UPDATED TO : "+ acco.getAccountHolderName());
	           System.out.println("...........................................");
	           break;

	       case 2:

	           boolean flag8 = true;
	           while (flag8) {
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
	           acco.setMobileNumber(newnumber);
	           System.out.println("...........................................");
	           System.out.println("\nYOUR MOBILE NUMBER IS UPDATED TO : "+ acco.getMobileNumber());
	           System.out.println("...........................................");
	           flag8 = false;
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
	           acco.setAddress(newaddress);
	           System.out.println("...........................................");
	           System.out.println("\nYOUR ADDRESS IS UPDATED TO : "+ acco.getAddress());
	           System.out.println("...........................................");
	           break;

	       case 4:

	           String newemail = Validator.validEmail();
	           acco.setEmailId(newemail);
	           System.out.println("...........................................");
	           System.out.println("\nYOUR EMAIL IS UPDATED TO : "+ acco.getEmailId());
	           System.out.println("...........................................");
	           break;

	       case 5:

	           System.out.println("----------->>>>>>>>>>>>>>>>>>>>>>>>>>");
	           System.out.println("YOU ARE REDIRECTED TO MAIN MENU");
	           System.out.println("----------->>>>>>>>>>>>>>>>>>>>>>>>>>");
	           flag4 = false;
	           flag5 = false;
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
	        if (flag5) {
	            System.out.println("-------------------------");
	            System.out.println("ACCOUNT NUMBER INVALID");
	            System.out.println("-------------------------");
	        }
	    }
	}
}

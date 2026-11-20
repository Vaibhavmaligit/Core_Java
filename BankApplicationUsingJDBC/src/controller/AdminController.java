package controller;

import java.util.Scanner;

import service.AxisBank;
import service.RBI;

public class AdminController {

	public static void main(String[] args) {
		RBI rbi = new AxisBank();
		Scanner sc = new Scanner(System.in);
		//rbi.createDatabase();
		
		System.out.println("==================================");
		System.out.println("====   WELCOME TO AXIS BANK   ====");
		System.out.println("==================================");
		boolean flag = true;
		while(flag) {
        System.out.println("\n----------------------------------");
		System.out.println("1. CREATE ACCOUNT");
		System.out.println("----------------------------------");
		System.out.println("2. DISPLAY ACCOUNT DETAILS");
		System.out.println("----------------------------------");
		System.out.println("3. BALANCE ENQUIRY");
		System.out.println("----------------------------------");
		System.out.println("4. DEPOSIT AMMOUNT");
		System.out.println("----------------------------------");
		System.out.println("5. WITHDRAW AMOUNT");
		System.out.println("----------------------------------");
		System.out.println("6. UPDATE ACCOUNT DETAILS");
		System.out.println("----------------------------------");	
		System.out.println("7. DELETE ACCOUNT");
		System.out.println("----------------------------------");
		System.out.println("8. EXIT...!!");
		System.out.println("----------------------------------");
		System.out.println("\n____________________________________");
		System.out.println("\n   ENTER YOUR CHOICE BETWEEN 1 - 7");
		System.out.println("____________________________________");
		
		
		int ch = sc.nextInt();
		
			switch (ch) {
			case 1:
				rbi.createAccount();
				break;

			case 2:
				rbi.displayAccountDetails();

				break;

			case 3:
				rbi.displayAccountBalance();

				break;

			case 4:
				rbi.depositAmount();

				break;

			case 5:
				rbi.withdrawAmount();

				break;

			case 6:
				rbi.updateAccountDetails();

				break;

			case 7:
				rbi.deleteAccount();

				break;

			case 8:
				System.out.println("______________________________________");
				System.out.println("\nTHANKYOU FOR VISITING AXIS BANK.");
				System.out.println("      ALWAYS DIL SE OPEN");
				System.out.println("______________________________________");
                flag = false;
				break;

			default:
				System.out.println("INVALID CHOICE PLEASE TRY AGAIN");
				break;
			}
		}
		
	}
}

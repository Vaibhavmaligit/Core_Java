package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import service.UserServiceImpl;

public class UserController {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserServiceImpl usi = new UserServiceImpl();
		
		System.out.println("==================================");
		System.out.println("====   USER INFORMATION   ====");
		System.out.println("==================================");
		boolean flag = true;
		while(flag) {
        System.out.println("\n----------------------------------");
		System.out.println("1. CREATE USER");
		System.out.println("----------------------------------");
		System.out.println("2. DISPLAY USER");
		System.out.println("----------------------------------");
		System.out.println("3. UPDATE USER");
		System.out.println("----------------------------------");
		System.out.println("4. DELETE USER");
		System.out.println("----------------------------------");
		System.out.println("5. EXIT");
		System.out.println("----------------------------------");
		System.out.println("\n____________________________________");
		System.out.println("\n   ENTER YOUR CHOICE BETWEEN 1 - 5");
		System.out.println("____________________________________");
		
		int ch = 0;
		try {
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			usi.createUser();
			break;
        case 2:
			usi.displayUserInfo();
			break;
        case 3:
			usi.updateUserInfo();
			break;
        case 4:
			usi.deleteUserInfo();
			break;
        case 5:
			System.out.println("THANKYOU...!!!");
			flag = false;
			break;

		default:
			System.out.println("----------------------------------");
			System.out.println("INVALID CHOICE PLEASE TRY AGAIN");
			System.out.println("----------------------------------");
			break;
		}
		}catch (InputMismatchException e){
			System.out.println("----------------------------------");
			System.out.println("INVALID INPUT PLEASE ENTER NUMBER");
			System.out.println("----------------------------------");
			sc.next();
			}
		}
	}
}

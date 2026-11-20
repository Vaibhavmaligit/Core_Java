package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import serviceimpl.CMSserviceimpl;


public class AdminController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CMSserviceimpl cms = new CMSserviceimpl();
		
		System.out.println("==================================");
		System.out.println("====   CLASS INFORMATION   ====");
		System.out.println("==================================");
		boolean flag = true;
		while(flag) {
        System.out.println("\n----------------------------------");
		System.out.println("1. ADD COURSE");
		System.out.println("----------------------------------");
		System.out.println("2. DISPLAY COURSE");
		System.out.println("----------------------------------");
		System.out.println("3. ADD FACULTY");
		System.out.println("----------------------------------");
		System.out.println("4. DISPLAY FACULTY");
		System.out.println("----------------------------------");
		System.out.println("5. ADD BATCH");
		System.out.println("----------------------------------");
		System.out.println("6. DISPLAY BATCH");
		System.out.println("----------------------------------");
		System.out.println("7. ADD STUDENT");
		System.out.println("----------------------------------");
		System.out.println("8. DISPLAY STUDENT");
		System.out.println("----------------------------------");
		System.out.println("9. UPDATE DETAILS");
		System.out.println("----------------------------------");
		System.out.println("10. DELETE DETAILS");
		System.out.println("----------------------------------");
		System.out.println("11. EXIT");
		System.out.println("----------------------------------");
		System.out.println("\n____________________________________");
		System.out.println("\n   ENTER YOUR CHOICE BETWEEN 1 - 11");
		System.out.println("____________________________________");
		
		int ch = 0;
		try {
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			cms.addCourse();
			break;
			
        case 2:
			cms.displayCourse();
			break;
			
        case 3:
			cms.addFaculty();
			break;
			
        case 4:
			cms.displayFaculty();
			break;
	
        case 5:
			cms.addBatch();
			break;
			
        case 6:
			cms.displayBatch();
			break;
			
        case 7:
			cms.addStudent();
			break;
		
        case 8:
			cms.displayStudent();
			break;
			
        case 9:
			cms.updateDetails();
			break;
		
        case 10:
			cms.deleteDetails();
			break;
        case 11:
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

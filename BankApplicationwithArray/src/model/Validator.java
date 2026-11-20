package model;


import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {

	static Scanner sc = new Scanner(System.in);

	static public String validName() {
		while (true) {
			System.out.println("----------------------------");
			System.out.println("ENTER YOUR NAME");
			System.out.println("----------------------------");
			String name = sc.next();
			
			if (Pattern.matches("[A-Za-z]+", name)) {
				return name;
			}else {
			System.out.println("INVALID NAME\nNAME FORMAT :\nYOUR-NAME FATHER'S-NAME SURNAME ");
			}
		}
	}
	
	static public String validAdharId() {
		while (true) {
			System.out.println("----------------------------");
			System.out.println("ENTER YOUR ADHAR ID");
			System.out.println("----------------------------");
			//sc.nextLine();
			String adharId = sc.next();
			//String adharId1 = sc.nextLine();
			if (Pattern.matches("[2-9]{1}[0-9]{3}[0-9]{4}[0-9]{4}", adharId)) {
				return adharId;
			}
			System.out.println("INVALID ADHAR ID\nENTER IN FORMAT **** **** ****\nFIRST NO. STARTING FROM 2 - 9");
		}
	}

	static public String validPanCard() {
		while (true) {
			System.out.println("----------------------------");
			System.out.println("ENTER YOUR PAN");
			System.out.println("----------------------------");
			String panNo = sc.next();

			if (Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}", panNo)) {   
				return panNo;
			}
			System.out.println("INVALID PAN");
		}
	}
	
	static public String validEmail() {
		while (true) {
			System.out.println("----------------------------");
			System.out.println("ENTER YOUR EMAIL ID");
			System.out.println("----------------------------");
			String email = sc.next();

			if (Pattern.matches("^[a-z0-9+_.-]+@[a-z0-9.-]+$", email)) {   
				return email;
			}
			System.out.println("INVALID EMAIL ID");
		}
	}
	
	
}

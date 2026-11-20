package model;

import java.util.Scanner;
import java.util.regex.Pattern;

import customException.IncorrectAdharIdFormatException;
import customException.IncorrectEmailIdFormatException;
import customException.IncorrectNameFormatException;
import customException.IncorrectPanFormatException;

public class Validator {

	static Scanner sc = new Scanner(System.in);

	static public String validName() throws IncorrectNameFormatException {		
		while (true) {
			System.out.println("----------------------------");
			System.out.println("ENTER YOUR NAME");
			System.out.println("----------------------------");
			String name = sc.next();
			
			if (Pattern.matches("[A-Za-z]+", name)) {				
				return name;
			}else {
				throw new IncorrectNameFormatException("INVALID NAME ENTER NAME IN CHARACTERS");
			}
			}
	}
	static public String validAdharId() throws IncorrectAdharIdFormatException {
		while (true) {
			System.out.println("----------------------------");
			System.out.println("ENTER YOUR ADHAR ID");
			System.out.println("----------------------------");
			String adharId = sc.next();
			if (Pattern.matches("[2-9]{1}[0-9]{3}[0-9]{4}[0-9]{4}", adharId)) {
				return adharId;
			}
			throw new IncorrectAdharIdFormatException ("INVALID ADHAR ENTER 14 DIGIT NUMBER\nFIRST NO. STARTING FROM 2 - 9");
		}
	}
	static public String validPanCard() throws IncorrectPanFormatException {
		while (true) {
			System.out.println("----------------------------");
			System.out.println("ENTER YOUR PAN");
			System.out.println("----------------------------");
			String panNo = sc.next();

			if (Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}", panNo)) {   
				return panNo;
			}
			throw new IncorrectPanFormatException("INVALID PAN");
		}
	}
	static public String validEmail() throws IncorrectEmailIdFormatException {
		while (true) {
			System.out.println("----------------------------");
			System.out.println("ENTER YOUR EMAIL ID");
			System.out.println("----------------------------");
			String email = sc.next();

			if (Pattern.matches("^[a-z0-9+_.-]+@[a-z0-9.-]+$", email)) {   
				return email;
			}
			throw new IncorrectEmailIdFormatException("INVALID EMAIL ID");
		}
	}
}

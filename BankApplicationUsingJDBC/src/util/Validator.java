package util;

import java.util.Scanner;
import java.util.regex.Pattern;

import customException.IncorrectAdharIdFormatException;
import customException.IncorrectEmailIdFormatException;
import customException.IncorrectNameFormatException;
import customException.IncorrectPANFormatException;

public class Validator {
	
	static Scanner sc = new Scanner(System.in);

	static public String validName() {
		while (true) {
			try {
			System.out.println("ENTER ACCOUNT HOLDER NAME");
			String name = sc.next();
			
			if (Pattern.matches("[A-Za-z]+", name)) {
				return name;
			}else {
				throw new IncorrectNameFormatException("INVALID NAME PLEASE ENTER ALPHABETS ONLY WITH NO SPACE");
			}
			}catch (IncorrectNameFormatException ine) {
				System.out.println(ine);
			}
			
		}
	}
	
	
	static public String validAdharId() {
		while (true) {
			try {
			System.out.println("ENTER AADHAR ID");
			String adhar = sc.next();
			if (Pattern.matches("[2-9]{1}[0-9]{11}", adhar)) {
				return adhar;
			}else {
				throw new IncorrectAdharIdFormatException("INVALID ADHAR ID ENTER NUMBERS ONLY 12 DIGIT NO. STARTING FROM 2 - 9 ");
				}
			}catch (IncorrectAdharIdFormatException iae) {
				System.out.println(iae);
			}
		}
	}

	static public String validPanCard()  {
		while (true) {
			try {
			System.out.println("ENTER PAN");
			String pan = sc.next();

			if (Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}", pan)) {   
				return pan;
			}else{
				throw new IncorrectPANFormatException("ENTER VALID PAN IN ITS FORMAT");
				}
			}catch (IncorrectPANFormatException ipe) {
				System.out.println(ipe);
			}
		}
	}
	
	static public String validEmail() {
		while (true) {
			try {
			System.out.println("ENTER EMAIL ID");
			String email = sc.next();

			if (Pattern.matches("^[a-z0-9+_.-]+@[a-z0-9.-]+$", email)) {   
				return email;
			}else {
			throw new IncorrectEmailIdFormatException("INVALID EMAIL PLEASE ENTER CORRECT FORMAT");
			}
			}catch (IncorrectEmailIdFormatException iee) {
				System.out.println(iee);
			}
		}
	}
}

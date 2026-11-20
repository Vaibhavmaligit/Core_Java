package validator;

import java.util.InputMismatchException;
import java.util.Scanner;

import customException.IncorrectEmailIdFormatExecption;
import customException.IncorrectIdFormatException;
import customException.IncorrectMobileNumberFormatException;
import customException.IncorrectNameFormatException;

public class Validator {

	//static Scanner sc = new Scanner(System.in);
	
	public static boolean validId(int uid) throws IncorrectIdFormatException {
		
			if(uid>=00001 && uid<=99999) {
				return true;
			}else {
				throw new IncorrectIdFormatException("ID MUST BE 5 DIGITS");
			}
		}
	
	public static boolean validName(String name) throws IncorrectNameFormatException {
		
		if(name.matches("[A-Za-z]+")) {
			return true;
		}else {
			throw new IncorrectNameFormatException("PLEASE ENTER ONLY ALPHABETS");
		}
	}
	
	public static boolean validMoNumber(long no) throws IncorrectMobileNumberFormatException,InputMismatchException {
		String num = String.valueOf(no);
		if(num.matches("[6-9]{1}[0-9]{9}")) {
			return true;
	}else {
		throw new IncorrectMobileNumberFormatException("PLEASE ENTER 10 DIGITS NUMBER STARTING FROM 6-9");
	}
  }
	
	public static boolean validEmail(String mail) throws IncorrectEmailIdFormatExecption {
		if(mail.matches("^[a-z0-9+_.-]+@[a-z0-9.-]+$")) {
			return true;
		}else {
			throw new IncorrectEmailIdFormatExecption("PLEASE ENTER EMAIL ID IN CORRECT FORMAT ");
		}
	}
}

package customException;

import java.util.Scanner;

public class BankAccountCreation {
 
	public static void createAccount(int age) throws InvalidAgeException {
		
		if (age<18) {
			throw new InvalidAgeException
("Can't Create Account Invalid Age,Please visit after you are Eligible");
		}else {
			System.out.println("ACCOUNT CREATED SUCCESSFULLY");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR AGE");
		boolean flag;
		flag = true;
		while(flag) {
		int enterAge = sc.nextInt();
		try {
			createAccount(enterAge);
			flag=false;
		} catch (InvalidAgeException e) {
			
			e.printStackTrace();
		}}
	}
}

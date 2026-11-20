package throwKeyword;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("MAIN");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
		System.out.println("ENTER YOUR AGE");
		int userAge = sc.nextInt();
		
		try {
			UserAgeValidation.validateAge(userAge);
			flag = false;
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		
		}finally {
			
		}
		}
	}
}

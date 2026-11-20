package throwKeyword;

public class UserAgeValidation {

	public static void validateAge(int age) {
		System.out.println("--validateAge method Entry--");
		
		if(age >= 18) {
			System.out.println("ACCOUNT CREATED SUCCESSFULLY");
			
		}else {
          throw new ArithmeticException("YOU ARE NOT ELIGIBLE"
          		+ " TO CREATE ACCOUNT YOUR AGE IS BELOW 18");
	}
}
} 
package tryWithResourceBlock;

import java.util.Scanner;

public class Example1 {
	 public static void main(String[] args) {
       
	        try (Scanner sc = new Scanner(System.in)) {
                
	            System.out.println("ENTER YOUR NAME");
	            String name = sc.nextLine();

	            System.out.println("YOUR NAME IS: " + name);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	    }


}

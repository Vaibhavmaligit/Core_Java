package solvingExamples;

import java.util.Scanner;

public class ArmstrongNumber {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("ENTER NUMBER:");
	        int n = sc.nextInt();

	        int onum = n;
	        int sum = 0;

	        while (n > 0) {

	            int num = n % 10;
	            sum = sum + (num * num * num);
	            n = n / 10;
	        }

	        if (sum == onum) {
	            System.out.println("ARMSTRONG NUMBER");
	        } else {
	            System.out.println("NOT AN ARMSTRONG NUMBER");
	        }

	    }
}

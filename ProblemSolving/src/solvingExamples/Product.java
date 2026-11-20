package solvingExamples;

import java.util.Scanner;

public class Product {

	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("ENTER NUMBER:");
	        int n = sc.nextInt();

	        int product = 1;

	        while (n > 0) {

	            int num = n % 10;
	            product = product * num;
	            n = n / 10;
	        }

	        System.out.println("PRODUCT OF DIGIT : " + product);

	}
}

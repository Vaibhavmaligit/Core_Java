package com.IfElseStatement;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		
		
		System.out.println("Enter marks");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(marks>35) {
			System.out.println("PASS");
			System.out.println("A+");
		}
		else {System.out.println("You are Failed.. Bye...");
		}
		
		
		
	}
}

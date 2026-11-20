package com.logicalProblemSolving;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER THE NUMBER");
		int num = sc.nextInt();
		if (num%2==0 && num>=0) {
			System.out.println("NUMBER IS POSITIVE AND EVEN NUMBER");
		}
		else {
			System.out.println("NUMBER IS NOT POSITIVE AND EVEN NUMBER");
		}
	}

}

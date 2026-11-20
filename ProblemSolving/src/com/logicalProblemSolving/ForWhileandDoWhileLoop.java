package com.logicalProblemSolving;

import java.util.Scanner;

public class ForWhileandDoWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER THE NUMBER");
		int num = sc.nextInt();
		
		for(int i =0; i<=num; i++ ) {
			System.out.println(i);
		}
		
		
		System.out.println("ENTER THE NUMBER");
		int numb = sc.nextInt();
		int j =0;
		while(j<=numb) {
			System.out.println(j);
			j++;
		}
		
		System.out.println("ENTER THE NUMBER");
		int number = sc.nextInt();
		int k = 0;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=number);
		
	}
}

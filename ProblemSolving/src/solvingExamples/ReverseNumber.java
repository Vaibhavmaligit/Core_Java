package solvingExamples;

import java.util.Scanner;

public class ReverseNumber {

public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("ENTER NUMBER : ");
		int n = sc.nextInt();
		
		int res = 0;
		while(n > 0) {
			int num = n % 10;
			res = res*10 + num;
			n = n/10;
		}
		System.out.println(res);
}
}
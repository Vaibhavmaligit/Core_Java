package com.arithmeticOperator;

import java.util.Scanner;

public class UsingScannerClass {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	//ADDITION
	System.out.println("ENTER FIRST NUMBER");
	int i = sc.nextInt();
	System.out.println("ENTER SECOND NUMBER");
	int j = sc.nextInt();
	int sum = i+j;
	System.out.println(	"ADDITION OF TWO NUMBERS : "+sum);
	System.out.println();
	sc.next();
	
            //SUBSTRACTION
	        System.out.println("ENTER FIRST NUMBER");
			int k = sc.nextInt();
			System.out.println("ENTER SECOND NUMBER");
			int l = sc.nextInt();
			int sub = k-l;
			System.out.println("Substraction of two Numbers : "+sub);
			System.out.println();
			sc.next();
			
			//MULTIPLICATION
			System.out.println("ENTER FIRST NUMBER");
			int m= sc.nextInt();
			System.out.println("ENTER SECOND NUMBER");
			int n = sc.nextInt();
			int multi = m*n;
			System.out.println("Multiplication of two Numbers : "+multi);
			System.out.println();
			sc.next();
			
			//DIVISION
			System.out.println("ENTER FIRST NUMBER");
			double d = sc.nextDouble();
			System.out.println("ENTER SECOND NUMBER");
			double e = sc.nextDouble();
			double div = d/e;
			System.out.println("Division of two Numbers : "+div);
			System.out.println();
	        sc.next();
			
			//MODULUS
			System.out.println("ENTER FIRST NUMBER");
			int g = sc.nextInt();
			System.out.println("ENTER SECOND NUMBER");
			int h = sc.nextInt();
			int mod = g%h;
			System.out.println("Remainder : "+ mod);
	        sc.next();
	        
			System.out.println("ENTER FIRST NUMBER");
			double z = sc.nextDouble();
					System.out.println("ENTER SECOND NUMBER");
					double y= sc.nextDouble();
					System.out.println("======ALL OPERATIONS=======");
					
					System.out.println("\nADDITION : "+ (z+y));
					System.out.println("SUBSTRACTION : "+ (z-y));
					System.out.println("MULTIPLICATION : "+ (z*y));
					System.out.println("DIVISION : "+ (z/y));
					System.out.println("REMAINDER : "+ (z%y));
		
}
		
}

package com.calculator;

public class Calculator {
public int m1(int i,int j) {
	int addition = i+j;
	return addition;
}
	public int m2(int a,int b) {
		int substraction = a-b;
		return substraction;
	}
	
	public int m3(int c,int d,int e) {
		int multiplication = c*d*e;
		return multiplication;
	}
	
	public int m4(int j,int k) {
		int division = j/k;
		return division;
	}


public static void main(String[] args) {
	Calculator c = new Calculator();
	int add = c.m1(890, 930);
	System.out.println("Addition of two numbers ="+" "+add);
	int subt= c.m2(670, 760);
	System.out.println("Substraction of two numbers ="+" "+subt );
	int multi = c.m3(34,56,780);
	System.out.println("Multiplication of two numbers ="+" "+multi);
	int div= c.m4(50, 2);
	System.out.println("Division of two numbers ="+" "+div);
}
}

package com.typeCasting;

public class Narrowing {

	public static void main(String[] args) {
		System.out.println("Narrowing/Explicit Type Casting");
		System.out.println("");
		
		double d = 19456.874653;
		float f = (float)d;
		System.out.println(d);
		System.out.println("Conversion of double into float : "+ f);
		System.out.println("");
		
		float f1 = 2345.57684f;
		long l = (long) f1;
		System.out.println(f1);
		System.out.println("Conversion of double into float : "+ l);
		System.out.println("");
		
		long l1 = 87654789234525l;
		int i = (int)l1;
		System.out.println(l1);
		System.out.println("Conversion of double into float : "+ i);
		System.out.println("");
		
		int i1 = 34567832;
		char c = (char)i1;
		System.out.println(i1);
		System.out.println("Conversion of double into float : "+ c);
		System.out.println("");
		
		char c1 = 'V';
		short s = (short)c1;
		System.out.println(c1);
		System.out.println("Conversion of double into float : "+ s);
		System.out.println("");
		
		short s1 = 2345;
		byte b = (byte)s1;
		System.out.println(s1);
		System.out.println("Conversion of double into float : "+ b);
	}
	
	

	
}

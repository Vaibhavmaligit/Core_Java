package com.typeCasting;

public class Widening {

	
	public static void main(String[] args) {
		
		System.out.println("Widening/Implicit Type Casting");
		System.out.println("");
		
		byte b = 123;
		short s= b;
		System.out.println(b);
		System.out.println("Conversion of byte to short : "+s);
		System.out.println("");
		
		short s2 = 90;
		char c = (char)s2;
		System.out.println(s2);
		System.out.println("Conversion of short to char : "+c);
		System.out.println("");
		
		char c1 = 'A';
		int i3 = c1;
		System.out.println(c1);
		System.out.println("Conversion of char to int : "+i3);
		System.out.println("");
		
		short s1 = 3456;
		int i = s1;
		System.out.println(s1);
		System.out.println("Conversion of short to int : "+i);
		System.out.println("");
		
		int i1 = 45678932;
		long l = i1;
		System.out.println(i1);
		System.out.println("Conversion of int to long : "+l);
		System.out.println("");
		
		int i2 = 3784596;
		float f = i2;
		System.out.println(i2);
		System.out.println("Conversion of int to float : "+f);
		System.out.println("");
		
		long l1= 919921993838l;
		float f1 = l1;
		System.out.println(l1);
		System.out.println("Conversion of long to float : "+f1);
		System.out.println("");
		
		float f2 = 45678.3456789f;
		double d = f2;	
		System.out.println(f2);
		System.out.println("Conversion of float to double : "+d);
	}
}

package com.hierarchicalInheritance;

public class ClassZ extends ClassX{

	char c = 'v';
	
	public void m3() {
		System.out.println("METHOD M3");
	}
	
	public static void main(String[] args) {
		ClassZ z = new ClassZ();
		System.out.println(z.name );
		System.out.println(z.c );
		z.m1();
		z.m3();
		System.out.println("");
		
		ClassY y = new ClassY();
		System.out.println(y.name);
		System.out.println(y.id );
		y.m1();
		y.m2();
		System.out.println("");
		
		ClassF f = new ClassF();
		System.out.println(f.name);
		System.out.println(f.d);
		f.m1();
		f.m4();
	}
	
}

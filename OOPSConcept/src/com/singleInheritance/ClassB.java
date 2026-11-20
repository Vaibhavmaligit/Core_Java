package com.singleInheritance;

public class ClassB extends ClassA {

	int j = 480;
	
	
	public void m2() {
		System.out.println("M2 METHOD");
	}
	
	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println(a.i );
		a.m1();
		
		ClassB b = new ClassB();
		System.out.println(b.i );
		System.out.println(b.j);
		b.m1();
		b.m2();
	}
}

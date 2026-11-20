package com.methodOverloading;

public class Student {

	public void m1() {
		System.out.println("Without parameter method");
	}
	
	private void m1(double d) {
		System.out.println("Single Parameter method");
	}
	
	void m1 (String s, int i) {
		System.out.println("2 parameter method");
	}
	
	protected void m1 (int k, int j,int l) {
		System.out.println("3 parameter method");
	}
	
	public static final void m1(char c) {
		System.out.println("static/final method overloading ");
	}
	
	public static void main(int[] args) {
		System.out.println("different parameter main method");
	}
	
	public static void main( ) {
		System.out.println("without parameter main method");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.m1();
		s.m1(67.67);
		s.m1("ABC", 456);
		s.m1(20, 30, 40);
		m1('A');
	}
}

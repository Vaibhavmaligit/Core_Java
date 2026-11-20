package com.callingpractice;

public class Admin {

	static {
		System.out.println("ADMIN STATIC B 1");
Student s = new Student();
		System.out.println("Static block of Admin 2");
	}
	
	Admin () {
		System.out.println("Constructor of Admin");
	}
	
	{
		System.out.println("Non static blockof Admin");
	}
	public static void main(String[] args) {
		System.out.println("MAIN METHOD");
		Admin a = new Admin();
		Student s = new Student();
	}
	
}

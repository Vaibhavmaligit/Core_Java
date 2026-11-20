package com.toStringMethodforObject;

public class University {
	public static void main(String[] args) {
		College c = new College();
		Student std = c.addStudent();
		System.out.println(std);
		
		AllStudent as = c.addAllStudent();
		System.out.println("");
		System.out.println("ALL STUDENTS DETAILS");
		System.out.println(as.jay);
		System.out.println(as.vicky);
		System.out.println(as.rohan);
		System.out.println(as.raj);
		System.out.println(as.vinit);
	}
}
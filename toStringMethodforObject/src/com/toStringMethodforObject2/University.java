package com.toStringMethodforObject2;


public class University {
	public void displayStudent(Student s) {
		System.out.println(s);
	}
	
	public void displayAllStudent(AllStudents as) {
		System.out.println("  ");
		System.out.println("----ALL STUDENTS DATA-----");
		System.out.println(as.jay);
		System.out.println(as.raj);
		System.out.println(as.vicky);
	}
	public static void main(String[] args) {
		College c = new College();
		c.addStudent();
		c.addAllStudent();
	}
}

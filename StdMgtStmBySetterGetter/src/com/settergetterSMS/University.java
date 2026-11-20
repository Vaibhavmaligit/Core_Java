package com.settergetterSMS;

public class University {

	public void displayStudent(Student s) {
		System.out.println(s.getsId()+" "+s.getName()+" "+s.getAddress());
	}
	
	public void displayAllStudent(AllStudent as) {
		System.out.println("  ");
		System.out.println("----ALL STUDENTS DATA-----");
		System.out.println(as.jay.getsId()+" "+as.jay.getName()+" "+as.jay.getAddress());
		System.out.println(as.raj.getsId()+" "+as.raj.getName()+" "+as.raj.getAddress());
		System.out.println(as.vicky.getsId()+" "+as.vicky.getName()+" "+as.vicky.getAddress());
	}
	public static void main(String[] args) {
		College c = new College();
		c.addStudent();
		c.addAllStudent();
	}
}

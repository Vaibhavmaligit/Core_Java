package com.StdMgtSystem;

public class University {
public static void main(String[] args) {
	College c = new College();
	Student std = c.addStudent();
	System.out.println(std.rollNo+"  "+std.name+"  "+std.address);
	
	AllStudent as = c.addAllStudent();
	System.out.println(as.jay.rollNo+"  "+as.jay.name+"  "+as.jay.address);
	System.out.println(as.vicky.rollNo+"  "+as.vicky.name+"  "+as.vicky.address);
	System.out.println(as.rohan.rollNo+"  "+as.rohan.name+"  "+as.rohan.address);
	System.out.println(as.raj.rollNo+"  "+as.raj.name+"  "+as.raj.address);
	System.out.println(as.vinit.rollNo+"  "+as.vinit.name+"  "+as.vinit.address);
}
}

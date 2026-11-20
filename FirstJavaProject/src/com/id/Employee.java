package com.id;

public class Employee {
int eid;
String ename;

Employee() {
	System.out.println("In Constructor");
	
}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.eid = 100;
		e1.ename = "Vaibhav";
		e2.eid = 200;
		e2.ename = "Rohan";
		System.out.println(e1.eid);
		System.out.println(e1.ename);
		System.out.println(e2.eid);
		System.out.println(e2.ename);
	}
	
}

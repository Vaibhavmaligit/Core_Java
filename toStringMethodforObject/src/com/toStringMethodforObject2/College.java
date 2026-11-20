package com.toStringMethodforObject2;


public class College {
	public void addStudent() {
		Student s1 = new Student();
		 s1.setsId(309);
		 s1.setName("Vaibhav");
		 s1.setAddress("Pune");
		 University u = new University();
		 u.displayStudent(s1);
	}
	public void addAllStudent() {
		AllStudents all = new AllStudents();
		all.jay.setsId(456);
		all.jay.setName("JAY");
		all.jay.setAddress("Nashik");
		
		all.raj.setsId(999);
		all.raj.setName("RAJ");
		all.raj.setAddress("Dhule");
		
		all.vicky.setsId(888);
		all.vicky.setName("VICKY");
		all.vicky.setAddress("Shirpur");
		University u = new University();
		u.displayAllStudent(all);
	}
}

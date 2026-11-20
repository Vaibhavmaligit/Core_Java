package com.parameterizeconstructor;

public class College {

	public void addStudent( ) {
		Student s = new Student(404,"Vaibhav","Pune");
		University u = new University ();
		u.displayStudent(s);
	}
	
	public void addAllStudent() {
		AllStudent all = new AllStudent();
		University u = new University();
		u.displayALLStudent(all);
	}
}

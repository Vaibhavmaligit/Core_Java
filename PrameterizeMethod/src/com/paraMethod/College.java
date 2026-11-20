package com.paraMethod;

public class College {

	public void addStudent() {
		Student s = new Student();
		s.rollNo = 23;
		s.Name = "Rohan";
		s.Address = "Pune";
		
		University u = new University();
		u.displayStudent(s);
	}
	public void addAllStudent() {
		AllStudent all = new AllStudent();
		all.s1.rollNo = 34;
		all.s1.Name = "Jay";
		all.s1.Address = "Mumbai";
		
		all.s2.rollNo = 44;
		all.s2.Name = "Ajay";
		all.s2.Address = "Nagpur";
				
		all.s3.rollNo = 66;
		all.s3.Name = "Raj";
		all.s3.Address = "Dhule";
		
		University u = new University();
		u.displayAllStudent(all);
	}
}

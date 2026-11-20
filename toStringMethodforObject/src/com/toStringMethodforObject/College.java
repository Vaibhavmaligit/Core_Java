package com.toStringMethodforObject;


public class College {
	public Student addStudent() {
		Student s = new Student();
		s.rollNo = 31;
		s.name = "Vaibhav";
		s.address = "Pune";
		
		Student s1 = new Student();
		s1.rollNo = 45;
		s1.name = "Raj";
		s1.address = "Nashik";
		return s1;
	}
		public AllStudent addAllStudent() {
			AllStudent all = new AllStudent();
			all.jay.rollNo = 67;
			all.jay.name = "JAY";
			all.jay.address = "Shirpur";
			
			all.raj.rollNo = 58;
			all.raj.name = "RAJ";
			all.raj.address = "Pune";
			
			all.vicky.rollNo = 85;
			all.vicky.name = "VICKY";
			all.vicky.address = "Nashik";
			
			all.vinit.rollNo = 89;
			all.vinit.name = "VINIT";
			all.vinit.address = "Mumbai";
			
			all.rohan.rollNo = 98;
			all.rohan.name = "ROHAN";
			all.rohan.address = "Sambhajinagar";
			return all;
			
		}
}

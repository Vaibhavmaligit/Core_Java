
package com.paraMethod;

public class University {

	public void displayStudent(Student s) {
		System.out.println(s.rollNo +" "+s.Name +"  "+s.Address);
	}
	
	public void displayAllStudent(AllStudent all) {
		System.out.println("ALL STUDENTS DETAILS");
		System.out.println(all.s1.rollNo+" "+all.s1.Name+" "+all.s1.Address);
		System.out.println(all.s2.rollNo+" "+all.s2.Name+" "+all.s2.Address);
		System.out.println(all.s3.rollNo+" "+all.s3.Name+" "+all.s3.Address);
	}

	
	public static void main(String[] args) {
		
		College c = new College();
		c.addStudent();
		c.addAllStudent();
	}
}

package com.parameterizeconstructor;

public class University {

	public void displayStudent(Student s1) {
		System.out.println(s1.sId +" "+s1.Name +" "+s1.Address );
	}
	public void displayALLStudent(AllStudent as) {
		System.out.println("");
		System.out.println("-----ALL STUDENTS DATA-----");
		System.out.println(as.harsh.sId +" "+as.harsh.Name +" "+as.harsh.Address);
		System.out.println(as.pransh.sId +" "+as.pransh.Name +" "+as.pransh.Address);
		System.out.println(as.ayansh.sId +" "+as.ayansh.Name +" "+as.ayansh.Address);
	}
	
	public static void main(String[] args) {
		College c = new College();
		c.addStudent();
		c.addAllStudent();
	}
}

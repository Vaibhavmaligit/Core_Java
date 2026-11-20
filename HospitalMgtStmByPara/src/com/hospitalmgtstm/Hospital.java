package com.hospitalmgtstm;

public class Hospital {

	public void displayPatient(Patient p) {
		System.out.println(p.pId +" "+p.pName +" "+p.pDisease );
	}
	
	public void displayAllPatient(addPatient a) {
		System.out.println("Display all Students");
		System.out.println(a.Mohan.pId+"  "+a.Mohan.pName+"  "+a.Mohan.pDisease);
		System.out.println(a.Raj.pId+"  "+a.Raj.pName+"  "+a.Raj.pDisease);
		System.out.println(a.Rohan.pId+"  "+a.Rohan.pName+"  "+a.Rohan.pDisease);
	}
	
	public static void main(String[] args) {
		Ward w = new Ward();
		w.addPatient();
		w.addAllPatient();
	}
}

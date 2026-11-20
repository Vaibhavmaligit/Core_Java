package com.hospitalmgtstm;

public class Ward {

	public void addPatient() {
		Patient p = new Patient();
		p.pId = 222;
		p.pName = "PATIENT";
		p.pDisease = "Typhoid";
		Hospital h = new Hospital();
		h.displayPatient(p);
		
	}
	
	public void addAllPatient() {
		addPatient a = new addPatient();
		a.Mohan.pId = 333;
		a.Mohan.pName = "MOHAN";
		a.Mohan.pDisease = "Nausea";
		
		a.Raj.pId = 333;
		a.Raj.pName = "RAJ";
		a.Raj.pDisease = "Fever";
		
		a.Rohan.pId = 333;
		a.Rohan.pName = "ROHAN";
		a.Rohan.pDisease = "Cough";
		Hospital h = new Hospital();
		h.displayAllPatient(a);
		
	}
}

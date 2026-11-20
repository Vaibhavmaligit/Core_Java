package com.inheritanceMethodOverride;

public class Admin {

	public static void main(String[] args) {
		
		Manager m = new Manager();
		m.eId = 2345;
		m.eName = "VAIBHAV";
		m.eSalary = 200000.00;
		m.teamSize = 150;
		System.out.println(m);
		
		System.out.println("");
		System.out.println("");
		Developer d = new Developer();
		d.eId = 7890;
		d.eName = "LALIT";
		d.eSalary = 150000.00;
		d.ProgrammingLanguage = "JAVA";
		System.out.println(d);
		
		System.out.println("");
		System.out.println("");
		Tester t = new Tester();
		t.eId = 4675;
		t.eName = "ROHAN";
		t.eSalary = 100000.00;
		t.NoOfBugsFixed = 8;
		System.out.println(t);
	}
}

package com.employee;

public class Company {
public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.id = 100;
	e1.name = "Vaibhav";
	e1.salary = 50000.00;
	System.out.println(e1.id);
	System.out.println(e1.name);
	System.out.println(e1.salary);
	
	Employee e2 = new Employee();
	e2.id = 200;
	e2.name = "Raj";
	e2.salary = 60000.00;
	System.out.println(e2.id);
	System.out.println(e2.name);
	System.out.println(e2.salary);
	
	Employee e3 = new Employee();
	e3.id = 300;
	e3.name = "Rohan";
	e3.salary = 70000.00;
	System.out.println(e3.id);
	System.out.println(e3.name);
	System.out.println(e3.salary);
}
}

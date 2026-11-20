package com.returntype2ndexample;

public class Admin {

	public Employee EmployeeDetails() {
		Employee e = new Employee();
		e.eId = 3988;
		e.eName = "Vaibhav";
		e.eAddress = "Pune";
		return e;
	}
	
	public Department DepartmentDetails() {
		Department d = new Department();
		d.dId = 28956;
		d.dName = "Information Technology";
		d.dLocation = "Mumbai";
	return d;
	}
	
	public static void main(String[] args) {
		Admin a = new Admin();
		Employee e1 = a.EmployeeDetails();
		System.out.println(e1.eId+"  "+e1.eName+"  "+e1.eAddress);
		Department d1 = a.DepartmentDetails();
		System.out.println(d1.dId+"  "+d1.dName+"  "+d1.dLocation);
	}
	
}

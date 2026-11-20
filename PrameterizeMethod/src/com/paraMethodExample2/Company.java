package com.paraMethodExample2;


public class Company {
	public void displayEmployee(Employee e) {
		System.out.println(e.eId +" "+e.Name +"  "+e.Salary);
	}
	
	public void displayAllEmployee(AllEmployee all) {
		System.out.println("ALL STUDENTS DETAILS");
		System.out.println(all.emp10.eId+" "+all.emp10.Name+" "+all.emp10.Salary);
		System.out.println(all.emp11.eId+" "+all.emp11.Name+" "+all.emp11.Salary);
		System.out.println(all.emp12.eId+" "+all.emp12.Name+" "+all.emp12.Salary);
		System.out.println(all.emp13.eId+" "+all.emp13.Name+" "+all.emp13.Salary);
	}

	
	public static void main(String[] args) {
		
		Department d = new Department();
		d.addEmployee();
		d.addAllEmployee();
	}

}

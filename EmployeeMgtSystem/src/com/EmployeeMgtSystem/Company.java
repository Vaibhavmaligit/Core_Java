package com.EmployeeMgtSystem;

public class Company {

	public static void main(String[] args) {
		Department d = new Department();
		AllEmployee all = d.addAllEmployee();
	
		System.out.println("Employee 1 Details :");
	System.out.println("Employee Id:"+" "+all.emp1.eId+"  "+"Employee Name:"+" "+all.emp1.eName+"  "+"Employee Salary:"+" "+all.emp1.eSalary);
	System.out.println("   ");
	System.out.println("Employee 2 Details :");
	System.out.println("Employee Id:"+" "+all.emp2.eId+"  "+"Employee Name:"+" "+all.emp2.eName+"  "+"Employee Salary:"+" "+all.emp2.eSalary);
	System.out.println("   ");
	System.out.println("Employee 3 Details :");
	System.out.println("Employee Id:"+" "+all.emp3.eId+"  "+"Employee Name:"+" "+all.emp3.eName+"  "+"Employee Salary:"+" "+all.emp3.eSalary);
	System.out.println("   ");
	System.out.println("Employee 4 Details :");
	System.out.println("Employee Id:"+" "+all.emp4.eId+"  "+"Employee Name:"+" "+all.emp4.eName+"  "+"Employee Salary:"+" "+all.emp4.eSalary);

	}
}

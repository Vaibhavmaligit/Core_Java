package com.inheritanceMethodOverride;

public class Manager extends Employee {
	int teamSize;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Manager Details>>>  | EmployeeId = "+eId+" | EmployeeName = "+ eName +" | EmployeeSalary = "+ eSalary +" | Team Size = "+ teamSize+" |";
	}
	
}

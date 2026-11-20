package com.inheritanceMethodOverride;

public class Tester extends Employee {
int NoOfBugsFixed;

@Override
	public String toString() {
		// TODO Auto-generated method stub
	return "Tester Details>>>  | EmployeeId = "+eId+" | EmployeeName = "+ eName +" | EmployeeSalary = "+ eSalary +" | Number Of Bugs Fixed = "+ NoOfBugsFixed+" |";
	}
}

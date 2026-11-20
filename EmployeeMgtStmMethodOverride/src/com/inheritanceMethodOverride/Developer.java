package com.inheritanceMethodOverride;

public class Developer extends Employee {
String ProgrammingLanguage;

@Override
	public String toString() {
		// TODO Auto-generated method stub
	return "Developer Details>>>  | EmployeeId = "+eId+" | EmployeeName = "+ eName +" | EmployeeSalary = "+ eSalary +" | Programming Language = "+ ProgrammingLanguage+" |";
	}

}

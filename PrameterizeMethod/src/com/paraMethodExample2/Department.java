package com.paraMethodExample2;

public class Department {
	public void addEmployee() {
		Employee e = new Employee();
		e.eId = 23;
		e.Name = "Rohan";
		e.Salary = 20000.00;
		
		Company c = new Company();
		c.displayEmployee(e);
	}
	public void addAllEmployee() {
		AllEmployee all = new AllEmployee();
		all.emp10.eId = 222;
		all.emp10.Name = "EMPLOYEE 1";
		all.emp10.Salary = 30000.00;
		
		all.emp11.eId = 444;
		all.emp11.Name = "EMPLOYEE 2";
		all.emp11.Salary = 40000.00;
				
		all.emp12.eId = 666;
		all.emp12.Name = "EMPLOYEE 3";
		all.emp12.Salary = 50000.00;
		
		all.emp13.eId = 777;
		all.emp13.Name = "EMPLOYEE 4";
		all.emp13.Salary = 60000.00;
		
		Company c = new Company();
		c.displayAllEmployee(all);
	}
}


public class Admin {

	public static void main(String[] args) {
		System.out.println("EMPLOYEE SALARY DETAILS");
		System.out.println("");
		Developer d = new Developer();
		d.setSalary(40000);
		System.out.println("Developer's Salary Including Bonus : "+ d.CalculateSalary());
		
		Tester t = new Tester();
		t.setSalary(35000);
		System.out.println("");
		System.out.println("Tester's Salary Including Bonus : " + t.CalculateSalary());
		
		Manager m = new Manager();
		m.setSalary(60000);
		System.out.println("");
		System.out.println("Manager's Salary Including Bonus : " + m.CalculateSalary() );
	}
	
}

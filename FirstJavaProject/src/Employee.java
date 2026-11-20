
public class Employee {
	int eId = 10;
	String eName = "Vaibhav";
	int eSalary = 800000;
	
	public void companyDetails() {
		int companyId =	24;
		String companyName = "Google";
		String cAddress = "Pune";
		System.out.println(companyId);
		System.out.println(companyName);
		System.out.println(cAddress);
}
	
public static void main(String[] args) {
	Employee e = new Employee();
	System.out.println(e.eId);
	System.out.println(e.eName);
	System.out.println(e.eSalary);
	e.companyDetails();
}
}

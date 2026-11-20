package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class MainEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(22,"VAIBHAV");
		Employee e2 = new Employee(22,"VAIBHAV");
		//Employee e2 = new Employee(33,"ROHAN");
		
		Set<Employee> st = new HashSet<Employee>();
		st.add(e1);
		st.add(e2);
		
		System.out.println(st.size());
		
	}
}

package ProblemSolvingQuestions;

import java.util.ArrayList;
import java.util.List;
// Q.14 HOW DO YOU REMOVE GIVEN ELEMENT FROM AN ARRAYLIST ?
//==> USING REMOVE(object) METHOD.
public class Question14 {
	public static void main(String[] args) {
		List lt = new ArrayList();
		lt.add("VAIBHAV");
		lt.add(300);
		lt.add(true);
		lt.add(null);
		lt.add(2900);
		
		lt.remove("VAIBHAV"); // will remove VAIBHAV
		// we can remove by object/element for non integer value.
		System.out.println(lt);
		lt.remove(Integer.valueOf(300)); // will remove 300
		// for integer.
		System.out.println(lt);
}
}
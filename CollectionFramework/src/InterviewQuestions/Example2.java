package InterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Example2 {
 
	public static void main(String[] args) {
		
		List<Integer> lt = new ArrayList<Integer>();
		
		lt.add(500);
		lt.add(600);
		lt.add(700);
		lt.add(800);
		lt.add(900);
		lt.add(500);
		lt.add(600);
		lt.add(700);
		System.out.println(lt);
		
		//Q. WHAT IF WE NEED TO REMOVE DUPLICATE ELEMENTS FROM THIS LIST ?
		//==> WE WILL PUT THIS LIST INTO SET.
		System.out.println("\nREMOVE DUPLICATE ELEMENTS =>>");
		
		System.out.println("\n==USING HashSet==");
		Set<Integer> st = new HashSet<Integer>(lt);
		System.out.println(st);
		
		System.out.println("\n==USING LinkedHashSet==");
		Set<Integer> st1 = new LinkedHashSet<Integer>(lt);
		System.out.println(st1);
		
	}

	
}

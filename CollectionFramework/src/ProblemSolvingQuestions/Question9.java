package ProblemSolvingQuestions;

import java.util.ArrayList;

// Q. HOW DO YOU RETRIEVE AN ELEMENT FROM A PARTICULAR POSITION OF AN ARRAYLIST ?
// ==> USING GET() METHOD.
public class Question9 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al.get(3)); // 40
		// WE WILL PASS INDEX NO. IN GET METHOD.
}
}

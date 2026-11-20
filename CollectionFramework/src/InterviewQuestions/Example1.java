package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		String s = "Vaibhav";
		String s1 = new String("Vaibhav");
		String s2 = "Vai";
		String s3 = s2+"bhav";
		String s4 = "vaibhav";
		String s5 = new String("VAIBHAV");
		
		Set<String> st = new HashSet<String>();
		st.add(s);
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		
		System.out.println(st);
		System.out.println(st.size()); //4
	}
}

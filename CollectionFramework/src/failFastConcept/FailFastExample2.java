package failFastConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FailFastExample2 {

	public static void main(String[] args) {
		
		Set<Integer> st = new HashSet<Integer>();
		st.add(101);
		st.add(200);
		st.add(800);
		st.add(400);
		
		Iterator<Integer> itr= st.iterator();
		//st.add(333);
		while(itr.hasNext()) {
			st.add(333);
			st.remove(3);
			st.contains(800);
			System.out.println(itr.next());
		}
	}
}

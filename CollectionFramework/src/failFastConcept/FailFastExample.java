package failFastConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {

	public static void main(String[] args) {
		
		List<String> lt = new ArrayList<String>();
		lt.add("VAIBHAV");
		lt.add("LALIT");
		lt.add("JAY");
		lt.add("ROHAN");
		
		Iterator<String> itr = lt.iterator();
		//lt.remove(1);
		while(itr.hasNext()) {
			lt.add("SOHAM");
			lt.remove(1);
			System.out.println(itr.next());
		}
	}
}

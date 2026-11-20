package collectionsClass;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CollectionsClassExampleOfSet {
   
	public static void main(String[] args) {

	Set<String> st = new HashSet<String>();
	Collections.addAll(st, "VAIBHAV","LALIT","SOMAH","RAJ");
	System.out.println(st);
	
	System.out.println(Collections.min(st));
	
	System.out.println(Collections.max(st));
	
	Collections.synchronizedSet(st);
	System.out.println(st);
	
	st = Collections.unmodifiableSet(st);
	//st.add("rohan");
	System.out.println(st);
	
	st = Collections.emptySet();
	System.out.println(st);
	

	
	
}
}
	

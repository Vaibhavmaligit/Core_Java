package failFastConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FailFastExample3 {

	public static void main(String[] args) {
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(111, "VAIBHAV");
		mp.put(222, "JAY");
		mp.put(333, "PRANAV");
		mp.put(444, "LALIT");
		
		Set<Integer> st = mp.keySet();
		//mp.put(888, "RAJ");
		Iterator<Integer> itr = st.iterator();
		//mp.put(888, "RAJ");
		while(itr.hasNext()) {
			mp.put(888, "RAJ");
		Integer i = itr.next();
		System.out.println(i+" "+mp.get(i));
		}
		
	}
}

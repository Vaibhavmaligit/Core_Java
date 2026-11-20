package failSafeConcept;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample3 {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> cm = new ConcurrentHashMap<Integer, String>();
		cm.put(99, "VICKY");
		cm.put(88, "LUCKY");
		cm.put(77, "SAGAR");
		
		Set<Integer> st = cm.keySet();
		//cm.put(55, "PRANSH");
		Iterator<Integer> itr = st.iterator();
		//cm.put(55, "PRANSH");
		while(itr.hasNext()) {
			cm.put(55, "PRANSH");
			Integer i = itr.next();
			//cm.put(55, "PRANSH");
			System.out.println(i+" "+cm.get(i));
		}
	}
}

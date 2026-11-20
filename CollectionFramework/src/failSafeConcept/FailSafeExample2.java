package failSafeConcept;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class FailSafeExample2 {

	public static void main(String[] args) {
		
		CopyOnWriteArraySet<Integer> cs = new CopyOnWriteArraySet<Integer>();
		cs.add(11);
		cs.add(12);
		cs.add(13);
		
		Iterator<Integer> itr = cs.iterator();
		//cs.add(15);
		while(itr.hasNext()) {
			//cs.add(15);
			Integer i = itr.next();
			cs.add(15);
			System.out.println(cs);
		}
		
	}
}

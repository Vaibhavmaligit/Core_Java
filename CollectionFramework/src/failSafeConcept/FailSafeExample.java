package failSafeConcept;


import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> clist = new CopyOnWriteArrayList();
		clist.add("VAIBHAV");
		clist.add("JAY");
		clist.add("PRANAV");
		
		Iterator<String> itr = clist.iterator();
		//clist.add("LALIT");
		while(itr.hasNext()) {
			clist.add("LALIT");
			String s= itr.next();
			//clist.add("LALIT");
			System.out.println(clist);
		}
	}
}

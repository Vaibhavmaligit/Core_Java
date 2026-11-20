package listItteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterateExample4 {

public static void main(String[] args) {
		
		List lt = new ArrayList();
		
		lt.add(77);
		lt.add("JAY");
		lt.add('D');
		lt.add(true);
		lt.add(88.66);
		lt.add(null);
		
		System.out.println("---USING ITERATOR---");
	    Iterator itr =lt.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	   System.out.println("\n---USING FOR EACH---"); 
	    for (Object obj :lt) {
	    	System.out.println(obj);
	    }
	}
	
	
}

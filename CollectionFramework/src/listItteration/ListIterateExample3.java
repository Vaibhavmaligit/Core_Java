package listItteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterateExample3 {
public static void main(String[] args) {
		
		List<Double> lt = new ArrayList<Double>();
		
		lt.add(22.33);
		lt.add(33.66);
		lt.add(44.55);
		lt.add(66.77);
		lt.add(88.99);
		
		System.out.println("---USING ITERATOR---");
	    Iterator<Double> itr =lt.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	   System.out.println("\n---USING FOR EACH---"); 
	    for (Double db :lt) {
	    	System.out.println(db);
	    }
	}
}

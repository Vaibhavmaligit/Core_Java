package listItteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterateExample2 {
public static void main(String[] args) {
		
		List<Integer> lt = new ArrayList<Integer>();
		
		lt.add(500);
		lt.add(600);
		lt.add(700);
		lt.add(800);
		lt.add(900);
		
		System.out.println("---USING ITERATOR---");
	    Iterator<Integer> itr =lt.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	   System.out.println("\n---USING FOR EACH---"); 
	    for (Integer it :lt) {
	    	System.out.println(it);
	    }
	    
	    System.out.println("---USING FOR LOOP---");
	    for (int i =0; i<lt.size(); i++) {
	    	
	    	System.out.println(lt.get(i));
	    }
	}
}

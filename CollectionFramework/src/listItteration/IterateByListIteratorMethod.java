package listItteration;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterateByListIteratorMethod {

public static void main(String[] args) {
		
		List<Integer> lt = new ArrayList<Integer>();
		
		lt.add(500);
		lt.add(600);
		lt.add(700);
		lt.add(800);
		lt.add(900);
		
		System.out.println("---USING LISTITERATOR---");
	    ListIterator<Integer> litr =lt.listIterator();
	    while(litr.hasNext()) {
	    	System.out.println(litr.next());
	    }
	    System.out.println("--HAS PREVIOUS METHOID---");
	    while (litr.hasPrevious()) {
	    	System.out.println(litr.previous());
	    }
	    
	   System.out.println("\n---USING FOR EACH---"); 
	    for (Integer it :lt) {
	    	System.out.println(it);
	    }
	}
}

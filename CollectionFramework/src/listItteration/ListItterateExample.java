package listItteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListItterateExample {

	public static void main(String[] args) {
		
		List<String> lt = new ArrayList<String>();
		
		lt.add("VAIBHAV");
		lt.add("LALIT");
		lt.add("ROHAN");
		lt.add("JAY");
		lt.add("NIKHIL");
		
		System.out.println("---USING ITERATOR---");
	    Iterator<String> itr =lt.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	   System.out.println("\n---USING FOR EACH---"); 
	    for (String str :lt) {
	    	System.out.println(str);
	    }
	}
}

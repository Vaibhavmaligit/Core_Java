package mapBigDataExamples;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UniversityMain {

	public static void main(String[] args) {
		UniversityMap um = new UniversityMap();
		Map<String,Map<Integer, String> > map = um.addUniversity();
//============================================================================		
		System.out.println("===Iterate using keySet Method===");
		Set<String> st= map.keySet();
		//System.out.println(st);
		System.out.println("==USING ITERATOR==");
		Iterator<String> itr = st.iterator();
		while(itr.hasNext()) {
			String mahauni = itr.next();
			System.out.println(mahauni);
			Map<Integer, String> map2 = map.get(mahauni);
			Set<Integer> st2 = map2.keySet();
			Iterator<Integer> itr2= st2.iterator();
			while(itr2.hasNext()) {
				Integer key = itr2.next();
				System.out.println(key+" "+map2.get(key));
			}
		}
		System.out.println("==USING FOR EACH==");
		for(String s :st) {
			System.out.println(s);
			Map<Integer, String> map2 = map.get(s);
			Set<Integer> s2= map2.keySet();
			for( Integer i :s2) {
				System.out.println(i+" "+map2.get(i));
			}
		}
//===============================================================================	
		System.out.println("\n===Iterate using entrySet Method===");
		Set<Map.Entry<String, Map<Integer, String>>> set = map.entrySet(); 
		//System.out.println(set);
		System.out.println("===USING ITERATOR===");
	       Iterator<Map.Entry<String, Map<Integer, String>>> it= set.iterator();
	       while(it.hasNext()) {
	    	   Map.Entry<String, Map<Integer, String>> mauni = it.next();
	    	   System.out.println(mauni.getKey());
	    	   Map<Integer, String> map2= mauni.getValue();
	    	   Set<Map.Entry<Integer, String>> set2 =map2.entrySet();
	    	  Iterator<Map.Entry<Integer, String>> itrst = set2.iterator();
	    	  while(itrst.hasNext()) {
	    		  Map.Entry<Integer, String> streams = itrst.next();
	    		  System.out.println(streams.getKey()+" "+streams.getValue());
	    	  }  
	       }
	       
	       System.out.println("==USING FOR EACH==");
	       for(Map.Entry<String, Map<Integer, String>> m :set) {
	    	   System.out.println(m.getKey());
	    	   Map<Integer, String> map2 = m.getValue();
	    	   for( Map.Entry<Integer, String> stream :map2.entrySet()) {
	    		   System.out.println(stream.getKey()+" "+stream.getValue());
	    	   }
	    	   
	       }
	       
	       
		
	}
}

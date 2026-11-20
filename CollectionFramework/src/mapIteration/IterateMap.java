package mapIteration;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateMap {
	public static void main(String[] args) {	
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "VAIBHAV");
		map.put(102, "LALIT");
		map.put(103, "VICKY");
		map.put(104, "JAY");
		System.out.println(map);
		
		System.out.println("\n=====ITERATE USING keySet Method====");
	 Set<Integer> st = map.keySet();
	 
	 System.out.println("\n==USING ITERATOR METHOD==");
	  Iterator<Integer> itr = st.iterator();
	  while(itr.hasNext()) {
		 Integer i = itr.next();
		 System.out.println(i+" "+map.get(i));
	  }
		System.out.println("\n==USING FOR EACH==");
		for(Integer i:st) {
			System.out.println(i+" "+map.get(i));
		}
		
		System.out.println("\n====ITERATE USING entrySet METHOD====");
	Set<Map.Entry<Integer, String>> stme = map.entrySet();
	
	 System.out.println("\n==USING ITERATOR METHOD==");
	 Iterator<Map.Entry<Integer, String>> itrme = stme.iterator();
	 while(itrme.hasNext()) {
		 Map.Entry<Integer, String> me = itrme.next();
		 System.out.println(me.getKey()+" "+me.getValue());
	 }
	 System.out.println("\n==USING FOR EACH==");
		for( Map.Entry<Integer, String> me : stme) {
		System.out.println(me.getKey()+" "+me.getValue());
		}
		
		System.out.println("\n=====ITERATE USING values Method====");
		Collection<String> sts= map.values();
		
		System.out.println("\n==USING ITERATOR METHOD==");
		Iterator<String> its =sts.iterator();
		while(its.hasNext()) {
			String s = its.next();
			System.out.println(s);
		}
		System.out.println("\n==USING FOR EACH==");
		for(String s : sts) {
			System.out.println(s);
		}
	}
}

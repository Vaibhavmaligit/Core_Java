package map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	
	public static void main(String[] args) {
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(222, "VAIBHAV");
		mp.put(333, "ROHAN");
		mp.put(444, "JAY");
		mp.put(555, "LUCKY");
		mp.put(333, "AMOL"); //replace Rohan
		mp.put(888, "VAIBHAV");
		mp.put(999, "VAIBHAV");
		mp.put(null, "abc");
		mp.put(666, null);
		mp.put(777, null);
		System.out.println(mp);
		
		System.out.println(mp.get(444));
		System.out.println(mp.size());
		System.out.println(mp.containsKey(333));
		System.out.println(mp.containsValue("LUCKY"));
		System.out.println(mp.isEmpty());
		mp.remove(888);
		
		System.out.println(mp);
		
		//in get() method if we are passing key which is not available 
		//there then it gives return value as null.
		System.out.println(mp.get(111));
		Map<Integer, Integer> mp1 = new HashMap<Integer, Integer>();
		mp1.put(11,22);
		mp1.put(33,44);
		System.out.println(mp1.get(55));
		
	
	}
}

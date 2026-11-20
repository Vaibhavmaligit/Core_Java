package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DifferenceBetnHashMapLinkedhashMapTreeMap {

	public static void main(String[] args) {
		
		System.out.println("==USING HashMap==");
		// requirement only key value pair
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(222, "VAIBHAV");
		mp.put(333, "ROHAN");
		mp.put(444, "JAY");
		mp.put(555, "LUCKY");
		mp.put(null, "abc");
		System.out.println(mp);
		
		System.out.println("\n==USING LinkedHashMap==");
		//key value pair with Following Insertion Order
		Map<Integer, String> mp1 = new LinkedHashMap<Integer, String>();
		mp1.put(222, "VAIBHAV");
		mp1.put(333, "ROHAN");
		mp1.put(444, "JAY");
		mp1.put(555, "LUCKY");
		mp1.put(null, "abc");
		System.out.println(mp1);
		
		System.out.println("\n==USING TreeMap==");
		//key value pair with Sorting -- Ascending order
		Map<Integer, String> mp2 = new TreeMap<Integer, String>();
		mp2.put(222, "VAIBHAV");
		mp2.put(333, "ROHAN");
		mp2.put(555, "LUCKY");
		mp2.put(444, "JAY");
		mp2.put(111, "ABHI");
		System.out.println(mp2);

	}
}

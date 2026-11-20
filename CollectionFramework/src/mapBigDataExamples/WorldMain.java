package mapBigDataExamples;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WorldMain {

	public static void main(String[] args) {
		WorldMap wm = new WorldMap();
		Map<String,Map<String,Map<Integer, String>>> map = wm.addWorld();
		//System.out.println(map);
//----------------------------------------------------------------------------------		
		System.out.println("==Iterate using keySet Method==");
		  Set<String> set = map.keySet();
		  System.out.println("\n==USING ITERATOR==");
		 Iterator<String> itr = set.iterator();
		 while(itr.hasNext()) {
			 String s = itr.next();
			 System.out.println(s);
			 Map<String,Map<Integer, String>> map2 = map.get(s);
			 Set<String> set2= map2.keySet();
			 Iterator<String> itr2 = set2.iterator();
			 while(itr2.hasNext()) {
				 String s2 = itr2.next();
				 System.out.println(s2);
				 Map<Integer, String> map3 = map2.get(s2);
				 Set<Integer> set3 = map3.keySet();
				Iterator<Integer> itr3 = set3.iterator();
				while(itr3.hasNext()) {
					Integer i = itr3.next();
					System.out.println(i+" "+map3.get(i));
				}
			 }
		 }
		 System.out.println("\n==USING FOR EACH==");
		 for(String s: set) {
			 System.out.println(s);
			 Map<String,Map<Integer, String>> map2 = map.get(s);
			Set<String> set2 = map2.keySet();
			for(String s1 : set2) {
				System.out.println(s1);
				Map<Integer, String> map3 = map2.get(s1);
				Set<Integer> set3= map3.keySet();
				for(Integer i:set3) {
					System.out.println(i+" "+map3.get(i));
				}
			}
		 }
//--------------------------------------------------------------------------------		 
		System.out.println("\n==Iterate using entrySet Method==");
		Set<Map.Entry<String, Map<String,Map<Integer, String>>>> set1 = map.entrySet();
		//System.out.println(set3);
		System.out.println("\n==USING ITERATOR==");
		Iterator<Map.Entry<String, Map<String,Map<Integer, String>>>> itr1 = set1.iterator();
		while(itr1.hasNext()) {
			Map.Entry<String, Map<String,Map<Integer, String>>> map1 = itr1.next();
			System.out.println(map1.getKey());
			Map<String,Map<Integer, String>> map2 = map1.getValue();
			Set<Map.Entry<String,Map<Integer, String>>> set2 = map2.entrySet();
			Iterator<Map.Entry<String,Map<Integer, String>>> itr2= set2.iterator();
			while(itr2.hasNext()) {
				Map.Entry<String,Map<Integer, String>> map3= itr2.next();
				System.out.println(map3.getKey());
				Map<Integer, String> map4 = map3.getValue();
				Set<Map.Entry<Integer, String>> set3= map4.entrySet();
				Iterator<Map.Entry<Integer, String>> itr3 = set3.iterator();
				while(itr3.hasNext()) {
					Map.Entry<Integer, String> map5 = itr3.next();
					System.out.println(map5.getKey()+" "+map5.getValue());
				}
			}
		}
		System.out.println("\n==USING FOR EACH==");
		for(Map.Entry<String, Map<String,Map<Integer, String>>> map1:set1) {
			System.out.println(map1.getKey());
			Map<String,Map<Integer, String>> map2 = map1.getValue();
			for(Map.Entry<String,Map<Integer, String>> map3 :map2.entrySet()) {
				System.out.println(map3.getKey());
				Map<Integer, String> map4 = map3.getValue();
				for(Map.Entry<Integer, String> map5 :map4.entrySet()) {
					System.out.println(map5.getKey()+" "+map5.getValue());
				}
			}
		}
	}
}

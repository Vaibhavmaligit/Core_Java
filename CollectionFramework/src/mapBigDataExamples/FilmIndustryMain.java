package mapBigDataExamples;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FilmIndustryMain {

	public static void main(String[] args) {
		
		FilmIndustry fi = new FilmIndustry();
		Map<String, Map<Integer, String>> map = fi.addMovies();
		//System.out.println(map);
		System.out.println("==Iterate using keySet Method==");
		Set<String> set = map.keySet();
		//System.out.println(set);
		System.out.println("==USINF ITERATOR==");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String s =itr.next();
			System.out.println(s);
			Map<Integer, String> map2= map.get(s);
			Set<Integer> set2= map2.keySet();
			Iterator<Integer> itr2 = set2.iterator();
			while(itr2.hasNext()) {
				Integer i = itr2.next();
				System.out.println(i+" "+map2.get(i));
			}
		}
		System.out.println("==FOR EACH==");
		for(String s: set) {
			System.out.println(s);
			Map<Integer, String> map2 = map.get(s);
			Set<Integer> set2 =map2.keySet();
			for(Integer i : set2) {
				System.out.println(i+" "+map2.get(i));
			}
		}
		
		System.out.println("\n==Iterate using entrySet Method==");
		 Set<Map.Entry<String, Map<Integer, String>>> set1 = map.entrySet();
		 System.out.println("==USING ITERATOR==");
		 Iterator<Map.Entry<String, Map<Integer, String>>> itr1 = set1.iterator();
		 while(itr1.hasNext()) {
			 Map.Entry<String, Map<Integer, String>> map2 = itr1.next();
			 System.out.println(map2.getKey());
			 Map<Integer, String> map3 = map2.getValue();
			 Set<Map.Entry<Integer, String>> set2 = map3.entrySet();
			 Iterator<Map.Entry<Integer, String>> itr2 = set2.iterator();
			 while(itr2.hasNext()) {
				 Map.Entry<Integer, String> movie = itr2.next();
				 System.out.println(movie.getKey()+" "+movie.getValue());
			 }
		 }
		 System.out.println("==USING FOR EACH==");
		 for(Map.Entry<String, Map<Integer, String>> map1 :set1) {
			 System.out.println(map1.getKey());
			 Map<Integer, String> map2 = map1.getValue();
			 Set<Map.Entry<Integer, String>> set2= map2.entrySet();
			 for(Map.Entry<Integer, String> map3:set2) {
				 System.out.println(map3.getKey()+" "+map3.getValue());
			 }
		 }
	}
}

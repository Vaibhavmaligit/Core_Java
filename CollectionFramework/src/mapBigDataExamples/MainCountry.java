package mapBigDataExamples;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainCountry {

	public static void main(String[] args) {
		Country c = new Country();
		Map<String, List<String>> mapoflist = c.addStates();
		// System.out.println(mapoflist);
		
		System.out.println("==Iterate using keySet Method==");
		Set<String> set = mapoflist.keySet();
		System.out.println("==USING ITERATOR== ");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String states = itr.next();
			System.out.println(states+" CITIES :");
			List<String> lst = mapoflist.get(states);
			Iterator<String> itrcity = lst.iterator();
			while (itrcity.hasNext()) {
				System.out.println(itrcity.next());
			}
		}
		System.out.println("==USING FOR EACH==");
		for(String s: set) {
			System.out.println(s+" CITIES :");
			List<String> ls = mapoflist.get(s);
			for(String cities :ls) {
			System.out.println(cities);
			}
		}
		
		System.out.println("\n==Iterate Using entrySet Method==");
		Set<Map.Entry<String,List<String>>> mapintoset = mapoflist.entrySet();
		System.out.println("==USING ITERATOR==");
		Iterator<Map.Entry<String,List<String>>> itr2 = mapintoset.iterator();
		while(itr2.hasNext()) {
			Map.Entry<String,List<String>> state = itr2.next();
			System.out.println(state.getKey()+" CITIES :");
			List<String> cities= state.getValue();
			Iterator<String> itr3 =cities.iterator();
			while(itr3.hasNext()) {
				System.out.println(itr3.next());	
			}
		}
		System.out.println("==USING FOR EACH==");
		for(Map.Entry<String,List<String>> state: mapintoset) {
			System.out.println(state.getKey()+" CITIES :");
			for(String city:state.getValue()) {
				System.out.println(city);
			}
			}
			
		}
	}


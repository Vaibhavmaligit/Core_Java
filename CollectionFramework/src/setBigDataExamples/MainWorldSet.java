package setBigDataExamples;

import java.util.Iterator;
import java.util.Set;


public class MainWorldSet {

	public static void main(String[] args) {
		WorldSet wl = new WorldSet();
		Set<Set<Set<String>>> world = wl.addCountry();
		System.out.println(world);
		
		System.out.println("---Iterate by iterator method---");
		Iterator<Set<Set<String>>> itr = world.iterator();
		while(itr.hasNext()) {
			Set<Set<String>> st = itr.next();
			Iterator<Set<String>> itr2= st.iterator();
			while(itr2.hasNext()) {
				Set<String> st1 = itr2.next();
				Iterator<String> itr3 = st1.iterator();
				while(itr3.hasNext()) {
					System.out.println(itr3.next());
				}
			}
		}
		System.out.println("\n---Iterate by for each loop---");
		for(Set<Set<String>> st : world) {
			for(Set<String> st2 : st)
				for(String cities : st2 )
					System.out.println(cities);
		}
	}
		
}

package setBigDataExamples;

import java.util.Iterator;
import java.util.Set;

public class MainCountry {

public static void main(String[] args) {
		
		CountrySet cl = new CountrySet();
		Set<Set<String>> india = cl.addStates();
		System.out.println(india);
		
		System.out.println("\nIterate through iterator method");
		Iterator<Set<String>> itr = india.iterator();
		while(itr.hasNext()) {
			Set<String> stlit = itr.next();
			Iterator<String> st= stlit.iterator();
			while(st.hasNext()) {
				String str = st.next();
				System.out.println(str);
			}
		}
		System.out.println("\nIterate through for each loop");
		for (Set<String> city : india) {
			for(String cities : city)
			System.out.println(cities);
		}
	}
	
	
}

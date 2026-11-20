package listBigDataExamples;

import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		CountryList cl = new CountryList();
		List<List<String>> india = cl.addStates();
		System.out.println(india);
		
		System.out.println("\nIterate through iterator method");
		Iterator<List<String>> itr = india.iterator();
		while(itr.hasNext()) {
			List<String> stlit = itr.next();
			//System.out.println(stlit);
			Iterator<String> st= stlit.iterator();
			while(st.hasNext()) {
				String str = st.next();
				System.out.println(str);
			}
		}
		System.out.println("\nIterate through for each loop");
		for (List<String> city : india) {
			for(String cities : city)
			System.out.println(cities);
		}
	}
}

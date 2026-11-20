package listBigDataExamples;

import java.util.Iterator;
import java.util.List;

public class MainWorld {
public static void main(String[] args) {
	WorldList wl = new WorldList();
	List<List<List<String>>> world = wl.addCountry();
	System.out.println(world);
	
	System.out.println("---Iterate by iterator method---");
	Iterator<List<List<String>>> itr = world.iterator();
	while(itr.hasNext()) {
		List<List<String>> lst = itr.next();
		Iterator<List<String>> itr2= lst.iterator();
		while(itr2.hasNext()) {
			List<String> lst1 = itr2.next();
			Iterator<String> itr3 = lst1.iterator();
			while(itr3.hasNext()) {
				System.out.println(itr3.next());
			}
		}
	}
	System.out.println("\n---Iterate by for each loop---");
	for(List<List<String>> lst : world) {
		for(List<String> lst2 : lst)
			for(String cities : lst2 )
				System.out.println(cities);
	}
}
	
	
}

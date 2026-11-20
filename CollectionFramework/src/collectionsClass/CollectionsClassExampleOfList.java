package collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassExampleOfList {

	public static void main(String[] args) {
		
		List<Integer> lt = new ArrayList<Integer>();
		Collections.addAll(lt, 100,200,300,400,500); //adds multiple elements at a time
		System.out.println(lt);
		
		System.out.println(Collections.min(lt));  //gives minimum no. smallest no.
		
		System.out.println(Collections.max(lt)); //gives maximum no. biggest no.
		
		Collections.reverse(lt); // gives elements in reverse order 
		System.out.println(lt);
		
		Collections.shuffle(lt); // shuffles the elements
		System.out.println(lt);
		
		Collections.sort(lt); //sorts the list in ascending order
		System.out.println(lt);
		
		Collections.swap(lt, 0, 2); //swaps elements by index
		System.out.println(lt);
		
		List<Integer> lt2 = new ArrayList<Integer>();
		Collections.addAll(lt2, 10,11,12,13,14,15);
		System.out.println(lt2);
		Collections.copy(lt2, lt); //copies the elements of source list 
		System.out.println(lt2);
		
		Collections.synchronizedList(lt); //to make normal list thread safe
		System.out.println(lt);
		
		lt = Collections.unmodifiableList(lt); //we can't modify list
		//lt.add(30);
		//Collections.shuffle(lt);
		System.out.println(lt);
		
		lt = Collections.emptyList(); // removes elements from list - empty elements
		System.out.println("empty list");
		System.out.println(lt);
	}
}

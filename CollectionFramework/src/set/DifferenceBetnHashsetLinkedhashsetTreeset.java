package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DifferenceBetnHashsetLinkedhashsetTreeset {

	public static void main(String[] args) {
		
		System.out.println("--HASHSET--");
		//NO DUPLICATE ELEMENTS
		Set<String> set = new HashSet<String>();
		set.add("VAIBHAV");
		set.add("ROHAN");
		set.add("JAY");
		set.add("ROHIT");
		set.add("JAY");
		set.add("ROHIT");
		set.add(null);
		System.out.println(set);
		
		System.out.println("\n--LINKED HASHSET--");
		//NO DUPLICATE + FOLLOWS INSERTION ORDER
		Set<String> set1 = new LinkedHashSet<String>();
		set1.add("VAIBHAV");
		set1.add("ROHAN");
		set1.add("JAY");
		set1.add("ROHIT");
		set1.add("JAY");
		set1.add("ROHIT");
		set.add(null);
		System.out.println(set1);
		
		System.out.println("\n--TREESET--");
		//NO DUPLICATE + SORTING - ASSCENDING ORDER
		//NO NULL ALLOWED - GIVES NULLPOINTEREXCEPTION
		Set<Integer> set3 = new TreeSet<Integer>();
		set3.add(10);
		set3.add(20);
		set3.add(30);
		set3.add(40);
		set3.add(30);
		set3.add(40);
		System.out.println(set3);
		
		Set s = new HashSet();
		s.add("A");
		s.add('A');
		System.out.println(s);
	}
}

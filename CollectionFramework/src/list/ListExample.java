package list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add("VAIBHAV");
	    al.add(null);
	    al.add(true);
	    al.add('A');
	    al.add("VAIBHAV");
	    al.add(null);
	    
	    List l = new ArrayList();
	    l.add(111);
	    l.add(222);
	    l.add(333);
	    l.add("LALIT");
	    
	    System.out.println(al);
	    
	    System.out.println(al.contains("VAIBHAV"));
	    System.out.println(al.get(4));
	    System.out.println(al.isEmpty());
	    System.out.println(al.size());
	    System.out.println(al.remove(3));
	    System.out.println(al);
	    System.out.println(al.equals(al));
	    System.out.println(al.indexOf(50));
	   System.out.println(al.lastIndexOf(50));
	   al.addAll(l);
	   System.out.println(al);
	}
	
}

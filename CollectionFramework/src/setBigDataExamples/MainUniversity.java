package setBigDataExamples;

import java.util.Iterator;
import java.util.Set;


public class MainUniversity {

public static void main(String[] args) {
		
		UniversitySet ul = new UniversitySet();
		Set<Set<String>> maharashtrauniversity = ul.addUniversity();
		System.out.println(maharashtrauniversity);
		
		System.out.println("\nIterate using iterator method");
		Iterator<Set<String>> courses = maharashtrauniversity.iterator();
		while (courses.hasNext()) {
			Set<String> courseinfo = courses.next();
		 Iterator<String> lst = courseinfo.iterator();
		 while (lst.hasNext()) {
			 System.out.println(lst.next());
		 }
		}
		System.out.println("\nIterate using for each loop");
		for (Set<String> course : maharashtrauniversity) {
			for(String courseinfo : course) 
             System.out.println(courseinfo);
		}
	}
}

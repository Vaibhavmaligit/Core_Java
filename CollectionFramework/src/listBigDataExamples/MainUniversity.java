package listBigDataExamples;

import java.util.Iterator;
import java.util.List;

public class MainUniversity {

	public static void main(String[] args) {
		
		UniversityList ul = new UniversityList();
		List<List<String>> maharashtrauniversity = ul.addUniversity();
		System.out.println(maharashtrauniversity);
		
		System.out.println("\nIterate using iterator method");
		Iterator<List<String>> courses = maharashtrauniversity.iterator();
		while (courses.hasNext()) {
			List<String> courseinfo = courses.next();
		 Iterator<String> lst = courseinfo.iterator();
		 while (lst.hasNext()) {
			 System.out.println(lst.next());
		 }
		}
		System.out.println("\nIterate using for each loop");
		for (List<String> course : maharashtrauniversity) {
			for(String courseinfo : course) 
             System.out.println(courseinfo);
		}
	}
}
 
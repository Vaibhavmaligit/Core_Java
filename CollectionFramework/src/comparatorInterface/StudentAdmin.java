package comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class StudentAdmin {

	public static void main(String[] args) {
		
		Student s = new Student(11, "JAY", "PUNE",90);
		Student s1 = new Student(15, "VICKY", "NASHIK",92);
		Student s2 = new Student(13, "VAIBHAV", "WAKAD",85);
		Student s3 = new Student(14, "LALIT", "JALGAON",88);
		Student s4 = new Student(15, "RAJ", "RAVET",85);
		Student s5 = new Student(16, "LALIT", "TATHAWADE",88);
		
		List<Student> lt = new ArrayList<Student>();
		Collections.addAll(lt, s,s1,s2,s3,s4,s5);
		System.out.println("BEFORE SORTING");
		System.out.println(lt);
		
		//Collections.sort(lt, new SortByMarks());
		
		Collections.sort(lt, new SortByMarksAndId());
		System.out.println("AFTER SORTING");
		System.out.println(lt);
		
	}
}

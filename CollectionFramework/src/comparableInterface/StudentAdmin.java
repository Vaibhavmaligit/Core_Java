package comparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentAdmin {

	public static void main(String[] args) {
		Student s = new Student(11, "JAY", "PUNE");
		Student s1 = new Student(15, "VICKY", "NASHIK");
		Student s2 = new Student(13, "VAIBHAV", "WAKAD");
		Student s3 = new Student(12, "LALIT", "JALGAON");
		
		List<Student> lt = new ArrayList<Student>();
		Collections.addAll(lt, s,s1,s2,s3);
		System.out.println("==BEFORE SORTING==");
		System.out.println(lt);
		
		Collections.sort(lt);
		System.out.println("==AFTER SORTING==");
		System.out.println(lt);
		
	}
}

package studentMgtStmByMap;

import java.util.HashMap;
import java.util.Map;

public class College {

	public Map<Integer, Student> addStudents() {
	Student s =new Student();
	Student s1 = new Student();
	Student s2 = new Student();
	s.setsId(22);
	s.setsName("VAIBHAV");
	s.setsAddress("NASHIK");
	s1.setsId(33);
	s1.setsName("LALIT");
	s1.setsAddress("JALGAON");
	s2.setsId(44);
	s2.setsName("ROHIT");
	s2.setsAddress("PUNE");
	
	Map<Integer, Student> smap = new HashMap<Integer, Student>();
	smap.put(101, s);
	smap.put(102, s1);
	smap.put(103, s2);
	
	return smap;
	
	
	
	}
}

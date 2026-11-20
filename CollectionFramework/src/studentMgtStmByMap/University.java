package studentMgtStmByMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class University {

	public static void main(String[] args) {
		College c = new College();
		Map<Integer, Student> stdmap = c.addStudents();
		System.out.println("==ITERATE USING keySet METHOD==");
		Set<Integer> setstdmap = stdmap.keySet();
		System.out.println("==USING ITERATOR METHOD==");
		Iterator<Integer> itr = setstdmap.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i+" "+ stdmap.get(i));
		}
		System.out.println("==USINF FOREACH==");
		for (Integer i : setstdmap) {
			System.out.println(i+" "+ stdmap.get(i));
		}
		
		System.out.println("\n==ITERATE USING entrySet METHOD==");
		Set<Map.Entry<Integer, Student>> smes = stdmap.entrySet();
		System.out.println("==USING ITERATOR METHOD==");
		Iterator<Map.Entry<Integer, Student>> itr2 = smes.iterator();
		while(itr2.hasNext()) {
			Map.Entry<Integer, Student> mis = itr2.next();
			System.out.println(mis.getKey()+" "+mis.getValue());
		}
		System.out.println("==USINF FOREACH==");
		for(Map.Entry<Integer, Student> mes:smes) {
			System.out.println(mes.getKey()+" "+mes.getValue());
		}
	}
	
	
}

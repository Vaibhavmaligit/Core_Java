package serializationDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		s.setsId(11);
		s1.setsId(22);
		s2.setsId(33);
		s.setsName("VAIBHAV");
		s1.setsName("ROHIT");
		s2.setsName("JAY");
		s.setsAddress("NASHIK");
		s1.setsAddress("PUNE");
		s2.setsAddress("SHIRPUR");
		
		FileOutputStream file = new FileOutputStream("std.txt");
		ObjectOutputStream obj = new ObjectOutputStream(file);
		obj.writeObject(s);
		obj.writeObject(s1);
		obj.writeObject(s2);
		System.out.println("OBJECTS CONVERTED TO BYTE STREAM");
	} 
}

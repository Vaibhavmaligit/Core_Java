package serializationDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Deserialization {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("std.txt");
		ObjectInputStream obj = new ObjectInputStream(file);
		Student st = (Student)obj.readObject();
		Student st1 = (Student)obj.readObject();
		Student st2 = (Student)obj.readObject();
		
		System.out.println(st);
		System.out.println(st1);
		System.out.println(st2);
	}
}

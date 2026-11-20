package comparatorInterface;

public class Student{

	 int id;
	 String name;
	 String address;
	 int marks;
	public Student(int id, String name, String address, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}
	
}

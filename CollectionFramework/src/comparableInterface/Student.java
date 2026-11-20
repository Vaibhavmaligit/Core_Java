package comparableInterface;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private String address;
	
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
//	@Override
//	public int compareTo(Student o) {
//		if(this.id > o.id) {
//			return 1;
//			}else if(this.id<o.id) {
//		return -1;
//			}else {
//				return 0;
//			}
//	}
	
	
	
}

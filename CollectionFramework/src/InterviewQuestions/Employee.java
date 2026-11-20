package InterviewQuestions;

public class Employee {

	int eid;
	String ename;
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	//What if we only override hashCode method and not equals method ?
	@Override
	public int hashCode() {
		final int prime = 31;     // what if we removed this logic of block and returned 1 instead of result here.
		int result = 1;
		result = prime * result + eid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		return result;
	}
	
	//What if we only override equals method and not hashCode method ?
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eid != other.eid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		return true;
	}
	
}

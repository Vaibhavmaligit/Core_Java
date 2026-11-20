package model;

public class Faculty {

	public int fId;
	public String fName;
	public Course course;
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Faculty [fId=" + fId + ", fName=" + fName + ", course=" + course + "]";
	}
	
	
}

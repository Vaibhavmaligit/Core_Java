package com.aggregationExample;

public class Student {

	int sId;
	String sName;
	Batch b;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Batch getB() {
		return b;
	}
	public void setB(Batch b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", b=" + b + "]";
	}
	
	public static void main(String[] args) {
		Course c = new Course();
		c.setcId(333);
		c.setcName("JAVA");
		System.out.println(c);
		
		Faculty f = new Faculty();
		f.setfId(444);
		f.setfName("FACULTY NAME");
		f.setC(c);
		System.out.println(f);
		
		Batch b = new Batch();
		b.setbId(777);
		b.setbName("JAVA-57");
		b.setF(f);
		System.out.println(b);
		
		Student s = new Student();
		s.setsId(222);
		s.setsName("Vaibhav");
		s.setB(b);
		System.out.println(s);
		
		
	}
}

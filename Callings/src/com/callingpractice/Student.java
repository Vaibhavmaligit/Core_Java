package com.callingpractice;

public class Student {
	
Admin a = new Admin();
 
Student() {
	System.out.println("Constructor of Student");
}

{
	System.out.println("Non static block of Student");
}

static {
	System.out.println("Static block of Student");
}


}

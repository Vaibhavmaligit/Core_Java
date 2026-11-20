package com.id;

public class User {
int uid;
String uname;

public static void main(String[] args) {
	User u1 = new User();
	User u2 = new User();
	u1.uid = 300;
	u1.uname = "Raj";
	u2.uid = 500;
	u2.uname = "Rohit";
	System.out.println(u1.uid);
	System.out.println(u1.uname);
	System.out.println(u2.uid);
	System.out.println(u2.uname);
}
	
	
}

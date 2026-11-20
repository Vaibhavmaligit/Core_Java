package com.callingpractice2;

public class Model {


Model() {
	System.out.println("Constructor of Model");
}

static {
	System.out.println("Static block of Model");
}

{
	System.out.println("Non Static b of Model");
}

public static void main(String[] args) {
	Demo d = new Demo();
	Practice p = new Practice();
}
}

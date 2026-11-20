package com.covariantReturnType;

public class Cat extends Pet {

	@Override
	public void sound(int legcount, String type) {
		legs = legcount;
	    itsType = type;
		System.out.println("");
		System.out.println("Legs of Cat = "+ legs);
		System.out.println("Its Type ="+ itsType);
		System.out.println("Cat Sound = MEOW");
	}
	
	@Override
	public void behaviour() {
		System.out.println("Cat Behaviour = LAZZY");
	}
}



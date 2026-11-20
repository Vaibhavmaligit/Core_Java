package com.covariantReturnType;
public class Dog extends Pet {
	@Override
	public void sound(int legcount, String type) {
		legs = legcount;
	    itsType = type;
		System.out.println("Legs of Dog = "+ legs);
		System.out.println("Its Type ="+ itsType);
		System.out.println("Dog Sound = BARKS");
	}
	@Override
	public void behaviour() {
		System.out.println("Dog Behaviour = LOYAL");
	}
}

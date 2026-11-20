package com.covariantReturnType;

public class Zoo {
	public static void main(String[] args)
	{	
	System.out.println("WILD ANIMALS DETAILS");
	System.out.println("");
	
	Tiger t = new Tiger();
	t.sound(4, "Wild Animal");
	t.behaviour();
	
	Lion l = new Lion();
	l.sound(4, "Wild Animal");
	l.behaviour();
	
	System.out.println("");
	System.out.println("");
	System.out.println("PET ANIMALS DETAILS");
	System.out.println("");
	
	Dog d = new Dog();
	d.sound(4, "Pet Animal");
	d.behaviour();
	
	Cat c = new Cat();
	c.sound(4, "Pet Animal");
	c.behaviour();
	}
}

package com.covariantReturnType;
public class Lion extends Wild {
	@Override
	public void sound(int legcount, String type) {
		legs = legcount;
	    itsType = type;
		System.out.println("");
		System.out.println("Legs of Lion = "+ legs);
		System.out.println("Its Type ="+ itsType);
		System.out.println("Lion Sound = ROARS(of Lion)");
	}
	@Override
	public void behaviour() {
		System.out.println("Lion Behaviour = AGGRESSIVE (KING OF JUNGLE)");
	}
}

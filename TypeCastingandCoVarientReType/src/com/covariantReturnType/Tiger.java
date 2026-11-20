package com.covariantReturnType;
public class Tiger extends Wild {
	@Override
	public void sound(int legcount, String type) {
		legs = legcount;
	    itsType = type;
		System.out.println("Legs of Tiger = "+ legs);
		System.out.println("Its Type ="+ itsType);
		System.out.println("Tiger Sound = ROARS");
	}
	
	@Override
	public void behaviour() {
		System.out.println("Tiger Behaviour = AGGRESSIVE");
	}
}

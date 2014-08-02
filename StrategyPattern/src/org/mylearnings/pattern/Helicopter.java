package org.mylearnings.pattern;

public class Helicopter extends Vehicle{
	public Helicopter(String name) {
		setName(name);
		setGoAlgo(new GoByFlying());
	}
}

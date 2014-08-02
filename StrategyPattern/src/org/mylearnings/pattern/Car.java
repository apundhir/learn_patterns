package org.mylearnings.pattern;

public class Car extends Vehicle{
	public Car(String name){
		setName(name);
		setGoAlgo(new GoByDriving());
	}
}

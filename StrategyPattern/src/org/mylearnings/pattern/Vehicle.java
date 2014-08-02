package org.mylearnings.pattern;

public abstract class Vehicle {
	
	private GoAlgorithm goAlgo;
	private String name;

	public GoAlgorithm getGoAlgo() {
		return goAlgo;
	}
	public void setGoAlgo(GoAlgorithm goAlgo) {
		this.goAlgo = goAlgo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void go() {
		goAlgo.go();
	}
}

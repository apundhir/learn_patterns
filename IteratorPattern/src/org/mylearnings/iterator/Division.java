package org.mylearnings.iterator;

public class Division {
	// A division can have number of VP's
	private VP[] VPs = new VP[100];
	
	private int number = 0;
	
	// name of the division
	private String name;
	
	public Division(String n){
		name = n;
	}

	public String getName() {
		return name;
	}
	
	public void add(String n){
		VP vp = new VP(	n, name);
		VPs[number++] = vp;
	}
	
	public DivisionIterator iterator(){
		return new DivisionIterator(VPs);
	}
}

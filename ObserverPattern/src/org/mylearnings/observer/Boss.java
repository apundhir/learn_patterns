package org.mylearnings.observer;

public class Boss implements Observer {

	@Override
	public void update(String operation, String record) {
		System.out.println("A opertaion: "+operation+" on "+record+" performed");
	}
}

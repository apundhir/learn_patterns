package org.mylearnings.singleton;

public class Singleton {
	private String name;
		
	public String getName() {
		return name;
	}

	private static volatile Singleton obj;
	
	private Singleton(String s){
		this.name = s;
	}
	
	public static Singleton getInstance(String s) {
		if (obj == null) {
			synchronized (Singleton.class) {
				if (obj == null) {
					obj = new Singleton(s);
				}
			}
		}
		return obj;
	}
}

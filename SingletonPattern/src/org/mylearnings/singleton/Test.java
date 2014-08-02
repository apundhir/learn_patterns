package org.mylearnings.singleton;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonDatabase db;
		
		db = SingletonDatabase.getinstance("product");
		System.out.println("This is the "+ db.getName()+" database");
		
		db = SingletonDatabase.getinstance("employee");
		System.out.println("This is the "+ db.getName()+" database");
		
	}

}

package org.mylearnings.singleton;

public class SingletonDatabase {
	
	private static SingletonDatabase dbConnection;
	private int record;
	private String name;
	
	// Private Constructor
	private SingletonDatabase(String n){
		this.record = 0;
		this.name = n;
	}
	
	public static SingletonDatabase getinstance(String n){
		if(dbConnection == null){
			dbConnection = new SingletonDatabase(n);
		}
		return dbConnection;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

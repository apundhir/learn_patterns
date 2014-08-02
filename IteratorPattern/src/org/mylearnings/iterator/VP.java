package org.mylearnings.iterator;
/*
 * This class represents VP's of an organization. 
 */
public class VP {
	private String name;
	private String department;
	
	public VP(String name, String department){
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void print(){
		System.out.println("Name: "+name+" Department: "+department);
	}
}

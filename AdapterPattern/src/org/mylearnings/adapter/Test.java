package org.mylearnings.adapter;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FrontPerson emp = new FrontPerson();
		emp.setName("Ajay Pundhir");
		System.out.println(emp.getName());
		
		FrontToBackAdapter adapt = new FrontToBackAdapter(emp);
		System.out.println("First Name: "+adapt.getFirstName());
		System.out.println("Last Name: "+adapt.getLastName());

	}

}

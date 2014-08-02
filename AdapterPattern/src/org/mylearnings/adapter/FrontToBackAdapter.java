package org.mylearnings.adapter;

public class FrontToBackAdapter implements Backend{
	private FrontPerson person;
	private String firstName;
	private String lastName;
	
	public FrontToBackAdapter(FrontPerson person){
		this.person = person;
		firstName = this.person.getName().split(" ")[0];
		lastName = this.person.getName().split(" ")[1];
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}

	@Override
	public String getFirstName() {
		
		return firstName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}

	@Override
	public String getLastName() {
		
		return lastName;
	}

}

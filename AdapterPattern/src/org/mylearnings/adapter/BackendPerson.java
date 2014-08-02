package org.mylearnings.adapter;

public class BackendPerson implements Backend{
	private String firstName;
	private String lastName;

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

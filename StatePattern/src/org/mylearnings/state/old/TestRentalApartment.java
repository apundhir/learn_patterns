package org.mylearnings.state.old;

public class TestRentalApartment {

	RentalApartment rental;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestRentalApartment test = new TestRentalApartment();
	}

	public TestRentalApartment(){
		rental = new RentalApartment(5);
		rental.getApplications();
		rental.checkApplication();
		
	}
	
	
}

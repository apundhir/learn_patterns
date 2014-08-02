package org.mylearnings.statewithinobject;

public class TestAutomat {

	Automat automat;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestAutomat test = new TestAutomat();

	}
	
	public TestAutomat() {
		automat = new Automat(5);
		automat.gotApplication();
		automat.checkApplication();
		automat.rentApartment();
	}

}

package org.mylearnings.statewithinobject;

import org.mylearnings.state.old.State;

public class FullyRentedState implements State {
	AutomatInterface automat;

	public FullyRentedState(Automat automat) {
		this.automat = automat;

	}
	
	@Override
	public String gotApplication() {
		
		return "Sorry we are fully rented!!";
	}

	@Override
	public String checkApplication() {
		
		return "Sorry we are fully rented!!";
	}

	@Override
	public String rentApartment() {
		
		return "Sorry we are fully rented!!";
	}

	@Override
	public String dispenseKeys() {
		
		return "Sorry we are fully rented!!";
	}

}

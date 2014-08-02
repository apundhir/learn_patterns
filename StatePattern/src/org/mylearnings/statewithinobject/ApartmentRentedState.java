package org.mylearnings.statewithinobject;

import org.mylearnings.state.old.State;

public class ApartmentRentedState implements State {
	AutomatInterface automat;
	
	public ApartmentRentedState(Automat automat) {
		this.automat = automat;
	}

	@Override
	public String gotApplication() {
		
		return "We are renting apartment to you";
	}

	@Override
	public String checkApplication() {
		
		return "We are renting apartment to you";
	}

	@Override
	public String rentApartment() {
		automat.setCount(automat.getCounts()-1);
		return "We are renting apartment to you";
	}

	@Override
	public String dispenseKeys() {
		if(automat.getCounts() <= 0){
			automat.setState(automat.getFullyRentedState());
		} else{
			automat.setState(automat.getWaitingState());
		}
		return "Here are your keys!!";
	}

}

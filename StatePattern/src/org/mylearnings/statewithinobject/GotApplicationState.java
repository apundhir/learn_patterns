package org.mylearnings.statewithinobject;

import java.util.Random;

import org.mylearnings.state.old.State;

public class GotApplicationState implements State {
	AutomatInterface automat;
	Random random;
	
	public GotApplicationState(Automat automat) {
		this.automat = automat;
		random = new Random(System.currentTimeMillis());
	}

	@Override
	public String gotApplication() {
		
		return "We already got your application";
	}

	@Override
	public String checkApplication() {
		int drow = random.nextInt() % 10;
		
		if(drow > 4 && automat.getCounts() >0){
			automat.setState(automat.getApartmentRentedState());
			return "Congrats!! you are approved";
		} else{
			automat.setState(automat.getWaitingState());
			return "Sorry, you were not approved";
		}
	}

	@Override
	public String rentApartment() {
		
		return "We already got your application";
	}

	@Override
	public String dispenseKeys() {
		
		return "We already got your application";
	}

}

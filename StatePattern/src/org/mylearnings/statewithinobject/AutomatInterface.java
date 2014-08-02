package org.mylearnings.statewithinobject;

import org.mylearnings.state.old.State;

public interface AutomatInterface {
	
	public void gotApplication();
	public void checkApplication();
	public void rentApartment();
	
	public void setState(State s);
	
	// get appropriate state objects
	public State getWaitingState();
	public State getGotApplicationState();
	public State getApartmentRentedState();
	public State getFullyRentedState();
	
	// get the number of available apartments
	public int getCounts();
	// set total number of available apartments
	public void setCount(int n);
	
}

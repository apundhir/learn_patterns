package org.mylearnings.state.old;

import java.util.Random;
/* 
 * This implementation is based on the methods.
 */
public class RentalApartment {
	// Define constants for the different states of the object.
	public static final int FULLY_RENTED = 0;
	public static final int WAITING = 1;
	public static final int GOT_APPLICATIONS = 2;
	public static final int APARTMENT_RENTED = 3;

	// Define the state variable which holds the current state of the object
	int state = WAITING;
	
	Random random;
	int numberOfApartments;
	
	public RentalApartment(int n){
		numberOfApartments = n;
		random = new Random(System.currentTimeMillis());
	}

	// Define all the actions that can change the objects state
	public void getApplications(){
		switch (state) {
		case FULLY_RENTED:
			System.out.println("We are fully rented");
			break;
		case WAITING:
			state = GOT_APPLICATIONS;
			System.out.println("Thanks for the application");
			break;
		case GOT_APPLICATIONS:
			System.out.println("We already got your application");
			break;
		case APARTMENT_RENTED:
			System.out.println("Congrats, you got the apartment on rent");
			break;
		default:
			break;
		}
	}
	
	public void checkApplication(){
		int drow = random.nextInt() % 10;
		
		switch (state) {
		case FULLY_RENTED:
			System.out.println("Sorry, we are fully rented!");
			break;
		case WAITING:
			System.out.println("You have to submit application");
			break;
		case GOT_APPLICATIONS:
			if(drow > 4 && numberOfApartments >0){
				System.out.println("Congrats!! you are approved");
				state = APARTMENT_RENTED;
				rentApartment();
			} else{
				System.out.println("Sorry, you were not approved");
				state = WAITING;
			}
			break;
		case APARTMENT_RENTED:
			System.out.println("Congrats, you got the apartment on rent");
			break;
		default:
			break;
		}
	}
	
	public void rentApartment() {
		switch (state) {
		case FULLY_RENTED:
			System.out.println("Sorry we are fully rented");
			break;
		case WAITING:
			System.out.println("You have to submit application");
			break;
		case GOT_APPLICATIONS:
			System.out.println("Check your application status");
			break;
		case APARTMENT_RENTED:
			System.out.println("Renting you this apartment");
			numberOfApartments--;
			dispenseKeys();
			break;
		default:
			break;
		}
		
	}

	public void dispenseKeys() {
		switch (state) {
		case FULLY_RENTED:
			System.out.println("Sorry we are fully rented");
			break;
		case WAITING:
			System.out.println("You have to submit application");
			break;
		case GOT_APPLICATIONS:
			System.out.println("Check your application status");
			break;
		case APARTMENT_RENTED:
			System.out.println("Here are your keys!!");
			state = WAITING;
			break;
		default:
			break;
		}
	}


}

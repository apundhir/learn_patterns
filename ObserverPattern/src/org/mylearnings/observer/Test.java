package org.mylearnings.observer;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// publisher
		Database database = new Database();

		// subscribers
		Archiver ar = new Archiver();
		Boss bo = new Boss();
		PersonalObserver po = new PersonalObserver();
		
		// register subscribers
		database.registerObserver(ar);
		database.registerObserver(bo);
		database.registerObserver(po);
		
		//Do operations
		database.editRecords("add1", "record1");
				
		database.removeObserver(po);
		database.editRecords("add2", "record2");
	}

}

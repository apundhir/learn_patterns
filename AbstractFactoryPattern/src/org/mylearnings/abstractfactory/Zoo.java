package org.mylearnings.abstractfactory;

public class Zoo {
	public Zoo(AnimalFactory factory){
		Animal animal = factory.createAnimal();
		animal.breathe();
	}

}

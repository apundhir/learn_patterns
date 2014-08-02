package org.mylearnings.abstractfactory;

public class LandFactory implements AnimalFactory{

	@Override
	public Animal createAnimal() {
		return new LandAnimal();
	}

}

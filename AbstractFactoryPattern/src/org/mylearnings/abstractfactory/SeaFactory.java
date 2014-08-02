package org.mylearnings.abstractfactory;

public class SeaFactory implements AnimalFactory{

	@Override
	public Animal createAnimal() {
		return new WaterAnimal();
	}

}

package org.mylearnings.abstractfactory;

public class Test {
	public static void main(String[] args) {
		new Zoo(createAnimalFactory("land"));
	}
	public static AnimalFactory createAnimalFactory(String type){
		if("water".equals(type)){
			return new SeaFactory();
		} else{
			return new LandFactory();
		}
	}
}

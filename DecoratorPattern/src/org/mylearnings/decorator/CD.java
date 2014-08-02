package org.mylearnings.decorator;

public class CD extends ComputerDecorator{
	private Computer computer;
	
	public CD(Computer computer){
		this.computer = computer;
	}

	@Override
	public String description() {
		return (computer.description()+" and a CD");
	}

}

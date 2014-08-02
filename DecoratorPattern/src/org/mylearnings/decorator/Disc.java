package org.mylearnings.decorator;
/**
 * 
 * This class will act as the decorator for Computer.
 *
 */
public class Disc extends ComputerDecorator{
	private Computer computer;
	
	public Disc(Computer computer){
		this.computer = computer;
	}

	@Override
	public String description() {
		return (computer.description() + " and a Disc");
	}
}

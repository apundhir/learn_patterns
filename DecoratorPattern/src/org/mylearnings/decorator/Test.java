package org.mylearnings.decorator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer c = new Computer();
		c = new Disc(c);
		c = new Monitor(c);
		c = new CD(c);
		System.out.println(c.description());
	}

}

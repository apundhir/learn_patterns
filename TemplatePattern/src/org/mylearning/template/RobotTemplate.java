package org.mylearning.template;
/*
 * Template class with template method and default behavior
 */
public abstract class RobotTemplate {
	// The sequence or algo is same for all the implementors
	public final void go(){
		start();
		getParts();
		assemble();
		test();
		stop();
	}

	public void test() {
		System.out.println("testing.......");
		
	}

	public void assemble() {
		System.out.println("Assembling...");
		
	}

	public void getParts() {
		System.out.println("Getting parts...");
		
	}

	public void start() {
		System.out.println("Starting....");
		
	}
	
	public void stop() {
		System.out.println("Stopping");
		
	}
}

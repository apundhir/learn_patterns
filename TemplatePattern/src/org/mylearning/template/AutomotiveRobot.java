package org.mylearning.template;
/*
 * Override specific behavior method is overridden
 */
public class AutomotiveRobot extends RobotTemplate{
	
	@Override
	public void getParts(){
		System.out.println("Getting Auto parts");
	}
	
	@Override
	public void assemble() {
		System.out.println("Assembling Auto parts");
	}
	
	@Override
	public void test() {
		System.out.println("Testing Auto robot...");
	}
}

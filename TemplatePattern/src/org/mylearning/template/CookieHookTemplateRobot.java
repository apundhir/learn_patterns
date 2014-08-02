package org.mylearning.template;


public class CookieHookTemplateRobot extends RobotHookTemplate{
	@Override
	public void getParts(){
		System.out.println("Getting floor and oil");
	}
	
	@Override
	public void assemble() {
		System.out.println("Mixing floor and oil");
	}
	
	@Override
	public void test() {
		System.out.println("Testing Cookie robot...");
	}
	
	@Override
	public boolean testOK() {
		return false;
	}
}

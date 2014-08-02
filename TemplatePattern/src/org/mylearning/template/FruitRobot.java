package org.mylearning.template;

public class FruitRobot extends RobotTemplate{
	@Override
	public void getParts(){
		System.out.println("Getting Fruits...");
	}
	
	@Override
	public void assemble() {
		System.out.println("Cutting Fruits to shapes...");
	}
	
	@Override
	public void test() {
		System.out.println("Cokking Fruit Robo ...");
	}
}

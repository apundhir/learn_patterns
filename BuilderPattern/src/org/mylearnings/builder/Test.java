package org.mylearnings.builder;

public class Test {

	public static void main(String[] args) {
		RobotBuilder builder;
		RobotBuildable robot;
		
		builder = new CookieRobotBuilder();
		builder.addStart();
		builder.addTest();
		builder.addGetParts();
		builder.addStop();
		
		robot = builder.getRobot();
		robot.go();
	}

}

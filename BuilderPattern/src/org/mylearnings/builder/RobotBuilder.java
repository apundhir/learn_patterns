package org.mylearnings.builder;

public interface RobotBuilder {
	public void addStart();
	public void addGetParts();
	public void assAssemble();
	public void addTest();
	public void addStop();
	public RobotBuildable getRobot();
}

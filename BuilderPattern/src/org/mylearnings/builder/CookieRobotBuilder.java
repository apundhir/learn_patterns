package org.mylearnings.builder;

import java.util.ArrayList;

public class CookieRobotBuilder implements RobotBuilder{
	
	CookieRobotBuildable robot;
	// store actions and sequence of actions
	ArrayList<Integer> actions;
	
	public CookieRobotBuilder() {
		robot = new CookieRobotBuildable();
		actions = new ArrayList<Integer>();
	}
	
	@Override
	public void addStart() {
		actions.add(new Integer(1));
		
	}

	@Override
	public void addGetParts() {
		actions.add(new Integer(2));
		
	}

	@Override
	public void assAssemble() {
		actions.add(new Integer(3));
		
	}

	@Override
	public void addTest() {
		actions.add(new Integer(4));
		
	}

	@Override
	public void addStop() {
		actions.add(new Integer(5));
		
	}

	@Override
	public RobotBuildable getRobot() {
		robot.loadActions(actions);
		return robot;
	}
	
}

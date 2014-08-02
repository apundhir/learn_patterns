package org.mylearnings.builder;

import java.util.ArrayList;
import java.util.Iterator;

public class CookieRobotBuildable implements RobotBuildable{

	ArrayList<Integer> actions;
	
	public CookieRobotBuildable() {
	}
	
	public void loadActions(ArrayList<Integer> a){
		actions = a;
	}
	
	@Override
	public void go() {
		Iterator itr = actions.iterator();
		while(itr.hasNext()){
			switch ((Integer)itr.next()) {
			case 1:
				start();
				break;
			case 2:
				getParts();
				break;
			case 3:
				assemble();
				break;
			case 4:
				test();
				break;
			case 5:
				stop();
				break;
			default:
				break;
			}
		}
		
	}

	private void stop() {
		System.out.println("Stopping.....");
		
	}

	private void test() {
		System.out.println("Testing...");
		
	}

	private void assemble() {
		System.out.println("Assembling...");
		
	}

	private void getParts() {
		System.out.println("Getting parts....");
		
	}

	private void start() {
		System.out.println("Starting...");
		
	}

}

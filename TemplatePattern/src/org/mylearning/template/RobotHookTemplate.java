package org.mylearning.template;
/*
 * 
 */
public abstract class RobotHookTemplate {
	public final void go(){
		start();
		getParts();
		assemble();
		// This is the hook, check the inheriting class to perform some action
		if(testOK()){
			test();
		}
		stop();
	}
	
	public boolean testOK() {
		
		return false;
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

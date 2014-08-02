package org.mylearnings.command;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		t.testCommands();
	}
	public void testCommands(){
		Invoker invoker = new Invoker();
		
		// Create Receivers
		AsiaServer asiaServer = new AsiaServer();
		USServer usServer = new USServer();
		EuroServer euroServer = new EuroServer();
		
		// create the commands
		ShutDownCommand shutDownAsia = new ShutDownCommand(asiaServer);
		RebootCommand rebootUs = new RebootCommand(usServer);
		
		// Set and execute command
		invoker.setCommand(shutDownAsia);
		invoker.run();
		
		invoker.setCommand(rebootUs);
		invoker.run();
		
	}
}

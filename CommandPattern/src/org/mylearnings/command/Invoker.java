package org.mylearnings.command;

public class Invoker {
	Command command;
	
	public Invoker() {
	}
	
	public void setCommand(Command c){
		this.command = c;
	}
	
	public void run(){
		command.execute();
	}
}

package org.mylearnings.command;

public class AsiaServer implements Receiver{
	
	public AsiaServer(){
		
	}

	@Override
	public void connect() {
		System.out.println("You are connected to Asia Server");
		
	}

	@Override
	public void diagnose() {
		System.out.println("Diagnosing Asia Server");
		
	}

	@Override
	public void reboot() {
		System.out.println("Rebooting Asia Server");
		
	}

	@Override
	public void shutdown() {
		System.out.println("Shutdown Asia Server");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting Asia Server");
		
	}

}

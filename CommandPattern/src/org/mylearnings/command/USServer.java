package org.mylearnings.command;

public class USServer implements Receiver{
	
	public USServer(){
		
	}

	@Override
	public void connect() {
		System.out.println("You are connected to US Server");
		
	}

	@Override
	public void diagnose() {
		System.out.println("Diagnosing US Server");
		
	}

	@Override
	public void reboot() {
		System.out.println("Rebooting US Server");
		
	}

	@Override
	public void shutdown() {
		System.out.println("Shutdown US Server");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting US Server");
		
	}
}

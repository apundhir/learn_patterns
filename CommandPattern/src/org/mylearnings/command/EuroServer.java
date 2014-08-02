package org.mylearnings.command;

public class EuroServer implements Receiver{

	public EuroServer(){
		
	}

	@Override
	public void connect() {
		System.out.println("You are connected to Europe Server");
		
	}

	@Override
	public void diagnose() {
		System.out.println("Diagnosing Europe Server");
		
	}

	@Override
	public void reboot() {
		System.out.println("Rebooting Europe Server");
		
	}

	@Override
	public void shutdown() {
		System.out.println("Shutdown Europe Server");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting Europe Server");
		
	}

}

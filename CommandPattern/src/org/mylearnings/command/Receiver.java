package org.mylearnings.command;

public interface Receiver {
	public void connect();
	public void diagnose();
	public void reboot();
	public void shutdown();
	public void disconnect();
}

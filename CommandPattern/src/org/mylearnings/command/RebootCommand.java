package org.mylearnings.command;

public class RebootCommand implements Command{
	Receiver receiver;
	
	public RebootCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		receiver.connect();
		receiver.reboot();
		receiver.disconnect();
		System.out.println();
	}
}

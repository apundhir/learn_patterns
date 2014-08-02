package org.mylearnings.command;

public class RunDiagnosticCommand implements Command{
	Receiver receiver;
	public RunDiagnosticCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		receiver.connect();
		receiver.diagnose();
		receiver.disconnect();
		System.out.println();
	}
}

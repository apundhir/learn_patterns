package org.mylearnings.mediator;

import java.util.Scanner;

public class Welcome {
	Mediator mediator;
	String response = "n";
	
	public Welcome(Mediator m) {
		mediator = m;
	}
	
	public void go(){
		System.out.println("Do you wants to shop? [y/n]");
		Scanner in = new Scanner(System.in);
		char ip = Character.in.next();
	}

}

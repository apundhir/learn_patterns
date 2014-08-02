package org.mylearning.template;

public class Test {
	public static void main(String[] args) {
		AutomotiveRobot autoRobo = new AutomotiveRobot();
		FruitRobot fruitRobo = new FruitRobot();
		
		autoRobo.go();
		fruitRobo.go();
		
		CookieHookTemplateRobot cokie = new CookieHookTemplateRobot();
		cokie.go();
		
	}
}

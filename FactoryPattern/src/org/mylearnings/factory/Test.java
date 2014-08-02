package org.mylearnings.factory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConnectionFactory factory;
		factory = new SecureConnectionFactory();
		
		Connection connection = factory.createConnection("MySql");
		System.out.println("You have connected to "+connection.getDescription());
	}
}

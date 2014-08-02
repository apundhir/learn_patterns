package org.mylearnings.factory;

public class MySqlConnectionClass extends Connection{
	public MySqlConnectionClass() {

		System.out.println("This is MySql Db Connection");
	}
	
	@Override
	public String getDescription() {
		return "MySql Connection";
	}
}

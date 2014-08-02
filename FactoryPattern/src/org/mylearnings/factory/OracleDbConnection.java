package org.mylearnings.factory;

public class OracleDbConnection extends Connection{
	public OracleDbConnection() {
		System.out.println("This is Oracle Db Connection");
	}
	
	@Override
	public String getDescription() {
		return "Oracle Connection";
	}
}

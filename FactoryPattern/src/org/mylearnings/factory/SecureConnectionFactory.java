package org.mylearnings.factory;

public class SecureConnectionFactory extends ConnectionFactory{

	@Override
	protected Connection createConnection(String type) {
		if(type.equals("Oracle")){
			return new OracleDbConnection();
		} else 
			return new MySqlConnectionClass();
	}
}

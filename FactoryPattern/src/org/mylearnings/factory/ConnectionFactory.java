package org.mylearnings.factory;

public abstract class ConnectionFactory {
	
	public ConnectionFactory(){
		
	}
	//let the sub type decide which type of connection is to be created
	protected abstract Connection createConnection(String type);
	
}	

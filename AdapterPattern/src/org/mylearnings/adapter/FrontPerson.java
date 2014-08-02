package org.mylearnings.adapter;

public class FrontPerson implements Frontend{
	private String name;

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String getName() {
		
		return name;
	}

}

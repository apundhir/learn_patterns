package org.mylearnings.facade;

public class DifficultProduct {
	// Set name of the component char by char
	char nameChars[] = new char[5];
	
	public DifficultProduct() {
	}
	
	public void setFirstNameChar(char c){
		nameChars[0] = c;
	}
	
	public void setSecondNameChar(char c){
		nameChars[1] = c;
	}
	
	public void setThirdNameChar(char c){
		nameChars[2] = c;
	}
	
	public void setFourthNameChar(char c){
		nameChars[3] = c;
	}
	
	public void setFifthNameChar(char c){
		nameChars[4] = c;
	}
	
	public String getName(){
		return new String(nameChars);
	}
}
